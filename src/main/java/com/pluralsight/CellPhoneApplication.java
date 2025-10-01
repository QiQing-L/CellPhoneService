package com.pluralsight;

import java.util.Arrays;
import java.util.Scanner;

public class CellPhoneApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        CellPhone newPhone = new CellPhone();

        System.out.println("What is the serial number? " + newPhone.getSerialNumber());
        System.out.println("What model is the Phone? " + newPhone.getPhoneNumber());
        System.out.println("Who is the carrier?" + newPhone.getCarrier());
        System.out.println("What is the phone number? " + newPhone.getPhoneNumber());
        System.out.println("Who is the owner of the phone? " + newPhone.getOwner());







    }
}
