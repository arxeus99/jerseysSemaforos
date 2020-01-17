package com.valentelmadafaka.hilosjerseys;

import com.valentelmadafaka.hilosjerseys.hilos.HiloCuerpos;
import com.valentelmadafaka.hilosjerseys.hilos.HiloEnsamblar;
import com.valentelmadafaka.hilosjerseys.hilos.HiloMangas;

import java.util.concurrent.Semaphore;

public class main {

    public static Semaphore mangas = new Semaphore(40);
    public static Semaphore cuerpos = new Semaphore(20);

    public static void main(String[] args) {
        HiloMangas m = new HiloMangas();
        HiloCuerpos c = new HiloCuerpos();
        HiloEnsamblar e = new HiloEnsamblar();

        m.start();
        c.start();
        e.start();
    }
}
