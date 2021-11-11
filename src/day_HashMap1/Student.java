package day_HashMap1;

import java.util.Objects;

public class Student {
    private int id = 0;
    private String name = null;
    private String km = null;

    public Student(int id, String name, String km) {
        this.id = id;
        this.name = name;
        this.km = km;
    }

    public int getId() {
        return id;
    }

    public String getKm() {
        return km;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setKm(String km) {
        this.km = km;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", km='" + km + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return getId() == student.getId() &&
                Objects.equals(getName(), student.getName()) &&
                Objects.equals(getKm(), student.getKm());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getKm());
    }
}
