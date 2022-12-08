package sophosfinalchallenge.bootcamp.FCS.entity;


import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;

import java.util.Date;

@Entity
@Table(name = "tbl.products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;


    private String accountType;


    private Integer accountNumber;


    private String accountStatus;



    @ManyToOne
    @JoinColumn (name = "created_by",nullable = false)
    private SystemUser userCreation; // Object---------


    @Column(name = "created_at",nullable = false)
    @CreationTimestamp
    private Date CreationDate;

    @ManyToOne
    @JoinColumn(name = "updated_by",nullable = false)
    private SystemUser userModification; // Object---------


    public Product() {
    }

    public Product(Long id, String accountType, Integer accountNumber, String accountStatus, SystemUser userCreation, Date creationDate, SystemUser userModification) {
        this.id = id;
        this.accountType = accountType;
        this.accountNumber = accountNumber;
        this.accountStatus = accountStatus;
        this.userCreation = userCreation;
        CreationDate = creationDate;
        this.userModification = userModification;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public Integer getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(Integer accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountStatus() {
        return accountStatus;
    }

    public void setAccountStatus(String accountStatus) {
        this.accountStatus = accountStatus;
    }

    public SystemUser getUserCreation() {
        return userCreation;
    }

    public void setUserCreation(SystemUser userCreation) {
        this.userCreation = userCreation;
    }

    public Date getCreationDate() {
        return CreationDate;
    }

    public void setCreationDate(Date creationDate) {
        CreationDate = creationDate;
    }

    public SystemUser getUserModification() {
        return userModification;
    }

    public void setUserModification(SystemUser userModification) {
        this.userModification = userModification;
    }
}
