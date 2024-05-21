package sdp.prac2;

import java.util.ArrayList;
import java.util.List;

public class SimpleFunctions {
    //public SimpleFunctions() {}
    
    public List<Integer> Task6(List<Integer> numbers) {
        List<Integer> roundedNumbers = new ArrayList<>();
        
        for (int num : numbers) {
            int roundedNum = roundUpToNearestMultipleOf100(num);
            roundedNumbers.add(roundedNum);
        }
        
        return roundedNumbers;
    }
    
    private int roundUpToNearestMultipleOf100(int num) {
        if (num % 100 == 0) {
            return num; // No rounding needed
        } else {
            return ((num / 100) + 1) * 100; // Round up to nearest multiple of 100
        }
    }


}
