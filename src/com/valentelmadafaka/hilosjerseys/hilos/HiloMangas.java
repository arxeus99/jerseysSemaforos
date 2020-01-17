package com.valentelmadafaka.hilosjerseys.hilos;

import com.valentelmadafaka.hilosjerseys.main;

public class HiloMangas extends Thread {

    public void run(){
        while (true){
            try{
                sleep(10000);
                if(main.mangas.tryAcquire()){
                    //main.mangas.acquire();
                    System.out.println("He terminado una manga");
                }else{
                    System.out.println("No caben más mangas en la cesta");
                }
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
        }


    }
}
