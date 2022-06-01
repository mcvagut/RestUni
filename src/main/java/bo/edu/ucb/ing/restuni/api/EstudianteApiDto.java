package bo.edu.ucb.ing.restuni.api;


import bo.edu.ucb.ing.restuni.dto.ddbb.HorarioEstudianteDto;

import java.util.List;

public class EstudianteApiDto {
    private Integer estudianteId;
    private String nombres;
    private String apellidos;
    private String ci;
    private String pass;
    private List<HorarioEstudianteDto> dia;
    private List<HorarioEstudianteDto> materia;
    private List<HorarioEstudianteDto> paralelo;
    private List<HorarioEstudianteDto> aula;
    private List<HorarioEstudianteDto> horaInicio;
    private List<HorarioEstudianteDto> horaFin;

    public EstudianteApiDto() {
    }

    public Integer getEstudianteId() {
        return estudianteId;
    }

    public void setEstudianteId(Integer estudianteId) {
        this.estudianteId = estudianteId;
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

    public List<HorarioEstudianteDto> getDia() {
        return dia;
    }

    public void setDia(List<HorarioEstudianteDto> dia) {
        this.dia = dia;
    }

    public List<HorarioEstudianteDto> getMateria() {
        return materia;
    }

    public void setMateria(List<HorarioEstudianteDto> materia) {
        this.materia = materia;
    }

    public List<HorarioEstudianteDto> getParalelo() {
        return paralelo;
    }

    public void setParalelo(List<HorarioEstudianteDto> paralelo) {
        this.paralelo = paralelo;
    }

    public List<HorarioEstudianteDto> getAula() {
        return aula;
    }

    public void setAula(List<HorarioEstudianteDto> aula) {
        this.aula = aula;
    }

    public List<HorarioEstudianteDto> getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(List<HorarioEstudianteDto> horaInicio) {
        this.horaInicio = horaInicio;
    }

    public List<HorarioEstudianteDto> getHoraFin() {
        return horaFin;
    }

    public void setHoraFin(List<HorarioEstudianteDto> horaFin) {
        this.horaFin = horaFin;
    }

    @Override
    public String toString() {
        return "EstudianteApiDto{" +
                "estudianteId=" + estudianteId +
                ", nombres='" + nombres + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", ci='" + ci + '\'' +
                ", pass='" + pass + '\'' +
                ", dia=" + dia +
                ", materia=" + materia +
                ", paralelo=" + paralelo +
                ", aula=" + aula +
                ", horaInicio=" + horaInicio +
                ", horaFin=" + horaFin +
                '}';
    }
}
