package org.example;

import javax.persistence.*;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.sql.Blob;
import java.sql.Timestamp;

@Entity
public class Reimbursement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "reimbursement_id", updatable = false, nullable = false)
    private int reimbursement_id;
    @Column(name="reimbursement_amount")
    private int reimbursement_amount;
    @Column(name="reimbursement_submitted")
    private Timestamp reimbursement_submitted;
    @Column(name="reimbursement_resolved")
    private Timestamp reimbursement_resolved;
    @Column(name="reimbursement_description")
    private String reimbursement_description;
    @Column(name="reimbursement_receipt")
    private Blob reimbursement_receipt;
    @Column(name="reimbursement_author")
    private int reimbursement_author;
    @Column(name="reimbursement_resolver")
    private int reimbursement_resolver;
    @Column(name="reimbursement_statusId")
    private int reimbursement_statusId;
    @Column(name="reimbursement_typeId")
    private int reimbursement_typeId;

    public Reimbursement(){}

    public Reimbursement(int reimbursement_amount, Timestamp reimbursement_submitted, Timestamp reimbursement_resolved, String reimbursement_description, Blob reimbursement_receipt, int reimbursement_author, int reimbursement_resolver, int reimbursement_statusId, int reimbursement_typeId) {
        super();

        this.reimbursement_amount = reimbursement_amount;
        this.reimbursement_submitted = reimbursement_submitted;
        this.reimbursement_resolved = reimbursement_resolved;
        this.reimbursement_description = reimbursement_description;
        this.reimbursement_receipt = reimbursement_receipt;
        this.reimbursement_author = reimbursement_author;
        this.reimbursement_resolver = reimbursement_resolver;
        this.reimbursement_statusId = reimbursement_statusId;
        this.reimbursement_typeId = reimbursement_typeId;
    }

    public Reimbursement(int reimbursement_id, int reimbursement_amount, Timestamp reimbursement_submitted, Timestamp reimbursement_resolved, String reimbursement_description, Blob reimbursement_receipt, int reimbursement_author, int reimbursement_resolver, int reimbursement_statusId, int reimbursement_typeId) {
        super();
        this.reimbursement_id = reimbursement_id;
        this.reimbursement_amount = reimbursement_amount;
        this.reimbursement_submitted = reimbursement_submitted;
        this.reimbursement_resolved = reimbursement_resolved;
        this.reimbursement_description = reimbursement_description;
        this.reimbursement_receipt = reimbursement_receipt;
        this.reimbursement_author = reimbursement_author;
        this.reimbursement_resolver = reimbursement_resolver;
        this.reimbursement_statusId = reimbursement_statusId;
        this.reimbursement_typeId = reimbursement_typeId;
    }

    public int getReimbursement_id() {
        return reimbursement_id;
    }

    public void setReimbursement_id(int reimbursement_id) {
        this.reimbursement_id = reimbursement_id;
    }

    public int getReimbursement_amount() {
        return reimbursement_amount;
    }

    public void setReimbursement_amount(int reimbursement_amount) {
        this.reimbursement_amount = reimbursement_amount;
    }

    public Timestamp getReimbursement_submitted() {
        return reimbursement_submitted;
    }

    public void setReimbursement_submitted(Timestamp reimbursement_submitted) {
        this.reimbursement_submitted = reimbursement_submitted;
    }

    public Timestamp getReimbursement_resolved() {
        return reimbursement_resolved;
    }

    public void setReimbursement_resolved(Timestamp reimbursement_resolved) {
        this.reimbursement_resolved = reimbursement_resolved;
    }

    public String getReimbursement_description() {
        return reimbursement_description;
    }

    public void setReimbursement_description(String reimbursement_description) {
        this.reimbursement_description = reimbursement_description;
    }

    public Blob getReimbursement_receipt() {
        return reimbursement_receipt;
    }

    public void setReimbursement_receipt(Blob reimbursement_receipt) {
        this.reimbursement_receipt = reimbursement_receipt;
    }

    public int getReimbursement_author() {
        return reimbursement_author;
    }

    public void setReimbursement_author(int reimbursement_author) {
        this.reimbursement_author = reimbursement_author;
    }

    public int getReimbursement_resolver() {
        return reimbursement_resolver;
    }

    public void setReimbursement_resolver(int reimbursement_resolver) {
        this.reimbursement_resolver = reimbursement_resolver;
    }

    public int getReimbursement_statusID() {
        return reimbursement_statusId;
    }

    public void setReimbursement_statusID(int reimbursement_statusID) {
        this.reimbursement_statusId = reimbursement_statusID;
    }

    public int getReimbursement_typeID() {
        return reimbursement_typeId;
    }

    public void setReimbursement_typeID(int reimbursement_typeID) {
        this.reimbursement_typeId = reimbursement_typeID;
    }

    @Override
    public String toString() {
        return "Reimbursement{" +
                "reimbursement_id=" + reimbursement_id +
                ", reimbursement_amount=" + reimbursement_amount +
                ", reimbursement_submitted=" + reimbursement_submitted +
                ", reimbursement_resolved=" + reimbursement_resolved +
                ", reimbursement_description='" + reimbursement_description + '\'' +
                ", reimbursement_receipt=" + reimbursement_receipt +
                ", reimbursement_author=" + reimbursement_author +
                ", reimbursement_resolver=" + reimbursement_resolver +
                ", reimbursement_statusID=" + reimbursement_statusId +
                ", reimbursement_typeID=" + reimbursement_typeId +
                '}';
    }
}
