/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany;

/**
 *
 * @author paperpepper
 */
public class Board {
    Figure brd [][] = new Figure[8][8];
    void boardInitiate(){
        brd [7][0] = new Figure("W1",true,"a1");
        brd [7][1] = new Figure("B1",false,"b2"); 
        brd [7][1] = new Pawn("BP1",false,"b1");
        brd [0][1] = new Pawn("WP1",true,"b8");
        brd [3][1] = new Pawn("WP2",true,"b5");
        brd [3][2] = new Figure("B2",false,"c5"); 
        brd [4][3] = new Pawn("BP2",false,"d4"); 
        brd [4][0] = new Pawn("WP3",true,"a4"); 
        
    }
    public void display() {
    System.out.println("        a           b            c            d           e            f            g            h");
     System.out.println("  --------------------------------------------------------------------------------------");
    for (int i = 0; i < brd.length; i++) {
        System.out.print( 8-i +"| "); 
        for (int j = 0; j < brd[i].length; j++) {
            if(brd[i][j] == null){
                System.out.print("XXX      ");   
            } else {
                String pieceName = brd[i][j].name;
                
                if(pieceName.length()<3){
                    System.out.print(String.format("%3s      ", pieceName));
                    }
                else{
                    System.out.print(pieceName+"      ");
                }
            }
        }
        System.out.println("|");   
    }
    System.out.println("  --------------------------------------------------------------------------------------");
    System.out.println("        a           b            c            d           e            f            g            h");
    System.out.println();
    }
    void freeMove(String name,String targetPosition){  
        System.out.printf("Command : move figure \"%s\" to %s\n", name,targetPosition);
        boolean found = false;
        for(int n=0;n<brd.length;n++){
            for(int m=0;m<brd[n].length;m++){
                if(brd[n][m] == null) 
                    continue;
                if(brd[n][m].name == name){
                    found = true;
                brd[n][m].move(this,targetPosition);
                break;
            }
        }
    }
        if(found == false)
            System.out.printf("There is no figure named as \"%s\" in the board!!!, Command abort\n\n",name);
        display();
    }
}