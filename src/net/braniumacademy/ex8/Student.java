package net.braniumacademy.ex8;

import java.util.Objects;

public class Student implements Comparable<Student> {
    private String id;
    private String name;
    private float avgGrade;

    public Student() {
    }

    public Student(String id, String name, float avgGrade) {
        this.id = id;
        this.name = name;
        this.avgGrade = avgGrade;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getAvgGrade() {
        return avgGrade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", avgGrade=" + avgGrade +
                '}';
    }

    public void setAvgGrade(float avgGrade) {
        this.avgGrade = avgGrade;
    }

    /**
     * sắp xếp sinh viên theo thứ tự tăng dần của mã sinh viên
     * từ a-z
     *
     * @param other đối tượng sinh viên cần so sánh
     * @return giá trị số nguyên đại diện cho kết quả so sánh
     */
    @Override
    public int compareTo(Student other) {
        return id.compareToIgnoreCase(other.id);
    }

    @Override
    public boolean equals(Object otherObj) {
        if (this == otherObj) return true;
        if (otherObj == null || getClass() != otherObj.getClass()) return false;
        Student student = (Student) otherObj;
        return Objects.equals(id, student.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
