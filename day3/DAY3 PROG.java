{\rtf1\ansi\ansicpg1252\deff0\nouicompat\deflang1033{\fonttbl{\f0\fnil\fcharset0 Calibri;}}
{\*\generator Riched20 10.0.19041}\viewkind4\uc1 
\pard\sa200\sl276\slmult1\ul\f0\fs18\lang9 *isPrime?\ulnone\par
import java.io.*;\par
import  java.util.*;\par
class UserMainCode\par
\{\par
 public int isPrime(int input1)\{\par
  int count=0;\par
 for(int i=2;i<=Math.sqrt(input1);i++)\par
\{\par
 if(input1%i==0)\par
     count++;\par
\}\par
if(count==0)\par
 return 2;\par
 else\par
return 1;\par
 \}\par
\}\par
\par
\ul *FACTORIAL of a number\par
\ulnone import java.io.*;\par
import  java.util.*;\par
class UserMainCode\par
\{\par
 public int nFactorial(int input1)\{\par
  int fact=1;\par
for(int i=1;i<=input1;i++)\par
 \{\par
fact=fact*i;\par
 \}\par
return fact;\par
 \}\par
\}\par
\par
\ul *nth Fibonacci: Write a function to return the nth number in the Fibonacci series.\par
\ulnone import java.io.*;\par
import  java.util.*;\par
class UserMainCode\par
\{\par
 public long nthFibonacci(int input1)\{\par
 if(input1==1)\par
 return 0;\par
if(input1==2)\par
 return 1;\par
 else\par
 return nthFibonacci(input1-1)+nthFibonacci(input1-2);\par
 \}\par
\}\par
\ul\par
*Nth Prime\par
\ulnone import java.io.*;\par
import  java.util.*;\par
class UserMainCode\par
\{\par
 public int NthPrime(int input1)\{\par
       int count=0,pcount=0,i;\par
  for(i=2;i<=100000;i++)\par
  \{\par
   count=0;\par
   for(int j=2;j<=Math.sqrt(i);j++)\par
   \{\par
    if(i%j==0)\par
     count++;\par
   \}\par
   if(count==0)\par
    pcount++;\par
   if(pcount==input1)\par
    break;\par
  \}\par
  return i; \par
\}\}\par
\par
\par
\par
\ul *Number of Prime numbers in specified range.\par
\ulnone import java.io.*; \par
import java.util.*;\par
class UserMainCode\{     \par
  public int countPrimesInRange(int input1, int input2)\{      \par
 \par
   int count=0;        \par
   int pcount=0;         \par
  for(int i=input1;i<=input2;i++)\{   \par
      \par
  count=0;        \par
for(int j=2;j<=Math.sqrt(i);j++) \{       \par
 \par
if(i%j==0)         \par
  count++;       \par
  \}       \par
if(count==0)         \par
  pcount++;     \par
  \} \par
  return count; \par
  \}\}\par
\par
\ul *All Digits Count\par
\ulnone import java.io*;\par
import java.util.*;\par
class UserMainCode\par
\{\par
   public int allDigitsCount(int input1)\par
\{\par
   String str=Integer.toString(input1);\par
   return str.length();\par
  \}\par
\}\par
\par
\par
*\ul Unique Digit Count\par
\ulnone import java.io.*;\par
import  java.util.*;\par
\par
class UserMainCode\{\par
\par
public int uniqueDigitsCount(int input1)\{\par
\par
String str = Integer.toString(input1);\par
\par
int len=str.length();   \par
\par
int count=0;\par
\par
for(int i=0;i<len-1;i++)\{           \par
\par
for(int j=i+1;j<len;j++)\{               \par
\par
if(str.charAt(i)==str.charAt(j)) \{           \par
\par
count++;                     \par
break;                 \par
\}\} \par
 \}       \par
  return len-count;   \par
\}\}\par
\par
\par
*\ul Non-Repeated Digits Count\par
\ulnone import java.io.*;\par
import  java.util.*;\par
class UserMainCode\par
\{\par
public int nonRepeatDigitsCount(int input1)\{\par
String str = Integer.toString(input1);\par
int len=str.length();\par
int count=0,pcount=0;\par
for(int i=0;i<len;i++)\par
\{\par
          count=0;\par
for(int j=0;j<len;j++)\par
\{\par
                if(i!=j)\par
if(str.charAt(i)==str.charAt(j))\par
\{\par
count++;\par
break;\par
\}\par
\}\par
            if(count==0)\par
              pcount++;\par
\}\par
return pcount;\par
\}\par
\}\par
\par
*\ul digitSum : sum of all digits in N\par
\ulnone import java.io.*;\par
import  java.util.*;\par
class UserMainCode\par
\{\par
                public int digitSum(int input1)\{\par
                                int neg=input1;\par
                                if(input1<0)\par
                                \{\par
                                                input1*=-1;\par
                                \}\par
                                int len=Integer.toString(input1).length();\par
                                if(len==1)\par
                                \{\par
                                                if(neg<0)\par
                                                return input1*-1;\par
                                                else\par
                                                                return input1;\par
                                \}\par
                                else\par
                                \{\par
                                                int sum=0;\par
                                while(input1!=0)\par
                                \{\par
                                                int rem=input1%10;\par
                                                sum+=rem;\par
                                                input1/=10;\par
                                \}\par
                                                if(neg<0)\par
                                                                return digitSum(sum*-1);\par
                                                else\par
                                                                return digitSum(sum);\par
                \}\}\par
\}\par
\par
\par
\par
*\ul Even Digits' Sum:\par
\ulnone import java.io.*;\par
import  java.util.*;\par
class UserMainCode\par
\{\par
public int EvenDigitsSum(int inpu1)\{\par
int sum=0;\par
while(input1!=0)\par
\{\par
int n=input1%10;\par
if(n%2==0)\par
sum+=n;\par
input1/=10; \par
\}\par
return sum;\par
\}\par
\par
*\ul digitSum odd: sum of odd digits in N\ulnone\par
import java.io.*;\par
import  java.util.*;\par
class UserMainCode\par
\{\par
public int OddDigitsSum(int inpu1)\{\par
int sum=0;\par
while(input1!=0)\par
\{\par
int n=input1%10;\par
if(n%2!=0)\par
sum+=n;\par
input1/=10; \par
\}\par
return sum;\par
\}\par
\par
\par
*\ul digitSum opt: sum of even or odd digits\ulnone\par
import java.io.*;\par
import  java.util.*;\par
class UserMainCode\par
\{\par
public int OddDigitsSum(int input1,String input2)\{\par
      int sum=0;\par
        if(input2.equals("even"))\par
        \{\par
while(input1!=0)\par
    \{\par
 int n=input1%10;\par
 if(n%2==0)\par
    sum+=n;\par
  input1/=10; \par
    \}\par
        \}\par
        else\par
        \{\par
    while(input1!=0)\par
    \{\par
     int n=input1%10;\par
   if(n%2!=0)\par
    sum+=n;\par
  input1/=10; \par
    \}\par
        \}\par
       return sum;\par
    \}\par
\}\par
\par
\par
}
�
