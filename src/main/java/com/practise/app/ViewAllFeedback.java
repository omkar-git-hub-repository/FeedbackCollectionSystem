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

        List<Feedbacks> feedbacklist = session.createQuery("Select f from Feedbacks f", Feedbacks.class)
                .getResultList();
        feedbacklist.stream().forEach(k -> System.out.println(k.toString()));

        transaction.commit();
        session.close();

    }
}
