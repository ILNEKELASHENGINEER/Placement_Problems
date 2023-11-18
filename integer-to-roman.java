class Solution {
    public String intToRoman(int N) {
        StringBuilder res = new StringBuilder();
        while(N > 999){
            res.append('M');
            N -= 1000;
        }
        // --
        if(N > 899){
            res.append("CM");
            N -= 900;
        }
        else if(N > 499){
            res.append('D');
            N -= 500;
        }
        else if(N > 399){
            res.append("CD");
            N -= 400;
        }
        while(N > 99){
            res.append('C');
            N -= 100;
        }
        // --
        if(N > 89){
            res.append("XC");
            N -= 90;
        }
        else if(N > 49){
            res.append('L');
            N -= 50;
        }
        else if(N > 39){
            res.append("XL");
            N -= 40;
        }
        while(N > 9){
            res.append('X');
            N -= 10;
        }
        // --
        if(N > 8){
            res.append("IX");
            N -= 9;
        }
        else if(N > 4){
            res.append('V');
            N -= 5;
        }
        else if(N > 3){
            res.append("IV");
            N -= 4;
        }
        while(N > 0){
            res.append('I');
            N -= 1;
        }
        return res.toString();
    }
}
