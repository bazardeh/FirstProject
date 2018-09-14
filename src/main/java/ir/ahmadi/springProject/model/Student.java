package ir.ahmadi.springProject.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "Student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotNull
    @Size(max = 100)
    @Column(name = "name", nullable = false)
    private String name;

    private String lastname;
    private String adress;

    public Student() {
    }

    public Student(Long id, String name, String adress, String lastname) {
        this.id = id;
        this.adress = adress;
        this.name = name;
        this.lastname = lastname;
    }

    public Student(String name, String lastname, String adress) {
        this.adress = adress;
        this.name = name;
        this.lastname = lastname;
    }

    public Student(String name, String lastname) {
        this.name = name;
        this.lastname = lastname;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format("Student [id=%s, name=%s, lastname=%s,adress=%s]", id, name, lastname, adress);
    }
}
