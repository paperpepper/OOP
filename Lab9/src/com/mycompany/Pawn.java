/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany;

/**
 *
 * @author paperpepper
 */
public class Pawn extends Figure {
    private boolean isFirstmove;
    public Pawn(String name,boolean isWhite, String currentPosition) {
        super(name, isWhite, currentPosition);
        isFirstmove= true;
    }
    void move(Board board, String targetPosition) {
        int row = targetPosition.charAt(0) - 'a';
        int column = 8 - Character.getNumericValue(targetPosition.charAt(1));
       
        if((row< 0 || row >= 8) || (column < 0||column >=8)){
            System.out.println("Position is out of bounds");
            return;
        
        }
        else {
            if(isWhite){
                if((board.brd[column][row] == null )){
                    if(positionX != row){
                        System.out.println("Can't move in another row");
                        return;
                    }
                    if (isFirstmove) {
                        if(column > (positionY+2)){
                            System.out.println("Can't move better 2 level");
                            return ;
                        }
                        isFirstmove=false; 
                    
                    }else if(!isFirstmove)
                        if(column > (positionY+1)){
                            System.out.println("Can't move better 1 level");
                            return;
                        }else if(column < positionY){
                            System.out.println("Can't get back");
                            return;
                        
                        }board.brd[positionY][positionX] = null;
                        board.brd[column][row] = this;
                        this.positionX = row;
                        this.positionY = column;
            }if( Math.abs(row - positionX) == 1 && Math.abs(column - positionY) == 1 && column - positionY == 1){
                if(board.brd[column][row].isWhite == this.isWhite){
                    System.out.printf("The distination is being occupied by the same-side figure \"%s\", Command abort!!!\n\n", board.brd[column][row].name);
                    return;
                }
                board.brd[positionY][positionX] = null;
                board.brd[column][row] = this;
                this.positionX = row;
                this.positionY = column;
                return;
            }
            if(board.brd[column][row] !=this)
                System.out.printf("The distination is being occupied by the figure \"%s\", Command abort!!!\n\n", board.brd[column][row].name);
            } else{
                if((board.brd[column][row] == null  )){
                    
                    if(column > positionY){
                        System.out.println("Can't get back");
                        return;
                    }
                    if (isFirstmove) {
                        if(column < (positionY-2)){
                            System.out.println("Can't move better 2 level");
                            return ;
                        }
                        isFirstmove=false; 
                    }else if(!isFirstmove)
                        if(column < (positionY-1)){
                            System.out.println("Can't move better 1 level");
                            return;
                        }
                        if(positionX != row){
                            System.out.println("Can't move in another row");
                            return;
                        }board.brd[positionY][positionX] = null;
                        board.brd[column][row] = this;
                        this.positionX = row;
                        this.positionY = column;
                }if( Math.abs(row - positionX) == 1 && Math.abs(column - positionY) == 1 && column - positionY == -1){
                    if(board.brd[column][row].isWhite == this.isWhite){
                        System.out.printf("The distination is being occupied by the same-side figure \"%s\", Command abort!!!\n\n", board.brd[column][row].name);
                        return;
                    }
                    board.brd[positionY][positionX] = null;
                    board.brd[column][row] = this;
                    this.positionX = row;
                    this.positionY = column;
                    return;
                }            if(board.brd[column][row] !=this)
                    System.out.printf("The distination is being occupied by the figure \"%s\", Command abort!!!\n\n", board.brd[column][row].name);
            }
        }    
    }  
}
  

