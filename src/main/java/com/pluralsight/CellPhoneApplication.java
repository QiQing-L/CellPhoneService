package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        CellPhone newPhone = new CellPhone();
        CellPhone cellPhone1 = new CellPhone();

        // prompt user input for newPhone:
        System.out.print("What is the serial number? ");
        int serialNumber = scanner.nextInt();
        newPhone.setSerialNumber(serialNumber);
        scanner.nextLine();

        System.out.print("What model is the Phone? ");
        String model = scanner.nextLine();
        newPhone.setModel(model);

        System.out.print("Who is the carrier? ");
        String carrier = scanner.nextLine();
        newPhone.setCarrier(carrier);

        System.out.print("What is the phone number? ");
        String phoneNumber = scanner.nextLine();
        newPhone.setPhoneNumber(phoneNumber);

        System.out.print("Who is the owner of the phone? ");
        String owner = scanner.nextLine();
        newPhone.setOwner(owner);

        // print cell phone properties:
        System.out.println("Cell Phone Details: ");
        System.out.println("Serial number: " + newPhone.getSerialNumber());
        System.out.println("Model: " + newPhone.getModel());
        System.out.println("Carrier: " + newPhone.getCarrier());
        System.out.println("Phone number: " + newPhone.getPhoneNumber());
        System.out.println("Owner: " + newPhone.getOwner());

        // prompt user input for cellPhone1:
        System.out.print("What is the serial number? ");
        int serialNumber = scanner.nextInt();
        cellPhone1.setSerialNumber(serialNumber);
        scanner.nextLine();

        System.out.print("What model is the Phone? ");
        String model = scanner.nextLine();
        cellPhone1.setModel(model);

        System.out.print("Who is the carrier? ");
        String carrier = scanner.nextLine();
        cellPhone1.setCarrier(carrier);

        System.out.print("What is the phone number? ");
        String phoneNumber = scanner.nextLine();
        cellPhone1.setPhoneNumber(phoneNumber);

        System.out.print("Who is the owner of the phone? ");
        String owner = scanner.nextLine();
        cellPhone1.setOwner(owner);

        // print cell phone properties:
        System.out.println("Cell Phone Details: ");
        System.out.println("Serial number: " + cellPhone1.getSerialNumber());
        System.out.println("Model: " + cellPhone1.getModel());
        System.out.println("Carrier: " + cellPhone1.getCarrier());
        System.out.println("Phone number: " + cellPhone1.getPhoneNumber());
        System.out.println("Owner: " + cellPhone1.getOwner());

        scanner.close();

        newPhone.dial("855-55-2222");
        cellPhone1.dial();




    }
    public static void display(CellPhone phone){
        System.out.println("==============Exercise 2=================");




    }
}
