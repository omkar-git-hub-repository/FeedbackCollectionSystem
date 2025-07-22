package com.practise.app;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.practise.Entity.Feedbacks;
import com.practise.Utility.HibernateUtility;

public class DeleteByID {
    
    public void deleteFeedbackById(){

        SessionFactory factory = HibernateUtility.getSessionFactory();
        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();


        System.out.println("\nEnter the ID of the feedback you want to delete:");
        Scanner sc = new Scanner(System.in);
        int feedbackId = sc.nextInt();
        sc.nextLine(); // Consume newline left-over

        Feedbacks feedbackID = session.find(Feedbacks.class, feedbackId);
        session.remove(feedbackID);
        
        transaction.commit();
        session.close();


    }


}
