package bo.edu.ucb.ing.restuni.bl;

import bo.edu.ucb.ing.restuni.dao.*;
import bo.edu.ucb.ing.restuni.dto.api.DocenteListaApiDto;
import bo.edu.ucb.ing.restuni.dto.ddbb.DocenteDto;
import bo.edu.ucb.ing.restuni.dto.ddbb.ListaEstudianteDto;
import bo.edu.ucb.ing.restuni.dto.ddbb.MateriaDetalleDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ConsultaListaDocente {
    private final DocenteDao docenteDao;
    private final DocenteListaDao docenteListaDao;
    private final MateriaDetalleDao materiaDetalleDao;
    private static Logger LOGGER = LoggerFactory.getLogger(ConsultaListaDocente.class);
    public ConsultaListaDocente(DocenteDao docenteDao, DocenteListaDao docenteListaDao, MateriaDetalleDao materiaDetalleDao) {
        this.docenteDao = docenteDao;
        this.docenteListaDao = docenteListaDao;
        this.materiaDetalleDao = materiaDetalleDao;
    }


    public DocenteListaApiDto findListaDocenteByMateria(Integer docenteId){
            DocenteListaApiDto result = new DocenteListaApiDto();
            DocenteDto docenteDto = docenteDao.findDocenteByPk(docenteId);

            LOGGER.info("Obteniendo de BBDD {}", docenteId);
            //Transformación
            result.setDocenteId(docenteDto.getDocenteId());
            result.setNombres(docenteDto.getNombres());
            result.setApellidos(docenteDto.getApellidos());

//            List<MateriaDetalleDto> materiaDetalleDtoList = materiaDetalleDao.findMateriaDetalleByPk(docenteId);
//            for(MateriaDetalleDto materiaDetalleDto : materiaDetalleDtoList ){
//                result.getParalelo().add(materiaDetalleDto.getParalelo());
//                result.getMateria().add(materiaDetalleDto.getMateria());
//            }
            LOGGER.info("Arrays");
            result.setApellidoEst(new ArrayList<>());
            result.setNombreEst(new ArrayList<>());
            result.setCarnet(new ArrayList<>());

            List <ListaEstudianteDto> listaEstudianteDtoList = docenteListaDao.findListaEstudianteByMateria(docenteId);

            int i=0;
            for (ListaEstudianteDto listaEstudianteDto : listaEstudianteDtoList){
                result.getApellidoEst().add(listaEstudianteDto.getApellidos());
                result.getNombreEst().add(listaEstudianteDto.getNombres());
                result.getCarnet().add(listaEstudianteDto.getCi());
            }

        return result;
    }



}
