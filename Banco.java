import DB.ContasDB;
import Models.*;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Banco {
    static ContasDB contasDB = new ContasDB();
    static Contas contas = new Contas();

    public static void main(String[] args) {
         String nome;
         String idade;
         int senha;
         int id;
         String senhac;


        Scanner scanner = new Scanner(System.in);
        System.out.println("---------Banco----------");

        int opcao;

        do {
            System.out.println("1 - LogIn ADM");

            System.out.print("Operacao: ");
            opcao = scanner.nextInt();

            if(opcao == 1) {
                Adm adm = new Adm();
                System.out.print("Senha ADM: ");
                senha = scanner.nextInt();
                adm.autentica(senha);

                if(adm.autentica(senha) == true) {
                    System.out.println("1 - Cadastrar cliente");
                    System.out.print("Operacao: ");
                    opcao = scanner.nextInt();

                    if(opcao == 1) {
                        System.out.print("id: ");
                        id = scanner.nextInt();


                        System.out.print("Nome completo: ");
                        nome = scanner.next();


                        System.out.print("Idade: ");
                        idade = scanner.next();


                        System.out.print("Senha: ");
                        senhac = scanner.next();

                        Cliente cliente = new Cliente(nome, idade, id, senhac);

                        System.out.println("Cliente CADASTRADO!");

                        System.out.println("------------------------");
                        System.out.println(cliente.getNome());

                        System.out.print("Tipo de conta(1-corrente, 2-poupanca, 3-salario):");
                        int tipo = scanner.nextInt();

                        if(tipo == 1) {

                            System.out.print("Numero da conta: ");
                            Integer numC = scanner.nextInt();

                            System.out.print("Saldo inicial: ");
                            double sald = scanner.nextDouble();

                            ContaC contac = new ContaC(cliente.getId(), "Corrente", numC, sald, 100);
                            contasDB.novaConta(contac);
                            cliente.addConta(contac);
                            System.out.println("1 - Vizualizar contas");
                            System.out.println("2 - Sacar");
                            System.out.println("3 - depositar");
                            int opcao2 = scanner.nextInt();

                            if(opcao2 == 1) {
                                System.out.println(contasDB.getContasList());
                            } else if (opcao2 == 2) {
                                System.out.print("Saldo: "+contac.getSaldo());
                                System.out.print("valor do saque: ");
                                int saque = scanner.nextInt();
                                contac.sacar(saque);
                                System.out.println(contac);

                            } else {
                                System.out.print("Saldo: "+contac.getSaldo());
                                System.out.print("valor do deposito: ");
                                int deposito = scanner.nextInt();
                                contac.depositar(deposito);
                                System.out.println(contac);
                            }
                        } else {
                            if(tipo ==2) {

                                System.out.print("Numero da conta: ");
                                Integer numC = scanner.nextInt();

                                System.out.print("Saldo inicial: ");
                                double sald = scanner.nextDouble();

                                ContaP contaP = new ContaP(cliente.getId(), "Poupanca", numC, sald);
                                contasDB.novaConta(contaP);
                                cliente.addConta(contaP);

                                System.out.println("1 - Vizualizar contas");
                                System.out.println("2 - Sacar");
                                System.out.println("3 - depositar");
                                int opcao2 = scanner.nextInt();

                                if(opcao2 == 1) {
                                    System.out.println(contasDB.getContasList());
                                } else if (opcao2 == 2) {
                                    System.out.print("Saldo: "+contaP.getSaldo());
                                    System.out.print("valor do saque: ");
                                    int saque = scanner.nextInt();
                                    contaP.sacar(saque);
                                    System.out.println(contaP);

                                } else {
                                    System.out.print("Saldo: "+contaP.getSaldo());
                                    System.out.print("valor do deposito: ");
                                    int deposito = scanner.nextInt();
                                    contaP.depositar(deposito);
                                    System.out.println(contaP);
                                }
                            } else {

                                System.out.print("Numero da conta: ");
                                Integer numC = scanner.nextInt();

                                System.out.print("Saldo inicial: ");
                                double sald = scanner.nextDouble();

                                ContaSalario contaS = new ContaSalario(cliente.getId(), "Salario", numC, sald);
                                contasDB.novaConta(contaS);
                                cliente.addConta(contaS);

                                System.out.println("1 - Vizualizar contas");
                                System.out.println("2 - Sacar");
                                System.out.println("3 - depositar");
                                int opcao2 = scanner.nextInt();

                                if(opcao2 == 1) {
                                    System.out.println(contasDB.getContasList());
                                } else if (opcao2 == 2) {
                                    System.out.print("Saldo: "+contaS.getSaldo());
                                    System.out.print("valor do saque: ");
                                    int saque = scanner.nextInt();
                                    contaS.sacar(saque);
                                    System.out.println(contaS);

                                } else {
                                    System.out.print("Saldo: "+contaS.getSaldo());
                                    System.out.print("Saldo: "+contaS.getSaldo());
                                    System.out.print("valor do deposito: ");
                                    int deposito = scanner.nextInt();
                                    contaS.depositar(deposito);
                                    System.out.println(contaS);
                                }
                            }

                        }
                    }
                }

            }

        }while (opcao != 0);
    }


}