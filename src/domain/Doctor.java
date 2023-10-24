package src.domain;

import java.util.Objects;

public class Doctor implements Identifiable<Integer>{
    Integer id;
    private String name, specialty, location;
    double grade;

    public Doctor(Integer id, String name, String specialty, String location, double grade)
    {
        this.id = id;
        this.name = name;
        this.specialty = specialty;
        this.location = location;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Doctor{id=" + id +
                ", name='" + name + '\'' +
                ", specialty='" + specialty + '\'' +
                ", location='" + location + '\'' +
                ", grade=" + grade +
                '}';
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o)
            return true;
        if (o.getClass() != Doctor.class)
            return false;
        Doctor d = (Doctor)o;
        if (d.id == this.id)
            return true;
        return false;
    }

    @Override
    public Integer getId() {
        return id;
    }

    @Override
    public void setId(Integer id) {
        this.id = id;
    }
}
