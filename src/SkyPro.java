public class SkyPro {
    public static void main(String[] args) {
// задача 1
        int age = 22;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + " ,то он совершеннолетний.");
        } else {
            System.out.println("Если возраст человека равен " + age +
                    " ,то он не достиг совершеннолетия, нужно немного подождать");
        }
// задача 2
        int temperature = 16;
        if ( temperature < 5) {
            System.out.println("На улице " + temperature + " градусов, нужно надеть шапку.");
        } else {
            System.out.println("На улице " + temperature + " градусов, можно идти без шапки.");
        }
//задача 3
        int speed = 86;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + ", то придется заплатить штраф.");
        } else {
            System.out.println("Если скорость " + speed + ", то можно ездить спокойно.");
        }
//задача 4
        int personAge = 22;
        if (personAge > 2 && personAge <=6) {
            System.out.println("Если возраст человека " + personAge + ", то ему нужно ходить в садик");
        } else if (personAge > 7 && personAge <= 17){
            System.out.println("Если возраст человека " + personAge + ", то ему нужно ходить в школу");
        } else if (personAge >= 18 && personAge <= 24) {
            System.out.println("Если возраст человека " + personAge + ", то ему нужно ходить в университет");
        }else{
            System.out.println("Если возраст человека " + personAge + ", то ему нужно ходить на работу");
        }
//задача 5
        int childAge = 8;
        if (childAge <5) {
            System.out.println("Если возраст ребенка равен " + childAge + ", то ему нельзя кататься" +
                    "на аттракционе");
        } else if(childAge >= 5 && childAge < 14) {
            System.out.println("Если возраст ребенка равен " + childAge + ", то ему можно кататься " +
                    "на аттракционе в сопровождении взрослого");
        }else{
            System.out.println("Если возраст ребенка равен " + childAge + ", то ему можно кататься " +
                    "на аттракционе без сопровождения взрослого");
        }
//задача 6
        int totalPlaces = 102;
        int standingPlaces = 60;
        int seatPlaces = 102 - 60;
        int numberOfPassengers = 89;
        if (numberOfPassengers == totalPlaces) {
            System.out.println("В вагоне нет свободных мест");
        } else if (numberOfPassengers < seatPlaces) {
            System.out.println("В вагоне есть сидячие места");
        } else {
            System.out.println("В вагоне есть стоячие места");
        }
// задача 7
        int one = 34;
        int two = 7;
        int three = 12;
        if (one > two && one > three) {
            System.out.println("Самое большое число " + one);
        }else if (two > one && two > three){
            System.out.println("Самое большое число " + two);
        } else if (three > one && three > two) {
            System.out.println("Самое большое число " + three);
        }
    }

}