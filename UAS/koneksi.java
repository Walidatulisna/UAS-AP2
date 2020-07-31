/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UAS;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author Walidatul Isna
 */
public class koneksi {

    public static void main(String[] args) {
        koneksi teskoneksi = new koneksi();
        teskoneksi.koneksi();
    }
    Connection con = null;

    String statuskoneksi;
    public void koneksi() {
        try {
            String connectionURL = "jdbc:mysql://localhost/uas";
            String username = "root";
            String password = "";
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection) DriverManager.getConnection(connectionURL, username, password);
          //  JOptionPane.showMessageDialog(null, "Sukses Koneksi");
            statuskoneksi = "Berhasil";
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
             statuskoneksi = "Gagal";
            System.exit(0);
        }
    }

}
