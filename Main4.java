import java.util.LinkedList;
import java.util.Scanner;

//Принимает от пользователя и “запоминает” строки.
//Если введено print, выводит строки так, чтобы последняя введенная была первой в списке, а первая - последней.
//Если введено revert, удаляет предыдущую введенную строку из памяти.
public class Main4 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        boolean work = true;
        while (work) {
            String line = sc.nextLine();
            if (line.equalsIgnoreCase("print")) {
                for (int i = list.size() - 1; i >= 0 ; i--) {
                    System.out.println(list.get(i));
                }
                System.out.println(list);
            } else if (line.equalsIgnoreCase("revert") && list.size() > 0) {
                list.removeLast();
                System.out.println(list);
            } else {
                list.add(line);
                System.out.println(list);
            }
        }
        sc.close();
    }
}

    

