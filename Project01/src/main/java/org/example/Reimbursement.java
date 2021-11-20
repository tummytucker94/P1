package org.example;

import javax.persistence.*;

@Entity
@Table (name = "Reimbursement")
public class Reimbursement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "reimbursement_id", updatable = false, nullable = false)
    private int reimbursement_id;

    private int reimbursement_amount;


    private boolean reimbursement_resolved;


    private int user_id;



    private int reimbursement_resolver;


    private int reimbursement_statusId;


    private int reimbursement_typeId;

    @ManyToOne
    @JoinColumn(name = "FK_user_id")
    private User user;


    @ManyToOne
    @JoinColumn(name = "FK_status_id")
    private ReimbursementStatus reimbursementStatus;

    @ManyToOne
    @JoinColumn(name = "FK_type_id")
    private ReimbursementType reimbursementType;

//    @ManyToOne
//    @JoinColumn(name = "role_id")
//    private User user;

    public Reimbursement(){}

    public Reimbursement(int reimbursement_amount, boolean reimbursement_resolved, int user_id, int reimbursement_resolver, int reimbursement_statusId, int reimbursement_typeId) {
        super();

        this.reimbursement_amount = reimbursement_amount;

        this.reimbursement_resolved = reimbursement_resolved;

        this.user_id = user_id;
        this.reimbursement_resolver = reimbursement_resolver;
        this.reimbursement_statusId = reimbursement_statusId;
        this.reimbursement_typeId = reimbursement_typeId;
    }

    public Reimbursement(int reimbursement_id, int reimbursement_amount, boolean reimbursement_resolved, int user_id, int reimbursement_resolver, int reimbursement_statusId, int reimbursement_typeId) {
        super();
        this.reimbursement_id = reimbursement_id;
        this.reimbursement_amount = reimbursement_amount;

        this.reimbursement_resolved = reimbursement_resolved;

        this.user_id = user_id;
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


    public boolean getReimbursement_resolved() {
        return reimbursement_resolved;
    }

    public void setReimbursement_resolved(boolean reimbursement_resolved) {
        this.reimbursement_resolved = reimbursement_resolved;
    }


    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
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
                ", reimbursement_resolved=" + reimbursement_resolved +
                ", user_id=" + user_id +
                ", reimbursement_resolver=" + reimbursement_resolver +
                ", reimbursement_statusId=" + reimbursement_statusId +
                ", reimbursement_typeId=" + reimbursement_typeId +
                '}';
    }
}
