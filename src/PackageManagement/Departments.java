/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PackageManagement;

import InitialData.Department;
import java.util.ArrayList;

/**
 *
 * @author bruce
 */
public class Departments {
    private ArrayList <Department> departments;
    
    public Departments(){
        this.departments= new ArrayList();
    }
    
    public void addDepartment(Department department){
        departments.add(department);
    }
    
    public Department getDepartmentRecord(int pos){
        return departments.get(pos);
    }
    
    public ArrayList searchDepartmentsRegionCode(String code){
        ArrayList<Department>resultDepartments;
        resultDepartments= new ArrayList();
        
        for (int i = 0; i < departments.size(); i++) {
           Department department = departments.get(i);
           if(department.getCode().equals(code)){
               resultDepartments.add(department);
           }
        }
        return resultDepartments;
    }
    
    public Department searchDeparmentName(String name){
        Department departmentResult= new Department();
        
        for (int i = 0; i < departments.size(); i++) {
           Department department = departments.get(i);
           if(department.getName().equals(name)){               
               departmentResult=department;               
           }
        }
        
        return departmentResult;
    }
    
    public Integer getLength(){
        return departments.size();
    }
       
}