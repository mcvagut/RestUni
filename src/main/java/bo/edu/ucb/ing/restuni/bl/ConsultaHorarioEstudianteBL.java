package bo.edu.ucb.ing.restuni.bl;

import bo.edu.ucb.ing.restuni.dto.api.EstudianteApiDto;
import bo.edu.ucb.ing.restuni.dto.api.EstudianteHorarioApiDto;
import bo.edu.ucb.ing.restuni.dao.EstudianteDao;
import bo.edu.ucb.ing.restuni.dao.MateriaDetalleDao;
import bo.edu.ucb.ing.restuni.dao.MateriaDetalleEstudianteDao;
import bo.edu.ucb.ing.restuni.dto.ddbb.EstudianteDto;
import bo.edu.ucb.ing.restuni.dto.ddbb.MateriaDetalleDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class ConsultaHorarioEstudianteBL {
    private final EstudianteDao estudianteDao;
    private final MateriaDetalleDao materiaDetalleDao;
    private final MateriaDetalleEstudianteDao materiaDetalleEstudianteDao;
    private static Logger LOGGER = LoggerFactory.getLogger(ConsultaHorarioEstudianteBL.class);

    public ConsultaHorarioEstudianteBL(EstudianteDao estudianteDao, MateriaDetalleDao materiaDetalleDao, MateriaDetalleEstudianteDao materiaDetalleEstudianteDao) {
        this.estudianteDao = estudianteDao;
        this.materiaDetalleDao = materiaDetalleDao;
        this.materiaDetalleEstudianteDao = materiaDetalleEstudianteDao;
    }

    public EstudianteHorarioApiDto findHorarioEstudianteById(Integer estudianteId) {
        EstudianteHorarioApiDto result = new EstudianteHorarioApiDto();
        EstudianteDto estudianteDto = estudianteDao.findEstudianteByPk(estudianteId);
        LOGGER.info("Obteniendo datos de estudiante");
        //Transformación
        result.setEstudianteId(estudianteDto.getEstudianteId());
        result.setNombres(estudianteDto.getNombres());
        result.setApellidos(estudianteDto.getApellidos());
        result.setCi(estudianteDto.getCi());
        result.setPass(estudianteDto.getPass());

        LOGGER.info("Definiendo ArrayList");
        result.setDia(new ArrayList<>());
        result.setParalelo(new ArrayList<>());
        result.setMateria(new ArrayList<>());
        result.setAula(new ArrayList<>());
        result.setHorainicio(new ArrayList<>());
        result.setHorafin(new ArrayList<>());


        List<MateriaDetalleDto> materiaDetalleDtoList = materiaDetalleDao.findMateriaDetalleByPk(estudianteId);
        LOGGER.info("Iterando MateriaDetalleDto");
        for (MateriaDetalleDto materiaDetalleDto : materiaDetalleDtoList) {
           if(materiaDetalleDto!= null) {
               result.getDia().add(materiaDetalleDto.getDia());
               result.getMateria().add(materiaDetalleDto.getMateria());
               result.getParalelo().add(materiaDetalleDto.getParalelo());
               result.getAula().add(materiaDetalleDto.getCodigoAula());
               result.getHorainicio().add(materiaDetalleDto.getHorainicio());
               result.getHorafin().add(materiaDetalleDto.getHorafin());
           }

        }
        return result;
    }

}

