/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package my.company.lab4nokk;

/**
 *
 * @author TTK
 */
public class Lab4Nokk {
    public static void main(String[] args) {
        Nokkhun s1=new Nokkhun();
        Nokkhun s2=new Nokkhun();
        s2.init("Rodger",2,"female");
        s1.init("Lucy",2,"male");
        s1.speak("chipi chipi chapa chapa puri puri papa papa boom boom boom");
        s1.speak();
        s1.eat(50);
        s1.eat(150);
        s1.excreate(100);
        s1.eat(1500);
        Nokkhun s3=s1.breed(s2);
        s3.eat(1550);
        s3.speak();
        NokkhunChild child = s1.breed(s2);
        child.speak();
        child.eat(99);
        child.eat(99);
        child.growup();
        NokkhunChild child1 = s2.breed(child);
        child1.speak();
        child1.eat(99);
        child1.eat(99);
        child1.growup();
        NokkhunChild child2 = child1.breed(child);
        child2.speak();
    }
}