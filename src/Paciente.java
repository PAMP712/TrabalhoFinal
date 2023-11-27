public class Paciente {
    private int codigo;
    private String nome;
    private String genero;
    private double peso;
    private double altura;
    private int idade;
    
    public Paciente(String nome, String genero, int codigo){
        this.nome = nome;
        this.genero = genero;
        peso = 0;
        this.codigo =codigo;
        altura=0;
        idade=0;

    }
    public int getCodigo() {
        return this.codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return this.genero;
    }

    public void setGenero(String genero) {
            this.genero = genero.toUpperCase();
    }

    public double getPeso() {
        return this.peso;
    }

    public boolean setPeso(double peso) {
        if(peso>0 && peso<= 150){
            this.peso = peso;
            return true;
        }
        else{
            return false;
        }
    }

    public double getAltura() {
        return this.altura;
    }

    public boolean setAltura(double altura) {
        if(altura>0 && altura<= 2.5){
            this.altura = altura;
            return true;
        }
        else{
            return false;
        }
    }

    public int getIdade() {
        return this.idade;
    }

    public boolean setIdade(int idade) {
        if(idade>=0 && idade<= 120){
            this.idade = idade;
            return true;
        }
        else{
            return false;
        }
    }

    public double calculaPesoIdeal(){
        if(genero.equalsIgnoreCase("M")){
            return ((72.2*altura)-58);
        }
        else{
            return ((62.1*altura)-44.7);
        }
    }
    
    public double calculaIMC(){
        return (peso/(Math.pow(altura, 2)));
    }
    
    public String toString() {
        return "/n codigo:" + getCodigo()+ "/n nome:" + getNome()+ "/n genero:" + getGenero()+ "/n peso:" + getPeso()+ "/n altura:" + getAltura()+ "/n idade:" + getIdade();
    }
    

    

}
