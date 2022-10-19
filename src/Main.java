public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");

        var dog = 8;
        var cat = 3.6;
        var paper = 763789;

        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        System.out.println("Задача 2");

        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;

        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        System.out.println("Задача 3");

        var a = 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;

        System.out.println(dog - a);
        System.out.println(cat);
        System.out.println(paper);

        System.out.println("Задача 4");

        var friend = 19;
        System.out.println(friend);

        friend = friend * 2;
        System.out.println(friend);

        friend = friend / 7;
        System.out.println(friend);

        System.out.println("Задача 5");

        var frog = 3.5;
        System.out.println(frog);

        frog = frog * 10;
        System.out.println(frog);

        frog = frog / 3.5;
        System.out.println(frog);

        frog = frog + 4;
        System.out.println(frog);

        System.out.println("Задача 6");

        var boxerFirstWeight = 78.2;
        var boxerSecondWeight = 82.7;
        var boxerCommonWeight = boxerFirstWeight + boxerSecondWeight;
        boxerCommonWeight = -boxerFirstWeight + boxerSecondWeight;
        System.out.println("Общий вес бойцов " + boxerCommonWeight + " кг!");
        System.out.println("Разница между весами бойцов составила " + boxerCommonWeight + " кг!");

        System.out.println("Задача 7");

        System.out.println("Разница между весами бойцов составила " + (boxerSecondWeight - boxerFirstWeight) + " кг!");
        System.out.println("Разница между весами бойцов составила " + (boxerSecondWeight % boxerFirstWeight) + " кг!");

        System.out.println("Задача 8");

        var openingHours = 640;
        var workingDay = 8;
        var numberPeople = openingHours / workingDay;
        System.out.println("Всего работников в компании " + numberPeople + " чел!");

        numberPeople = numberPeople + 94;
        openingHours = openingHours / numberPeople;
        System.out.println("Если в компании работает ” + numberPeople + “чел!” + “ то всего " + openingHours + " часов работы может быть поделено между сотрудниками");


    }
}

