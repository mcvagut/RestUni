package bo.edu.ucb.ing.restuni.dto.api;

import java.util.Date;
import java.util.List;

public class DocenteHorarioApiDto {
    private Integer docenteId;
    private String nombres;
    private String apellidos;
    private String ci;
    private String pass;
    private List<String> dia;
    private List<String> materia;
    private List<String> paralelo;
    private List<String> aula;
    private List<Date> horainicio;
    private List<Date> horafin;

    public DocenteHorarioApiDto() {
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

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public List<String> getDia() {
        return dia;
    }

    public void setDia(List<String> dia) {
        this.dia = dia;
    }

    public List<String> getMateria() {
        return materia;
    }

    public void setMateria(List<String> materia) {
        this.materia = materia;
    }

    public List<String> getParalelo() {
        return paralelo;
    }

    public void setParalelo(List<String> paralelo) {
        this.paralelo = paralelo;
    }

    public List<String> getAula() {
        return aula;
    }

    public void setAula(List<String> aula) {
        this.aula = aula;
    }

    public List<Date> getHorainicio() {
        return horainicio;
    }

    public void setHorainicio(List<Date> horainicio) {
        this.horainicio = horainicio;
    }

    public List<Date> getHorafin() {
        return horafin;
    }

    public void setHorafin(List<Date> horafin) {
        this.horafin = horafin;
    }

    @Override
    public String toString() {
        return "DocenteHorarioApiDto{" +
                "docenteId=" + docenteId +
                ", nombres='" + nombres + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", ci='" + ci + '\'' +
                ", pass='" + pass + '\'' +
                ", dia=" + dia +
                ", materia=" + materia +
                ", paralelo=" + paralelo +
                ", aula=" + aula +
                ", horainicio=" + horainicio +
                ", horafin=" + horafin +
                '}';
    }
}
