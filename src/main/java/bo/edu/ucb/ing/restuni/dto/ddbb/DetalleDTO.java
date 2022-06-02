package bo.edu.ucb.ing.restuni.dto.ddbb;


import java.sql.Time;
import java.util.Date;

public class DetalleDTO {
    private Integer materiaDetalleId;
    private Integer materiaId;
    private  Integer aulaId;
    private  Integer docenteId;
    private Time horaInicio;
    private Time horaFin;
    private String paralelo;
    private  String dia;

    public  DetalleDTO() {
    }

    public  DetalleDTO(Integer materiaDetalleId,  Integer materiaId,  Integer aulaId,  Integer docenteId, Time horaInicio, Time horaFin, String paralelo, String dia) {
        this.materiaDetalleId = materiaDetalleId;
        this.materiaId = materiaId;
        this.aulaId = aulaId;
        this.docenteId = docenteId;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
        this.paralelo = paralelo;
        this.dia = dia;
    }

    public Integer getMateriaDetalleId() {
        return materiaDetalleId;
    }

    public void setMateriaDetalleId(Integer materiaDetalleId) {
        this.materiaDetalleId = materiaDetalleId;
    }

    public  Integer getMateriaId() {
        return materiaId;
    }

    public void setMateriaId( Integer materiaId) {
        this.materiaId = materiaId;
    }

    public  Integer getAulaId() {
        return aulaId;
    }

    public void setAulaId( Integer aulaId) {
        this.aulaId = aulaId;
    }

    public  Integer getDocenteId() {
        return docenteId;
    }

    public void setDocenteId( Integer docenteId) {
        this.docenteId = docenteId;
    }

    public Time getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(Time horaInicio) {
        this.horaInicio = horaInicio;
    }

    public Time getHoraFin() {
        return horaFin;
    }

    public void setHoraFin(Time horaFin) {
        this.horaFin = horaFin;
    }

    public String getParalelo() {
        return paralelo;
    }

    public void setParalelo(String paralelo) {
        this.paralelo = paralelo;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    @Override
    public String toString() {
        return "MateriaDetalleDTO{" +
                "materiaDetalleId=" + materiaDetalleId +
                ", materiaId=" + materiaId +
                ", aulaId=" + aulaId +
                ", docenteId=" + docenteId +
                ", horaInicio=" + horaInicio +
                ", horaFin=" + horaFin +
                ", paralelo='" + paralelo + '\'' +
                ", dia='" + dia + '\'' +
                '}';
    }
}