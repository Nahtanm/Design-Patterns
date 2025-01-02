package br.com.nahtanm.singleton;

public class DemoMultiThread {
    public static void main(String[] args) {

        Thread threadFoo = new Thread(new ThreadFoo());
        Thread threadBar = new Thread(new ThreadBar());

        threadBar.start();
        threadFoo.start();

    }

    public static class ThreadFoo implements Runnable{
        @Override
        public void run() {
            Singleton singleton_1 = Singleton.getSingleton("Chama papai");
            System.out.println(singleton_1.getValue());
        }
    }

    public static class ThreadBar implements Runnable{
        @Override
        public void run() {
            Singleton singleton_2 = Singleton.getSingleton("Chama mamãe");
            System.out.println(singleton_2.getValue());
        }
    }

}
