import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

       //aula variaveis
        String nome = "Rogério Skylab: ";
        int valor = 10;
        int valor2 = 34;

        //aula tipo variaveis
        System.out.println(nome + (valor + valor2));
        System.out.println(valor + valor2);
        valor *= valor2;
        System.out.println(valor+"\n");

        //aula operadores lógicos
        int idade = 21;

        boolean resultado;
        resultado = idade >= 18;
        System.out.println(resultado);

        //Aula Estrutura IF/ELSE
        if(idade >= 18){
            System.out.println("Acesso permitido"+"\n");
        }else{
            System.out.println("Acesso negado"+"\n");
        }

        //aula incremento IF/ELSE
        int opcao = 1;

        if(opcao == 1){
            System.out.println("O saldo da sua conta é R$1500,00"+"\n");
        } else if(opcao == 2){
            System.out.println("O usuario cadastrado da conta é Theo Augusto Cardoso"+"\n");
        }else if(opcao ==3){
            System.out.println("Você será encaminhado(a) para um atendente"+"\n");
        }else{
            System.out.println("Opção invalida, por favor tente novamente"+"\n");
        }


        //Aula Arrays
        String[] produtos = {"Pacote Office", "Excel", "Word"};
        System.out.println(produtos[0]);

        //Aula input teclado
        Scanner scan = new Scanner(System.in);
        System.out.println("Qual produto você deseja cadastrar?");
        String produto = scan.next();

        System.out.println("Qual a quantidade do produto sendo cadastrado");
        int quantidade = scan.nextInt();

        System.out.println("Insira o preço do produto");
        double preco = scan.nextDouble();
        //double precototal = preco * quantidade;

        System.out.println("Produto cadastrado com sucesso:\n" + "Produto: " + produto +"\n" +"Quantidade: " + quantidade +"\n" + "Preço do prodduto: " + preco);// +"\n" + "Valor total: " + precototal);

        scan.close();
    }
}