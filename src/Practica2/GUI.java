package Practica2;
import javax.swing.*;

public class GUI extends JFrame {
    
    // Objetos de la ventana
    JMenuBar barra;
    JMenu archivo, editar, reporte, salir;
    JMenuItem nuevo, consultar, eliminar, modificar, archivoPdf, archivoTxt;
    JLabel fondo;
    
    // Propiedades de la ventana
    public GUI() {
        setTitle("Práctica 2");
        setSize(380, 280);
        setLayout(null);
        setLocationRelativeTo(this);
        //setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        componentes();
        setVisible(true);  
    }
    
    public void componentes() {
        // Barra principal
        barra = new JMenuBar();
        
        // Menús principales de la barra
        archivo = new JMenu("Archivo");
        editar = new JMenu("Editar");
        reporte = new JMenu("Reporte");
        salir = new JMenu("Salir");
        
        //  internas (Items)
        nuevo = new JMenuItem("Nuevo");
        consultar = new JMenuItem("Consultar");
        eliminar = new JMenuItem("Eliminar");
        
        modificar = new JMenuItem("Modificar");
        
        archivoPdf = new JMenuItem("Archivo PDF");
        archivoTxt = new JMenuItem("Archivo txt");
        
        //items correspondientes
        archivo.add(nuevo);
        archivo.add(consultar);
        archivo.add(eliminar);
        
        editar.add(modificar);
        
        reporte.add(archivoPdf);
        reporte.add(archivoTxt);
        
        //  la barra principal
        barra.add(archivo);
        barra.add(editar);
        barra.add(reporte);
        barra.add(salir);
        
        //barra a la ventana
        setJMenuBar(barra);
        
        // Fondo
        fondo = new JLabel("Fondo", SwingConstants.CENTER);
        fondo.setBounds(0, 0, 365, 220);
        add(fondo);
    }
}