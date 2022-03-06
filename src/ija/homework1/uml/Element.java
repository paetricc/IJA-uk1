package ija.homework1.uml;

public class Element {
    private String name;
    public Element(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void rename(String newName) {
        name = newName;
    }
}