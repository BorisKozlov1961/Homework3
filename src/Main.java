public class Main {
    public static void main(String[] args) {
//Задача 1
        int a = 3;
        byte b = 50;
        short c = 100;
        long d = 1000L;
        float e = 33.55F;
        double f = 5.33423423477;
        System.out.println("Значение переменной a c типом int равно " + a);
        System.out.println("Значение переменной b c типом byte равно " + b);
        System.out.println("Значение переменной c c типом short равно " + c);
        System.out.println("Значение переменной d c типом long равно " + d);
        System.out.println("Значение переменной e c типом float равно " + e);
        System.out.println("Значение переменной f c типом double равно " + f);

//Задача 2
        float num1 = 27.12F;
        long num2 = 987678965549L;
        double num3 = 2.786;
        boolean num4 = false;
        char num5 = 569;
        short num6 = -159;
        int num7 = 27897;
        byte num8 = 67;

//Задача 3
        int students = 23 + 27 + 30;
        int sheetPaper = 480;
        int sheetsPerStudent = sheetPaper / students;
        System.out.println("На каждого ученика рассчитано " + sheetsPerStudent + " листов бумаги");

//Задача 4
        int bottlesPerMinute = 16 / 2;
        int bottlesIn20minutes = 20 * bottlesPerMinute;
        int bottlesPerDay = 24 * 60 * bottlesPerMinute;
        int bottlesIn3Days = 3 * bottlesPerDay;
        int bottlesPerMonth = 31 * bottlesPerDay;
        System.out.println("За 20 минут машина произвела бутылок " + bottlesIn20minutes + " штук");
        System.out.println("За сутки минут машина произвела бутылок " + bottlesPerDay  + " штук");
        System.out.println("За 3 дня минут машина произвела бутылок " + bottlesIn3Days  + " штук");
        System.out.println("За 1 месяц машина произвела бутылок " + bottlesPerMonth + " штук");

//Задача 5
        int classes = 120/6;
        int whitePaint = classes * 2;
        int brownPaint = classes * 4;
        System.out.println("В школе, где " + classes + " классов, нужно " + whitePaint + " банок белой краски и " +
                brownPaint + " коричневой краски");

//Задача 6
        float bananasWeight = 5 * 80;
        float milkWeight = 2 * 105;
        float iceCreamWeight = 2 * 100;
        float eggsWeight = 4 * 70;
        float cocktailWeight = (bananasWeight + milkWeight + iceCreamWeight + eggsWeight)/1000;
        System.out.println("Вес коктейля " + cocktailWeight + "кг");

//Задача 7
        float weightReduce = 7000F;
        float weightReducePerDay1 = 250F;
        float weightReducePerDay2 = 500F;
        float daysForWeightLoss1 = weightReduce / weightReducePerDay1;
        float daysForWeightLoss2 = weightReduce / weightReducePerDay2;
        float daysForWeightLoss3 = weightReduce/((weightReducePerDay1 + weightReducePerDay2)/2);
        System.out.println("дней для похудения1 - " + daysForWeightLoss1);
        System.out.println("дней для похудения2 - " + daysForWeightLoss2);
        System.out.println("Дней для похудения в среднем " + daysForWeightLoss3);


//Задача 8
        float MashaSalary = 67760F;
        float DenisSalary =  83690F;
        float ChristinaSalary = 76230F;

        float newMashaSalary = MashaSalary * 1.1F;
        float newDenisSalary = DenisSalary * 1.1F;
        float newChristinaSalary = ChristinaSalary * 1.1F;

        float diffMasha = newMashaSalary - MashaSalary;
        float diffDenis = newDenisSalary - DenisSalary;
        float diffChristina = newChristinaSalary - ChristinaSalary;

        System.out.println("Маша теперь получает " +newMashaSalary + " рублей. Годовой доход вырос на " +
                (diffMasha*12) + " рублей");
        System.out.println("Денис теперь получает " +newDenisSalary + " рублей. Годовой доход вырос на " +
                (diffDenis*12) + " рублей");
        System.out.println("Кристина теперь получает " +newChristinaSalary + " рублей. Годовой доход вырос на " +
                (diffChristina*12) + " рублей");

    }
}