/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.guardado.threads;

import javax.swing.JLabel;

/**
 *
 * @author LN710Q
 */
public class AnimalThread extends Thread{
    private String nombre;
    private int limite;
    private JLabel animal;
    private int x;
    private int y;

    public AnimalThread() {}

    public AnimalThread(String nombre, int x, int y, int limite, JLabel animal) {
        this.nombre = nombre;
        this.limite = limite;
        this.animal = animal;
        this.x = x;
        this.y = y;
    }
    
    
    @Override
    public void run(){
        
        int step = 0;
        
        if(this.nombre == "canguro"){
            step= 10;
        }
        
        if(this.nombre == "dragon"){
            step= 15;
        }
    
        if(this.nombre == "tortuga"){
            step= 5;
        }
        
        
        
        
        
        for(int i = 0; i<this.limite; i+= step){
            System.out.println(this.nombre + "avanza");
            this.animal.setLocation(i, y);
            
            try{
                sleep(100);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
            System.out.println(this.nombre + " a llegado a la meta");
            yield();
        }
        
        
        
        for(int i = 500 ; i > 0; i-= 10){
            System.out.println(this.nombre + "avanza");
            this.animal.setLocation(i, y);
            
            try{
                sleep(100);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
            System.out.println(this.nombre + " a llegado a la meta");
            yield();
        }
    }
    
}
