package net.braniumacademy.ex4;

import net.braniumacademy.ex1.Student;

public class GenericExercises4 {
    public static void main(String[] args) {
        Integer[] numbers = {1, 2, 3, 6, 5, 2, 4, 7, 8};
        Double[] interesRate = {0.25, 1.5, 6.35, 4.75, 5.5, 5.5, 5.5};
        Student[] students = new Student[5];
        students[0] = new Student("S1", "Tran Van Hung", 3.25f);
        students[1] = new Student("S2", "Nguyen Tran Duy", 2.59f);
        students[2] = new Student("S3", "Hoang Xuan Quynh", 3.54f);
        students[3] = new Student("S2", "Nguyen Tran Duy", 2.59f);
        students[4] = new Student("S2", "Nguyen Tran Duy", 2.59f);

        System.out.println("Số lần xuất hiện của x = 2: " + countX(numbers, 2));
        System.out.println("=========================");
        System.out.println("Số lần xuất hiện của x = 5.5: "
                + countX(interesRate, 5.5));
        System.out.println("=========================");
        System.out.println("Số lần xuất hiện của sinh viên có mã \""
                + students[1].getId() + "\": " + countX(students, students[1]));
    }

    /**
     * Phương thức chỉ dùng cho các kiểu có thực thi interface Comparable
     *
     * @param elements danh sách các phần tử cần tìm
     * @param x        giá trị cần tìm
     * @param <T>      kiểu các phần tử cần thao tác
     * @return vị trí đầu tiên của phần tử trong mảng nếu
     * tìm thấy hoặc -1 nếu không tìm thấy
     */
    public static <T extends Comparable> int countX(T[] elements, T x) {
        int counter = 0;
        for (int i = elements.length - 1; i >= 0; i--) {
            if (elements[i].compareTo(x) == 0) {
                counter++;
            }
        }
        return counter;
    }
}
