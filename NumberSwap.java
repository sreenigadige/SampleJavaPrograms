package com.samplejavaprograms.numbers;

public class NumberSwap {
    
    public static  void swap (int a ,int b){
    	System.out.println("a value is :" + a);
    	System.out.println("b value is :" + b);
    	int  temp = a; 
    	  a = b;   
    	  b = temp;
    	System.out.println("after swapping values are :" );
    	System.out.println("a value is :" + a);
  		System.out.println("b value is :" + b);		
     }
	
    public static void swapWithOutTemp(int a, int b) {
    	a = a + b; // 10+20 = 30
    	b = a - b; // 30-20 = 10
    	a = a - b; // 30-10 = 20
    	
    	System.out.println(" swapping without using temp var :" );
    	System.out.println("a value is :" + a);
  		System.out.println("b value is :" + b);		
    }
	
	public static void main(String[] args) {
		swap (10,20);
		swapWithOutTemp(10,20);
		
	}

}
