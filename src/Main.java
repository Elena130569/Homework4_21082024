public class Main {
        public static void main(String[] args) {
                int age = 15;
                if (age >= 18) {
                        System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний");
                } else if (age < 18) {
                        System.out.println("Если возраст человека меньше 18, то он не достиг совершеннолетия и надо немного подождать");
        }

        int temperature = 11;
        if (temperature < 5) {
                System.out.println("На улице " + temperature + " градусов, холодно и надо одеть шапку");
        } else if (temperature > 5) {
                System.out.println("На улице " + temperature + " градусов, можно идти без шапки");
        }

        int speedCar = 90;
        if (speedCar > 60) {
                System.out.println("Если скорость " + speedCar + " км/ч - придется заплатить штраф");
        } else if (speedCar < 60) {
                System.out.println("Если скорость " + speedCar + " км/ч - можно ездить спокойно");
        }

        int age1 = 19;
        if (age1 > 2 && age1 < 6) {
                System.out.println("Если возраст человека равен " + age1 + ", то ему нужно ходить в детский сад");
        } else if (age1 > 7 && age1 < 17) {
                System.out.println("Если возраст человека равен " + age1 + ", то ему нужно ходить в школу");
        } else if (age1 >= 18 && age1 <= 24) {
                System.out.println("Если возраст человека равен " + age1 + ", то его место в университете");
        } else if (age1 > 24) {
                System.out.println("Если возраст человека равен " + age1 + ", то ему пора ходить на работу");
        }

        int ageChild = 10;
        if (ageChild < 5) {
                System.out.println("Если возраст ребенка равен " + ageChild + ", то ему нельзя кататься на аттракционе");
        } else if (ageChild > 5 && ageChild < 14) {
                System.out.println("Если возраст ребенка равен " + ageChild + ", то ему можно кататься на аттракционе в сопровождении взрослого");
        } else if (ageChild > 14) {
                System.out.println("Если возраст ребенка равен " + ageChild + ", то ему можно кататься на аттракционе без сопровождения взрослого");
        }

        int numberPassanger1 = 80;
        if (numberPassanger1 > 102) {
                System.out.println("В вагоне нет мест");
        } else if (numberPassanger1 < 102 && numberPassanger1 < 60) {
                System.out.println("В вагоне есть сидячие места");
        } else if (numberPassanger1 < 102 && numberPassanger1 > 60) {
                System.out.println("В вагоне нет сидячих мест и есть только стоячие места");
        }

        int one = 11;
        int two = 7;
        int three = 18;
        if (three > two && three > one) {
                System.out.println(+ three + " является наибольшим среди данных трех чисел");
        } else if (one > three && one > two) {
                System.out.println(+ one + " является наибольшим среди данных трех чисел");
        } else if (two > one && two > three) {
                System.out.println(+ two + " является наибольшим среди данных трех чисел");
        }
        }
}
