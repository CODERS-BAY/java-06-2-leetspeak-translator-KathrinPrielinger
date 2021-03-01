import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        String[] arrayLetters = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "x"};
        String[] arraySymbols = {"@", "8", "(", "D", "3", "F", "6", "#", "!", "J", "K", "1", "M", "N", "O", "P", "Q", "R", "$", "7", "U", "V", "W", "X", "Y", "2"};

        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        System.out.println(name);

        for (int i = 0; i < arrayLetters.length; i++) {

            //String name = "q";

            if (name.equals(arrayLetters[i])) {

                String switcher = name;
                System.out.println(switcher);
                System.out.println("Das Symbol zur Variable name: " + name + " lautet: " + arraySymbols[i]);
            }
        }
    }
}



/*
        boolean finish = false;

        while (finish == false) {

            finish = true;

            for (int j = 0; j < arrayLetters.length; j++) {

                String letter = arrayLetters[j];
                String symbol = arraySymbols[j];
                System.out.println(symbol + letter);
            }



        }
    }
}

boolean finish = scanner.hasNext(String.valueOf(0)); //Abbruchbedingung: Wenn 0 auf der Konsole eingetippt wird entspricht es dem Wert finish - true - Schleife wird beendet
        //Wenn eine andere Zahl von der while-Schleife eingegeben wird ist der Wert false und Scheife rennt weiter

 */