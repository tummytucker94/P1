package org.example;

import javax.persistence.*;

@Entity
public class ReimbursementType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "reimbursement_typeId")
    private int reimbursement_typeId;
    @Column(name = "reimbursement_type")
    private String reimbursement_type;

    public ReimbursementType(){}

    public ReimbursementType(String reimbursement_type) {
        super();

        this.reimbursement_type = reimbursement_type;
    }

    public ReimbursementType(int reimbursement_typeId, String reimbursement_type) {
        super();
        this.reimbursement_typeId = reimbursement_typeId;
        this.reimbursement_type = reimbursement_type;
    }

    public int getReimbursement_typeId() {
        return reimbursement_typeId;
    }

    public void setReimbursement_typeId(int reimbursement_typeId) {
        this.reimbursement_typeId = reimbursement_typeId;
    }

    public String getReimbursement_type() {
        return reimbursement_type;
    }

    public void setReimbursement_type(String reimbursement_type) {
        this.reimbursement_type = reimbursement_type;
    }

    @Override
    public String toString() {
        return "ReimbursementType{" +
                "reimbursement_typeId=" + reimbursement_typeId +
                ", reimbursement_type='" + reimbursement_type + '\'' +
                '}';
    }
}
