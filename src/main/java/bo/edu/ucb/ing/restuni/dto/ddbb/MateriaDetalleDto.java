package bo.edu.ucb.ing.restuni.dto.ddbb;

import java.sql.Time;
import java.util.Date;
import java.util.List;

public class MateriaDetalleDto {
        private Integer materiaDetalleId;
        private String materia;
        private String codigoAula;
        private Integer docenteId;
        private Time horainicio;
        private Time horafin;
        private String paralelo;
        private String dia;

        public MateriaDetalleDto() {
        }

    public Integer getMateriaDetalleId() {
        return materiaDetalleId;
    }

    public void setMateriaDetalleId(Integer materiaDetalleId) {
        this.materiaDetalleId = materiaDetalleId;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public String getCodigoAula() {
        return codigoAula;
    }

    public void setCodigoAula(String codigoAula) {
        this.codigoAula = codigoAula;
    }

    public Integer getDocenteId() {
        return docenteId;
    }

    public void setDocenteId(Integer docenteId) {
        this.docenteId = docenteId;
    }

    public Time getHorainicio() {
        return horainicio;
    }

    public void setHorainicio(Time horainicio) {
        this.horainicio = horainicio;
    }

    public Time getHorafin() {
        return horafin;
    }

    public void setHorafin(Time horafin) {
        this.horafin = horafin;
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
        return "MateriaDetalleDto{" +
                "materiaDetalleId=" + materiaDetalleId +
                ", materia='" + materia + '\'' +
                ", codigoAula='" + codigoAula + '\'' +
                ", docenteId=" + docenteId +
                ", horainicio=" + horainicio +
                ", horafin=" + horafin +
                ", paralelo='" + paralelo + '\'' +
                ", dia='" + dia + '\'' +
                '}';
    }
}
