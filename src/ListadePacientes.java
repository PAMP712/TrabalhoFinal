/*
- método que consulta um paciente por nome;
- método que consulta um paciente por código;
- método que mostra uma lista de todos os pacientes com idade acima de um valor informado pelo parâmetro;
- método que lista todos os pacientes;
- método que cadastra pacientes na lista. O método deve garantir que nenhum paciente de mesmo nome e codigo sejam adicionados a lista de pacientes.
- método que altera o peso de um determinado paciente, informando o seu código;
- método que altera a altura de um determinado paciente, informando o seu código;
- método que altera o sexo de um determinado paciente, informando seu código;
- método que mostra o IMC de um determinado paciente. 
*/
public class ListadePacientes {
    private int proximoIndice;
    private Paciente[] lista;
    
    public ListadePacientes(int tamanho){
        lista = new Paciente[tamanho];
        proximoIndice=0;
    }

    public int getProximoIndice(){
        return proximoIndice;
    }

    public boolean cadastraPaciente(Paciente p){
        
        if (proximoIndice==0){
            lista[proximoIndice] = p;
            proximoIndice++;
            return true;
        }
        else {
            for (int i=0;i<proximoIndice;i++){
                if (lista[i].getCodigo()==p.getCodigo() || lista[i].getNome().equalsIgnoreCase(p.getNome()))
                    return false;    
            }
            lista[proximoIndice] = p;
            proximoIndice++;
            return true;
        }
    }

    public Paciente buscaPacientePorNome(String nome){
        for (int i=0;i<proximoIndice;i++){
            if (lista[i].getNome().equalsIgnoreCase(nome))
                return lista[i];
        }
        return null;
    }
    
    public Paciente buscaPacientePorCodigo(int codigo){        
        for (int i=0;i<proximoIndice;i++){
            if (lista[i].getCodigo()==codigo)
                return lista[i];
        }
        return null;
    }

    public Paciente[] listaPorIdade(int idade){
        Paciente[] auxiliar = new Paciente[proximoIndice];
        int proxind2 =0;
        for(int i=0; i<proximoIndice;i++){
            if(lista[i].getIdade()>=idade){
                auxiliar[proxind2] = lista[i];
                proxind2 ++;
            }
        } 
        return auxiliar;
    }
    public Paciente[] lista2(){
        Paciente[] aux2 = new Paciente[proximoIndice];
        int proxind3 =0;
        for(int i=0; i<proximoIndice;i++){
                aux2[i] = lista[i];
            }
        return aux2;
        } 
        
    

    public boolean alteraPeso (int codigo, double peso){
        if(proximoIndice==0){
            return false;
        }
        else{
            for(int i=0; i<proximoIndice;i++){
                if(lista[i].getCodigo()==codigo){
                    lista[i].setPeso(peso);
                    return true;
                }
            }
            return false;
        }
    }

    public boolean alteraAltura (int codigo, double altura){
        if(proximoIndice==0){
            return false;
        }
        else{
            for(int i=0; i<proximoIndice;i++){
                if(lista[i].getCodigo()==codigo){
                    lista[i].setAltura(altura);
                }
            }
            return false;
        }
    }
    
    public boolean alteraGenero (int codigo, String genero){
        if(proximoIndice==0){
            return false;
        }
        else{
            for(int i=0; i<proximoIndice;i++){
                if(lista[i].getCodigo()==codigo){
                    lista[i].setGenero(genero);
                    return true;
                }
            }
            return false;
        }
    }
    public boolean alteraIdade (int codigo, int idade){
        if(proximoIndice==0){
            return false;
        }
        else{
            for(int i=0; i<proximoIndice;i++){
                if(lista[i].getCodigo()==codigo){
                    lista[i].setIdade(idade);
                }
            }
            return false;
        }
    }

    public double mostraIMC(int codigo){
            for(int i=0; i<proximoIndice;i++){
                if(lista[i].getCodigo()==codigo){
                    return lista[i].calculaIMC();
                }
            }
            return 0;
    }

        public String toString(){
            String saida="/n";
            for(int i = 0; i<proximoIndice; i++){
                saida = saida + lista[i].toString();
            }
            return saida;
        }




}
