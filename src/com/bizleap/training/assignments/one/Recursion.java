package com.bizleap.training.assignments.one;

import java.util.*;
public class Recursion {
	static int n1=0,n2=1,n3=0;      
    static void print(int n){      
          if(n>0) { 
            n3 = n1 + n2;                       
            n1=n3;            
            System.out.println(n2+"="+n3);       
            n2++;
            print(n-1);      
          }      
    }       

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int n=20;            
		 print(n);

	}

}