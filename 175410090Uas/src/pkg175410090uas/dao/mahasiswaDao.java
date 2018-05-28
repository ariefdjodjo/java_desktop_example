/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg175410090uas.dao;

import java.sql.Connection;
import pkg175410090uas.entity.mahasiswa;

/**
 *
 * @author dzikra
 */
public interface mahasiswaDao {
    public void setConnecton(Connection connection);
    public void insertData(mahasiswa mahasiswa);
}
