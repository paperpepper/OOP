/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany;

/**
 *
 * @author paperpepper
 */
public class Lab9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Board brd= new Board();
        brd.boardInitiate();
        brd.freeMove("W1", "b9");
        brd.freeMove("BW1", "d2");
        brd.freeMove("BB1", "g2");
        brd.freeMove("BW1", "e2");
        brd.freeMove("BW1", "h6");
        brd.freeMove("BW1", "g6");
        brd.freeMove("BW1", "g5");
        brd.freeMove("B1","g2");
        brd.freeMove("W1", "g2");
        
    }
    
}
