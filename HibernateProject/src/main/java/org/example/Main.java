package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        Student s1 = new Student();
////        s1.setRollNo(23);
////        s1.setsName("Murari");
////        s1.setsAge(25);
//
//        //        Configuration cfg = new Configuration();
////        cfg.addAnnotatedClass(org.example.Student.class);
////        cfg.configure();
//
//        SessionFactory sf = new Configuration()
//                .addAnnotatedClass(org.example.Student.class)
//                .configure()
//                .buildSessionFactory();
//
//        Session session = sf.openSession();
//        Transaction transaction = session.beginTransaction();
//        s1 = session.find(Student.class,23);
//        session.remove(s1);
//        transaction.commit();
//
//        //fetching data
////        Student s2 = session.find(Student.class,4);
////        sf.close();
//        System.out.println(s1);

        Laptop l1 = new Laptop();
        l1.setLid(1);
        l1.setBrand("Asus");
        l1.setModel("ROG");
        l1.setRam(32);

        Laptop l2 = new Laptop();
        l2.setLid(2);
        l2.setBrand("Dell");
        l2.setModel("xps");
        l2.setRam(32);

        Alien  a1 = new Alien();
        a1.setAid(101);
        a1.setAname("Ritwik");
        a1.setTech("Java");
        a1.setLaptop(List.of(l1,l2));

        l1.setAlien(a1);
        l2.setAlien(a1);

        SessionFactory sf = new Configuration()
                .addAnnotatedClass(org.example.Alien.class)
                .addAnnotatedClass(org.example.Laptop.class)
                .configure()
                .buildSessionFactory();

        Session session = sf.openSession();
        Transaction transaction = session.beginTransaction();

        session.persist(l1);
        session.persist(l2);
        session.persist(a1);
        transaction.commit();

        Alien a2 = session.find(Alien.class,101);
        System.out.println(a2);

        session.close();
        sf.close();

    }
}