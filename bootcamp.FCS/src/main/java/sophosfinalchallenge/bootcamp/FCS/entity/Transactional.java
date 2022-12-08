package sophosfinalchallenge.bootcamp.FCS.entity;


import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;

import java.util.Date;

@Entity
@Table(name = "tbl.transactions")
public class Transactional {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    private Double consignment;

    private Double Debit; // Retiro

    private Double transfer;

    @Column(name = "created_at")
    @CreationTimestamp
    private Date dateMove;

    @ManyToOne
    @JoinColumn (name = "created_by")
    private SystemUser userCreation; // Object---------


    public Transactional() {
    }

    public Transactional(Long id, Double consignment, Double debit, Double transfer, Date dateMove, SystemUser userCreation) {
        this.id = id;
        this.consignment = consignment;
        Debit = debit;
        this.transfer = transfer;
        this.dateMove = dateMove;
        this.userCreation = userCreation;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getConsignment() {
        return consignment;
    }

    public void setConsignment(Double consignment) {
        this.consignment = consignment;
    }

    public Double getDebit() {
        return Debit;
    }

    public void setDebit(Double debit) {
        Debit = debit;
    }

    public Double getTransfer() {
        return transfer;
    }

    public void setTransfer(Double transfer) {
        this.transfer = transfer;
    }

    public Date getDateMove() {
        return dateMove;
    }

    public void setDateMove(Date dateMove) {
        this.dateMove = dateMove;
    }

    public SystemUser getUserCreation() {
        return userCreation;
    }

    public void setUserCreation(SystemUser userCreation) {
        this.userCreation = userCreation;
    }

}
