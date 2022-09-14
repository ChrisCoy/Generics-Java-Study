/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.generics.model;

/**
 *
 * @author Coy
 */
public class Funcionario extends Pessoa{
    private String ctps;

    public Funcionario() {
    }

    public String getCtps() {
        return ctps;
    }

    public void setCtps(String ctps) {
        this.ctps = ctps;
    }
    
    @Override
    public String toString(){
        return super.toString() +
                "\nCTPS: " + this.ctps + "\n";
    }
}
