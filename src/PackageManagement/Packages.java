/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PackageManagement;

import InitialData.Client;
import InitialData.PackageDelivery;
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
    
    public ArrayList findPackagesWithHighShipmentVolumeInRegions(){
        ArrayList<PackageDelivery>resultPackages;
        resultPackages= new ArrayList();
        
        for (int i = 0; i < SG.managementsOfRegionsAndPrices.getLength() ; i++) {
        
        }
        for (int i = 0; i < packages.size(); i++) {
           PackageDelivery packageDelivery = packages.get(i);
           if(packageDelivery.getCode().equals(){
               resultPackages.add(packageDelivery);
           }
        }
        return resultPackages;
        
    }
    
    
}
