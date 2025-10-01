package com.pluralsight;

import java.util.Arrays;
import java.util.Scanner;

public class CellPhoneApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        CellPhone newPhone = new CellPhone();

        System.out.print("What is the serial number? " + newPhone.getSerialNumber());
        System.out.print("What model is the Phone? " + newPhone.getPhoneNumber());
        System.out.print("Who is the carrier?" + newPhone.getCarrier());
        System.out.print("");



//        myPhone.setPhoneNumber("");
//        System.out.println(myPhone.getPhoneNumber());

    }
}
