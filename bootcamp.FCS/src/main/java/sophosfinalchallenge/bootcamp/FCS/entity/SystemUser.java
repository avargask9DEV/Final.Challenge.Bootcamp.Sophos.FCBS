package sophosfinalchallenge.bootcamp.FCS.entity;


import jakarta.persistence.*;

@Entity
@Table(name="tbl.systemUser")
public class SystemUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "usermane")
    private String username;

    @Column(name = "password")
    private String password;

    public SystemUser() {
    }

    public SystemUser(Long id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}



