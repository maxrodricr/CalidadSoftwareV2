
package config;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {
    Connection con;

    //Datos Basicos para Generar la Coneccion 
    static String ip  = "192.168.100.16";
    static String url = "jdbc:mysql://"+ ip + "/ventas";
    //Esto se debe de mostrar como "jdbc:mysql://192.168.100.16/libreria";
    static String login = "java";
    static String password = "1234"; //Contraseña super secreta que no se repite

    /**
     * Metodo que permite crear el enlace que Conecta la base de Datos de MySql con el Programa
     * @return Devuelve el estado de la coneccion
     */
    public Connection Conectar() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, login, password);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return con;

    }
    
}
