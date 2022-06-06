package util;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRException;

public class IReport extends OpcoesRelatorios{
        
    public static void viewReport(String reportName, int salvarImprimir){
        try
        {
            //Se: -1 Cancela / 0 = Salva / 1 = Imprime.
            if(salvarImprimir == 0)
            {
                net.sf.jasperreports.engine.design.JasperDesign jasperDesign = net.sf.jasperreports.engine.xml.JRXmlLoader.load(reportName);
                net.sf.jasperreports.engine.JasperReport jasperReport = net.sf.jasperreports.engine.JasperCompileManager.compileReport(jasperDesign);
                net.sf.jasperreports.engine.JasperPrint jasperPrint = net.sf.jasperreports.engine.JasperFillManager.fillReport(jasperReport, null, ConexaoSQLite.conexao);
            
                String nomeRelatorio = "Relatorio_Estoque_" + gerarDataRelatorio() + ".pdf";
                net.sf.jasperreports.engine.JasperExportManager.exportReportToPdfFile(jasperPrint, caminhoRelatorios() + nomeRelatorio);
                Desktop desktop = Desktop.getDesktop();  
                desktop.open(new File(caminhoRelatorios() + nomeRelatorio)); 
                System.out.println(caminhoRelatorios() + nomeRelatorio);
            }
            else if (salvarImprimir == 1)
            {
                net.sf.jasperreports.engine.design.JasperDesign jasperDesign = net.sf.jasperreports.engine.xml.JRXmlLoader.load(reportName);
                net.sf.jasperreports.engine.JasperReport jasperReport = net.sf.jasperreports.engine.JasperCompileManager.compileReport(jasperDesign);
                net.sf.jasperreports.engine.JasperPrint jasperPrint = net.sf.jasperreports.engine.JasperFillManager.fillReport(jasperReport, null, ConexaoSQLite.conexao);
               
                net.sf.jasperreports.view.JasperViewer.viewReport(jasperPrint, false);   
                
            }
        }
        catch(IOException | JRException ex)
        {
            JOptionPane.showMessageDialog(null, ex, "Erro!", JOptionPane.ERROR_MESSAGE);
        }    
    }
}