/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package my.company.lab6;

/**
 *
 * @author TTK
 */
public class Lab6 {

    public static void main(String[] args) {
        
        Board board = new Board(10);

     
        Figure f1 = new Figure("vadim", 1);
        Figure f2 = new Figure("allo", 2);

      
        board.placeFigure(f1);
        board.placeFigure(f2);
       
        board.moveFigure("vadim", 3);
        
        board.moveFigure("allo", 5);
        board.moveFigure("vadim", 5);
        board.displayBoard();
    }
}