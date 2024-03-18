/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyecto;

import java.awt.Color;
import java.awt.HeadlessException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author hecto
 */
public class configuracion extends javax.swing.JFrame {

    /**
     * Creates new form configuracion
     */
    public configuracion() {
        initComponents();
    }
    
    menuPrincipal mp = new menuPrincipal();
    static ArrayList <HumanSequencePlayer> team1 = new ArrayList<>();
    static ArrayList <HumanSequencePlayer> team2 = new ArrayList<>();
    static ArrayList <HumanSequencePlayer> team3 = new ArrayList<>();
            ;
    static Color color1 = Color.red;
    static Color color2 = Color.blue;
    static Color color3 = Color.green;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jugadoresCantidad = new javax.swing.JButton();
        colorFicha = new javax.swing.JButton();
        regresar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(400, 400));
        setMinimumSize(new java.awt.Dimension(400, 400));

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jugadoresCantidad.setBackground(new java.awt.Color(153, 0, 0));
        jugadoresCantidad.setFont(new java.awt.Font("Rockwell", 1, 12)); // NOI18N
        jugadoresCantidad.setForeground(new java.awt.Color(255, 255, 255));
        jugadoresCantidad.setText("Cantidad de Jugadores");
        jugadoresCantidad.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jugadoresCantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jugadoresCantidadActionPerformed(evt);
            }
        });
        jPanel1.add(jugadoresCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 167, -1, 30));

        colorFicha.setBackground(new java.awt.Color(153, 0, 0));
        colorFicha.setFont(new java.awt.Font("Rockwell", 1, 12)); // NOI18N
        colorFicha.setForeground(new java.awt.Color(255, 255, 255));
        colorFicha.setText("Color de Ficha");
        colorFicha.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        colorFicha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                colorFichaActionPerformed(evt);
            }
        });
        jPanel1.add(colorFicha, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 207, 140, 30));

        regresar.setBackground(new java.awt.Color(153, 0, 0));
        regresar.setFont(new java.awt.Font("Rockwell", 1, 12)); // NOI18N
        regresar.setForeground(new java.awt.Color(255, 255, 255));
        regresar.setText("Regresar");
        regresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regresarActionPerformed(evt);
            }
        });
        jPanel1.add(regresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 247, 140, 30));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/Plantillas/CONFIGURACIÓN.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 400));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void regresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresarActionPerformed
        setVisible(false);
        
        mp.setVisible(true);
        mp.setLocationRelativeTo(null);
    }//GEN-LAST:event_regresarActionPerformed
    
    public static void makeTeams(int players){
        team1 = new ArrayList<>();
        team2 = new ArrayList<>();
        
        if (players % 3 == 0){
            team3 = new ArrayList<>();
            
            for (int i = 0; i < menuPrincipal.jugadores.size(); i++) {
                team1.add(menuPrincipal.jugadores.get(i));
                i++;
                team2.add(menuPrincipal.jugadores.get(i));
                i++;
                team3.add(menuPrincipal.jugadores.get(i));
            }
        } else {
            for (int i = 0; i < menuPrincipal.jugadores.size(); i++) {
                team1.add(menuPrincipal.jugadores.get(i));
                i++;
                team2.add(menuPrincipal.jugadores.get(i));
            }
        }
    }
    
