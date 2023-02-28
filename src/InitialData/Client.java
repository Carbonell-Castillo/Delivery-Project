/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package InitialData;

import InitialData.User;

/**
 *
 * @author bruce
 */
public class Client extends InitialData.Person{
    private User user;
    private String nameCreditCard, creditCard, expirationDate, CVV;
    
    public Client(){
        nameCreditCard="";
        creditCard="";
        expirationDate="";
        CVV="";
    }
    public Client(User user, String nameCreditCard, String creditCard, String expirationDate, String CVV) {
        this.user = user;
        this.nameCreditCard = nameCreditCard;
        this.creditCard = creditCard;
        this.expirationDate = expirationDate;
        this.CVV = CVV;
    }

    public Client(User user, String nameCreditCard, String creditCard, String expirationDate, String CVV, String id, String name, String lastName, String dateOfBirth, String gender, String nationality, String phoneNumber) {
        super(id, name, lastName, dateOfBirth, gender, nationality, phoneNumber);
        this.user = user;
        this.nameCreditCard = nameCreditCard;
        this.creditCard = creditCard;
        this.expirationDate = expirationDate;
        this.CVV = CVV;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
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