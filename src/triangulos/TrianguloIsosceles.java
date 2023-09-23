package triangulos;
/**
 * Classe que representa um triângulo isósceles.
 */
public class TrianguloIsosceles extends Triangulo {
    
    private String nome;
    
    /**
     * Construtor padrão para um TrianguloIsosceles.
     * Define o nome do triângulo como "Triângulo Isósceles".
     */
    public TrianguloIsosceles() {
        this.nome = "Triângulo Isósceles";
    }
    
    /**
     * Obtém o nome do triângulo isósceles.
     * 
     * @return Uma string contendo o nome do triângulo.
     */
    public String getNome() {
        return nome;
    }
}

