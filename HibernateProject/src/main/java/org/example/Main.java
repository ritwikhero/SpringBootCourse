package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

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
        l1.setBrand("asus");
        l1.setModel("ROG");
        l1.setRam(32);

        Alien  a1 = new Alien();
        a1.setAid(101);
        a1.setAname("Ritwik");
        a1.setTech("Java");
        a1.setLaptop(l1);

        SessionFactory sf = new Configuration()
                .addAnnotatedClass(org.example.Alien.class)
                .configure()
                .buildSessionFactory();

        Session session = sf.openSession();
        Transaction transaction = session.beginTransaction();

        session.persist(a1);
        transaction.commit();

        session.close();
        sf.close();

    }
}