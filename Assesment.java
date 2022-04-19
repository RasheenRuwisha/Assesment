import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Assesment{


    // For example passing in [1, 1, 2, 4, 4, 5, 5, 5, 6, 7, 9] the following results should occur:
 
    // 1) output all pairs would output: [1,9], [1,9], [4,6], [4,6], [5,5], [5,5], [5,5], [5,5], [5,5], [5,5], [6,4], [6,4] [9,1] , [9,1] 
    // 2) output unique pairs only once would output: [1,9], [4,6], [5,5], [6,4], [9,1] 
    // 3) output the same combo pair only once would output: [1,9], [4,6], [5,5]   

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input the numbers (separated by space): ");
        String  input = sc.nextLine();
        String[] inputArr = input.split(" ");
        Integer[] arr  = new Integer[inputArr.length];
        for(int i = 0; i < inputArr.length; i++){
            arr[i] = Integer.parseInt(inputArr[i]);
        }

        System.out.println("All Pairs:");
        System.out.println(getAllPairs(arr , 10));
    }


    public static List<List<Integer>> getAllPairs(Integer[] array, int sum){

        List<List<Integer>> result = new ArrayList<>();
        for(int i =0; i<array.length;i++){
            for(int j = 0; j<array.length;j++){
                if(array[i] + array[j] == sum){
                    List<Integer> pair = new ArrayList<>();
                    pair.add(array[i]);
                    pair.add(array[j]);
                    result.add(pair);
                }
            }
        }
        return result;
    }

}