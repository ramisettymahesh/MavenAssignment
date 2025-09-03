package com.name;

public class Names {
    public String getName() {
        System.out.println("Getter called");
        return name;
    }

    public void setName(String name) {
        System.out.println("Setter called");
        this.name = name;
    }

    public String name;

}
