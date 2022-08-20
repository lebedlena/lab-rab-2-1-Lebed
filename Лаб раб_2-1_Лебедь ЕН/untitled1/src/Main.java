import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Привет! Угадай число!");
        System.out.println("Введи однозначное число и нажми ENTER");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        while (a!=7) {
            a = scan.nextInt();
            System.out.println (a);
        }
        System.out.println("Ура! Задание выполнено!");}
}