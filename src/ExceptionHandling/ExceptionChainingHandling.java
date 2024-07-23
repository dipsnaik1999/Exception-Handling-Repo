package ExceptionHandling;

	import java.io.FileNotFoundException;
	import java.io.FileReader;


	public class ExceptionChainingHandling {
	    public static void main(String[] args) {
	        try {
	            processFile("nonexistent.txt");
	        } catch (FileProcessingException e) {
	            System.out.println("Caught an exception: " + e.getMessage());
	            e.printStackTrace();
	        }
	    }

	    public static void processFile(String fileName) throws FileProcessingException {
	        try {
	            FileReader reader = new FileReader(fileName);
	        } catch (FileNotFoundException e) {
	            throw new FileProcessingException("File not found: " + fileName, e);
	        }
	    }
	

}
