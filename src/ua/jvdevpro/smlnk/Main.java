package ua.jvdevpro.smlnk;

public class Main {

    public static void main(String[] args) {


        Rectangle a = new Rectangle(4, 5);
        Rectangle b = new Rectangle(4, 5);

        System.out.println(a + "\n"); // Использование метода toString();

        System.out.println("hashCode a = " + a.hashCode() + "\n"); // вывод на экран hash кода объекта;

        System.out.println("hashCode b = " + b.hashCode() + "\n");

        System.out.println(a.equals(b) + "\n"); // Метод equals() вернет false, так как сравниваются ссылки, а они разные;

        // Создается 10 объектов без ссылки;
        int n = 10;
        for (; (n-- > 0); ) {
            new Rectangle(3, 4);
        }

        System.gc(); // Принудительный вызов сборщика мусора;
    }
}
