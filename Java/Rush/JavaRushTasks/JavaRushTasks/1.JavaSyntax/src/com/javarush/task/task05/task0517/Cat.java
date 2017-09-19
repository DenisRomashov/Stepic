package com.javarush.task.task05.task0517;

/* 
Конструируем котиков
*/

public class Cat {
    private String name;
    private int age;
    private int weight;
    private String address;
    private String color;

    public Cat(String name){
        this.name = name;
        this.age = 3;
        this.weight = 3;
        this.color = "red";
        this.address = null;
    }

    public Cat(String name, int weight, int age){
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.color = "red";
        this.address = null;
    }

    public Cat(String name, int age){
        this.name = name;
        this.age = age;
        this.weight = 3;
        this.color = "red";
        this.address = null;
    }

    public Cat(int weight, String color){
        this.weight = weight;
        this.color = color;
        this.age = 3;
        this.name = null;
        this.address = null;
    }

    public Cat(int weight, String color, String address){
        this.weight = weight;
        this.color = color;
        this.address = address;
        this.age = 3;
        this.name = null;

    }


    public static void main(String[] args) {

    }
}
