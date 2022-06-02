package bo.edu.ucb.ing.restuni.dao;

import bo.edu.ucb.ing.restuni.dto.ddbb.DocenteDto;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DocenteDao {
    @Select("SELECT * FROM docente WHERE docente_id = #{docenteId} AND status = 1 ")
    DocenteDto findDocenteByPk(@Param("docenteId") Integer docenteId);
}
