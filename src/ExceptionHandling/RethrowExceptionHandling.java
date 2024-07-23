package ExceptionHandling;

public class RethrowExceptionHandling {

	    public static void main(String[] args) {
	        try {
	            method1();
	        } catch (Exception e) {
	            System.out.println("Caught an exception in main: " + e.getMessage());
	            e.printStackTrace();
	        }
	    }

	    public static void method1() throws Exception {
	        try {
	            method2();
	        } catch (Exception e) {
	            throw new Exception("Exception occurred in method1", e);
	        }
	    }

	    public static void method2() throws Exception {
	        throw new Exception("Original exception in method2");
	    }
	}


