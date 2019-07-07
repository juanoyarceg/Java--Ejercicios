package ejmjava003;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Talleres {

    private int pk;
    private String nombre;
    private String detalle;
    private int horas;
    private int cupos;

    public Talleres() {
    }

    public Talleres(String nom, String det, int hor, int cup) {
        this.nombre = nom;
        this.detalle = det;
        this.horas = hor;
        this.cupos = cup;
    }

    public int getPk() {
        return pk;
    }

    public void setPk(int pk) {
        this.pk = pk;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public int getCupos() {
        return cupos;
    }

    public void setCupos(int cupos) {
        this.cupos = cupos;
    }

    // mysql
    public void Agregar() {
        try {
            String sql = "insert into talleres (nombre, detalle, horas, cupos) "
                    + "values('" + this.nombre + "', '" + this.detalle + "', "
                    + "'" + this.horas + "', '" + this.cupos + "')";
            Connection conexion = Conexion.getConexion();
            PreparedStatement InsertTaller = conexion.prepareStatement(sql);
            InsertTaller.executeUpdate();            
        } catch (Exception ex) {
            
        }
    }

    public ArrayList<Talleres> Listar() {
        ArrayList<Talleres> lista = new ArrayList<Talleres>();
        try {
            Connection conexion = Conexion.getConexion();
            String sql = "select * from talleres";
            PreparedStatement ListaTalleres = conexion.prepareStatement(sql);
            ResultSet rs = ListaTalleres.executeQuery();
            while (rs.next()) {
                Talleres obj = new Talleres();
                obj.setPk(rs.getInt("pk"));
                obj.setNombre(rs.getString("nombre"));
                obj.setDetalle(rs.getString("detalle"));
                obj.setHoras(rs.getInt("horas"));
                obj.setCupos(rs.getInt("cupos"));
                lista.add(obj);
            }
            ListaTalleres.close();
        } catch (SQLException ex) {
            lista = null;
        }
        return lista;
    }

    public String Mostrar() {
        return this.nombre;
    }

}
