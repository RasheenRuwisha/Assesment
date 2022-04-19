import java.util.Scanner;

public class Assesment{


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input the numbers (separated by space): ");
        String  input = sc.nextLine();
        String[] inputArr = input.split(" ");
        Integer[] arr  = new Integer[inputArr.length];
        for(int i = 0; i < inputArr.length; i++){
            arr[i] = Integer.parseInt(inputArr[i]);
        }


    }

}