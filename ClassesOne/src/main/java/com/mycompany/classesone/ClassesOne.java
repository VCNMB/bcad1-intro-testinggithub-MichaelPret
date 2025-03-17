/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.classesone;

import javax.swing.JOptionPane;

/**
 *
 * @author lab_services_student
 */
public class ClassesOne {
    private static Students s = new Students(); //object of our studnet class

    public static void main(String[] args) {
         String strName = JOptionPane.showInputDialog(null, "please enter student name");   //getting input using joption.pan by using pop up dialog
          String strCourse = JOptionPane.showInputDialog(null, "plesae enter student course");
                  double dblAvg =Double.parseDouble (JOptionPane.showInputDialog(null, "Please enter Average"));
                  
                  
                  
                  s.setName (strName);   //using variables. accessing the methos. variables sending messages to the class
                  s.setCourse (strCourse);
                  s.setAverage (dblAvg);
                  print();  // method call
    }
                       public static void print()
                       {
                           String strDisplay =  "the updated student average results are\n "  //returns nothing  
                                                + "student: " + s.getName () + "\n"         
                                                + "Course : " + s.getCourse() + "\n"
                                                +"Updated avergae" + s.getAverage() +"%";
                           
                           JOptionPane.showMessageDialog(null, strDisplay);//displaying the message
                  
    }
}
