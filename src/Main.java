public class Main {
    public static void main(String[] args) {
        // Задание 1
        byte a = 1;
        short b = 150;
        int c = 1_500;
        long d = 3_000_777L;
        float f = 44.33f;
        double k = 88.347;
        char h = 35;
        char j = '#';
        boolean s = true;
        s = 11 > 8;
        System.out.println(h + " = " + j);

        // Задание 2
        float boxer1 = 78.2f;
        float boxer2 = 82.7f;
        float weightBoxers = boxer1 + boxer2;
        float weightDifference = boxer2 - boxer1;
        System.out.println("Общий вес двух боксёров составляет " + weightBoxers + " кг.");
        System.out.println("Разница в весе боксёров составляет " + weightDifference + " кг.");

        // Задание 3
        short banana = 80;
        short milk = 105;
        short iceCream = 100;
        short egg = 70;
        short eatBananas = 5;
        short eatMilk = 2;
        short eatIceCream = 2;
        short eatEgg = 4;
        double weightBreakfast = banana * eatBananas + milk * eatMilk + iceCream * eatIceCream + egg * eatEgg;
        double weightBreakfastInKg = weightBreakfast / 1000;
        System.out.println("Вес завтрака составляет " + weightBreakfastInKg + "кг.");

        // Задание 4
        short needToReset = 7;
        short minLoseWeightPerDay = 250;
        short maxLoseWeightPerDay = 500;
        int maxOfDays = needToReset * 1000 / minLoseWeightPerDay;
        int minOfDays = needToReset * 1000 / maxLoseWeightPerDay;
        int averageNumberOfDays = (minOfDays + maxOfDays) / 2;
        System.out.println("Если спортсмен каждый день будет худеть на " + minLoseWeightPerDay + " грамм, то понадобится " + maxOfDays + " дней.");
        System.out.println("Если спортсмен каждый день будет худеть на " + maxLoseWeightPerDay + " грамм, то понадобится " + minOfDays + " дней.");
        System.out.println("Чтобы добиться результата похудения, понадобится в среднем " + averageNumberOfDays + " день.");

        // Задание 5
        double salaryMach = 67760;
        double salaryDenis = 83690;
        double salaryKristina = 76230;
        double percentageIncrease = 10;
        double raisingSalaryMach = salaryMach / 100 * percentageIncrease;
        salaryMach = salaryMach + raisingSalaryMach;
        double annualIncreaseMach = raisingSalaryMach * 12;
        double raisingSalaryDenis = salaryDenis / 100 * percentageIncrease;
        salaryDenis = salaryDenis + raisingSalaryDenis;
        double annualIncreaseDenis = raisingSalaryDenis * 12;
        double raisingSalaryKristina = salaryKristina / 100 * percentageIncrease;
        salaryKristina = salaryKristina + raisingSalaryKristina;
        double annualIncreaseKristina = raisingSalaryKristina * 12;
        System.out.println("Маша теперь получает " + salaryMach + " рублей. Годовой доход вырос на " + annualIncreaseMach + " рублей.");
        System.out.println("Маша теперь получает " + salaryDenis + " рублей. Годовой доход вырос на " + annualIncreaseDenis + " рублей.");
        System.out.println("Маша теперь получает " + salaryKristina + " рублей. Годовой доход вырос на " + annualIncreaseKristina + " рублей.");
    }
}