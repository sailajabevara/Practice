class Solution {

    String roundToNearest(String str) {

        // Complete the function

        if(str.charAt(str.length()-1)-'0'<= 5){

            return str.substring(0,str.length()-1)+"0";

        }     

        int pc = 1, m = 10;

        char[] ch = str.toCharArray();

        int i = str.length()-2;

        ch[i+1] = '0';

        while(i >= 0 && pc == 1){

            int cn = ch[i] -'0';

            cn += pc;

            ch[i] = (char)((cn%10)+'0') ;

            if(cn>=10)

              pc = 1;

            else

              pc = 0;

            i--;

        }

        if(pc==1)

        return "1"+new String(ch);

        return new String(ch);

    }

}

