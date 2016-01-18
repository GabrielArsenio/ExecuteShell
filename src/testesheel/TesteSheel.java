/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testesheel;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.LocalShell;

/**
 *
 * @author agrosys
 */
public class TesteSheel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final LocalShell shell = new LocalShell();
        try {
            shell.executeCommand(args[0]);
        } catch (IOException ex) {
            System.out.println("Comando Inválido!");
        }
    }
    
}
