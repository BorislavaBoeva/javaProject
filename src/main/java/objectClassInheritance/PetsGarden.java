package objectClassInheritance;

public class PetsGarden {
    public static void main(String[] args) {
        //Variables
        Breed greyParrot = new Breed("Jako","talkative", "Several");
        Address greyParrotAddress = new Address("Bulgaria", "Plovdiv",4000);
        Parrot jako1 = Parrot.getGreyParrotJako("Jack",greyParrot,(byte) 7,true,greyParrotAddress,true,true);
        Parrot jako2 = Parrot.getGreyParrotJako("Lady",greyParrot, (byte) 6, false,greyParrotAddress,true,true);

        //methods actions
        jako1.eat();
        jako2.eat();

        jako1.play();
        jako1.play("ball");
        jako2.play();
        jako2.play("mirror");

        jako1.fly();
        jako2.fly();

        jako1.speakAndSing();
        jako2.speakAndSing();

        jako1.printData();
        jako2.printData();
   }
}
