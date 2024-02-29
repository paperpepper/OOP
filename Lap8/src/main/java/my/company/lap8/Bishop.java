/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package my.company.lap8;

/**
 *
 * @author TTK
 */
public class Bishop extends Figure {

    public Bishop(String name,boolean isWhite, String currentPosition) {
        super(name, isWhite, currentPosition);
    }
    void move(Board board, String targetPosition) {
        int row = targetPosition.charAt(0) - 'a';
        int column = 8 - Character.getNumericValue(targetPosition.charAt(1));

        if((row< 0 || row >= 8) || (column < 0||column >=8)){
            System.out.println("Position is out of bounds");
            return;
        }
        else if((board.brd[column][row] != null && board.brd[column][row].isWhite == this.isWhite))       
            System.out.printf("The distination is being occupied by the same-side figure \"%s\", Command abort!!!\n\n", board.brd[column][row].name);
            
            
        int deltaX = row - this.positionX;
        int deltaY = column - this.positionY;

        
        if (Math.abs(deltaX) == Math.abs(deltaY)) {
            board.brd[positionY][positionX] = null;
            board.brd[column][row] = this;
            this.positionX = row;
            this.positionY = column;
            
        }
        
        else{
            System.out.println("Bishop can't move there");
            return;
        }
    }
}

