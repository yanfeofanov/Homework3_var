import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        // Задача №1

       int apple = 10;
       byte ram = 124;
       short intelIdea = 34;
       float magaHeart = 23f;
       double heartLife = 100;
        System.out.println("Значение переменной apple с типом int равно " + apple);
        System.out.println("Значение переменной ram с типом byte равно " + ram);
        System.out.println("Значение переменной intelIdea с типом short равно " + intelIdea);
        System.out.println("Значение переменной megaHeart с типом float равно " + magaHeart);
        System.out.println("Значение переменной heartLife с типом double равно " + heartLife);

        // Задача №2

        double tomatoes = 27.12;
        long spider = 987678965549l;
        double cucumbers = 2.786;
        int dog = 569;
        short temp = -159;
        char cat = 27897;
        byte omega = 67;

        // Задача №3

        int ludmilaPavlovna = 23;
        int annaSergeevna = 27;
        int ekaterinaAndreevna = 30;
        int allPaper = 480;
        System.out.println("На каждого ученика рассчитано "+ allPaper/(ludmilaPavlovna+annaSergeevna+ekaterinaAndreevna) + " листов бумаги");

        // Задача №4

        int totalBottles = 16;
        short totalTimeConst = 2;
        int totalBottlesTime = (totalBottles/totalTimeConst); // вычесляем сколько машина производит за 1 минуту
        int timeCriterion = 20;
        int day = 24 * 60;          // вычесляем сколько за 1 день переводим в минуты
        int threeDays = day * 3;    // вычесляем сколько за 3 дня переводим в минуты
        long month = day * 31;      // вычесляем сколько за один месяц переводим в минуты
        System.out.println("За 20 минут, машина произвела " + totalBottlesTime * timeCriterion + " штук бутылок" );
        System.out.println("За один день, машина произвела " + totalBottlesTime * day + " штук бутылок" );
        System.out.println("За три дня, машина произвела " + totalBottlesTime * threeDays + " штук бутылок" );
        System.out.println("За один месяц, машина произвела " + totalBottlesTime * month + " штук бутылок" );

        // Задача №5

        int totalCans = 120;
        int whiteJar = 2;
        int brownJar = 4;
        int totalClasses = totalCans/(whiteJar+brownJar); // вычесляем сколько классов всего
        System.out.println("В школе, где "+totalClasses+" классов,нужно "+totalClasses*whiteJar+" банок белой краски и "+totalClasses*brownJar+" банок коричневой краски");

        // Задача №6

        double oneBananas = 80;  // Вес одного банана в граммах
        int bananas = 5;         // Количество бананов в штуках
        double weightBananas = (float)bananas * (float)oneBananas; // Общий вес бананов в граммах
        double oneMilk = 105;    // Количество 100мл молока в граммах
        double milk = 200;       // Количество молока в мл
        double weightMilk = (float)oneMilk * 2; // Общий вес молока в граммах
        double onePlumbeerIceCream = 100;       // Количество одного брикета мороженного в граммах
        int plumbeerIceCream = 2;               // Количество брикетов мороженного в штуках
        double weightPlumbeerIceCream = (float)onePlumbeerIceCream * plumbeerIceCream; // Общий вес мороженного в граммах
        double oneRawEggs = 70;                 // Количество одного яйца в граммах
        int rawEggs = 4;                        // Количество яйца в штуках
        double weightRawEggs = (float)oneRawEggs * (float)rawEggs; // Общий вес яиц в граммах
        int weightKg = 1000;                    // Константа веса в граммах
        double weightTotalProducts = (weightBananas+weightMilk+weightPlumbeerIceCream+weightRawEggs);
        System.out.println("Спортзавтрак в граммах составит "+weightTotalProducts+" гр.");
        System.out.println("Спортзавтрак в килограммах составит "+weightTotalProducts/weightKg+" кг.");

        // Задача №7

        int weightAllKg = 7;
        int weightConst = 1000;
        double weightOneDayMin = 250;
        double weightOneDayMax = 500;
        double weightGr = (double)weightAllKg * (double)weightConst; // Переводим кг в граммы
        int oneDayMin = (int)weightGr/(int)weightOneDayMin; // Вычесление если 250гр. в день
        int oneDayMax = (int)weightGr/(int)weightOneDayMax; // Вычесление если 500гр. в день
        System.out.println("Если спротсмен будет терять 250гр. в день, то на это уйдет "+oneDayMin+" дней");
        System.out.println("Если спротсмен будет терять 500гр. в день, то на это уйдет " +oneDayMax+" дней");
        System.out.println("Чтобы добиться результата, спортсмену в среднем птребуется " +(oneDayMin+oneDayMax)/2+" день");

        // Задача №8

        int mashaZp = 67760;
        int denisZp = 83690;
        int kristinaZp = 76230;
        int mashaZpOneYear = (mashaZp*12);                 // Вычесляем сколько зп у Маши будет за год до повышения
        int denisZpOneYear = (denisZp*12);                // Вычесляем сколько зп у Дениса будет за год до повышения
        int kristinaZpOneYear = (kristinaZp*12);         // Вычесляем сколько зп у Кристины будет за год до повышения
        int mashaZpMonthIncrease = (mashaZp*10)/100+(mashaZp);         // Вычесляем месячную зп с повышением на 10% у Маши
        int denisZpMonthIncrease = (denisZp*10)/100+(denisZp);         // Вычесляем месячную зп с повышением на 10% у Дениса
        int kristinaZpMonthIncrease = (kristinaZp*10)/100+(kristinaZp);   // Вычесляем месячную зп с повышением на 10% у Крестины
        int mashaZpOneYearIncrease = (mashaZpMonthIncrease*12);  // Вычесляем сколько зп у Маши будет за год после повышения
        int denisZpOneYearIncrease = (denisZpMonthIncrease*12);  // Вычесляем сколько зп у Дениса будет за год после повышения
        int kristinaZpOneYearIncrease = (kristinaZpMonthIncrease*12);   // Вычесляем сколько зп у Крестины будет за год после повышения
        int totalMashaZpOneYear = mashaZpOneYearIncrease-mashaZpOneYear;//Вычесляем разницу за год у Маши после повышения
        int totalDenisZpOneYear = denisZpOneYearIncrease-denisZpOneYear;//Вычесляем разницу за год у Дениса после повышения
        int totalKristinaZpOneYear = kristinaZpOneYearIncrease-kristinaZpOneYear;//Вычесляем разницу за год у Кристины после повышения
        System.out.println("Маша теперь получает "+mashaZpMonthIncrease+" рублей.Годовой доход вырос на "+totalMashaZpOneYear+" рублей");
        System.out.println("Маша теперь получает "+denisZpMonthIncrease+" рублей.Годовой доход вырос на "+totalDenisZpOneYear+" рублей");
        System.out.println("Маша теперь получает "+kristinaZpMonthIncrease+" рублей.Годовой доход вырос на "+totalKristinaZpOneYear+" рублей");

  //





    }
}