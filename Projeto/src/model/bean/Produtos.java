
package model.bean;

/**
 *
 * @author Alexandre / Elias / Elzio
 */
public class Produtos {
    private int cod_prod;
    private String descrição;
    private float unidade;
    private float precoUni;

    public int getCod_prod() {
        return cod_prod;
    }
    public void setCod_prod(int cod_prod) {
        this.cod_prod = cod_prod;
    }
    public String getDescrição() {
        return descrição;
    }
    public void setDescrição(String descrição) {
        this.descrição = descrição;
    }
    public float getUnidade() {
        return unidade;
    }
    public void setUnidade(float unidade) {
        this.unidade = unidade;
    }
    public float getPrecoUni() {
        return precoUni;
    }
    public void setPrecoUni(float precoUni) {
        this.precoUni = precoUni;
    }
}
