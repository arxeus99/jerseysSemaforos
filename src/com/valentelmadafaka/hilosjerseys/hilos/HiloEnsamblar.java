package com.valentelmadafaka.hilosjerseys.hilos;

import com.valentelmadafaka.hilosjerseys.main;

public class HiloEnsamblar extends Thread {
    public void run(){
        try{
            while(true){
                if(main.mangas.availablePermits()<=main.mangas.availablePermits()-2 & main.cuerpos.availablePermits()<=main.cuerpos.availablePermits()-1){
                    sleep(5000);
                    main.cuerpos.release(1);
                    main.mangas.release(2);
                    System.out.println("Acabo de ensamblar un jersey");
                }else{
                    if( main.cuerpos.availablePermits() > ( main.cuerpos.availablePermits()-1 ) ) {
                        System.out.println("No hay suficientes cuerpos");
                    }
                    if(main.mangas.availablePermits()>main.mangas.availablePermits()-2){
                        System.out.println("No hay suficientes mangas");
                    }
                    sleep(15000);
                }
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
