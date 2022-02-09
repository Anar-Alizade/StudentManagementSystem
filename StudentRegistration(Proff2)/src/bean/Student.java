/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bean;

import lombok.Data;
import lombok.SneakyThrows;

/**
 *
 * @author user
 */
@Data
public class Student extends Person {

    private String schoolName;
    private double scholarhip;

    @SneakyThrows
    public void foo(int a) {
        if (a > 9) {
//            throw new Exception();
        }
    }

}
