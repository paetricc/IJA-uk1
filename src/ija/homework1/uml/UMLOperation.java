package ija.homework1.uml;

import java.util.ArrayList;

public class UMLOperation extends UMLAttribute {
    private final ArrayList<UMLAttribute> attributes = new ArrayList<>();
    public UMLOperation(String name, UMLClassifier type) {
        super(name, type);
    }

    public static UMLOperation create(String name, UMLClassifier type, UMLAttribute... args) {
        UMLOperation operation = new UMLOperation(name, type);
        for (UMLAttribute attribute : args) {
            operation.addArgument(attribute);
        }
        return operation;
    }

    public boolean addArgument(UMLAttribute arg) {
        for (UMLAttribute attr : this.attributes) {
            if(attr.getType().equals(arg.getType())) {
                return false;
            }
        }
        return this.attributes.add(arg);
    }

    public java.util.List<UMLAttribute> getArguments() {
        return this.attributes;
    }
}
