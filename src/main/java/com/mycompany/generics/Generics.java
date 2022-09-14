/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.generics;

import com.mycompany.generics.model.Cliente;
import com.mycompany.generics.model.Funcionario;
import com.mycompany.generics.repositorys.ClienteRepository;
import com.mycompany.generics.repositorys.FuncionarioRepository;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Coy
 */
public class Generics {

    public static void main(String[] args) {
        ArrayList<Cliente> clientes = new ArrayList<Cliente>();
        ArrayList<Funcionario> funcs = new ArrayList<Funcionario>();

        ClienteRepository fichaCli = new ClienteRepository(clientes);
        FuncionarioRepository fichaFunc = new FuncionarioRepository(funcs);

        Scanner sc = new Scanner(System.in);

        int opt = 0, optSub = 0;
        Integer id;

        do {
            try {
                System.out.println("'.-=[ MENU INICIAL ]=-.'\n");
                System.out.println("1.Clientes");
                System.out.println("2.Funcionarios");
                System.out.println(">3.Encerrar programa");

                opt = sc.nextInt();
                sc.nextLine();

                switch (opt) {
                    case 1: //Cliente
                        do {
                            System.out.println("'.-=[ MENU CLIENTES ]=-.'\n");
                            System.out.println("1.Criar");
                            System.out.println("2.Remover");
                            System.out.println("3.Editar");
                            System.out.println("4.Consultar por id");
                            System.out.println("5.Relatorio");
                            System.out.println(">6.Sair para o menu anterior");
                            optSub = sc.nextInt();
                            sc.nextLine();

                            switch (optSub) {
                                case 1:
                                    Cliente c = new Cliente();
                                    System.out.print("Nome: ");
                                    c.setNome(sc.nextLine());

                                    System.out.print("Sobrenome: ");
                                    c.setSobrenome(sc.nextLine());

                                    System.out.print("CPF: ");
                                    c.setCpf(sc.nextLine());

                                    System.out.print("ID: ");
                                    c.setID(sc.nextInt());
                                    sc.nextLine();

                                    fichaCli.add(c);
                                    break;
                                case 2:

                                    System.out.print("Digite o ID do objeto a ser removido: ");
                                    id = sc.nextInt();

                                    if (fichaCli.findIndexFromId(id) == null) {
                                        System.out.println("Nenhum registro encontrado.");
                                        break;
                                    }

                                    fichaCli.remove(id);
                                    break;
                                case 3:
                                    System.out.print("Digite o ID do objeto a ser editado: ");
                                    id = sc.nextInt();
                                    sc.nextLine();

                                    if (fichaCli.findIndexFromId(id) == null) {
                                        System.out.println("Nenhum registro encontrado.");
                                        break;
                                    }

                                    Cliente c2 = new Cliente();
                                    System.out.print("Nome: ");
                                    c2.setNome(sc.nextLine());

                                    System.out.print("Sobrenome: ");
                                    c2.setSobrenome(sc.nextLine());

                                    System.out.print("CPF: ");
                                    c2.setCpf(sc.nextLine());

                                    System.out.print("ID: ");
                                    c2.setID(sc.nextInt());
                                    sc.nextLine();
                                    fichaCli.edit(id, c2);
                                    break;
                                case 4:
                                    System.out.print("Digite o ID do objeto a ser consultado: ");
                                    id = sc.nextInt();
                                    System.out.println(fichaCli.getByID(id) != null
                                            ? fichaCli.getByID(id)
                                            : "");
                                    break;
                                case 5:
                                    System.out.println("#[ RELATORIO ]#");
                                    System.out.println(fichaCli.getAll());
                                    break;
                            }
                        } while (optSub > 0 && optSub < 6);

                        break;
                    case 2:  //Funcionario
                        do {
                            System.out.println("'.-=[ MENU FUNCIONARIOS ]=-.'\n");
                            System.out.println("1.Criar");
                            System.out.println("2.Remover");
                            System.out.println("3.Editar");
                            System.out.println("4.Consultar por id");
                            System.out.println("5.Relatorio");
                            System.out.println(">6.Sair para o menu anterior");
                            optSub = sc.nextInt();
                            sc.nextLine();

                            switch (optSub) {
                                case 1:
                                    Funcionario f = new Funcionario();
                                    System.out.print("Nome: ");
                                    f.setNome(sc.nextLine());

                                    System.out.print("Sobrenome: ");
                                    f.setSobrenome(sc.nextLine());

                                    System.out.print("CTPS: ");
                                    f.setCtps(sc.nextLine());

                                    System.out.print("ID: ");
                                    f.setID(sc.nextInt());
                                    sc.nextLine();

                                    fichaFunc.add(f);
                                    break;
                                case 2:

                                    System.out.print("Digite o ID do funcionario a ser removido: ");
                                    id = sc.nextInt();

                                    if (fichaFunc.findIndexFromId(id) == null) {
                                        System.out.println("Nenhum registro encontrado.");
                                        break;
                                    }

                                    fichaFunc.remove(id);
                                    break;
                                case 3:
                                    System.out.print("Digite o ID do objeto a ser editado: ");
                                    id = sc.nextInt();
                                    sc.nextLine();

                                    if (fichaFunc.findIndexFromId(id) == null) {
                                        System.out.println("Nenhum registro encontrado.");
                                        break;
                                    }

                                    Funcionario f2 = new Funcionario();
                                    System.out.print("Nome: ");
                                    f2.setNome(sc.nextLine());

                                    System.out.print("Sobrenome: ");
                                    f2.setSobrenome(sc.nextLine());

                                    System.out.print("CTPS: ");
                                    f2.setCtps(sc.nextLine());

                                    System.out.print("ID: ");
                                    f2.setID(sc.nextInt());
                                    sc.nextLine();
                                    fichaFunc.edit(id, f2);
                                    break;
                                case 4:
                                    System.out.print("Digite o ID do funcionario a ser consultado: ");
                                    id = sc.nextInt();
                                    System.out.println(fichaFunc.getByID(id) != null
                                            ? fichaFunc.getByID(id)
                                            : "");
                                    break;
                                case 5:
                                    System.out.println("#[ RELATORIO ]#");
                                    System.out.println(fichaFunc.getAll());
                                    break;
                            }
                        } while (optSub > 0 && optSub < 6);
                        break;
                }
            } catch (Exception e) {
            }
        } while (opt > 0 && opt < 2);
        
        System.out.println("\nBye bye :D");
    }
}
