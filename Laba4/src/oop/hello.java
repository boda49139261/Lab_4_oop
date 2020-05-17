package oop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class hello {
    public static void main(String[] args) throws IOException {
       // String s ;
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String s = in.readLine();
        int n = 0, i;
        for (i=0; i<=s.length()-1;i++) {
            n = s.codePointAt(i);            //Я-1071;А-1040;я-1103;а-1072;
            if (n==32)//пробіл
                n=n;
            else if (n==46)//крапка
                n=n;
            else if (n==44)//кома
                n=n;
            else if (n==63)//знак оклику
                n=n;
            else if (n==45)//тире
                n=n;
            else if (n==1103)
                n = n - 31; //Заміна 'я' на 'а'
            else if(n==1071)
                n = n - 31; //Заміна 'Я' на 'А'
            else
                n=n+1; // заміна на наступну букву
            System.out.print((char)n);
        }
    }
}

