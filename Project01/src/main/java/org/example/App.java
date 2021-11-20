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

        reimbursement.setReimbursement_amount(100);
        reimbursement.setReimbursement_resolved(true);
        reimbursement.setUser_id(1);
        reimbursement.setReimbursement_resolver(1);
        reimbursement.setReimbursement_statusID(2);
        reimbursement.setReimbursement_typeID(2);
        session.save(reimbursement);

        User user = new User();
        user.setUser_id(1);
        user.setUser_name("admin");
        user.setPassword("123");
        user.setFirst_name("Bugs");
        user.setLast_name("Bunny");
        user.setEmail("admin@admin.com");
        user.setRole_id(1);
        session.save(user);

        ReimbursementStatus reimbursementStatus = new ReimbursementStatus();
        reimbursementStatus.setReimbursement_status("Pending");
        reimbursementStatus.setReimbursement_status("Approved");
        reimbursementStatus.setReimbursement_status("Denied");
        session.save(reimbursementStatus);

        ReimbursementType reimbursementType = new ReimbursementType();
        reimbursementType.setReimbursement_type("Transport");
        reimbursementType.setReimbursement_type("Paper");
        reimbursementType.setReimbursement_type("Parking");
        session.save(reimbursementType);

        UserRole userRole = new UserRole();
        userRole.setUser_role("employee");
        userRole.setUser_role("manager");
        session.save(userRole);

        //commit the transaction
        transaction.commit();
        //close the session (connection)
        session.close();

    }

}
