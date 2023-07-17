public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int age = 27;
        int adulthood = 18;
        if (age >= adulthood) {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний.");
        } else {
            System.out.println("Если возраст человека равен " + age + ", он не достиг совершеннолетия, нужно немного подождат");
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        int temperature = 2;
        if (temperature >= 5) {
            System.out.println("Сегодня тепло, можно идти без шапки");
        } else {
            System.out.println("На улице холодно, нужно надеть шапку");
        }

    }

    public static void task3() {
        System.out.println("Задача 3");
        int speed = 65;
        int speedLimit = 60;
        if (speed > speedLimit) {
            System.out.println("Если скорость " + speed + " км/ч, то придется заплатить штраф");
        } else {
            System.out.println("Если скорость " + speed + " км/ч, то можно ездить спокойно");
        }
    }

    public static void task4() {

        // не совсем понял где использовать else, разве только прописать всю конструкцию в обратном порядке и последнюю, которая меньше 2 лет, скинуть на else
        // но если так сделать то к какому if'у относить else. Можно конечно сделать вложенные if'ы, но мы это еще не проходили
        // я бы использовал тут конструкцию else if, но в условии задания написано использовать else
        System.out.println("Задача 4");
        int age = 5;
        if(age<2) {
            System.out.println("Если возраст человека равен " + age + ", то ему пора спать");
        }
        if (age > 2 && age < 6) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в детский сад");
        }
        if (age > 7 && age < 18) {
            System.out.println("Если возраст человека равен " + age + " , то ему нужно ходить в школу");
        }
        if (age > 18 && age < 24) {
            System.out.println("Если возраст человека равен " + age + " , то его место в университете");
        }
        if (age > 24) {
            System.out.println("Если возраст человека равен " + age + ", то ему пора ходить на работу");
        }
        if (age > 60) {
            System.out.println("Если возраст человека равен " + age + ", он может отдохнуть");
        }
    }

    public static void task5() {
        System.out.println("Задача 5");
        int childAge = 15;
        if (childAge < 5) {
            System.out.println("Если возраст ребенка равен " + childAge + ", то ему нельзя кататься на аттракционе");
        } else if (childAge >= 5 && childAge < 14) {
            System.out.println("Если возраст ребенка равен " + childAge + ", то ему можно кататься на аттракционе в сопровождении взрослого");
        } else {
            System.out.println("Если возраст ребенка равен " + childAge + ", то ему можно кататься на аттракционе без сопровождения взрослого");
        }
    }

    public static void task6() {
        System.out.println("Задача 6");
        int carCapacity = 102;
        int seat = 60;
        int standee = carCapacity - seat;
        int occupiedSeats = 60;
        int occupiedStandees = 28;

        if (occupiedSeats == seat && occupiedStandees == standee) {
            System.out.println("Вагон полностью забит");
        } else if (occupiedSeats < seat && occupiedStandees < standee) {
            System.out.println("В вагоне есть свободные стоячие и сидячие места");
        } else if (occupiedSeats == seat && occupiedStandees < standee) {
            System.out.println("В вагоне есть только свободные стоячие места");
        } else if (occupiedSeats < seat && occupiedStandees == standee) {
            System.out.println("В вагоне есть только свободные сидячие места");
        }
    }

    public static void task7() {
        System.out.println("Задача 7");
        int one = 5;
        int two = 12;
        int three = 9;

        if (one > two && one > three) {
            System.out.println("Число " + one + " - наибольшее из трех чисел");
        } else if (two > one && two > three) {
            System.out.println("Число " + two + " - наибольшее из трех чисел");
        } else {
            System.out.println("Число " + three + " - наибольшее из трех чисел");
        }
    }
}