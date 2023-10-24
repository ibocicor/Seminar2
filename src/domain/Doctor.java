package src.domain;

import java.util.Objects;

public class Doctor {
    private String name, specialty, location;
    double grade;

    public Doctor(String name, String specialty, String location, double grade)
    {
        this.name = name;
        this.specialty = specialty;
        this.location = location;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "name='" + name + '\'' +
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
        if (this.name.equals(d.name) && this.specialty.equals(d.specialty) &&
            this.location.equals(d.location) && this.grade == d.grade)
            return true;
        return false;
    }
}
