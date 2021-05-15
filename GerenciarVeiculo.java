package atividadepoo;
import java.util.ArrayList; 
public class GerenciarVeiculo {     
    public static void main (String []args){
        ArrayList<Veiculo> automotores = new ArrayList<> ();}    
        
public addVeiculo (String modelo, String marca, String tipodecombustivel, String placa, int anodefabricação, double valordemercado, double calcularimposto, double valor, int n){
    Veiculo veiculo = new Veiculo(modelo,marca,tipodecombustivel,placa,anodefabricação,valordemercado,calcularimposto,valor,n);
    automotores.add(veiculo); 
}
    public boolean contains(String elemento){
         for (String placa : a) { 
             automotores.remove(veiculo);
             if(placa==elemento) 
                 return true; 
                 return false;
                 }
                 
    } 
    
        public boolean add(Placa obj) {
      try {
          list.add(obj);
      } catch (OutOfMemoryException e) {
          return false;
          return true;
      } 
      
   }

    public boolean buscarPorPlaca(Placa obj) {
        if (list.contains(obj)) 
        return true;
    
    list.add(obj);
    return null;
 }  
        public String listarVeiculos(){
    return veiculos.size()+"";
}

    public String retornaVeiculos (){
    return (automotores) ;
}

    public double calcularImposto (String Placa){
    if (i > 1) {
        placa = Double.perseDouble(dados.get(i - 2).toString());
    }
    return imposto;

     if (i < 1){
         return -1;
     }        
  }   
  public String listarCombustivel(String Combustivel){
    return combustivel.size()+"";
 } 
public void remover(String Placa){
    for (int i = 0; i < automotores.size(); i++) {  
      if (automotores.get(i).getPlaca().equals(placa)) {  
        automotores.remove(i); } } }
        
        
public void remover(Veiculo veiculo){
    automotores.remove(veiculo); }

        public Veiculo retornaVeiculo(String placa){
    for (int i = 0; i < automotores.size(); i++) 
      if (automotores.get(i).getPlaca().equals(placa))   
        return automotores.get(i); 
        break;
        return null; 
        
        public ArrayList retornaLista(){
    return ("automotores"); }
        
        public String retornaAutomotores(){
    Automotores=automotores.size();
    return Automotores; 

     } 
} 
