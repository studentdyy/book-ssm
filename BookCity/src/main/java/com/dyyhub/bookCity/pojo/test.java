package com.dyyhub.bookCity.pojo;

public class test {
    private Integer id;
    private String name;
    private Integer money;

    public test() {
    }

    public test(String name, Integer money) {
        this.name = name;
        this.money = money;
    }

    @Override
    public String toString() {
        return "test{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", money=" + money +
                '}';
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

    public Integer getMoney() {
        return money;
    }

    public void setMoney(Integer money) {
        this.money = money;
    }
}
