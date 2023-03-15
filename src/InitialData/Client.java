/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package InitialData;

import InitialData.User;
import java.util.ArrayList;

/**
 *
 * @author bruce
 */
public class Client extends InitialData.Person{
    private User user;
    
    
    private ArrayList <CreditCard> creditCards;
    private ArrayList <BillingData> billingDatas;
   
    public Client(){
        this.creditCards = new ArrayList();
        this.billingDatas = new ArrayList();
    }
    
    public void addCreditCard(CreditCard creditCard){
        creditCards.add(creditCard);
    }
    
    public CreditCard getCreditCardRecord(int pos){
        return creditCards.get(pos);
    }
   
    public void addBillingData(BillingData billingData){
        billingDatas.add(billingData);
    }
    
    public boolean searchNumberCreditCard(String number){
        Boolean validation = false;
        for (int i = 0; i < creditCards.size(); i++) {
            CreditCard creditCard = creditCards.get(i);
            
            if (creditCard.getCreditCard().equals(number)) {
                validation=true;
            }
        }
       
        return validation;
    }
    
    
    
    public BillingData getBillingData(int pos){
        return billingDatas.get(pos);
    }
    
    
    public CreditCard getCreditCardByNumber(String number){
        CreditCard creditCardFound = new CreditCard();
        
        
        for (int i = 0; i < creditCards.size(); i++) {
            CreditCard creditCardClient = creditCards.get(i);
            
            if(creditCardClient.getCreditCard().equals(number)){
                creditCardFound= creditCardClient;
            }
        }
        
        return creditCardFound;
    }
    
    public ArrayList getAllCreditCards(){
        return creditCards;
    }
    public ArrayList getAllBillingData(){
        return billingDatas;
    }

    public Client(User user, ArrayList<CreditCard> creditCards, ArrayList<BillingData> billingDatas) {
        this.user = user;
        this.creditCards = creditCards;
        this.billingDatas = billingDatas;
    }

    public Client(User user, ArrayList<CreditCard> creditCards, ArrayList<BillingData> billingDatas, String id, String name, String lastName, String dateOfBirth, String gender, String nationality, String phoneNumber) {
        super(id, name, lastName, dateOfBirth, gender, nationality, phoneNumber);
        this.user = user;
        this.creditCards = creditCards;
        this.billingDatas = billingDatas;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public ArrayList<CreditCard> getCreditCards() {
        return creditCards;
    }

    public void setCreditCards(ArrayList<CreditCard> creditCards) {
        this.creditCards = creditCards;
    }

    public ArrayList<BillingData> getBillingDatas() {
        return billingDatas;
    }

    public void setBillingDatas(ArrayList<BillingData> billingDatas) {
        this.billingDatas = billingDatas;
    }
    



    
    
    
}
