/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package g4s21juanp14.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author user
 */
public class conexionDAO {
    Connection conexion;
    
    public void Abrir(){
        String user="root";
        String password="root";
        String url="jbc:mysql://localhost:3306/g4s21juan?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
    try{
           Class.forName("com.mysql.cj.jdbc.Driver"); 
           conexion= DriverManager.getConnection(url,user,password);
        }catch(ClassNotFoundException | SQLException ex){
            ex.printStackTrace();
            
        }
    }
    }

