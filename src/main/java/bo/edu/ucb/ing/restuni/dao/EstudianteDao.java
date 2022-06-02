package bo.edu.ucb.ing.restuni.dao;

import bo.edu.ucb.ing.restuni.dto.ddbb.EstudianteDto;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;

@Service
public interface EstudianteDao {
    @Select("SELECT * FROM estudiante WHERE estudiante_id = #{primaryKey} AND status = 1 ")
    EstudianteDto findEstudianteByPk(@Param("primaryKey") Integer primaryKey);
}
