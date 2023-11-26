import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int tamanho, codigo, idade, opçao;
        double altura, peso;
        String nome, genero;
        System.out.println("Informe o tamanho da lista ");
        tamanho = in.nextInt();
        ListadePacientes lista = new ListadePacientes(tamanho);
        
        do{
            menu();
            opçao = in.nextInt();
            switch (opçao) {
                case 1:System.out.println("Informe o nome do paciente a ser pesquisado");
                    nome = in.nextLine();
                    if (lista.buscaPacientePorNome(nome)!=null)
                            System.out.println(lista.buscaPacientePorNome(nome).toString());
                        else
                            System.out.println("Nome de paciente não encontrado");
                    break;
                
                case 2:System.out.println("Digite o código: ");
                    codigo = in.nextInt(); 
                    if (lista.buscaPacientePorCodigo(codigo)!=null){
                        System.out.println(lista.buscaPacientePorCodigo(codigo).toString());
                    }
                    else{
                        System.out.println("Código de paciente não encontrado ou não cadastrado");
                    }
                    break;
                
                case 3:
                        do{
                            System.out.println("Informe uma idade a ser consultada (idade entre [0,120])");
                            idade = in.nextInt();
                        }while (idade>=0 && idade<=120);
                        Paciente [] listaAux = lista.listaPorIdade(idade);
                        System.out.println("Os pacientes com idade superior à "+ idade + " são: ");
                        for(int i=0; i<lista.getProximoIndice(); i++){
                            System.out.println("/n" + listaAux[i].toString());
                        }
                    
                    break;
                
                case 4:
                        System.out.println("Os paciente cadastrados são: ");
                        Paciente [] lista2 = lista.lista2();
                        if(lista.getProximoIndice()==0){
                            System.out.println("Nenhum paciente cadastrado");
                        }
                        else{
                            for(int i=0; i<lista.getProximoIndice(); i++){
                            System.out.println("/n" + lista2[i].toString());
                            }
                        }
                        
                    break;
                case 5: 
                    do{
                        System.out.println("Informe o nome do paciente");
                        nome = in.nextLine();
                    }while (nome !=null);
                
                    do{
                        System.out.println("Informe o gênero do paciente digite F (feminino) ou  M (masculino)");
                        genero = in.nextLine();
                    }while (confereGenero(genero));

                    Paciente p = new Paciente(nome, genero);
                    if (lista.cadastraPaciente(p))
                            System.out.println("Paciente cadastrado");
                    else
                            System.out.println("Nome ou código já utilizados, paciente não cadastrado");
                        break;

                case 6: 
                    System.out.println("Informe o código do paciente");
                    codigo = in.nextInt();
                    System.out.println("Informe o peso do paciente no intervalo (0,150kg]");
                    peso=in.nextDouble();
                    if(lista.alteraPeso(codigo, peso)){
                        System.out.println("Peso do paciente alterado");
                    }
                    else{
                        System.out.println("Código não cadastrado ou peso fora do intervalo (0,150kg]");
                        System.out.println("Não foi possível alterar o peso do paciente");
                    }
                    break;
                    
                case 7:
                    System.out.println("Informe o código do paciente");
                    codigo = in.nextInt();
                    System.out.println("Informe a altura do paciente no intervalo (0,2.5m]");
                    altura=in.nextDouble();
                    if(lista.alteraPeso(codigo, altura)){
                        System.out.println("Altura do paciente alterado");
                    }
                    else{
                        System.out.println("Código não cadastrado ou altura fora do intervalo (0,2.5m]");
                        System.out.println("Não foi possível alterar a altura do paciente");
                    }
                    
                    break;
                case 8:
                    
                    break;
                case 9:
                    
                    break;
                case 10:
                    
                    break;
                
                case 11:
                    System.out.println("Saindo da Lista de Pacientes");
                    break;

                default:
                    System.out.println("Opção inválida");
                    break;
            }

        }while(opçao!=11);



    }

    public static void menu(){
        System.out.println("Menu de Opções:");
        System.out.println("1. Consultar Paciente por Nome");
        System.out.println("2. Consultar Paciente por Código");
        System.out.println("3. Listar Pacientes com Idade Acima de...");
        System.out.println("4. Listar Todos os Pacientes");
        System.out.println("5. Cadastrar Paciente");
        System.out.println("6. Alterar Peso de Paciente");
        System.out.println("7. Alterar Altura de Paciente");
        System.out.println("8. Alterar Gênero de Paciente");
        System.out.println("9. Alterar Idade de Paciente");
        System.out.println("10. Mostrar IMC de Paciente");
        System.out.println("11. Sair");
        System.out.print("Escolha uma opção: ");
    }

    public static boolean confereGenero(String genero){
        if(genero.toUpperCase()=="F") return true;
        else if (genero.toUpperCase()=="M")return true;
        return false;
    }
}
