/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.menu;

import bean.Config;
import bean.Student;
import service.inter.menu.MenuShowStudentServiceInter;

/**
 *
 * @author user
 */
public class MenuShowStudentService implements MenuShowStudentServiceInter{

    @Override
    public void processAbstract() {
        Student[] allStudent = Config.instance().getStudents();
        for(int i=0; i<allStudent.length; i++) {
            System.out.println(allStudent[i]);
        }
    }
    
}
