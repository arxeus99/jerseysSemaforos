package com.valentelmadafaka.hilosjerseys.hilos;

import com.valentelmadafaka.hilosjerseys.main;

public class HiloCuerpos extends Thread{
    public void run(){
        while(true) {
            try {
                if (main.cuerpos.tryAcquire()) {
                    main.cuerpos.acquire();
                    sleep(20000);
                } else {
                    System.out.println("No caben más cuerpos en la cesta");
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
