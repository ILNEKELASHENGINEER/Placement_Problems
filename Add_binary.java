public class MyClass {
    public static void main(String args[]) {
        String a ="11";
        String b="1";
        StringBuilder out = new StringBuilder();
        int carry=0;
        int i = a.length()-1;
        int j = b.length()-1;
        System.out.println(i+" "+j);
        while(i>=0 || j>=0 || carry!=0){
            int digitA = i>=0 ? a.charAt(i)-'0':0;
            int digitB = j>=0 ? b.charAt(j)-'0':0;
            int currentSum = digitA + digitB + carry;
            System.out.println(digitA+" "+digitB+" "+currentSum);
            out.insert(0,currentSum%2);
            carry = currentSum/2;

            i--;
            j--;
            
        }
        System.out.println(out);
        
    }
}
//java program

