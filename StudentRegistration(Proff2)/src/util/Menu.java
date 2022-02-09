/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

import bean.Config;
import service.menu.MenuAddStudentService;
import service.menu.MenuAddTeacherService;
import service.menu.MenuLoginService;
import service.menu.MenuShowStudentService;
import service.menu.MenuShowTeacherService;
import service.inter.Process;

/**
 *
 * @author user
 */
public enum Menu {

    LOGIN(1, "Login", new MenuLoginService()),
    ADD_TEACHER(2, "Add teacher", new MenuAddTeacherService()),
    ADD_STUDENT(3, "Add student", new MenuAddStudentService()),
    SHOW_ALL_TEACHER(4, "Show all teachers", new MenuShowTeacherService()),
    SHOW_ALL_STUDENT(5, "Show all students", new MenuShowStudentService()),
    UNKNOWN;

    private int number;
    private String label;
    private Process service;

    Menu() {

    }

    Menu(int number, String label, Process service) {//Meselen:   Process service = new MenuLoginService();
        this.number = number;
        this.label = label;
        this.service = service;
    }

    public int getNumber() {
        return number;
    }

    public String getLabel() {
        return label;
    }

    @Override
    public String toString() {
        return number + ". " + label;
    }

    public void process() {
        service.process();
        MenuUtil.showMenu();
    }

    public static Menu find(int selectedMenu) {
        Menu[] menus = Menu.values();
        for (int i = 0; i < menus.length; i++) {
            if (menus[i].getNumber() == selectedMenu) {
                return menus[i];
            }
        }
        return Menu.UNKNOWN;
    }

    public static void showAllMenu() {
        System.out.println("Please select menu");
        Menu[] menus = Menu.values();
        for (int i = 0; i < menus.length; i++) {
            if (menus[i] != UNKNOWN) {
                if (menus[i] == LOGIN) {
                    if (!(Config.isLoggedIn())) {
                        System.out.println(menus[i]);
                    }
                } else if (Config.isLoggedIn()) {
                    System.out.println(menus[i]);
                }
            }
        }
    }

}
