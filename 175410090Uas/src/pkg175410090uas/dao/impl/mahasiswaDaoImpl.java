/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg175410090uas.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import pkg175410090uas.dao.mahasiswaDao;
import pkg175410090uas.entity.mahasiswa;

/**
 *
 * @author dzikra
 */
public class mahasiswaDaoImpl implements mahasiswaDao{
    private Connection connection;
    
    @Override
    public void setConnecton(Connection connection) {
        this.connection = connection;
    }

    @Override
    public void insertData(mahasiswa mahasiswa) {
        String sql = "INSERT INTO mahasiwa VALUES (nim, nama, jenis_kelamin)";
        try {
            PreparedStatement pR = connection.prepareStatement(sql);
            //pR.setString(0, mahasiswa.getNis());
            //pR.setString(1, mahasiswa.getNama());
            //pR.executeUpdate();
        } catch(SQLException ex) {
            Logger.getLogger(mahasiswaDaoImpl.class.getName()).log(Level.SEVERE,null,ex);
        }
    }
}
