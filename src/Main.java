import java.util.Scanner;

public class Main {

            public static void main(String[] args) {
                Scanner input = new Scanner(System.in);
                System.out.println("Please insert your name");
                String name = input.next();
                System.out.println("Hello" + name + "" + "Pleasse insert your saving amount");
                double savingAmount = input.nextDouble();
                if (savingAmount > 280_000) {
                    System.out.println("Are you included on the previous registration");
                    String previousRegistration = input.next();

                    System.out.println("Do you have criminal record?");
                    String record = input.next();

                    if (record.equalsIgnoreCase("yes") && previousRegistration.equalsIgnoreCase("yes")) {
                        System.out.println("You are in the condominium lot list");
                    }

                    if (record.equalsIgnoreCase("no") && previousRegistration.equalsIgnoreCase("no")) {
                        System.out.println(" Congradulation! You are in the condominium lot list");
                    } else if (record.equalsIgnoreCase("yes") && previousRegistration.equalsIgnoreCase("no")) {
                        System.out.println("Sorry you are not in the condominium lot list");
                    }
                } else {
                    System.out.println("Sorry, Your saving amount is not enough");
                }


            }
        }

