/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.generics.repositorys;

import com.mycompany.generics.model.ID;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Coy
 * @param <E> Entidade generica a qual deve ser passsada entre diamantes quando
 * objeto for criado.
 */
public abstract class GenericRepository<E extends ID> {

    protected ArrayList<E> repository;
    private Scanner sc;

    public GenericRepository(ArrayList<E> entitys) {
        this.repository = entitys;
        this.sc = new Scanner(System.in);
    }

    public void add(E entity) {
        try {
            if (findIndexFromId(entity.getID()) != null) {
                System.out.println("ID já em uso!");
                return;
            }

            this.repository.add(entity);
        } catch (Exception e) {
            System.out.println("Erro ao inserir registro!");
        }
    }

    public void edit(Integer entityId, E newEntity) {
        try {
            boolean exit;
            System.out.println("Confirmar edição?(0-Não/1-Sim)");
            exit = sc.nextInt() > 0;

            if (!exit) {
                return;
            }
            
            Integer index = findIndexFromId(entityId);
            
            if (index != null) {
                this.repository.set(index, newEntity);
            } else {
                System.out.println("Nenhum registro encontrado.");
            }
            
        } catch (Exception e) {
            System.out.println("Erro ao executar operação.");
        }
    }

    public void remove(Integer entityId) {
        try {
            boolean exit;
            System.out.println("Deseja realmente remover?(0-Não/1-Sim)");
            exit = sc.nextInt() > 0;

            if (!exit) {
                return;
            }
            
            Integer index = findIndexFromId(entityId);
            
            if (index != null) {
                this.repository.remove((int)index);
            } else {
                System.out.println("Nenhum registro encontrado.");
            }
            
        } catch (Exception e) {
            System.out.println("Erro ao executar operação.");
        }
    }

    public E getByID(Integer entityId) {
        try {
            Integer index = findIndexFromId(entityId);
            if (index != null) {
                return this.repository.get(index);
            } else {
                System.out.println("Nenhum registro encontrado.");
            }
        } catch (Exception e) {
            System.out.println("Erro ao executar operação.");
        }
        return null;
    }

    public ArrayList<E> getAll() {
        return repository;
    }

    public Integer findIndexFromId(Integer entityId) {
        try {
            for (int i = 0; i < this.repository.size(); i++) {
                if (repository.get(i).getID().equals(entityId)) {
                    return i;
                }
            }
        } catch (Exception e) {
            System.out.println("Erro ao executar operação.");
        }
        return null;
    }
}
