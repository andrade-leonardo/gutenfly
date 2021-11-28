package view;

import dao.AeroportoDao;
import dao.CidadeDao;
import dao.DaoMestre;
import dao.EstadoDao;
import java.util.List;
import javax.swing.JOptionPane;
import model.Aeroporto;
import model.Cidade;
import model.Endereco;
import model.Estado;

public class IfrAeroporto extends javax.swing.JInternalFrame {

    private List<Estado> listaEstados = null;

    public IfrAeroporto() {
        initComponents();
        tfdId.setVisible(false);
        tfdIdEstado.setVisible(false);
        tfdIdCidade.setVisible(false);
        tfdIdEstado.setText("");
        this.listaEstados = EstadoDao.getInstance().pegarTodosEstados(jcbEstado);
        AeroportoDao.popularTabela(tblAeroporto, "", "", "");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jtbAeroporto = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        tfdId = new javax.swing.JTextField();
        bntCancelarAeroporto = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        jcbSituacao = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jcbEstado = new javax.swing.JComboBox<>();
        jcbCidade = new javax.swing.JComboBox<>();
        tfdIdCidade = new javax.swing.JTextField();
        jSeparator7 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        tfdEmail = new javax.swing.JTextField();
        jtfCnpj = new javax.swing.JTextField();
        jtfdNome = new javax.swing.JTextField();
        jtfdTelefone = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        tfdIdEstado = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jtfRua = new javax.swing.JTextField();
        jSeparator8 = new javax.swing.JSeparator();
        jsNumero = new javax.swing.JSpinner();
        jLabel12 = new javax.swing.JLabel();
        jtfCep = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jSeparator9 = new javax.swing.JSeparator();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblAeroporto = new javax.swing.JTable();
        nomePesquisa = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        cepPesquisa = new javax.swing.JTextField();
        jcbStatus = new javax.swing.JComboBox();
        jLabel16 = new javax.swing.JLabel();

        setTitle("Aeroportos");

        jPanel1.setBackground(new java.awt.Color(0, 102, 255));
        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jPanel1MouseMoved(evt);
            }
        });
        jPanel1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jPanel1FocusGained(evt);
            }
        });

        tfdId.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        tfdId.setEnabled(false);

        bntCancelarAeroporto.setBackground(new java.awt.Color(255, 255, 255));
        bntCancelarAeroporto.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        bntCancelarAeroporto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/cancelarColorido.png"))); // NOI18N
        bntCancelarAeroporto.setText("Cancelar");
        bntCancelarAeroporto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntCancelarAeroportoActionPerformed(evt);
            }
        });

        btnSalvar.setBackground(new java.awt.Color(255, 255, 255));
        btnSalvar.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        btnSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/floppy-disk.png"))); // NOI18N
        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/id.png"))); // NOI18N

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/email.png"))); // NOI18N

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/folder.png"))); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/telephone.png"))); // NOI18N

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/options.png"))); // NOI18N

        jcbSituacao.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        jcbSituacao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ativo", "Inativo" }));
        jcbSituacao.setBorder(null);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/australia.png"))); // NOI18N

        jcbEstado.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        jcbEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Estado" }));
        jcbEstado.setBorder(null);
        jcbEstado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jcbEstadoMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jcbEstadoMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jcbEstadoMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jcbEstadoMouseReleased(evt);
            }
        });
        jcbEstado.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jcbEstadoMouseDragged(evt);
            }
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jcbEstadoMouseMoved(evt);
            }
        });
        jcbEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbEstadoActionPerformed(evt);
            }
        });
        jcbEstado.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jcbEstadoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jcbEstadoFocusLost(evt);
            }
        });

        jcbCidade.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        jcbCidade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cidade" }));
        jcbCidade.setBorder(null);
        jcbCidade.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jcbCidadeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jcbCidadeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jcbCidadeMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jcbCidadeMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jcbCidadeMouseReleased(evt);
            }
        });
        jcbCidade.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jcbCidadeMouseDragged(evt);
            }
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jcbCidadeMouseMoved(evt);
            }
        });
        jcbCidade.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jcbCidadeFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jcbCidadeFocusLost(evt);
            }
        });

        tfdIdCidade.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        tfdIdCidade.setEnabled(false);

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Segoe Print", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Endereço");

        tfdEmail.setBackground(new java.awt.Color(0, 102, 255));
        tfdEmail.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        tfdEmail.setForeground(new java.awt.Color(255, 255, 255));
        tfdEmail.setText("Digite o e-mail do aeroporto");
        tfdEmail.setBorder(null);
        tfdEmail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfdEmailFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfdEmailFocusLost(evt);
            }
        });

        jtfCnpj.setBackground(new java.awt.Color(0, 102, 255));
        jtfCnpj.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        jtfCnpj.setForeground(new java.awt.Color(255, 255, 255));
        jtfCnpj.setText("Digite o cnpj do aeroporto");
        jtfCnpj.setBorder(null);
        jtfCnpj.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtfCnpjFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtfCnpjFocusLost(evt);
            }
        });

        jtfdNome.setBackground(new java.awt.Color(0, 102, 255));
        jtfdNome.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        jtfdNome.setForeground(new java.awt.Color(255, 255, 255));
        jtfdNome.setText("Digite o nome do aeroporto");
        jtfdNome.setBorder(null);
        jtfdNome.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtfdNomeFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtfdNomeFocusLost(evt);
            }
        });

        jtfdTelefone.setBackground(new java.awt.Color(0, 102, 255));
        jtfdTelefone.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        jtfdTelefone.setForeground(new java.awt.Color(255, 255, 255));
        jtfdTelefone.setText("Digite o telefone do aeroporto");
        jtfdTelefone.setBorder(null);
        jtfdTelefone.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtfdTelefoneFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtfdTelefoneFocusLost(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/architecture-and-city.png"))); // NOI18N

        tfdIdEstado.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        tfdIdEstado.setEnabled(false);

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Segoe Print", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Informações do Aeroporto");

        jtfRua.setBackground(new java.awt.Color(0, 102, 255));
        jtfRua.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        jtfRua.setForeground(new java.awt.Color(255, 255, 255));
        jtfRua.setText("Rua do aeroporto");
        jtfRua.setBorder(null);
        jtfRua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfRuaActionPerformed(evt);
            }
        });
        jtfRua.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtfRuaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtfRuaFocusLost(evt);
            }
        });

        jsNumero.setFont(new java.awt.Font("Segoe Script", 0, 14)); // NOI18N
        jsNumero.setModel(new javax.swing.SpinnerNumberModel(0, 0, 500, 1));
        jsNumero.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jsNumeroFocusGained(evt);
            }
        });

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/work-tools.png"))); // NOI18N

        jtfCep.setBackground(new java.awt.Color(0, 102, 255));
        jtfCep.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        jtfCep.setForeground(new java.awt.Color(255, 255, 255));
        jtfCep.setText("Digite o cep do aeroporto");
        jtfCep.setBorder(null);
        jtfCep.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtfCepFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtfCepFocusLost(evt);
            }
        });

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/zip-code.png"))); // NOI18N

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("|");

        jLabel15.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Nº");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4)
                                .addComponent(jLabel1))
                            .addGap(26, 26, 26)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tfdEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jtfCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel6)
                            .addGap(18, 18, 18)
                            .addComponent(jcbSituacao, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtfdNome, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtfdTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(171, 171, 171))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(119, 119, 119))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(53, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(tfdIdCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(tfdIdEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(104, 104, 104)
                        .addComponent(tfdId, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(jLabel13))
                            .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnSalvar)
                        .addGap(38, 38, 38)
                        .addComponent(bntCancelarAeroporto, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jtfRua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel15)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jsNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jtfCep, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jcbCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jcbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(60, 60, 60))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jtfCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel1))
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jcbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(jcbCidade, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jtfRua, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jsNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel14)
                                .addComponent(jLabel15))
                            .addComponent(jLabel12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jtfCep, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel13))
                        .addGap(4, 4, 4))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(tfdEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jtfdNome, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jtfdTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSalvar)
                            .addComponent(bntCancelarAeroporto)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jcbSituacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfdId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfdIdEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfdIdCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel6))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        jLabel8.getAccessibleContext().setAccessibleDescription("");

        jtbAeroporto.addTab("Cadastro", jPanel1);

        jPanel2.setBackground(new java.awt.Color(0, 102, 255));

        jLabel7.setFont(new java.awt.Font("Segoe Print", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Nome");

        tblAeroporto.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        tblAeroporto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(tblAeroporto);

        nomePesquisa.setBackground(new java.awt.Color(0, 102, 255));
        nomePesquisa.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        nomePesquisa.setForeground(new java.awt.Color(255, 255, 255));
        nomePesquisa.setBorder(javax.swing.BorderFactory.createLineBorder(null));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/trash.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/edit.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/loupe.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(255, 255, 255));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/cancelar.png"))); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Segoe Print", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("CEP");

        cepPesquisa.setBackground(new java.awt.Color(0, 102, 255));
        cepPesquisa.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        cepPesquisa.setForeground(new java.awt.Color(255, 255, 255));
        cepPesquisa.setBorder(javax.swing.BorderFactory.createLineBorder(null));

        jcbStatus.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        jcbStatus.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Ativo", "Inativo" }));
        jcbStatus.setBorder(null);

        jLabel16.setFont(new java.awt.Font("Segoe Print", 0, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Situação");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addGap(24, 24, 24)
                        .addComponent(jButton2))
                    .addComponent(jSeparator2)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(nomePesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cepPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                        .addComponent(jcbStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(nomePesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cepPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jcbStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel16)
                        .addComponent(jLabel10))
                    .addComponent(jButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 254, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );

        jtbAeroporto.addTab("Consultar", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jtbAeroporto)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jtbAeroporto, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String id = String.valueOf(tblAeroporto.getValueAt(tblAeroporto.getSelectedRow(), 0));
        AeroportoDao.deletar(AeroportoDao.getInstance().pegarAeroportoPeloId(Integer.parseInt(id)));
        AeroportoDao.popularTabela(tblAeroporto, nomePesquisa.getText(), cepPesquisa.getText(), "");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        AeroportoDao.popularTabela(tblAeroporto, nomePesquisa.getText(), cepPesquisa.getText(), String.valueOf(jcbStatus.getSelectedItem()));
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String id = String.valueOf(tblAeroporto.getValueAt(tblAeroporto.getSelectedRow(), 0));

        Aeroporto aeroporto = AeroportoDao.getInstance().pegarAeroportoPeloId(Integer.parseInt(id));

        if (aeroporto != null) {

            CidadeDao.getInstance().popularCidades(jcbCidade, aeroporto.getEndereco().getCidade().getEstado().getId());
            jtfCnpj.setText(aeroporto.getCnpj());
            tfdEmail.setText(aeroporto.getEmail());
            jtfdNome.setText(aeroporto.getNome());
            jtfdTelefone.setText(aeroporto.getTelefone());
            jcbSituacao.setSelectedIndex(aeroporto.getSituacao() == true ? 0 : 1);
            jcbEstado.setSelectedItem(aeroporto.getEndereco().getCidade().getEstado().getNome());
            jcbCidade.setSelectedItem(aeroporto.getEndereco().getCidade().getNome());
            jtfRua.setText(aeroporto.getEndereco().getRua());
            jsNumero.setValue(Integer.parseInt(aeroporto.getEndereco().getNumero()));
            jtfCep.setText(aeroporto.getEndereco().getCep());
            tfdId.setText(String.valueOf(aeroporto.getId()));

            jtbAeroporto.setSelectedIndex(0);

        } else {
            System.out.println("erro na consulta");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        try {
            Endereco e = new Endereco();
            Aeroporto a = new Aeroporto();
            e.setId(null);
            e.setCep(jtfCep.getText());
            e.setNumero(String.valueOf(jsNumero.getValue()));
            e.setRua(jtfRua.getText());
            e.setCidade(CidadeDao.getInstance().pegarCidadePeloId(Integer.parseInt(tfdIdCidade.getText())));

            if (DaoMestre.getInstance().inserir(e)) {
                a.setId(null);
                a.setCnpj(jtfCnpj.getText());
                a.setEmail(tfdEmail.getText());
                a.setNome(jtfdNome.getText());
                a.setTelefone(jtfdTelefone.getText());
                a.setSituacao((jcbSituacao.getSelectedItem() == "Ativo"));
                a.setEndereco(e);
            }

            if (tfdId.getText().equals("") && DaoMestre.getInstance().inserir(a)) {
                JOptionPane.showMessageDialog(null, "Registro salvo com sucesso!");
            } else {
                AeroportoDao.getInstance().atualizarAeroporto(a, Integer.parseInt(tfdId.getText()));
                JOptionPane.showMessageDialog(null, "Registro editado com sucesso!");
            }

            jtfCnpj.setText("Digite o cnpj do aeroporto");
            tfdEmail.setText("Digite o e-mail do aeroporto");
            jtfdNome.setText("Digite o nome do aeroporto");
            jtfdTelefone.setText("Digite o telefone do aeroporto");
            jcbSituacao.setSelectedIndex(0);
            jcbEstado.addItem("Estado");
            jcbEstado.setSelectedItem("Estado");
            jcbCidade.removeAllItems();
            jcbCidade.addItem("Cidade");
            jcbCidade.setSelectedItem("Cidade");
            jtfRua.setText("Rua do aeroporto");
            jsNumero.setValue(0);
            jtfCep.setText("Digite o cep do aeroporto");
            tfdId.setText("");

            AeroportoDao.popularTabela(tblAeroporto, "", "", "");

        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void bntCancelarAeroportoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntCancelarAeroportoActionPerformed
        this.dispose();
    }//GEN-LAST:event_bntCancelarAeroportoActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void tfdEmailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfdEmailFocusGained
        if (tfdEmail.getText().equals("Digite o e-mail do aeroporto")) {
            tfdEmail.setText("");
        }
    }//GEN-LAST:event_tfdEmailFocusGained

    private void tfdEmailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfdEmailFocusLost
        if (tfdEmail.getText().equals("")) {
            tfdEmail.setText("Digite o e-mail do aeroporto");
        }
    }//GEN-LAST:event_tfdEmailFocusLost

    private void jcbEstadoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jcbEstadoFocusLost
        for (Estado estado : this.listaEstados) {
            if (jcbEstado.getSelectedItem().equals(estado.getNome())) {
                tfdIdEstado.setText(String.valueOf(estado.getId()));
            }
        }
        if (!tfdIdEstado.equals("")) {
            jcbCidade.removeAllItems();
            jcbCidade.addItem("Cidade");
            CidadeDao.getInstance().popularCidades(jcbCidade, Integer.parseInt(tfdIdEstado.getText()));
        }
    }//GEN-LAST:event_jcbEstadoFocusLost

    private void jcbCidadeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jcbCidadeFocusGained

    }//GEN-LAST:event_jcbCidadeFocusGained

    private void jcbEstadoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jcbEstadoFocusGained

    }//GEN-LAST:event_jcbEstadoFocusGained

    private void jtfCnpjFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtfCnpjFocusGained
        if (jtfCnpj.getText().equals("Digite o cnpj do aeroporto")) {
            jtfCnpj.setText("");
        }
    }//GEN-LAST:event_jtfCnpjFocusGained

    private void jtfCnpjFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtfCnpjFocusLost
        if (jtfCnpj.getText().equals("")) {
            jtfCnpj.setText("Digite o cnpj do aeroporto");
        }
    }//GEN-LAST:event_jtfCnpjFocusLost

    private void jtfdNomeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtfdNomeFocusGained
        if (jtfdNome.getText().equals("Digite o nome do aeroporto")) {
            jtfdNome.setText("");
        }
    }//GEN-LAST:event_jtfdNomeFocusGained

    private void jtfdNomeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtfdNomeFocusLost
        if (jtfdNome.getText().equals("")) {
            jtfdNome.setText("Digite o nome do aeroporto");
        }
    }//GEN-LAST:event_jtfdNomeFocusLost

    private void jtfdTelefoneFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtfdTelefoneFocusGained
        if (jtfdTelefone.getText().equals("Digite o telefone do aeroporto")) {
            jtfdTelefone.setText("");
        }
    }//GEN-LAST:event_jtfdTelefoneFocusGained

    private void jtfdTelefoneFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtfdTelefoneFocusLost
        if (jtfdTelefone.getText().equals("")) {
            jtfdTelefone.setText("Digite o telefone do aeroporto");
        }
    }//GEN-LAST:event_jtfdTelefoneFocusLost

    private void jcbEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbEstadoActionPerformed

    }//GEN-LAST:event_jcbEstadoActionPerformed

    private void jcbEstadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jcbEstadoMouseClicked

    }//GEN-LAST:event_jcbEstadoMouseClicked

    private void jcbEstadoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jcbEstadoMouseExited
        if (!jcbEstado.getSelectedItem().equals("Estado")) {
            jcbEstado.removeItem("Estado");
        }
    }//GEN-LAST:event_jcbEstadoMouseExited

    private void jcbCidadeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jcbCidadeMouseClicked

    }//GEN-LAST:event_jcbCidadeMouseClicked

    private void jcbEstadoMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jcbEstadoMouseReleased

    }//GEN-LAST:event_jcbEstadoMouseReleased

    private void jcbCidadeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jcbCidadeMouseExited

    }//GEN-LAST:event_jcbCidadeMouseExited

    private void jcbCidadeMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jcbCidadeMouseMoved

    }//GEN-LAST:event_jcbCidadeMouseMoved

    private void jcbCidadeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jcbCidadeFocusLost

    }//GEN-LAST:event_jcbCidadeFocusLost

    private void jtfRuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfRuaActionPerformed

    }//GEN-LAST:event_jtfRuaActionPerformed

    private void jsNumeroFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jsNumeroFocusGained

    }//GEN-LAST:event_jsNumeroFocusGained

    private void jcbEstadoMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jcbEstadoMouseMoved

    }//GEN-LAST:event_jcbEstadoMouseMoved

    private void jcbEstadoMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jcbEstadoMouseDragged

    }//GEN-LAST:event_jcbEstadoMouseDragged

    private void jcbEstadoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jcbEstadoMousePressed

    }//GEN-LAST:event_jcbEstadoMousePressed

    private void jtfRuaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtfRuaFocusGained
        if (jtfRua.getText().equals("Rua do aeroporto")) {
            jtfRua.setText("");
        }
    }//GEN-LAST:event_jtfRuaFocusGained

    private void jtfRuaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtfRuaFocusLost
        if (jtfRua.getText().equals("")) {
            jtfRua.setText("Rua do aeroporto");
        }
    }//GEN-LAST:event_jtfRuaFocusLost

    private void jtfCepFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtfCepFocusGained
        if (jtfCep.getText().equals("Digite o cep do aeroporto")) {
            jtfCep.setText("");
        }
    }//GEN-LAST:event_jtfCepFocusGained

    private void jtfCepFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtfCepFocusLost
        if (jtfCep.getText().equals("")) {
            jtfCep.setText("Digite o cep do aeroporto");
        }
    }//GEN-LAST:event_jtfCepFocusLost

    private void jcbCidadeMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jcbCidadeMouseReleased

    }//GEN-LAST:event_jcbCidadeMouseReleased

    private void jcbCidadeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jcbCidadeMousePressed

    }//GEN-LAST:event_jcbCidadeMousePressed

    private void jcbCidadeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jcbCidadeMouseEntered

    }//GEN-LAST:event_jcbCidadeMouseEntered

    private void jcbCidadeMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jcbCidadeMouseDragged

    }//GEN-LAST:event_jcbCidadeMouseDragged

    private void jPanel1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseMoved
        if (!jcbCidade.getSelectedItem().equals("Cidade")) {
            jcbCidade.removeItem("Cidade");
            for (Cidade cidade : CidadeDao.getInstance().pegarTodasCidades()) {
                if (jcbCidade.getSelectedItem().equals(cidade.getNome())) {
                    tfdIdCidade.setText(String.valueOf(cidade.getId()));
                }
            }
        }
    }//GEN-LAST:event_jPanel1MouseMoved

    private void jPanel1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPanel1FocusGained

    }//GEN-LAST:event_jPanel1FocusGained


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntCancelarAeroporto;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JTextField cepPesquisa;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JComboBox<String> jcbCidade;
    private javax.swing.JComboBox<String> jcbEstado;
    private javax.swing.JComboBox<String> jcbSituacao;
    private javax.swing.JComboBox jcbStatus;
    private javax.swing.JSpinner jsNumero;
    private javax.swing.JTabbedPane jtbAeroporto;
    private javax.swing.JTextField jtfCep;
    private javax.swing.JTextField jtfCnpj;
    private javax.swing.JTextField jtfRua;
    private javax.swing.JTextField jtfdNome;
    private javax.swing.JTextField jtfdTelefone;
    private javax.swing.JTextField nomePesquisa;
    private javax.swing.JTable tblAeroporto;
    private javax.swing.JTextField tfdEmail;
    private javax.swing.JTextField tfdId;
    private javax.swing.JTextField tfdIdCidade;
    private javax.swing.JTextField tfdIdEstado;
    // End of variables declaration//GEN-END:variables
}
