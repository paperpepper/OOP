/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package my.company.lab7;

/**
 *
 * @author TTK
 */
public class Board {
    public Figure[][] board = new Figure[8][8];
    public void displayBoard() {
       System.out.println("     a        b        c        d        e        f        g        h");
        System.out.println("  ----------------------------------------------------------------");
        for (int i = 0; i < board.length; i++) {
            
            System.out.print("| "); 
            for (int j = 0; j < board[i].length; j++) {
                if(board[i][j] == null){
                    System.out.print("xx      ");   
                }else{         
                System.out.print(board[i][j].getName() +"    ");
                }
            }
            System.out.println("|");   
        }
        System.out.println("  ----------------------------------------------------------------");
        System.out.println("     a        b        c        d        e        f        g        h");
        System.out.println();
    
    }
    public void placePosition(Figure figure){
        System.out.println();
        String position = figure.getPosition();
        int newRow = position.charAt(0) - 'a';
        int newColumn = 8 - Character.getNumericValue(position.charAt(1)); 

        if (newRow >= 0 && newRow < 8 && newColumn >= 0 && newColumn < 8) {
            if (board[newColumn][newRow] == null) {
                figure.setPosition(position);
                board[newColumn][newRow] = figure;
                
            } else {
                System.out.println("Can't place your figure there, try again! The position is already occupied.");   
            }
        } else {
            System.out.println("Can't place your figure there, try again! The target position is out of the board range.");
        }  
        displayBoard();
    }
            
    public void freeMove(Figure figure, String target) {
        
        String old=figure.getPosition();
        int oldRow = old.charAt(0)- 'a' ;
        int oldColumn = 8 - Character.getNumericValue(old.charAt(1)) ;
        int newRow = target.charAt(0) - 'a';
        int newColumn = 8 - Character.getNumericValue(target.charAt(1)); 
        System.out.println(figure.getName()+" move to :"+ target);
        if (newRow >= 0 && newRow < 8 && newColumn >= 0 && newColumn < 8) {
            if (board[newColumn][newRow] == null) {
                board[oldColumn][oldRow]=null;
                figure.setPosition(target);
                board[newColumn][newRow] = figure;
                
                
            } else {
                if(figure.getSide().equals(board[newColumn][newRow].getSide())){
                    System.out.println("Can't place your figure there, try again! The position is already occupied.");
                    return;
                }else{
                    board[newColumn][newRow] = figure;
                    figure.setPosition(target);
                    board[oldColumn][oldRow] = null;
                }
            }
        } else {
            System.out.println("Can't place your figure there, try again! The target position is out of the board range.");
        }
        displayBoard();
    }
    
}

class Figure  {
    private String name ,side,position;
    public Figure (String name,String side, String target,Board board) {
        this.name = name;
        this.side= side;
        this.position=target;     
        board.placePosition(this);
    }
    public String getName() {
        
        return name;
    }
    public String getPosition() {
        return position;
    }
    public String getSide(){
        return side;
    }
    public void setPosition(String position) {
        this.position = position;
    }
}
