package atividadepoo;
import java.util.Scanner;

public class Veiculos{
    
   Scanner entrada = new Scanner(System.in);
    

    private String modelo;
    private String marca;
    private String tipodecombustivel;
    private String placa;
    private double anodefabricação;
    private double valordemercado;
    private double calcularimposto; 
    private double valor;


         public String getModelo(){
        return (modelo);
     }
     public String getMarca(){
        return (marca);
     }
     public String gettipodecombustivel(){
      return (tipodecombustivel);
     }
    public String getplaca(){
      return (placa);
     }
    public double getanodefabricação(){
     return (anodefabricação);
     }
     public double getcalcularimposto(){
      return (calcularimposto);
     }
    public void setValordemercado(double valordemercado){
        this.valor = valordemercado;
    }

    public double calcularImposto(){
   if(Anodefabricacao <= 2000){
       return (0);}
   else{
       switch (Tipodecombustivel) {

           case "diesel":
               imposto = (Valordemercado * 0.04);
               break;
           case "gasolina":
               imposto = (Valordemercado * 0.04);
               break;
          
           case "flex":
               imposto = (Valordemercado * 0.04);
               break;
           default: 
               imposto = (Valordemercado * 0.03);
               break;
       }
       return imposto;
   }

}
public String imprimir(){
   return ("Modelo: " + Modelo + "\nMarca: " + Marca + "\nPlaca: " + Placa + 
   "\nTipo de Combustivel: " + Tipodecombustivel + "\nAno de Fabricação: " + 
   Anodefabricacao + "\nValor de Mercado: " + Valordemercado);
}
}



