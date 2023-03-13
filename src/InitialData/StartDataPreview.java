/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package InitialData;

/**
 *
 * @author bruce
 */
public class StartDataPreview {
    public void StartUsersData() {
        User user = new User();
        user.setId("1234");
        user.setName("Bruce");
        user.setLastName("Castillo");
        user.setUser("Admin");
        user.setDateOfBirth("12/08/2004");
        user.setGender("Masculino");
        user.setNationality("Guatemalteco");
        user.setPhoneNumber("57149818");
        user.setEmail("admin");
        user.setPhoto("/icon/profile.jpg");
        user.setPassword("admin");
        
        user.setRole(1);
        SG.user.addUserRecord(user);
    }
    
    public void StartClientData(){
        Client client= new Client();
        User user = new User();
        user.setId("4321");
        user.setName("Carbonell");
        user.setLastName("Castillo");
        user.setUser("Cliente");
        user.setDateOfBirth("12/08/2004");
        user.setGender("Masculino");
        user.setNationality("Guatemalteco");
        user.setPhoneNumber("57149818");
        user.setEmail("cliente");
        user.setPhoto("/icon/profile1.jpg");
        user.setPassword("cliente");
        
        user.setRole(1);
        client.setUser(user);
        SG.user.addUserRecord(user);
        SG.user.addCustomerRecord(client);
    
    }
    
    
}
