/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab5;

/**
 *
 * @author paperpepper
 */
public class Lab5 {

    public static void main(String[] args) {
        bookmark s1=new bookmark();
        s1.Book(20);
        s1.openToNextPage();
        s1.openToFirstPage();
        s1.openToPreviousPage();
        s1.insertBookmarkAtPage(12);
        s1.openToLastPage();
        s1.openToNextPage();
        s1.openToBookmark();
        s1.openToNextPage();
        s1.openToPreviousPage();
        s1.displayBookmarkPageNumber();
        s1.displayTotalPages();
        s1.insertBookmarkAtPage(14);
        s1.displayBookmarkPageNumber();
    }
}
