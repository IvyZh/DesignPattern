package com.ivyzh.designpatterndemo.d1_singleton_pattern.demo1;

public class TestValatileDemo1 {

    private static class MyRunnable implements Runnable {
        private volatile boolean flag = false;

        @Override
        public void run() {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            flag = true;
            System.out.println("flag = " + flag);
        }

        public boolean isFlag() {
            return flag;
        }
    }

    public static void main(String[] args) throws InterruptedException {

        MyRunnable runnable = new MyRunnable();
        new Thread(runnable).start();

        while (true) {
            if (runnable.isFlag()) {
                System.out.println("----------------");
                break;
            }
        }

    }
}
