import java.util.Scanner;

public class Main {
    public  static int choose()
    {
        int ch;
        Scanner in=new Scanner(System.in);
        System.out.println("Выберете действие: ");
        System.out.println("1. Добавить элемент");
        System.out.println("2. Удалить элемент");
        System.out.println("3. Вернуть элемент");
        System.out.println("4. Посмотреть массив");
        System.out.println("5. Выход");
        for (ch = in.nextInt(); ch <= 0 || ch > 5; ch = in.nextInt()) {
            System.out.println("Ошибка!");
        }
        return ch;
    }
    public  static void main(String[] args) {
        int ch = choose(), value, index;
        System.out.println("Введите размер массива: ");
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        System.out.println("Заполните массив: ");
        CurrentArray arr = new CurrentArray(N);

        for (int i = 0; i < N; i++) {
            value = input.nextInt();
            arr.setValue(value,i);
        }
        do {
            if (ch == 1) {
                System.out.println("Какой элемент добавить?");
                value = input.nextInt();
                System.out.println("На какую позицию?");
                index = input.nextInt();
                arr.valueArray(value, index);
            } else if (ch == 2) {
                System.out.println("Введите индекс элемента, который вы хотите удалить");
                index = input.nextInt();
                arr.deleteValue(index);
            } else if (ch == 3) {
                System.out.println("Введите индекс элемента, который вы хотите вернуть");
                index = input.nextInt();
                System.out.println(arr.getValue(index));
            } else if (ch == 4) {
                System.out.println("Массив: ");
                arr.printArray();
            }
            ch=choose();
        } while (ch!=5);
    }
}