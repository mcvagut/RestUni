package bo.edu.ucb.ing.restuni.dao;

import bo.edu.ucb.ing.restuni.dto.ddbb.MateriaDetalleDto;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface MateriaDetalleDao {

    @Select("SELECT a.materia_detalle_id as id, a.dia as dia, d.materia as materia, f.codigo_aula as aula, a.docente_id as docente, a.hora_inicio as horainicio, a.hora_fin as horafin, a.paralelo as paralelo, a.dia as dia " +
                "FROM materia_detalle a  " +
                    "JOIN materia d ON (a.materia_id = d.materia_id) " +
                    "JOIN aula f ON (a.aula_id = f.aula_id) " +
                "WHERE  a.materia_detalle_id = #{primaryKey}")
    List<MateriaDetalleDto> findMateriaDetalleByPk(@Param("primaryKey")Integer primaryKey);

}


//    @Select("SELECT a.materia_detalle_id as id, a.dia as dia, d.materia as materia, a.paralelo as paralelo, f.codigo_aula as aula, a.hora_inicio as horainicio, a.hora_fin as horafin " +
//            "FROM materia_detalle a " +
//            "   JOIN materia_detalle_estudiante e ON (a.materia_detalle_id = e.materia_detalle_id) " +
//            "   JOIN estudiante b ON (b.estudiante_id = e.estudiante_id) " +
//            "   JOIN docente c ON (a.docente_id=c.docente_id) " +
//            "   JOIN materia d ON (a.materia_id = d.materia_id) " +
//            "   JOIN aula f ON (a.aula_id = f.aula_id) " +
//            "WHERE " +
//            " b.estudiante_id = #{estudianteId}")
//    MateriaDetalleDto findHorarioEstudianteByPk(@Param("estudianteId")Integer estudianteId);