package util;

//@author LucasMarcuzo

import java.io.File;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class OpcoesRelatorios{
    
    public static String caminhoAplicacao(){
        File file = new File("");
        String directoryName = file.getAbsoluteFile().toString();
        return directoryName;
        //System.getProperty("user.dir");
    }
    
    public static String caminhoRelatorios(){
        return caminhoAplicacao() + "\\Relatorios\\relatoriosPDF\\";
    }
    
    public static String gerarDataRelatorio(){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("ddMMyyyy-HHmm");
        return dtf.format(LocalDateTime.now());
    }
}
