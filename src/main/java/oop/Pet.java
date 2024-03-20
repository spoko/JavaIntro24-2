package oop;

public class Pet {
    //fields or instance variables
    private byte age;
    private Breed breed;//composition
    private boolean isMale;
    private String name;
    private Address address;//aggregation

    //setters and getters
    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        if (age >= 0){
            this.age = age;
        }else {
            System.out.println("ERROR: Invalid entry for age!");
        }
    }

    public Breed getBreed() {
        return breed;
    }

    private void setBreed(Breed breed) {
        if (!breed.equals(null)){
            this.breed = breed;
        }else {
            System.out.println("ERROR: Invalid entry for breed!");
        }
    }

    public boolean isMale() {
        return isMale;
    }

    private void setMale(boolean male) {
        isMale = male;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (!name.isEmpty()){
            this.name = name;
        }else {
            System.out.println("ERROR: Invalid entry for name!");
        }
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        if (!address.equals(null)){
            this.address = address;
        }else {
            System.out.println("ERROR: Invalid entry for address!");
        }
    }

    //constructor type II - with parameters
    public Pet(String name, byte age, boolean isMale, Breed breed, Address address){
        setName(name);
        setAge(age);
        setMale(isMale);
        setBreed(breed);
        setAddress(address);
    }

    public Pet(boolean isMale, Breed breed){
        setMale(isMale);
        setBreed(breed);
    }

    //type I - no parameters and also default
    public Pet(){

    }

    //method i.e. actions
    public void eat(){
        System.out.printf("%s is eating...\n", name);
    }

    public void printData(){
        System.out.printf("%s is %d years old. It is %s and it is %s. It lives at %s\n",
                name, age, breed.getName(), returnSex(), address.printAddress());
    }

    private String returnSex(){
        if (isMale){
            return "male";
        }else {
            return "female";
        }
    }
}
