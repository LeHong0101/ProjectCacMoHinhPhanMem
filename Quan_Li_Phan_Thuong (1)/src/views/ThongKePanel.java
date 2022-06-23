package views;

import controllers.TraoQuaController;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;
import models.ThongKeTraTraoThuong;

public class ThongKePanel extends javax.swing.JPanel {
    private JFrame parentFrame;
    TraoQuaController traoqController = new TraoQuaController();
    /**
     * Creates new form ThongKePanel
     */
    public ThongKePanel(JFrame parentFrame) throws SQLException, ClassNotFoundException {
        this.parentFrame = parentFrame;
        initComponents();
        get();
    }
    
    public void get() throws SQLException, ClassNotFoundException {
        ArrayList<Object> arrList = traoqController.get();
        Object colunm[] = new Object[]{"Tên phần thưởng", "số phần quà được trao", "Tổng chi phí"};
        DefaultTableModel model = new DefaultTableModel();
        jTableList.setModel(model);
        model.setColumnIdentifiers(colunm);
        model.setRowCount(0);
        for (Object temp : arrList) {
            ThongKeTraTraoThuong l = (ThongKeTraTraoThuong) temp;
            String data[] = new String[3];
            data[0] = l.getTenPhanThuong();
            data[1] = String.valueOf(l.getSoLuong());
            data[2] = String.valueOf(l.getGiaTriPhanQua());
            model.addRow(data);
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

        GenderChoose = new javax.swing.ButtonGroup();
        statusChoose = new javax.swing.ButtonGroup();
        tableJpnTraoThuong = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableList = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jTableList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Khong", "Title 2", "Title 3", "Title 4"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTableList);

        javax.swing.GroupLayout tableJpnTraoThuongLayout = new javax.swing.GroupLayout(tableJpnTraoThuong);
        tableJpnTraoThuong.setLayout(tableJpnTraoThuongLayout);
        tableJpnTraoThuongLayout.setHorizontalGroup(
            tableJpnTraoThuongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 719, Short.MAX_VALUE)
        );
        tableJpnTraoThuongLayout.setVerticalGroup(
            tableJpnTraoThuongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE)
        );

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        jLabel8.setText("Thống kê chi phí, số lượng phần thưởng theo từng mục");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tableJpnTraoThuong, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(227, 227, 227))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tableJpnTraoThuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup GenderChoose;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableList;
    private javax.swing.ButtonGroup statusChoose;
    private javax.swing.JPanel tableJpnTraoThuong;
    // End of variables declaration//GEN-END:variables
}