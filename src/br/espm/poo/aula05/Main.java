package br.espm.poo.aula05;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Cliente[] clientes = new Cliente[3];
        int indexCliente = 0;

        Scanner scanner = new Scanner(System.in);
        String line;
        do {
            System.out.print("> ");
            line = scanner.nextLine();
            switch (line.toLowerCase()) {
                case "help":
                    printMenu();
                    break;
                case "bye":
                case "exit":
                    break;
                case "1":
                    clientes[indexCliente++ % clientes.length] = cadastrarCliente();
                    break;
                case "2":
                case "list":
                    listarClientes(clientes);
                    break;
                default:
                    System.out.println("Opcao invalida");
            }

        } while (!line.equals("bye"));

    }

    public static void printMenu() {
        System.out.println("--- Menu ---");
        System.out.println("1. Cadastra Cliente");
        System.out.println("2. Listar Clientes");
    }

    public static Cliente cadastrarCliente() {
        Scanner scanner = new Scanner(System.in);

        Cliente cliente = null;

        String tipoPessoa = inputTipoPessoa();
        switch (tipoPessoa) {
            case "j":
                cliente = cadastrarPJ();
                break;
            case "f":
                cliente = cadastrarPF();
                break;
        }

        System.out.print("Nome: ");
        cliente.setNome(scanner.nextLine());

        System.out.print("Telefone: ");
        cliente.setTelefone(scanner.nextLine());

        return cliente;
    }

    public static void listarClientes(Cliente[] clientes) {
//        for (int i = 0; i < clientes.length; i++) {
//            Cliente c = clientes[i];
//            if (c != null) {
//                System.out.println(c.getUuid() + " - " + c.getNome());
//            }
//        }
//        for (Cliente c : clientes) {
//            if (c != null) {
//                System.out.println(c.getUuid() + " - " + c.getNome());
//            }
//        }
        Arrays.stream(clientes).forEach(c -> {
            if (c != null) {
                System.out.println(c.getId() + " - " + c.getNome() + " - " + c.getTelefone());
            }
        });
    }

    private static String inputTipoPessoa() {
        String tipoPessoa = null;
        while (tipoPessoa == null) {
            System.out.print("Pessoa Juridica (j) ou Pessoa Fisica (f): ");
            tipoPessoa = new Scanner(System.in).nextLine();
            if (!"f".equals(tipoPessoa) && !"j".equals(tipoPessoa)) {
                tipoPessoa = null;
                System.out.println("Opcao invalida, aceito apenas f ou p");
            }
        }
        return tipoPessoa;
    }

    private static PessoaFisica cadastrarPF() {
        System.out.print(" CPF: ");
        String cpf = new Scanner(System.in).nextLine();

        PessoaFisica pf = new PessoaFisica();
        pf.setCpf(cpf);
        return  pf;
    }

    private static PessoaJuridica cadastrarPJ() {
        System.out.print("CNPJ: ");
        String cnpj = new Scanner(System.in).nextLine();

        PessoaJuridica pj = new PessoaJuridica();
        pj.setCnpj(cnpj);
        return pj;
    }

}
