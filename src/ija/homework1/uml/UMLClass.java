package ija.homework1.uml;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class UMLClass extends UMLClassifier {
    private final ArrayList<UMLAttribute> attributes = new ArrayList<>();
    private boolean isAbstract;
    public UMLClass(String name) {
        super(name);
    }

    public boolean isAbstract() {
        return isAbstract;
    }

    public void setAbstract(boolean isAbstract) {
        this.isAbstract = isAbstract;
    }

    public boolean addAttribute(UMLAttribute attr) {
        for (UMLAttribute uml : this.attributes) {
            if(uml.getName().equals(attr.getName())) {
                return false;
            }
        }
        this.attributes.add(attr);
        return true;
    }

    public int getAttrPosition(UMLAttribute attr) {
        return this.attributes.indexOf(attr);
    }

    public int moveAttrAtPosition(UMLAttribute attr, int pos) {
        if (this.attributes.contains(attr)) {
            this.attributes.remove(attr);
            this.attributes.add(pos, attr);
            return 0;
        } else {
            return -1;
        }
    }

    public List<UMLAttribute> getAttributes() {
        return Collections.unmodifiableList(attributes);
    }
}