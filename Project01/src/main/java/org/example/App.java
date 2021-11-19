package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Project Started..." );

        //create configuration object
        Configuration cfg = new Configuration();

        //read config and load in the object
        cfg.configure("hibernate.cfg.xml");

        //create factory
        SessionFactory sessionFactory = cfg.buildSessionFactory();

        //open the session
        Session session = sessionFactory.openSession();

        //begin the transaction
        Transaction transaction = session.beginTransaction();

        //create employee
        Reimbursement reimbursement = new Reimbursement();
        reimbursement.setReimbursement_id(1);
        reimbursement.setReimbursement_amount("75");
        reimbursement.setReimbursement_submitted("Anto@nio.com");
    }
}
