package exemplos;

public class Caneta {
    String cor = "SemCor";
    String ponta = "fina";
    String marca;

    public void trocaCor(String corCliente) throws Exception {
        if(corCliente.equals("AZUL")|| corCliente.equals("VERMELHO") ||corCliente.equals("PRETO")){
            cor =  corCliente;
        }else{
            throw new Exception("Cor invalida");
        }
    }
    public void rabiscar(){
        System.out.println("Rabiscando com a cor " + cor);
    }
    public void pintar(){
        System.out.println("Pintando com a cor " + cor);
    }

    public void escrever(String texto){
        System.out.println("Escrevendo com a cor " + cor + " "+ texto);
    }

    public String mostrarCorAtual(){
          return cor;
    }

    public void inserirMarca(String marcaCliente){
        marca  = marcaCliente;
    }
}
