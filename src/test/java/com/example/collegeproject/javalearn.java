package com.example.collegeproject;

import java.util.*;
class generic<T>
{
    
}
public class javalearn {
    public static void main(String[] args) {
        System.out.println("enter number");
        Scanner input1= new Scanner(System.in);
        String s=input1.next();
      int size=s.length();
        HashMap<Character, Character> m = new HashMap<>();
       // Map<Integer, Integer>m;
        m.put('1','1');
        m.put('8','8');
        m.put('0','0');
        m.put('9','6');
        m.put('6','9');
        boolean flag=true;
        for(int i=0;i<s.length();i++)
        {
            char left = s.charAt(i);
            char right = s.charAt(size-i-1);
            if(m.containsKey(left) && m.get(left)==right)
            {
                continue;
            }
            else {
                flag=false;
            }
        }
        if(flag)
        {
            System.out.println("yes");
        }
        else {
            System.out.println("no");
        }

//        System.out.println("enter string");
//        Scanner input1= new Scanner(System.in);
//        String s=input1.next();
//        s=s.toLowerCase();
//      boolean check =true;
//   for(int i = 0; i<s.length(); i++)
//   {
//     if(s.charAt(i)!=s.charAt(s.length()-i-1))
//     {
//         check=false;
//         break;
//     }
//   }
//if(check)
//    System.out.println("it is a  pelindrom");
//else
//    System.out.println("not a pelindrom ");
//}
//        System.out.println("enter start");
//        Scanner input1 = new Scanner(System.in);
//        int start = input1.nextInt();
//        System.out.println("enter end");
//        int end = input1.nextInt();
//
//       Boolean[] prime_till_squareroot= new Boolean[(int)Math.sqrt(end)+1];
//       Arrays.fill(prime_till_squareroot,false);
//
//
//         for(int i=2;i<=Math.sqrt(end);i++)
//         {
//             if(!prime_till_squareroot[i])
//             {
//                 for(int j=i*2;j<=Math.sqrt(end);j+=i) {
//                     prime_till_squareroot[j] = true;
//                 }
//             }
//         }
//        Boolean[] prime= new Boolean[end-start+1];
//        Arrays.fill(prime,false);
//        for(int i=2;i<prime_till_squareroot.length;i++)
//        {
//            if(!prime_till_squareroot[i])
//            {
//                for(int j=i*2 ; j<end ; j+=i)
//                {
//                  if(j>=start)
//                  {
//                      prime[j-start]=true;
//                  }
//                }
//
//            }
//        }
//        for(int i=0;i<prime.length;i++)
//        {
//            if(!prime[i]) {
//                System.out.println(i + start);
//            }
//        }

    }
}
