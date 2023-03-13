/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PackageManagement;

import InitialData.RegionAndPriceManagement;
import java.util.ArrayList;

/**
 *
 * @author bruce
 */
public class ManagementsOfRegionsAndPrices {
        private ArrayList <RegionAndPriceManagement> regions;
    
   public ManagementsOfRegionsAndPrices(){
        this.regions= new ArrayList();
    }
    
    public void addRegion(RegionAndPriceManagement region){
        regions.add(region);
    }
    
    public Integer getLength(){
        return regions.size();
    }
    
    public RegionAndPriceManagement getRegionRecord(int pos){
        return regions.get(pos);
    }
    
    public ArrayList searchRegionCode(String code){
        ArrayList<RegionAndPriceManagement>resultRegions;
        resultRegions= new ArrayList();
        
        for (int i = 0; i < regions.size(); i++) {
           RegionAndPriceManagement region = regions.get(i);
           if(region.getCode().equals(code)){
               resultRegions.add(region);
           }
        }
        
        return resultRegions;
    }
    
    
}
