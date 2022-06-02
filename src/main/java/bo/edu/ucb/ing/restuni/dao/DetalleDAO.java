package bo.edu.ucb.ing.restuni.dao;

import bo.edu.ucb.ing.restuni.dto.ddbb.DetalleDTO;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface DetalleDAO {
    @Select("SELECT a.materia_detalle_id as id, d.siglas as siglas, d.materia as materia, a.hora_inicio as horainicio, a.hora_fin as horafin, f.codigo_aula as aula, a.paralelo as paralelo, a.dia as dia " +
            "FROM materia_detalle a " +
            "   JOIN materia_detalle_estudiante e ON (a.materia_detalle_id = e.materia_detalle_id) " +
            "   JOIN docente c ON (a.docente_id=c.docente_id) " +
            "   JOIN materia d ON (a.materia_id = d.materia_id) " +
            "   JOIN aula f ON (a.aula_id = f.aula_id) " )
    List<DetalleDTO> findDetalleById(@Param("id")String detalleId);
}

