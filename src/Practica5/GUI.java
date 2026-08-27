
package Practica5;
import javax.swing.*;


public class GUI extends JFrame{
    
    //Objetos de la ventana
    JLabel usuario, contrasenia;
    JTextField tusuario;
    JPasswordField pcontrasenia;
    JButton nuevo, acceder;
    
    
    
    
    //Propiedades de la ventana
    public  GUI (){
        setTitle("Practica5");
        setSize(380,280);
        setLayout(null);
        setLocationRelativeTo(this);
        //setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        componentes();
        setVisible(true);
        
    }
    
    public void componentes(){
        
        usuario = new JLabel ("Usuario:");
        //usuario.setText("Usuario");
        usuario.setBounds(50,50,100,30);
        
        contrasenia = new JLabel("Contraseña:");
        contrasenia.setBounds(50,100,150,30);
        
        tusuario = new JTextField();
        tusuario.setBounds(150,50,100,30);
        
        pcontrasenia = new JPasswordField();
        pcontrasenia.setBounds(150,100,150,30);
        
        nuevo = new JButton("Nuevo");
        nuevo.setBounds(100,200,100,30);
        
        acceder = new JButton("Acceder");
        acceder.setBounds(210,200,100,30);         
        
        add(contrasenia);
        add(usuario);
        add(tusuario);
        add(pcontrasenia);
        add(nuevo);
        add(acceder);
    }
}
