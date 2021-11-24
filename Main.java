public class Main {
    public static void main(String[] args) {

        Competitor[] competitors = {
                new Human("Дядя Федор"),
                new Cat("Матроскин"),
                new Dog("Шарик"),
        };

        Team[] teams = new Team[]{
                new Team("Команда А", new Human("Арнольд"), new Dog("Грелкин"), new Cat("Затычкин")),
                new Team("Команда B", competitors),
        };
        for (Team team : teams) {
            System.out.println("Команда:");
            team.getAllParticipants();
            System.out.println();
        }
        Obstacle[] course = {
                new Cross(500),
                new Wall(10),
                new Water(15)
        };

        for (Team team : teams) {
            Competitor[] result = team.getAllSuccessfulParticipants(course);
            for (int i = 0; i <= result.length - 1; i++) {
                if (result[i] != null) {
                    System.out.println(result[i].getName() + ' ' + result[i].getType());
                }
            }
        }

        Course competition1 = new Course("Полоса препядствий №1", new Wall(1),
                new Wall(1), new Water(1), new Cross(1));

        Course competition2 = new Course("Полоса препядствий №1", new Wall(54),
                new Wall(75), new Water(678), new Cross(190));


        Team teamTest = new Team("Команда B", new Human("Фома"), new Human("Петр Петрович"), new Dog("Дворняжка"));

        competition1.resultOfCourse(new Team("Команда А", new Human("Арнольд"), new Dog("Грелкин"), new Cat("Затычкин")));
        competition2.resultOfCourse(teamTest);
    }
}
