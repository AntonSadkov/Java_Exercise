package OwnConstructors;

public class OwnConstructors {
    public static void main(String[] args){

        Persons anton = new Persons();
        anton.DisplayInfo();

        Persons anna = new Persons("Anna");
        anna.DisplayInfo();

        Persons daniel = new Persons("Daniel", 25);
        daniel.DisplayInfo();
    }
}