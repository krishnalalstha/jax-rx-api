package com.krish.web.model;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by krishna on 6/21/17.
 */

@XmlRootElement
public class Developer {
    long id;
    String name;
    String position;
    String salary;

    public Developer() {
    }

    public Developer(long id, String name, String position, String salary) {
        this.id = id;
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }
}
