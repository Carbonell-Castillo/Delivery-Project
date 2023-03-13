/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package InitialData;

import PackageManagement.Departments;
import PackageManagement.Kiosks;
import PackageManagement.ManagementsOfRegionsAndPrices;
import PackageManagement.Municipalities;
import PackageManagement.Packages;
import PackageManagement.Users;

/**
 *
 * @author bruce
 */
public class SG {
    //Region and price management
    public static Users user = new Users();
    public static Departments departments = new Departments();  
    public static Kiosks kiosks= new Kiosks();
    public static Municipalities municipalities= new Municipalities();
    public static Packages packages= new Packages();
    public static ManagementsOfRegionsAndPrices managementsOfRegionsAndPrices = new ManagementsOfRegionsAndPrices();
    //Session
    public static String SESSION_DPI = "";
    public static Integer SESSION_ROLE = -1;
    public static User userFound;

    public static User getUserFound() {
        return userFound;
    }

    public static void setUserFound(User userFound) {
        SG.userFound = userFound;
    }
    
    public static String getSESSION_DPI() {
        return SESSION_DPI;
    }

    public static void setSESSION_DPI(String SESSION_DPI) {
        SG.SESSION_DPI = SESSION_DPI;
    }

    public static Users getUser() {
        return user;
    }

    public static void setUser(Users user) {
        SG.user = user;
    }

    public static Integer getSESSION_ROLE() {
        return SESSION_ROLE;
    }

    public static void setSESSION_ROLE(Integer SESSION_ROLE) {
        SG.SESSION_ROLE = SESSION_ROLE;
    }
    
    
}
