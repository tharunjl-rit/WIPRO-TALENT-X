{\rtf1\ansi\ansicpg1252\deff0\nouicompat\deflang1033{\fonttbl{\f0\fnil\fcharset0 Calibri;}}
{\*\generator Riched20 10.0.19041}\viewkind4\uc1 
\pard\sa200\sl276\slmult1\ul\f0\fs18\lang9 * Is Palindrome Number?\par
\ulnone import java.io.*;\par
import  java.util.*;\par
class UserMainCode\par
\{\par
public int isPalinNum(int input1)\{\par
String str=Integer.toString(input1);\par
        int len=str.length();\par
        String str1="";\par
        for(int i=len-1;i>=0;i--)\par
        \{\par
            str1+=str.charAt(i);\par
        \}\par
        if(str.equals(str1))\par
        return 2;\par
        else\par
        return 1;\par
    \}\par
\}\par
\par
*\ul Is Palindrome possible?\par
\ulnone import java.io.*;\par
import  java.util.*;\par
class UserMainCode\par
\{\par
public int isPalinNumPossible(int input1)\{\par
String str=Integer.toString(input1);\par
        int count[] = new int[256];\par
Arrays.fill(count, 0); // to initialize all values to zero\par
        for (int i = 0; i < str.length(); i++)\par
          count[(int)(str.charAt(i))]++;\par
        int odd = 0;\par
        for (int i = 0; i < 256; i++)\par
        \{\par
           if ((count[i] & 1) == 1)\par
            odd++;\par
          if (odd > 1)\par
            return 1;\par
        \}\par
        return 2;\par
    \}\par
\}\par
\par
*\ul Create PIN using three given input numbers\par
\ulnone import java.io.*;\par
import  java.util.*;\par
class UserMainCode\par
\{\par
public int createPIN(int input1,int input2, int input3)\{\par
int arr[]=\{input1,input2,input3\};\par
    int max=0,min;\par
    double sum=0.0;\par
    double place=1.0;\par
    int num;\par
    for(int i=0;i<3;i++)\par
    \{\par
        num=arr[i];\par
        while(num!=0)\par
        \{\par
          int r=num%10;\par
            if(r>max)\par
                max=r;\par
            num=num/10;\par
        \}\par
    \}\par
    for(int i=0;i<3;i++)\par
    \{\par
         min=99;\par
          for(int j=0;j<3;j++)\par
          \{\par
              int rem=arr[j]%10;\par
              if(rem<min)\par
                min=rem;\par
                arr[j]/=10;\par
          \}\par
          sum=(min+(sum/place));\par
          sum*=place;\par
          place*=10;\par
    \}\par
      return (int)(max*1000+sum);\par
    \}\par
\}\par
\}\par
\}\par
\par
*\ul Weight of a hill pattern\par
\ulnone import java.io.*;\par
import  java.util.*;\par
class UserMainCode\par
\{\par
public int totalHillWeight(int input1, int input2, int input3)\{\par
        int sum=0;\par
        for(int i=0;i<input1;i++)\par
        \{\par
            for(int j=0;j<=i;j++)\par
            \{\par
                sum+=input2;\par
            \}\par
            input2+=input3;\par
        \}\par
        return sum;\par
    \}\par
\}\par
\par
\par
\ul\par
\ulnone\par
}
�
