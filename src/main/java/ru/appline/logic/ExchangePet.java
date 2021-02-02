package ru.appline.logic;

import org.springframework.ui.Model;

public class ExchangePet {
    private int id;
    private String name;
    private String type;
    private int age;

    public ExchangePet(){
        super();
    }

    public ExchangePet(int id, String name, String type, int age) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    private static final PetModel petModel = PetModel.getInstance();
    public void exchange(int id, String name, String type, int age){
        petModel.remove(id);
        petModel.add(id, name, type, age);

    }
}
