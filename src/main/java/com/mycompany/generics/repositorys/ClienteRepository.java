/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.generics.repositorys;

import com.mycompany.generics.model.Cliente;
import java.util.ArrayList;

/**
 *
 * @author Coy
 */
public class ClienteRepository extends GenericRepository<Cliente>{
    public ClienteRepository(ArrayList<Cliente> clientes) {
        super(clientes);
    }
}
