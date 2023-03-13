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
           if(packageDelivery.getClient().equals(client)){
               resultPackages.add(packageDelivery);
           }
        }
        return resultPackages;
    }
    
    public ArrayList findPackagesWithHighShipmentVolumeInRegions(String region) {
        ArrayList<PackageDelivery> resultPackages;
        resultPackages = new ArrayList();

        Integer quantityPackageFound[] = new Integer[packages.size()];

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
                    if (j > 0) {
                        if (!(resultPackages.get(j - 1).equals(resultPackages.get(j)))) {
                            resultPackages.add(packageDelivery);
                        }
                    }
                    if (quantityPackageFound[i] != null) {
                        quantityPackageFound[i] = quantityPackageFound[i] + 1;
                    } else {
                        quantityPackageFound[i] = 1;
                    }
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
            if(packageDelivery.getOrigin().equals(origin)){
                resultPackages.add(packageDelivery);
            }
        }
        return resultPackages;
        
    }
    
    public ArrayList getPackagesByCode(String code){
    ArrayList<PackageDelivery> resultPackages;
        resultPackages = new ArrayList();
        for (int i = 0; i < packages.size(); i++) {
            PackageDelivery packageDelivery = packages.get(i);
            if(packageDelivery.getCode().equals(code)){
                resultPackages.add(packageDelivery);
            }
        }
        return resultPackages;
    
    }
        
    public ArrayList getUsersWithMorePackages(){
        ArrayList<PackageDelivery> resultPackages;
        resultPackages = new ArrayList();
        
        Integer quantityPackageFound[] = new Integer[packages.size()];

        for (int i = 0; i < SG.user.getCustomers().size(); i++) {
            Client client = SG.user.getClientRecord(i);

            for (int j = 0; j < packages.size(); j++) {
                PackageDelivery packageDelivery = packages.get(j);
                if (packageDelivery.getClient().equals(client)) {
                    if (j > 0) {
                        if (!(resultPackages.get(j - 1).equals(resultPackages.get(j)))) {
                            resultPackages.add(packageDelivery);
                        }
                    }
                    if (quantityPackageFound[i] != null) {
                        quantityPackageFound[i] = quantityPackageFound[i] + 1;
                    } else {
                        quantityPackageFound[i] = 1;
                    }
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
    
}
