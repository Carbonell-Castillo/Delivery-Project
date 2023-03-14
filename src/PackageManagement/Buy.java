/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PackageManagement;

import InitialData.Client;

/**
 *
 * @author bruce
 */
public class Buy {
   private Client client;
    private int typeOfPayment;

    
    public Buy(Client client, int typeOfPayment) {
        this.client = client;
        this.typeOfPayment = typeOfPayment;
    }
   
    public Double getQuote(String origin, String destiny, Integer numberOfPackage, String weight ){
        double total=0;
        
        return total;
    }
    
    public Double getPackageQuote(Double price, Double weight, Integer numberOfPackage){
        double total=0;
        total= price*weight*numberOfPackage;
        return total;
    }
    
   
}
