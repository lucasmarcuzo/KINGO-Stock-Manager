package util;

// @author LucasMarcuzo

public class Formatacao {
    
    public String converterVirgulaParaPonto(String pValor){
        String retorno = "";
        boolean valorGrande = false;
        
        for (char c : pValor.toCharArray()) {
            if(c == '.'){
                valorGrande = true;
                break;
            }
        }
        
        for (int i = 0; i < pValor.length(); i++) 
        {
            if (pValor.charAt(i) == ',' && valorGrande == false)
            {
                retorno += '.';
            }
            else
            {
                retorno += pValor.charAt(i);
            }
        }
        return retorno;
    }
}
