package com.valentelmadafaka.hilosjerseys.hilos;

import com.valentelmadafaka.hilosjerseys.main;

public class HiloCuerpos extends Thread{
    public void run(){
        while(true) {
            try {
                sleep(20000);
                if (main.cuerpos.tryAcquire()) {
                    //main.cuerpos.acquire();
                    System.out.println("Cuerpos: He terminado un cuerpo");
                } else {
                    System.out.println("Cuerpos: No caben más cuerpos en la cesta");
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
