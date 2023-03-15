/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PackageManagement;

import InitialData.Kiosk;
import java.util.ArrayList;

/**
 *
 * @author bruce
 */
public class Kiosks {
    private ArrayList <Kiosk> kiosks;
    
     public Kiosks(){
        this.kiosks= new ArrayList();
    }
    
    public void addKiosk(Kiosk kiosk){
        kiosks.add(kiosk);
    }
    
    public Kiosk getKioskRecord(int pos){
        return kiosks.get(pos);
    }
    
    public ArrayList searchKioskCode(int code){
        ArrayList<Kiosk>resultKiosks;
        resultKiosks= new ArrayList();
        
        for (int i = 0; i < kiosks.size(); i++) {
           Kiosk kiosk = kiosks.get(i);
           if(kiosk.getCode().equals(code)){
               resultKiosks.add(kiosk);
           }
        }
        
        return resultKiosks;
    }
    
        
    public Integer getLength(){
        return kiosks.size();
    }
}
