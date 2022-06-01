package bo.edu.ucb.ing.restuni.dao;

import bo.edu.ucb.ing.restuni.dto.ddbb.EstudianteDto;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;


@Service
public interface EstudianteDao {
    @Select("SELECT estudiante_id, nombres, apellidos, ci, pass, " +
            "status, tx_id, tx_ser, tx_host, tx_date"+
            "FROM estudiante WHERE estudiante_id = #{estudianteId} AND status = 1 ")
    EstudianteDto findEstudianteByPk(@Param("estudianteId") Integer estudianteId);
}
