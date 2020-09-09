package ru.mirea.prak1_1;

public class Loader {
    public static void main(String[] args) {
        Book a = new Book();
        Book b = new Book();
        Book c = new Book();
        Book d = new Book("X");

        a.title = "War and Peace";
        a.numPages = 1274;
        System.out.println(a.toString());

        b.setNumPages(300);
        b.setTitle("Alphabet");
        System.out.println("\n" + b.getTitle() + " -- " + b.getNumPages());

        System.out.println("\n" + c.toString());

        System.out.println("\n" + d.toString());
    }
}
