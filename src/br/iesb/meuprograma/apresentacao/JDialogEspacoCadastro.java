package br.iesb.meuprograma.apresentacao;

import br.iesb.meuprograma.entidades.Enxoval;
import br.iesb.meuprograma.entidades.Espaco;
import br.iesb.meuprograma.negocio.EnxovalBO;
import br.iesb.meuprograma.negocio.EspacoBO;
import br.iesb.meuprograma.negocio.NegocioException;
import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class JDialogEspacoCadastro extends javax.swing.JDialog {

   
    public JDialogEspacoCadastro(java.awt.Frame parent, boolean modal) {
       super(parent, modal);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtQtdReservaMes = new javax.swing.JTextField();
        txtQtdConvidados = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtValorReserva = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        btnSalvar = new javax.swing.JToggleButton();
        txtNome = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnVoltar = new javax.swing.JButton();
        txtHoraInicialMin = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtQtdHoras = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtHoraFinalMax = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnAlterar = new javax.swing.JButton();
        BtnNovo = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel8.setText("pessoas");

        jLabel9.setText("Valor Reserva (R$)");

        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        jLabel1.setText("Nome");

        btnVoltar.setText("Desistir");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText("Cadastro de Espaços Comuns para Reserva Individual");

        jLabel2.setText("Hora Inicial Minima");

        jLabel3.setText("Hora Final Máxima");

        jLabel4.setText("Quantidade Máxima de Horas na Reserva");

        jLabel5.setText("horas");

        jLabel6.setText("Quantidade de Reservas Por Mês:");

        jLabel7.setText("Quantidade Máxima de Convidados");

        txtId.setEditable(false);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Id", "Id Espaço", "Nome", "Valor Unitário", "Quantidade"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        btnAlterar.setText("Alterar Enxoval");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        BtnNovo.setText("Novo Enxoval");
        BtnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnNovoActionPerformed(evt);
            }
        });

        btnExcluir.setText("Excluir Enxoval");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtHoraInicialMin, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtQtdReservaMes, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtHoraFinalMax, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(18, 18, 18)
                                .addComponent(txtValorReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtQtdHoras))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(32, 32, 32)
                                .addComponent(txtQtdConvidados, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(btnSalvar)
                                .addGap(26, 26, 26)
                                .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(51, 51, 51)
                                .addComponent(BtnNovo)
                                .addGap(47, 47, 47)
                                .addComponent(btnExcluir)
                                .addGap(163, 163, 163)
                                .addComponent(btnVoltar))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(75, 75, 75)
                                .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 610, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(126, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel12)
                .addGap(55, 55, 55)
                .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(99, 99, 99))
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 714, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtQtdHoras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtQtdConvidados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtHoraInicialMin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(txtHoraFinalMax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtQtdReservaMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtValorReserva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvar)
                    .addComponent(btnVoltar)
                    .addComponent(btnAlterar)
                    .addComponent(BtnNovo)
                    .addComponent(btnExcluir))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed

        espaco.setNome(txtNome.getText());
        espaco.setHoraMin(parseInt(txtHoraInicialMin.getText()));
        espaco.setHoraMax(parseInt(txtHoraFinalMax.getText()));
        espaco.setQtdHoras(parseInt(txtQtdHoras.getText()));
        espaco.setQtdConvidados(parseInt(txtQtdConvidados.getText()));
        espaco.setQtdReserva(parseInt(txtQtdReservaMes.getText()));
        espaco.setValorReserva(parseDouble(txtValorReserva.getText()));
        EspacoBO bo = new EspacoBO();
       
        
try { 
if (espaco.getId() == 0) 
{bo.inserir(espaco);}
else
{bo.alterar(espaco);}
JOptionPane.showMessageDialog(rootPane,"Conta inserida com sucesso","Informação",JOptionPane.INFORMATION_MESSAGE);}
catch (NegocioException ex) 
{if(ex.getCause() == null) 
{JOptionPane.showMessageDialog(this,ex.getMessage(),"Aviso",JOptionPane.INFORMATION_MESSAGE);}
else
{JOptionPane.showMessageDialog(this,ex.getCause() .getMessage(),"Aviso",JOptionPane.INFORMATION_MESSAGE);}}
dispose();
  
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
     dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

    @SuppressWarnings("empty-statement")
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

 int filtro = Integer.valueOf(txtId.getText());
        
