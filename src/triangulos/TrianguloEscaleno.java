package triangulos;
/**
 * Classe que representa um triângulo escaleno.
 */
public class TrianguloEscaleno extends Triangulo {
    
    private String nome;
    
    /**
     * Construtor padrão para um TrianguloEscaleno.
     * Define o nome do triângulo como "Triângulo Escaleno".
     */
    public TrianguloEscaleno() {
        this.nome = "Triângulo Escaleno";
    }
    
    /**
     * Obtém o nome do triângulo escaleno.
     * 
     * @return Uma string contendo o nome do triângulo.
     */
    public String getNome() {
        return nome;
    }
}
