/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab5;

/**
 *
 * @author paperpepper
 */

public class bookmark {
    
    int totalPages;
    int currentPage;
    int bookmarkPage;

    public void Book(int totalPages) {
        this.totalPages = totalPages;
        currentPage = 1; 
        bookmarkPage = 1; 
        System.out.println("currentpage: " + currentPage);
    }

    public void openToFirstPage() {
        currentPage = 1;
        System.out.println("currentpage: " + currentPage);
    }

    public void openToLastPage() {
        currentPage = totalPages;
        System.out.println("currentpage: " + currentPage);
    }

    public void openToPage(int pageNumber) {
        if (pageNumber >= 1 && pageNumber <= totalPages) {
            currentPage = pageNumber;
            System.out.println("currentpage: " + currentPage);
        } else {
            System.out.println("The page you requested does not exist in the book.");
        }
    }

    public void openToBookmark() {
        currentPage = this.bookmarkPage;
        System.out.println("currentpage: " + currentPage);
    }

    public void openToNextPage() {
        if (currentPage < totalPages) {
            currentPage++;
            System.out.println("currentpage: " + currentPage);
        } else {
            System.out.println("You are now on the last page.");
        }
    }

    public void openToPreviousPage() {
        if (currentPage > 1) {
            currentPage--;
            System.out.println("currentpage: " + currentPage);
        } else {
            System.out.println("You are now on the first page.");
        }
    }

    public void insertBookmarkAtPage(int pageNumber) {
        if (pageNumber >= 1 && pageNumber <= totalPages) {
            bookmarkPage = pageNumber;
            System.out.println("Insert the bookmark into the page: "+ bookmarkPage);
        } else {
            System.out.println("Unable to insert a bookmark.");
        }
    }

    public void displayTotalPages() {
        System.out.println("Total number of pages in the book: " + totalPages);
    }

    public void displayBookmarkPageNumber() {
        System.out.println("Page number with bookmark: " + bookmarkPage);
    }
}