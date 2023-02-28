/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package InitialData;

/**
 *
 * @author bruce
 */
public class RegionAndPriceManagement extends DataManagement{
    private double standardPrice, specialPrice;

    public RegionAndPriceManagement(){
        standardPrice=0;
        specialPrice=0;
    }
    
    public RegionAndPriceManagement(double standardPrice, double specialPrice) {
        this.standardPrice = standardPrice;
        this.specialPrice = specialPrice;
    }

    public RegionAndPriceManagement(double standardPrice, double specialPrice, String code, String name) {
        super(code, name);
        this.standardPrice = standardPrice;
        this.specialPrice = specialPrice;
    }

    public double getStandardPrice() {
        return standardPrice;
    }

    public void setStandardPrice(double standardPrice) {
        this.standardPrice = standardPrice;
    }

    public double getSpecialPrice() {
        return specialPrice;
    }

    public void setSpecialPrice(double specialPrice) {
        this.specialPrice = specialPrice;
    }
    
    
}
