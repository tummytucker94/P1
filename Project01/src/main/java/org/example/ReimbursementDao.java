package org.example;

import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class ReimbursementDao {

    public void saveReimbursement(Reimbursement reimbursement) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            // start a transaction
            transaction = session.beginTransaction();
            // save the object
            session.saveOrUpdate(reimbursement);
            // commit transaction
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

    public void updateReimbursement(Reimbursement reimbursement) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            // start a transaction
            transaction = session.beginTransaction();
            // save the object
            session.update(reimbursement);
            // commit transaction
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

    public Reimbursement getReimbursementById(int id) {

        Transaction transaction = null;
        Reimbursement reimbursement = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            // start a transaction
            transaction = session.beginTransaction();
            // get an object
            reimbursement = session.get(Reimbursement.class, id);
            // commit transaction
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
        return reimbursement;
    }

    @SuppressWarnings("unchecked")
    public List< Reimbursement > getAllReimbursement() {

        Transaction transaction = null;
        List < Reimbursement > reimbursementList = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            // start a transaction
            transaction = session.beginTransaction();
            // get an object

            reimbursementList = session.createQuery("from reimbursement").getResultList();

            // commit transaction
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
        return reimbursementList;
    }

}
