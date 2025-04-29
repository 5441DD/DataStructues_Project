
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author Hakan
 */
public class Game extends javax.swing.JFrame {

    /**
     * Creates new form Game
     */
    Cell selectedCell;
    CellList cellList = new CellList();
    int score;
    int level;

    public Game(String username, int level, int score) {
        initComponents();
        this.username.setText(username);
        this.levellbl.setText("Level " + level);
        this.level = level;

        cellList.fillrandom();
        int bigprize= (int) (Math.random()*30+1);
        cellList.get(bigprize).action=3;
        Cell temp = cellList.head;
        for (int i = 0; i < cellList.size; i++) {
            switch (temp.cellnum) {
                case 0 -> {
                    temp.btn = stbtn;
                    temp.lbl = stlbl;
                }
                case 1 -> {
                    temp.btn = btn1;
                    temp.lbl = lbl1;
                }
                case 2 -> {
                    temp.btn = btn2;
                    temp.lbl = lbl2;
                }
                case 3 -> {
                    temp.btn = btn3;
                    temp.lbl = lbl3;
                }
                case 4 -> {
                    temp.btn = btn4;
                    temp.lbl = lbl4;
                }
                case 5 -> {
                    temp.btn = btn5;
                    temp.lbl = lbl5;
                }
                case 6 -> {
                    temp.btn = btn6;
                    temp.lbl = lbl6;
                }
                case 7 -> {
                    temp.btn = btn7;
                    temp.lbl = lbl7;
                }
                case 8 -> {
                    temp.btn = btn8;
                    temp.lbl = lbl8;
                }
                case 9 -> {
                    temp.btn = btn9;
                    temp.lbl = lbl9;
                }
                case 10 -> {
                    temp.btn = btn10;
                    temp.lbl = lbl10;
                }
                case 11 -> {
                    temp.btn = btn11;
                    temp.lbl = lbl11;
                }
                case 12 -> {
                    temp.btn = btn12;
                    temp.lbl = lbl12;
                }
                case 13 -> {
                    temp.btn = btn13;
                    temp.lbl = lbl13;
                }
                case 14 -> {
                    temp.btn = btn14;
                    temp.lbl = lbl14;
                }
                case 15 -> {
                    temp.btn = btn15;
                    temp.lbl = lbl15;
                }
                case 16 -> {
                    temp.btn = btn16;
                    temp.lbl = lbl16;
                }
                case 17 -> {
                    temp.btn = btn17;
                    temp.lbl = lbl17;
                }
                case 18 -> {
                    temp.btn = btn18;
                    temp.lbl = lbl18;
                }
                case 19 -> {
                    temp.btn = btn19;
                    temp.lbl = lbl19;
                }
                case 20 -> {
                    temp.btn = btn20;
                    temp.lbl = lbl20;
                }
                case 21 -> {
                    temp.btn = btn21;
                    temp.lbl = lbl21;
                }
                case 22 -> {
                    temp.btn = btn22;
                    temp.lbl = lbl22;
                }
                case 23 -> {
                    temp.btn = btn23;
                    temp.lbl = lbl23;
                }
                case 24 -> {
                    temp.btn = btn24;
                    temp.lbl = lbl24;
                }
                case 25 -> {
                    temp.btn = btn25;
                    temp.lbl = lbl25;
                }
                case 26 -> {
                    temp.btn = btn26;
                    temp.lbl = lbl26;
                }
                case 27 -> {
                    temp.btn = btn27;
                    temp.lbl = lbl27;
                }
                case 28 -> {
                    temp.btn = btn28;
                    temp.lbl = lbl28;
                }
                case 29 -> {
                    temp.btn = btn29;
                    temp.lbl = lbl29;
                }
                case 30 -> {
                    temp.btn = btn30;
                    temp.lbl = lbl30;
                }
                case 31 -> {
                    temp.btn = fnbtn;
                    temp.lbl = fnlbl;
                }

                default ->
                    throw new AssertionError();
            }
            if (i < 31) {
                temp = temp.next;

            }
        }

        for (int i = 1; i < cellList.size; i++) {
            
            cellList.get(i).btn.setEnabled(false);
            cellList.get(i).lbl.setText("");
        }

        stbtn.setEnabled(true);
        stlbl.setText("     ▲ ");
        selectedCell = cellList.get(0);
        this.score = score;
        scorelbl.setText("Score: " + score);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        username = new javax.swing.JLabel();
        levellbl = new javax.swing.JLabel();
        stbtn = new javax.swing.JButton();
        stlbl = new javax.swing.JLabel();
        btn1 = new javax.swing.JButton();
        lbl1 = new javax.swing.JLabel();
        btn2 = new javax.swing.JButton();
        lbl2 = new javax.swing.JLabel();
        btn3 = new javax.swing.JButton();
        lbl3 = new javax.swing.JLabel();
        btn4 = new javax.swing.JButton();
        lbl4 = new javax.swing.JLabel();
        btn5 = new javax.swing.JButton();
        lbl5 = new javax.swing.JLabel();
        btn6 = new javax.swing.JButton();
        lbl6 = new javax.swing.JLabel();
        btn7 = new javax.swing.JButton();
        lbl7 = new javax.swing.JLabel();
        btn8 = new javax.swing.JButton();
        lbl8 = new javax.swing.JLabel();
        btn9 = new javax.swing.JButton();
        lbl9 = new javax.swing.JLabel();
        btn19 = new javax.swing.JButton();
        lbl19 = new javax.swing.JLabel();
        btn10 = new javax.swing.JButton();
        lbl10 = new javax.swing.JLabel();
        btn11 = new javax.swing.JButton();
        lbl11 = new javax.swing.JLabel();
        btn12 = new javax.swing.JButton();
        lbl12 = new javax.swing.JLabel();
        btn13 = new javax.swing.JButton();
        lbl13 = new javax.swing.JLabel();
        btn14 = new javax.swing.JButton();
        lbl14 = new javax.swing.JLabel();
        btn15 = new javax.swing.JButton();
        lbl15 = new javax.swing.JLabel();
        btn16 = new javax.swing.JButton();
        lbl16 = new javax.swing.JLabel();
        btn17 = new javax.swing.JButton();
        lbl17 = new javax.swing.JLabel();
        btn18 = new javax.swing.JButton();
        lbl18 = new javax.swing.JLabel();
        btn29 = new javax.swing.JButton();
        lbl29 = new javax.swing.JLabel();
        btn20 = new javax.swing.JButton();
        lbl20 = new javax.swing.JLabel();
        btn21 = new javax.swing.JButton();
        lbl21 = new javax.swing.JLabel();
        btn22 = new javax.swing.JButton();
        lbl22 = new javax.swing.JLabel();
        btn23 = new javax.swing.JButton();
        lbl23 = new javax.swing.JLabel();
        btn24 = new javax.swing.JButton();
        lbl24 = new javax.swing.JLabel();
        btn25 = new javax.swing.JButton();
        lbl25 = new javax.swing.JLabel();
        btn26 = new javax.swing.JButton();
        lbl26 = new javax.swing.JLabel();
        btn27 = new javax.swing.JButton();
        lbl27 = new javax.swing.JLabel();
        btn28 = new javax.swing.JButton();
        lbl28 = new javax.swing.JLabel();
        btn30 = new javax.swing.JButton();
        lbl30 = new javax.swing.JLabel();
        fnbtn = new javax.swing.JButton();
        fnlbl = new javax.swing.JLabel();
        Backbtn = new javax.swing.JButton();
        Rollbtn = new javax.swing.JButton();
        restartbtn = new javax.swing.JButton();
        scorelbl = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        resultlbl = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        username.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        username.setText("Username");

        levellbl.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        levellbl.setText("Level  ");

        stbtn.setText("ST");

        stlbl.setText("lbl1");

        btn1.setText("1");
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });

        lbl1.setText("lbl1");

        btn2.setText("2");

        lbl2.setText("lbl1");

        btn3.setText("3");

        lbl3.setText("lbl1");

        btn4.setText("4");

        lbl4.setText("lbl1");

        btn5.setText("5");

        lbl5.setText("lbl1");

        btn6.setText("6");

        lbl6.setText("lbl1");

        btn7.setText("7");

        lbl7.setText("lbl1");

        btn8.setText("8");
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });

        lbl8.setText("lbl1");

        btn9.setText("9");

        lbl9.setText("lbl1");

        btn19.setText("19");

        lbl19.setText("lbl1");

        btn10.setText("10");

        lbl10.setText("lbl1");

        btn11.setText("11");
        btn11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn11ActionPerformed(evt);
            }
        });

        lbl11.setText("lbl1");

        btn12.setText("12");

        lbl12.setText("lbl1");

        btn13.setText("13");

        lbl13.setText("lbl1");

        btn14.setText("14");

        lbl14.setText("lbl1");

        btn15.setText("15");

        lbl15.setText("lbl1");

        btn16.setText("16");

        lbl16.setText("lbl1");

        btn17.setText("17");

        lbl17.setText("lbl1");

        btn18.setText("18");
        btn18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn18ActionPerformed(evt);
            }
        });

        lbl18.setText("lbl1");

        btn29.setText("29");

        lbl29.setText("lbl1");

        btn20.setText("20");

        lbl20.setText("lbl1");

        btn21.setText("21");
        btn21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn21ActionPerformed(evt);
            }
        });

        lbl21.setText("lbl1");

        btn22.setText("22");

        lbl22.setText("lbl1");

        btn23.setText("23");

        lbl23.setText("lbl1");

        btn24.setText("24");

        lbl24.setText("lbl1");

        btn25.setText("25");

        lbl25.setText("lbl1");

        btn26.setText("26");

        lbl26.setText("lbl1");

        btn27.setText("27");
        btn27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn27ActionPerformed(evt);
            }
        });

        lbl27.setText("lbl1");

        btn28.setText("28");
        btn28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn28ActionPerformed(evt);
            }
        });

        lbl28.setText("lbl1");

        btn30.setText("30");

        lbl30.setText("lbl1");

        fnbtn.setText("FN");

        fnlbl.setText("lbl1");

        Backbtn.setText("Back");
        Backbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackbtnActionPerformed(evt);
            }
        });

        Rollbtn.setText("Roll");
        Rollbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RollbtnActionPerformed(evt);
            }
        });

        restartbtn.setText("Restart");
        restartbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                restartbtnActionPerformed(evt);
            }
        });

        scorelbl.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        scorelbl.setText("Score: ");

        resultlbl.setEditable(false);
        resultlbl.setColumns(20);
        resultlbl.setRows(5);
        jScrollPane1.setViewportView(resultlbl);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(levellbl, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
                        .addGroup(layout.createSequentialGroup()
                                .addGap(72, 72, 72)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                        .addComponent(stbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(stlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                        .addComponent(btn1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(lbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                        .addComponent(btn2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(lbl2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                        .addComponent(btn3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(lbl3, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                        .addComponent(btn4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(lbl4, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                        .addComponent(btn5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(lbl5, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                        .addComponent(btn6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(lbl6, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                        .addComponent(btn7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(lbl7, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                        .addComponent(btn8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(lbl8, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                        .addComponent(btn9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(lbl9, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(btn10, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(lbl10, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(31, 31, 31)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                        .addComponent(btn11, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(lbl11, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                        .addComponent(btn12, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(lbl12, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                        .addComponent(btn13, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(lbl13, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                        .addComponent(btn14, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(lbl14, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                        .addComponent(btn15, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(lbl15, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                        .addComponent(btn16, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(lbl16, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                        .addComponent(btn17, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(lbl17, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                        .addComponent(btn18, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(lbl18, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                        .addComponent(btn19, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(lbl19, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                        .addComponent(btn20, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(lbl20, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                        .addComponent(btn21, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(lbl21, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                        .addComponent(btn22, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(lbl22, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                        .addComponent(btn23, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(lbl23, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                        .addComponent(btn24, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(lbl24, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                                        .addComponent(btn25, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                        .addComponent(lbl25, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                                        .addComponent(btn26, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                        .addComponent(lbl26, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                                        .addComponent(btn27, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                        .addComponent(lbl27, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                        .addGroup(layout.createSequentialGroup()
                                                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                                                        .addComponent(btn28, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                        .addComponent(lbl28, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                                                        .addComponent(btn29, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                        .addComponent(lbl29, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                                        .addComponent(Rollbtn))
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                                        .addComponent(btn30, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                        .addComponent(lbl30, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                                        .addComponent(fnbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                        .addComponent(fnlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                        .addComponent(restartbtn)))
                                                        .addComponent(scorelbl))
                                                .addGap(24, 24, 24))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(124, 124, 124)
                                                .addComponent(Backbtn)
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(username)
                                        .addComponent(levellbl))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(34, 34, 34)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(stbtn)
                                                                        .addComponent(btn1))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(stlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(lbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(btn2)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(lbl2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(btn3)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(lbl3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(btn4)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(lbl4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(btn5)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(lbl5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(btn6)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(lbl6, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(btn7)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(lbl7, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(lbl8, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                        .addComponent(btn8)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                .addComponent(btn9)
                                                                .addComponent(btn10))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(29, 29, 29)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(lbl9, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(lbl10, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(btn11)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(lbl11, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(btn12)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(lbl12, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(btn13)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(lbl13, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(btn14)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(lbl14, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(btn15)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(lbl15, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(btn16)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(lbl16, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(btn17)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(lbl17, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(lbl18, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                        .addComponent(btn18)
                                                        .addComponent(btn19)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(btn20)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(lbl20, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(lbl19, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(29, 29, 29)
                                                                .addComponent(lbl21, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addComponent(btn21)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addComponent(btn22)
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                .addComponent(lbl22, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addComponent(btn23)
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                .addComponent(lbl23, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addComponent(btn24)
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                .addComponent(lbl24, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addComponent(btn25)
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                .addComponent(lbl25, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addComponent(btn26)
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                .addComponent(lbl26, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addComponent(btn27)
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                .addComponent(lbl27, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(btn28)
                                                                        .addComponent(btn29)
                                                                        .addComponent(btn30)
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addComponent(fnbtn)
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                .addComponent(fnlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addGap(29, 29, 29)
                                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                        .addComponent(lbl28, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                        .addComponent(lbl29, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                        .addComponent(lbl30, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                                                .addGap(18, 18, 18)
                                                .addComponent(scorelbl)
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(Backbtn)
                                                        .addComponent(restartbtn)
                                                        .addComponent(Rollbtn)))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addComponent(jScrollPane1)))
                                .addGap(0, 35, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    private void BackbtnActionPerformed(java.awt.event.ActionEvent evt) {
        mainMenu newmainmenu = new mainMenu();
        this.setVisible(false);
        newmainmenu.setVisible(true);
    }

    private void RollbtnActionPerformed(java.awt.event.ActionEvent evt) {
        int diceroll = (int) (Math.random() * 6 + 1);
        resultlbl.setText(resultlbl.getText() + "\n--------------\n" + "Rolled: " + diceroll);

        selectedCell.btn.setEnabled(false);
        selectedCell.lbl.setText("");

        if (selectedCell.cellnum + diceroll > 31) {
            selectedCell = cellList.get(31);
            selectedCell.btn.setEnabled(true);
            selectedCell.lbl.setText("     ▲ ");

            if (level == 1) {
                //LEVEL 1 END

                int choice = JOptionPane.showOptionDialog(
                        null,
                        "Wanna reach into Level 2?",
                        "Choice",
                        JOptionPane.DEFAULT_OPTION,
                        JOptionPane.INFORMATION_MESSAGE,
                        null,
                        new String[]{"Stop", "Continue"},
                        "Continue"
                );
                if (choice == 0) {
                    JOptionPane.showMessageDialog(rootPane, "* Username: " + username.getText() + "\n* Level: " + level + "\n* Score: " + score);
                    writeScores();
                    BackbtnActionPerformed(evt);
                } else if (choice == 1) {
                    Game newgame = new Game(username.getText(), 2, score);
                    this.setVisible(false);
                    newgame.setVisible(true);
                }
            } else {
                //LEVEL 2 END
                JOptionPane.showMessageDialog(rootPane, "* Username: " + username.getText() + "\n* Level: " + level + "\n* Score: " + score);
                writeScores();
                BackbtnActionPerformed(evt);

            }

        } else {
            selectedCell = cellList.get(selectedCell.cellnum + diceroll);
            act();
        }
        if (level==2) {
            
        
        switch (selectedCell.cellnum) {
    case 3 -> {
        selectedCell = cellList.get(8);
        resultlbl.setText(resultlbl.getText() + "\n--------------\n3 -> 8\nMoved 5 cells forward");
        act();
    }
    case 6 -> {
        selectedCell = cellList.get(4);
        resultlbl.setText(resultlbl.getText() + "\n--------------\n6 <- 4\nMoved 2 cells backward");
        act();
    }
    case 9 -> {
        selectedCell = cellList.get(13);
        resultlbl.setText(resultlbl.getText() + "\n--------------\n9 -> 13\nMoved 4 cells forward");
        act();
    }
    case 11 -> {
        selectedCell = cellList.get(5);
        resultlbl.setText(resultlbl.getText() + "\n--------------\n11 <- 5\nMoved 6 cells backward");
        act();
    }
    case 14 -> {
        selectedCell = cellList.get(17);
        resultlbl.setText(resultlbl.getText() + "\n--------------\n14 -> 17\nMoved 3 cells forward");
        act();
    }
    case 18 -> {
        selectedCell = cellList.get(8);
        resultlbl.setText(resultlbl.getText() + "\n--------------\n18 <- 8\nMoved 10 cells backward");
        act();
    }
    case 20 -> {
        selectedCell = cellList.get(26);
        resultlbl.setText(resultlbl.getText() + "\n--------------\n20 -> 26\nMoved 6 cells forward");
        act();
    }
    case 23 -> {
        selectedCell = cellList.get(19);
        resultlbl.setText(resultlbl.getText() + "\n--------------\n23 <- 19\nMoved 4 cells backward");
        act();
    }
    case 27 -> {
        selectedCell = cellList.get(22);
        resultlbl.setText(resultlbl.getText() + "\n--------------\n27 <- 22\nMoved 5 cells backward");
        act();
    }
    case 28 -> {
        selectedCell = cellList.get(30);
        resultlbl.setText(resultlbl.getText() + "\n--------------\n28 -> 30\nMoved 2 cells forward");
        act();
    }
    default -> {
        
    }
}
}

        selectedCell.btn.setEnabled(true);
        selectedCell.lbl.setText("     ▲ ");

    }

    private void act() {
        switch (selectedCell.action) {
            case 0 -> {
                resultlbl.setText(resultlbl.getText() + "\n--------------\n" + "<Nothing happened>");
            }
            case 1 -> {
                score += 10;
                resultlbl.setText(resultlbl.getText() + "\n--------------\n" + "Score increased ( +10 )");
                scorelbl.setText("Score: " + score);
            }
            case 2 -> {
                score -= 5;
                resultlbl.setText(resultlbl.getText() + "\n--------------\n" + "Score decreased ( -5 )");
                scorelbl.setText("Score: " + score);
            }
            case 3 -> {
                score += 50;
                 scorelbl.setText("Score: " + score);
                resultlbl.setText(resultlbl.getText() + "\n--------------\n" + "You found the Grand Prize!\nScore increased ( +50 )");
                JOptionPane.showMessageDialog(rootPane, "* You found the Grand Prize!\n* Score increased ( +50 )");
            }

            default ->
                throw new AssertionError();
        }

    }

    private void writeScores() {
        try {
            FileWriter writer = new FileWriter("src/score.txt", true);

            writer.write(username.getText() + ", level" + level + ", " + score + "\n");
            writer.close();

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }

    private void restartbtnActionPerformed(java.awt.event.ActionEvent evt) {
        Game newgame = new Game(username.getText(), 1, 0);
        this.setVisible(false);
        newgame.setVisible(true);
    }

    void btn18ActionPerformed(java.awt.event.ActionEvent evt) {
    }

    void btn1ActionPerformed(java.awt.event.ActionEvent evt) {
    }

    void btn8ActionPerformed(java.awt.event.ActionEvent evt) {
    }

    void btn11ActionPerformed(java.awt.event.ActionEvent evt) {
    }

    void btn21ActionPerformed(java.awt.event.ActionEvent evt) {
    }

    void btn27ActionPerformed(java.awt.event.ActionEvent evt) {
    }

    void btn28ActionPerformed(java.awt.event.ActionEvent evt) {
    }
    // Variables declaration - do not modify                     
    private javax.swing.JButton Backbtn;
    private javax.swing.JButton Rollbtn;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn10;
    private javax.swing.JButton btn11;
    private javax.swing.JButton btn12;
    private javax.swing.JButton btn13;
    private javax.swing.JButton btn14;
    private javax.swing.JButton btn15;
    private javax.swing.JButton btn16;
    private javax.swing.JButton btn17;
    private javax.swing.JButton btn18;
    private javax.swing.JButton btn19;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn20;
    private javax.swing.JButton btn21;
    private javax.swing.JButton btn22;
    private javax.swing.JButton btn23;
    private javax.swing.JButton btn24;
    private javax.swing.JButton btn25;
    private javax.swing.JButton btn26;
    private javax.swing.JButton btn27;
    private javax.swing.JButton btn28;
    private javax.swing.JButton btn29;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn30;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton fnbtn;
    private javax.swing.JLabel fnlbl;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl1;
    private javax.swing.JLabel lbl10;
    private javax.swing.JLabel lbl11;
    private javax.swing.JLabel lbl12;
    private javax.swing.JLabel lbl13;
    private javax.swing.JLabel lbl14;
    private javax.swing.JLabel lbl15;
    private javax.swing.JLabel lbl16;
    private javax.swing.JLabel lbl17;
    private javax.swing.JLabel lbl18;
    private javax.swing.JLabel lbl19;
    private javax.swing.JLabel lbl2;
    private javax.swing.JLabel lbl20;
    private javax.swing.JLabel lbl21;
    private javax.swing.JLabel lbl22;
    private javax.swing.JLabel lbl23;
    private javax.swing.JLabel lbl24;
    private javax.swing.JLabel lbl25;
    private javax.swing.JLabel lbl26;
    private javax.swing.JLabel lbl27;
    private javax.swing.JLabel lbl28;
    private javax.swing.JLabel lbl29;
    private javax.swing.JLabel lbl3;
    private javax.swing.JLabel lbl30;
    private javax.swing.JLabel lbl4;
    private javax.swing.JLabel lbl5;
    private javax.swing.JLabel lbl6;
    private javax.swing.JLabel lbl7;
    private javax.swing.JLabel lbl8;
    private javax.swing.JLabel lbl9;
    private javax.swing.JLabel levellbl;
    private javax.swing.JButton restartbtn;
    private javax.swing.JTextArea resultlbl;
    private javax.swing.JLabel scorelbl;
    private javax.swing.JButton stbtn;
    private javax.swing.JLabel stlbl;
    private javax.swing.JLabel username;
    // End of variables declaration                   

}
