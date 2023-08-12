public class Kerek {


////public class Player{
////    int number;
////    String name;
////    String surname;
////    String position;
////    public Player (int number, String name, String surname, String position) {
////        this.number = number;
////        this.name = name;
////        this.surname = surname;
////        this.position = position;
////    }
////    public Player() {
////        this.number = 0;
////        this.name = "no name";
////        this.surname = "no name";
////        this. position = "no name";
////    }
////}
//
//
//
//
////import java.util.ArrayList;
////import java.util.Scanner;
////import java.util.stream.*;
////
////public class Main {
////    public static void main(String[] args) {
////        Scanner in = new Scanner(System.in);
////        int n = in.nextInt();
////        ArrayList<Integer> list = new ArrayList<>();
////        IntStream.range(0,n).forEach(x -> list.add(in.nextInt()));
////        list.stream()
////                .filter(begunok -> begunok > 0)
////                .forEach(begunok -> System.out.print(begunok + " "));
////    }
////}
//
//
////class  Product<T> {
////    String name;
////    float price;
////    T category;
////
////    public Product(String name, float price, T category){
////        this.name = name;
////        this.price = price;
////        this.category = category;
////    }
////    public Product(){
////    }
////    public String getName() {
////        return name;
////    }
////
////    public float getPrice() {
////        return price;
////    }
////
////    public T getCategory() {
////        return category;
////    }
////
////    public void setName(String name) {
////        this.name = name;
////    }
////
////    public void setPrice(float price) {
////        this.price = price;
////    }
////
////    public void setCategory(T category) {
////        this.category = category;
////    }
////    public String getData() {
////        return "Product: " + name + ", Price: " + price + ", Category: " + category;
////    }
////}
//
//
////    public static int getMax(int a, int b, int c){
////        if(a > b && a > c){
////            return a;
////        } else if(b > a && b > c){
////            return b;
////        } else {return c;}
////    }
//
////    public static void contains(String str1, String str2){
////        if (str1.contains(str2)) {
////            System.out.println ("YES");
////        }else {
////            System.out.println("NO");
////        }
////    }
//
//
//    //Создайте такой метод, который принимает в аргументы массив целостных чисел. Программа должна вывести среднее арифметическое всех четных элементов массива.
////    public static int check(int array[]){
////        int sum = 0;
////        int count = 0;
////        for (int i = 0; i < array.length; i++){
////            if (array[i] % 2 == 0) {
////                sum += array[i];
////                count++;
////            }
////        }
////        return (int) sum / count;
////    }
//
//   // Создайте такой метод, который принимает в аргументы массив из целых чисел. Программа должна выводить нечетные числа из массива и остановится, если встретит число 23.
////    public static void check(int array[]){
////        for (int i = 0; i < array.length; i++){
////            if (array[i] == 23){
////                break;
////            }
////            if (array[i] % 2 != 0){
////                System.out.println(array[i]);
////            }
////        }
////    }
//
//   // Напишите метод, который проверяет, делится ли число на 2 без остатка или нет.
////   public static String check(int num){
////       if (num % 2 == 0) {
////           return "YES";
////       } else {
////           return "NO";
////       }
////   }
//
//   // Напишите метод, который в аргументы принимает строку. Нужно посчитать количество гласных букв в строке. (Гласные буквы: a, e, i, o, u)
////   public static int check(String s1){
////       int count = 0;
////       for (int i = 0; i < s1.length(); i++){
////           char c = Character.toLowerCase(s1.charAt(i));
////           if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
////               count++;
////           }
////       }
////       return count;
////   }
//

}
