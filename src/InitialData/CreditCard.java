/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package InitialData;

/**
 *
 * @author bruce
 */
public class CreditCard {
    private String nameCreditCard, creditCard, expirationDate, CVV;

    public CreditCard(){
        nameCreditCard="";
        creditCard="";
        expirationDate="";
        CVV="";
    }
    
    
    public CreditCard(String nameCreditCard, String creditCard, String expirationDate, String CVV) {
        this.nameCreditCard = nameCreditCard;
        this.creditCard = creditCard;
        this.expirationDate = expirationDate;
        this.CVV = CVV;
    }

    public String getNameCreditCard() {
        return nameCreditCard;
    }

    public void setNameCreditCard(String nameCreditCard) {
        this.nameCreditCard = nameCreditCard;
    }

    public String getCreditCard() {
        return creditCard;
    }

    public void setCreditCard(String creditCard) {
        this.creditCard = creditCard;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    public String getCVV() {
        return CVV;
    }

    public void setCVV(String CVV) {
        this.CVV = CVV;
    }
    
    
}
