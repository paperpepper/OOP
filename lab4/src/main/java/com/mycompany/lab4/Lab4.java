/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab4;

/**
 *
 * @author paperpepper
 */
public class Lab4 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Stamp st = new Stamp();
        System.out.println(st.text);
        st.stamp();
        st.stamp();
        st.stamp();
        st.stamp();
        st.stamp();
        st.maxRefill();
        st.stamp();
        System.out.println(st.numOfStamp);
    }
}

