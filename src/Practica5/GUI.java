
package Practica5;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
        acceder.addActionListener(new ActionListener() {
        
        @Override
        public void actionPerformed(ActionEvent ae) {
        
            String usuario2 = "Maritza", contrasenia2 ="12345", usuario, contrasenia;
            usuario = tusuario.getText();
            contrasenia = pcontrasenia.getText();
            
            if(usuario.equals(usuario2)) {
             
                Ventana ven = new Ventana();
                ven.setVisible(true);
                setVisible(false);
            } else {
                JOptionPane.showMessageDialog(null,"Usuario incorrecto");
            }
            
            //Evaluar usuario y contraseña
            /*if (usuario.equalsIgnoreCase(anotherString:Usuario2) && contrasenia.equalsIgnoreCase)
            
            Ventana ven = new Ventana ();
            ven.setVisible(b:true);
            setVisible(b:false);            
        */}
    });
        
        add(contrasenia);
        add(usuario);
        add(tusuario);
        add(pcontrasenia);
        add(nuevo);
        add(acceder);
    }
}
