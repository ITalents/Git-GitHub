public class Pessoa {
    private String nome;
    private int idade;
    private double peso;
    private double altura;

    public Pessoa(String nome){
        this.nome = nome;
    }

    public Pessoa(String nome,int idade, double peso, double altura){
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.altura = altura;
    }

    public String getNome() {
        return nome;
    }
    public int getIdade() {
        return idade;
    }
    public double getPeso() {
        return peso;
    }
    public double getAltura() {
        return altura;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void Envelhecer(){
        this.idade += 1;
    }

    public void ApresentacaoPessoal(){
        System.out.println("Nome: "+nome+", "+idade+" anos.");
        System.out.println("Peso: "+peso+" Kg, Altura: "+altura+" CM");
    }

    public void Rejuvenecer(){
        this.idade -=1;
    }

    public double CalcularIMC(double peso, double altura){
        if (peso <= 0 || altura <= 0) {
            System.out.println("Peso e altura devem ser valores positivos, maiores que zero!");
            return -1;
        }
        double imc = peso / (altura * altura);
        return imc;
    }
}
