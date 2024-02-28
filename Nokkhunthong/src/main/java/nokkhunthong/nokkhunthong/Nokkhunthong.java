/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package nokkhunthong.nokkhunthong;

/**
 *
 * @author TTK
 */
public class Nokkhunthong {
    // Attributes
   // String name;
    int age;
    double weight; // Weight excluding stomach content
    double stomachContentWeight;

    // Behaviors
//    public void speak(String message) {
//        System.out.println(message);
//    }

    public void speak() {
        System.out.println("Age: " + age + " years old");
    }

    public void eat(double foodWeight) {
        if (stomachContentWeight + foodWeight > weight) {
            System.out.println("Stomach upset!");
            defecate(foodWeight);
        } else {
            stomachContentWeight += foodWeight;
            weight += foodWeight;
            System.out.println("The Golden Bird has a weight of " + weight + " grams after eating.");
        }
    }

    public void defecate(double foodWeightToDefecate) {
        if (stomachContentWeight >= foodWeightToDefecate) {
            stomachContentWeight -= foodWeightToDefecate;
            System.out.println("Defecated the food.");
        } else {
            System.out.println("No food in the stomach to defecate.");
        }
    }
}
