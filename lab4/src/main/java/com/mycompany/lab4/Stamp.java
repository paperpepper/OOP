/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab4;

/**
 *
 * @author paperpepper
 */
public class Stamp {
    String text ="CPE";
    int maxNumber = 5;
    int numOfStamp = maxNumber;
    void stamp (){
        if(numOfStamp>0){
            System.out.println(text);
              numOfStamp--;
    }else
            System.out.println("Run out of the ink, Please refill!!!");
}
    void maxRefill(){
        numOfStamp = maxNumber;
        System.out.println("The stamp has been fully filled");
    }
}

