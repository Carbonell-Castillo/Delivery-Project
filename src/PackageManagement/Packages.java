/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PackageManagement;

import InitialData.Client;
import InitialData.PackageDelivery;
import InitialData.RegionAndPriceManagement;
import InitialData.SG;
import java.util.ArrayList;

/**
 *
 * @author bruce
 */
public class Packages {
        private ArrayList <PackageDelivery> packages;
    
     public Packages(){
        this.packages= new ArrayList();
    }
    
    public void addPackage(PackageDelivery packageDelivery){
        packages.add(packageDelivery);
    }
    
    public PackageDelivery getPackageRecord(int pos){
        return packages.get(pos);
    }
    
    public ArrayList searchPackageGeneralCode(String code){
        ArrayList<PackageDelivery>resultPackages;
        resultPackages= new ArrayList();
        
        for (int i = 0; i < packages.size(); i++) {
           PackageDelivery packageDelivery = packages.get(i);
           if(packageDelivery.getCode().equals(code)){
               resultPackages.add(packageDelivery);
           }
        }
        return resultPackages;
    }
    
    public ArrayList searchPackageClientCode(Client client, String code){
        ArrayList<PackageDelivery>resultPackages;
        resultPackages= new ArrayList();
        
        for (int i = 0; i < packages.size(); i++) {
           PackageDelivery packageDelivery = packages.get(i);
           if(packageDelivery.getClient().equals(client)){
           if(packageDelivery.getCode().equals(code)){
               resultPackages.add(packageDelivery);
           }
           }
        }
        return resultPackages;
    }
    
    public ArrayList allPackageClient(Client client){
        ArrayList<PackageDelivery>resultPackages;
        resultPackages= new ArrayList();
        
        for (int i = 0; i < packages.size(); i++) {
           PackageDelivery packageDelivery = packages.get(i);
           if(packageDelivery.getClient().getUser().getId().equals(client.getUser().getId())){
               
               resultPackages.add(packageDelivery);
               
           }
        }
        
        for (int i = 0; i < resultPackages.size(); i++) {
            System.out.println("nn: "+resultPackages.get(i).getCode()+" "+resultPackages.get(i).getClient().getUser().getName());
        }
        return resultPackages;
    }
    
    public ArrayList findPackagesWithHighShipmentVolumeInRegions(String region) {
        ArrayList<PackageDelivery> resultPackages;
        resultPackages = new ArrayList();

        Integer quantityPackageFound[] = new Integer[packages.size()];
    int i2=0;
        for (int i = 0; i < SG.managementsOfRegionsAndPrices.getLength(); i++) {
            RegionAndPriceManagement managementsOfRegionsAndPrices = SG.managementsOfRegionsAndPrices.getRegionRecord(i);
            String regionCode;
            
            if(region.isBlank()){
             regionCode= managementsOfRegionsAndPrices.getCode();
            }else{
                regionCode= region;
            }
            
            
            for (int j = 0; j < packages.size(); j++) {
                PackageDelivery packageDelivery = packages.get(j);
                if (packageDelivery.getRegionOrigin().equals(regionCode)) {
                    
                    if (i2 > 0) {
                        if (!(resultPackages.get(j - 1).equals(resultPackages.get(j)))) {
                            resultPackages.add(packageDelivery);
                        }
                    }
                    if (quantityPackageFound[i] != null) {
                        quantityPackageFound[i] = quantityPackageFound[i] + 1;
                    } else {
                        quantityPackageFound[i] = 1;
                    }
                    i2=i2+1;
                }
            }
        }

        for (int i = 0; i < quantityPackageFound.length - 1; i++) {
            for (int j = 0; j < quantityPackageFound.length - i - 1; j++) {
                if (quantityPackageFound[j] < quantityPackageFound[j + 1]) {
                    int temp = quantityPackageFound[j];
                    quantityPackageFound[j] = quantityPackageFound[j + 1];
                    quantityPackageFound[j + 1] = temp;

                    PackageDelivery tempPackage = resultPackages.get(j);
                    resultPackages.set(j, resultPackages.get(j + 1));
                    resultPackages.set(j + 1, tempPackage);
                }
            }
        }
        return resultPackages;

    }
    
