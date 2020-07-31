/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UAS;

import com.mysql.jdbc.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Walidatul Isna
 */
public class insert1 {

    koneksi konek = new koneksi();

    public void insert1(int nis, String namaa, String jk, String alamat, String asalsekolah) {

        try {
            konek.koneksi();
            java.sql.Statement statement = konek.con.createStatement();
                String sql = "insert into formuas values('" + nis + "','" + namaa + "','" + jk + "','" + alamat + "','" + asalsekolah + "');";
                
                statement.executeUpdate(sql);
                  statement.close();
            

            //  menampilkan.setText(nim.getText() + "\n" + nama.getText() + "\n" + alamat.getText() + "\n" + jk.getText());
            JOptionPane.showMessageDialog(null, "Berhasil Disimpan");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
}
