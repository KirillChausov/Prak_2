package ru.mirea.prak1_2;

public class Dog {
    private String nickname;
    private int age;

    public Dog(){
        nickname = "Zeus";
        age = 0;
    }

    public Dog(String x, int y){
        nickname = x;
        age = y;
    }

    public Dog(String x){
        nickname = x;
        age = 0;
    }

    public void setNickname(String nickname){
        this.nickname = nickname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNickname(){
        return nickname;
    }

    public int getAge() {
        return age;
    }

    public String toString() {
        return "Dog{" +
                "nickname='" + nickname + '\'' +
                ", age=" + age +
                '}';
    }

    public String humAge(){
        return "Результат перевода возраста собаки в " + "\"человеческий\"" + " возраст: " + age * 7;
    }
}