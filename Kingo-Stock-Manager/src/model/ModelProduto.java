package model;
/**
*
* @author Lucas Marcuzo
*/
public class ModelProduto {

    private int proId;
    private String proDescricao;
    private int proQuantidade;
    private String proValor;

    /**
    * Construtor
    */
    public ModelProduto(){}

    /**
    * seta o valor de proId
    * @param pProId
    */
    public void setProId(int pProId){
        this.proId = pProId;
    }
    /**
    * @return pk_proId
    */
    public int getProId(){
        return this.proId;
    }

    /**
    * seta o valor de proDescricao
    * @param pProDescricao
    */
    public void setProDescricao(String pProDescricao){
        this.proDescricao = pProDescricao;
    }
    /**
    * @return proDescricao
    */
    public String getProDescricao(){
        return this.proDescricao;
    }

    /**
    * seta o valor de proQuantidade
    * @param pProQuantidade
    */
    public void setProQuantidade(int pProQuantidade){
        this.proQuantidade = pProQuantidade;
    }
    /**
    * @return proQuantidade
    */
    public int getProQuantidade(){
        return this.proQuantidade;
    }

    /**
    * seta o valor de proValor
    * @param pProValor
    */
    public void setProValor(String pProValor){
        this.proValor = pProValor;
    }
    /**
    * @return proValor
    */
    public String getProValor(){
        return this.proValor;
    }

    @Override
    public String toString(){
        return "ModelProduto {" + "::proId = " + this.proId + "::proDescricao = " + this.proDescricao + "::proQuantidade = " + this.proQuantidade + "::proDouble = " + this.proValor +  "}";
    }
}