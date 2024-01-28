/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab1;

/**
 *
 * @author paperpepper
 */
public class Nokkhun {
    String name;
    int age;
    int bodyW=300;
    int stomechW=0;
    int allW=bodyW+stomechW;
    public void init(String Iname, int Iage){
        name =Iname;
        age = Iage;
    }
    
    public void speak(){
        System.out.println(name+" : "+"I\'m "+age+" years old");
    }
    
    public void speak(String speak101){
        if(speak101!=null){
            System.out.println(name+" : "+speak101);
        }
    }
    
    public void eat(int dish){
        stomechW+=dish;
        System.out.println(name+" : "+"Now my weight "+allW+" grams");
        System.out.println(name+" : "+"I ate "+ dish+" grams of food");
        if(stomechW<bodyW){
            allW=bodyW+stomechW;
            System.out.println(name+" : "+"So now I have weight "+allW+" grams");
        }else{
            System.out.println(name+" : "+"eat to much so much very much!!!");
            excreate(stomechW);
        }
    }
    public void excreate(int outer){
        stomechW-=outer;
        allW=bodyW+stomechW;
        System.out.println(name+" : "+"I\'m excreate "+outer+" grams");
        System.out.println(name+" : "+"So now I have weight "+allW+" grams");
    }
}


