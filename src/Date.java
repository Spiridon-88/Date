import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Date {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Привет! Назови дату свадьбы");
        LocalDate weddingDay = LocalDate.parse(scanner.nextLine());
        System.out.printf("Дата вашей свадьбы: %s%n", weddingDay);

        LocalDate today = LocalDate.now();
        System.out.printf("Сегодня %s%n", today);

        long totalDays = ChronoUnit.DAYS.between(weddingDay, today);
        System.out.printf("Вы вместе %d дней%n", totalDays);
        System.out.println("Совет да Любовь!");
    }
}