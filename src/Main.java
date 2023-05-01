public class Main {
    public static void main(String[] args) {

        int bil = 3250;     //стоимость билета
        int mil = 20;     //за 20 рублей начисляется 1 миля

        int bonus = bil / mil;      //количество бонусных миль

        System.out.println("Поздравляем! Вам начислено " + bonus + " бонусных миль ");

    }

}
