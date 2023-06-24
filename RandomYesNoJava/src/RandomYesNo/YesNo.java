package RandomYesNo;

import java.util.Random;
public class YesNo {
    public static void main(String[] args) {

        String[] texts = {"Да", "Нет", "Да", "Нет"};
        Random random = new Random ();
        int pos = random.nextInt(texts.length);
        System.out.print(texts[pos]);
    }
}