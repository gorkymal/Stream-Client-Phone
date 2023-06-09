package org.example;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.experimental.FieldDefaults;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@Getter
@AllArgsConstructor
@FieldDefaults (level = AccessLevel.PRIVATE)
public class Client {
    Scanner scan = new Scanner(System.in);
    Integer id;
    String name;
    Integer age;
    List<Phone> listOfPhones;

    public Client(Integer id, String name, Integer age, List<Phone> listOfPhones) {
        this.id = scan.nextInt();
        this.name = scan.next();
        this.age = scan.nextInt();
        this.listOfPhones = scan.nextLine();
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", listOfPhones=" + listOfPhones +
                '}';
    }
}
