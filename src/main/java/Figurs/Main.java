package Figurs;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Figure figure1 = null;
        System.out.println("""
                Выберите фигу:
                1 - круг;
                2 - прямоугольник;
                3 - квадрат;
                4 - треугольник;
                        Просто введите цифру""");
        switch (new Scanner(System.in).nextInt())
        {
            case 1 -> {
                System.out.print("Введите радиус :   ");
                figure1 = new Circle(new Scanner(System.in).nextDouble());
                System.out.println();
                System.out.println("Периметр круга = " + figure1.perimeter() + "\n"+
                        "Площадь круга = "+ figure1.area());
            }
            case 2 -> {
                double A = 0, B = 0;
                System.out.println("Введите стороны прямоугольника :   ");
                System.out.print("Сторона А = " ); A = new Scanner(System.in).nextDouble();
                System.out.print("Сторона B = "); B = new Scanner(System.in).nextDouble();
                figure1 = new Rectangle(A, B);
                System.out.println();
                System.out.println("Периметр прямоугольника = " + figure1.perimeter() + "\n"+
                        "Площадь прямоугольника = "+ figure1.area());
            }
            case 3 -> {
                double A = 0;
                System.out.println("Введите сторону квадрата :   ");
                System.out.print("Сторона А = " ); A = new Scanner(System.in).nextDouble();
                figure1 = new Sqeue(A);
                System.out.println();
                System.out.println("Периметр квадрата = " + figure1.perimeter() + "\n"+
                        "Площадь квадрата = "+ figure1.area());
            }
            case 4 -> {
                double A = 0, B = 0, C = 0;
                System.out.println("Введите стороны треугольника :   ");
                System.out.print("Сторона А = " ); A = new Scanner(System.in).nextDouble();
                System.out.print("Сторона B = "); B = new Scanner(System.in).nextDouble();
                System.out.print("Сторона С = "); C = new Scanner(System.in).nextDouble();
                figure1 = new Triangle(A, B, C);
                System.out.println();
                System.out.println("Периметр прямоугольника = " + figure1.perimeter() + "\n"+
                        "Площадь прямоугольника = "+ figure1.area());
            }
        }

    }
}
