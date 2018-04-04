import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

import static java.lang.String.valueOf;
class Solution {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int sum=0;
        for(int i=0;i<=nums.length-2;i=i+2){
            sum = sum+ nums[i];
        }
        return sum;
    }
}
public class ArrayPartition {

    public static int[] stringToIntegerArray(String input){
        input.trim();
        input.substring(1,input.length()-1);

        if(input.length()==0)
            return new int[0];

        String[] parts = input.split(",");
        int[] output = new int[parts.length];

        for(int i=0;i<output.length;i++ ){
            String part= parts[i].trim();
            output[i] = Integer.parseInt(part);
        }

        return output;

    }

    public static void main(String[] args) throws IOException {
        //Scanner sc = new Scanner(System.in);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String line;

        while((line = br.readLine()) !=null){
            int[] nums= stringToIntegerArray(line);

            int ret= new Solution().arrayPairSum(nums);

            String out = String.valueOf(ret);

            System.out.print(out);
        }

    }
}
