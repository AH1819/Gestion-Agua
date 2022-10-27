package Vista;

import Entity.Cat_descuento;
import Entity.Cat_pago;
import Entity.Cliente;
import Entity.LecturaPago;
import Entity.Logeo;
import Servicio.AbonoService;
import Servicio.CatalogosServicio;
import Servicio.ClienteServicio;
import Servicio.DescuentoServicio;
import Servicio.LecturaPagoServicio;
import Servicio.TicketServicio;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.print.PageFormat;
import java.awt.print.Paper;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import org.greenrobot.eventbus.Subscribe;

public class Pago extends javax.swing.JPanel {

    String opcion;
    String porcentaje;
    String consumo;
    public Pago() {
        initComponents();
        Cargando.setVisible(false);
        N_cte.setEditable(false);
        Celular.setEditable(false);
        Municipio.setEditable(false);
        Residencia.setEditable(false);
        Manzana.setEditable(false);
        Lote.setEditable(false);
        Importe.setEditable(false);
        contrato.setVisible(false);
        Contrato.setEditable(false);
        new Thread() {
            public void run() {
                Descuentos();
                Tipo_pago();
            }
        }.start();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Dato = new javax.swing.JTextField();
        Pago = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        Residencia = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        Celular = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        Municipio = new javax.swing.JTextField();
        N_cte = new javax.swing.JTextField();
        Lote = new javax.swing.JTextField();
        Manzana = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        T_pago = new javax.swing.JComboBox<>();
        Importe = new javax.swing.JTextField();
        Busqueda = new javax.swing.JComboBox<>();
        Pagar = new javax.swing.JButton();
        Buscar = new javax.swing.JButton();
        Contrato = new javax.swing.JTextField();
        contrato = new javax.swing.JLabel();
        Cargando = new javax.swing.JLabel();
        Mes_pagar = new javax.swing.JTextField();
        Mes_adeudo = new javax.swing.JLabel();
        D_pago = new javax.swing.JComboBox<>();
        jLabel16 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Registro de pago");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1030, 30));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 1030, 10));

        jLabel3.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Nombre:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 70, -1));

        jLabel6.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Pago:");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 290, 70, 20));

        Dato.setBackground(new java.awt.Color(255, 255, 255));
        Dato.setForeground(new java.awt.Color(0, 0, 0));
        Dato.setText(" Ingrese el dato");
        Dato.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                DatoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                DatoFocusLost(evt);
            }
        });
        Dato.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                DatoMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                DatoMouseReleased(evt);
            }
        });
        Dato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DatoActionPerformed(evt);
            }
        });
        Dato.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                DatoKeyTyped(evt);
            }
        });
        add(Dato, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, 140, 40));

        Pago.setBackground(new java.awt.Color(255, 255, 255));
        Pago.setForeground(new java.awt.Color(0, 0, 0));
        Pago.setText(" Cantidad a pagar");
        Pago.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                PagoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                PagoFocusLost(evt);
            }
        });
        Pago.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                PagoMousePressed(evt);
            }
        });
        add(Pago, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 310, 190, 40));

        jLabel7.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Residencia:");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 210, 70, -1));

        Residencia.setBackground(new java.awt.Color(255, 255, 255));
        Residencia.setForeground(new java.awt.Color(0, 0, 0));
        add(Residencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 230, 190, 40));

        jLabel8.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Celular:");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 130, -1, -1));

        Celular.setBackground(new java.awt.Color(255, 255, 255));
        Celular.setForeground(new java.awt.Color(0, 0, 0));
        add(Celular, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 150, 230, 40));

        jLabel9.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Importe:");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 210, 70, -1));

        jLabel10.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Municipio:");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 70, -1));

        Municipio.setBackground(new java.awt.Color(255, 255, 255));
        Municipio.setForeground(new java.awt.Color(0, 0, 0));
        add(Municipio, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 210, 40));

        N_cte.setBackground(new java.awt.Color(255, 255, 255));
        N_cte.setForeground(new java.awt.Color(0, 0, 0));
        N_cte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                N_cteActionPerformed(evt);
            }
        });
        add(N_cte, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 430, 40));

        Lote.setBackground(new java.awt.Color(255, 255, 255));
        Lote.setForeground(new java.awt.Color(0, 0, 0));
        add(Lote, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 230, 100, 40));

        Manzana.setBackground(new java.awt.Color(255, 255, 255));
        Manzana.setForeground(new java.awt.Color(0, 0, 0));
        Manzana.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ManzanaActionPerformed(evt);
            }
        });
        add(Manzana, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 230, 90, 40));

        jLabel13.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("Lote:");
        add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 210, -1, -1));

        jLabel14.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("Manzana:");
        add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 210, -1, -1));

        jLabel15.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText("Tipo de pago:");
        add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 290, -1, -1));

        T_pago.setBackground(new java.awt.Color(255, 255, 255));
        T_pago.setForeground(new java.awt.Color(0, 0, 0));
        T_pago.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add(T_pago, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 310, 190, 40));

        Importe.setBackground(new java.awt.Color(255, 255, 255));
        Importe.setForeground(new java.awt.Color(0, 0, 0));
        Importe.setText(" Importe a pagar");
        Importe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ImporteActionPerformed(evt);
            }
        });
        add(Importe, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 230, 190, 40));

        Busqueda.setBackground(new java.awt.Color(255, 255, 255));
        Busqueda.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        Busqueda.setForeground(new java.awt.Color(0, 0, 0));
        Busqueda.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona una opción", "Folio contrato", "Folio cliente", "Telefono/celular" }));
        Busqueda.setToolTipText("Busqueda por distintos datos");
        Busqueda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BusquedaMousePressed(evt);
            }
        });
        Busqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BusquedaActionPerformed(evt);
            }
        });
        add(Busqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 60, 160, 40));

        Pagar.setBackground(new java.awt.Color(18, 90, 173));
        Pagar.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        Pagar.setForeground(new java.awt.Color(255, 255, 255));
        Pagar.setText("Realizar pago");
        Pagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PagarActionPerformed(evt);
            }
        });
        add(Pagar, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 410, -1, 40));

        Buscar.setBackground(new java.awt.Color(18, 90, 173));
        Buscar.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        Buscar.setForeground(new java.awt.Color(255, 255, 255));
        Buscar.setText("Buscar");
        Buscar.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                BuscarFocusLost(evt);
            }
        });
        Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarActionPerformed(evt);
            }
        });
        Buscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                BuscarKeyReleased(evt);
            }
        });
        add(Buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 60, 110, 40));

        Contrato.setBackground(new java.awt.Color(255, 255, 255));
        Contrato.setForeground(new java.awt.Color(0, 0, 0));
        Contrato.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ContratoMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                ContratoMouseReleased(evt);
            }
        });
        Contrato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ContratoActionPerformed(evt);
            }
        });
        add(Contrato, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 150, 190, 40));

        contrato.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        contrato.setForeground(new java.awt.Color(0, 0, 0));
        contrato.setText("Folio del Contrato");
        add(contrato, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 130, -1, -1));

        Cargando.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Cargando.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cargando (1).gif"))); // NOI18N
        add(Cargando, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 50, 60, 60));

        Mes_pagar.setBackground(new java.awt.Color(255, 255, 255));
        Mes_pagar.setForeground(new java.awt.Color(0, 0, 0));
        Mes_pagar.setText(" Mes atrasado");
        add(Mes_pagar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 210, 40));

        Mes_adeudo.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        Mes_adeudo.setForeground(new java.awt.Color(0, 0, 0));
        Mes_adeudo.setText("Mes a pagar:");
        add(Mes_adeudo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 90, 20));

        D_pago.setBackground(new java.awt.Color(255, 255, 255));
        D_pago.setForeground(new java.awt.Color(0, 0, 0));
        D_pago.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        D_pago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                D_pagoActionPerformed(evt);
            }
        });
        add(D_pago, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 310, 230, 40));

        jLabel16.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 0));
        jLabel16.setText("Descuento:");
        add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 290, 120, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void N_cteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_N_cteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_N_cteActionPerformed

    private void ManzanaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ManzanaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ManzanaActionPerformed

    private void DatoMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DatoMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_DatoMouseReleased

    private void DatoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DatoMousePressed

    }//GEN-LAST:event_DatoMousePressed

    private void PagoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PagoMousePressed

    }//GEN-LAST:event_PagoMousePressed

    private void DatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DatoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DatoActionPerformed

    private void BusquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BusquedaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BusquedaActionPerformed

    private void PagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PagarActionPerformed
        if(D_pago.getSelectedIndex() == 0){
            porcentaje = "0";
        }else{
            porcentaje = D_pago.getSelectedItem().toString();
        }
        
        if (Importe.getText().equals(" Importe a pagar") || Importe.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Debe seleccionar un contrato para realizar el pago", "Aviso", JOptionPane.INFORMATION_MESSAGE);
            Dato.requestFocus();
        } else {
            if (Pago.getText().equals(" Cantidad a pagar") || Pago.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Campo vacio: Pago", "Aviso", JOptionPane.INFORMATION_MESSAGE);
                Pago.requestFocus();
            } else {
                if (T_pago.getSelectedItem().equals("Seleccione una opción")) {
                    JOptionPane.showMessageDialog(null, "Campo vacio: Tipo de Pago", "Aviso", JOptionPane.INFORMATION_MESSAGE);
                    T_pago.requestFocus();
                } else {
                    System.out.println(Lectura_pago);
                    new Thread() {
                        public void run() {
                            InsertarPago();
                        }
                    }.start();
                }
            }
        }
    }//GEN-LAST:event_PagarActionPerformed

    private void BusquedaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BusquedaMousePressed
        if (Dato.getText().isEmpty()) {
            Dato.setText(" Ingrese el dato");
        }
    }//GEN-LAST:event_BusquedaMousePressed

    private void BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarActionPerformed
        if (!N_cte.getText().isEmpty()) {
            N_cte.setText("");
            Contrato.setText("");
            Celular.setText("");
            Municipio.setText("");
            Residencia.setText("");
            Manzana.setText("");
            Lote.setText("");
            Importe.setText(" Importe a pagar");
            Mes_pagar.setText("");
            Pago.setText(" Cantidad a pagar");
            T_pago.setSelectedIndex(0);
            D_pago.setSelectedIndex(0);
        }

        if (Busqueda.getSelectedItem().equals("Folio contrato")) {

            contrato.setVisible(true);
            contrato.setText("Folio cliente");

        }
        if (Busqueda.getSelectedItem().equals("Folio cliente")) {
            contrato.setVisible(true);
            contrato.setText("Folio contrato");

        }
        if (Busqueda.getSelectedItem().equals("Telefono/celular")) {
            contrato.setVisible(true);
            contrato.setText("Telefono/celular");

        }
        if (Busqueda.getSelectedItem().equals("Selecciona una opción") || Dato.getText().equals(" Ingrese el dato") || Dato.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Debe ingresar y elegir el tipo de dato para la busqueda", "Aviso", JOptionPane.INFORMATION_MESSAGE);
        } else {
            new Hilos().show();
        }
    }//GEN-LAST:event_BuscarActionPerformed

    private void ContratoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ContratoMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_ContratoMousePressed

    private void ContratoMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ContratoMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_ContratoMouseReleased

    private void ContratoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ContratoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ContratoActionPerformed

    private void DatoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_DatoKeyTyped
        int key = evt.getKeyChar();

        boolean numeros = key >= 48 && key <= 57;

        if (!numeros) {
            evt.consume();
        }
    }//GEN-LAST:event_DatoKeyTyped

    private void DatoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_DatoFocusGained
        if (Dato.getText().equals(" Ingrese el dato")) {
            Dato.setText("");
        }
    }//GEN-LAST:event_DatoFocusGained

    private void DatoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_DatoFocusLost
        if (Dato.getText().isEmpty()) {
            Dato.setText(" Ingrese el dato");
        }
    }//GEN-LAST:event_DatoFocusLost

    private void PagoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_PagoFocusGained
        if (Pago.getText().equals(" Cantidad a pagar")) {
            Pago.setText("");
        }
    }//GEN-LAST:event_PagoFocusGained

    private void PagoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_PagoFocusLost
        if (Pago.getText().isEmpty()) {
            Pago.setText(" Cantidad a pagar");
        }
    }//GEN-LAST:event_PagoFocusLost

    private void BuscarFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_BuscarFocusLost

    }//GEN-LAST:event_BuscarFocusLost

    private void BuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BuscarKeyReleased
        Pago.requestFocus();
    }//GEN-LAST:event_BuscarKeyReleased

    private void ImporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ImporteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ImporteActionPerformed

    private void D_pagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_D_pagoActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_D_pagoActionPerformed
    public class Hilos implements Runnable {

        public void show() {
            new Thread(this).start();
        }

        @Override
        public void run() {
            Cargando.setVisible(true);

            if (Busqueda.getSelectedItem().equals("Folio contrato")) {
                contrato(Dato.getText());
                Cargando.setVisible(false);
            }
            if (Busqueda.getSelectedItem().equals("Folio cliente")) {
                cte();
                Cargando.setVisible(false);
            }
            if (Busqueda.getSelectedItem().equals("Telefono/celular")) {
                num();
                Cargando.setVisible(false);
            }

        }
    }
    String Lectura_pago;
    String Fecha_pago;
    String mes;
    private void Mes(int id) {
        LecturaPagoServicio lp = new LecturaPagoServicio();
        List<LecturaPago> lista = lp.Mes_deuda(id);
        int tam = lista.size();
        if (tam != 0) {
            for (int i = 0; i < tam; i++) {
                mes = lista.get(i).getMes();
                Mes_pagar.setText(lista.get(i).getMes() + ": $" + lista.get(i).getAdeudo());
                Lectura_pago = lista.get(i).getIdLectPago().toString();
                Fecha_pago = lista.get(i).getFechaHora().toString();
            }
        } else {
            Mes_pagar.setText("No hay deuda");
        }

    }

    private void contrato(String num) {
        ClienteServicio cs = new ClienteServicio();
        List<Cliente> lista = cs.PagoCl_contrato(Integer.parseInt(num));
        int tam = lista.size();
        if (tam > 0) {
            Mes(Integer.parseInt(Dato.getText()));
            for (int i = 0; i < tam; i++) {
                Contrato.setText(lista.get(i).getFolio().toString());
                N_cte.setText(lista.get(i).getNombre() + " " + lista.get(i).getApellido_p() + " " + lista.get(i).getApellido_m());
                Celular.setText(lista.get(i).getCelular());
                Municipio.setText(lista.get(i).getMunicipio());
                Residencia.setText(lista.get(i).getResidencia());
                Manzana.setText(String.valueOf(lista.get(i).getNumeroMzn()));
                Lote.setText(String.valueOf(lista.get(i).getNumeroLt()));
                Importe.setText(String.valueOf(lista.get(i).getDeuda()));
                consumo = lista.get(i).getConsumo();
            }
            Cargando.setVisible(false);
        } else {
            Dato.setText(" Ingrese el dato");
            N_cte.setText("");
            Contrato.setText("");
            Celular.setText("");
            Municipio.setText("");
            Residencia.setText("");
            Manzana.setText("");
            Lote.setText("");
            Importe.setText(" Importe a pagar");
            Pago.setText(" Cantidad a pagar");
            JOptionPane.showMessageDialog(this, "No se encontro ningun registro", "Aviso", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private void cte() {
        ClienteServicio cs = new ClienteServicio();
        List<Cliente> lista = cs.PagoCl_cte(Integer.parseInt(Dato.getText()));
        int tam = lista.size();
        if (tam > 0) {
            if (tam > 1) {
                int fol = 0;
                for (int i = 0; i < tam; i++) {
                    fol = lista.get(i).getFolio();
                }
                ContratosC cc = new ContratosC("Contrato", fol);
                cc.setVisible(true);

            } else {
                for (int i = 0; i < tam; i++) {
                    Contrato.setText(lista.get(i).getFolio().toString());
                    N_cte.setText(lista.get(i).getNombre() + " " + lista.get(i).getApellido_p() + " " + lista.get(i).getApellido_m());
                    Celular.setText(lista.get(i).getCelular());
                    Municipio.setText(lista.get(i).getMunicipio());
                    Residencia.setText(lista.get(i).getResidencia());
                    Manzana.setText(String.valueOf(lista.get(i).getNumeroMzn()));
                    Lote.setText(String.valueOf(lista.get(i).getNumeroLt()));
                    Importe.setText(String.valueOf(lista.get(i).getDeuda()));
                }
            }
        } else {
            Dato.setText(" Ingrese el dato");
            N_cte.setText("");
            Contrato.setText("");
            Celular.setText("");
            Municipio.setText("");
            Residencia.setText("");
            Manzana.setText("");
            Lote.setText("");
            Importe.setText(" Importe a pagar");
            Pago.setText(" Cantidad a pagar");
            JOptionPane.showMessageDialog(this, "No se encontro ningun registro", "Aviso", JOptionPane.INFORMATION_MESSAGE);
        }

    }

    private void num() {
        ClienteServicio cs = new ClienteServicio();
        List<Cliente> lista = cs.PagoCl_num(Dato.getText());
        int tam = lista.size();
        if (tam > 0) {
            if (tam > 1) {
                int fol = 0;
                for (int i = 0; i < tam; i++) {
                    fol = lista.get(i).getFolio();
                }
                ContratosC cc = new ContratosC("Contrato", fol);
                cc.setVisible(true);
            } else {
                for (int i = 0; i < tam; i++) {
                    Contrato.setText(lista.get(i).getCelular());
                    N_cte.setText(lista.get(i).getNombre() + " " + lista.get(i).getApellido_p() + " " + lista.get(i).getApellido_m());
                    Celular.setText(lista.get(i).getTelefono());
                    Municipio.setText(lista.get(i).getMunicipio());
                    Residencia.setText(lista.get(i).getResidencia());
                    Manzana.setText(String.valueOf(lista.get(i).getNumeroMzn()));
                    Lote.setText(String.valueOf(lista.get(i).getNumeroLt()));
                    Importe.setText(String.valueOf(lista.get(i).getDeuda()));
                }
            }
        } else {
            numt();
        }

    }

    private void numt() {
        ClienteServicio cs = new ClienteServicio();
        List<Cliente> lista = cs.PagoCl_numT(Dato.getText());
        int tam = lista.size();
        if (tam > 0) {
            if (tam > 1) {
                int fol = 0;
                for (int i = 0; i < tam; i++) {
                    fol = lista.get(i).getFolio();
                }
                ContratosC cc = new ContratosC("Contrato", fol);
                cc.setVisible(true);
            } else {
                for (int i = 0; i < tam; i++) {
                    Contrato.setText(lista.get(i).getTelefono());
                    N_cte.setText(lista.get(i).getNombre() + " " + lista.get(i).getApellido_p() + " " + lista.get(i).getApellido_m());
                    Celular.setText(lista.get(i).getCelular());
                    Municipio.setText(lista.get(i).getMunicipio());
                    Residencia.setText(lista.get(i).getResidencia());
                    Manzana.setText(String.valueOf(lista.get(i).getNumeroMzn()));
                    Lote.setText(String.valueOf(lista.get(i).getNumeroLt()));
                    Importe.setText(String.valueOf(lista.get(i).getDeuda()));
                }
            }
        } else {
            Dato.setText(" Ingrese el dato");
            N_cte.setText("");
            Contrato.setText("");
            Celular.setText("");
            Municipio.setText("");
            Residencia.setText("");
            Manzana.setText("");
            Lote.setText("");
            Importe.setText(" Importe a pagar");
            Pago.setText(" Cantidad a pagar");
            JOptionPane.showMessageDialog(this, "No se encontro ningun registro", "Aviso", JOptionPane.INFORMATION_MESSAGE);
        }

    }

    private void Tipo_pago() {
        CatalogosServicio cs = new CatalogosServicio();
        List<Cat_pago> lista = cs.Tipo_pago();
        int tam = lista.size();
        T_pago.addItem("Seleccione una opción");
        for (int i = 0; i < tam; i++) {
            T_pago.addItem(lista.get(i).getTipo_pago());
        }
    }

    private void Descuentos() {
        DescuentoServicio ds = new DescuentoServicio();
        List<Cat_descuento> lista = ds.ObtenerDescuentos();
        int tam = lista.size();
        D_pago.addItem("Seleccione una opción");
        for (int i = 0; i < tam; i++) {
            D_pago.addItem(lista.get(i).getPorcentaje().toString());
        }
    }
    int consec_abono;

    private void InsertarPago() {
        AbonoService as = new AbonoService();
        System.out.println(Lectura_pago);
        consec_abono = as.Abonar(Integer.parseInt(Pago.getText()), Integer.parseInt(Lectura_pago), T_pago.getSelectedIndex());
        if (consec_abono == -1) {
            JOptionPane.showMessageDialog(null, "No se pudo registrar el pago", "Error", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Pago exitoso", "Exito", JOptionPane.INFORMATION_MESSAGE);
            InsertarTicket();
        }
        //System.out.println(consec);
    }
    int ticket;

    private void InsertarTicket() {
        TicketServicio ts = new TicketServicio();
        System.out.println(Lectura_pago + " " + consec_abono);
        ticket = ts.InsertTicket(Integer.parseInt(Lectura_pago), consec_abono);
        System.out.println(ticket);
        if (ticket == -1) {
            JOptionPane.showMessageDialog(null, "Ticket no registrado", "Error", JOptionPane.INFORMATION_MESSAGE);
        } else {
            PrinterJob pj = PrinterJob.getPrinterJob();        
                pj.setPrintable(new BillPrintable(),getPageFormat(pj));
                try {
                  
                    pj.print();
                }
                catch (PrinterException ex) {
                    ex.printStackTrace();
                }
        }
    }

    
    double bHight = 0.0;

    public PageFormat getPageFormat(PrinterJob pj) {

        PageFormat pf = pj.defaultPage();
        Paper paper = pf.getPaper();

        double bodyHeight = bHight;
        double headerHeight = 20.0;
        double footerHeight = 20.0;
        double width = cm_to_pp(13);
        double height = cm_to_pp(headerHeight + bodyHeight + footerHeight);
        paper.setSize(width, height);
        paper.setImageableArea(0, 15, width, height - cm_to_pp(1));

        pf.setOrientation(PageFormat.PORTRAIT);
        pf.setPaper(paper);

        return pf;
    }

    protected static double cm_to_pp(double cm) {
        return toPPI(cm * 0.393600787);
    }

    protected static double toPPI(double inch) {
        return inch * 72d;
    }
    float pag;
    float imp;
    int desc;
    String RFC = "MCA771223GFA";
    Logeo lo = new Logeo();
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");

    public class BillPrintable implements Printable {

        public int print(Graphics graphics, PageFormat pageFormat, int pageIndex) throws PrinterException {
            ImageIcon icon = new ImageIcon("icons8-water-100.png");
            int result = NO_SUCH_PAGE;
            pag = Float.parseFloat(Pago.getText());
            imp = Float.parseFloat(Importe.getText());
            float total = imp - pag;
            
            if (pageIndex == 0) {
                Graphics2D g2d = (Graphics2D) graphics;
                double width = pageFormat.getImageableWidth();
                g2d.translate((int) pageFormat.getImageableX(), (int) pageFormat.getImageableY());
                try {
                    int y = 30;
                    int yShift = 12;
                    int headerRectHeight = 15;
                    g2d.setFont(new Font("Monospaced", Font.PLAIN, 9));
                    g2d.drawImage(icon.getImage(), 550, 6, 80, 70, null);
                    y += yShift + 30;
                    g2d.drawString("--------------------------------------------------", 12, y);
                    y += yShift;
                    g2d.drawString("GESTION DE SERVICIO PUBLICO DE AGUA, S.A DE C.V.", 12, y);
                    y += yShift;
                    g2d.drawString("    CACAHOATAN, CHIAPAS     " + " R.F.C.: " + RFC, 12, y);
                    y += yShift;
                    g2d.drawString("---------------------------------------------------", 12, y);
                    y += yShift;
                    g2d.drawString(" OPERADOR " + "             " + " Fecha: "+dtf.format(LocalDateTime.now())+"", 12, y);
                    y += yShift;
                    g2d.drawString(" " + lo.getUsuario() + "                      " + " Folio de ticket: " + ticket, 12, y);
                    y += yShift;
                    g2d.drawString("---------------------------------------------------", 12, y);
                    y += headerRectHeight;
                    g2d.drawString("               DATOS DEL CLIENTE                    ", 10, y);
                    y += headerRectHeight;
                    g2d.drawString(" Nombre: " + N_cte.getText() + "   " + "   ", 10, y);
                    y += yShift;
                    g2d.drawString(" Folio del contrato:  " + Dato.getText(), 10, y);
                    y += yShift;
                    g2d.drawString(" Domicilio: " + Residencia.getText() + "   ", 10, y);
                    y += yShift;
                    g2d.drawString(" Manzana:  " + Manzana.getText() + "             " + "Lote  " + Lote.getText(), 10, y);
                    y += yShift;
                    g2d.drawString("---------------------------------------------------", 10, y);
                    y += headerRectHeight;
                    g2d.drawString("               DETALLES DEL PAGO                    ", 10, y);
                    y += headerRectHeight;
                    g2d.drawString(" Mes del pago:     " + mes + "   ", 10, y);
                    y += yShift;
                    g2d.drawString(" Tipo de consumo:  " + consumo + " ", 10, y);
                    y += headerRectHeight;
                    g2d.drawString(" Importe:      $" + Importe.getText() + "           " + T_pago.getSelectedItem().toString(), 10, y);
                    y += yShift;
                    g2d.drawString(" Descuento:    " + porcentaje + " ", 10, y);
                    y += headerRectHeight;
                    g2d.drawString(" Pago:         $" + Pago.getText() + "", 10, y);
                    y += headerRectHeight;
                    g2d.drawString(" Resta:        $" + total + "", 10, y);
                    y += headerRectHeight;
                    g2d.drawString("***************************************************", 10, y);
                    y += yShift;
                    g2d.drawString("           ¡Gracias vuelva pronto!          ", 10, y);
                    y += yShift;
                    g2d.drawString("***************************************************", 10, y);
                    y += headerRectHeight;

                    g2d.drawImage(icon.getImage(), 100, 400, 85, 75, null);
                    y += yShift + 100;
                    g2d.drawString("--------------------------------------------------", 12, y);
                    y += yShift;
                    g2d.drawString("GESTION DE SERVICIO PUBLICO DE AGUA, S.A DE C.V.", 12, y);
                    y += yShift;
                    g2d.drawString("    CACAHOATAN, CHIAPAS     " + " R.F.C.: " + RFC, 12, y);
                    y += yShift;
                    g2d.drawString("---------------------------------------------------", 12, y);
                    y += yShift;
                    g2d.drawString(" OPERADOR " + "             " + " Fecha: " + dtf.format(LocalDateTime.now()) + " ", 12, y);
                    y += yShift;
                    g2d.drawString(" " + lo.getUsuario() + "                      " + " Folio de ticket: " + ticket, 12, y);
                    y += yShift;
                    g2d.drawString("---------------------------------------------------", 12, y);
                    y += headerRectHeight;
                    g2d.drawString("               DATOS DEL CLIENTE                    ", 10, y);
                    y += headerRectHeight;
                    g2d.drawString(" Nombre: " + N_cte.getText() + "   " + "   ", 10, y);
                    y += yShift;
                    g2d.drawString(" Folio del contrato:  " + Dato.getText(), 10, y);
                    y += yShift;
                    g2d.drawString(" Domicilio: " + Residencia.getText() + "   ", 10, y);
                    y += yShift;
                    g2d.drawString(" Manzana:  " + Manzana.getText() + "             " + "Lote  " + Lote.getText(), 10, y);
                    y += yShift;
                    g2d.drawString("---------------------------------------------------", 10, y);
                    y += headerRectHeight;
                    g2d.drawString("               DETALLES DEL PAGO                    ", 10, y);
                    y += headerRectHeight;
                    g2d.drawString(" Mes del pago:     " + mes + "   ", 10, y);
                    y += yShift;
                    g2d.drawString(" Tipo de consumo:  " + consumo + " ", 10, y);
                    y += headerRectHeight;
                    g2d.drawString(" Cargo generado:    $" + Importe.getText() + "           " + T_pago.getSelectedItem().toString(), 10, y);
                    y += yShift;
                    g2d.drawString(" Descuento:         %" + porcentaje + " ", 10, y);
                    y += headerRectHeight;
                    g2d.drawString(" Monto del pago:    $" + Pago.getText() + "", 10, y);
                    y += headerRectHeight;
                    g2d.drawString(" Total:             $" + total + "", 10, y);
                    y += headerRectHeight;
                    g2d.drawString("***************************************************", 10, y);
                    y += yShift;
                    g2d.drawString("           ¡Gracias vuelva pronto!          ", 10, y);
                    y += yShift;
                    g2d.drawString("***************************************************", 10, y);
                    y += headerRectHeight;

                } catch (Exception e) {
                }
                result = PAGE_EXISTS;
            }
            return result;
        }
    }
    @Subscribe
    public void Transporte(String v) {
        Dato.setText(v);
        Busqueda.setSelectedItem("Folio contrato");

        new Hilos().show();

    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Buscar;
    private javax.swing.JComboBox<String> Busqueda;
    private javax.swing.JLabel Cargando;
    private javax.swing.JTextField Celular;
    private javax.swing.JTextField Contrato;
    private javax.swing.JComboBox<String> D_pago;
    private javax.swing.JTextField Dato;
    private javax.swing.JTextField Importe;
    private javax.swing.JTextField Lote;
    private javax.swing.JTextField Manzana;
    private javax.swing.JLabel Mes_adeudo;
    private javax.swing.JTextField Mes_pagar;
    private javax.swing.JTextField Municipio;
    private javax.swing.JTextField N_cte;
    private javax.swing.JButton Pagar;
    private javax.swing.JTextField Pago;
    private javax.swing.JTextField Residencia;
    private javax.swing.JComboBox<String> T_pago;
    private javax.swing.JLabel contrato;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
