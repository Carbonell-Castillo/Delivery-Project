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
    private Integer paymentMethod, numberOfPackages;
    private String code, RegionOrigin, origin, destiny, size,
                    dateSent, serviceType, status; 
    
    public PackageDelivery(){
        client=null;
        RegionOrigin="";
        code="";
        origin="";
        destiny="";
        paymentMethod=0;
        size="";
        numberOfPackages=0;
        dateSent="";
        serviceType="";
        status="";
    }
    
    public PackageDelivery(Client client, String RegionOrigin, String code, String origin, String destiny, Integer paymentMethod, String size, Integer numberOfPackages, String dateSent, String serviceType, String status) {
        this.client= client;
        this.RegionOrigin= RegionOrigin;
        this.code = code;
        this.origin = origin;
        this.destiny = destiny;
        this.paymentMethod = paymentMethod;
        this.size = size;
        this.numberOfPackages = numberOfPackages;
        this.dateSent = dateSent;
        this.serviceType = serviceType;
        this.status = status;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
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

    public Integer getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(Integer paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public Integer getNumberOfPackages() {
        return numberOfPackages;
    }

    public void setNumberOfPackages(Integer numberOfPackages) {
        this.numberOfPackages = numberOfPackages;
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

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public String getRegionOrigin() {
        return RegionOrigin;
    }

    public void setRegionOrigin(String RegionOrigin) {
        this.RegionOrigin = RegionOrigin;
    }
    
    
    
    
}
