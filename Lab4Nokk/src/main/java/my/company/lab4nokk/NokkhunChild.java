/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package my.company.lab4nokk;

/**
 *
 * @author TTK
 */
public class NokkhunChild extends Nokkhun {
    public NokkhunChild(String fatherName, String motherName) {
        
        super();
            
            String fatherInitial = fatherName.substring(0, 1);
            String motherInitial = motherName.substring(0, 1);
            name = fatherInitial + motherInitial;
            age = 0;
            if(Math.random() > 0.5){
            gender  = "male";
            }
            else{
            gender = "female";
            }
            bodyW =(int) ((Math.random() * (100 - 50)) + 50);
            
            stomechW = 0;
            allW=bodyW+stomechW;
            System.out.println("Congratulations, you have a bird named "+ name +" ,"+ gender + ",weight " +bodyW+" grams");
            System.out.println("It is the child of " +fatherName +" and "+motherName);
        
    }

}
