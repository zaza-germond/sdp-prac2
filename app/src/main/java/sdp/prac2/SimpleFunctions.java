package sdp.prac2;

import java.util.ArrayList;
import java.util.List;

public class SimpleFunctions {
    //public SimpleFunctions() {}
    public List<Integer> Task1(List<Integer> a, List<Integer> b){ //g22g8170
        List<Integer> finallist=new ArrayList<>();

        for (int i=0;i<a.size();i++){
            finallist.add(a.get(i)+b.get(i));
        }
        return finallist;
    }
    
  
    public List<Integer> Task6(List<Integer> numbers) {
        List<Integer> roundedNumbers = new ArrayList<>();
        
        for (int num : numbers) {
            int roundedNum = roundUpToNearestMultipleOf100(num);
            roundedNumbers.add(roundedNum);
        }
        
        return roundedNumbers;
    }

    //Task2: Removes the first character from every element in a list.
    //If a list has no character remove it from the output.
    public List<String> Task2(List<String> inputList){
        List<String> outputList = new ArrayList<>();
        for(String element : inputList){
            if(element.length() > 0){ //checks if the element has characters
                //Removes the first character and adds it to the output list
                outputList.add(element.substring(1));
            }
        }return outputList;
    }
    
    private int roundUpToNearestMultipleOf100(int num) {
        if (num % 100 == 0) {
            return num; // No rounding needed
        } else {
            return ((num / 100) + 1) * 100; // Round up to nearest multiple of 100
        }
    }


}
