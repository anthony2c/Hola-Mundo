/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hola.multi.idiomas;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
 
/**
 *
 * @author ekt
 */
public class Main extends JFrame{
    
 private JPanel contentPane;
 
 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
          EventQueue.invokeLater(new Runnable() {
                        public void run() {
                                try {
                                        Main frame = new Main();
                                        frame.setVisible(true);
                                        frame.getContentPane().setBackground(Color.black);
                                } catch (Exception e) {
                                        e.printStackTrace();
                                        
                                }
                        }
                });
        }
 
        /**
         * Create the frame.
         */
        public Main() {
                setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                 
                setBounds(100, 100, 354, 158);
               
                contentPane = new JPanel();
                contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
                setContentPane(contentPane);
                contentPane.setLayout(null);
                
               
                JLabel lblHolaMundoMulti = new JLabel("Hola Multi-Idiomas");
                lblHolaMundoMulti.setBounds(-40, 7, 450, 26);
                lblHolaMundoMulti.setHorizontalAlignment(SwingConstants.CENTER);
                lblHolaMundoMulti.setFont(new Font("Lucida Calligraphy", Font.PLAIN, 19));
                lblHolaMundoMulti.setForeground(new Color(006666));
                contentPane.add(lblHolaMundoMulti);
               
                final JLabel lblMensaje = new JLabel("");
                lblMensaje.setForeground(Color.orange);
                lblMensaje.setBounds(-35, 39, 424, 34);
                lblMensaje.setFont(new Font("Lucida Calligraphy", Font.PLAIN, 16));
                lblMensaje.setHorizontalAlignment(SwingConstants.CENTER);
                contentPane.add(lblMensaje);
               
                JButton btnSaludo = new JButton("Saludo");
                btnSaludo.setForeground(Color.red);
                btnSaludo.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent arg0) {
                             
                                        String[] saludo={"Ingles: Hello World","Sueco: Hallå världen","Italiano = Ciao Mondo","Coreano: 안녕하세요","Galés: Helo Byd","Chino: 你好世界","Alemán: Hallo Welt",
         "Frances: Bonjour Tout Le Monde","Catalán: Hola món","Chino Mandarin: Ni Hao","Ruso: привет мир!","Latín: Salve mundi","Griego: γεια σου","Holandés: Hello World","Chino-Mandarin: Nĭ Hăo"};
                                        String frase=saludo[(int) (Math.random()*saludo.length)] ;
                                         lblMensaje.setText(frase);
                                         
                        }
                });
                btnSaludo.setBounds(10, 84, 89, 23);
             
                contentPane.add(btnSaludo);
                JButton btnLimpiar = new JButton("Limpiar");
                btnLimpiar.setForeground(Color.red);
                btnLimpiar.addActionListener(new ActionListener() {
                    
                        public void actionPerformed(ActionEvent arg0) {
                                lblMensaje.setText("");
                        }
                });
                btnLimpiar.setBounds(130, 84, 89, 23);
                contentPane.add(btnLimpiar);
                 
                JButton btnSalir = new JButton("Salir");
                btnSalir.setForeground(Color.red);
                btnSalir.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                                System.exit(0);
                        }
                });
                btnSalir.setBounds(239, 84, 89, 23);
                contentPane.add(btnSalir);
        }
    }
