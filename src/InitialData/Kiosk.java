/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package InitialData;

/**
 *
 * @author bruce
 */
public class Kiosk extends DataManagement{
    private String regionCode;
    
    public Kiosk(){
        regionCode="";
    }
    public Kiosk(String regionCode) {
        this.regionCode = regionCode;
    }

    public Kiosk(String regionCode, String code, String name) {
        super(code, name);
        this.regionCode = regionCode;
    }

    public String getRegionCode() {
        return regionCode;
    }

    public void setRegionCode(String regionCode) {
        this.regionCode = regionCode;
    }
    
    
}
