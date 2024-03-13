package oop;

public class Breed {
    private String name;
    private String characteristics;
    private String possibleIllnesses;

    //properties (special methods for accessing and modifying values) - setters and getters
    public String getName() {
        return name;
    }

    //VALIDATION for all the setters!
    public void setName(String name) {
        if (!name.isEmpty()){
            this.name = name;
        }else {
            System.out.println("ERROR: Invalid entry for name!");
        }
    }

    public String getCharacteristics() {
        return characteristics;
    }

    public void setCharacteristics(String characteristics) {
        if (!characteristics.isEmpty()){
            this.characteristics = characteristics;
        }else {
            System.out.println("ERROR: Invalid entry for characteristics!");
        }

    }

    public String getPossibleIllnesses() {
        return possibleIllnesses;
    }

    public void setPossibleIllnesses(String possibleIllnesses) {
        if (!possibleIllnesses.isEmpty()){
            this.possibleIllnesses = possibleIllnesses;
        }else {
            System.out.println("ERROR: Invalid entry for possible illnesses!");
        }
    }

    public Breed(String name, String characteristics, String possibleIllnesses){
        setName(name);
        setCharacteristics(characteristics);
        setPossibleIllnesses(possibleIllnesses);
    }
}
