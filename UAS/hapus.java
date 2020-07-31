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
public class hapus {
      koneksi konek = new koneksi();

    public void hapus(int nis) {

        try {
            konek.koneksi();
            Statement statement = (Statement) konek.con.createStatement();
                String sql = "delete from formuas where nis = '" + nis + "'";
                
                statement.executeUpdate(sql);
                  statement.close();
            

            //  menampilkan.setText(nim.getText() + "\n" + nama.getText() + "\n" + alamat.getText() + "\n" + jk.getText());
            JOptionPane.showMessageDialog(null, "Berhasil Dihapus");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
}

