/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.generics.model;

/**
 *
 * @author Coy
 */
public abstract class Pessoa extends ID{
    private String nome;
    private String sobrenome;

    public Pessoa() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    
    @Override
    public String toString(){
        return "ID: " + this.ID +
                "\nNome: " + this.nome +
                "\nSobrenome: " + this.sobrenome;
    }
}
