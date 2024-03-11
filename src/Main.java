import java.util.Calendar;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("\n");
        System.out.println("Введите полное ФИО:");
        String fio = sc.next();
        String [] personInfo = fio.split(" ");
        if (personInfo.length != 3) {
            System.out.println("Неверно введено фио!");
            return;
        }
        System.out.println("Введите дату рождения в формате: dd.mm.yyyy");
        String date = sc.next();
        var dateArr = date.split("\\.");
        if (dateArr.length != 3) {
            System.out.println("Неверно введена дата рождения!");
            return;
        }
        else {
            for (var num : dateArr){
                try {
                    Integer.parseInt(num);
                }
                catch (NumberFormatException ex) {
                    System.out.println("Неверно введена дата рождения!");
                    return;
                }
            }
        }
        Person guy = new Person(personInfo[1], personInfo[0], personInfo[2], date);
        guy.printPersonInfo();
    }
}



//    Программа запрашивает у пользователя Фамилию, Имя, Отчество (по-русски) и дату рождения.
//        В ответ программа выводит: Фамилию Инициалы, пол, возраст в полных годах. Дедлайн до 9.04 включительно