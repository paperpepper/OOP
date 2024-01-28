/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.testlab4;

/**
 *
 * @author paperpepper
 */
public class Testlab4 {

    public static void main(String[] args) {
        Cup c1 = new Cup("C1", 500);
        Cup c2 = new Cup("C2", 600);

        c1.addWater(1000);
        c1.PourFloor(600);
        c2.addMaxWater();
        c2.tranfer(c1,2000);
        c1.interFace();
        c2.tranfer(c1,300);
        c1.tranfer(c2,300);
        c1.tranfer(c2, 200);
        c2.PourFloorMax();
        c2.tranfer(c1,500);
        c1.PourFloor(400);
        c1.addMaxWater();
        c2.addMaxWater();
        c1.tranfer(c2,500);
        c2.tranfer(c1,500);
    }
}
