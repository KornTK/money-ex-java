/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project6330611030;

import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author pokde
 */
public class moneyex extends javax.swing.JFrame {
        int THB_have_data;
        int USD_have_data;
        int YEN_have_data;
        
      double RATE_THB_USD;
    double RATE_THB_YEN;
    double RATE_USD_THB;
    double RATE_USD_YEN;
    double RATE_YEN_THB;
    double RATE_YEN_USD;
    
    double How_muct1;
    double How_muct2;
    double How_muct3;
    double How_muct4;
    double How_muct5;
    double How_muct6;
    
    double input_thb_usd_data;
    double input_thb_yen_data;
    double input_usd_thb_data;
    double input_usd_yen_data;
    double input_yen_thb_data;
    double input_yen_usd_data;
    /**
     * Creates new form moneyex
     */
    public moneyex() {
        initComponents();


        
         //read thb have
         try {
      File myObj = new File(setting.path_have_THB);
      Scanner myReader = new Scanner(myObj);
      while (myReader.hasNextLine()) {
        String data = myReader.nextLine();
        System.out.println("THB : "+data);
        THB_have_data = Integer.valueOf(data);
        THB_have.setText(String.format("THB : "+data));

      }
      myReader.close();
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
         
        //read USD have
         try {
      File myObj2 = new File(setting.path_have_USD);
      Scanner myReader2 = new Scanner(myObj2);
      while (myReader2.hasNextLine()) {
        String data2 = myReader2.nextLine();
        System.out.println("USD : "+data2);
        USD_have_data = Integer.valueOf(data2);
        USD_have.setText(String.format("USD : "+data2));

      }
      myReader2.close();
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
         
       //read Yen have
         try {
      File myObj3 = new File(setting.path_have_YEN);
      Scanner myReader3 = new Scanner(myObj3);
      while (myReader3.hasNextLine()) {
        String data3 = myReader3.nextLine();
        System.out.println("YEN : "+data3);
        YEN_have_data = Integer.valueOf(data3);
        YEN_have.setText(String.format("YEN : "+data3));

      }
      myReader3.close();
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
         
         
     //read rate money
     
              //read THB-USD
         try {
      File THB_USD_read = new File(setting.path_RATE_THB_USD);
      Scanner THB_USD_reader = new Scanner(THB_USD_read);
      while (THB_USD_reader.hasNextLine()) {
        String THB_USD = THB_USD_reader.nextLine();
        System.out.println("THB-USD  : "+THB_USD);
        RATE_THB_USD = Double.parseDouble(THB_USD);
        show_rate_bath_usd.setText(String.format("เรท 1 THB = "+THB_USD+" USD"));

      }      THB_USD_reader.close();
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
           //read THB-yen
         try {
      File THB_YEN_read = new File(setting.path_RATE_THB_YEN);
      Scanner THB_YEN_reader = new Scanner(THB_YEN_read);
      while (THB_YEN_reader.hasNextLine()) {
        String THB_YEN = THB_YEN_reader.nextLine();
        System.out.println("THB-YEN  : "+THB_YEN);
        RATE_THB_YEN = Double.parseDouble(THB_YEN);
        show_rate_bath_yen.setText(String.format("เรท 1 THB = "+THB_YEN+" YEN"));

      }      THB_YEN_reader.close();
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
                    //read USD-THB
         try {
      File USD_THB_read = new File(setting.path_RATE_USD_THB);
      Scanner USD_THB_reader = new Scanner(USD_THB_read);
      while (USD_THB_reader.hasNextLine()) {
        String USD_THB = USD_THB_reader.nextLine();
        System.out.println("USD-THB  : "+USD_THB);
        RATE_USD_THB = Double.parseDouble(USD_THB);
        show_rate_usd_thb.setText(String.format("เรท 1 USD = "+USD_THB+" THB"));

      }      USD_THB_reader.close();
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
                             //read USD-YEN
         try {
      File USD_YEN_read = new File(setting.path_RATE_USD_YEN);
      Scanner USD_YEN_reader = new Scanner(USD_YEN_read);
      while (USD_YEN_reader.hasNextLine()) {
        String USD_YEN = USD_YEN_reader.nextLine();
        System.out.println("USD_YEN  : "+USD_YEN);
        RATE_USD_YEN = Double.parseDouble(USD_YEN);
        show_rate_usd_yen.setText(String.format("เรท 1 USD = "+USD_YEN+" YEN"));

      }      USD_YEN_reader.close();
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
                           //read YEN_THB
         try {
      File YEN_THB_read = new File(setting.path_RATE_YEN_THB);
      Scanner YEN_THB_reader = new Scanner(YEN_THB_read);
      while (YEN_THB_reader.hasNextLine()) {
        String YEN_THB = YEN_THB_reader.nextLine();
        System.out.println("YEN_THB  : "+YEN_THB);
        RATE_YEN_THB = Double.parseDouble(YEN_THB);
        show_rate_yen_thb.setText(String.format("เรท 1 YEN = "+YEN_THB+" THB"));

      }      YEN_THB_reader.close();
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
                     //read YEN_USD
         try {
      File YEN_USD_read = new File(setting.path_RATE_YEN_USD);
      Scanner YEN_USD_reader = new Scanner(YEN_USD_read);
      while (YEN_USD_reader.hasNextLine()) {
        String YEN_USD = YEN_USD_reader.nextLine();
        System.out.println("YEN_USD  : "+YEN_USD);
                RATE_YEN_USD = Double.parseDouble(YEN_USD);
        show_rate_yen_usd.setText(String.format("เรท 1 YEN = "+YEN_USD+" USD"));

      }      YEN_USD_reader.close();
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        input_thb_usd = new javax.swing.JTextField();
        go_thb_usd = new javax.swing.JButton();
        Q1 = new javax.swing.JLabel();
        show_rate_bath_usd = new javax.swing.JLabel();
        show_rate_bath_yen = new javax.swing.JLabel();
        input_thb_yen = new javax.swing.JTextField();
        go_thb_yen = new javax.swing.JButton();
        Q2 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        show_rate_yen_thb = new javax.swing.JLabel();
        input_yen_thb = new javax.swing.JTextField();
        go_yen_thb = new javax.swing.JButton();
        Q3 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        show_rate_yen_usd = new javax.swing.JLabel();
        input_yen_usd = new javax.swing.JTextField();
        go_yen_usd = new javax.swing.JButton();
        Q4 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        show_rate_usd_thb = new javax.swing.JLabel();
        input_usd_thb = new javax.swing.JTextField();
        go_usd_thb = new javax.swing.JButton();
        Q5 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        show_rate_usd_yen = new javax.swing.JLabel();
        input_usd_yen = new javax.swing.JTextField();
        go_usd_yen = new javax.swing.JButton();
        Q6 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        THB_have = new javax.swing.JLabel();
        USD_have = new javax.swing.JLabel();
        YEN_have = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        go1 = new javax.swing.JButton();
        go2 = new javax.swing.JButton();
        go3 = new javax.swing.JButton();
        go4 = new javax.swing.JButton();
        go6 = new javax.swing.JButton();
        go5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project6330611030/img/logo2.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 51));
        jLabel2.setText("ดี-มันนี่");

        jButton3.setBackground(new java.awt.Color(255, 51, 51));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jButton3.setText("X");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton2.setText("กลับหน้าแรก");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setText("ดูประวัติการแลกเปลี่ยน");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("แลกจากเงินบาท");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("แลกจากเงิน USD");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("บาท ไป YEN");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("บาท ไป USD");

        input_thb_usd.setToolTipText("BATH TO USD");
        input_thb_usd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                input_thb_usdKeyPressed(evt);
            }
        });

        go_thb_usd.setText("คํานวน");
        go_thb_usd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                go_thb_usdActionPerformed(evt);
            }
        });

        Q1.setText("คุณจะได้รับ  xx USD");

        show_rate_bath_usd.setText("wait for data from file");

        show_rate_bath_yen.setText("wait for data from file");

        input_thb_yen.setToolTipText("BATH TO YEN");
        input_thb_yen.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                input_thb_yenKeyPressed(evt);
            }
        });

        go_thb_yen.setText("คํานวน");
        go_thb_yen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                go_thb_yenActionPerformed(evt);
            }
        });

        Q2.setText("คุณจะได้รับ  xx YEN");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("YEN ไป บาท");

        show_rate_yen_thb.setText("wait for data from file");

        input_yen_thb.setToolTipText("YEN TO THB");
        input_yen_thb.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                input_yen_thbKeyPressed(evt);
            }
        });

        go_yen_thb.setText("คํานวน");
        go_yen_thb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                go_yen_thbActionPerformed(evt);
            }
        });

        Q3.setText("คุณจะได้รับ  xx บาท");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setText("YEN ไป USD");

        show_rate_yen_usd.setText("wait for data from file");

        input_yen_usd.setToolTipText("YEN TO USD");
        input_yen_usd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                input_yen_usdKeyPressed(evt);
            }
        });

        go_yen_usd.setText("คํานวน");
        go_yen_usd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                go_yen_usdActionPerformed(evt);
            }
        });

        Q4.setText("คุณจะได้รับ  xx USD");

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel17.setText("แลกจากเงิน Yen");

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel18.setText("USD ไป YEN");

        show_rate_usd_thb.setText("wait for data from file");

        input_usd_thb.setToolTipText("USD TO THB");
        input_usd_thb.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                input_usd_thbKeyPressed(evt);
            }
        });

        go_usd_thb.setText("คํานวน");
        go_usd_thb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                go_usd_thbActionPerformed(evt);
            }
        });

        Q5.setText("คุณจะได้รับ  xx THB");

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel21.setText("USD ไป บาท");

        show_rate_usd_yen.setText("wait for data from file");

        input_usd_yen.setToolTipText("USD TO YEN");
        input_usd_yen.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                input_usd_yenKeyPressed(evt);
            }
        });

        go_usd_yen.setText("คํานวน");
        go_usd_yen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                go_usd_yenActionPerformed(evt);
            }
        });

        Q6.setText("คุณจะได้รับ  xx YEN");

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel24.setText("ยอดคงเหลือของคุณ : ");

        THB_have.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        THB_have.setText("jLabel25");

        USD_have.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        USD_have.setText("jLabel25");

        YEN_have.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        YEN_have.setText("jLabel25");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel24)
                .addGap(38, 38, 38)
                .addComponent(THB_have)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 122, Short.MAX_VALUE)
                .addComponent(USD_have)
                .addGap(120, 120, 120)
                .addComponent(YEN_have)
                .addGap(116, 116, 116))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(THB_have, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(USD_have, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(YEN_have, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        go1.setText("ยืนยัน");

        go2.setText("ยืนยัน");

        go3.setText("ยืนยัน");

        go4.setText("ยืนยัน");

        go6.setText("ยืนยัน");

        go5.setText("ยืนยัน");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(go1)
                    .addComponent(go3)
                    .addComponent(go4)
                    .addComponent(go5)
                    .addComponent(go6)
                    .addComponent(go2))
                .addGap(18, 18, 18))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(go1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                .addComponent(go2)
                .addGap(83, 83, 83)
                .addComponent(go3)
                .addGap(69, 69, 69)
                .addComponent(go4)
                .addGap(67, 67, 67)
                .addComponent(go5)
                .addGap(76, 76, 76)
                .addComponent(go6))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(jButton2))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(input_thb_yen, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(go_thb_yen))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(input_thb_usd, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(go_thb_usd))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(show_rate_bath_usd))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(280, 280, 280)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel17))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(192, 192, 192)
                                .addComponent(jButton1))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(69, 69, 69))))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel21)
                                    .addGap(30, 30, 30)
                                    .addComponent(show_rate_usd_thb))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addGap(31, 31, 31)
                                    .addComponent(show_rate_bath_yen)))
                            .addGap(0, 0, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(input_usd_thb, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(21, 21, 21)
                                            .addComponent(go_usd_thb))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(1, 1, 1)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(jLabel18)
                                                    .addGap(27, 27, 27)
                                                    .addComponent(show_rate_usd_yen))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addGap(1, 1, 1)
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(layout.createSequentialGroup()
                                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addGroup(layout.createSequentialGroup()
                                                                    .addComponent(input_usd_yen, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                    .addGap(18, 18, 18)
                                                                    .addComponent(go_usd_yen))
                                                                .addGroup(layout.createSequentialGroup()
                                                                    .addGap(131, 131, 131)
                                                                    .addComponent(go_yen_usd)))
                                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                .addComponent(Q5)
                                                                .addComponent(Q4)
                                                                .addComponent(Q6)
                                                                .addComponent(Q3)
                                                                .addComponent(Q2)
                                                                .addComponent(Q1))
                                                            .addGap(263, 263, 263))))))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel14)
                                            .addGap(26, 26, 26)
                                            .addComponent(show_rate_yen_usd))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(input_yen_usd, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(180, 180, 180)
                                            .addComponent(jLabel4))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(jLabel11)
                                                    .addGap(30, 30, 30))
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                    .addComponent(input_yen_thb, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(show_rate_yen_thb)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addGap(18, 18, 18)
                                                    .addComponent(go_yen_thb)))))
                                    .addGap(0, 0, Short.MAX_VALUE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(46, 46, 46)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel2)
                                    .addGap(122, 122, 122)
                                    .addComponent(jButton3)))
                            .addContainerGap()))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(show_rate_bath_usd))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(input_thb_usd, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(go_thb_usd)
                            .addComponent(Q1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(show_rate_bath_yen))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Q2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(input_thb_yen, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(go_thb_yen))
                                .addGap(1, 1, 1)))
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(show_rate_yen_thb))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(go_yen_thb)
                            .addComponent(input_yen_thb, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Q3))
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addGap(1, 1, 1)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(5, 5, 5)
                                        .addComponent(Q4))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(input_yen_usd, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(go_yen_usd)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4)
                                .addGap(1, 1, 1)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel21)
                                    .addComponent(show_rate_usd_thb)))
                            .addComponent(show_rate_yen_usd))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(input_usd_thb, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(go_usd_thb)
                            .addComponent(Q5))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel18)
                            .addComponent(show_rate_usd_yen))
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Q6)
                            .addComponent(go_usd_yen)
                            .addComponent(input_usd_yen, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 107, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        warn person2 = new exit_boy(setting.user_login,001); //Polymorphism 

        person2.exit_warn();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        infor backtoinfo = new infor();
        backtoinfo.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
                logtran golog = new logtran();
        golog.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void go_thb_usdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_go_thb_usdActionPerformed
        // TODO add your handling code here:
         input_thb_usd_data = Integer.valueOf(input_thb_usd.getText()); 
         if (input_thb_usd_data <= THB_have_data){
                          How_muct1 = input_thb_usd_data*RATE_THB_USD ;
                          Q1.setText("คุณจะได้รับ  "+How_muct1+ " USD");
         }else{
             System.out.print("U don't have enove money!");
                     JOptionPane.showMessageDialog(null, 
                              "คุณมีเงินไม่เพียงพอครับ ยอดต้องไม่เกิน : "+THB_have_data+" บาท", 
                              "TITLE", 
                              JOptionPane.WARNING_MESSAGE);
         }

    }//GEN-LAST:event_go_thb_usdActionPerformed

    private void input_thb_usdKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_input_thb_usdKeyPressed
        // TODO add your handling code here:
        //check input is number and not over 9 dig
        String inputD_thb_usd = input_thb_usd.getText();
        //get length
        int length1 = inputD_thb_usd.length();
        
        char c1 = evt.getKeyChar();
        
        //check num 0 to 9
        if(evt.getKeyChar() >= '0' && evt.getKeyChar() <= '9'){
            //check length not over 9
            if(length1<9){
                input_thb_usd.setEditable(true);
            }else{
                input_thb_usd.setEditable(false);
            }
        }else{
            // allow for key 'back space' and 'delete' for edit
            if(evt.getExtendedKeyCode()==KeyEvent.VK_BACK_SPACE || evt.getExtendedKeyCode()==KeyEvent.VK_DELETE){
                // allow edit
                input_thb_usd.setEditable(true);
            }else{
                input_thb_usd.setEditable(false);
            }
        }
    }//GEN-LAST:event_input_thb_usdKeyPressed

    private void input_thb_yenKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_input_thb_yenKeyPressed
        // TODO add your handling code here:
        String inputD_thb_yen = input_thb_yen.getText();
        //get length
        int length2 = inputD_thb_yen.length();
        
        char c2 = evt.getKeyChar();
        
        //check num 0 to 9
        if(evt.getKeyChar() >= '0' && evt.getKeyChar() <= '9'){
            //check length not over 9
            if(length2<9){
                input_thb_yen.setEditable(true);
            }else{
                input_thb_yen.setEditable(false);
            }
        }else{
            // allow for key 'back space' and 'delete' for edit
            if(evt.getExtendedKeyCode()==KeyEvent.VK_BACK_SPACE || evt.getExtendedKeyCode()==KeyEvent.VK_DELETE){
                // allow edit
                input_thb_yen.setEditable(true);
            }else{
                input_thb_yen.setEditable(false);
            }
        }
    }//GEN-LAST:event_input_thb_yenKeyPressed

    private void input_yen_thbKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_input_yen_thbKeyPressed
        // TODO add your handling code here:
        String inputD_yen_thb = input_yen_thb.getText();
        //get length
        int length3 = inputD_yen_thb.length();
        
        char c3 = evt.getKeyChar();
        
        //check num 0 to 9
        if(evt.getKeyChar() >= '0' && evt.getKeyChar() <= '9'){
            //check length not over 9
            if(length3<9){
                input_yen_thb.setEditable(true);
            }else{
                input_yen_thb.setEditable(false);
            }
        }else{
            // allow for key 'back space' and 'delete' for edit
            if(evt.getExtendedKeyCode()==KeyEvent.VK_BACK_SPACE || evt.getExtendedKeyCode()==KeyEvent.VK_DELETE){
                // allow edit
                input_yen_thb.setEditable(true);
            }else{
                input_yen_thb.setEditable(false);
            }
        }
    }//GEN-LAST:event_input_yen_thbKeyPressed

    private void input_yen_usdKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_input_yen_usdKeyPressed
        // TODO add your handling code here:
        String inputD_yen_usd = input_yen_usd.getText();
        //get length
        int length4 = inputD_yen_usd.length();
        
        char c4 = evt.getKeyChar();
        
        //check num 0 to 9
        if(evt.getKeyChar() >= '0' && evt.getKeyChar() <= '9'){
            //check length not over 9
            if(length4<9){
                input_yen_usd.setEditable(true);
            }else{
                input_yen_usd.setEditable(false);
            }
        }else{
            // allow for key 'back space' and 'delete' for edit
            if(evt.getExtendedKeyCode()==KeyEvent.VK_BACK_SPACE || evt.getExtendedKeyCode()==KeyEvent.VK_DELETE){
                // allow edit
                input_yen_usd.setEditable(true);
            }else{
                input_yen_usd.setEditable(false);
            }
        }
        
    }//GEN-LAST:event_input_yen_usdKeyPressed

    private void input_usd_thbKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_input_usd_thbKeyPressed
        // TODO add your handling code here:
                String inputD_usd_thb = input_usd_thb.getText();
        //get length
        int length5 = inputD_usd_thb.length();
        
        char c5 = evt.getKeyChar();
        
        //check num 0 to 9
        if(evt.getKeyChar() >= '0' && evt.getKeyChar() <= '9'){
            //check length not over 9
            if(length5<9){
                input_usd_thb.setEditable(true);
            }else{
                input_usd_thb.setEditable(false);
            }
        }else{
            // allow for key 'back space' and 'delete' for edit
            if(evt.getExtendedKeyCode()==KeyEvent.VK_BACK_SPACE || evt.getExtendedKeyCode()==KeyEvent.VK_DELETE){
                // allow edit
                input_usd_thb.setEditable(true);
            }else{
                input_usd_thb.setEditable(false);
            }
        }
    }//GEN-LAST:event_input_usd_thbKeyPressed

    private void input_usd_yenKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_input_usd_yenKeyPressed
        // TODO add your handling code here:
        String inputD_usd_yen = input_usd_yen.getText();
        //get length
        int length6 = inputD_usd_yen.length();
        
        char c6 = evt.getKeyChar();
        
        //check num 0 to 9
        if(evt.getKeyChar() >= '0' && evt.getKeyChar() <= '9'){
            //check length not over 9
            if(length6<9){
                input_usd_yen.setEditable(true);
            }else{
                input_usd_yen.setEditable(false);
            }
        }else{
            // allow for key 'back space' and 'delete' for edit
            if(evt.getExtendedKeyCode()==KeyEvent.VK_BACK_SPACE || evt.getExtendedKeyCode()==KeyEvent.VK_DELETE){
                // allow edit
                input_usd_yen.setEditable(true);
            }else{
                input_usd_yen.setEditable(false);
            }
        }
    }//GEN-LAST:event_input_usd_yenKeyPressed

    private void go_thb_yenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_go_thb_yenActionPerformed
        // TODO add your handling code here:
          input_thb_yen_data = Integer.valueOf(input_thb_yen.getText()); 
         if (input_thb_yen_data <= THB_have_data){
                          How_muct2 = input_thb_yen_data*RATE_THB_YEN ;
                          Q2.setText("คุณจะได้รับ  "+How_muct2+ " YEN");
         }else{
             System.out.print("U don't have enove money!");
                     JOptionPane.showMessageDialog(null, 
                              "คุณมีเงินไม่เพียงพอครับ ยอดต้องไม่เกิน : "+THB_have_data+" บาท", 
                              "TITLE", 
                              JOptionPane.WARNING_MESSAGE);
         }
    }//GEN-LAST:event_go_thb_yenActionPerformed

    private void go_yen_thbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_go_yen_thbActionPerformed
        // TODO add your handling code here:
                  input_yen_thb_data = Integer.valueOf(input_yen_thb.getText()); 
         if (input_yen_thb_data <= YEN_have_data){
                          How_muct3 = input_yen_thb_data*RATE_YEN_THB ;
                          Q3.setText("คุณจะได้รับ  "+How_muct3+ " บาท");
         }else{
             System.out.print("U don't have enove money!");
                     JOptionPane.showMessageDialog(null, 
                              "คุณมีเงินไม่เพียงพอครับ ยอดต้องไม่เกิน : "+YEN_have_data+" YEN", 
                              "TITLE", 
                              JOptionPane.WARNING_MESSAGE);
         }
    }//GEN-LAST:event_go_yen_thbActionPerformed

    private void go_yen_usdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_go_yen_usdActionPerformed
        // TODO add your handling code here:
                          input_yen_usd_data = Integer.valueOf(input_yen_usd.getText()); 
         if (input_yen_usd_data <= YEN_have_data){
                          How_muct4 = input_yen_usd_data*RATE_YEN_USD ;
                          Q4.setText("คุณจะได้รับ  "+How_muct4+ " USD");
         }else{
             System.out.print("U don't have enove money!");
                     JOptionPane.showMessageDialog(null, 
                              "คุณมีเงินไม่เพียงพอครับ ยอดต้องไม่เกิน : "+YEN_have_data+" YEN", 
                              "TITLE", 
                              JOptionPane.WARNING_MESSAGE);
         }
    }//GEN-LAST:event_go_yen_usdActionPerformed

    private void go_usd_thbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_go_usd_thbActionPerformed
        // TODO add your handling code here:
        input_usd_thb_data = Integer.valueOf(input_usd_thb.getText()); 
         if (input_usd_thb_data <= USD_have_data){
                  How_muct5 = input_usd_thb_data*RATE_USD_THB ;
                  Q5.setText("คุณจะได้รับ  "+How_muct5+ " บาท");
         }else{
             System.out.print("U don't have enove money!");
                     JOptionPane.showMessageDialog(null, 
                              "คุณมีเงินไม่เพียงพอครับ ยอดต้องไม่เกิน : "+USD_have_data+" USD", 
                              "TITLE", 
                              JOptionPane.WARNING_MESSAGE);
         }
    }//GEN-LAST:event_go_usd_thbActionPerformed

    private void go_usd_yenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_go_usd_yenActionPerformed
        // TODO add your handling code here:
                input_usd_yen_data = Integer.valueOf(input_usd_yen.getText()); 
         if (input_usd_yen_data <= USD_have_data){
                  How_muct6 = input_usd_yen_data*RATE_USD_YEN ;
                  Q6.setText("คุณจะได้รับ  "+How_muct6+ " YEN");
         }else{
             System.out.print("U don't have enove money!");
                     JOptionPane.showMessageDialog(null, 
                              "คุณมีเงินไม่เพียงพอครับ ยอดต้องไม่เกิน : "+USD_have_data+" USD", 
                              "TITLE", 
                              JOptionPane.WARNING_MESSAGE);
         }
    }//GEN-LAST:event_go_usd_yenActionPerformed

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
            java.util.logging.Logger.getLogger(moneyex.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(moneyex.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(moneyex.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(moneyex.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new moneyex().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Q1;
    private javax.swing.JLabel Q2;
    private javax.swing.JLabel Q3;
    private javax.swing.JLabel Q4;
    private javax.swing.JLabel Q5;
    private javax.swing.JLabel Q6;
    private javax.swing.JLabel THB_have;
    private javax.swing.JLabel USD_have;
    private javax.swing.JLabel YEN_have;
    private javax.swing.JButton go1;
    private javax.swing.JButton go2;
    private javax.swing.JButton go3;
    private javax.swing.JButton go4;
    private javax.swing.JButton go5;
    private javax.swing.JButton go6;
    private javax.swing.JButton go_thb_usd;
    private javax.swing.JButton go_thb_yen;
    private javax.swing.JButton go_usd_thb;
    private javax.swing.JButton go_usd_yen;
    private javax.swing.JButton go_yen_thb;
    private javax.swing.JButton go_yen_usd;
    private javax.swing.JTextField input_thb_usd;
    private javax.swing.JTextField input_thb_yen;
    private javax.swing.JTextField input_usd_thb;
    private javax.swing.JTextField input_usd_yen;
    private javax.swing.JTextField input_yen_thb;
    private javax.swing.JTextField input_yen_usd;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel show_rate_bath_usd;
    private javax.swing.JLabel show_rate_bath_yen;
    private javax.swing.JLabel show_rate_usd_thb;
    private javax.swing.JLabel show_rate_usd_yen;
    private javax.swing.JLabel show_rate_yen_thb;
    private javax.swing.JLabel show_rate_yen_usd;
    // End of variables declaration//GEN-END:variables
}
