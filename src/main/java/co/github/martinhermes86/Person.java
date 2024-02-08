package co.github.martinhermes86;

import java.util.Objects;

public class Person {
    private String name;
    private int age;
    private String address;

    private String height;

    public Person(String name, int age, String address, String height) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name) && Objects.equals(address, person.address) && Objects.equals(height, person.height);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, address, height);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", hight='" + height + '\'' +
                '}';
    }
}
