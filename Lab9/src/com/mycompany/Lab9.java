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
        brd.freeMove("B1","g2");
        brd.freeMove("W1", "g2");
        brd.freeMove("WP1","b2");
        brd.freeMove("WP1","b6");
        brd.freeMove("WP1","c5");
        brd.freeMove("B2", "h8");
        brd.freeMove("BP1","b3");
        brd.freeMove("BP1","b4");
        brd.freeMove("BP1","b5");
        brd.freeMove("BP1","a5");
        brd.freeMove("BP1","c5");
        brd.freeMove("BP1","c4");
        brd.freeMove("BP1","c9");
        brd.freeMove("BP1","z6");
        brd.freeMove("BP1","d4");
        brd.freeMove("BP1","c6");
        brd.freeMove("WP2","c6");
        brd.freeMove("WP2","a4");
    }
    
}
