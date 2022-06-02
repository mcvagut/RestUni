package bo.edu.ucb.ing.restuni.dao;

import bo.edu.ucb.ing.restuni.dto.ddbb.MateriaDetalleEstudianteDto;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface MateriaDetalleEstudianteDao {

    @Select("SELECT materia_detalle_estudiante_id as id, materia_detalle_id as matId, estudiante_id as estudiante, tipo_nota as tipoNota, nota " +
            "FROM materia_detalle_estudiante " +
            "JOIN estudiante b ON (b.estudiante_id = estudiante_id)" +
            "WHERE b.estudiante_id = #{estudianteId}")
    List<MateriaDetalleEstudianteDto> findMateriaDetalleEstudianteByPk(@Param("estudianteId")Integer estudianteId);
}
//("SELECT a.materia_detalle_estudiante_id as id, a.materia_detalle_id as matId, a.estudiante_id as estudiante, a.tipo_nota as tipoNota, a.nota " +
//        "FROM materia_detalle_estudiante a " +
//        "   JOIN materia_detalle_id e ON (a.materia_detalle_id = e.materia_detalle_id) " +
//        "   JOIN estudiante b ON (b.estudiante_id = a.estudiante_id) " +
//        "   JOIN materia d ON (d.materia_id = e.materia_id) " +
//        "   JOIN aula f ON (f.aula_id = d.aula_id) " +
//        "WHERE " +
//        " estudiante_id = #{estudianteId}")