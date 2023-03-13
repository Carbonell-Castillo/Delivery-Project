/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PackageManagement;

import InitialData.Municipality;
import java.util.ArrayList;

/**
 *
 * @author bruce
 */
public class Municipalities {
    private ArrayList <Municipality> municipalities;
    
     public Municipalities(){
        this.municipalities= new ArrayList();
    }
    
    public void addMunicipality(Municipality municipality){
        municipalities.add(municipality);
    }
    
    public Municipality getMunicipalityRecord(int pos){
        return municipalities.get(pos);
    }
    
    public ArrayList searchMunicipalityCode(String code){
        ArrayList<Municipality>resultMunicipalities;
        resultMunicipalities= new ArrayList();
        
        for (int i = 0; i < municipalities.size(); i++) {
           Municipality municipality = municipalities.get(i);
           if(municipality.getCode().equals(code)){
               resultMunicipalities.add(municipality);
           }
        }
        
        return resultMunicipalities;
    }
    
    
}
