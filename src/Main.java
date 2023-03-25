public class Main {

    public static void main(String[] args) throws InterruptedException {

        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    private static void task1() {
        int total = 2459000;
        int difSum = 15000;
        int deposit = 0;
        int counter = 0;

        while (deposit <= total) {
            deposit += difSum;
            counter++;
            System.out.println("Месяц " + counter + " сумма накоплений равна " + deposit + " рублей");
        }
    }

    private static void task2() {
        int i = 1;
        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }

        System.out.println();

        for (int j = 10; j > 0; j--) {
            System.out.print(j + " ");
        }
    }

    private static void task3() {
        int population = 12000000;
        int birthRate = 17;
        int deathRate = 8;
        int period = 10;
        int counter = 0;

        while (counter <= period) {
            population = population + (birthRate - deathRate) * population / 1000;
            counter++;
            System.out.println("Год " + counter + " численность населения составляет " + population);
        }
    }

    private static void task4() {
        int total = 12000000;
        int percent = 7;
        int deposit = 15000;
        int counter = 0;

        while (deposit <= total) {
            deposit = deposit + percent * deposit / 100;
            counter++;
            System.out.println("Месяц " + counter + " сумма накоплений равна " + deposit + " рублей");
        }
    }

    private static void task5() {
        int total = 12000000;
        int percent = 7;
        int deposit = 15000;
        int counter = 0;

        while (deposit <= total) {
            deposit = deposit + percent * deposit / 100;
            counter++;
            if (counter % 6 == 0) {
                System.out.println("Месяц " + counter + " сумма накоплений равна " + deposit + " рублей");
            }
        }
    }

    private static void task6() {
        int years = 9;
        int percent = 7;
        int deposit = 15000;
        int counter = 0;

        while (counter <= years * 12) {
            deposit = deposit + percent * deposit / 100;
            counter++;
            if (counter % 6 == 0) {
                System.out.println("Месяц " + counter + " сумма накоплений равна " + deposit + " рублей");
            }
        }
    }

    private static void task7() {
        int days = 31;
        int currentDay = 6;

        while (currentDay <= days) {
            System.out.println("Сегодня пятница, " + currentDay + "-е число. Необходимо подготовить отчет");
            currentDay += 7;
        }
    }

    private static void task8() {
        int cometYear = 79;
        int currentYear = 2023;
        int previous = 200;
        int next = 100;

        int start = currentYear - previous;
        int finish = currentYear + next;

        for (int i = start; i <= finish; i++) {
            if (i % cometYear == 0) {
                System.out.println(i);
            }
        }
    }
}
