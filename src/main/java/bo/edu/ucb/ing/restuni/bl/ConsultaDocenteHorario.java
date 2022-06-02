package bo.edu.ucb.ing.restuni.bl;

import bo.edu.ucb.ing.restuni.dao.DocenteDao;
import bo.edu.ucb.ing.restuni.dao.MateriaDetalleDao;
import bo.edu.ucb.ing.restuni.dto.api.DocenteApiDto;
import bo.edu.ucb.ing.restuni.dto.api.DocenteHorarioApiDto;
import bo.edu.ucb.ing.restuni.dto.ddbb.DocenteDto;
import bo.edu.ucb.ing.restuni.dto.ddbb.MateriaDetalleDto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ConsultaDocenteHorario {
    private final DocenteDao docenteDao;
    private final MateriaDetalleDao materiaDetalleDao;

    public ConsultaDocenteHorario(DocenteDao docenteDao, MateriaDetalleDao materiaDetalleDao) {
        this.docenteDao = docenteDao;
        this.materiaDetalleDao = materiaDetalleDao;
    }

    public DocenteHorarioApiDto findHorarioDocenteById(Integer docenteId){
        DocenteHorarioApiDto result = new DocenteHorarioApiDto();
        DocenteDto docenteDto = docenteDao.findDocenteByPk(docenteId);

        //Transformación
        result.setDocenteId(docenteDto.getDocenteId());
        result.setNombres(docenteDto.getNombres());
        result.setApellidos(docenteDto.getApellidos());
        result.setCi(docenteDto.getCi());

        result.setDia(new ArrayList<>());
        result.setParalelo(new ArrayList<>());
        result.setMateria(new ArrayList<>());
        result.setAula(new ArrayList<>());
        result.setHorainicio(new ArrayList<>());
        result.setHorafin(new ArrayList<>());

        List<MateriaDetalleDto> materiaDetalleDtoList = materiaDetalleDao.findMateriaDetalleByPk(docenteId);

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
