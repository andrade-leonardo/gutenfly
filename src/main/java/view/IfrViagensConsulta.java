package view;

import dao.AeroportoDao;
import dao.AviaoDao;
import dao.DaoMestre;
import dao.DestinoVooDao;
import dao.FuncionarioDao;
import dao.OrigemVooDao;
import dao.ViagemDao;
import dao.ViagemFuncionarioDao;
import javax.swing.JOptionPane;
import model.DestinoVoo;
import model.OrigemVoo;
import model.Viagem;
import model.ViagemFuncionario;
import java.text.SimpleDateFormat;
import java.util.List;

public class IfrViagensConsulta extends javax.swing.JInternalFrame {

    public static final SimpleDateFormat fomartarData = new SimpleDateFormat("dd/MM/yyyy");

    public IfrViagensConsulta() {
        initComponents();

        AviaoDao.getInstance().pegarTodosAvioes("", 0, jcbAviao);
        AeroportoDao.pegarTodosAeroportos("", "", "", jcbAeroportoOrigem);
        AeroportoDao.pegarTodosAeroportos("", "", "", jcbAeroportoDestino);
        FuncionarioDao.pegarTodosFuncionarios("", "", "", "Piloto", jcbPiloto);
        FuncionarioDao.pegarTodosFuncionarios("", "", "", "Copiloto", jcbCopiloto);
        FuncionarioDao.pegarTodosFuncionarios("", "", "", "Comissário(a)", jcbComissario1);
        FuncionarioDao.pegarTodosFuncionarios("", "", "", "Comissário(a)", jcbComissario2);
        FuncionarioDao.pegarTodosFuncionarios("", "", "", "Comissário(a)", jcbComissario3);
        
        jcbPiloto.setEnabled(false);
        jcbCopiloto.setEnabled(false);
        jcbComissario1.setEnabled(false);
        jcbComissario2.setEnabled(false);
        jcbComissario3.setEnabled(false);
        jcbAviao.setEnabled(false);
        jcbPortaoEmbarque.setEnabled(false);
        jcbPortaoDesembarque.setEnabled(false);
        jcbSituacao.setEnabled(false);
        jcbAeroportoOrigem.setEnabled(false);
        jcbAeroportoDestino.setEnabled(false);
        tfdDataSaida.setEnabled(false);
        tfdHorarioSaida.setEnabled(false);;
        tfdDataChegada.setEnabled(false);
        tfdHorarioChegada.setEnabled(false);
        tfdPassagem.setEnabled(false);
        
        ViagemDao.popularTabela(tblViagem);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jtbViagem = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jSeparator2 = new javax.swing.JSeparator();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblViagem = new javax.swing.JTable();
        jButton4 = new javax.swing.JButton();
        btnVisualizar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tfdDataSaida = new javax.swing.JFormattedTextField();
        tfdHorarioSaida = new javax.swing.JFormattedTextField();
        jLabel6 = new javax.swing.JLabel();
        jcbAeroportoOrigem = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jcbPortaoEmbarque = new javax.swing.JComboBox<>();
        tfdPassagem = new javax.swing.JFormattedTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jcbAeroportoDestino = new javax.swing.JComboBox<>();
        tfdDataChegada = new javax.swing.JFormattedTextField();
        tfdHorarioChegada = new javax.swing.JFormattedTextField();
        jcbPortaoDesembarque = new javax.swing.JComboBox<>();
        jcbSituacao = new javax.swing.JComboBox<>();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jcbAviao = new javax.swing.JComboBox<>();
        jcbPiloto = new javax.swing.JComboBox<>();
        jcbCopiloto = new javax.swing.JComboBox<>();
        jcbComissario2 = new javax.swing.JComboBox<>();
        jcbComissario3 = new javax.swing.JComboBox<>();
        jcbComissario1 = new javax.swing.JComboBox<>();
        bntRetorno = new javax.swing.JButton();

        setTitle("Viagens");

        jPanel2.setBackground(new java.awt.Color(0, 102, 255));

        tblViagem.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        tblViagem.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(tblViagem);

        jButton4.setBackground(new java.awt.Color(255, 255, 255));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/cancelar.png"))); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        btnVisualizar.setBackground(new java.awt.Color(255, 255, 255));
        btnVisualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/visualizador-de-dados.png"))); // NOI18N
        btnVisualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVisualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jSeparator2)
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 784, Short.MAX_VALUE)
                        .addGap(10, 10, 10))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnVisualizar)
                        .addContainerGap())))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnVisualizar, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(10, 10, 10))
        );

        jtbViagem.addTab("Consultar", jPanel2);

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

        jLabel3.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Origem Voo:");

        jLabel4.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Destino Voo:");

        jLabel5.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Valor Passagem (R$):");

        try {
            tfdDataSaida.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        tfdDataSaida.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N

        try {
            tfdHorarioSaida.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        tfdHorarioSaida.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Data Saída:");

        jcbAeroportoOrigem.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        jcbAeroportoOrigem.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione o Aeroporto" }));
        jcbAeroportoOrigem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbAeroportoOrigemActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Hora Saída:");

        jcbPortaoEmbarque.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        jcbPortaoEmbarque.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione o Portão", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));

        try {
            tfdPassagem.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####,##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        tfdPassagem.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        tfdPassagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfdPassagemActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Portão de Embarque:");

        jLabel11.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Data Chegada:");

        jLabel12.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Hora Chegada:");

        jLabel13.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Portão de Desembarque:");

        jLabel14.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Situação:");

        jcbAeroportoDestino.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        jcbAeroportoDestino.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione o Aeroporto" }));
        jcbAeroportoDestino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbAeroportoDestinoActionPerformed(evt);
            }
        });

        try {
            tfdDataChegada.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        tfdDataChegada.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N

        try {
            tfdHorarioChegada.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        tfdHorarioChegada.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        tfdHorarioChegada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfdHorarioChegadaActionPerformed(evt);
            }
        });

        jcbPortaoDesembarque.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        jcbPortaoDesembarque.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione o Portão", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));

        jcbSituacao.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        jcbSituacao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ativo", "Inativo" }));

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel15.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Avião:");

        jLabel17.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Piloto:");

        jLabel18.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Copiloto:");

        jLabel19.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Comissário 1:");

        jLabel21.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Comissário 3:");

        jLabel22.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Comissário 2:");

        jcbAviao.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        jcbAviao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione o Avião" }));
        jcbAviao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbAviaoActionPerformed(evt);
            }
        });

        jcbPiloto.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        jcbPiloto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione o Piloto" }));

        jcbCopiloto.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        jcbCopiloto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione o Copiloto" }));

        jcbComissario2.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        jcbComissario2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione o Comissário" }));

        jcbComissario3.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        jcbComissario3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione o Comissário" }));

        jcbComissario1.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        jcbComissario1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione o Comissário" }));

        bntRetorno.setBackground(new java.awt.Color(255, 255, 255));
        bntRetorno.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        bntRetorno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/back.png"))); // NOI18N
        bntRetorno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntRetornoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(tfdHorarioSaida)
                                        .addGap(201, 201, 201))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel5)
                                                .addGap(2, 2, 2))
                                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING))
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(tfdPassagem, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addComponent(jcbPortaoEmbarque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(7, 7, 7)
                                        .addComponent(jLabel12)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(tfdHorarioChegada, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(8, 8, 8)
                                        .addComponent(jLabel14)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jcbSituacao, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(8, 8, 8)
                                        .addComponent(jLabel13)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jcbPortaoDesembarque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(tfdDataSaida, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jcbAeroportoOrigem, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(85, 85, 85)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel11))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jcbAeroportoDestino, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(tfdDataChegada, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))))
                        .addGap(55, 55, 55))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 784, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel18)
                                    .addComponent(jLabel17)
                                    .addComponent(jLabel15))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jcbAviao, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jcbPiloto, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jcbCopiloto, 0, 206, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel19)
                                    .addComponent(jLabel22)
                                    .addComponent(jLabel21))
                                .addGap(28, 28, 28)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jcbComissario1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jcbComissario2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jcbComissario3, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(28, 28, 28)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(bntRetorno, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jcbAeroportoOrigem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcbAeroportoDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(tfdDataChegada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(tfdDataSaida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(tfdHorarioSaida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jcbPortaoEmbarque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(2, 2, 2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(tfdHorarioChegada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jcbPortaoDesembarque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13))
                        .addGap(4, 4, 4)))
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(tfdPassagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(jcbSituacao, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel15)
                        .addComponent(jcbAviao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jcbComissario1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel19)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17)
                            .addComponent(jcbPiloto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel22, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addComponent(jcbComissario2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel18)
                        .addComponent(jcbCopiloto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jcbComissario3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel21)))
                .addGap(18, 18, 18)
                .addComponent(bntRetorno)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jtbViagem.addTab("Cadastro", jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jtbViagem)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jtbViagem, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jPanel1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPanel1FocusGained

    }//GEN-LAST:event_jPanel1FocusGained

    private void jPanel1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseMoved
        
    }//GEN-LAST:event_jPanel1MouseMoved

    private void jcbAeroportoOrigemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbAeroportoOrigemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbAeroportoOrigemActionPerformed

    private void jcbAeroportoDestinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbAeroportoDestinoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbAeroportoDestinoActionPerformed

    private void tfdHorarioChegadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfdHorarioChegadaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfdHorarioChegadaActionPerformed

    private void jcbAviaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbAviaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbAviaoActionPerformed

    private void tfdPassagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfdPassagemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfdPassagemActionPerformed

    private void btnVisualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVisualizarActionPerformed
        String id = String.valueOf(tblViagem.getValueAt(tblViagem.getSelectedRow(), 0));

        Viagem viagem = ViagemDao.pegarViagemPeloId(Integer.parseInt(id));
        DestinoVoo destino = DestinoVooDao.pegarDestinoId(viagem.getId());
        OrigemVoo origem = OrigemVooDao.pegarOrigemId(viagem.getId());
        ViagemFuncionario piloto = ViagemFuncionarioDao.pegarViagemFuncionarioId(viagem.getId(), "Piloto").get(0);
        ViagemFuncionario copiloto = ViagemFuncionarioDao.pegarViagemFuncionarioId(viagem.getId(), "Copiloto").get(0);
        List<ViagemFuncionario> comissarios = ViagemFuncionarioDao.pegarViagemFuncionarioId(viagem.getId(), "Comissário(a)");

        jcbSituacao.setSelectedIndex(viagem.getSituacao() == true ? 0 : 1);
        jcbAeroportoOrigem.setSelectedItem(origem.getAeroporto().getNome());
        jcbAeroportoDestino.setSelectedItem(destino.getAeroporto().getNome());
        tfdDataSaida.setText(fomartarData.format(origem.getData()));
        tfdDataChegada.setText(fomartarData.format(destino.getData()));
        tfdHorarioSaida.setText(origem.getHorario());
        tfdHorarioChegada.setText(destino.getHorario());
        jcbPortaoEmbarque.setSelectedItem(origem.getPortaoEmbarque());
        jcbPortaoDesembarque.setSelectedItem(destino.getPortaoDesembarque());
        tfdPassagem.setText(String.valueOf(viagem.getPreco()).replace(".", ","));
        jcbAviao.setSelectedItem(viagem.getAviao().getNome());
        jcbPiloto.setSelectedItem(piloto.getFuncionario().getNome());
        jcbCopiloto.setSelectedItem(copiloto.getFuncionario().getNome());
        jcbComissario1.setSelectedItem(comissarios.get(0).getFuncionario().getNome());
        jcbComissario2.setSelectedItem(comissarios.get(1).getFuncionario().getNome());
        jcbComissario3.setSelectedItem(comissarios.get(2).getFuncionario().getNome());

        jtbViagem.setSelectedIndex(1);
    }//GEN-LAST:event_btnVisualizarActionPerformed

    private void bntRetornoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntRetornoActionPerformed
        jcbPiloto.addItem("Selecione o Piloto");
        jcbPiloto.setSelectedItem("Selecione o Piloto");
        jcbCopiloto.addItem("Selecione o Copiloto");
        jcbCopiloto.setSelectedItem("Selecione o Copiloto");
        jcbComissario1.addItem("Selecione o Comissário");
        jcbComissario1.setSelectedItem("Selecione o Comissário");
        jcbComissario2.addItem("Selecione o Comissário");
        jcbComissario2.setSelectedItem("Selecione o Comissário");
        jcbComissario3.addItem("Selecione o Comissário");
        jcbComissario3.setSelectedItem("Selecione o Comissário");
        jcbAviao.addItem("Selecione o Avião");
        jcbAviao.setSelectedItem("Selecione o Avião");
        jcbPortaoEmbarque.addItem("Selecione o Portão");
        jcbPortaoEmbarque.setSelectedItem("Selecione o Portão");
        jcbPortaoDesembarque.addItem("Selecione o Portão");
        jcbPortaoDesembarque.setSelectedItem("Selecione o Portão");
        jcbSituacao.setSelectedIndex(0);
        jcbAeroportoOrigem.addItem("Selecione o Aeroporto");
        jcbAeroportoOrigem.setSelectedItem("Selecione o Aeroporto");
        jcbAeroportoDestino.addItem("Selecione o Aeroporto");
        jcbAeroportoDestino.setSelectedItem("Selecione o Aeroporto");
        tfdDataSaida.setText("");
        tfdHorarioSaida.setText("");
        tfdDataChegada.setText("");
        tfdHorarioChegada.setText("");
        tfdPassagem.setText("");

        jtbViagem.setSelectedIndex(0);
    }//GEN-LAST:event_bntRetornoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntRetorno;
    private javax.swing.JButton btnVisualizar;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JComboBox<String> jcbAeroportoDestino;
    private javax.swing.JComboBox<String> jcbAeroportoOrigem;
    private javax.swing.JComboBox<String> jcbAviao;
    private javax.swing.JComboBox<String> jcbComissario1;
    private javax.swing.JComboBox<String> jcbComissario2;
    private javax.swing.JComboBox<String> jcbComissario3;
    private javax.swing.JComboBox<String> jcbCopiloto;
    private javax.swing.JComboBox<String> jcbPiloto;
    private javax.swing.JComboBox<String> jcbPortaoDesembarque;
    private javax.swing.JComboBox<String> jcbPortaoEmbarque;
    private javax.swing.JComboBox<String> jcbSituacao;
    private javax.swing.JTabbedPane jtbViagem;
    private javax.swing.JTable tblViagem;
    private javax.swing.JFormattedTextField tfdDataChegada;
    private javax.swing.JFormattedTextField tfdDataSaida;
    private javax.swing.JFormattedTextField tfdHorarioChegada;
    private javax.swing.JFormattedTextField tfdHorarioSaida;
    private javax.swing.JFormattedTextField tfdPassagem;
    // End of variables declaration//GEN-END:variables
}
