package in.co.rays.project_3.exception;

/**
 * @author Amit joshi
 */

public class ApplicationException extends Exception {
	private static final long serialVersionUID = 1L;
	
	public ApplicationException(String msg) {
		super(msg);
	}
}
