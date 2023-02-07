package Vista;

import Entity.Cliente;
import Entity.Contrato;
import Servicio.ClienteServicio;
import Servicio.ContratoServicio;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;

public class ContratosC extends javax.swing.JDialog {

    int cerrar = 0;
    int aceptar = 0;
    String ubicacion;
    int Xmouse, Ymouse;

    public ContratosC(int folio, String ubicacion) {
        initComponents();
        Cerrar.setVisible(false);
        Folio.setVisible(false);
        this.setLocationRelativeTo(null);
        if (ubicacion.equals("contrato")) {
            this.ubicacion = ubicacion;
            nombre.setVisible(false);
            Nombre.setVisible(false);
            ClientesC(folio);
        } else {
            ContratosC(folio);
        }
    }

    public ContratosC(String ubicacion, int folio) {
        initComponents();
        Cerrar.setText("Aceptar");
        Cerrar.setEnabled(false);
        aceptar = 1;
        this.setLocationRelativeTo(null);
        if (ubicacion.equals("Contrato")) {
            this.ubicacion = ubicacion;
            ContratosC(folio);
        }
        Mostrar.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent evt) {
                JTable table = (JTable) evt.getSource();
                Point point = evt.getPoint();
                int row = Mostrar.rowAtPoint(point);

                if (evt.getClickCount() == 1) {
                    try {
                        Folio.setText(Mostrar.getValueAt(Mostrar.getSelectedRow(), 0).toString());
                        Vali();
                    } catch (Exception e) {

                    }
                }
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Mostrar = new javax.swing.JTable();
        Folio = new javax.swing.JTextField();
        Nombre = new javax.swing.JLabel();
        nombre = new javax.swing.JLabel();
        Cancelar = new javax.swing.JButton();
        Cerrar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        Error = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
                formWindowLostFocus(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowDeactivated(java.awt.event.WindowEvent evt) {
                formWindowDeactivated(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Mostrar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(Mostrar);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 640, 200));

        Folio.setForeground(new java.awt.Color(255, 255, 255));
        Folio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FolioActionPerformed(evt);
            }
        });
        jPanel1.add(Folio, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 250, 60, -1));

        Nombre.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, 230, 20));

        nombre.setForeground(new java.awt.Color(255, 255, 255));
        nombre.setText("Nombre:");
        jPanel1.add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, -1, 20));

        Cancelar.setBackground(new java.awt.Color(18, 90, 173));
        Cancelar.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        Cancelar.setForeground(new java.awt.Color(255, 255, 255));
        Cancelar.setText("Cerrar");
        Cancelar.setBorder(null);
        Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelarActionPerformed(evt);
            }
        });
        jPanel1.add(Cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 120, 40));

        Cerrar.setBackground(new java.awt.Color(18, 90, 173));
        Cerrar.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        Cerrar.setForeground(new java.awt.Color(255, 255, 255));
        Cerrar.setText("Aceptar");
        Cerrar.setBorder(null);
        Cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CerrarActionPerformed(evt);
            }
        });
        jPanel1.add(Cerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 290, 120, 40));

        jLabel1.setBackground(new java.awt.Color(18, 90, 173));
        jLabel1.setOpaque(true);
        jLabel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel1MouseDragged(evt);
            }
        });
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel1MousePressed(evt);
            }
        });
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 40));

        Error.setBackground(new java.awt.Color(255, 255, 255));
        Error.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        Error.setForeground(new java.awt.Color(0, 0, 0));
        Error.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(Error, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 340));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 344, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
