package com.practise.app;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.practise.Entity.Feedbacks;
import com.practise.Utility.HibernateUtility;

public class ViewAllFeedback {

    public void viewFeedback() {

        SessionFactory factory = HibernateUtility.getSessionFactory();
        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();

        // Assuming Feedbacks is an entity class mapped to a database table
        List<Feedbacks> feedbackList = session.createQuery("Select f FROM Feedbacks f", Feedbacks.class}.getResultList();
        
}
