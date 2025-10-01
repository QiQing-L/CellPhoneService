package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        CellPhone myPhone = new CellPhone();

        System.out.println(myPhone.getPhoneNumber());
        System.out.println();

        myPhone.setPhoneNumber("");
        System.out.println(myPhone.getPhoneNumber());

    }
}
