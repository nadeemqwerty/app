package com.nadeem.app.model;

import javax.persistence.*;

@Entity
@Table(name="employees")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name="first_name")
    private String firstName;

    @Column(name="last_name")
    private String lastName;

    @Column(name="email")
    private String email;

    public Employee() {
        super();
    }

    public Employee(String firstName, String lastName, String email) {
        super();
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    /**
     * get field
     *
     * @return id
     */
    public long getId() {
        return this.id;
    }

    /**
     * set field
     *
     * @param id
     */
    public void setId(long id) {
        this.id = id;
    }

    /**
     * get field
     *
     * @return firstName
     */
    public String getFirstname() {
        return this.firstName;
    }

    /**
     * set field
     *
     * @param firstName
     */
    public void setFirstname(String firstName) {
        this.firstName = firstName;
    }

    /**
     * get field
     *
     * @return lastName
     */
    public String getLastname() {
        return this.lastName;
    }

    /**
     * set field
     *
     * @param lastName
     */
    public void setLastname(String lastName) {
        this.lastName = lastName;
    }

    /**
     * get field
     *
     * @return email
     */
    public String getEmail() {
        return this.email;
    }

    /**
     * set field
     *
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }
}