EnxovalBO bo = new EnxovalBO();
try { 
DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
modelo.setRowCount(0);
List<Enxoval> lista = bo.listar();
for(Enxoval enxoval : lista) {
if (filtro == enxoval.getEspacoId()) {
modelo.addRow(new Object[] {
enxoval.getId(),
enxoval.getEspacoId(),
enxoval.getNome(),
enxoval.getValor(),
enxoval.getQuantidade()}
); }
}} catch (NegocioException ex) {
if( ex.getCause() == null) {
JOptionPane.showMessageDialog(rootPane,ex.getMessage(),"Aviso",JOptionPane.INFORMATION_MESSAGE);
} else {
JOptionPane.showMessageDialog(rootPane,ex.getCause(),"Aviso",JOptionPane.INFORMATION_MESSAGE);
}
} 
    }//GEN-LAST:event_formWindowOpened

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        if(jTable1.getSelectedRow() < 0)
        {JOptionPane.showMessageDialog(this,"Selecione uma enxoval para editar","Aviso",JOptionPane.INFORMATION_MESSAGE);
            return;}
        int opcao = JOptionPane.showConfirmDialog(this,"Deseja editar a enxoval?","Confirmação",JOptionPane.INFORMATION_MESSAGE);
        if(opcao == JOptionPane.NO_OPTION)
        {return;}

        Enxoval enxoval = new Enxoval();
        enxoval.setId(Integer.valueOf(jTable1.getValueAt(jTable1.getSelectedRow(),0) .toString()));
        enxoval.setEspacoId(Integer.valueOf(jTable1.getValueAt(jTable1.getSelectedRow(),1) .toString()));
        enxoval.setNome(jTable1.getValueAt(jTable1.getSelectedRow(),2) .toString());
        enxoval.setValor(Double.valueOf(jTable1.getValueAt(jTable1.getSelectedRow(),3) .toString()));
        enxoval.setQuantidade(Integer.valueOf(jTable1.getValueAt(jTable1.getSelectedRow(),4) .toString()));

        JDialogEnxovalCadastro dialogo = new JDialogEnxovalCadastro((JFrame)  this.getParent(), true);
        dialogo.editar(enxoval);

        dialogo.setVisible(true);
        formWindowOpened(null);

    }//GEN-LAST:event_btnAlterarActionPerformed

    private void BtnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnNovoActionPerformed

        JDialogEnxovalCadastro dialogo = new JDialogEnxovalCadastro((JFrame) this.getParent(), true);
        dialogo.setVisible(true);
        formWindowOpened(null);
    }//GEN-LAST:event_BtnNovoActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        if(jTable1.getSelectedRow() < 0)
        {JOptionPane.showMessageDialog(this,"Selecione uma Enxoval para remover","Aviso",JOptionPane.INFORMATION_MESSAGE);
            return;}
        int opcao = JOptionPane.showConfirmDialog(this,"Deseja remover o Enxoval?","Confirmação",JOptionPane.INFORMATION_MESSAGE);
        if(opcao == JOptionPane.NO_OPTION)
        {return;}

        Enxoval enxoval = new Enxoval();
        enxoval.setId(Integer.valueOf(jTable1.getValueAt(jTable1.getSelectedRow(),0) .toString()));

        EnxovalBO bo = new EnxovalBO();
        try {bo.excluir(enxoval);
            formWindowOpened(null);
            JOptionPane.showMessageDialog(rootPane,"Conta excluida com sucesso","Informação",JOptionPane.INFORMATION_MESSAGE);
        }
        catch (NegocioException ex)
        {if(ex.getCause() == null)
            {JOptionPane.showMessageDialog(this,ex.getMessage(),"Aviso",JOptionPane.INFORMATION_MESSAGE);}
            else
            {JOptionPane.showMessageDialog(this,ex.getCause() .getMessage(),"Aviso",JOptionPane.INFORMATION_MESSAGE);}}
    }//GEN-LAST:event_btnExcluirActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDialogEspacoCadastro dialog = new JDialogEspacoCadastro(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

     private Espaco espaco = new Espaco();
    
     public void editar(Espaco entidade){
espaco = entidade;
txtId.setText(String.valueOf(espaco.getId()));
txtNome.setText(String.valueOf(espaco.getNome()));
txtHoraInicialMin.setText(String.valueOf(espaco.getHoraMin()));
txtHoraFinalMax.setText(String.valueOf(espaco.getHoraMax()));
txtQtdHoras.setText(String.valueOf(espaco.getQtdHoras()));
txtQtdConvidados.setText(String.valueOf(espaco.getQtdConvidados()));
txtValorReserva.setText(String.valueOf(espaco.getValorReserva()));
txtQtdReservaMes.setText(String.valueOf(espaco.getQtdReserva()));
   } 
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnNovo;
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JToggleButton btnSalvar;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtHoraFinalMax;
    private javax.swing.JTextField txtHoraInicialMin;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtQtdConvidados;
    private javax.swing.JTextField txtQtdHoras;
    private javax.swing.JTextField txtQtdReservaMes;
    private javax.swing.JTextField txtValorReserva;
    // End of variables declaration//GEN-END:variables
}
