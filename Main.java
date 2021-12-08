import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        AppData data = new AppData();
        data.readFromFile("Таблица.csv");
        System.out.println(Arrays.toString(data.getHeader()));
        System.out.println(Arrays.deepToString(data.getData()));

        data.writeToCSV("Таблица общая.csv");
    }
}