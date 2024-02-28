/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package my.company.lab7;

/**
 *
 * @author TTK
 */
public class Lab7 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Board b1= new Board();
        Figure white1=new Figure("W1","white","a4",b1);
        //b1.placePosition(white1);
        Figure black1=new Figure("B2","black","a5",b1);
        //b1.placePosition(black1);
        Figure white2=new Figure("W2","white","a6",b1);
        //b1.placePosition(white2);
        b1.displayBoard();
        b1.freeMove(white1, "a1");
        b1.freeMove(white1, "a2");
        b1.freeMove(black1, "b2");
        b1.freeMove(black1, "a1");
        b1.freeMove(white2, "c5");
        b1.freeMove(white2, "a1");
        b1.freeMove(white2, "d5");
    }
}
