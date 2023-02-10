import java.util.*;
//@carlossergio***
public class FuncionarioMain {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner scan = new Scanner(System.in);
        List<Funcionario> funcionarios = new ArrayList<>();

        System.out.println("Informe a quantidade de funcionários: ");
        while (!scan.hasNextInt()){
            System.out.println("valor não permitido, tente novamente: ");
            scan.nextLine();
        }

        int n = scan.nextInt();
        scan.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.println("--------------------------------------------");
            System.out.println("Informe o id do #" +(i+1) + " funcionário: " );
            while (!scan.hasNextInt()){
                System.out.println("valor incorreto, tente novamente: ");
                scan.nextLine();
            }
            int id = scan.nextInt();
            scan.nextLine();


            System.out.println("Informe o nome do funcionário: ");
            while (!scan.hasNextLine()){
                System.out.println("valor incorreto, tente novamente: ");

            }
            String nome = scan.nextLine();


            System.out.println("Informe o salário do funcionário: ");
            double salario = scan.nextDouble();
            scan.nextLine();

            Funcionario funcionario = new Funcionario(id, nome, salario);
            funcionarios.add(funcionario);
        }

        // boolean
        boolean encontrado=false;

        do {
            System.out.println("Qual o id do funcionario que irá receber aumento? ");
           // caso o user digite um valor diferente de um int o loop vai tratar o erro pedir que o mesmo digite novamente
            while (!scan.hasNextInt()){
                System.out.println("valor incorreto, tente novamente: ");
                scan.nextLine();
            }
            int id = scan.nextInt();

            System.out.println("Quanto % deseja acrescentar no salário do funcionário? ");
            while (!scan.hasNextDouble()){
                System.out.println("valor incorreto, tente novamente: ");
                scan.nextLine();
            }
            double percentage = scan.nextDouble();

            // faz a chamada da classe Funcionario, percorre a lista de funcionários
            // compara o id da lista com o id digitado
            // com a expressão sendo verdadeira e o ‘loop’ será finalizado com break
            for (Funcionario funcionario : funcionarios) {
                if(funcionario.getId() == id){
                    funcionario.aumentarSalario(percentage);
                    encontrado = true;
                    break;
                }
               // SE O ID NÃO FOR ENCONTRADO O LOOP CONTINUA
                if (funcionario.getId() !=id){
                    System.out.println("Id não encontrado, tente novamente: ");
                }
            }

        }while (!encontrado);



        for (Funcionario funcionario: funcionarios) {
            System.out.println("Relatório atualizado:");
        System.out.println(funcionario);
    }

    scan.close();

} }