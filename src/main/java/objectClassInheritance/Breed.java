package objectClassInheritance;

public class Breed {
    private String name;
    private String characteristics;
    private String possibleIllnesses;

    public String getName() {
        return name;
    }
    //Validation
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
    //Validation
    public void setCharacteristics(String characteristics) {
        if (!characteristics.isEmpty()) {
            this.characteristics = characteristics;
        } else {
            System.out.println("ERROR: Invalid entry for characteristics!");
        }
    }
    public String getPossibleIllnesses() {
        return possibleIllnesses;
    }
    //Validation
    public void setPossibleIllnesses(String possibleIllnesses) {
        if (!possibleIllnesses.isEmpty()){
            this.possibleIllnesses = possibleIllnesses;
        }else {
            System.out.println("ERROR: Invalid entry for possible illnesses");
        }
    }
    //constructor
    public Breed(String name,String characteristics, String possibleIllnesses){
        setName(name);
        setCharacteristics(characteristics);
        setPossibleIllnesses(possibleIllnesses);
    }
}
