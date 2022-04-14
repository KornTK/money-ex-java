package test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        String filePath = "D:/Progarmming/NonP1/Project6330611030/Project6330611030/money-ex-java/src/User.txt";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your username: ");
        String username = scanner.nextLine();
        System.out.println("Checking to see if username exists...");
        BufferedReader bufferedReader;
        try {
            bufferedReader = new BufferedReader(new FileReader(filePath));
            String line;
            boolean usernamenotExists = false;
            while((line = bufferedReader.readLine()) != null) {
                if (line.equals(username)) {
                    usernamenotExists = true;
                    break;
                }
            }
            if (usernamenotExists) {
                System.out.println("Hi."+username);
            } else {
                System.out.println("No found!");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}