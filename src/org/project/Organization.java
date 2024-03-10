package org.project;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.ArrayList;
/*
enum Status {
    DIRECTOR("Директор"),
    DEPUTY_DIRECTOR("Заместитель директора"),
    SECRETARY("Секретарь"),
    BOOKER("Бухгалтер");
    Status(String description) {
        this.description = description;
    }
    public String get() {
        return description;
    }
}
*/
public class Organization {
    private HashSet<Worker> worker = new HashSet<>();
    private int count = 1;

    private int counter() {
        return this.count++;
    }

    Organization() {
        this.worker.add(new Worker("Иванов Иван Иванович", 2200.05, this.counter()));
        this.worker.add(new Worker("Петров Семен Александрович", 1955.05, this.counter()));
        this.worker.add(new Worker("Петрова Наталья Ивановна", 2100.99, this.counter()));
        this.worker.add(new Worker("Шевченко Регина Юрьевна", 3500.67, this.counter()));
        this.worker.add(new Worker("Шептун Лев Генадьевич", 2900.05, this.counter()));
    }

    private ArrayList hashSetToArrayList() {
        ArrayList<Worker> alw = new ArrayList<>();
        Iterator<Worker> i = this.worker.iterator();
        while (i.hasNext()) {
            alw.add(i.next());
        }
        return alw;
    }

    public void listWorker(String type, String query) {
        Iterator<Worker> i;
        ArrayList<Worker> alw;
        if (type == "sort" || type == "search") {
if (query=="id") {
    alw = this.hashSetToArrayList();
    Collections.sort(alw,new WorkerComparator());
i = alw.iterator();
}
            else if (query == "salary") {
                alw = this.hashSetToArrayList();
                Collections.sort(alw);
                i = alw.iterator();
            } else {
                i = this.worker.iterator();
            }
            while (i.hasNext()) {
                Worker w = i.next();
                System.out.println("Работник: " + w.getName() + "\nЗарплата: " + w.getSalary() + "\nID: " + w.getId() + "\n");
            }
        }
    }

    public void test() {

    }


}
