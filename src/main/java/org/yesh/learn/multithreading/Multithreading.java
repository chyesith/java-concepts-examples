package org.yesh.learn.multithreading;

public class Multithreading extends Thread {


    @Override
    public void run() {
        for (int i = 0; i <= 5; i++) {
            System.out.println(i);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
