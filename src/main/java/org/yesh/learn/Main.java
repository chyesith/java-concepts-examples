package org.yesh.learn;

import org.yesh.learn.multithreading.Multithreading;

public class Main {
    public static void main(String[] args) {
        Multithreading mt = new Multithreading();
        Multithreading m2 = new Multithreading();

        mt.start();
        m2.start();
    }
}