package Interface;
import controle.musica.Tocador;
import java.awt.Color;
import traduz.campotexto.Tradutor;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Interface extends javax.swing.JFrame 
{ 
    public Interface() 
    {
        initComponents();
        getContentPane().setBackground(Color.DARK_GRAY);
        botaopause.setEnabled(false);
        botaoparar.setEnabled(false);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        areadetexto = new javax.swing.JTextArea();
        instrumentos = new javax.swing.JSpinner();
        volume = new javax.swing.JSlider();
        textovolume = new javax.swing.JLabel();
        textoinstrumentos = new javax.swing.JLabel();
        textobpms = new javax.swing.JLabel();
        bpms = new javax.swing.JSpinner();
        botaosalvar = new javax.swing.JButton();
        oitava = new javax.swing.JSpinner();
        textooitava = new javax.swing.JLabel();
        botaoplay = new javax.swing.JToggleButton();
        botaopause = new javax.swing.JToggleButton();
        botaoparar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gerador de Musica Textual");
        setBackground(new java.awt.Color(51, 51, 51));
        setForeground(new java.awt.Color(204, 204, 204));
        addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                formPropertyChange(evt);
            }
        });

        areadetexto.setColumns(20);
        areadetexto.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        areadetexto.setRows(5);
        areadetexto.setText("Digite sua música...");
        jScrollPane1.setViewportView(areadetexto);

        instrumentos.setModel(new javax.swing.SpinnerNumberModel(0, 0, 31, 1));
        instrumentos.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        instrumentos.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                instrumentosAlteraEstado(evt);
            }
        });

        volume.setMaximum(16383);
        volume.setValue(8191);

        textovolume.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        textovolume.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textovolume.setText("Volume");

        textoinstrumentos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textoinstrumentos.setLabelFor(instrumentos);
        textoinstrumentos.setText("Acoustic Grand Piano");
        textoinstrumentos.setToolTipText("");
        textoinstrumentos.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        textobpms.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        textobpms.setLabelFor(bpms);
        textobpms.setText("BPMs");
        textobpms.setToolTipText("");

        bpms.setModel(new javax.swing.SpinnerNumberModel(120, 20, 999, 1));

        botaosalvar.setText("Salvar");
        botaosalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSalvarAcao(evt);
            }
        });

        oitava.setModel(new javax.swing.SpinnerNumberModel(5, 0, 9, 1));

        textooitava.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        textooitava.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textooitava.setLabelFor(bpms);
        textooitava.setText("Oitava");
        textooitava.setToolTipText("");

        botaoplay.setBackground(new java.awt.Color(153, 153, 153));
        botaoplay.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        botaoplay.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/playIcone.png"))); // NOI18N
        botaoplay.setMaximumSize(new java.awt.Dimension(100, 100));
        botaoplay.setMinimumSize(new java.awt.Dimension(100, 100));
        botaoplay.setPreferredSize(new java.awt.Dimension(100, 100));
        botaoplay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoplayActionPerformed(evt);
            }
        });

        botaopause.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        botaopause.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/pauseIcone.png"))); // NOI18N
        botaopause.setPreferredSize(new java.awt.Dimension(70, 25));
        botaopause.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaopauseActionPerformed(evt);
            }
        });

        botaoparar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        botaoparar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/pararIcone.png"))); // NOI18N
        botaoparar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaopararActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(botaoplay, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botaosalvar)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(botaopause, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(botaoparar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(volume, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(textovolume, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(104, 104, 104))))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(textoinstrumentos, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(instrumentos, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(textooitava, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(oitava, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(textobpms, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(bpms, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(19, 19, 19))))
                .addGap(39, 39, 39))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(textovolume, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(volume, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(instrumentos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textoinstrumentos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(textobpms, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bpms, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(oitava, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textooitava)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(botaoparar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(botaopause, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(botaoplay, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(22, 22, 22)
                        .addComponent(botaosalvar)
                        .addGap(4, 4, 4)))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    private static String texto_traduzido = new String();
    private final Tocador tocador = new Tocador();    
    
    private void botaoSalvarAcao(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSalvarAcao
        testa_Vazio(areadetexto.getText());
        abreInterfaceDeSalvar();
    }//GEN-LAST:event_botaoSalvarAcao
    
     private static void abreInterfaceDeSalvar()
    {   
       InterfaceDeSalvar frame = new InterfaceDeSalvar(); 
       frame.set_Texto(Interface.texto_traduzido);
       frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
       frame.setVisible(true);
    }
    
    
    public void testa_Vazio(String texto)
    {
        if("".equals(texto) || texto == null || "Digite sua música...".equals(texto))
        {
            JOptionPane.showMessageDialog(this, "O texto está vazio", "WARNING!", JOptionPane.WARNING_MESSAGE, null);
        }
    }
    
    private void instrumentosAlteraEstado(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_instrumentosAlteraEstado
        //int valor = (int) instrumentos.getValue();
        switch((int) instrumentos.getValue())
        {           
            case 1:
                textoinstrumentos.setText("Bright Acoustic Piano");
                break;
            case 2:
                textoinstrumentos.setText("Electric Grand Piano");
                break;
            case 3:
                textoinstrumentos.setText("Honky-tonk Piano");
                break;
            case 4:
                textoinstrumentos.setText("Electric Piano 1");
                break;
            case 5:
                textoinstrumentos.setText("Electric Piano 2");
                break;
            case 6:
                textoinstrumentos.setText("Harpsichord");
                break;
            case 7:
                textoinstrumentos.setText("Clavinet");
                break;
            case 8:
                textoinstrumentos.setText("Celesta");
                break;
            case 9:
                textoinstrumentos.setText("Glockenspiel");
                break;
            case 10:
                textoinstrumentos.setText("Music Box");
                break;
            case 11:
                textoinstrumentos.setText("Vibraphone");
                break;
            case 12:
                textoinstrumentos.setText("Marimba");
                break;
            case 13:
                textoinstrumentos.setText("Xylophone");
                break;
            case 14:
                textoinstrumentos.setText("Tubular Bells");
                break;
            case 15:
                textoinstrumentos.setText("Dulcimer");
                break;
            case 16:
                textoinstrumentos.setText("Drawbar Organ");
                break;
            case 17:
                textoinstrumentos.setText("Percussive Organ");
                break;
            case 18:
                textoinstrumentos.setText("Rock Organ");
                break;
            case 19:
                textoinstrumentos.setText("Church Organ");
                break;
            case 20:
                textoinstrumentos.setText("Reed Organ");
                break;
            case 21:
                textoinstrumentos.setText("Accordion");
                break;
            case 22:
                textoinstrumentos.setText("Harmonica");
                break;
            case 23:
                textoinstrumentos.setText("Tango Accordion");
                break;
            case 24:
                textoinstrumentos.setText("Acoustic Guitar (nylon)");
                break;
            case 25:
                textoinstrumentos.setText("Acoustic Guitar (steel)");
                break;
            case 26:
                textoinstrumentos.setText("Electric Guitar (jazz)");
                break;
            case 27:
                textoinstrumentos.setText("Electric Guitar (clean)");
                break;
            case 28:
                textoinstrumentos.setText("Electric Guitar (muted)");
                break;
            case 29:
                textoinstrumentos.setText("Overdriven Guitar");
                break;
            case 30:
                textoinstrumentos.setText("Distortion Guitar");
                break;
            case 31:
                textoinstrumentos.setText("Guitar harmonics");
                break;
            default:
                textoinstrumentos.setText("Acoustic Grand Piano");                
        }
    }//GEN-LAST:event_instrumentosAlteraEstado
        
    private void botaoplayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoplayActionPerformed
        boolean resume = tocador.estado();
        if(resume == true)
        {
            tocador.resume_Musica();
            botaoplay.setSelected(true);
            botaopause.setSelected(false);
        }
        else
        {   
            Tradutor tradutor = new Tradutor();
            Traduzir(tradutor);
            tocador.set_Pattern(Interface.texto_traduzido);
            Runnable r = () -> {
                botaoplay.setSelected(true);
                botaoplay.setEnabled(false);
                botaopause.setSelected(false);
                botaopause.setEnabled(true);
                botaoparar.setEnabled(true);
                tocador.toca_Musica();
                botaopause.setEnabled(false);
                botaoparar.setEnabled(false);
                botaoplay.setSelected(false);
                botaoplay.setEnabled(true);
                 };
            Thread thread = new Thread(r);
            thread.start();
        }
    }//GEN-LAST:event_botaoplayActionPerformed
    
    private void Traduzir(Tradutor trad)
    {   
        trad.set_String(areadetexto.getText());
        trad.set_Oitava((int) oitava.getValue());
        trad.set_Bpm((int) bpms.getValue());
        trad.set_Instrumento((int) instrumentos.getValue());
        trad.set_Volume((int) volume.getValue());
        Interface.texto_traduzido = trad.traduz_musica();
    }
    
    private void botaopauseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaopauseActionPerformed
        tocador.pausa_Musica();
        botaoplay.setSelected(false);
        botaoplay.setEnabled(true);
        botaopause.setSelected(true);
    }//GEN-LAST:event_botaopauseActionPerformed

    private void botaopararActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaopararActionPerformed
        tocador.parar_Musica();
        botaoplay.setSelected(false);
        botaoplay.setEnabled(true);
        botaoparar.setSelected(false);
        botaopause.setEnabled(false);
        botaoparar.setEnabled(false);
    }//GEN-LAST:event_botaopararActionPerformed

    private void formPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_formPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_formPropertyChange
        
    public static void main(String args[]) 
    {
        java.awt.EventQueue.invokeLater(() -> {
                       
            Interface tela = new Interface();
            tela.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
            
            tela.addWindowListener(new WindowAdapter()
            {
                @Override
                public void windowClosing(WindowEvent evt)
                {
                   int dialogoConfirma = JOptionPane.showConfirmDialog(null,"Deseja Salvar?");
                   
                    if (dialogoConfirma==JOptionPane.OK_OPTION)
                    {
                        abreInterfaceDeSalvar();
                    }
                    else
                    {   
                        if(dialogoConfirma==JOptionPane.NO_OPTION)
                        { System.exit(0); }           
                    }                       
                }
            });
            tela.setVisible(true);
        });
    }    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea areadetexto;
    private javax.swing.JButton botaoparar;
    private javax.swing.JToggleButton botaopause;
    private javax.swing.JToggleButton botaoplay;
    private javax.swing.JButton botaosalvar;
    private javax.swing.JSpinner bpms;
    private javax.swing.JSpinner instrumentos;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner oitava;
    private javax.swing.JLabel textobpms;
    private javax.swing.JLabel textoinstrumentos;
    private javax.swing.JLabel textooitava;
    private javax.swing.JLabel textovolume;
    private javax.swing.JSlider volume;
    // End of variables declaration//GEN-END:variables
}
