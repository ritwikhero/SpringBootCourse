package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static <laptop> void main(String[] args) {
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

//        Laptop l1 = new Laptop();
//        l1.setLid(4);
//        l1.setBrand("Asus");
//        l1.setModel("Strixx");
//        l1.setRam(32);
////
//        Laptop l2 = new Laptop();
//        l2.setLid(2);
//        l2.setBrand("Dell");
//        l2.setModel("xps");
//        l2.setRam(32);

//        Laptop l3 = new Laptop();
//        l3.setLid(3);
//        l3.setBrand("Apple");
//        l3.setModel("M4 pro");
//        l3.setRam(128);
//
//        Alien  a1 = new Alien();
//        a1.setAid(101);
//        a1.setAname("Ritwik");
//        a1.setTech("Java");
//
//
//            Alien  a2 = new Alien();
//            a2.setAid(102);
//            a2.setAname("Gary");
//            a2.setTech("JS");
//
//
//            Alien  a3 = new Alien();
//            a3.setAid(103);
//            a3.setAname("Barry");
//            a3.setTech("Go");
//
//            a1.setLaptop(List.of(l1,l2));
//            a2.setLaptop(List.of(l1,l2,l3));
//            a3.setLaptop(List.of(l1));

//            l1.setAlien(List.of(a1,a2,a3));
//        l2.setAlien(List.of(a1,a2));
//        l3.setAlien(List.of(a2));
        SessionFactory sf = new Configuration()
                .addAnnotatedClass(org.example.Laptop.class)
                .configure()
                .buildSessionFactory();

        Session session = sf.openSession();
        Transaction transaction = session.beginTransaction();

//        session.persist(l1);
//        session.persist(l2);
//        session.persist(l3);

//        session.persist(a1);
//        session.persist(a2);
//        session.persist(a3);

//        transaction.commit();

//        Alien a5 = session.find(Alien.class,102);
//        System.out.println(a2);

//        select * form laptop where ram=32 -> SQL

//        from laptop where ram=32 -> HQL
        String brand = "Apple";
        Query query = session.createQuery("select model from Laptop where brand like ?1 ");
        query.setParameter(1, brand);
//        List<Laptop> laptops = query.getResultList();
        List<Object[]> brands = query.getResultList();

//        Laptop l5 = session.find(Laptop.class,4);
        for(Object[] data: brands){
            System.out.println((String)data[0]);
        }
//        System.out.println(brands);
        session.close();
        sf.close();

    }
}