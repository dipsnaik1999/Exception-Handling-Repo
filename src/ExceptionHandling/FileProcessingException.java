package ExceptionHandling;


class FileProcessingException extends Exception {
	    
		private static final long serialVersionUID = 1L;

		public FileProcessingException(String message, Throwable cause) {
	        super(message, cause);
	    }
	}

