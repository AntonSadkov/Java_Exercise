package KeywordThis;

public class KeywordThis {
    public static void main(String[] args){

        ThisPerson anton = new ThisPerson();
        anton.DisplayInfo();

        ThisPerson anna = new ThisPerson("Anna");
        anna.DisplayInfo();

        ThisPerson daniel = new ThisPerson("Daniel", 25);
        daniel.DisplayInfo();
    }
}