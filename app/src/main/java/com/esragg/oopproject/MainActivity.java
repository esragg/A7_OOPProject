package com.esragg.oopproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
/*
        User myUser = new User();
        myUser.name = "Esra";
        myUser.job = "Developer";

        User newUser = new User();
        newUser.name = "Kirk";
        newUser.job = "Musician";
 */
        User myUser = new User("Esra", "Developer");
        System.out.println(myUser.name);

        //Encapsulation
        Musician james = new Musician("James", "guitar", 50);
        System.out.println(james.getName());
        james.setAge(60, "esra");
        System.out.println(james.getAge());

        //Inheritance
        SuperMusician lars = new SuperMusician("Lars", "Drums", 55);
        System.out.println(lars.sing());
        System.out.println(lars.getAge());

        //Polymorphism

        //Static Polymorphism

        Mathematics mathematics = new Mathematics();
        System.out.println(mathematics.sum());
        System.out.println(mathematics.sum(5,3));
        System.out.println(mathematics.sum(5,3,4));

        //Dynamic Polymorphism
        Animal myAnimal = new Animal();
        myAnimal.sing();

        Dog barley = new Dog();
        barley.test();
        barley.sing();
    }
}