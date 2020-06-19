import java.util.Scanner;
public class q8 {
    public static void main(String[] args){
        System.out.println("Что это такое: синий, большой, с усами и полностью набит зайцами?");
        Scanner in = new Scanner(System.in);
        int i = 0;
        while(i<3){
            String s = in.nextLine();
            switch (s){
                case "Троллейбус":
                    System.out.println("Правильно!");
                    i=3;
                    break;
                case "Сдаюсь":
                    System.out.println("Правильный ответ: Троллейбус");
                    i=3;
                    break;
                case "троллейбус":
                System.out.println("Правильно!");
                i=3;
                break;
                default:
                    System.out.println("Подумай ещё.");
                    i++;
                    break;

            }
        }
    }
}
