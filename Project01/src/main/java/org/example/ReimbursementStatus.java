package org.example;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
//@Table(name = "ReimbursementStatus")
public class ReimbursementStatus {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "reimbursement_statusId")
    private int reimbursement_statusId;;

    private String reimbursement_status;

    @OneToMany(mappedBy = "reimbursementStatus", cascade = CascadeType.ALL)
    private List<Reimbursement> reimbursementList = new ArrayList<Reimbursement>();

    public ReimbursementStatus(){}

    public ReimbursementStatus(String reimbursement_status) {
        super();
        this.reimbursement_status = reimbursement_status;
    }

    public ReimbursementStatus(int reimbursement_statusId, String reimbursement_status) {
        super();
        this.reimbursement_statusId = reimbursement_statusId;
        this.reimbursement_status = reimbursement_status;
    }

    public int getReimbursement_statusId() {
        return reimbursement_statusId;
    }

    public void setReimbursement_statusId(int reimbursement_statusId) {
        this.reimbursement_statusId = reimbursement_statusId;
    }

    public String getReimbursement_status() {
        return reimbursement_status;
    }

    public void setReimbursement_status(String reimbursement_status) {
        this.reimbursement_status = reimbursement_status;
    }

    @Override
    public String toString() {
        return "ReimbursementStatus{" +
                "reimbursement_statusId=" + reimbursement_statusId +
                ", reimbursement_status='" + reimbursement_status + '\'' +
                '}';
    }
}
