package bo.edu.ucb.ing.restuni.bl;
import bo.edu.ucb.ing.restuni.dao.ListaPermisoEstudianteDAO;
import bo.edu.ucb.ing.restuni.dto.api.EstudianteApiDto;
import bo.edu.ucb.ing.restuni.dto.api.PermisosApiDto;
import bo.edu.ucb.ing.restuni.dto.ddbb.EstudianteDto;
import bo.edu.ucb.ing.restuni.dto.ddbb.ListaPermisoEstudianteDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.sql.Date;
import java.util.List;

@Component

public class ConsultaPermiso {

    private final ListaPermisoEstudianteDAO listaPermisoEstudianteDAO;
    private static Logger LOGGER = LoggerFactory.getLogger(ConsultaPermiso.class);
    @Autowired
    public ConsultaPermiso(ListaPermisoEstudianteDAO listaPermisoEstudianteDAO) {
        this.listaPermisoEstudianteDAO = listaPermisoEstudianteDAO;
    }

    public PermisosApiDto findPermisosById(Integer estudianteId) {
        PermisosApiDto result = new PermisosApiDto();
        ListaPermisoEstudianteDTO PermisosDto = listaPermisoEstudianteDAO.findPermisosByPk(estudianteId);


        LOGGER.info("Obteniendo datos de Permisos");

        //Transformación
        result.setEstudiante_id(PermisosDto.getEstudiante_id());
        result.setPermiso_id(PermisosDto.getPermiso_id());
        result.setRazon(PermisosDto.getRazon());
        result.setFecha_inicio(PermisosDto.getFecha_inicio());
        result.setFecha_fin(PermisosDto.getFecha_fin());
        result.setEstado_permiso(PermisosDto.getEstado_permiso());

        return result;
    }


}