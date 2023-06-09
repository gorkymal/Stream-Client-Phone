package org.example;

import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        Client client = null;
        Phone phone = null;

        System.out.print("How many users are there? Type: ");
        for (int i = 0; i < scan.nextInt(); i++) {
            client = new Client(scan.nextInt(), scan.next(), scan.nextInt(), scan.nextLine());
        }




















