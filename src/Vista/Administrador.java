package Vista;

import Entity.Contrato;
import Entity.LecturaPago;
import Servicio.ContratoServicio;
import Servicio.LecturaPagoServicio;
import java.awt.Color;
import java.time.LocalDate;
import java.util.List;
import java.util.StringTokenizer;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

public class Administrador extends javax.swing.JPanel {

    boolean c;
    boolean validator = false;
    boolean Precio_fijo = false;

    public Administrador() {
        initComponents();
        Importe.setVisible(false);
        new MostrarC().show();
        fecha();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Cargando = new javax.swing.JLabel();
        Principal = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        lectura = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Inicial = new javax.swing.JTextField();
        LFinal = new javax.swing.JTextField();
        Consumo = new javax.swing.JTextField();
        Dato = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        id_mes = new javax.swing.JTextField();
        jScrollPane5 = new javax.swing.JScrollPane();
        Informacion = new javax.swing.JTextArea();
        fijo = new javax.swing.JCheckBox();
        Importe = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Cargando.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Cargando.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8-spinner-para-iphone.gif"))); // NOI18N
        add(Cargando, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -30, 1030, 540));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lectura.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane4.setViewportView(lectura);

        jPanel1.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 6, 1000, 270));

        jButton2.setText("Guardar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 420, 100, -1));

        jLabel5.setText("Folio a buscar:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 280, 150, -1));

        jLabel1.setText("Lectura final");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 350, 100, -1));

        jLabel2.setText("Consumo");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 350, 80, -1));

        jLabel3.setText("Lectura Inicial");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 350, 100, -1));

        jLabel4.setText("Mes");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 350, 80, -1));

        Inicial.setEditable(false);
        Inicial.setText("Lectura inicial");
        Inicial.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                InicialFocusGained(evt);
            }
        });
        Inicial.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                InicialKeyReleased(evt);
            }
        });
        jPanel1.add(Inicial, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 370, 100, 30));

        LFinal.setText("Lectura final");
        LFinal.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                LFinalFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                LFinalFocusLost(evt);
            }
        });
        LFinal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                LFinalKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                LFinalKeyTyped(evt);
            }
        });
        jPanel1.add(LFinal, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 370, 100, 30));

        Consumo.setEditable(false);
        Consumo.setText("Consumo");
        jPanel1.add(Consumo, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 370, 80, 30));

        Dato.setText("Ingresa el folio del contrato");
        Dato.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                DatoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                DatoFocusLost(evt);
            }
        });
        Dato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DatoActionPerformed(evt);
            }
        });
        Dato.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                DatoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                DatoKeyTyped(evt);
            }
        });
        jPanel1.add(Dato, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 300, 180, 30));

        jButton4.setText("Buscar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 300, -1, -1));

        id_mes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                id_mesActionPerformed(evt);
            }
        });
        jPanel1.add(id_mes, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 370, 80, 30));

        Informacion.setColumns(20);
        Informacion.setLineWrap(true);
        Informacion.setRows(5);
        Informacion.setWrapStyleWord(true);
        jScrollPane5.setViewportView(Informacion);

        jPanel1.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 180, 150));

        fijo.setText("Costo fijo");
        fijo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fijoActionPerformed(evt);
            }
        });
        jPanel1.add(fijo, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 300, 90, 30));
        jPanel1.add(Importe, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 300, 80, 30));

        Principal.addTab("Lecturas", jPanel1);

        add(Principal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1030, 510));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (c) {
            if (validator) {
                new Thread() {
                    public void run() {
                        InsertarLecturaPago();
                    }
                }.start();
            } else {
                int x = 0;
                boolean xy = false;
                int y = lectura.getRowCount();
                for (int i = 0; i < y; i++) {
                    int folio = Integer.parseInt(lectura.getValueAt(i, 0).toString());
                    if (folio == Integer.parseInt(Dato.getText())) {
                        x = i;
                        xy = true;
                    }
                }
                if (xy) {
                    if (lectura.getValueAt(x, 7).equals("Limite excedido")) {
                        new Thread() {
                            @Override
                            public void run() {
                                InsertarLecturaPago();
                            }
                        }.start();
                    } else {
                        JOptionPane.showMessageDialog(null, "Todavia no se requiere una nueva lectura\n para este contrato", "Aviso", JOptionPane.INFORMATION_MESSAGE);
                    }
                }
            }
        }

        if (validator) {//valida si desea agregar una nueva lectura
            if (fijo.isSelected()) {//..............si esta seleccionado
                InsertarLecturaPagoFijo(Float.valueOf(Importe.getText()), Integer.parseInt(Dato.getText()), Integer.parseInt(id_mes.getText()));
            }
        } else {
            int x = 0;
            boolean xy = false;
            int y = lectura.getRowCount();
            for (int i = 0; i < y; i++) {
                int folio = Integer.parseInt(lectura.getValueAt(i, 0).toString());
                if (folio == Integer.parseInt(Dato.getText())) {
                    x = i;
                    xy = true;
                }
            }
            if (xy) {
                if (lectura.getValueAt(x, 7).equals("Limite excedido")) {
                    new Thread() {
                        @Override
                        public void run() {
                            InsertarLecturaPagoFijo(Float.valueOf(Importe.getText()), Integer.parseInt(Dato.getText()), Integer.parseInt(id_mes.getText()));
                        }
                    }.start();
                } else {
                    JOptionPane.showMessageDialog(null, "Todavia no se requiere una nueva lectura\n para este contrato", "Aviso", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        BuscarLecturas(Integer.parseInt(Dato.getText()));
    }//GEN-LAST:event_jButton4ActionPerformed

    private void DatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DatoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DatoActionPerformed

    private void id_mesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_id_mesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_id_mesActionPerformed

    private void LFinalKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_LFinalKeyReleased
        String lfinal = LFinal.getText();
        String linicial = Inicial.getText();

        double x1 = Double.parseDouble(lfinal);
        double x2 = Double.parseDouble(linicial);

        if (x2 < x1) {
            double resultado = x1 - x2;
            Consumo.setForeground(Color.black);
            Consumo.setText(String.valueOf(resultado));
            c = true;
        } else {
            Consumo.setForeground(Color.red);
            double resultado = x1 - x2;
            Consumo.setText(String.valueOf(resultado));

            c = false;
        }

    }//GEN-LAST:event_LFinalKeyReleased

    private void InicialFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_InicialFocusGained

    }//GEN-LAST:event_InicialFocusGained

    private void LFinalFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_LFinalFocusGained
        if (LFinal.getText().equals("Lectura final")) {
            LFinal.setText("");
        }
    }//GEN-LAST:event_LFinalFocusGained

    private void DatoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_DatoKeyReleased
        if (evt.getKeyCode() == 10) {

            if (Dato.getText().isEmpty() || Dato.getText().equals("  Ingresa el folio del contrato")) {
                JOptionPane.showMessageDialog(null, "Los campos no estan llenos", "Aviso", JOptionPane.INFORMATION_MESSAGE);

            } else {
                new Thread() {
                    public void run() {
                        BuscarLecturas(Integer.parseInt(Dato.getText()));
                    }
                }.start();
            }
        }
    }//GEN-LAST:event_DatoKeyReleased

    private void InicialKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_InicialKeyReleased

    }//GEN-LAST:event_InicialKeyReleased

    private void DatoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_DatoFocusGained
        if (Dato.getText().equals("Ingresa el folio del contrato")) {
            Dato.setText("");
        }
    }//GEN-LAST:event_DatoFocusGained

    private void DatoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_DatoFocusLost
        if (Dato.getText().isEmpty()) {
            Dato.setText("Ingresa el folio del contrato");
        }
    }//GEN-LAST:event_DatoFocusLost

    private void LFinalFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_LFinalFocusLost
        if (LFinal.getText().isEmpty()) {
            LFinal.setText("Lectura final");
        }
    }//GEN-LAST:event_LFinalFocusLost

    private void LFinalKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_LFinalKeyTyped
        int key = evt.getKeyChar();

        boolean numeros = key >= 48 && key <= 57;

        if (!numeros) {
            evt.consume();
        }
    }//GEN-LAST:event_LFinalKeyTyped

    private void DatoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_DatoKeyTyped
        int key = evt.getKeyChar();

        boolean numeros = key >= 48 && key <= 57;

        if (!numeros) {
            evt.consume();
        }
    }//GEN-LAST:event_DatoKeyTyped

    private void fijoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fijoActionPerformed
        if (fijo.isSelected()) {
            Inicial.setEnabled(false);
            LFinal.setEnabled(false);
            Consumo.setEnabled(false);
            Importe.setVisible(true);
            Precio_fijo = true;
        } else {
            Inicial.setEnabled(true);
            LFinal.setEnabled(true);
            Consumo.setEnabled(true);
            Importe.setVisible(false);
            Precio_fijo = false;
        }

    }//GEN-LAST:event_fijoActionPerformed
    public class MostrarC implements Runnable {

        public void show() {
            new Thread(this).start();
        }

        public void run() {
            Cargando.setVisible(true);
            Principal.setVisible(false);
            MostrarLecturas();
            Principal.setVisible(true);
            deber();
            Cargando.setVisible(false);
        }
    }

    private void InsertarLecturaPagoFijo(float lecturapago, int folio, int mes) {
        LecturaPagoServicio lps = new LecturaPagoServicio();
        lecturapago = lps.InsertarLecturapagoFijo(lecturapago, folio, mes);

        if (lecturapago == -1) {
            JOptionPane.showMessageDialog(null, "Lectura no se pudo registrar", "Error", JOptionPane.INFORMATION_MESSAGE);
        } else {
            //actualizar el tabla cuando se inserta
            JOptionPane.showMessageDialog(null, "Lectura se registro", "Correcto", JOptionPane.INFORMATION_MESSAGE);
            MostrarLecturas();
            deber();
        }
    }

    int lecturapago;

    private void InsertarLecturaPago() {
        LecturaPagoServicio lps = new LecturaPagoServicio();
        lecturapago = lps.InsertarLecturapago(Double.valueOf(Inicial.getText()), Double.valueOf(LFinal.getText()), Double.valueOf(Consumo.getText()), Integer.parseInt(Dato.getText()), Integer.parseInt(id_mes.getText()));

        if (lecturapago == -1) {
            JOptionPane.showMessageDialog(null, "Lectura no se pudo registrar", "Error", JOptionPane.INFORMATION_MESSAGE);
        } else {
            //actualizar el tabla cuando se inserta
            JOptionPane.showMessageDialog(null, "Lectura se registro", "Correcto", JOptionPane.INFORMATION_MESSAGE);
            MostrarLecturas();
            deber();
        }
    }

    /* if ((
                      lectura.getValueAt(i, 6).toString().contains("mon") ||
                      lectura.getValueAt(i, 6).toString().contains("mons") 
                      )) {*/
    private void deber() {
        int fila = lectura.getRowCount();
        int i;
        String onemon = "(mon|mons)";
        for (i = 0; i < fila; i++) {
            Pattern patrono = Pattern.compile(onemon);

            if (patrono.matcher(lectura.getValueAt(i, 6).toString()).find()) {

                StringTokenizer st = new StringTokenizer(lectura.getValueAt(i, 6).toString());
                StringTokenizer sx = new StringTokenizer(lectura.getValueAt(i, 5).toString());

                int p = Integer.parseInt(sx.nextToken());
                int x = Integer.parseInt(st.nextToken());

                if (x == p | x >= p) {

                    lectura.setValueAt("Limite excedido", i, 7);

                }

            } else {
                lectura.setValueAt("ok", i, 7);
            }
        }
    }

    private void BuscarLecturas(int folio) {
        LecturaPagoServicio ds = new LecturaPagoServicio();
        List<LecturaPago> lista = ds.BuscarLectura(folio);
        int tam = lista.size();
        int inicial = 0;
        if (tam == 0) {
            //boolean existe = Existencia(folio);
            if (Existencia(folio)) {
                int dialogButton = JOptionPane.showConfirmDialog(this, "El contrato no cuenta con una lectura\n ¿Desea añadir una nueva lectura?", "", JOptionPane.YES_NO_OPTION);

                if (JOptionPane.YES_OPTION == dialogButton) {
                    Inicial.setText(String.valueOf(inicial));
                    validator = true;
                } else {
                    //JOptionPane.showMessageDialog(this, "No se registro la nueva lectura", "Aviso", JOptionPane.INFORMATION_MESSAGE);
                    validator = false;
                }
            }
        } else {
            LFinal.setText("");
            for (int i = 0; i < tam; i++) {
                Dato.setText(lista.get(i).getFolio_contrato().toString());
                Informacion.setText(" Lectura Inicial: " + lista.get(i).getLecturaIni().toString() + "\n"
                        + " Lecutra Fin: " + lista.get(i).getLecturaFin().toString() + "\n"
                        + " Consumo: " + lista.get(i).getConsumo().toString());
                Inicial.setText(lista.get(i).getLecturaFin().toString());
            }
        }
    }

    private boolean Existencia(int folio) {
        boolean existe = false;
        ContratoServicio cs = new ContratoServicio();
        List<Contrato> lista = cs.SearchContrato_c(folio);
        int tam = lista.size();
        System.out.println(folio);
        System.out.println(tam);
        if (tam == 0) {
            JOptionPane.showMessageDialog(this, "Contrato no registrado", "Aviso", JOptionPane.INFORMATION_MESSAGE);
        } else {
            existe = true;
        }
        return existe;
    }

    private void fecha() {
        id_mes.setText(String.valueOf(LocalDate.now().getMonthValue()));
        id_mes.setEditable(false);
    }

    private void MostrarLecturas() {
        LecturaPagoServicio lps = new LecturaPagoServicio();
        List<LecturaPago> lista = lps.MostrarLecturas();
        int tam = lista.size();
        String list[][] = new String[tam][7];
        if (tam == 0) {
            JOptionPane.showMessageDialog(this, "No se encontro registro alguno", "Aviso", JOptionPane.INFORMATION_MESSAGE);
            lectura.setModel(new javax.swing.table.DefaultTableModel(
                    list,
                    new String[]{
                        "Folio contrato", "Consumo", "Cliente", "Id lectura", "Fecha lectura", "Periodo", "Tiempo transcurrido", "x"

                    }));
        } else {
            for (int i = 0; i < tam; i++) {
                list[i][0] = lista.get(i).getFolio_contrato().toString();
                list[i][1] = lista.get(i).getConsumo().toString();
                list[i][2] = lista.get(i).getFolio_cliente().toString() + " " + lista.get(i).getNombre_cliente();
                list[i][3] = lista.get(i).getIdLectPago().toString();
                list[i][4] = lista.get(i).getFechaHora().toString();
                list[i][5] = lista.get(i).getMes() + " " + lista.get(i).getTipo_periodo();
                if (lista.get(i).getTiempo_transcurrido().equals("00:00:00")) {
                    list[i][6] = "0";
                } else {
                    list[i][6] = lista.get(i).getTiempo_transcurrido();
                }

            }
//            
            lectura.setModel(new javax.swing.table.DefaultTableModel(
                    list,
                    new String[]{
                        "Folio contrato", "Consumo", "Cliente", "Id lectura", "Fecha lectura", "Periodo", "Tiempo transcurrido", "x"

                    }));
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Cargando;
    private javax.swing.JTextField Consumo;
    private javax.swing.JTextField Dato;
    private javax.swing.JTextField Importe;
    private javax.swing.JTextArea Informacion;
    private javax.swing.JTextField Inicial;
    private javax.swing.JTextField LFinal;
    private javax.swing.JTabbedPane Principal;
    private javax.swing.JCheckBox fijo;
    private javax.swing.JTextField id_mes;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTable lectura;
    // End of variables declaration//GEN-END:variables
}
