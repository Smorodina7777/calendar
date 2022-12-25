import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] months;
        months = new String[]{"Январь", "Февраль", "Март", "Апрель", "Май", "Июнь", "Июль", "Август", "Сентябрь", "Октябрь", "Ноябрь", "Декабрь"};
        String[] weekdays = new String[7];
        weekdays = new String[]{"Понедельник", "Вторник", "Среда", "Четверг", "Пятница", "Суббота", "Воскресенье"};
        String[] seasons = new String[4];
        seasons = new String[]{"Зима", "Весна", "Лето", "Осень"};
        int[] dates = new int[31];
        dates = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31};
        System.out.println(Arrays.toString(seasons));
        System.out.println(Arrays.toString(months));
        System.out.println(Arrays.toString(weekdays));
        System.out.println(Arrays.toString(dates));
        for (int i = 1; i < seasons.length; i = i + 2) {
            System.out.print(seasons[i] + " ");
        }
        System.out.println();
        for (int i = 1; i < 4; i++) {
            System.out.print(weekdays[i] + " ");
        }
        System.out.println();
        int[][] twoDimArray = new int[12][];
        twoDimArray[0] = Arrays.copyOf(dates, 31);
        twoDimArray[1] = Arrays.copyOf(dates, 28);
        twoDimArray[2] = Arrays.copyOf(dates, 31);
        twoDimArray[3] = Arrays.copyOf(dates, 30);
        twoDimArray[4] = Arrays.copyOf(dates, 31);
        twoDimArray[5] = Arrays.copyOf(dates, 30);
        twoDimArray[6] = Arrays.copyOf(dates, 31);
        twoDimArray[7] = Arrays.copyOf(dates, 31);
        twoDimArray[8] = Arrays.copyOf(dates, 30);
        twoDimArray[9] = Arrays.copyOf(dates, 31);
        twoDimArray[10] = Arrays.copyOf(dates, 30);
        twoDimArray[11] = Arrays.copyOf(dates, 31);

        for (int i = 0; i < twoDimArray.length; i++) {
            for (int j = 0; j < twoDimArray[i].length; j++) {
                if (j == 0) {
                    System.out.print(months[i] + " " + twoDimArray[i][j] + " ");
                } else {
                    System.out.print(" " + twoDimArray[i][j] + " ");
                }

            }
            System.out.println();
        }
    }
}