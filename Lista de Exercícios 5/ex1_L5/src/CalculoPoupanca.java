
import static java.lang.Integer.parseInt;
import java.util.ArrayList;


public class CalculoPoupanca extends javax.swing.JPanel {
    ArrayList extratoDeposito = new ArrayList();
    ArrayList extratoSaque = new ArrayList();
    public CalculoPoupanca() {
        initComponents();
    }
     public void limpar(){
         tfDepositar.setText("0");
         tfSacar.setText("0");
     }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        lbSaldo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        taExtrato = new javax.swing.JTextArea();
        btDepositar = new javax.swing.JButton();
        btSacar = new javax.swing.JButton();
        tfDepositar = new javax.swing.JTextField();
        tfSacar = new javax.swing.JTextField();
        lbRendimento = new javax.swing.JLabel();

        jLabel1.setText("Extrato:");

        lbSaldo.setText("<Saldo>");

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

        lbRendimento.setText("<Rendimento>");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btDepositar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btSacar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbSaldo))
                    .addComponent(lbRendimento))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tfDepositar)
                            .addComponent(tfSacar, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(51, Short.MAX_VALUE))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbSaldo)
                        .addGap(37, 37, 37)
                        .addComponent(lbRendimento))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addContainerGap(29, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btDepositarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btDepositarMouseClicked
        double total = parseInt(tfDepositar.getText());
        double soma = TelaPrincipal.poupanca.getSaldo();
        soma += total;
        TelaPrincipal.poupanca.setSaldo(soma);
        lbSaldo.setText("<R$" + TelaPrincipal.poupanca.getSaldo() + ">");
        extratoDeposito.add(soma);
        for (int i = 0; i < extratoDeposito.size(); i++) {
            taExtrato.setText( "+" + extratoDeposito.toString() 
            + "-" + extratoSaque.toString()
            );
        }
        calcularRendimento();
        limpar();
    }//GEN-LAST:event_btDepositarMouseClicked

    private void btSacarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btSacarMouseClicked
        double total = parseInt(tfSacar.getText());
        double subtracao = TelaPrincipal.poupanca.getSaldo();
        subtracao -= total;
        TelaPrincipal.poupanca.setSaldo(subtracao);
        lbSaldo.setText("<R$" + TelaPrincipal.poupanca.getSaldo() + ">");
        extratoSaque.add(subtracao);
        for (int i = 0; i < extratoSaque.size(); i++) {
            taExtrato.setText( "+" + extratoDeposito.toString() 
            + "-" + extratoSaque.toString()
            );
        }
        calcularRendimento();
        limpar();
    }//GEN-LAST:event_btSacarMouseClicked
    
    private void calcularRendimento(){
       double rendimento = TelaPrincipal.poupanca.getRendimento();
       double calculoRendimento = rendimento * TelaPrincipal.poupanca.getSaldo();
       TelaPrincipal.poupanca.setRendimento(calculoRendimento);
       lbRendimento.setText("<R$" + TelaPrincipal.poupanca.getRendimento() + ">");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btDepositar;
    private javax.swing.JButton btSacar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbRendimento;
    private javax.swing.JLabel lbSaldo;
    private javax.swing.JTextArea taExtrato;
    private javax.swing.JTextField tfDepositar;
    private javax.swing.JTextField tfSacar;
    // End of variables declaration//GEN-END:variables
}
