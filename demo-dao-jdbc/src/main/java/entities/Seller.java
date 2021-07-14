package entities;

import java.util.Date;

public class Seller {

    private Integer id;
    private String name;
    private  String email;
    private Date  birthday;
    private Double baseSalary;

    public Seller() {
    }

    public Seller(Integer id, String name, String email, Date birthday, Double baseSalary) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.birthday = birthday;
        this.baseSalary = baseSalary;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(Double baseSalary) {
        this.baseSalary = baseSalary;
    }
}
