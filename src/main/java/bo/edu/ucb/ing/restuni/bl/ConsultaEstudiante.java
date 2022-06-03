package bo.edu.ucb.ing.restuni.bl;

import bo.edu.ucb.ing.restuni.dao.EstudianteDao;
import bo.edu.ucb.ing.restuni.dto.api.EstudianteApiDto;
import bo.edu.ucb.ing.restuni.dto.ddbb.EstudianteDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class  ConsultaEstudiante {
    private final EstudianteDao estudianteDao;
    private static Logger LOGGER = LoggerFactory.getLogger(ConsultaEstudiante.class);
    public ConsultaEstudiante(EstudianteDao estudianteDao) {
        this.estudianteDao = estudianteDao;
    }

    public EstudianteApiDto findEstudianteById(Integer estudianteId) {
        EstudianteApiDto result = new EstudianteApiDto();
        EstudianteDto estudianteDto = estudianteDao.findEstudianteByPk(estudianteId);
        LOGGER.info("Obteniendo datos de estudiante");
        //Transformación
        result.setEstudianteId(estudianteDto.getEstudianteId());
        result.setNombres(estudianteDto.getNombres());
        result.setApellidos(estudianteDto.getApellidos());
        result.setCi(estudianteDto.getCi());
        return result;
    }
}
