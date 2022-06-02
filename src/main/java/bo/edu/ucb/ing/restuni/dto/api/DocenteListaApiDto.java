package bo.edu.ucb.ing.restuni.dto.api;

import java.util.List;

public class DocenteListaApiDto {
    private Integer docenteId;
    private String nombres;
    private String apellidos;
    private List<String> paralelo;
    private List <String> materia;
    private List <String> apellidoEst;
    private List <String> nombreEst;
    private List <String> carnet;

    public DocenteListaApiDto() {
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

    public List<String> getParalelo() {
        return paralelo;
    }

    public void setParalelo(List<String> paralelo) {
        this.paralelo = paralelo;
    }

    public List<String> getMateria() {
        return materia;
    }

    public void setMateria(List<String> materia) {
        this.materia = materia;
    }

    public List<String> getApellidoEst() {
        return apellidoEst;
    }

    public void setApellidoEst(List<String> apellidoEst) {
        this.apellidoEst = apellidoEst;
    }

    public List<String> getNombreEst() {
        return nombreEst;
    }

    public void setNombreEst(List<String> nombreEst) {
        this.nombreEst = nombreEst;
    }

    public List<String> getCarnet() {
        return carnet;
    }

    public void setCarnet(List<String> carnet) {
        this.carnet = carnet;
    }

    @Override
    public String toString() {
        return "DocenteListaApiDto{" +
                "docenteId=" + docenteId +
                ", nombres='" + nombres + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", paralelo=" + paralelo +
                ", materia=" + materia +
                ", apellidoEst=" + apellidoEst +
                ", nombreEst=" + nombreEst +
                ", carnet=" + carnet +
                '}';
    }
}
