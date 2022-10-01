package exercicios_easy;

import javax.swing.*;

//7-) Faça um algoritmo para ler um valor de salário, calcular e exibir o valor do INSS a ser pago. Respeitando a tabela abaixo:
public class Exec7 {
    public String calcularInss(double salario) {
        double inss;
        if(salario <= 1045.00) {
            inss = salario * 0.075;
            return "O Valor que você de inss será: " +inss;
        }
        if(salario >= 1045.01 && salario<= 2089.60) {
            inss = salario * 0.9;
            return "O Valor que você de inss será: " +inss;
        }
        if(salario >= 2089.61 && salario<=3134.40) {
            inss = salario * 0.12;
            return "O Valor que você de inss será: " +inss;
        }
        if(salario >= 3134.41 && salario <= 6101.06) {
            inss = salario * 0.14;
            return "O Valor que você de inss será: " +inss;
        }
        if(salario >= 6101.07) {
            inss = 854.15;
            return "O Valor que você de inss será: " +inss;
        }
        return null;
    }
}
