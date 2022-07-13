import java.text.DecimalFormat;
import java.util.Scanner;

public class EX4 {
    public void ex4() {
        DecimalFormat casasDecimais = new DecimalFormat("0.00");
        double SP = 67836.43,
        RJ = 36678.66,
        MG = 29229.88,
        ES = 27165.48,
        Outros = 19849.53,
        somaEstados = SP+RJ+MG+ES+Outros;
        
        System.out.println("SP corresponde a "+casasDecimais.format(SP/somaEstados*100)+" % do faturamento.");
        System.out.println("RJ corresponde a "+casasDecimais.format(RJ/somaEstados*100)+" % do faturamento.");
        System.out.println("MG corresponde a "+casasDecimais.format(MG/somaEstados*100)+" % do faturamento.");
        System.out.println("ES corresponde a "+casasDecimais.format(ES/somaEstados*100)+" % do faturamento.");
        System.out.println("Outros corresponde a "+casasDecimais.format(Outros/somaEstados*100)+" % do faturamento.");
    }
}