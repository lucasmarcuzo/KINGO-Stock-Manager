package model;
/**
*
* @author LucasMarcuzo
*/
public class ModelEstoque {

    private int estId;
    private String estResponsavel;
    private String estTipoMov;
    private String estDescricao;
    private int estQuantidade;
    private String estValor;
    private int fkProId;
    private int fkUsuId;

    /**
    * Construtor
    */
    public ModelEstoque(){}

    /**
    * seta o valor de estId
    * @param pEstId
    */
    public void setEstId(int pEstId){
        this.estId = pEstId;
    }
    
    /**
    * @return pk_estId
    */
    public int getEstId(){
        return this.estId;
    }

    /**
    * seta o valor de estResponsavel
    * @param pEstResponsavel
    */
    public void setEstResponsavel(String pEstResponsavel){
        this.estResponsavel = pEstResponsavel;
    }
    
    /**
    * @return estResponsavel
    */
    public String getEstResponsavel(){
        return this.estResponsavel;
    }

    /**
    * seta o valor de estTipoMov
    * @param pEstTipoMov
    */
    public void setEstTipoMov(String pEstTipoMov){
        this.estTipoMov = pEstTipoMov;
    }
    
    /**
    * @return estTipoMov
    */
    public String getEstTipoMov(){
        return this.estTipoMov;
    }

    /**
    * seta o valor de estDescricao
    * @param pEstDescricao
    */
    public void setEstDescricao(String pEstDescricao){
        this.estDescricao = pEstDescricao;
    }
    
    /**
    * @return estDescricao
    */
    public String getEstDescricao(){
        return this.estDescricao;
    }

    /**
    * seta o valor de estQuantidade
    * @param pEstQuantidade
    */
    public void setEstQuantidade(int pEstQuantidade){
        this.estQuantidade = pEstQuantidade;
    }
    
    /**
    * @return estQuantidade
    */
    public int getEstQuantidade(){
        return this.estQuantidade;
    }

    /**
    * seta o valor de estValor
    * @param pEstValor
    */
    public void setEstValor(String pEstValor){
        this.estValor = pEstValor;
    }
    
    /**
    * @return estValor
    */
    public String getEstValor(){
        return this.estValor;
    }

    /**
    * seta o valor de fkProId
    * @param pFkProId
    */
    public void setFkProId(int pFkProId){
        this.fkProId = pFkProId;
    }
    
    /**
    * @return fk_fkProId
    */
    public int getFkProId(){
        return this.fkProId;
    }

    /**
    * seta o valor de fkUsuId
    * @param pFkUsuId
    */
    public void setFkUsuId(int pFkUsuId){
        this.fkUsuId = pFkUsuId;
    }
    
    /**
    * @return fk_fkUsuId
    */
    public int getFkUsuId(){
        return this.fkUsuId;
    }

    @Override
    public String toString(){
        return "ModelEstoque {" + "::estId = " + this.estId + "::estResponsavel = " + this.estResponsavel + "::estTipoMov = " + this.estTipoMov + "::estDescricao = " + this.estDescricao + "::estQuantidade = " + this.estQuantidade + "::estValor = " + this.estValor + "::fkProId = " + this.fkProId + "::fkUsuId = " + this.fkUsuId +  "}";
    }
    
}