    public double getTotalIncome(){
        double TotalIncome=0;
        
        for (int i = 0; i < packages.size(); i++) {
            PackageDelivery packageDelivery= packages.get(i);
            Buy buy = new Buy(packageDelivery.getClient(), packageDelivery.getPaymentMethod());
            TotalIncome= TotalIncome+buy.getQuote(packageDelivery.getOrigin(), packageDelivery.getDestiny(), packageDelivery.getNumberOfPackages(), packageDelivery.getSize());
        }
        return TotalIncome;
        
    }
    
    public ArrayList getPackageByOrigin(String origin){
        ArrayList<PackageDelivery> resultPackages;
        resultPackages = new ArrayList();
        for (int i = 0; i < packages.size(); i++) {
            PackageDelivery packageDelivery = packages.get(i);
            if(packageDelivery.getOrigin().contains(origin)){
                resultPackages.add(packageDelivery);
            }
        }
        return resultPackages;
        
    }
    
    public ArrayList getPackageByDescription(String descríption){
        ArrayList<PackageDelivery> resultPackages;
        resultPackages = new ArrayList();
        for (int i = 0; i < packages.size(); i++) {
            PackageDelivery packageDelivery = packages.get(i);
            if(packageDelivery.getDescription().contains(descríption)){
                resultPackages.add(packageDelivery);
            }
        }
        return resultPackages;
        
    }
    
    public PackageDelivery getPackagesByCode(String code){
    PackageDelivery resultPackage = new PackageDelivery();
        
        for (int i = 0; i < packages.size(); i++) {
            PackageDelivery packageDelivery = packages.get(i);
            if(packageDelivery.getCode().equals(code)){
                resultPackage= packageDelivery;
            }
        }
        return resultPackage;
    
    }
        
    public ArrayList getUsersWithMorePackages(){
        ArrayList<PackageDelivery> resultPackages;
        resultPackages = new ArrayList();
        
        SG.quantityPackageFound = new Integer[packages.size()];
        int i2 =0;
        for (int i = 0; i < SG.user.getCustomers().size(); i++) {
            Client client = SG.user.getClientRecord(i);

            for (int j = 0; j < packages.size(); j++) {
                PackageDelivery packageDelivery = packages.get(j);
                if (packageDelivery.getClient().equals(client)) {
                    if (i2 > 0) {
                        if (!(resultPackages.get(j - 1).equals(resultPackages.get(j)))) {
                            resultPackages.add(packageDelivery);
                        }
                    }
                    if ( SG.quantityPackageFound[i] != null) {
                         SG.quantityPackageFound[i] =  SG.quantityPackageFound[i] + 1;
                    } else {
                         SG.quantityPackageFound[i] = 1;
                    }
                    i2=i2+1;
                }
            }
        }

        for (int i = 0; i <  SG.quantityPackageFound.length - 1; i++) {
            for (int j = 0; j <  SG.quantityPackageFound.length - i - 1; j++) {
                if ( SG.quantityPackageFound[j] <  SG.quantityPackageFound[j + 1]) {
                    int temp =  SG.quantityPackageFound[j];
                     SG.quantityPackageFound[j] =  SG.quantityPackageFound[j + 1];
                     SG.quantityPackageFound[j + 1] = temp;

                    PackageDelivery tempPackage = resultPackages.get(j);
                    resultPackages.set(j, resultPackages.get(j + 1));
                    resultPackages.set(j + 1, tempPackage);
                }
            }
        }
        
        
        return resultPackages;
    }
    
    public Boolean validateCodePackage(String code){
        Boolean validation = false;
        for (int i = 0; i < packages.size(); i++) {
            PackageDelivery packageDelivery = packages.get(i);
            if(packageDelivery.getCode().equals(code)){
            validation=true;
            }
        }
        return validation;
    }
        
    public Integer getLength(){
        return packages.size();
    }
}
