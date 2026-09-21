package Practica5;

import javax.swing.*;

public class Ventana extends JFrame {

    public Ventana() {
        setTitle("Ventana Principal");
        setSize(400, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // Cierra solo esta ventana sin detener todo el programa

        // Mensaje o componentes de prueba para comprobar que abrió
        JLabel bienvenida = new JLabel("¡Bienvenido al sistema!", SwingConstants.CENTER);
        add(bienvenida);
    }
}