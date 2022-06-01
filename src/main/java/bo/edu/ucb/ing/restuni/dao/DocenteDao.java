package bo.edu.ucb.ing.restuni.dao;

import bo.edu.ucb.ing.restuni.dto.ddbb.DocenteDto;
import bo.edu.ucb.ing.restuni.dto.ddbb.EstudianteDto;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DocenteDao {
    @Select("SELECT docente_id, nombres, apellidos, ci, pass, " +
            "status, tx_id, tx_user, tx_host, tx_date"+
            "FROM docente WHERE docente_id = #{docenteId} AND status = 1 ")
    List<DocenteDto> findDocenteByPk(@Param("docenteId") Integer docenteId);
}
