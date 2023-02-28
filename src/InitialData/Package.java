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
public class Package {
    private String code, origin, destiny, paymentMethod, size,
                   numberOfPackages, dateSent, serviceType, status;
    
    public Package(){
        code="";
        origin="";
        destiny="";
        paymentMethod="";
        size="";
        numberOfPackages="";
        dateSent="";
        serviceType="";
        status="";
    }
    
    public Package(String code, String origin, String destiny, String paymentMethod, String size, String numberOfPackages, String dateSent, String serviceType, String status) {
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

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getNumberOfPackages() {
        return numberOfPackages;
    }

    public void setNumberOfPackages(String numberOfPackages) {
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
    
    
    
    
}
