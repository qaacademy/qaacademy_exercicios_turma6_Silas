package exercicios_easy;
public class Exec8 {
    public String calcularImposto(double salario) {
        double ir=0;
        if(salario > 0 && salario <= 1903.98 ) {
            return "Isento de imposto de renda";
        }else{
            if(salario >= 1903.99 && salario <= 2826.65){
                ir = (salario * 0.075)-142.80;
            }
            if(salario >=2826.66 && salario <= 3751.05) {
                ir = (salario * 0.15) - 354.80;
            }
            if(salario >=3751.06 && salario <= 4664.68) {
                ir = (salario * 0.225)-636.13;
            }
            if(salario > 4664.68){
                ir = (salario * 0.275)-869.36;
            }
        }
        return "Salario Bruto:  "+ salario + " - Salario Liquido:  " +  (salario - ir) + " - Imposto a pagar:  " +  ir;
    }
}
