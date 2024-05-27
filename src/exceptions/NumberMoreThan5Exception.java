package exceptions;

public class NumberMoreThan5Exception extends RuntimeException {

    public NumberMoreThan5Exception(int num) {
        System.out.println("Write a number in the range between 0 and 4. " + num + " is not a valid input");
    }
}
