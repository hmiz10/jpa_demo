package be.intecbrussel.jpademo.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;


@Entity
public class Person {
    @Id
    private int id;
    private String firstName;
    private String lastname;
    private int age;
    private String address;

    public Person() {
    }

    public Person(String firstName, String lastname, int age, String address) {
        this.firstName = firstName;
        this.lastname = lastname;
        this.age = age;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return id == person.id &&
                age == person.age &&
                firstName.equals(person.firstName) &&
                lastname.equals(person.lastname) &&
                address.equals(person.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, lastname, age, address);
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastname='" + lastname + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }
}
