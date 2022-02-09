/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.inter;

import bean.Config;

/**
 *
 * @author user
 */
public interface SaveableProcess extends Process {

    @Override
    public default void process() {
        processAbstract();
        Config.save();
    }

    @Override
    public abstract void processAbstract();

}
