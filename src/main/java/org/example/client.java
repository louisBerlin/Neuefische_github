package org.example;

public record client(String name, int age) {

    @Override
    public String name() {
        return name;
    }

    @Override
    public int age() {
        return age;
    }

    @Override
    public String toString() {
        return "client{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
