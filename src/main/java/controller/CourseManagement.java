/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import view.CourseMenu;

public class CourseManagement {
    public static void main(String[] args) {
         String[] mchon = {"Display Course","Add","Total amount of all courses","Total amount of each course by year" , "Delete Course by title","Find Course by title","Total Course Largest Quantity  ","Save to file","Exit"};
        CourseMenu bookMenu = new CourseMenu("=== Menu ===", mchon);
        bookMenu.run();
    }
}
