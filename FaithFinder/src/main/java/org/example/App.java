package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class App {
    //set variables here
    private final Scanner userInput = new Scanner(System.in);
    //private List<String> states = new ArrayList<>();
    private List<String> churches = new ArrayList<>();
    private Church church;

    public static void main(String[] args) {
        App app = new App();
        app.initialize();
        app.run();
    }

    private void initialize() {
        File dataFile = new File("src/main/resources/ChurchRegister");

        try (Scanner dataInput = new Scanner(dataFile)) {
            while (dataInput.hasNextLine()) {
                String lineOfInput = dataInput.nextLine();
                church = new Church(lineOfInput);
                //System.out.println(church.toString() + "\n");
            }
        } catch (FileNotFoundException e) {
            System.err.println(dataFile + " does not exist.");
        }
    }

    private void run() {
        displaySearchResults(loadMap());
    }

    private List<String> loadMap() {
        List<String> states = new ArrayList<>();
        states.add("Ohio");

        return states;
    }

    private void displaySearchResults(List<String> searchResults) {
        System.out.println(searchResults.get(0));
    }


}