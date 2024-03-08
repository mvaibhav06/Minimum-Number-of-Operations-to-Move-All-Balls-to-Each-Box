import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinOperations {
    public static int[] minOperations(String boxes) {
        List<Integer> temp = new ArrayList<>();
        for(int i=0; i<boxes.length(); i++){
            if(boxes.charAt(i) == '1'){
                temp.add(i);
            }
        }
        int[] out = new int[boxes.length()];
        for(int i=0; i<boxes.length(); i++){
            int sum = 0;
            for(int j=0; j<temp.size(); j++){
                if(i != temp.get(j)){
                    sum += Math.abs(temp.get(j)-i);
                }
            }
            out[i] = sum;
        }
        return out;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(minOperations("001011")));
    }
}
