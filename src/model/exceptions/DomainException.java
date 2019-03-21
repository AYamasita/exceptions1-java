package model.exceptions;

public class DomainException extends Exception {
   //Exception é um Serialized Class.
	private static final long serialVersionUID = 1L;

	
	public DomainException(String msg) {
		super(msg);
	}

}
