package entities;

public class ParametrosInvalidosException extends Exception {
	private static final long serialVersionUID = 1L;

	public String mensage;
	
	public ParametrosInvalidosException(String mensage) {
		this.mensage = mensage;
	}
}
