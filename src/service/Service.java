package service;

import domain.Doctor;
import repository.Repository;

import javax.print.Doc;
import java.util.ArrayList;

public class Service {
    private Repository repo;

    public Service(Repository r) {
        this.repo = r;
    }

    public void addDoctor(String name, String specialty, String location, double grade) {
        Doctor d = new Doctor(name, specialty, location, grade);
        this.repo.addDoctor(d);
    }

    public ArrayList<Doctor> getAll()
    {
        return this.repo.getAll();
    }
}