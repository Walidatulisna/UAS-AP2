/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UAS;

import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Walidatul Isna
 */
public class update {

    koneksi konek = new koneksi();

    public void update(int NIS, String Nama, String jk, String alamat, String asalsekolah) {

        try {
            konek.koneksi();    
            Statement statement = konek.con.createStatement();
            String sql_Nama = "Update formuas Set Nama = '" + Nama + "'Where NIS = '" + NIS + "'";
            String sql_Alamat = "Update formuas Set Alamat = '" + alamat + "'Where NIS = '" + NIS + "'";
            String sql_JK = "Update formuas Set JK = '" + jk + "'Where NIS = '" + NIS + "'";
            String sql_asal = "Update formuas Set Asal_Sekolah = '" + asalsekolah + "' Where NIS = '" + NIS + "'";
            //  String sql_NIS1 = "Update formuas Set NIS = '" + NIS + "'Where Nama = '" + Nama + "'";
            //  String sql_NIS2 = "Update formuas Set NIS = '" + NIS + "'Where Alamat = '" + alamat + "'";

            //   statement.executeUpdate(sql_NIS1);
            //  statement.executeUpdate(sql_NIS2);
            statement.executeUpdate(sql_Nama);
            statement.executeUpdate(sql_Alamat);
            statement.executeUpdate(sql_JK);
            statement.executeUpdate(sql_asal);
            statement.close();

            JOptionPane.showMessageDialog(null, "Berhasil Diubah");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }

}
