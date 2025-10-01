package com.pluralsight;

import java.util.Arrays;
import java.util.Scanner;

public class CellPhoneApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        CellPhone newPhone = new CellPhone();

        System.out.print("\nWhat is the serial number? ");
        int serialNumber = scanner.nextInt();
        newPhone.setSerialNumber(serialNumber);
        scanner.nextLine();

        System.out.print("\nWhat model is the Phone? ");
        String model = scanner.nextLine();
        newPhone.setModel(model);

        System.out.println("Who is the carrier?");
        String carrier = scanner.nextLine();
        newPhone.setCarrier(carrier);

        System.out.println("What is the phone number? ");
        String phoneNumber = scanner.nextLine();
        newPhone.setPhoneNumber(phoneNumber);

        System.out.println("Who is the owner of the phone? ");
        String owner = scanner.nextLine();
        newPhone.setOwner(owner);



        System.out.println("What is the serial number? " + newPhone.getSerialNumber());
        System.out.println("What model is the Phone? " + newPhone.getPhoneNumber());
        System.out.println("Who is the carrier?" + newPhone.getCarrier());
        System.out.println("What is the phone number? " + newPhone.getPhoneNumber());
        System.out.println("Who is the owner of the phone? " + newPhone.getOwner());



    }
}
