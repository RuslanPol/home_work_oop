package lambda_func;

import oop_interface_homework.sort.Array;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Year;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;
import java.util.Scanner;
import java.util.function.IntPredicate;
import java.util.function.Predicate;


public class App1 {
    public static void main(String[] args) {
        System.out.println("________________is leap year_______________________");
        Predicate<Integer> isLeapYear = year -> ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0);
        System.out.println(isLeapYear.test(2000));
        System.out.println(isLeapYear.test(2100));
        System.out.println("________________count of days_______________________");
        var startDate= LocalDate.of(2023,05,10);
        var endDate= LocalDate.of(2023,05,25);

       ICount days = ()-> (int) ChronoUnit.DAYS.between(startDate,endDate);
        System.out.println(days.count());
        System.out.println("________________count of weeks_______________________");
        ICount weeks = ()-> (int) ChronoUnit.WEEKS.between(startDate,endDate);
        System.out.println(weeks.count());
        System.out.println("________________day of weeks_______________________");
        IDayOfWeek day=()-> endDate.getDayOfWeek();
        System.out.println(day.dayOfWeek());
        System.out.println("________________fraction calculator_______________________");
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter numerator of first fraction: ");
        int numerator1=scanner.nextInt();
        System.out.println("Enter denominator of first fraction: ");
        int denominator1=scanner.nextInt();
        System.out.println("Enter numerator of second fraction: ");
        int numerator2=scanner.nextInt();
        System.out.println("Enter denominator of second fraction: ");
        int denominator2=scanner.nextInt();
        System.out.println("________________fraction sum_______________________");
        IFractionCalc sum=()-> (double) ((numerator1 * denominator2) + (numerator2 * denominator1)) / (denominator1 * denominator2);
        System.out.println(sum.calc());
        System.out.println("________________fraction difference_______________________");
        IFractionCalc difference=()-> (double) ((numerator1 * denominator2) - (numerator2 * denominator1)) / (denominator1 * denominator2);
        System.out.println(difference.calc());
        System.out.println("________________fraction multiplication_______________________");
        IFractionCalc multiplication=()-> (double) (numerator1 * numerator2) / (denominator1 * denominator2);
        System.out.println(multiplication.calc());
        System.out.println("________________fraction division_______________________");
        IFractionCalc division=()-> (double) (numerator1 * denominator2) / (denominator1 * numerator2);
        System.out.println(division.calc());
        System.out.println("________________Maximum_______________________");
        ICount max=()->(Math.max((Math.max(numerator1,numerator2)),Math.max(denominator1,denominator2)));
        System.out.println(max.count());
        System.out.println("________________Minimum_______________________");
        ICount min=()->(Math.min((Math.min(numerator1,numerator2)),Math.min(denominator1,denominator2)));
        System.out.println(min.count());
        System.out.println("________________Sum_______________________");
        int[] arr = {1, 5, 7, 4, 5, 10, 11, 5, 5, -1, -4, -6};

        System.out.println(Arrays.toString(arr));
        int sumEl = Arrays.stream(arr).filter(a -> a > 0).reduce((acc, a) -> acc + a).getAsInt();
        System.out.println(sumEl);
        int sumEl1 = Arrays.stream(arr).filter(a -> a < 0).reduce((acc, a) -> acc + a).getAsInt();
        System.out.println(sumEl1);
        int sumEl2 = Arrays.stream(arr).filter(a -> !(4 < a && a < 7)).reduce((acc, a) -> acc + a).getAsInt();
        System.out.println(sumEl2);
        int sumEl3 = Arrays.stream(arr).filter(a -> a == 5).reduce((acc, a) -> acc + a).getAsInt();
        System.out.println(sumEl3);


    }
}
