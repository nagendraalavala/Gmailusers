package com.example.gmail;

import javax.persistence.*;

@Entity
@Table(name = "data")
public class GmailEntityMain
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private Integer id;

    @Column(name = "Name")
    private String Name;
    @Column(name = "Age")
    private Long age;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Long getAge() {
        return age;
    }

    public void setAge(Long age) {
        this.age = age;
    }

    public GmailEntityMain(Integer id, String name, Long age) {
        this.id = id;
        Name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "GmailEntity{" +
                "id=" + id +
                ", Name='" + Name + '\'' +
                ", age=" + age +
                '}';
    }

    public GmailEntityMain()
    {

    }
}
