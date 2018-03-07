import com.sun.org.apache.xpath.internal.SourceTree;
import java.util.Scanner;


public class debitClassNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());
        int thirdNum = Integer.parseInt(scanner.nextLine());
        int fourthNum = Integer.parseInt(scanner.nextLine());
        System.out.printf("%04d %04d %04d %04d", firstNum, secondNum, thirdNum, fourthNum);

    }
}
