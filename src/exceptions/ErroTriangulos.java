package exceptions;
/**
 * Uma exceção personalizada para representar erros relacionados a triângulos inválidos.
 */
public class ErroTriangulos extends RuntimeException {

	/**
	 * Serial Version UID
	 */
	private static final long serialVersionUID = 3035509704205890324L;
	/**
     * Construtor que cria uma nova instância de ErroTriangulos com uma mensagem de erro.
     * 
     * @param msg A mensagem de erro associada à exceção.
     */
	public ErroTriangulos(String msg){
	        super(msg);
	    }
	/**
     * Construtor que cria uma nova instância de ErroTriangulos com uma mensagem de erro e uma causa raiz.
     * 
     * @param msg   A mensagem de erro associada à exceção.
     * @param cause A causa raiz que levou à exceção.
     */
	public ErroTriangulos(String msg, Throwable cause){
	        super(msg, cause);
	    }
}