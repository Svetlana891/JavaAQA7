import java.util.Scanner;
public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Какая программа вас интересует?");
        String program = scanner.nextLine();
        System.out.println("Какую ОС вы используете?");
        String os = scanner.nextLine();


        switch (program) {
            case ("IntelliJ IDEA"): {
                System.out.println("Ваша программа IntelliJ IDEA");
                switch (os) {
                    case ("Windows"):
                    case ("Linux"):
                    case ("Mac OS"):
                        System.out.println("https://www.jetbrains.com/ru-ru/idea/");
                        break;
                    default:
                        System.out.println("Неправильно указано ОС");
                }
            } break;
            case ("Java"): {
                System.out.println("Ваша программа Java");
                switch (os) {
                    case ("Windows"):
                    case ("Linux"):
                    case ("Mac OS"):
                        System.out.println("https://www.oracle.com/cis/java/technologies/downloads/");
                        break;
                    default:
                        System.out.println("Неправильно указано ОС");
                }
            } break;
            case ("Git"): {
                                System.out.println("Ваша программа Git");
                                switch (os) {
                                    case ("Windows"):
                                    case ("Linux"):
                                    case ("Mac OS"):
                                        System.out.println("https://git-scm.com/");
                                        break;
                                    default:
                                        System.out.println("Неправильно указано ОС");
                                }
                        }
            default:
                System.out.println("Неправильно выбрана программа");
        }
    }
}
