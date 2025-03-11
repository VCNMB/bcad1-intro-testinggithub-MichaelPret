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
    private static Students s = new Students();

    public static void main(String[] args) {
         String strName = JOptionPane.showInputDialog(null, "please enter student name");
          String strCourse = JOptionPane.showInputDialog(null, "plesae enter student coure");
                  double dblAvg =Double.parseDouble (JOptionPane.showInputDialog(null, "Please enter student course"));
                  
                  
                  
                  s.setName (strName);
                  s.setCourse (strCourse);
                  s.setAverage (dblAvg);
                  print();
    }
                       public static void print()
                       {
                           String strDisplay =  "the updated student average results are\n " 
                                                + "student: " + s.getName () + "\n" 
                                                + "Course : " + s.getCourse() + "\n"
                                                +"Updated avergae" + s.getAverage() +"%";
                           
                           JOptionPane.showMessageDialog(null, strDisplay);
                  
    }
}
