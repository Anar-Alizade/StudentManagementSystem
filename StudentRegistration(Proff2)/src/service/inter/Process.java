/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.inter;

/**
 *
 * @author user
 */
public interface Process {
    
    public default void process() {
        processAbstract();
    }
    
    public abstract void processAbstract();
    
}


