package ija.homework1.uml;

public class UMLAttribute extends Element {
    private final UMLClassifier type;
    public UMLAttribute(String name, UMLClassifier type) {
        super(name);
        this.type = type;
    }

    public UMLClassifier getType() {
        return this.type;
    }

    @Override
    public String toString() {
        return getName() + ":" + getType().toString();
    }

}