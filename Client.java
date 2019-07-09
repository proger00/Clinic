package com.company;

class Pet{
    String name;

    public Pet(String name){
        this.name = name;
    }
}


public class Client {
    private final String id;
    private final Pet pet;
    public String ClientName;
    private int size = 0;

    public String getClientName(){
        return this.ClientName;
    }

    public String getId(){
        return this.id;
    }

    public Pet getPet(){
        return this.pet;
    }

    public Client(String ClientName, Pet pet) {
        this.pet = pet;
        this.id = Integer.toString(++size);
        this.ClientName = ClientName;

    }

}
