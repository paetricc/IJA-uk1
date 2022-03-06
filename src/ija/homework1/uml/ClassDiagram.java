package ija.homework1.uml;

import java.util.ArrayList;

public class ClassDiagram extends Element {
    private final ArrayList<UMLClassifier> list = new ArrayList<>();
    public ClassDiagram(String name) {
        super(name);
    }

    public UMLClass createClass(String name) {
        for (UMLClassifier uml : list) {
            if(uml.getName().equals(name)) {
                return null;
            }
        }
        UMLClass reference = new UMLClass(name);
        this.list.add(reference);
        return reference;
    }

    public UMLClassifier classifierForName(String name) {
        for (UMLClassifier uml : list) {
            if(uml.getName().equals(name)) {
                return findClassifier(name);
            }
        }
        UMLClassifier reference = new UMLClassifier(name, false);
        this.list.add(reference);
        return reference;
    }

    public UMLClassifier findClassifier(String name) {
        for (UMLClassifier uml : list) {
            if(uml.getName().equals(name)) {
                return uml;
            }
        }
        return null;
    }
}