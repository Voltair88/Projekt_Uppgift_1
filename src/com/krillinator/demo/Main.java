package com.krillinator.demo;

public class Main {
    public static void main(String[] args) {

        int[] myScore = { 0, 15, 100 };
        Student anton = new Student(13, 130213);
        anton.printDetails();

        for (int i = 0; i < 3; i++) {
            System.out.println("My score is: " + myScore[i]);
        }
        // TODO - What is an algorithm?
        // When you're done, send in a PDF-document explaining what an algorithm is!
        // TODO - Once the code is fixed without errors and functions are running as
        // intended. As well as DRY!
        // Zip the project and send it in on STI (you can set it up on GitHub too)
    }
}
