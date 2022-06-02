package bo.edu.ucb.ing.restuni.dao;

import bo.edu.ucb.ing.restuni.dto.ddbb.EstudianteDto;
import bo.edu.ucb.ing.restuni.dto.ddbb.ListaEstudianteDto;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DocenteListaDao {
    @Select("SELECT a.apellidos as apellidos, a.nombres as nombres, a.ci as carnet " +
            " FROM estudiante a " +
            "   JOIN materia_detalle_estudiante e ON (e.estudiante_id = a.estudiante_id) " +
            "   JOIN materia_detalle b ON (b.materia_detalle_id = e. materia_detalle_id) " +
            "   JOIN docente c ON (c.docente_id=b.docente_id) " +
            "   JOIN materia d ON (d.materia_id = b.materia_id) " +
            " WHERE " +
            " c.docente_id = #{primaryKey} " +
            " GROUP BY a.apellidos, a.nombres, a.ci, d.materia, c.docente_id " +
            " ORDER BY a.apellidos")

    List<ListaEstudianteDto> findListaEstudianteByMateria(@Param("primaryKey") Integer primaryKey);

}
