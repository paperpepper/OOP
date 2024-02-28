/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package my.company.lab6;

/**
 *
 * @author TTK
 */
class Board {
    private int size;
    private Figure[] figures;

    public Board(int size) {
        this.size = size;
        this.figures = new Figure[size];
    }

    public void placeFigure(Figure figure) {
        System.out.println();
        int position = figure.getPosition();
        if (position < 1 || position > this.size) {
            System.out.println("Invalid position! Position must be between 1 and " + this.size);
            return;
        }
        if (this.figures[position - 1] != null) {
            System.out.println("Position " + position + " is already occupied!");
            return;
        }
        this.figures[position - 1] = figure;
        System.out.println("Place figure "+ figure.getName()+" on position "+ position);
        displayBoard();
    }

    public void moveFigure(String name, int destination) {
        Figure figure = getFigureByName(name);
        System.out.println();
        if (figure == null) {
            System.out.println("Figure " + name + " is not on the board.");
            return;
        }
        int currentPosition = figure.getPosition();
        if (destination < 1 || destination > this.size) {
            System.out.println("Invalid destination! Destination must be between 1 and " + this.size);
            return;
        }
        if (this.figures[destination - 1] != null) {
            System.out.println("Destination position is already occupied!");
            return;
        }
        figure.setPosition(destination);
        this.figures[destination - 1] = figure;
        this.figures[currentPosition - 1] = null;
        System.out.println("Move figure "+ figure.getName()+" on position "+ destination);
        displayBoard();
    }

    private Figure getFigureByName(String name) {
        for (Figure figure : this.figures) {
            if (figure != null && figure.getName().equals(name)) {
                return figure;
            }
        }
        return null;
    }

    public void displayBoard() {
        System.out.println("Board Status:");
        for (int i = 0; i < this.size; i++) {
            if (this.figures[i] != null) {
                System.out.println("Position " + (i + 1) + ": " + this.figures[i].getName());
            } else {
                System.out.println("Position " + (i + 1) + ": x");
            }
        }
    }
}

class Figure {
    private String name;
    private int position;

    public Figure(String name, int position) {
        this.name = name;
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }
}