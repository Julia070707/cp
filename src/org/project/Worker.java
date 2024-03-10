package org.project;

import java.lang.Comparable;

public class Worker implements Comparable<Worker> {
    private int id;
    private String name;
    private double salary;

    public Worker(String name, double salary, int id) {
        this.name = name;
        this.salary = salary;
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public int getId() {
        return this.id;
    }

    public double getSalary() {
        return this.salary;
    }

    @Override
    public int compareTo(Worker w) {
        if (this.salary > w.getSalary()) {
            return 1;
        } else if (this.salary < w.getSalary()) {
            return -1;
        } else {
            return 0;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this.getClass() != o.getClass() || o == null) {
            return false;
        }
        Worker w = (Worker) o;
        return this.id == w.getId() && this.name == w.getName() && this.salary == w.getSalary();
    }

    @Override
    public int hashCode() {
        return 31 * 31 * this.name.hashCode() * this.id;
    }




}