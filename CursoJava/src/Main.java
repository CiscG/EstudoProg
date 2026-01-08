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
        System.out.println(valor);

        //aula operadores lógicos
        int idade = 21;
        //boolean resultado;
        //resultado = idade >= 18;

        //Aula Estrutura IF/ELSE
        if(idade >= 18){
            System.out.println("Acesso permitido");
        }else{
            System.out.println("Acesso negado");
        }

        //aula incremento IF/ELSE
        int opcao = 1;

        if(opcao == 1){
            System.out.println("O saldo da sua conta é R$1500,00");
        } else if(opcao == 2){
            System.out.println("O usuario cadastrado da conta é Theo Augusto Cardoso");
        }else if(opcao ==3){
            System.out.println("Você será encaminhado(a) para um atendente");
        }else{
            System.out.println("Opção invalida, por favor tente novamente");
        }

    }
}