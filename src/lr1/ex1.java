package lr1;

public class ex1 {
    public static void main(String[] args) {
        Start();
    }
    static void Start() {
        var in = new java.util.Scanner(System.in);
        var out = System.out;

        out.println("Лаб. №1, задание №1");

        out.print("Введите фамилию: ");
        var firstName = in.nextLine();

        out.print("Введите имя: ");
        var lastName = in.nextLine();

        out.print("Введите отчество: ");
        var middleName = in.nextLine();

        out.printf("Hello: \"%s %s %s\"", firstName, lastName, middleName);
    }
}
