/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package InitialData;

/**
 *
 * @author bruce
 */
public class Department extends DataManagement{
    private String regionName;
    
    public Department(){
        regionName="";
    }
    public Department(String regionName) {
        this.regionName = regionName;
    }

    public Department(String regionName, String code, String name) {
        super(code, name);
        this.regionName = regionName;
    }

    public String getRegionName() {
        return regionName;
    }

    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }
    
    
    
}
