package com.practise.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.practise.Utility.HibernateUtility;

/**
 * Hello world!
 *
 */
<<<<<<< HEAD
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        SessionFactory factory = HibernateUtility.getSessionFactory();
        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();

        AddFeedback addFeedback = new AddFeedback();
        addFeedback.addFeedback();

        session.persist(addFeedback);
        transaction.commit();
        session.close();

=======
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
>>>>>>> ea6fb4453f697992cc63e85610e108971587a739
    }
}
