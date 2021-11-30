import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Integer arr1[] = {1, 2, 3, 4, 5, 6, 7};
        String arr2[] = {"A", "Б", "В"} ;
        swap(arr1,1,4);
        swap(arr2,0,2);

        String[] arrayOfStrings = {"A", "Б", "В", "Г"};
        asList(arrayOfStrings);

        Box<Orange> or = new Box<>();
        Box<Orange> or1 = new Box<>();
        Box<Apple> ap = new Box<>();
        Box<Apple> ap1 = new Box<>();
        System.out.println("Задача 3");
        System.out.println("'g' - addFruit: ");
        or.addFruit(new Orange(),10);
        or1.addFruit(new Orange(),12);
        ap.addFruit(new Apple(),8);
        ap1.addFruit(new Apple(),4);
        System.out.println("Ящик 1: "+or.getWeight());
        System.out.println("Ящик 2: "+or1.getWeight());
        System.out.println("Ящик 3: "+ap.getWeight());
        System.out.println("Ящик 4: "+ap1.getWeight());
        System.out.println("'e' - compare(): ");
        System.out.println("Ящик 1 равен Ящику 3: "+or.compare(ap));
        System.out.println("Ящик 2 равен Ящику 4: "+or1.compare(ap1));
        System.out.println("'f' - pourTo(): ");
        or.pourTo(or1);
        ap.pourTo(ap1);
        System.out.println("'d' - getWeight(): ");
        System.out.println("Ящик 1: "+or.getWeight());
        System.out.println("Ящик 2: "+or1.getWeight());
        System.out.println("Ящик 3: "+ap.getWeight());
        System.out.println("Ящик 4: "+ap1.getWeight());


    }
    public static void swap(Object[] arr, int n1, int n2){
        System.out.println("Задача 1: "+Arrays.toString(arr));
        Object sw = arr[n1];
        arr[n1]=arr[n2];
        arr[n2]=sw;
        System.out.println("Резултат замены: "+Arrays.toString(arr)+"\n================================");
    }
    public static <T> void asList(T[]arr){
//        почему нельзя использовать метод addAll с T?
//        List<String> listOfStrings = new ArrayList<>();
//        Collections.addAll(listOfStrings,arr);
//        for (String str : listOfStrings)
//            System.out.print(" " + str);
        ArrayList<T> alt = new ArrayList<>(Arrays.asList(arr));
        System.out.println("Задача 2 и результат преобразования: "+alt+"\n================================");
    }
}