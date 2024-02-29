/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package my.company.lap8;

/**
 *
 * @author TTK
 */
public class Lap8 {

    public static void main(String[] args) {
        Board brd= new Board();
        brd.boardInitiate();
        brd.freeMove("W1", "b2");
        brd.freeMove("BW1", "d2");
        brd.freeMove("B2", "g2");
        brd.freeMove("BW1", "e2");
        brd.freeMove("BW1", "h6");
        brd.freeMove("BW1", "g6");
        brd.freeMove("BW1", "g5");
        brd.freeMove("B1","g2");
        brd.freeMove("W1", "g2");
        
    }
}
