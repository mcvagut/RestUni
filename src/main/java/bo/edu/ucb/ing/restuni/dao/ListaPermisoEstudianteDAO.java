package bo.edu.ucb.ing.restuni.dao;



import bo.edu.ucb.ing.restuni.dto.ddbb.EstudianteDto;
import bo.edu.ucb.ing.restuni.dto.ddbb.ListaPermisoEstudianteDTO;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public interface ListaPermisoEstudianteDAO {
    //p.fecha_inicio, p.fecha_fin,
    @Select("SELECT * " +
            "FROM permiso p" +
            "   JOIN estudiante e ON (p.estudiante_id = e.estudiante_id) " +
            "   JOIN docente c ON (p.docente_id=c.docente_id) " +
            "WHERE " +
            " e.estudiante_id = #{primaryKey} "  )
    ListaPermisoEstudianteDTO findPermisosByPk(@Param("primaryKey") Integer primaryKey);

}
