package hello;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Person {


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getEmailId() {
        return emailId;
    }

    @Id
    @GeneratedValue
    private int id;
    private String name;
    private int age;
    private String emailId;

    // required by jackson
    public Person() { }

    public Person(String name, int age, String emailId) {
        this.name = name;
        this.age = age;
        this.emailId = emailId;
    }
//getters and setters
}
