package ru.mirea.prak1_1;

public class Book {
    public String title;
    public int numPages;

    public Book(String x, int y){
        title = x;
        numPages = y;
    }

    public Book(String x){
        title = x;
    }

    public Book(){
        title = "Book";
        numPages = 1;
    }

    public void setNumPages(int numPages){
        this.numPages = numPages;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public String getTitle(){
        return title;
    }

    public int getNumPages(){
        return numPages;
    }

    public String toString() {
        return "Book{" +
                "title='" + this.title + '\'' +
                ", numPages=" + this.numPages +
                '}';
    }
}
