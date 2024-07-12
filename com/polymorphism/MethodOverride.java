package com.polymorphism;

public class MethodOverride {

    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        OverrideExample overrideExample = new OverrideExample();
        PolarBear polarBear = new PolarBear();
        polarBear.animalType();
        polarBear.animalWalkingStyle();
        polarBear.animalSpecies();
        polarBear.animalStrength();
        overrideExample.sound();
        dog.sound();
        cat.sound();
        cat.animalSpecies();
        cat.animalStrength();
        System.out.println(dog.weight(4,120));
    }
}

   class OverrideExample {
    public void sound(){
        System.out.println(" Animals sound ");
    }
    public int weight(int age ,int height){
        return (age*height )/100;
    }


}

abstract class Animal{
    abstract void animalType();
    abstract void animalWalkingStyle();
}

class Dog  extends OverrideExample {
 @Override
    public  void  sound(){
     System.out.println("Dog sound is bhoo bhoo");
 }

 @Override
 public int weight(int age,int height){
     System.out.println("Dog weight is ");
        return (age*height )/100;
    }

}

class  Cat extends OverrideExample implements OverridingInterface {
    @Override
    public  void  sound(){
        System.out.println("Cat sound is meow meow");
    }

    @Override
    public void animalSpecies() {
        System.out.println("Cats are belongs to leopard family");
    }

    @Override
    public void animalStrength() {
        System.out.println("Cats are not strong as mush as their Ancestors");
    }
}

class PolarBear extends Animal implements OverridingInterface{

    @Override
    void animalType() {
        System.out.println("Arctic type animal");
    }

    @Override
    void animalWalkingStyle() {
        System.out.println("Walked slowly slowly");
    }

    @Override
    public void animalSpecies() {
        System.out.println("Polar bear belongs to Bear family");
    }

    @Override
    public void animalStrength() {
        System.out.println("Polar bear are very strong");
    }
}
