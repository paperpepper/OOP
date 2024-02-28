package my.company.lab4nokk;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author TTK
 */
public class Nokkhun {
    String name;
    String gender,testgender;
    int age;
    int bodyW=300;
    int stomechW=0;
    int allW=bodyW+stomechW;
    public void init(String Iname, int Iage,String Igender){
        testgender=Igender.toLowerCase();
        if((testgender.equals("male")||(testgender.equals("female")))){
            gender=testgender;
            name =Iname;
            age = Iage;
        }
        else{
            System.out.println("male or female pls");
            
        }
    }
    
    public void speak(){
        System.out.println(name+" : "+"I\'m "+age+" years old "+"I\'m "+gender); 
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
    
    public NokkhunChild breed(Nokkhun other) {
        if ((!gender.equals(other.gender)) && (other.age >=1)&& (this.age >=1)){
            return new NokkhunChild(name,other.name);
        } else if(gender.equals(other.gender)) {
            System.out.println("Cannot breed birds of the same gender.");
            return null;
        }else{
            System.out.println("Cannot breed birds under 1 years old ");
            return null;
        }
    }
    public void growup(){
        age = (int) (Math.random() * (3 - 1 )) + 1;
        bodyW =(int) ((Math.random() * (300 - 150)) + 150);
        System.out.println(name +" : grows up to "+ age  + " years old" + ",weight "+ bodyW+" grams");
    }
}
    
 
    
    
    
   
     
    


