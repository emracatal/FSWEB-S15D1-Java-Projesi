package com.workintech.mobile;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Contact> contactList=new ArrayList<>();
        MobilePhone phone=new MobilePhone("5555555555",contactList);
        phone.addNewContact(new Contact("Ali","12345"));
        phone.addNewContact(new Contact("Veli","12345"));
        phone.addNewContact(new Contact("Ali","123456"));
        phone.addNewContact(new Contact("Ayşe","1234567"));
        phone.addNewContact(new Contact("Ahmet","11111"));
        phone.printContact();
        System.out.println("Index Name "+phone.findContact("Ayşe"));
        System.out.println("Query contact "+phone.queryContact("Ayşe"));

    }
}
