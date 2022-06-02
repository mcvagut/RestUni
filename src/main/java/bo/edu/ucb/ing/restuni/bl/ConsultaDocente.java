package bo.edu.ucb.ing.restuni.bl;

import bo.edu.ucb.ing.restuni.dao.DocenteDao;
import bo.edu.ucb.ing.restuni.dao.EstudianteDao;
import bo.edu.ucb.ing.restuni.dto.api.DocenteApiDto;
import bo.edu.ucb.ing.restuni.dto.api.EstudianteApiDto;
import bo.edu.ucb.ing.restuni.dto.ddbb.DocenteDto;
import bo.edu.ucb.ing.restuni.dto.ddbb.EstudianteDto;
import org.springframework.stereotype.Service;

@Service
public class ConsultaDocente {
    private final DocenteDao docenteDao;

    public ConsultaDocente(DocenteDao docenteDao) {
        this.docenteDao = docenteDao;
    }

    public DocenteApiDto findDocenteById(Integer docenteId) {
        DocenteApiDto result = new DocenteApiDto();
        DocenteDto docenteDto = docenteDao.findDocenteByPk(docenteId);

        //Transformación
        result.setDocenteId(docenteDto.getDocenteId());
        result.setNombres(docenteDto.getNombres());
        result.setApellidos(docenteDto.getApellidos());
        result.setCi(docenteDto.getCi());

        return result;
    }

}