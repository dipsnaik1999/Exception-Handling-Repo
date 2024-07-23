package ExceptionHandling;

    import java.io.BufferedReader;
	import java.io.FileReader;
	import java.io.IOException;

	public class CheckedExceptionHandling {
	    public static void main(String[] args) {
	        BufferedReader reader = null;
	        try {
	        	// Creates a BufferedReader
	            reader = new BufferedReader(new FileReader("example.txt"));
	            String line;
	            while ((line = reader.readLine()) != null) {
	                System.out.println(line);
	            }
	        } catch (IOException e) {
	            System.out.println("An error occurred while reading the file: " + e.getMessage());
	        } finally {
	            if (reader != null) {
	                try {
	                	// Closing all file connections
	                    // using close() method
	                    reader.close();
	                } catch (IOException e) {
	                    System.out.println("An error occurred while closing the file reader: " + e.getMessage());
	                }
	            }
	        }
	    }
	}


