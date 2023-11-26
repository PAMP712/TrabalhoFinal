public class Paciente {
    private int codigo;
    private String nome;
    private char genero;
    private double peso;
    private double altura;
    private int idade;
    
    public Paciente(String nome, char genero){
        this.nome = nome;
        this.genero = genero;
        peso = 0;
        codigo=0;
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

    public char getGenero() {
        return this.genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public double getPeso() {
        return this.peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return this.altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    

    

}
