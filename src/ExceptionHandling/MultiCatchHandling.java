package ExceptionHandling;

	import java.io.FileReader;
	import java.io.IOException;
	import java.util.Scanner;

	public class MultiCatchHandling {
		
	    public static void main(String[] args) {
	        try {
	            processFile("example.txt");
	        } catch (IOException | IllegalArgumentException e) {
	            System.out.println("Caught an exception: " + e.getMessage());
	        }
	    }

	    public static void processFile(String fileName) throws IOException, IllegalArgumentException {
	        if (fileName == null || fileName.isEmpty()) {
	        	// Throwing IllegalArgumentException if the file name is invalid
	            throw new IllegalArgumentException("File name cannot be null or empty");
	        }
	         // Using try-with-resources to ensure the file reader is closed automatically
	        try (FileReader reader = new FileReader(fileName);
	        		Scanner scanner = new Scanner(reader)) {
	            while (scanner.hasNextLine()) {
	                System.out.println(scanner.nextLine());
	            }
	        }
	    }
	}

