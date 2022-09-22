package main;

import java.io.*;
import java.util.*;
import javax.swing.JOptionPane;

public class FormSistema extends javax.swing.JFrame {

    LinkedList<CadastraLivros> listaLivros = new LinkedList<>();
    LinkedList<CadastraLivros> listaTenho = new LinkedList<>();
    LinkedList<CadastraLivros> listaLidos = new LinkedList<>();
    LinkedList<CadastraLivros> listaLendo = new LinkedList<>();
    LinkedList<CadastraLivros> listaDesejo = new LinkedList<>();

    Comparator<CadastraLivros> compareTempo
            = (CadastraLivros l1, CadastraLivros l2)
            -> l1.getAno() - l2.getAno();

    public FormSistema() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        icon = new javax.swing.JLabel();
        prateleira = new javax.swing.JLabel();
        pesquisa = new javax.swing.JLabel();
        txtPesquisa = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        resultado = new javax.swing.JLabel();
        lblResultado = new javax.swing.JLabel();
        biblioteca = new javax.swing.JLabel();
        online = new javax.swing.JLabel();
        connected = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        txtAutor = new javax.swing.JTextField();
        txtAno = new javax.swing.JTextField();
        txtStatus = new javax.swing.JTextField();
        txtPosicao = new javax.swing.JTextField();
        nome = new javax.swing.JLabel();
        autor = new javax.swing.JLabel();
        ano = new javax.swing.JLabel();
        status = new javax.swing.JLabel();
        posicao = new javax.swing.JLabel();
        btnCadastrar = new javax.swing.JButton();
        tenho = new javax.swing.JLabel();
        lidos = new javax.swing.JLabel();
        lendo = new javax.swing.JLabel();
        desejados = new javax.swing.JLabel();
        pesquisa1 = new javax.swing.JLabel();
        txtPesquisa1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        listTenho = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        listLidos = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        listLendo = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        listDesejo = new javax.swing.JTextArea();
        btnNome = new javax.swing.JButton();
        btnData = new javax.swing.JButton();
        btnFinalizado = new javax.swing.JButton();
        btnRemover = new javax.swing.JButton();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        setMinimumSize(new java.awt.Dimension(1280, 800));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/icon.png"))); // NOI18N
        getContentPane().add(icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 170, 170));

        prateleira.setFont(new java.awt.Font("Rockwell", 0, 48)); // NOI18N
        prateleira.setForeground(new java.awt.Color(102, 51, 0));
        prateleira.setText("Estante Virtual");
        getContentPane().add(prateleira, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 20, 330, 40));

        pesquisa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/botao pesquisa.png"))); // NOI18N
        getContentPane().add(pesquisa, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 90, 40, 40));

        txtPesquisa.setBorder(null);
        getContentPane().add(txtPesquisa, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 90, 260, 40));

        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/botao buscar.png"))); // NOI18N
        btnBuscar.setBorder(null);
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 100, 100, 30));

        resultado.setFont(new java.awt.Font("Rockwell", 0, 16)); // NOI18N
        resultado.setText("Resultado: ");
        getContentPane().add(resultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 160, -1, -1));

        lblResultado.setFont(new java.awt.Font("Rockwell", 2, 16)); // NOI18N
        getContentPane().add(lblResultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 150, 290, 30));

        biblioteca.setFont(new java.awt.Font("Rockwell", 0, 24)); // NOI18N
        biblioteca.setForeground(new java.awt.Color(255, 255, 255));
        biblioteca.setText("Minha Biblioteca");
        biblioteca.setToolTipText("");
        getContentPane().add(biblioteca, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, 190, 30));

        online.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/botao online.png"))); // NOI18N
        getContentPane().add(online, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, -1, 20));

        connected.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        connected.setForeground(new java.awt.Color(255, 255, 255));
        connected.setText("Connected");
        connected.setToolTipText("");
        getContentPane().add(connected, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 220, -1, -1));

        txtNome.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        txtNome.setBorder(null);
        getContentPane().add(txtNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 270, 160, 50));

        txtAutor.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        txtAutor.setBorder(null);
        getContentPane().add(txtAutor, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 350, 160, 50));

        txtAno.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        txtAno.setBorder(null);
        getContentPane().add(txtAno, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 430, 160, 50));

        txtStatus.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        txtStatus.setBorder(null);
        getContentPane().add(txtStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 510, 160, 50));

        txtPosicao.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        txtPosicao.setBorder(null);
        getContentPane().add(txtPosicao, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 590, 160, 50));

        nome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/botao nome.png"))); // NOI18N
        getContentPane().add(nome, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, 210, 70));

        autor.setBackground(new java.awt.Color(255, 255, 255));
        autor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/botao autor.png"))); // NOI18N
        getContentPane().add(autor, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, 210, 70));

        ano.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/botao ano.png"))); // NOI18N
        getContentPane().add(ano, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 410, 210, 70));

        status.setBackground(new java.awt.Color(255, 255, 255));
        status.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/botao status.png"))); // NOI18N
        getContentPane().add(status, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 490, 210, 70));

        posicao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/botao posicao.png"))); // NOI18N
        getContentPane().add(posicao, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 570, 210, 70));

        btnCadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/botao cadastro.png"))); // NOI18N
        btnCadastrar.setBorder(null);
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 660, 60, 40));

        tenho.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/tenho.png"))); // NOI18N
        getContentPane().add(tenho, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 260, -1, -1));

        lidos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/lidos.png"))); // NOI18N
        getContentPane().add(lidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 260, -1, -1));

        lendo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/lendo.png"))); // NOI18N
        getContentPane().add(lendo, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 260, -1, -1));

        desejados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/desejados.png"))); // NOI18N
        getContentPane().add(desejados, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 260, -1, -1));

        pesquisa1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/botao pesquisa.png"))); // NOI18N
        getContentPane().add(pesquisa1, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 590, -1, -1));

        txtPesquisa1.setBorder(null);
        getContentPane().add(txtPesquisa1, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 590, 160, 40));

        jScrollPane1.setBorder(null);

        listTenho.setColumns(20);
        listTenho.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        listTenho.setRows(5);
        listTenho.setBorder(null);
        listTenho.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        listTenho.setHighlighter(null);
        listTenho.setName(""); // NOI18N
        jScrollPane1.setViewportView(listTenho);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 290, 200, 340));

        jScrollPane2.setBorder(null);
        jScrollPane2.setToolTipText("");

        listLidos.setColumns(20);
        listLidos.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        listLidos.setRows(5);
        listLidos.setToolTipText("");
        listLidos.setBorder(null);
        listLidos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        listLidos.setName(""); // NOI18N
        jScrollPane2.setViewportView(listLidos);
        listLidos.getAccessibleContext().setAccessibleName("");

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 290, 200, 340));

        jScrollPane3.setBorder(null);

        listLendo.setColumns(20);
        listLendo.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        listLendo.setRows(5);
        listLendo.setBorder(null);
        jScrollPane3.setViewportView(listLendo);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 290, 200, 290));

        jScrollPane4.setBorder(null);

        listDesejo.setColumns(20);
        listDesejo.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        listDesejo.setRows(5);
        listDesejo.setBorder(null);
        jScrollPane4.setViewportView(listDesejo);

        getContentPane().add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 290, 200, 340));

        btnNome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/botao ordenar por nome.png"))); // NOI18N
        btnNome.setBorder(null);
        btnNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNomeActionPerformed(evt);
            }
        });
        getContentPane().add(btnNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 650, -1, -1));

        btnData.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/botao ordenar por data.png"))); // NOI18N
        btnData.setBorder(null);
        btnData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDataActionPerformed(evt);
            }
        });
        getContentPane().add(btnData, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 650, 150, -1));

        btnFinalizado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/botao finalizado.png"))); // NOI18N
        btnFinalizado.setBorder(null);
        btnFinalizado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinalizadoActionPerformed(evt);
            }
        });
        getContentPane().add(btnFinalizado, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 650, 150, -1));

        btnRemover.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        btnRemover.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/botao remover.png"))); // NOI18N
        btnRemover.setBorder(null);
        btnRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverActionPerformed(evt);
            }
        });
        getContentPane().add(btnRemover, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 660, 60, 40));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/background.png"))); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1230, 740));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    void addLivro(CadastraLivros c) {
        if (txtStatus.getText().equalsIgnoreCase("Tenho")) {
            if(txtPosicao.getText().equals(""))
                listaTenho.add(c);
            else
                listaTenho.add(Integer.parseInt(txtPosicao.getText()),c);
                listaLivros.add(c);
        } else if (txtStatus.getText().equalsIgnoreCase("Lidos")) {
            if(txtPosicao.getText().equals(""))
                listaLidos.add(c);
            else
                listaLidos.add(Integer.parseInt(txtPosicao.getText()),c);
                listaLivros.add(c);
        } else if (txtStatus.getText().equalsIgnoreCase("Lendo")) {
            if(txtPosicao.getText().equals(""))
                listaLendo.add(c);
            else
                listaLendo.add(Integer.parseInt(txtPosicao.getText()),c);
                listaLivros.add(c);
        } else if (txtStatus.getText().equalsIgnoreCase("Desejados")) {
            if(txtPosicao.getText().equals(""))
                listaDesejo.add(c);
            else
                listaDesejo.add(Integer.parseInt(txtPosicao.getText()),c);
                listaLivros.add(c);
        } else {
            JOptionPane.showMessageDialog(null, "Opção Invalida!");
        }
    }

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        CadastraLivros c = new CadastraLivros();

        c.setNome(txtNome.getText());
        c.setAutor(txtAutor.getText());
        c.setAno(Integer.parseInt(txtAno.getText()));
        c.setStatus(txtStatus.getText());
        c.setPosicao(txtPosicao.getText());

        addLivro(c);
        mostra();
        limpaCampos();
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void btnFinalizadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinalizadoActionPerformed
        CadastraLivros cl;
        int aux = 0;
        boolean encontrou = false;
        for (CadastraLivros c : listaLendo) {
            if (c.getNome().equalsIgnoreCase(txtPesquisa1.getText())) {
                JOptionPane.showMessageDialog(null, "Livro " + txtPesquisa1.getText() + " movido para lista 'Lidos'. ");
                cl = listaLendo.remove(aux);
                listaLidos.add(cl);
                mostra();
                encontrou = true;
            }
            aux++;
        }
        if (!encontrou)
            JOptionPane.showMessageDialog(null, "Livro não encontrado!");
    }//GEN-LAST:event_btnFinalizadoActionPerformed

    private void btnNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNomeActionPerformed
        Collections.sort(listaTenho);
        mostra();
    }//GEN-LAST:event_btnNomeActionPerformed

    private void btnDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDataActionPerformed
        listaLidos.sort(compareTempo);
        mostra();
    }//GEN-LAST:event_btnDataActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        boolean encontrou = false;
        for (CadastraLivros c : listaLivros) {
            if (c.getNome().equalsIgnoreCase(txtPesquisa.getText())) {
                JOptionPane.showMessageDialog(null, "Livro " + c.getNome() + " encontrado na lista " + c.getStatus() + "!");
                lblResultado.setText("Encontrado na lista " + c.getStatus() + "!");
                encontrou = true;
            }
        }
        if (!encontrou)
            JOptionPane.showMessageDialog(null, "Livro não encontrado!");
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverActionPerformed
        removeLivro();
        mostra();
        limpaCampos();
    }//GEN-LAST:event_btnRemoverActionPerformed
    
    void removeLivro() {
        boolean encontrou = false;
        for (CadastraLivros c : listaLivros) {
            if (c.getNome().equalsIgnoreCase(txtNome.getText()) && c.getStatus().equalsIgnoreCase(txtStatus.getText())) {
                JOptionPane.showMessageDialog(null, "Livro " + txtNome.getText() + " da lista " + txtStatus.getText() + " foi removido. ");
                if (txtStatus.getText().equalsIgnoreCase("Tenho")) {
                    listaTenho.remove(c);
                    encontrou = true;
                } else if (txtStatus.getText().equalsIgnoreCase("Lidos")) {
                    listaLidos.remove(c);
                    encontrou = true;
                } else if (txtStatus.getText().equalsIgnoreCase("Lendo")) {
                    listaLendo.remove(c);
                    encontrou = true;
                } else if (txtStatus.getText().equalsIgnoreCase("Desejados")) {
                    listaDesejo.remove(c);
                    encontrou = true;
                } else {
                    JOptionPane.showMessageDialog(null, "Opção Invalida!");
                }
            }
        }
        if (!encontrou) {
            JOptionPane.showMessageDialog(null, "Livro não encontrado!");
        }
    }

    void mostra() {
        listTenho.setText("");
        if (!listaTenho.isEmpty()) {
            for (CadastraLivros c : listaTenho) {
                listTenho.append(c + "\n");
            }
        }

        listLidos.setText("");
        if (!listaLidos.isEmpty()) {
            for (CadastraLivros c : listaLidos) {
                listLidos.append(c + "\n");
            }
        }

        listLendo.setText("");
        if (!listaLendo.isEmpty()) {
            for (CadastraLivros c : listaLendo) {
                listLendo.append(c + "\n");
            }
        }

        listDesejo.setText("");
        if (!listaDesejo.isEmpty()) {
            for (CadastraLivros c : listaDesejo) {
                listDesejo.append(c + "\n");
            }
        }
    }

    void limpaCampos() {
        txtNome.setText("");
        txtAutor.setText("");
        txtAno.setText("");
        txtStatus.setText("");
        txtPosicao.setText("");
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormSistema().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ano;
    private javax.swing.JLabel autor;
    private javax.swing.JLabel background;
    private javax.swing.JLabel biblioteca;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnData;
    private javax.swing.JButton btnFinalizado;
    private javax.swing.JButton btnNome;
    private javax.swing.JButton btnRemover;
    private javax.swing.JLabel connected;
    private javax.swing.JLabel desejados;
    private javax.swing.JLabel icon;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel lblResultado;
    private javax.swing.JLabel lendo;
    private javax.swing.JLabel lidos;
    private javax.swing.JTextArea listDesejo;
    private javax.swing.JTextArea listLendo;
    private javax.swing.JTextArea listLidos;
    private javax.swing.JTextArea listTenho;
    private javax.swing.JLabel nome;
    private javax.swing.JLabel online;
    private javax.swing.JLabel pesquisa;
    private javax.swing.JLabel pesquisa1;
    private javax.swing.JLabel posicao;
    private javax.swing.JLabel prateleira;
    private javax.swing.JLabel resultado;
    private javax.swing.JLabel status;
    private javax.swing.JLabel tenho;
    private javax.swing.JTextField txtAno;
    private javax.swing.JTextField txtAutor;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtPesquisa;
    private javax.swing.JTextField txtPesquisa1;
    private javax.swing.JTextField txtPosicao;
    private javax.swing.JTextField txtStatus;
    // End of variables declaration//GEN-END:variables
}
