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
public class PackageDelivery {
    private Client client;
    private CreditCard creditCard;
    private BillingData billingData;
    
    
    private Integer paymentMethod, numberOfPackages;
    private String code, RegionOrigin, origin, destiny, recipientsName, size,
                    dateSent, serviceType, status; 
    
    public PackageDelivery(){
        client=null;
        creditCard=null;
        billingData=null;
        RegionOrigin="";
        code="";
        origin="";
        destiny="";
        recipientsName="";
        paymentMethod=0;
        size="";
        numberOfPackages=0;
        dateSent="";
        serviceType="";
        status="";
    }

    public PackageDelivery(Client client, CreditCard creditCard, BillingData billingData, Integer paymentMethod, Integer numberOfPackages, String code, String RegionOrigin, String origin, String destiny, String recipientsName, String size, String dateSent, String serviceType, String status) {
        this.client = client;
        this.creditCard = creditCard;
        this.billingData = billingData;
        this.paymentMethod = paymentMethod;
        this.numberOfPackages = numberOfPackages;
        this.code = code;
        this.RegionOrigin = RegionOrigin;
        this.origin = origin;
        this.destiny = destiny;
        this.recipientsName = recipientsName;
        this.size = size;
        this.dateSent = dateSent;
        this.serviceType = serviceType;
        this.status = status;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public CreditCard getCreditCard() {
        return creditCard;
    }

    public void setCreditCard(CreditCard creditCard) {
        this.creditCard = creditCard;
    }

    public BillingData getBillingData() {
        return billingData;
    }

    public void setBillingData(BillingData billingData) {
        this.billingData = billingData;
    }

    public Integer getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(Integer paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public Integer getNumberOfPackages() {
        return numberOfPackages;
    }

    public void setNumberOfPackages(Integer numberOfPackages) {
        this.numberOfPackages = numberOfPackages;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getRegionOrigin() {
        return RegionOrigin;
    }

    public void setRegionOrigin(String RegionOrigin) {
        this.RegionOrigin = RegionOrigin;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDestiny() {
        return destiny;
    }

    public void setDestiny(String destiny) {
        this.destiny = destiny;
    }

    public String getRecipientsName() {
        return recipientsName;
    }

    public void setRecipientsName(String recipientsName) {
        this.recipientsName = recipientsName;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getDateSent() {
        return dateSent;
    }

    public void setDateSent(String dateSent) {
        this.dateSent = dateSent;
    }

    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
   
    
    
    
}
