package Java;

public class A_Gatos {
    // Atributos
    private String nome;
    private String cor;
    private int idade;


    // Métodos contrutores
   

    public void Status(){
        System.out.println("\n----------------------------------------");
        System.out.println("Nome do gato: " + this.getNome());
        System.out.println("Cor do gato: " + this.getCor());
        System.out.println("Idade do gato: " + this.getIdade());
    }

    

    public A_Gatos() {
        this.setNome(nome);
        this.setCor(cor);
        this.setIdade(idade);
    }


    // Métodos personalizados
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

}