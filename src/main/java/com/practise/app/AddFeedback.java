package com.practise.app;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.practise.Entity.Feedbacks;
import com.practise.Utility.HibernateUtility;

public class AddFeedback {

    public void addFeedback() {

         SessionFactory factory = HibernateUtility.getSessionFactory();
        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();
        
        Feedbacks f = new Feedbacks();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your feedback:");

        System.out.println("Enter your User ID : ");
        f.setId(sc.nextInt());
        sc.nextLine(); // Consume newline left-over

        System.out.println("Enter your name : ");
        f.setUserName(sc.nextLine());

        System.out.println("Enter your Email : ");
        f.setEmail(sc.nextLine());

        System.out.println("Enter Comments : ");
        f.setComments(sc.nextLine());

        System.out.println("Enter Rating : ");
        f.setRating(sc.nextInt());
        sc.nextLine(); // Consume newline left-over


        
        transaction.commit();
        session.close();

    }
    
}
