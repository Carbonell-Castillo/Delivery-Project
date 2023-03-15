/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PackageManagement;

import InitialData.Client;
import InitialData.SG;
import InitialData.User;
import java.util.ArrayList;

/**
 *
 * @author bruce
 */
public class Users {
    private ArrayList <User> users;
    private ArrayList <Client> customers;
    
    public Users(){
        this.users= new ArrayList();
        this.customers= new ArrayList();
    }
    
    public void addUserRecord(User user){
        users.add(user);
    }
    
    public void addCustomerRecord(Client client){
        customers.add(client);
    }
    
    public User getUserRecord(int pos){
        return users.get(pos);
    }
    
    public Client getClientRecord(int pos){
        return customers.get(pos);
    }
    
    public ArrayList searchUserRecord(int DPI){
        ArrayList<User>resultUsers;
        resultUsers= new ArrayList();
        
        for (int i = 0; i < users.size(); i++) {
           User user = users.get(i);
           if(user.getId().equals(DPI)){
               resultUsers.add(user);
           }
        }
        
        return resultUsers;
    }
    
    public ArrayList searchUser(String userSearch){
        ArrayList<User>resultUsers;
        resultUsers= new ArrayList();
        
        for (int i = 0; i < users.size(); i++) {
           User user = users.get(i);
           if(user.getUser().equals(userSearch)){
               resultUsers.add(user);
           }
        }
        
        return resultUsers;
    }
    
    public Boolean validationUser(String email, String password){
        Boolean validacion=false;
        for (int i = 0; i < users.size(); i++) {
            if(users.get(i).getEmail().equals(email) && users.get(i).getPassword().equals(password) ){
                validacion=true;
                SG.setSESSION_DPI(users.get(i).getId());
                SG.setSESSION_ROLE(users.get(i).getRole());
                SG.setUserFound(users.get(i));
                if(users.get(i).getRole()==1){
                    findClient(users.get(i));
                }
            }
        }
        return validacion;
    }
    
    public void findClient(User user){
        for (int i = 0; i < customers.size(); i++) {
            Client client = customers.get(i);
            if(client.getUser().equals(user)){
                SG.setClientFound(client);
            }
            
        }
    }
    public Boolean validationUserRegister(String dpi, String user, String email){
        Boolean validation=false;
        for (int i = 0; i < users.size(); i++) {
            if(users.get(i).getEmail().equals(email) || users.get(i).getId().equals(dpi) || users.get(i).getUser().equals(user)){
                validation= true;
            }
        }
        return validation;
    }
    
    
    public ArrayList<User> getUsers() {
        return users;
    }

    public void setUsers(ArrayList<User> users) {
        this.users = users;
    }

    public ArrayList<Client> getCustomers() {
        return customers;
    }

    public void setCustomers(ArrayList<Client> customers) {
        this.customers = customers;
    }
    
        
    public Integer getLength(){
        return users.size();
    }
    
}
