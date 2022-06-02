package bo.edu.ucb.ing.restuni.dto.api;

public class DocenteApiDto {
    private Integer docenteId;
    private String nombres;
    private String apellidos;
    private String ci;

    public DocenteApiDto() {
    }

    public Integer getDocenteId() {
        return docenteId;
    }

    public void setDocenteId(Integer docenteId) {
        this.docenteId = docenteId;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCi() {
        return ci;
    }

    public void setCi(String ci) {
        this.ci = ci;
    }

    @Override
    public String toString() {
        return "DocenteApiDto{" +
                "docenteId=" + docenteId +
                ", nombres='" + nombres + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", ci='" + ci + '\'' +
                '}';
    }
}
