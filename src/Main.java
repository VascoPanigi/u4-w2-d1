import exceptions.NumberMoreThan5Exception;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Main {
    private static Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {

//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Insert a string and I'll count the number of 'A' in it. ");
//
//        String sentence = scanner.nextLine();
//
//        for (int i = 0; i < sentence.length(); i++) {
//            char c = sentence.charAt(i);
//            if (c == 'a') {
//                System.out.println(c);
//            }
//        }
//
//        scanner.close();

        int[] newArray = new int[5];

        Random random = new Random();

        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = random.nextInt(1, 10);
        }

        System.out.println(Arrays.toString(newArray));
        while (true) {
            Scanner scanner = new Scanner(System.in);

            try {
                System.out.println("Choose a number. Type 0 to get the * out.");
                int newNumber = Integer.parseInt(scanner.nextLine());

                if (newNumber == 0) {
                    logger.info("You got the * out");
                    break;
                }

                System.out.println("Choose its position.");
                int numberPosition = Integer.parseInt(scanner.nextLine());

                if (numberPosition < 0 || numberPosition >= newArray.length) {
                    throw new NumberMoreThan5Exception(numberPosition);
                }

                System.out.println("daje");

                newArray[numberPosition] = newNumber;
                System.out.println("There you go, happy now?");
                logger.info("Happy gabibbo");
                System.out.println(Arrays.toString(newArray));

            } catch (InputMismatchException ex) {
                logger.error("This is not a number!");
            } finally {
                scanner.close();
            }
        }
    }
}