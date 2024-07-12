package com.encapsulation;

import javax.swing.plaf.synth.SynthTreeUI;

public class EncapsulationExample {
    private String name;
    private int age;
    private String profession;
    public EncapsulationExample(){

    }

     public EncapsulationExample(String name , int age, String profession ){
        this.name = name;
        this.age = age;
        this.profession =profession;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getProfession() {
        return profession;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }
}
