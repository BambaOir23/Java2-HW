import java.util.*;

    public class Main {
        public static void main(String[] args) {
            String[] words = {"Батон", "Молоко", "Шоколад", "Колбаса", "Молоко", "Кефир", "Батон", "Сырок", "Лимонад", "Мороженое", "Сыр", "Молоко", "Огурец", "Батон"};

            // задача 1. Подсчет слов
            Map<String, Integer> map = new HashMap<>();
            for (String word : words) {
                map.put(word, map.getOrDefault(word, 0) + 1);
            }
            System.out.println(map);
            System.out.println("");

            Set<String> uniq = new HashSet<>(Arrays.asList(words));
            System.out.println(uniq);
            System.out.println("");

            // Задача 2. Телефонный справочникю
            Phonebook pb = new Phonebook();

            pb.add("Антонов", "2523737");
            pb.add("Баев", "2527878");
            pb.add("Флеров", "2529090");
            pb.add("Антонов", "78001002003");
            pb.add("Капустин", "2526565");
            pb.add("Захаров", "2527171");
            pb.add("Антонов", "2520202");
            pb.add("Гавряева", "2525555");
            pb.add("Соловьева", "2527777");

            System.out.println(pb.get("Антонов"));
        }
    }
