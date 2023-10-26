package org.example.generics;

import java.util.ArrayList;
import java.util.List;

public class Crate <T extends Box<?>> {
    protected List<T> containers; //lazy instantiated - instead of creating it when the class is here only use it when
    //its called

    public Crate() {
        this.containers = new ArrayList<>();
    }

    public void addBox(T box){
        this.containers.add(box);
    }

    public List<T> getContainers() {
        return containers;
    }
}
