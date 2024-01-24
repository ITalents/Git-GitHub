public class Main {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Leo");
        pessoa.setIdade(30);

        pessoa.setPeso(93.5);
        pessoa.setAltura(187);

        pessoa.ApresentacaoPessoal();
        System.out.println("Seu IMC é de: " + pessoa.CalcularIMC());
    }
}
