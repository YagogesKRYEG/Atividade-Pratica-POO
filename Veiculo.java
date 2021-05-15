import java.util.Scanner;
public class veiculo {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        GerenciarVeiculos gerencia = new GerenciarVeiculos();
        String Placa,Modelo,Marca,Tipodecombustivel;
        int menu,Anodefabricacao;
        
        double Valordemercado;

        do {
            System.out.println("Adicionar veículo");
            System.out.println("Remover veículo");
            System.out.println("Listar Carros por combustivel");
            System.out.println("Lista de veiculos");
            System.out.println("Obter valor do imposto");
            System.out.println("Localizar veículo pela placa");
            
                menu = Integer.parseInt(entrada.nextLine());

            switch (menu) {
                case 1:
                    System.out.println("Modelo do Carro");
                    Modelo = entrada.nextLine();
                    System.out.println(" Marca do Carro");
                    Marca = entrada.nextLine();
                    System.out.println(" Placa do Carro");
                    Placa = entrada.nextLine();
                    System.out.println("tipo de Combustivel do Carro");
                    Tipodecombustivel = entrada.nextLine();
                    System.out.println(" Ano de Fabricaçâo do Carro");
                    Anodefabricacao = Integer.parseInt(entrada.nextLine());
                    System.out.println(" Valor de Mercado do Carro?");
                    Valordemercado = Double.parseDouble(entrada.nextLine());
                    gerencia.adicionarVeiculo(Modelo, Marca, Placa, Tipodecombustivel, Anodefabricacao, Valordemercado);
                    
                    break;
            
                case 2:
            
                    System.out.println("Placa do Veículo a ser Removido");
                    Placa = entrada.nextLine();
                    gerencia.remover(Placa);
                    break;
            
                case 3:
                    System.out.println("Placa do Veículo a ser encontrado");
                    Placa = entrada.nextLine();
                    System.out.println(gerencia.buscarPorPlaca(Placa));
                    break;
            
                case 4:
                    System.out.println(gerencia.listarVeiculos());    
                
                    
                    
                    break;
            
                case 5:
                    
                    break;
            
                case 6:
                    

                    break;

                default:
                    System.out.println("Não encontrado!");
                    break;
            }
        } while (menu != 7);


        entrada.close();
    }
}