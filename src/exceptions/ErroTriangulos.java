package exceptions;

public class ErroTriangulos extends RuntimeException {

	/**
	 * Serial Version UID
	 */
	private static final long serialVersionUID = 3035509704205890324L;
	public ErroTriangulos(String msg){
	        super(msg);
	    }
	public ErroTriangulos(String msg, Throwable cause){
	        super(msg, cause);
	    }
}
