package triangulos;
/**
 * Classe que representa um triângulo equilátero.
 */
public class TrianguloEquilatero extends Triangulo {
    
    private String nome;
    
    /**
     * Construtor padrão para um TrianguloEquilatero.
     * Define o nome do triângulo como "Triângulo Equilátero".
     */
    public TrianguloEquilatero() {
        this.nome = "Triângulo Equilátero";
    }
    
    /**
     * Obtém o nome do triângulo equilátero.
     * 
     * @return Uma string contendo o nome do triângulo.
     */
    public String getNome() {
        return nome;
    }
}
