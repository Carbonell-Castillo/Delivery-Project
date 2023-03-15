/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package InitialData;

/**
 *
 * @author bruce
 */
public class User extends Person{
    private String user, photo,email, password;
    private Integer role;
    private String KiokName;
    
    public User(){
        user="";
        photo="";
        email="";
        password="";
        KiokName="";
        role=0;
    }

    public User(String user, String photo, String email, String password, Integer role, String KiokName) {
        this.user = user;
        this.photo = photo;
        this.email = email;
        this.password = password;
        this.role = role;
        this.KiokName = KiokName;
    }

    public User(String user, String photo, String email, String password, Integer role, String KiokName, String id, String name, String lastName, String dateOfBirth, String gender, String nationality, String phoneNumber) {
        super(id, name, lastName, dateOfBirth, gender, nationality, phoneNumber);
        this.user = user;
        this.photo = photo;
        this.email = email;
        this.password = password;
        this.role = role;
        this.KiokName = KiokName;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getRole() {
        return role;
    }

    public void setRole(Integer role) {
        this.role = role;
    }

    public String getKiokName() {
        return KiokName;
    }

    public void setKiokName(String KiokName) {
        this.KiokName = KiokName;
    }

    
}
