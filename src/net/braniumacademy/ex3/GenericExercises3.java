package net.braniumacademy.ex3;

import net.braniumacademy.ex1.Student;

public class GenericExercises3 {
    public static void main(String[] args) {
        Integer[] numbers = {1, 2, 3, 6, 5, 2, 4, 7, 8};
        Double[] interestRate = {0.25, 1.5, 6.35, 4.75, 5.5};
        Student[] students = new Student[3];
        students[0] = new Student("S1", "Tran Van Hung", 3.25f);
        students[1] = new Student("S2", "Nguyen Tran Duy", 2.59f);
        students[2] = new Student("S3", "Hoang Xuan Quynh", 3.54f);

        checkInteger(numbers);
        System.out.println("=========================");
        checkDoubleNumber(interestRate);
        System.out.println("=========================");
        checkStudent(students);
    }

    /**
     * Phương thức dùng để kiểm tra xem một sinh viên
     * có tồn tại trong danh sách không
     *
     * @param students danh sách sinh viên cần tìm
     */
    private static void checkStudent(Student[] students) {
        Student s = new Student("S2", "Nguyen Tran Duy", 2.59f);
        int index = findX(students, s);
        if (index != -1) {
            System.out.println("Tìm thấy x trong mảng students tại vị trí: "
                    + index);
        } else {
            System.out.println("Không tìm thấy x trong mảng students");
        }
    }

    /**
     * Phương thức kiểm tra giá trị Double nào đó có xuất hiện trong
     * mảng hay không
     *
     * @param interesRate mảng chứa các giá trị mẫu dùng để so sánh
     */
    private static void checkDoubleNumber(Double[] interesRate) {
        Double x = 8.5;
        int indexOfXDouble = findX(interesRate, x);
        if (indexOfXDouble != -1) {
            System.out.println("Tìm thấy x trong mảng interesRate tại vị trí: "
                    + indexOfXDouble);
        } else {
            System.out.println("Không tìm thấy x trong mảng interesRate");
        }
    }

    /**
     * Kiểm tra một số Integer có trong mảng không
     *
     * @param numbers mảng chứa các giá trị số cần kiểm tra
     */
    private static void checkInteger(Integer[] numbers) {
        Integer x = 2;
        int indexOfXInterger = findX(numbers, x);
        if (indexOfXInterger != -1) {
            System.out.println("Tìm thấy x trong mảng numbers tại vị trí: "
                    + indexOfXInterger);
        } else {
            System.out.println("Không tìm thấy x trong mảng numbers");
        }
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
    public static <T extends Comparable> int findX(T[] elements, T x) {
        for (int i = elements.length - 1; i >= 0; i--) {
            if (elements[i].compareTo(x) == 0) {
                return i;
            }
        }
        return -1;
    }
}
