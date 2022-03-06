package ija.homework1.uml;

public class UMLClassifier extends Element {
    private final boolean isUserDefined;
    public UMLClassifier(String name) {
        super(name);
        isUserDefined = true;
    }

    public UMLClassifier(String name, boolean isUserDefined) {
        super(name);
        this.isUserDefined = isUserDefined;
    }

    public boolean isUserDefined() {
        return isUserDefined;
    }

    public static UMLClassifier forName(String name) {
        return new UMLClassifier(name, false);
    }

    @Override
    public String toString(){
        return getName() + "(" + isUserDefined() + ")";
    }
}