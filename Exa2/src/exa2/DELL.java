package exa2;

import java.awt.*;
import java.util.*;
import javax.swing.*;

public class DELL extends javax.swing.JFrame {

    public DELL() {
        initComponents();
        ab = new adminbarra(jbr_Esamblaje_por_partes);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jd_Crear_Computadora = new javax.swing.JDialog();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jdc_Año_C = new com.toedter.calendar.JDateChooser();
        tf_N_Serie = new javax.swing.JTextField();
        tf_Material = new javax.swing.JTextField();
        bt_Color = new javax.swing.JButton();
        bt_RAM = new javax.swing.JButton();
        bt_Disco_Duro = new javax.swing.JButton();
        bt_Bateria = new javax.swing.JButton();
        bt_Teclado = new javax.swing.JButton();
        bt_Pantalla = new javax.swing.JButton();
        bt_Procesador = new javax.swing.JButton();
        bt_CrearC = new javax.swing.JButton();
        jd_RAM = new javax.swing.JDialog();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tf_Tamaño = new javax.swing.JTextField();
        tf_Marca = new javax.swing.JTextField();
        bt_AgregarRam = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        tf_Ensamblaje = new javax.swing.JTextField();
        jd_Disco_Duro = new javax.swing.JDialog();
        bt_AgregarDiscoDuro = new javax.swing.JButton();
        tf_Ensamblaje1 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        tf_Marca1 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        tf_Tamaño1 = new javax.swing.JTextField();
        jd_Bateria = new javax.swing.JDialog();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        tf_Horas = new javax.swing.JTextField();
        tf_Material1 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        tf_Ensamblaje2 = new javax.swing.JTextField();
        bt_AgregarBateria = new javax.swing.JButton();
        jd_Teclado = new javax.swing.JDialog();
        bt_AgregarTeclado = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        tf_Ensamblaje3 = new javax.swing.JTextField();
        tf_Material2 = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        bt_Color1 = new javax.swing.JButton();
        jd_Pantalla = new javax.swing.JDialog();
        jLabel23 = new javax.swing.JLabel();
        tf_Tactil = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        tf_Tipo = new javax.swing.JTextField();
        bt_AgregarPantalla = new javax.swing.JButton();
        tf_Ensamblaje4 = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jd_Procesador = new javax.swing.JDialog();
        bt_AgregarProcesador = new javax.swing.JButton();
        jLabel26 = new javax.swing.JLabel();
        tf_Ensamblaje5 = new javax.swing.JTextField();
        tf_Velocidad = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        tf_Nucleos = new javax.swing.JTextField();
        jd_Tecnico = new javax.swing.JDialog();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        tf_Nombre = new javax.swing.JTextField();
        tf_Edad = new javax.swing.JTextField();
        tf_Genero = new javax.swing.JTextField();
        bt_CrearTecnico = new javax.swing.JButton();
        jd_Esamblaje = new javax.swing.JDialog();
        jLabel12 = new javax.swing.JLabel();
        jbr_Esamblaje_por_partes = new javax.swing.JProgressBar();
        jScrollPane1 = new javax.swing.JScrollPane();
        JL_Tecnicos = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        JL_Computadoras = new javax.swing.JList<>();
        jLabel22 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel30 = new javax.swing.JLabel();
        bt_Iniciar = new javax.swing.JButton();
        bt_Tecnico = new javax.swing.JButton();
        bt_Computadora = new javax.swing.JButton();
        bt_Ensamble = new javax.swing.JButton();
        bt_Administrar_C = new javax.swing.JButton();
        bt_Administrar_T = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jd_Crear_Computadora.setTitle("Interfaz de Creacion de Computadoras");

        jLabel2.setText("Numero de Serie");

        jLabel4.setText("Año de Creacion");

        jLabel5.setText("Color");

        jLabel7.setText("Material");

        bt_Color.setBackground(new java.awt.Color(0, 255, 204));
        bt_Color.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_ColorActionPerformed(evt);
            }
        });

        bt_RAM.setText("RAM");
        bt_RAM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_RAMActionPerformed(evt);
            }
        });

        bt_Disco_Duro.setText("Disco Duro");
        bt_Disco_Duro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_Disco_DuroActionPerformed(evt);
            }
        });

        bt_Bateria.setText("Bateria");
        bt_Bateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_BateriaActionPerformed(evt);
            }
        });

        bt_Teclado.setText("Teclado");
        bt_Teclado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_TecladoActionPerformed(evt);
            }
        });

        bt_Pantalla.setText("Pantalla");
        bt_Pantalla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_PantallaActionPerformed(evt);
            }
        });

        bt_Procesador.setText("Procesador");
        bt_Procesador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_ProcesadorActionPerformed(evt);
            }
        });

        bt_CrearC.setText("Crear Computadora");
        bt_CrearC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_CrearCActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jd_Crear_ComputadoraLayout = new javax.swing.GroupLayout(jd_Crear_Computadora.getContentPane());
        jd_Crear_Computadora.getContentPane().setLayout(jd_Crear_ComputadoraLayout);
        jd_Crear_ComputadoraLayout.setHorizontalGroup(
            jd_Crear_ComputadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_Crear_ComputadoraLayout.createSequentialGroup()
                .addGroup(jd_Crear_ComputadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_Crear_ComputadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jd_Crear_ComputadoraLayout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addGap(18, 18, 18)
                            .addComponent(tf_N_Serie))
                        .addGroup(jd_Crear_ComputadoraLayout.createSequentialGroup()
                            .addComponent(jLabel7)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(tf_Material))
                        .addGroup(jd_Crear_ComputadoraLayout.createSequentialGroup()
                            .addGroup(jd_Crear_ComputadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jd_Crear_ComputadoraLayout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addGap(18, 18, 18)
                                    .addComponent(bt_Color, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addComponent(jLabel4))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jdc_Año_C, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jd_Crear_ComputadoraLayout.createSequentialGroup()
                        .addComponent(bt_RAM)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt_Disco_Duro)
                        .addGap(18, 18, 18)
                        .addComponent(bt_Bateria)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bt_Teclado))
                    .addGroup(jd_Crear_ComputadoraLayout.createSequentialGroup()
                        .addComponent(bt_Pantalla)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt_Procesador)))
                .addGap(0, 61, Short.MAX_VALUE))
            .addGroup(jd_Crear_ComputadoraLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(bt_CrearC)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jd_Crear_ComputadoraLayout.setVerticalGroup(
            jd_Crear_ComputadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_Crear_ComputadoraLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jd_Crear_ComputadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tf_N_Serie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jd_Crear_ComputadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jdc_Año_C, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jd_Crear_ComputadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_Crear_ComputadoraLayout.createSequentialGroup()
                        .addGap(0, 13, Short.MAX_VALUE)
                        .addComponent(jLabel5))
                    .addComponent(bt_Color, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jd_Crear_ComputadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(tf_Material, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_Crear_ComputadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_RAM)
                    .addComponent(bt_Disco_Duro)
                    .addComponent(bt_Bateria)
                    .addComponent(bt_Teclado))
                .addGap(18, 18, 18)
                .addGroup(jd_Crear_ComputadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_Pantalla)
                    .addComponent(bt_Procesador))
                .addGap(33, 33, 33)
                .addComponent(bt_CrearC)
                .addGap(28, 28, 28))
        );

        jd_RAM.setTitle("RAM");

        jLabel3.setText("Tamaño");

        jLabel6.setText("Marca");

        bt_AgregarRam.setText("Agregar");
        bt_AgregarRam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_AgregarRamActionPerformed(evt);
            }
        });

        jLabel8.setText("Timepo de Esamblaje");

        javax.swing.GroupLayout jd_RAMLayout = new javax.swing.GroupLayout(jd_RAM.getContentPane());
        jd_RAM.getContentPane().setLayout(jd_RAMLayout);
        jd_RAMLayout.setHorizontalGroup(
            jd_RAMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_RAMLayout.createSequentialGroup()
                .addGroup(jd_RAMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_RAMLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jd_RAMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jd_RAMLayout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(26, 26, 26)
                                .addComponent(tf_Tamaño, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jd_RAMLayout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tf_Marca, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jd_RAMLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(bt_AgregarRam))
                    .addGroup(jd_RAMLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(tf_Ensamblaje, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(160, Short.MAX_VALUE))
        );
        jd_RAMLayout.setVerticalGroup(
            jd_RAMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_RAMLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jd_RAMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tf_Tamaño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jd_RAMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(tf_Marca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jd_RAMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(tf_Ensamblaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addComponent(bt_AgregarRam)
                .addContainerGap(116, Short.MAX_VALUE))
        );

        jd_Disco_Duro.setTitle("Disco Duro");

        bt_AgregarDiscoDuro.setText("Agregar");
        bt_AgregarDiscoDuro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_AgregarDiscoDuroActionPerformed(evt);
            }
        });

        jLabel13.setText("Timepo de Esamblaje");

        jLabel14.setText("Marca");

        jLabel15.setText("Tamaño");

        javax.swing.GroupLayout jd_Disco_DuroLayout = new javax.swing.GroupLayout(jd_Disco_Duro.getContentPane());
        jd_Disco_Duro.getContentPane().setLayout(jd_Disco_DuroLayout);
        jd_Disco_DuroLayout.setHorizontalGroup(
            jd_Disco_DuroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_Disco_DuroLayout.createSequentialGroup()
                .addGroup(jd_Disco_DuroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_Disco_DuroLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jd_Disco_DuroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jd_Disco_DuroLayout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addGap(26, 26, 26)
                                .addComponent(tf_Tamaño1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jd_Disco_DuroLayout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tf_Marca1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jd_Disco_DuroLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(bt_AgregarDiscoDuro))
                    .addGroup(jd_Disco_DuroLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel13)
                        .addGap(18, 18, 18)
                        .addComponent(tf_Ensamblaje1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(160, Short.MAX_VALUE))
        );
        jd_Disco_DuroLayout.setVerticalGroup(
            jd_Disco_DuroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_Disco_DuroLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jd_Disco_DuroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(tf_Tamaño1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jd_Disco_DuroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(tf_Marca1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jd_Disco_DuroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(tf_Ensamblaje1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addComponent(bt_AgregarDiscoDuro)
                .addContainerGap(116, Short.MAX_VALUE))
        );

        jd_Bateria.setTitle("Bateria");

        jLabel16.setText("Material");

        jLabel17.setText("Cpacidad de Horas");

        jLabel18.setText("Timepo de Esamblaje");

        bt_AgregarBateria.setText("Agregar");
        bt_AgregarBateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_AgregarBateriaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jd_BateriaLayout = new javax.swing.GroupLayout(jd_Bateria.getContentPane());
        jd_Bateria.getContentPane().setLayout(jd_BateriaLayout);
        jd_BateriaLayout.setHorizontalGroup(
            jd_BateriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_BateriaLayout.createSequentialGroup()
                .addGroup(jd_BateriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_BateriaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jd_BateriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jd_BateriaLayout.createSequentialGroup()
                                .addComponent(jLabel17)
                                .addGap(26, 26, 26)
                                .addComponent(tf_Horas, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jd_BateriaLayout.createSequentialGroup()
                                .addComponent(jLabel16)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tf_Material1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jd_BateriaLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(bt_AgregarBateria))
                    .addGroup(jd_BateriaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel18)
                        .addGap(18, 18, 18)
                        .addComponent(tf_Ensamblaje2, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(160, Short.MAX_VALUE))
        );
        jd_BateriaLayout.setVerticalGroup(
            jd_BateriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_BateriaLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jd_BateriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(tf_Horas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jd_BateriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(tf_Material1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jd_BateriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(tf_Ensamblaje2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addComponent(bt_AgregarBateria)
                .addContainerGap(116, Short.MAX_VALUE))
        );

        bt_AgregarTeclado.setText("Agregar");
        bt_AgregarTeclado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_AgregarTecladoActionPerformed(evt);
            }
        });

        jLabel19.setText("Timepo de Esamblaje");

        jLabel20.setText("Material");

        jLabel21.setText("Color");

        bt_Color1.setBackground(new java.awt.Color(0, 255, 204));
        bt_Color1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_Color1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jd_TecladoLayout = new javax.swing.GroupLayout(jd_Teclado.getContentPane());
        jd_Teclado.getContentPane().setLayout(jd_TecladoLayout);
        jd_TecladoLayout.setHorizontalGroup(
            jd_TecladoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_TecladoLayout.createSequentialGroup()
                .addGroup(jd_TecladoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_TecladoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jd_TecladoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jd_TecladoLayout.createSequentialGroup()
                                .addComponent(jLabel21)
                                .addGap(18, 18, 18)
                                .addComponent(bt_Color1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jd_TecladoLayout.createSequentialGroup()
                                .addComponent(jLabel20)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tf_Material2, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jd_TecladoLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(bt_AgregarTeclado))
                    .addGroup(jd_TecladoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel19)
                        .addGap(18, 18, 18)
                        .addComponent(tf_Ensamblaje3, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(160, Short.MAX_VALUE))
        );
        jd_TecladoLayout.setVerticalGroup(
            jd_TecladoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_TecladoLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jd_TecladoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bt_Color1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jd_TecladoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(tf_Material2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jd_TecladoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(tf_Ensamblaje3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addComponent(bt_AgregarTeclado)
                .addContainerGap(121, Short.MAX_VALUE))
        );

        jd_Pantalla.setTitle("Teclado");

        jLabel23.setText("Tactil o no Tactil");

        jLabel24.setText("Timepo de Esamblaje");

        bt_AgregarPantalla.setText("Agregar");
        bt_AgregarPantalla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_AgregarPantallaActionPerformed(evt);
            }
        });

        jLabel25.setText("Tipo");

        javax.swing.GroupLayout jd_PantallaLayout = new javax.swing.GroupLayout(jd_Pantalla.getContentPane());
        jd_Pantalla.getContentPane().setLayout(jd_PantallaLayout);
        jd_PantallaLayout.setHorizontalGroup(
            jd_PantallaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_PantallaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jd_PantallaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_PantallaLayout.createSequentialGroup()
                        .addComponent(jLabel23)
                        .addGap(18, 18, 18)
                        .addComponent(tf_Tactil, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jd_PantallaLayout.createSequentialGroup()
                        .addComponent(jLabel24)
                        .addGap(18, 18, 18)
                        .addComponent(tf_Ensamblaje4, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(bt_AgregarPantalla)
                    .addGroup(jd_PantallaLayout.createSequentialGroup()
                        .addComponent(jLabel25)
                        .addGap(39, 39, 39)
                        .addComponent(tf_Tipo, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(160, Short.MAX_VALUE))
        );
        jd_PantallaLayout.setVerticalGroup(
            jd_PantallaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_PantallaLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jd_PantallaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(tf_Tactil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_PantallaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tf_Tipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel25))
                .addGap(13, 13, 13)
                .addGroup(jd_PantallaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(tf_Ensamblaje4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(bt_AgregarPantalla)
                .addContainerGap(124, Short.MAX_VALUE))
        );

        jd_Procesador.setTitle("Procesador");

        bt_AgregarProcesador.setText("Agregar");
        bt_AgregarProcesador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_AgregarProcesadorActionPerformed(evt);
            }
        });

        jLabel26.setText("Timepo de Esamblaje");

        jLabel27.setText("Velocidad");

        jLabel28.setText("Numero de Nucleos");

        javax.swing.GroupLayout jd_ProcesadorLayout = new javax.swing.GroupLayout(jd_Procesador.getContentPane());
        jd_Procesador.getContentPane().setLayout(jd_ProcesadorLayout);
        jd_ProcesadorLayout.setHorizontalGroup(
            jd_ProcesadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_ProcesadorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jd_ProcesadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_ProcesadorLayout.createSequentialGroup()
                        .addComponent(jLabel28)
                        .addGap(18, 18, 18)
                        .addComponent(tf_Nucleos, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jd_ProcesadorLayout.createSequentialGroup()
                        .addComponent(jLabel26)
                        .addGap(18, 18, 18)
                        .addComponent(tf_Ensamblaje5, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(bt_AgregarProcesador)
                    .addGroup(jd_ProcesadorLayout.createSequentialGroup()
                        .addComponent(jLabel27)
                        .addGap(39, 39, 39)
                        .addComponent(tf_Velocidad, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(160, Short.MAX_VALUE))
        );
        jd_ProcesadorLayout.setVerticalGroup(
            jd_ProcesadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_ProcesadorLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jd_ProcesadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28)
                    .addComponent(tf_Nucleos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_ProcesadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tf_Velocidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel27))
                .addGap(13, 13, 13)
                .addGroup(jd_ProcesadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(tf_Ensamblaje5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(bt_AgregarProcesador)
                .addContainerGap(124, Short.MAX_VALUE))
        );

        jd_Tecnico.setTitle("Interfaz de Creacion de Tecnico");

        jLabel9.setText("Nombre");

        jLabel10.setText("Edad");

        jLabel11.setText("Genero");

        bt_CrearTecnico.setText("Crear Tecnico");
        bt_CrearTecnico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_CrearTecnicoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jd_TecnicoLayout = new javax.swing.GroupLayout(jd_Tecnico.getContentPane());
        jd_Tecnico.getContentPane().setLayout(jd_TecnicoLayout);
        jd_TecnicoLayout.setHorizontalGroup(
            jd_TecnicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_TecnicoLayout.createSequentialGroup()
                .addGroup(jd_TecnicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_TecnicoLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jd_TecnicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jd_TecnicoLayout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tf_Genero, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE))
                            .addGroup(jd_TecnicoLayout.createSequentialGroup()
                                .addGroup(jd_TecnicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel10))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jd_TecnicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tf_Edad, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
                                    .addComponent(tf_Nombre)))))
                    .addGroup(jd_TecnicoLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(bt_CrearTecnico)))
                .addContainerGap(207, Short.MAX_VALUE))
        );
        jd_TecnicoLayout.setVerticalGroup(
            jd_TecnicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_TecnicoLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jd_TecnicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(tf_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_TecnicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(tf_Edad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_TecnicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(tf_Genero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(bt_CrearTecnico)
                .addContainerGap(122, Short.MAX_VALUE))
        );

        jd_Esamblaje.setTitle("Ensamblaje");

        jLabel12.setText("Tecnicos");

        jScrollPane1.setViewportView(JL_Tecnicos);

        jScrollPane2.setViewportView(JL_Computadoras);

        jLabel22.setText("Satus de las Partes");

        jLabel29.setText("Computadoras");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Parte"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane3.setViewportView(jTable1);

        jLabel30.setText("Partes Ensambladas");

        bt_Iniciar.setText("Iniciar Ensamblado");
        bt_Iniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_IniciarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jd_EsamblajeLayout = new javax.swing.GroupLayout(jd_Esamblaje.getContentPane());
        jd_Esamblaje.getContentPane().setLayout(jd_EsamblajeLayout);
        jd_EsamblajeLayout.setHorizontalGroup(
            jd_EsamblajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_EsamblajeLayout.createSequentialGroup()
                .addGroup(jd_EsamblajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_EsamblajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel29)
                        .addComponent(jLabel12)
                        .addComponent(jLabel22, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addComponent(jLabel30))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jd_EsamblajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jd_EsamblajeLayout.createSequentialGroup()
                        .addComponent(jbr_Esamblaje_por_partes, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(33, 33, 33)
                .addComponent(bt_Iniciar)
                .addGap(155, 155, 155))
        );
        jd_EsamblajeLayout.setVerticalGroup(
            jd_EsamblajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_EsamblajeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jd_EsamblajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_EsamblajeLayout.createSequentialGroup()
                        .addComponent(jLabel22)
                        .addGroup(jd_EsamblajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jd_EsamblajeLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jd_EsamblajeLayout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(jLabel29)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jd_EsamblajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12)))
                    .addGroup(jd_EsamblajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(bt_Iniciar)
                        .addComponent(jbr_Esamblaje_por_partes, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jd_EsamblajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel30))
                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Crear de Computadoras DELL");

        bt_Tecnico.setText("Crear Tecnico");
        bt_Tecnico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_TecnicoActionPerformed(evt);
            }
        });

        bt_Computadora.setText("Crear Computadora");
        bt_Computadora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_ComputadoraActionPerformed(evt);
            }
        });

        bt_Ensamble.setText("Ensamble");
        bt_Ensamble.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_EnsambleActionPerformed(evt);
            }
        });

        bt_Administrar_C.setText("Administrar Computadora");

        bt_Administrar_T.setText("Administrar Tecnico");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("DELL");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bt_Administrar_C)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt_Ensamble))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bt_Tecnico)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt_Computadora)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bt_Administrar_T)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_Tecnico)
                    .addComponent(bt_Computadora)
                    .addComponent(bt_Administrar_T))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_Administrar_C)
                    .addComponent(bt_Ensamble))
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_ColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_ColorActionPerformed
        // TODO add your handling code here
        bt_Color.setBackground(JColorChooser.showDialog(jd_Crear_Computadora, "Seleccione una color para la figura", Color.BLUE));
        co = bt_Color.getBackground();
    }//GEN-LAST:event_bt_ColorActionPerformed

    private void bt_AgregarRamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_AgregarRamActionPerformed
        // TODO add your handling code here:
        r = new RAM(Integer.parseInt(tf_Tamaño.getText()), tf_Marca.getText(), Integer.parseInt(tf_Ensamblaje.getText()));
        c.setparte(r);
        tf_Ensamblaje.setText("");
        tf_Marca.setText("");
        tf_Tamaño.setText("");
        jd_RAM.dispose();
    }//GEN-LAST:event_bt_AgregarRamActionPerformed

    private void bt_TecnicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_TecnicoActionPerformed
        // TODO add your handling code here:
        jd_Teclado.setModal(true);
        jd_Teclado.pack();
        jd_Teclado.setLocationRelativeTo(this);
        jd_Teclado.setVisible(true);
    }//GEN-LAST:event_bt_TecnicoActionPerformed

    private void bt_ComputadoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_ComputadoraActionPerformed
        // TODO add your handling code here:
        jd_Crear_Computadora.setModal(true);
        jd_Crear_Computadora.pack();
        jd_Crear_Computadora.setLocationRelativeTo(this);
        jd_Crear_Computadora.setVisible(true);
    }//GEN-LAST:event_bt_ComputadoraActionPerformed

    private void bt_RAMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_RAMActionPerformed
        // TODO add your handling code here:
        jd_RAM.setModal(true);
        jd_RAM.pack();
        jd_RAM.setLocationRelativeTo(jd_Crear_Computadora);
        jd_RAM.setVisible(true);
    }//GEN-LAST:event_bt_RAMActionPerformed

    private void bt_CrearCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_CrearCActionPerformed
        // TODO add your handling code here:
        c = new Computadora(tf_N_Serie.getText(), jdc_Año_C.getDate(), co, tf_Material.getText());
        tf_N_Serie.setText("");
        jdc_Año_C.setDate(new Date());
        tf_Material.setText("");
        compus.add(c);
        DefaultListModel modelo = (DefaultListModel) JL_Computadoras.getModel();
        modelo.addElement(c);
        JL_Computadoras.setModel(modelo);
        jd_Crear_Computadora.dispose();
    }//GEN-LAST:event_bt_CrearCActionPerformed

    private void bt_AgregarDiscoDuroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_AgregarDiscoDuroActionPerformed
        // TODO add your handling code here:
        dd = new Disco_Duro(Integer.parseInt(tf_Tamaño1.getText()), tf_Marca1.getText(), Integer.parseInt(tf_Ensamblaje1.getText()));
        c.setparte(dd);
        tf_Tamaño1.setText("");
        tf_Ensamblaje1.setText("");
        tf_Marca1.setText("");
        jd_Disco_Duro.dispose();
    }//GEN-LAST:event_bt_AgregarDiscoDuroActionPerformed

    private void bt_Disco_DuroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_Disco_DuroActionPerformed
        // TODO add your handling code here:
        jd_Disco_Duro.setModal(true);
        jd_Disco_Duro.pack();
        jd_Disco_Duro.setLocationRelativeTo(jd_Crear_Computadora);
        jd_Disco_Duro.setVisible(true);
    }//GEN-LAST:event_bt_Disco_DuroActionPerformed

    private void bt_AgregarBateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_AgregarBateriaActionPerformed
        // TODO add your handling code here:
        b = new Bateria(Integer.parseInt(tf_Horas.getText()), tf_Material1.getText(), Integer.parseInt(tf_Ensamblaje2.getText()));
        c.setparte(b);
        tf_Horas.setText("");
        tf_Material1.setText("");
        tf_Ensamblaje2.setText("");
        jd_Bateria.dispose();
    }//GEN-LAST:event_bt_AgregarBateriaActionPerformed

    private void bt_AgregarTecladoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_AgregarTecladoActionPerformed
        // TODO add your handling code here:
        tc = new Teclado(tf_Material2.getText(), co,  Integer.parseInt(tf_Ensamblaje3.getText()));
        c.setparte(tc);
        tf_Material2.setText("");
        tf_Ensamblaje3.setText("");
        jd_Teclado.dispose();
    }//GEN-LAST:event_bt_AgregarTecladoActionPerformed

    private void bt_Color1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_Color1ActionPerformed
        // TODO add your handling code here
        bt_Color1.setBackground(JColorChooser.showDialog(this, "Seleccione una color para la figura", Color.BLUE));
        co1 = bt_Color1.getBackground();

    }//GEN-LAST:event_bt_Color1ActionPerformed

    private void bt_BateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_BateriaActionPerformed
        // TODO add your handling code here:
        jd_Bateria.setModal(true);
        jd_Bateria.pack();
        jd_Bateria.setLocationRelativeTo(jd_Crear_Computadora);
        jd_Bateria.setVisible(true);
    }//GEN-LAST:event_bt_BateriaActionPerformed

    private void bt_TecladoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_TecladoActionPerformed
        // TODO add your handling code here:
        jd_Teclado.setModal(true);
        jd_Teclado.pack();
        jd_Teclado.setLocationRelativeTo(jd_Crear_Computadora);
        jd_Teclado.setVisible(true);
    }//GEN-LAST:event_bt_TecladoActionPerformed

    private void bt_AgregarPantallaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_AgregarPantallaActionPerformed
        // TODO add your handling code here:
        p = new Pantalla(tf_Tipo.getText(), tf_Tactil.getText(), Integer.parseInt(tf_Ensamblaje4.getText()));
        c.setparte(p);
        tf_Tipo.setText("");
        tf_Ensamblaje4.setText("");
        tf_Tactil.setText("");
        jd_Teclado.dispose();
    }//GEN-LAST:event_bt_AgregarPantallaActionPerformed

    private void bt_PantallaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_PantallaActionPerformed
        // TODO add your handling code here:
        jd_Pantalla.setModal(true);
        jd_Pantalla.pack();
        jd_Pantalla.setLocationRelativeTo(jd_Crear_Computadora);
        jd_Pantalla.setVisible(true);
    }//GEN-LAST:event_bt_PantallaActionPerformed

    private void bt_AgregarProcesadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_AgregarProcesadorActionPerformed
        // TODO add your handling code here:
        pc = new Procesador(Integer.parseInt(tf_Nucleos.getText()),  Integer.parseInt(tf_Velocidad.getText()),  Integer.parseInt(tf_Ensamblaje5.getText()));
        c.setparte(pc);
        tf_Nucleos.setText("");
        tf_Velocidad.setText("");
        tf_Ensamblaje5.setText("");
        jd_Procesador.dispose();
    }//GEN-LAST:event_bt_AgregarProcesadorActionPerformed

    private void bt_ProcesadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_ProcesadorActionPerformed
        // TODO add your handling code here:
        jd_Procesador.setModal(true);
        jd_Procesador.pack();
        jd_Procesador.setLocationRelativeTo(jd_Crear_Computadora);
        jd_Procesador.setVisible(true);
    }//GEN-LAST:event_bt_ProcesadorActionPerformed

    private void bt_CrearTecnicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_CrearTecnicoActionPerformed
        // TODO add your handling code here:
        t = new Tecnico(tf_Nombre.getText(), Integer.parseInt(tf_Edad.getText()), tf_Genero.getText());
        tecnicos.add(t);
        tf_Nombre.setText("");
        tf_Edad.setText("");
        tf_Genero.setText("");
        DefaultListModel modelo = (DefaultListModel) JL_Tecnicos.getModel();
        modelo.addElement(c);
        JL_Tecnicos.setModel(modelo);
        jd_Tecnico.dispose();
    }//GEN-LAST:event_bt_CrearTecnicoActionPerformed

    private void bt_EnsambleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_EnsambleActionPerformed
        // TODO add your handling code here:
        jd_Esamblaje.setModal(true);
        jd_Esamblaje.pack();
        jd_Esamblaje.setLocationRelativeTo(this);
        jd_Esamblaje.setVisible(true);
    }//GEN-LAST:event_bt_EnsambleActionPerformed

    private void bt_IniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_IniciarActionPerformed
        // TODO add your handling code here:
        ab.start();
    }//GEN-LAST:event_bt_IniciarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DELL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DELL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DELL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DELL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DELL().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<String> JL_Computadoras;
    private javax.swing.JList<String> JL_Tecnicos;
    private javax.swing.JButton bt_Administrar_C;
    private javax.swing.JButton bt_Administrar_T;
    private javax.swing.JButton bt_AgregarBateria;
    private javax.swing.JButton bt_AgregarDiscoDuro;
    private javax.swing.JButton bt_AgregarPantalla;
    private javax.swing.JButton bt_AgregarProcesador;
    private javax.swing.JButton bt_AgregarRam;
    private javax.swing.JButton bt_AgregarTeclado;
    private javax.swing.JButton bt_Bateria;
    private javax.swing.JButton bt_Color;
    private javax.swing.JButton bt_Color1;
    private javax.swing.JButton bt_Computadora;
    private javax.swing.JButton bt_CrearC;
    private javax.swing.JButton bt_CrearTecnico;
    private javax.swing.JButton bt_Disco_Duro;
    private javax.swing.JButton bt_Ensamble;
    private javax.swing.JButton bt_Iniciar;
    private javax.swing.JButton bt_Pantalla;
    private javax.swing.JButton bt_Procesador;
    private javax.swing.JButton bt_RAM;
    private javax.swing.JButton bt_Teclado;
    private javax.swing.JButton bt_Tecnico;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JProgressBar jbr_Esamblaje_por_partes;
    private javax.swing.JDialog jd_Bateria;
    private javax.swing.JDialog jd_Crear_Computadora;
    private javax.swing.JDialog jd_Disco_Duro;
    private javax.swing.JDialog jd_Esamblaje;
    private javax.swing.JDialog jd_Pantalla;
    private javax.swing.JDialog jd_Procesador;
    private javax.swing.JDialog jd_RAM;
    private javax.swing.JDialog jd_Teclado;
    private javax.swing.JDialog jd_Tecnico;
    private com.toedter.calendar.JDateChooser jdc_Año_C;
    private javax.swing.JTextField tf_Edad;
    private javax.swing.JTextField tf_Ensamblaje;
    private javax.swing.JTextField tf_Ensamblaje1;
    private javax.swing.JTextField tf_Ensamblaje2;
    private javax.swing.JTextField tf_Ensamblaje3;
    private javax.swing.JTextField tf_Ensamblaje4;
    private javax.swing.JTextField tf_Ensamblaje5;
    private javax.swing.JTextField tf_Genero;
    private javax.swing.JTextField tf_Horas;
    private javax.swing.JTextField tf_Marca;
    private javax.swing.JTextField tf_Marca1;
    private javax.swing.JTextField tf_Material;
    private javax.swing.JTextField tf_Material1;
    private javax.swing.JTextField tf_Material2;
    private javax.swing.JTextField tf_N_Serie;
    private javax.swing.JTextField tf_Nombre;
    private javax.swing.JTextField tf_Nucleos;
    private javax.swing.JTextField tf_Tactil;
    private javax.swing.JTextField tf_Tamaño;
    private javax.swing.JTextField tf_Tamaño1;
    private javax.swing.JTextField tf_Tipo;
    private javax.swing.JTextField tf_Velocidad;
    // End of variables declaration//GEN-END:variables
Computadora c = new Computadora();
    ArrayList<Computadora> compus = new ArrayList();
    ArrayList<Tecnico> tecnicos = new ArrayList();
    Tecnico t = new Tecnico();
    Orden_Ensamblaje o = new Orden_Ensamblaje();
    RAM r = new RAM();
    Disco_Duro dd = new Disco_Duro();
    Bateria b = new Bateria();
    Teclado tc = new Teclado();
    Pantalla p = new Pantalla();
    Procesador pc = new Procesador();
    private Color co;
    private Color co1;
    private int time;
    adminbarra ab;
}
