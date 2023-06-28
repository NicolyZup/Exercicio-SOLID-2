package liskovSubstitution;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("Nicoly",23,"Nic");
        Aluno pessoa2 = new Aluno("Marcos",24,"Ma");

        pessoa1.mostrarInfo();
        pessoa2.mostrarInfo();
    }
}
