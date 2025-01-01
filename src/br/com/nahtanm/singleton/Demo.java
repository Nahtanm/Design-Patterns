package br.com.nahtanm.singleton;

public class Demo {
    public static void main(String[] args) {
        Singleton sin1 = Singleton.getSingleton("Singleton 1");

        Singleton sin2 = Singleton.getSingleton("Singleton 2");

        System.out.println(sin1.getValue());
        System.out.println(sin2.getValue());

    }
}