Cliente cl = new Cliente();

    private void formWindowLostFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowLostFocus

    }//GEN-LAST:event_formWindowLostFocus

    private void formWindowDeactivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowDeactivated
        if (Cerrar.getText().equals("Aceptar")) {
            if (cerrar == 0) {
                this.setVisible(true);
            }
        }
    }//GEN-LAST:event_formWindowDeactivated

    private void CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarActionPerformed
        cerrar = 1;
        this.dispose();
    }//GEN-LAST:event_CancelarActionPerformed

    private void CerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CerrarActionPerformed
        cerrar = 1;
        if (Cerrar.getText().equals("Aceptar")) {
            if (ubicacion.equals("Contrato")) {
                Interfaz2.pago.post(Folio.getText());
                this.dispose();
            }
            if (ubicacion.equals("contrato")) {
                Interfaz2.eventos.post(Folio.getText());
                this.dispose();
            }
        } else {
            this.dispose();
        }
    }//GEN-LAST:event_CerrarActionPerformed

    private void FolioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FolioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FolioActionPerformed

    private void jLabel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MousePressed
        Xmouse = evt.getX();
        Ymouse = evt.getY();
    }//GEN-LAST:event_jLabel1MousePressed

    private void jLabel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - Xmouse, y - Ymouse);
    }//GEN-LAST:event_jLabel1MouseDragged

    private void ContratosC(int folio) {
        ContratoServicio cts = new ContratoServicio();
        List<Contrato> lista = cts.ContratosC(folio);
        int tam = lista.size();
        if (tam > 0) {
            String list[][] = new String[tam][7];
            for (int i = 0; i < tam; i++) {
                list[i][0] = lista.get(i).getFolioContrato().toString();
                list[i][1] = lista.get(i).getMunicipio();
                list[i][2] = lista.get(i).getResidencia();
                list[i][3] = lista.get(i).getNumeroMzn().toString();
                list[i][4] = lista.get(i).getNumeroLt().toString();
                list[i][5] = lista.get(i).getDeuda().toString();
                list[i][6] = lista.get(i).getStatus();
                Nombre.setText(lista.get(i).getNombre());
            }
            Mostrar.setModel(new javax.swing.table.DefaultTableModel(
                    list,
                    new String[]{
                        "Folio", "Municipio", "Residencia", "Manzana", "Lote", "Deuda", "Status"
                    }));
        } else {
            Mostrar.setVisible(false);
            jScrollPane1.setVisible(false);
            Error.setText("No existen contratos");
        }

    }

    private void ClientesC(int folio) {
        ClienteServicio cs = new ClienteServicio();
        List<Cliente> lista = cs.ClientesC(folio);
        int tam = lista.size();
        if (tam > 0) {
            String list[][] = new String[tam][6];
            for (int i = 0; i < tam; i++) {
                list[i][0] = lista.get(i).getFolio().toString();
                list[i][1] = lista.get(i).getNombre() + " " + lista.get(i).getApellido_p() + " " + lista.get(i).getApellido_m();
                list[i][2] = lista.get(i).getResidencia();
                list[i][3] = lista.get(i).getFecha_nac().toString();
                list[i][4] = String.valueOf(lista.get(i).getNumeroMzn());
                list[i][5] = String.valueOf(lista.get(i).getNumeroLt());
            }
            Mostrar.setModel(new javax.swing.table.DefaultTableModel(
                    list,
                    new String[]{
                        "Folio", "Nombre", "Residencia", "Fecha de nacimiento", "Manzana", "Lote"
                    }));
            if (Mostrar.getColumnModel().getColumnCount() > 0) {
                Mostrar.getColumnModel().getColumn(0).setPreferredWidth(10);
                Mostrar.getColumnModel().getColumn(1).setPreferredWidth(100);
                Mostrar.getColumnModel().getColumn(2).setPreferredWidth(50);
                Mostrar.getColumnModel().getColumn(3).setPreferredWidth(85);
                Mostrar.getColumnModel().getColumn(4).setPreferredWidth(20);
                Mostrar.getColumnModel().getColumn(5).setPreferredWidth(20);
            }
        }
    }

    private void Vali() {
        int idcell = Mostrar.getSelectedRow();
        if (idcell <= -1) {
            JOptionPane.showMessageDialog(this, "Debe seleccionar el usuario a modificar. \n", "AVISO", javax.swing.JOptionPane.INFORMATION_MESSAGE);
        } else {
            Cerrar.setEnabled(true);
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cancelar;
    private javax.swing.JButton Cerrar;
    private javax.swing.JLabel Error;
    private javax.swing.JTextField Folio;
    private javax.swing.JTable Mostrar;
    private javax.swing.JLabel Nombre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel nombre;
    // End of variables declaration//GEN-END:variables

}
