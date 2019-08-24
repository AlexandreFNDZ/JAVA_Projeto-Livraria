
package model.bean;

/**
 *
 * @author Alexandre / Elias / Elzio
 */
public class Produtos {
    private int cod_prod;
    private String nome_prod;
    private String descrição;
    private String unidade;
    private float precoUni;

    public int getCod_prod() {
        return cod_prod;
    }
    public void setCod_prod(int cod_prod) {
        this.cod_prod = cod_prod;
    }
    
    public String getNome_prod() {
        return nome_prod;
    }
    public void setNome_prod(String nome_prod) {
        this.nome_prod = nome_prod;
    }
    
    public String getDescrição() {
        return descrição;
    }
    public void setDescrição(String descrição) {
        this.descrição = descrição;
    }
    
    public String getUnidade() {
        return unidade;
    }
    public void setUnidade(String unidade) {
        this.unidade = unidade;
    }
    
    public float getPrecoUni() {
        return precoUni;
    }
    public void setPrecoUni(float precoUni) {
        this.precoUni = precoUni;
    }
    
}
