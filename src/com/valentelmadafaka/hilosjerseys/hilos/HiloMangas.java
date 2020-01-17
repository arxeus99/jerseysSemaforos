package com.valentelmadafaka.hilosjerseys.hilos;

import com.valentelmadafaka.hilosjerseys.main;

public class HiloMangas extends Thread {

    public void run(){
        while (true){
            try{
                if(main.mangas.tryAcquire()){
                    //main.mangas.acquire();
                    sleep(10000);
                }else{
                    System.out.println("No caben más mangas en la cesta");
                }
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
        }


    }
}
