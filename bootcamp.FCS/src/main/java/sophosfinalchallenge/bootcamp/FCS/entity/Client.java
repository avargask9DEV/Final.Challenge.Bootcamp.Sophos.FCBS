package sophosfinalchallenge.bootcamp.FCS.entity;


import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.util.Date;

@Entity
@Table(name = "tbl.clients")
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "id_Type",length = 50,nullable = false)
    private String idType;

    @Column(name = "identification_Number",length = 30,nullable = false)
    private String identificationNumber;

    @Column(name = "names",length = 50,nullable = false)
    private String names;

    @Column(name = "last_names",length = 50,nullable = false)
    private String lastNames;

    @Column(name = "email",length = 50,nullable = false)
    private String email;

    @Column(name = "birth_Date",nullable = false)
    private Date birthDate;

    @Column(name = "created_at",nullable = false)
    @CreationTimestamp
    private Date CreationDate;



    @ManyToOne
    @JoinColumn (name = "created_by",nullable = false)
    private SystemUser userCreation; // Object---------


    @Column(name = "updated_at",nullable = false)
    @UpdateTimestamp
    private Date modificationDate;


    @ManyToOne
    @JoinColumn (name = "updated_by",nullable = false)
    private SystemUser userModification; // Object---------

    @ManyToOne
    @JoinColumn (name = "accountNumber")
    private Product accountNumber; // Object---------


    public Client() {
    }

    public Client(Long id, String idType, String identificationNumber, String names, String lastNames, String email, Date birthDate, Date creationDate, SystemUser userCreation, Date modificationDate, SystemUser userModification, Product accountNumber) {
        this.id = id;
        this.idType = idType;
        this.identificationNumber = identificationNumber;
        this.names = names;
        this.lastNames = lastNames;
        this.email = email;
        this.birthDate = birthDate;
        CreationDate = creationDate;
        this.userCreation = userCreation;
        this.modificationDate = modificationDate;
        this.userModification = userModification;
        this.accountNumber = accountNumber;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIdType() {
        return idType;
    }

    public void setIdType(String idType) {
        this.idType = idType;
    }

    public String getIdentificationNumber() {
        return identificationNumber;
    }

    public void setIdentificationNumber(String identificationNumber) {
        this.identificationNumber = identificationNumber;
    }

    public String getNames() {
        return names;
    }

    public void setNames(String names) {
        this.names = names;
    }

    public String getLastNames() {
        return lastNames;
    }

    public void setLastNames(String lastNames) {
        this.lastNames = lastNames;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public Date getCreationDate() {
        return CreationDate;
    }

    public void setCreationDate(Date creationDate) {
        CreationDate = creationDate;
    }

    public SystemUser getUserCreation() {
        return userCreation;
    }

    public void setUserCreation(SystemUser userCreation) {
        this.userCreation = userCreation;
    }

    public Date getModificationDate() {
        return modificationDate;
    }

    public void setModificationDate(Date modificationDate) {
        this.modificationDate = modificationDate;
    }

    public SystemUser getUserModification() {
        return userModification;
    }

    public void setUserModification(SystemUser userModification) {
        this.userModification = userModification;
    }

    public Product getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(Product accountNumber) {
        this.accountNumber = accountNumber;
    }
}
