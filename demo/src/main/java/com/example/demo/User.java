package com.example.demo;

import javax.validation.constraints.NotNull;
import java.util.Objects;

//TODO:Figure out what is req for this annotation
//@Entity
public class User extends AbstractEntity {

    //TODO: Review @Column annotations
    @NotNull
    //@Column (unique = true, length = 45)
    private String email;

    @NotNull
    //@Column (unique = true, length = 10)
    private String displayName;

    @NotNull
    //@Column (length = 64)
    private String password;

    @NotNull
    //@Column (name = "first_name")
    private String firstName;

    @NotNull
    //@Column (name = "last_name")
    private String lastName;

    //TODO: Research dependencies for import for this, then add to constructor
//    @NotNull
//    private String pwHash;
//
//    private static final BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();

    public User(String email, String displayName, String password, String firstName, String lastName) {
        this.email = email;
        this.displayName = displayName;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public User (){
        //empty constructor
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        if (!super.equals(o)) return false;
        User user = (User) o;
        return getEmail().equals(user.getEmail()) && getDisplayName().equals(user.getDisplayName()) && getPassword().equals(user.getPassword()) && getFirstName().equals(user.getFirstName()) && getLastName().equals(user.getLastName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getEmail(), getDisplayName(), getPassword(), getFirstName(), getLastName());
    }

    //TODO: Finish toString Method
//    @Override
//    public String toString() {
//        return User +
//                "email='" + email + '\'' +
//                ", displayName='" + displayName + '\'' +
//                ", password='" + password + '\'' +
//                ", firstName='" + firstName + '\'' +
//                ", lastName='" + lastName + '\'' +;
//    }

//    public boolean isMatchingPassword(String password) {
//        return encoder.matches(password, pwHash);
//    }
}
