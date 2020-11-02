package net.braniumacademy.ex7;

public class GenericExercises7 {
    public static void main(String[] args) {
        Integer[] numbers = {1, 2, 3, 6, 5, 2, 4, 7, 8};
        Double[] interestRate = {0.25, 1.5, 6.35, 4.75, 5.5, 5.5, 5.5};
        System.out.println("Tổng các phần tử trong mảng numbers: "
                + sumElements(numbers));
        System.out.println("Tổng các phần tử trong mảng interestRate: "
                + sumElements(interestRate));
    }

    /**
     * Phương thức tính tổng các phần tử trong mảng arr
     *
     * @param arr mảng có các phần tử cần tính tổng
     * @param <T> kiểu của các phần tử trong mảng
     * @return tổng tính được ở kiểu double
     */
    public static <T extends Number> double sumElements(T[] arr) {
        double sum = 0;
        for (var e : arr) {
            sum += e.doubleValue();
        }
        return sum;
    }
}
