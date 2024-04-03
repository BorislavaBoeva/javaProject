package objectClassInheritance;

public class Pet {
    //field or instance variables
    private String name;
    private Breed breed;//composition
    private byte age;
    private boolean isMale;
    private Address address; //aggregation

    public String getName() {
        return name;
    }

    //Validation
    public void setName(String name) {
        if (!name.isEmpty()) {
            this.name = name;
        } else {
            System.out.println("ERROR! Invalid entry for name!");
        }
    }

    public Breed getBreed() {
        return breed;
    }

    //Validation
    public void setBreed(Breed breed) {
        if (breed != null) {
            this.breed = breed;
        } else {
            System.out.println("ERROR! Invalid entry for bread!");
        }
    }

    public byte getAge() {
        return age;
    }

    //Validation
    public void setAge(byte age) {
        if (age >= 0) {
            this.age = age;
        } else {
            System.out.println("ERROR! Invalid entry for age!");
        }
    }

    public boolean isMale() {
        return isMale;
    }

    //Validation - true or false
    public void setMale(boolean male) {
        isMale = male;
    }

    public Address getAddress() {
        return address;
    }

    //Validation
    public void setAddress(Address address) {
        if (address != null) {
            this.address = address;
        } else {
            System.out.println("ERROR! Invalid entry for address!");
        }
    }

    public Pet(String name, Breed breed, byte age, boolean isMale, Address address) {
        setName(name);
        setBreed(breed);
        setAge(age);
        setMale(isMale);
        setAddress(address);
    }
    //method for super class
    public void eat() {
        System.out.printf("%s is eating.......\n", name);
    }
    public void play(){
        System.out.printf("%s is playing.......\n", name);
    }
    public void play(String toy){
        System.out.printf("%s is playing with %s\n", name, toy);
    }
    public void printData(){
        System.out.printf("%s is %s. It is %d years old\n. %s is %s and lives in %s\n",
                name, breed.getName(), age, name, returnSex(), address.printAddress());
    }
    private String returnSex() {
        if (isMale) {
            return "Gentleman";
        } else {
            return "Lady";
        }
    }
}
