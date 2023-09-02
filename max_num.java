import java.util.*;
import java.lang.*;
import java.io.*;
public class MyClass {
    public static void main(String []args) {
        int nums[]={1,6,990,7,5,3};
        List<String> strs = new ArrayList<>();
        for(int num:nums){
            strs.add(String.valueOf(num));
        }
        Collections.sort(strs,(a,b)->(b+a).compareTo(a+b));
        if(strs.get(0).equals("0")) System.out.println("0");
        StringBuilder number = new StringBuilder();
        for(String str:strs){
            number.append(str);
        }
        System.out.println(number.toString());
    }
}
//        Collections.sort(strs,(a,b)->(b+a).compareTo(a+b));       EXPLANATION

// The line Collections.sort(strs, (a, b) -> (b + a).compareTo(a + b)); is used to sort a list of strings in a specific order.
// In this case, the Collections.sort() method is used to sort the strs list. The second argument (a, b) -> (b + a).compareTo(a + b) is a lambda expression that defines the comparison logic for the sorting.
// The lambda expression (a, b) -> (b + a).compareTo(a + b) takes two strings a and b as input and concatenates them in two different ways: (b + a) and (a + b). It then compares the two concatenated strings using the compareTo() method, which returns a negative integer, zero, or a positive integer depending on whether the first string is less than, equal to, or greater than the second string.
// By using this lambda expression as the second argument of Collections.sort(), the list of strings strs will be sorted in a way that the concatenated strings (b + a) are compared to (a + b). This sorting logic ensures that the strings are arranged in a specific order based on their concatenated values.
// Note: The variables a and b in the lambda expression represent two strings from the strs list that are being compared during the sorting process.
