package bo.edu.ucb.ing.restuni.dto.ddbb;
import java.sql.Date;

public class ListaPermisoDocenteDTO {

    private String apellidos;
    private String nombres;
    private String ci;
    private Date fecha_inicio;
    private Date fecha_fin;
    private String razon;
    private String estado_permiso;

    private Integer status;
    private Integer tx_id;
    private String tx_user;
    private String tx_host;
    private java.util.Date tx_date;

    public ListaPermisoDocenteDTO(String apellidos, String nombres, String ci, Date fecha_inicio, Date fecha_fin, String razon, String estado_permiso, Integer status, Integer tx_id, String tx_user, String tx_host, java.util.Date tx_date) {
        this.apellidos = apellidos;
        this.nombres = nombres;
        this.ci = ci;
        this.fecha_inicio = fecha_inicio;
        this.fecha_fin = fecha_fin;
        this.razon = razon;
        this.estado_permiso = estado_permiso;
        this.status = status;
        this.tx_id = tx_id;
        this.tx_user = tx_user;
        this.tx_host = tx_host;
        this.tx_date = tx_date;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getCi() {
        return ci;
    }

    public void setCi(String ci) {
        this.ci = ci;
    }

    public Date getFecha_inicio() {
        return fecha_inicio;
    }

    public void setFecha_inicio(Date fecha_inicio) {
        this.fecha_inicio = fecha_inicio;
    }

    public Date getFecha_fin() {
        return fecha_fin;
    }

    public void setFecha_fin(Date fecha_fin) {
        this.fecha_fin = fecha_fin;
    }

    public String getRazon() {
        return razon;
    }

    public void setRazon(String razon) {
        this.razon = razon;
    }

    public String getEstado_permiso() {
        return estado_permiso;
    }

    public void setEstado_permiso(String estado_permiso) {
        this.estado_permiso = estado_permiso;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getTx_id() {
        return tx_id;
    }

    public void setTx_id(Integer tx_id) {
        this.tx_id = tx_id;
    }

    public String getTx_user() {
        return tx_user;
    }

    public void setTx_user(String tx_user) {
        this.tx_user = tx_user;
    }

    public String getTx_host() {
        return tx_host;
    }

    public void setTx_host(String tx_host) {
        this.tx_host = tx_host;
    }

    public java.util.Date getTx_date() {
        return tx_date;
    }

    public void setTx_date(java.util.Date tx_date) {
        this.tx_date = tx_date;
    }

    @Override
    public String toString() {
        return "ListaPermisoDocenteDTO{" +
                "apellidos='" + apellidos + '\'' +
                ", nombres='" + nombres + '\'' +
                ", ci='" + ci + '\'' +
                ", fecha_inicio=" + fecha_inicio +
                ", fecha_fin=" + fecha_fin +
                ", razon='" + razon + '\'' +
                ", estado_permiso='" + estado_permiso + '\'' +
                ", status=" + status +
                ", tx_id=" + tx_id +
                ", tx_user='" + tx_user + '\'' +
                ", tx_host='" + tx_host + '\'' +
                ", tx_date=" + tx_date +
                '}';
    }
}
