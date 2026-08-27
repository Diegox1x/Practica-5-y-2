package Practica2;
import javax.swing.*;

public class GUI extends JFrame {
    
    // Objetos de la ventana
    JMenuBar barraMenu;
    JMenu menuArchivo, menuEditar, menuReporte, menuSalir;
    JMenuItem itemNuevo, itemConsultar, itemEliminar, itemModificar, itemPdf, itemTxt;

    // Propiedades de la ventana
    public GUI() {
        setTitle("Practica2");
        setSize(380, 280);
        setLayout(null);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        componentes();
        setVisible(true);
    }

    public void componentes() {
        // barra principal
        barraMenu = new JMenuBar();

        // menús principales (pestañas)
        menuArchivo = new JMenu("Archivo");
        menuEditar = new JMenu("Editar");
        menuReporte = new JMenu("Reporte");
        menuSalir = new JMenu("Salir");

        // opciones internas (items)
        itemNuevo = new JMenuItem("Nuevo");
        itemConsultar = new JMenuItem("Consultar");
        itemEliminar = new JMenuItem("Eliminar");
        itemModificar = new JMenuItem("Modificar");
        itemPdf = new JMenuItem("Archivo PDF");
        itemTxt = new JMenuItem("Archivo TXT");

        // respectivos menús
        menuArchivo.add(itemNuevo);
        menuArchivo.add(itemTxt);
        menuArchivo.add(itemPdf);

        menuEditar.add(itemConsultar);
        menuEditar.add(itemModificar);
        menuEditar.add(itemEliminar);

        // barra principal
        barraMenu.add(menuArchivo);
        barraMenu.add(menuEditar);
        barraMenu.add(menuReporte);
        barraMenu.add(menuSalir);

        // barra en la ventana
        setJMenuBar(barraMenu);
    }
}