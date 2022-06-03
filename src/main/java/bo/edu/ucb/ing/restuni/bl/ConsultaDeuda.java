package bo.edu.ucb.ing.restuni.bl;


import bo.edu.ucb.ing.restuni.dao.EstudianteDao;
import bo.edu.ucb.ing.restuni.dao.DeudaDAO;
import bo.edu.ucb.ing.restuni.dto.ddbb.EstudianteDto;
import bo.edu.ucb.ing.restuni.dto.ddbb.DeudaDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bo.edu.ucb.ing.restuni.dao.ListaPermisoEstudianteDAO;
import bo.edu.ucb.ing.restuni.dto.ddbb.ListaPermisoEstudianteDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.List;

@Component

public class ConsultaDeuda {

    private DeudaDAO DeudaDAO;

    @Autowired
    public ConsultaDeuda(DeudaDAO DeudaDAO) {
        this.DeudaDAO = DeudaDAO;
    }

    public List<DeudaDTO> findDeudaById(Integer chatId) {
        return DeudaDAO.findDeudaById(chatId+"");
    }


}