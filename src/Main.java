import entities.Audio;
import entities.Image;
import entities.Media;
import entities.Video;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Media[] media = new Media[5];

        for (int i = 0; i < media.length; i++) {
            System.out.println("Media " + (i + 1) + ", " + "digita: 1 per Audio, 2 per Video, 3 per Immagine: ");
            int inputNum = Integer.parseInt(scanner.nextLine());
            switch (inputNum) {

                case 1:
                    System.out.println("Titolo: ");
                    String inputTitolo = scanner.nextLine();
                    System.out.println("Durata: ");
                    int inputDurata = Integer.parseInt(scanner.nextLine());
                    System.out.println("Volume: ");
                    int inputVolume = Integer.parseInt(scanner.nextLine());
                    media[i] = new Audio(inputTitolo, inputDurata, inputVolume);
                    break;

                case 2:
                    System.out.println("Titolo: ");
                    String inputTitolo2 = scanner.nextLine();
                    System.out.println("Durata: ");
                    int inputDurata2 = Integer.parseInt(scanner.nextLine());
                    System.out.println("Volume: ");
                    int inputVolume2 = Integer.parseInt(scanner.nextLine());
                    System.out.println("Luminosità: ");
                    int inputBright2 = Integer.parseInt(scanner.nextLine());
                    media[i] = new Video(inputTitolo2, inputDurata2, inputVolume2, inputBright2);
                    break;

                case 3:
                    System.out.println("Titolo: ");
                    String inputTitolo3 = scanner.nextLine();
                    System.out.println("Luminosità: ");
                    int inputBright3 = Integer.parseInt(scanner.nextLine());
                    media[i] = new Image(inputTitolo3, inputBright3);
                    break;
                default:
                    System.out.println("INSERISCI UN NUMERO VALIDO");
                    i--;
                    break;
            }
        }
        while (true) {
            System.out.println("Digita un numero da 1 a 5 per riprodurre il media associato, o digita 0 per uscire: ");
            int num = Integer.parseInt(scanner.nextLine());
            if (num == 0) break;
            if (num <= 5 && media[num - 1] != null) {
                media[num - 1].avvia();
            } else {
                System.out.println("INSERISCI UN NUMERO VALIDO");
            }
        }
        ;

    }
}

