package com.practise.app;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.practise.Entity.Feedbacks;
import com.practise.Utility.HibernateUtility;

public class UpdateComment {

    public void updateFeedback() {
       

        SessionFactory factory = HibernateUtility.getSessionFactory();
        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();

        System.out.println("Enter the ID of the feedback you want to update:");
        Scanner sc = new Scanner(System.in);
        int feedbackId = sc.nextInt();
        sc.nextLine(); // Consume newline left-over
        Feedbacks feedback = session.find(Feedbacks.class, feedbackId);

        System.out.println("Enter updated comments ");
      
        String feedback1 =  sc.nextLine(); 
        feedback.setComments(feedback1);

        transaction.commit();
        session.close();
        System.out.println("Feedback with ID " + feedbackId + " has been updated successfully.");
        System.out.println("Updated Feedback: " + feedback.toString());  


    }
    
}
