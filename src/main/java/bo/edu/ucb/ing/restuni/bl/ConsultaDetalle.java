package bo.edu.ucb.ing.restuni.bl;
import bo.edu.ucb.ing.restuni.api.EstudianteApiDto;
import bo.edu.ucb.ing.restuni.dao.EstudianteDao;
import bo.edu.ucb.ing.restuni.dao.DetalleDAO;
import bo.edu.ucb.ing.restuni.dto.ddbb.EstudianteDto;
import bo.edu.ucb.ing.restuni.dto.ddbb.DetalleDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bo.edu.ucb.ing.restuni.dao.ListaPermisoEstudianteDAO;
import bo.edu.ucb.ing.restuni.dto.ddbb.ListaPermisoEstudianteDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.List;

@Component

public class ConsultaDetalle {

    private DetalleDAO DetalleDAO;

    @Autowired
    public ConsultaDetalle(DetalleDAO DetalleDAO) {
        this.DetalleDAO = DetalleDAO;
    }

    public List<DetalleDTO> findDeudaById(Long chatId) {
        return DetalleDAO.findDetalleById(chatId+"");
    }


}