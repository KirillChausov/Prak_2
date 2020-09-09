package ru.mirea.prak1_2;

public class Loader {
    public static void main(String[] args) {
        Dog a = new Dog();
        a.setAge(5);
        a.setNickname("Bob");
        System.out.println(a.toString());
        System.out.println(a.getNickname() + " -- " + a.getAge());
        System.out.println(a.humAge() + "\n");

        Dog b = new Dog();
        System.out.println(b + "\n");

        Dog c = new Dog("Boss", 7);
        System.out.println(c + "\n");

        Dog d = new Dog();
        d.setNickname("Arnold");
        System.out.println(d.humAge());
        System.out.println(d.toString());


        Dog[] dogs = new Dog[5];
        for(int i = 0; i <= dogs.length-3; i++){
            dogs[i] = new Dog();
        }
        dogs[3] = new Dog("Volt", 1);
        dogs[4] = new Dog("Jack");

        System.out.println("\n" + dogs[3].toString());
        System.out.println("\n" + dogs[4].toString());
        System.out.println("\n" + dogs[3].humAge());
    }
}
