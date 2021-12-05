package view;

import dao.AeroportoDao;
import dao.AviaoDao;
import dao.CidadeDao;
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

public class IfrViagens extends javax.swing.JInternalFrame {

    public static final SimpleDateFormat fomartarData = new SimpleDateFormat("dd/MM/yyyy");

    public IfrViagens() {
        initComponents();

        AviaoDao.getInstance().pegarTodosAvioes("", 0, jcbAviao);
        AeroportoDao.pegarTodosAeroportos("", "", "", jcbAeroportoOrigem);
        AeroportoDao.pegarTodosAeroportos("", "", "", jcbAeroportoDestino);
        FuncionarioDao.pegarTodosFuncionarios("", "", "", "Piloto", jcbPiloto);
        FuncionarioDao.pegarTodosFuncionarios("", "", "", "Copiloto", jcbCopiloto);
        FuncionarioDao.pegarTodosFuncionarios("", "", "", "Comissário(a)", jcbComissario1);
        FuncionarioDao.pegarTodosFuncionarios("", "", "", "Comissário(a)", jcbComissario2);
        FuncionarioDao.pegarTodosFuncionarios("", "", "", "Comissário(a)", jcbComissario3);
   
        tfidAviao.setVisible(false);
        tfdIdPiloto.setVisible(false);
        tfdIdCopiloto.setVisible(false);
        tfdIdComissario.setVisible(false);
        tfdIdComissario2.setVisible(false);
        tfdIdComissario3.setVisible(false);
        tfdIdOrigemVoo.setVisible(false);
        tfdIdDestinoVoo.setVisible(false);
        bntRetorno.hide();
        
        ViagemDao.popularTabela(tblViagem);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jtbViagem = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        tfdIdPiloto = new javax.swing.JTextField();
        bntCancelarAeroporto = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
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
        tfidAviao = new javax.swing.JTextField();
        jcbAviao = new javax.swing.JComboBox<>();
        jcbPiloto = new javax.swing.JComboBox<>();
        jcbCopiloto = new javax.swing.JComboBox<>();
        jcbComissario2 = new javax.swing.JComboBox<>();
        jcbComissario3 = new javax.swing.JComboBox<>();
        jcbComissario1 = new javax.swing.JComboBox<>();
        tfdIdComissario = new javax.swing.JTextField();
        tfdIdCopiloto = new javax.swing.JTextField();
        tfdIdOrigemVoo = new javax.swing.JTextField();
        tfdIdComissario2 = new javax.swing.JTextField();
        tfdIdComissario3 = new javax.swing.JTextField();
        tfdIdDestinoVoo = new javax.swing.JTextField();
        bntRetorno = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jSeparator2 = new javax.swing.JSeparator();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblViagem = new javax.swing.JTable();
        jbnDeletar = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        btnVisualizar = new javax.swing.JButton();

        setTitle("Viagens");

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

        tfdIdPiloto.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        tfdIdPiloto.setEnabled(false);

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

        tfidAviao.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        tfidAviao.setEnabled(false);

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

        tfdIdComissario.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        tfdIdComissario.setEnabled(false);

        tfdIdCopiloto.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        tfdIdCopiloto.setEnabled(false);

        tfdIdOrigemVoo.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        tfdIdOrigemVoo.setEnabled(false);

        tfdIdComissario2.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        tfdIdComissario2.setEnabled(false);

        tfdIdComissario3.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        tfdIdComissario3.setEnabled(false);

        tfdIdDestinoVoo.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        tfdIdDestinoVoo.setEnabled(false);

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
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                                        .addComponent(jcbCopiloto, 0, 206, Short.MAX_VALUE)
                                        .addComponent(tfdIdComissario3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
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
                                            .addGap(28, 28, 28))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                            .addGap(18, 18, 18)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addGap(0, 0, Short.MAX_VALUE)
                                                    .addComponent(btnSalvar))
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addComponent(tfdIdComissario2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(26, 26, 26)
                                                    .addComponent(tfdIdDestinoVoo, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(32, 32, 32)
                                                    .addComponent(tfdIdOrigemVoo, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(tfdIdCopiloto, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(bntRetorno, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGap(16, 16, 16)))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(bntCancelarAeroporto, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(tfdIdComissario, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(54, 54, 54)
                                .addComponent(tfidAviao, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(123, 123, 123)
                                .addComponent(tfdIdPiloto, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
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
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfdIdOrigemVoo, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfdIdComissario2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfdIdComissario3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfdIdDestinoVoo, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfdIdCopiloto, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfidAviao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfdIdPiloto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfdIdComissario, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 29, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(bntRetorno)
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bntCancelarAeroporto)
                            .addComponent(btnSalvar))))
                .addContainerGap())
        );

        jtbViagem.addTab("Cadastro", jPanel1);

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

        jbnDeletar.setBackground(new java.awt.Color(255, 255, 255));
        jbnDeletar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/trash.png"))); // NOI18N
        jbnDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbnDeletarActionPerformed(evt);
            }
        });

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
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 784, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbnDeletar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnVisualizar))
                    .addComponent(jSeparator2))
                .addGap(10, 10, 10))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 423, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton4)
                    .addComponent(jbnDeletar)
                    .addComponent(btnVisualizar))
                .addContainerGap())
        );

        jtbViagem.addTab("Consultar", jPanel2);

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

    private void jbnDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbnDeletarActionPerformed
        String id = String.valueOf(tblViagem.getValueAt(tblViagem.getSelectedRow(), 0));
        ViagemDao.deletar(ViagemDao.pegarViagemPeloId(Integer.parseInt(id)));
        ViagemDao.popularTabela(tblViagem);
    }//GEN-LAST:event_jbnDeletarActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jPanel1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPanel1FocusGained

    }//GEN-LAST:event_jPanel1FocusGained

    private void jPanel1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseMoved
        AviaoDao.validaBuscaAviao(jcbAviao, tfidAviao);
        if (!jcbAviao.getSelectedItem().equals("Selecione o Avião")) {
            jcbAviao.removeItem("Selecione o Avião");
        }
        FuncionarioDao.validaBuscaFuncionario(jcbPiloto, tfdIdPiloto);
        if (!jcbPiloto.getSelectedItem().equals("Selecione o Piloto")) {
            jcbPiloto.removeItem("Selecione o Piloto");
        }
        FuncionarioDao.validaBuscaFuncionario(jcbCopiloto, tfdIdCopiloto);
        if (!jcbCopiloto.getSelectedItem().equals("Selecione o Copiloto")) {
            jcbCopiloto.removeItem("Selecione o Copiloto");
        }
        FuncionarioDao.validaBuscaFuncionario(jcbComissario1, tfdIdComissario);
        if (!jcbComissario1.getSelectedItem().equals("Selecione o Comissário")) {
            jcbComissario1.removeItem("Selecione o Comissário");
        }
        FuncionarioDao.validaBuscaFuncionario(jcbComissario2, tfdIdComissario2);
        if (!jcbComissario2.getSelectedItem().equals("Selecione o Comissário")) {
            jcbComissario2.removeItem("Selecione o Comissário");
        }
        FuncionarioDao.validaBuscaFuncionario(jcbComissario3, tfdIdComissario3);
        if (!jcbComissario3.getSelectedItem().equals("Selecione o Comissário")) {
            jcbComissario3.removeItem("Selecione o Comissário");
        }
        AeroportoDao.validaBuscaAeroporto(jcbAeroportoDestino, tfdIdDestinoVoo);
        if (!jcbAeroportoDestino.getSelectedItem().equals("Selecione o Aeroporto")) {
            jcbAeroportoDestino.removeItem("Selecione o Aeroporto");
        }
        AeroportoDao.validaBuscaAeroporto(jcbAeroportoOrigem, tfdIdOrigemVoo);
        if (!jcbAeroportoOrigem.getSelectedItem().equals("Selecione o Aeroporto")) {
            jcbAeroportoOrigem.removeItem("Selecione o Aeroporto");
        }
    }//GEN-LAST:event_jPanel1MouseMoved

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        try {
            DestinoVoo destinoVoo = new DestinoVoo();
            OrigemVoo origemVoo = new OrigemVoo();
            ViagemFuncionario comissario1 = new ViagemFuncionario();
            ViagemFuncionario comissario2 = new ViagemFuncionario();
            ViagemFuncionario comissario3 = new ViagemFuncionario();
            ViagemFuncionario piloto = new ViagemFuncionario();
            ViagemFuncionario copiloto = new ViagemFuncionario();
            Viagem v = new Viagem();

            v.setId(null);
            v.setAviao(AviaoDao.pegarAviaoPeloId(Integer.parseInt(tfidAviao.getText())));
            v.setPreco(Double.parseDouble(tfdPassagem.getText().replace(",", ".")));
            v.setSituacao((jcbSituacao.getSelectedItem() == "Ativo"));

            origemVoo.setId(null);
            origemVoo.setAeroporto(AeroportoDao.pegarAeroportoPeloId(Integer.parseInt(tfdIdOrigemVoo.getText())));
            origemVoo.setPortaoEmbarque(String.valueOf(jcbPortaoEmbarque.getSelectedItem()));
            origemVoo.setData(fomartarData.parse(tfdDataChegada.getText()));
            origemVoo.setHorario(tfdHorarioChegada.getText());
            origemVoo.setViagem(v);

            destinoVoo.setId(null);
            destinoVoo.setAeroporto(AeroportoDao.pegarAeroportoPeloId(Integer.parseInt(tfdIdDestinoVoo.getText())));
            destinoVoo.setPortaoDesembarque(String.valueOf(jcbPortaoDesembarque.getSelectedItem()));
            destinoVoo.setData(fomartarData.parse(tfdDataSaida.getText()));
            destinoVoo.setHorario(tfdHorarioSaida.getText());
            destinoVoo.setViagem(v);

            piloto.setId(null);
            piloto.setFuncionario(FuncionarioDao.pegarFuncionarioPeloId(Integer.parseInt(tfdIdPiloto.getText())));
            piloto.setViagem(v);

            copiloto.setId(null);
            copiloto.setFuncionario(FuncionarioDao.pegarFuncionarioPeloId(Integer.parseInt(tfdIdCopiloto.getText())));
            copiloto.setViagem(v);

            comissario1.setId(null);
            comissario1.setFuncionario(FuncionarioDao.pegarFuncionarioPeloId(Integer.parseInt(tfdIdComissario.getText())));
            comissario1.setViagem(v);

            comissario2.setId(null);
            comissario2.setFuncionario(FuncionarioDao.pegarFuncionarioPeloId(Integer.parseInt(tfdIdComissario2.getText())));
            comissario2.setViagem(v);

            comissario3.setId(null);
            comissario3.setFuncionario(FuncionarioDao.pegarFuncionarioPeloId(Integer.parseInt(tfdIdComissario3.getText())));
            comissario3.setViagem(v);

            DaoMestre.inserir(v);
            DaoMestre.inserir(origemVoo);
            DaoMestre.inserir(destinoVoo);
            DaoMestre.inserir(piloto);
            DaoMestre.inserir(copiloto);
            DaoMestre.inserir(comissario1);
            DaoMestre.inserir(comissario2);
            DaoMestre.inserir(comissario3);
            JOptionPane.showMessageDialog(null, "Registro salvo com sucesso!");

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
            tfdIdOrigemVoo.setText("");
            tfdIdPiloto.setText("");
            tfdIdCopiloto.setText("");
            tfdIdDestinoVoo.setText("");
            tfidAviao.setText("");
            tfdIdComissario.setText("");
            tfdIdComissario2.setText("");
            tfdIdComissario3.setText("");

            ViagemDao.popularTabela(tblViagem);

        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void bntCancelarAeroportoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntCancelarAeroportoActionPerformed
        this.dispose();
    }//GEN-LAST:event_bntCancelarAeroportoActionPerformed

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
        btnSalvar.hide();
        bntCancelarAeroporto.hide();
        bntRetorno.show();

        jtbViagem.setSelectedIndex(0);
    }//GEN-LAST:event_btnVisualizarActionPerformed

    private void bntRetornoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntRetornoActionPerformed
        jcbPiloto.setEnabled(true);
        jcbCopiloto.setEnabled(true);
        jcbComissario1.setEnabled(true);
        jcbComissario2.setEnabled(true);
        jcbComissario3.setEnabled(true);
        jcbAviao.setEnabled(true);
        jcbPortaoEmbarque.setEnabled(true);
        jcbPortaoDesembarque.setEnabled(true);
        jcbSituacao.setEnabled(true);
        jcbAeroportoOrigem.setEnabled(true);
        jcbAeroportoDestino.setEnabled(true);
        tfdDataSaida.setEnabled(true);
        tfdHorarioSaida.setEnabled(true);;
        tfdDataChegada.setEnabled(true);
        tfdHorarioChegada.setEnabled(true);
        tfdPassagem.setEnabled(true);
        btnSalvar.show();
        bntCancelarAeroporto.show();
        bntRetorno.hide();

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
        tfdIdOrigemVoo.setText("");
        tfdIdPiloto.setText("");
        tfdIdCopiloto.setText("");
        tfdIdDestinoVoo.setText("");
        tfidAviao.setText("");
        tfdIdComissario.setText("");
        tfdIdComissario2.setText("");
        tfdIdComissario3.setText("");

        jtbViagem.setSelectedIndex(1);
    }//GEN-LAST:event_bntRetornoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntCancelarAeroporto;
    private javax.swing.JButton bntRetorno;
    private javax.swing.JButton btnSalvar;
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
    private javax.swing.JButton jbnDeletar;
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
    private javax.swing.JTextField tfdIdComissario;
    private javax.swing.JTextField tfdIdComissario2;
    private javax.swing.JTextField tfdIdComissario3;
    private javax.swing.JTextField tfdIdCopiloto;
    private javax.swing.JTextField tfdIdDestinoVoo;
    private javax.swing.JTextField tfdIdOrigemVoo;
    private javax.swing.JTextField tfdIdPiloto;
    private javax.swing.JFormattedTextField tfdPassagem;
    private javax.swing.JTextField tfidAviao;
    // End of variables declaration//GEN-END:variables
}
