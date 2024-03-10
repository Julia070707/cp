package org.project;

import org.junit.jupiter.api.Test;

import java.util.Collections;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Iterator;

class WorkerTest {

    @Test
    void getSalary() {
        ArrayList<Worker> al = new ArrayList<>();
        al.add(new Worker("Iven", 2500.55, 1));
        al.add(new Worker("Georgi", 2500.99, 2));
        al.add(new Worker("Alexander", 3500.25, 3));
        Collections.sort(al);
        Iterator<Worker> i = al.iterator();
        while (i.hasNext()) {
            Worker w = i.next();
            System.out.println(w.getName() + " " + w.getSalary()+" "+w.getId()+" HASH CODE: "+w.hashCode());
        }

    }
}