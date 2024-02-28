/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package my.company.testlabnokkthong;

/**
 *
 * @author TTK
 */
public class NewClass {
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
    
    public static breed(NewClass partner) {
        // Check if partners have different genders
        if (!gender.equals(partner.gender)) {
            // Generate the name of the offspring based on the parents' names
            return new bss(name,partner.name);
            
        } else {
            System.out.println("Cannot breed birds of the same gender.");
            return null;
        }
    }
    public bss(String fatherName, String motherName) {
        
        
        
        String fatherInitial = fatherName.substring(0, 1);
        String motherInitial = motherName.substring(0, 1);
        name = fatherInitial + motherInitial;
        
        
        age = 0;
        gender = "ssss";
        bodyW = 100;  
        stomechW = 0;
        allW=bodyW+stomechW;
    }
}
