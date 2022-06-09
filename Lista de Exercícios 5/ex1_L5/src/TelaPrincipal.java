
import java.awt.BorderLayout;
//
public class TelaPrincipal extends javax.swing.JFrame {
     static AbrirConta abrirConta;
     static Corrente corrente;
     static Poupanca poupanca;
     static CalculoCorrente calculoCorrente;
     static CalculoPoupanca calculoPoupanca;
    public TelaPrincipal() {
        initComponents();
        this.setLayout(new BorderLayout());
        abrirConta = new AbrirConta();
        this.add(abrirConta, BorderLayout.CENTER);
        this.pack();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
