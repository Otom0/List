import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        String deals;
        String nameOfList;
        String deleteList;
        int deleteDeal;
        System.out.println("Выберите действие и введите код команды: "
                + "\n1 - ADD"
                + "\n2 - EDIT"
                + "\n3 - DELETE"
                + "\n4 - LIST");
        Scanner scanner = new Scanner(System.in);
        List<String> todoList = new LinkedList<>();
        todoList.add(0,"Найти деньги");
        todoList.add(1,"Попросить у кого-то деньги");
        todoList.add(2,"Заработать деньги");
        todoList.add(3,"Украсть у кого-то деньги");
        todoList.add(4,"Напечатать деньги самому");
        String str = "ADD";
        String str1 = "EDIT";
        String str2 = "DELETE";
        String str3 = "LIST";
        if (scanner.hasNext(str)) {
            String addList = scanner.nextLine();
            System.out.println("Вы добавили новое дело: \"" + addList + "\"");
            todoList.add(addList);
            for (String edit : todoList){
                System.out.println(edit);
            }
        }
        if (scanner.hasNext(str1)) {
            System.out.println("Введите номер дела, которое хотите отредактировать");
            nameOfList = scanner.nextLine();
            todoList.add(nameOfList);
            todoList.remove(nameOfList);
            int deleteList1 = Integer.parseInt(scanner.nextLine());
            System.out.println("Введите новое дело");
            String editList1 = scanner.nextLine();
            System.out.println("Вы отредактировали дело.");
            deleteDeal = deleteList1;
            todoList.set(deleteDeal - 1, editList1);
        }
        if (scanner.hasNext(str2)){
            System.out.println("Введите номера дела, которое хотите удалить");
            deleteList = scanner.nextLine();
            todoList.remove(deleteList);
            int deleteList1 = Integer.parseInt(scanner.nextLine());
            System.out.println("Вы удалили дело № " + deleteList1);
            deleteDeal = deleteList1;
            todoList.remove(deleteDeal - 1);
        }
        if (scanner.hasNext(str3)){
            for (String edit : todoList){
                System.out.println(edit);
            }
        }
    }
}