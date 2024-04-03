package objectClassInheritance;

public class Parrot extends Pet {

    //specific Parrot characteristic -fields or instance variables
    private boolean hasFeathers;
    private  boolean hasBeak;

public Parrot(String name, Breed breed, byte age, boolean isMale, Address address,boolean hasFeathers, boolean hasBeak){
    super(name, breed, age, isMale,address);
}
public static Parrot getGreyParrotJako(String name, Breed breed, byte age, boolean isMale, Address address,boolean hasFeathers, boolean hasBeak){
    Breed greyParrotJako = new Breed("Grey Parrot Jako","noisy","A lot!");
    return new Parrot(name, greyParrotJako, age, isMale,address, hasFeathers, hasBeak);
}
    public void eat() {
        System.out.println("The house is getting messy!");
    }
    public void fly() {
        System.out.printf(" %s is flying all over the house!\n", super.getName());
    }
    public void speakAndSing() {
        System.out.printf("%s makes funny noisy sounds\n", super.getName());
    }
    public void play() {
        System.out.printf("%s is playing\n", super.getName());
    }
    public void play(String toy) {
        System.out.printf("%s is playing with %s\n", super.getName(), toy);
    }
}