//    public static void makeTeams(int teams){
//        //Borra los teams anteriores para poblarlos ahora
//        team1 = new ArrayList<>();
//        team2 = new ArrayList<>();
//        
//        //Verifica si el numero de teams sera 2 o 3
//        if (teams == 2){
//            for (int i = 0; i < cPlayers; i++) {//Llena los teams
//                menuPrincipal.jugadores.get(i).setFicha(color1);
//                team1.add(menuPrincipal.jugadores.get(i));
//                i++;
//                menuPrincipal.jugadores.get(i).setFicha(Color.blue);
//                team2.add(menuPrincipal.jugadores.get(i));
//            }
//        } else {
//            //Borra team3 para poblarlo
//            team3 = new ArrayList<>();
//            for (int i = 0; i < cPlayers; i++) {//Llena los teams
//                menuPrincipal.jugadores.get(i).setFicha(Color.red);
//                team1.add(menuPrincipal.jugadores.get(i));
//                i++;
//                menuPrincipal.jugadores.get(i).setFicha(Color.blue);
//                team2.add(menuPrincipal.jugadores.get(i));
//                i++;
//                menuPrincipal.jugadores.get(i).setFicha(Color.green);
//                team3.add(menuPrincipal.jugadores.get(i));
//            }
//        }
//    }
    
    static int cPlayers = 4;
    static int cCards = 7;
    
    private void jugadoresCantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jugadoresCantidadActionPerformed
        try {
            cPlayers = Integer.parseInt(JOptionPane.showInputDialog("Jugadores configurados actualmente: " + cPlayers + "\nIngrese la cantidad de jugadores que van a jugar"
                    + "\n2 jugadores (7 cartas y 2 equipos)"
                    + "\n3 jugadores (6 cartas y 3 equipos)"
                    + "\n4 jugadores (7 cartas y 2 equipos)"
                    + "\n6 jugadores (5 cartas y 3 equipos)"
                    + "\n8 jugadores (4 cartas y 2 equipos) "));
            
            while (true){
                if (cPlayers == 2 || cPlayers == 3 || cPlayers == 4 || cPlayers == 6 || cPlayers == 8){
                    break;
                } else {
                    JOptionPane.showMessageDialog(null, "Elija una de las opciones dadas");
                
                    cPlayers = Integer.parseInt(JOptionPane.showInputDialog("Jugadores configurados actualmente: " + cPlayers + "\nIngrese la cantidad de jugadores que van a jugar"
                            + "\n2 jugadores (7 cartas y 2 equipos)"
                            + "\n3 jugadores (6 cartas y 3 equipos)"
                            + "\n4 jugadores (7 cartas y 2 equipos)"
                            + "\n6 jugadores (5 cartas y 3 equipos)"
                            + "\n8 jugadores (4 cartas y 2 equipos) "));
                }
            }
            
            if (cPlayers > creacionDeUsuarios.users.size()){
                JOptionPane.showMessageDialog(null, "Solo hay " + creacionDeUsuarios.users.size() + " usuarios registrados.\n"
                        + "No se pueden tener " + cPlayers + "jugadores ya que no ajustan los usuarios.\n"
                                + "Intente de nuevo");
            } else {
                switch (cPlayers){
                    case 2:
                        cCards = 7;
                        break;
                    case 3:
                        cCards = 6;
                        break;
                    case 4:
                        cCards = 7;
                        break;
                    case 6:
                        cCards = 5;
                        break;
                    case 8:
                        cCards = 4;
                        break; 
                }

                JOptionPane.showMessageDialog(null, "Configuracion actualizada!");
            }
            
        } catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Ingrese un numero valido");
        }
    }//GEN-LAST:event_jugadoresCantidadActionPerformed
        
//    public static ArrayList <player> teamOf(player jugador){
//        
//        for (player current : team1){
//            if (current == jugador){
//                return team1;
//            }
//        }
//        
//        for (player current : team2){
//            if (current == jugador){
//                return team2;
//            }
//        }
//        
//        if (cPlayers % 3 == 0){
//            for (player current : team3){
//                if (current == jugador){
//                    return team3;
//                }
//            }
//        }
//        
//        return null;
//    }
    
    public static boolean colorExits(Color color){
        
        if (color == color1 || color == color2 || color == color3){
            return true;
        }
        
        return false;
    }
    
    static Color oldColor = Color.black;
    
    private void colorFichaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_colorFichaActionPerformed
//        try {     
//            int opcion = Integer.parseInt(JOptionPane.showInputDialog("Que color desea que sea su ficha?\n"
//                + "1. Rojo\n"
//                + "2. Azul\n"
//                + "3. Verde\n"
//                + "4. Amarillo\n"
//                + "5. Naranja\n"
//                + "6. Cyan\n"));
//            
//            while (opcion < 1 || opcion > 6){
//                opcion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese una opcion valida\nQue color desea que sea su ficha?\n"
//                    + "1. Rojo\n"
//                    + "2. Azul\n"
//                    + "3. Verde\n"
//                    + "4. Amarillo\n"
//                    + "5. Naranja\n"
//                    + "6. Cyan\n"));
//            }
//            
//            oldColor = color1;
//            
//            switch (opcion){
//                case 1:
//                    cambiarFicha(Color.red);
//                    break;
//                case 2:
//                    cambiarFicha(Color.blue);
//                    break;
//                case 3:
//                    cambiarFicha(Color.green);
//                    break;
//                case 4:
//                    cambiarFicha(Color.yellow);
//                    break;
//                case 5:
//                    cambiarFicha(Color.orange);
//                    break;
//                case 6:
//                    cambiarFicha(Color.cyan);
//                    break;
//            }
//            
//        } catch (NumberFormatException e){
//            JOptionPane.showMessageDialog(null, "Ingrese un numero valido");
//        }
//        
//        
    }//GEN-LAST:event_colorFichaActionPerformed

    
//    public static void cambiarFicha(Color color){
//        
//        if (!colorExits(color)){
//            
//            color1 = color;
//            
//            for (HumanSequencePlayer current : team1){
//                current.setFicha(color);
//            }
//            
//            JOptionPane.showMessageDialog(null, "Color de ficha cambiado!");
//        } else {
//            color1 = oldColor;
//            JOptionPane.showMessageDialog(null, "Ese color ya esta tomado");
//        }
//    }
    
    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton colorFicha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jugadoresCantidad;
    private javax.swing.JButton regresar;
    // End of variables declaration//GEN-END:variables
}
