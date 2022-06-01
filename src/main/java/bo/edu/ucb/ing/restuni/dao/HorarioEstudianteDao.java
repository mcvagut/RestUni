package bo.edu.ucb.ing.restuni.dao;

import bo.edu.ucb.ing.restuni.dto.ddbb.HorarioEstudianteDto;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface HorarioEstudianteDao {

    @Select("SELECT a.materia_detalle_id as id, a.dia as dia, d.materia as materia, a.paralelo as paralelo, f.codigo_aula as aula, a.hora_inicio as horainicio, a.hora_fin as horafin " +
                "FROM materia_detalle a " +
                "   JOIN materia_detalle_estudiante e ON (a.materia_detalle_id = e.materia_detalle_id) " +
                "   JOIN estudiante b ON (b.estudiante_id = e.estudiante_id) " +
                "   JOIN docente c ON (a.docente_id=c.docente_id) " +
                "   JOIN materia d ON (a.materia_id = d.materia_id) " +
                "   JOIN aula f ON (a.aula_id = f.aula_id) " +
                "WHERE " +
                " estudianteId = #{estudianteId}")
    List<HorarioEstudianteDto> findHorarioEstudianteByPk(@Param("estudianteId")Integer estudianteId);

}
