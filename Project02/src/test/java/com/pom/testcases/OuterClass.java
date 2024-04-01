package com.pom.testcases;


	public class OuterClass {
	    
		int x=90;
		public void OuterMethod() {
			 System.out.println("Outer method called");
		}
	    // Inner class
	    class InnerClass {
	    	public int y=100;
	        public void innerMethod() {
	            System.out.println("Inner method called");
	            System.out.println("Outer Class Variable value : " +x);
	        }
	        public void innerMethod1(OuterClass outerclass) {
//	        	OuterClass outerObject = new OuterClass();
//	            System.out.println("Outer Class Variable value : " outerObject.x);
	        }
	    }
	    
	    public static void main(String[] args) {
	        OuterClass outerObject = new OuterClass();
	        
	        // Create an instance of the inner class using the outer class instance
	        OuterClass.InnerClass innerObject = outerObject.new InnerClass();
	        
	        // Call the method of the inner class
	        innerObject.innerMethod();
	        outerObject.OuterMethod();
	    }
	}
