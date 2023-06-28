package liskovSubstitution;

public class Pessoa {
    private String nome;
    private  int idade;

    private String apelido;

    public Pessoa(String nome, int idade, String apelido) {
        this.nome = nome;
        this.idade = idade;
        this.apelido = apelido;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getApelido() {
        return apelido;
    }

    public void mostrarInfo(){
        System.out.println("Meu nome é: "+getNome());
        System.out.println("Minha idade é: "+getIdade());
        System.out.println("Meu apelido é: "+getApelido());
    }
}
