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

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public void mostrarInfo(){
        System.out.println("Meu nome é: "+getNome());
        System.out.println("Minha idade é: "+getIdade());
        System.out.println("Meu apelido é: "+getApelido());
    }
}
