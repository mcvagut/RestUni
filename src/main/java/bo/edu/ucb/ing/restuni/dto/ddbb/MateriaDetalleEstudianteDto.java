package bo.edu.ucb.ing.restuni.dto.ddbb;

import org.jruby.util.Numeric;

import java.util.List;

public class MateriaDetalleEstudianteDto {
    private Integer id;
    private Integer materiaDetalleId;
    private Integer estudianteId;
    private String tipoNota;
    private Numeric nota;

    public MateriaDetalleEstudianteDto() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getMateriaDetalleId() {
        return materiaDetalleId;
    }

    public void setMateriaDetalleId(Integer materiaDetalleId) {
        this.materiaDetalleId = materiaDetalleId;
    }

    public Integer getEstudianteId() {
        return estudianteId;
    }

    public void setEstudianteId(Integer estudianteId) {
        this.estudianteId = estudianteId;
    }

    public String getTipoNota() {
        return tipoNota;
    }

    public void setTipoNota(String tipoNota) {
        this.tipoNota = tipoNota;
    }

    public Numeric getNota() {
        return nota;
    }

    public void setNota(Numeric nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "MateriaDetalleEstudianteDto{" +
                "id=" + id +
                ", materiaDetalleId=" + materiaDetalleId +
                ", estudianteId=" + estudianteId +
                ", tipoNota='" + tipoNota + '\'' +
                ", nota=" + nota +
                '}';
    }
}
