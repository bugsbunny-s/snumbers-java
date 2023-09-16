import java.util.Arrays;
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.print("Dizi boyutunu giriniz : ");
        int indexArray = input.nextInt();

        int[] numbers = new int [indexArray];

        for(int i = 0; i < numbers.length; i++){
            System.out.print((i+1) + "  . Elamanı giriniz : ");
            numbers[i]= input.nextInt();
        }
        System.out.println("Dizi : " + Arrays.toString(numbers));
        Arrays.sort(numbers);
        System.out.print("Sıralı : " + Arrays.toString(numbers));
    }
}
