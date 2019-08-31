
package model.bean;

/**
 *
 * @author Alexandre / Elias / Elzio
 */
public class Produtos {
    private int cod_prod;
    private String titulo;
    private String autor;
    private String genero;
    private String editora;
    private float precoUni;
    
    //Construtor para inicializar os atributos
    public Produtos(int cod_prod, String titulo, String autor, String genero, String editora, float precoUni){
        this.cod_prod = cod_prod;
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.editora = editora;
        this.precoUni = precoUni;
    }
    
    //Recarga de construtor
    public Produtos(){
        
    }

    public int getCod_prod() {
        return cod_prod;
    }
    public void setCod_prod(int cod_prod) {
        this.cod_prod = cod_prod;
    }
    
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    
    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    
    public String getEditora() {
        return editora;
    }
    public void setEditora(String editora) {
        this.editora = editora;
    }
    
    public float getPrecoUni() {
        return precoUni;
    }
    public void setPrecoUni(float precoUni) {
        this.precoUni = precoUni;
    }
    
}
