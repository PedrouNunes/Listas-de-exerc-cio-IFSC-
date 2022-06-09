
import static java.lang.Integer.parseInt;
import java.util.ArrayList;

public class CalculoCorrente extends javax.swing.JPanel {
    ArrayList extratoDeposito = new ArrayList();
    ArrayList extratoSaque = new ArrayList();
    public CalculoCorrente() {
        initComponents();
    }

     public void limpar(){
         tfDepositar.setText("0");
         tfSacar.setText("0");
     }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        taExtrato = new javax.swing.JTextArea();
        btDepositar = new javax.swing.JButton();
        btSacar = new javax.swing.JButton();
        tfDepositar = new javax.swing.JTextField();
        tfSacar = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        lbSaldo = new javax.swing.JLabel();

        taExtrato.setColumns(20);
        taExtrato.setRows(5);
        jScrollPane1.setViewportView(taExtrato);

        btDepositar.setText("Depositar");
        btDepositar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btDepositarMouseClicked(evt);
            }
        });

        btSacar.setText("Sacar");
        btSacar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btSacarMouseClicked(evt);
            }
        });

        jLabel1.setText("Extrato:");

        lbSaldo.setText("<Saldo>");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btDepositar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btSacar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(lbSaldo)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tfDepositar)
                            .addComponent(tfSacar, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btDepositar)
                    .addComponent(tfDepositar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btSacar)
                    .addComponent(tfSacar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(28, 28, 28)
                        .addComponent(lbSaldo)))
                .addContainerGap(12, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btDepositarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btDepositarMouseClicked
        double total = parseInt(tfDepositar.getText());
        double soma = TelaPrincipal.corrente.getSaldo();
        soma += total;
        TelaPrincipal.corrente.setSaldo(soma);
        lbSaldo.setText("<R$" + TelaPrincipal.corrente.getSaldo() + ">");
        extratoDeposito.add(soma);
        for (int i = 0; i < extratoDeposito.size(); i++) {
             taExtrato.setText( "+" + extratoDeposito.toString() 
            + "-" + extratoSaque.toString()
            );  
        }
        
        limpar();
    }//GEN-LAST:event_btDepositarMouseClicked

    private void btSacarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btSacarMouseClicked
        double total = parseInt(tfSacar.getText());
        double subtracao = TelaPrincipal.corrente.getSaldo();
        subtracao -= total;
        TelaPrincipal.corrente.setSaldo(subtracao);
        lbSaldo.setText("<R$" + TelaPrincipal.corrente.getSaldo() + ">");
        extratoSaque.add(subtracao);
        for (int i = 0; i < extratoSaque.size(); i++) {
             taExtrato.setText( "+" + extratoDeposito.toString() 
            + "-" + extratoSaque.toString()
            );  
        }
        limpar();
    }//GEN-LAST:event_btSacarMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btDepositar;
    private javax.swing.JButton btSacar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbSaldo;
    private javax.swing.JTextArea taExtrato;
    private javax.swing.JTextField tfDepositar;
    private javax.swing.JTextField tfSacar;
    // End of variables declaration//GEN-END:variables
}
