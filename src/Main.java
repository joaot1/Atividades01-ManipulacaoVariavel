public class Main {
    public static void main(String[] args) {
        System.out.println("Joao");

        int idade = 18; // A idade da pessoa é 18 anos
        double altura = 1.80; // A Altura da pessoa é de 1.80
        String nome = "Joao"; // O nome da pessoa é Joao
        boolean estudante = true; // A Pessoa é estudante

        // Calcule a soma de Duas idades e armazene o resultado em uma variável.
        int idade1 = 15; // Primeira idade
        int idade2 = 15; // Segunda idade

        // Calcula a idade das pessoas
        int somaDasIdades = idade1 + idade2;

        // Multiplique a altura por um fator de 2 e armezene o resultado.
        double altura1 = 1.75; // Altura em metros.

        // Multiplica a altura por 2
        double alturaDobrada = altura1 * 2;

        //Concatene o nome da pessoa com uma saudação, por exemplo, "Olá,[Nome]!".
        String nome1 = "joao"; // Nome da pessoa.

        //Concatenando a saudação com o nome
        String saudacao = "Olá, " + nome1 + "!";

        //Exibe os Resultados
        System.out.println("idades é :" + idade);
        System.out.println("Altura:" + altura);
        System.out.println("Nome:" + nome);
        System.out.println("É estudante? :" + estudante);
        System.out.println("A soma das idades é :" + somaDasIdades);
        System.out.println("A Altura dobrada é =" + alturaDobrada);
        System.out.println(saudacao);
    }

}