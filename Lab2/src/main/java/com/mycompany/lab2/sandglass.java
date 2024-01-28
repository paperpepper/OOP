/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab2;

/**
 *
 * @author paperpepper
 */
public class sandglass {
    int Asand,Bsand;
    int degree;
    public void rotateRight90(){
        degree+=90;
        if(degree==360){
            System.out.println("Turn right 90 degree -> degree : 360 -> degree : 0");
         
        }else
            System.out.printf("Turn right 90 degree -> degree : %d%n",degree);
        flow();  
        //System.out.println(degree);
    }
    public void rotateRight180(){
        degree+=180;
        if(degree==450){
            System.out.println("Turn right 180 degree -> degree : 450 -> degree : 90");
            System.out.println("A on side2:B on side4");
        }else if(degree==360){
            System.out.println("Turn right 180 degree -> degree : 360 -> degree : 0");
        }else
            System.out.printf("Turn right 180 degree -> degree : %d%n",degree);
        flow();
        //System.out.println(degree);
    }

    public void flow() {
        
        switch (degree) {
            
            case 450:
                degree = 90;
                break;
            case 360:
                degree = 0;      
            case 0:
                Bsand = 0;
                System.out.println("A on side1:B on side3");
                System.out.println("\"-----The sand is flowing-----\"");
                for (Asand = 5000; Asand >= -1; Asand -= 1000) {
                    try
                    {
                        Thread.sleep(1000);
                    }
                    catch(InterruptedException ex)
                    {
                        ex.printStackTrace();
                    }
                    System.out.printf("A_sand : %-6d B_sand : %-6d%n", Asand, Bsand);
                    Bsand += 1000;
                }
                break;
            case 90:
                 try
                    {
                        Thread.sleep(100);
                    }
                    catch(InterruptedException ex)
                    {
                        ex.printStackTrace();
                    }
                System.out.println("A on side2:B on side4");
                break;
            case 180:
                Bsand = 5000;
                System.out.println("A on side3:B on side1");
               System.out.println("\"-----The sand is flowing-----\"");
                for (Asand = 0; Asand <= 5001; Asand += 1000) {
                    try
                    {
                        Thread.sleep(1000);
                    }
                    catch(InterruptedException ex)
                    {
                        ex.printStackTrace();
                    }
                    System.out.printf("A_sand : %-6d B_sand : %-6d%n", Asand, Bsand);
                    Bsand -= 1000;
                }
                break;
            case 270:
                 try
                    {
                        Thread.sleep(100);
                    }
                    catch(InterruptedException ex)
                    {
                        ex.printStackTrace();
                    }
                System.out.println("A on side4:B on side2");
                break;
           
            default:
                break;
        }
    }
}    

    
