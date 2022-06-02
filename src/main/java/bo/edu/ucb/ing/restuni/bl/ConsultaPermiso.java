package bo.edu.ucb.ing.restuni.bl;
import bo.edu.ucb.ing.restuni.dao.ListaPermisoEstudianteDAO;
import bo.edu.ucb.ing.restuni.dto.ddbb.ListaPermisoEstudianteDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.List;

@Component

public class ConsultaPermiso {

    private ListaPermisoEstudianteDAO listaPermisoEstudianteDAO;

    @Autowired
    public ConsultaPermiso(ListaPermisoEstudianteDAO listaPermisoEstudianteDAO) {
        this.listaPermisoEstudianteDAO = listaPermisoEstudianteDAO;
    }

    public List<ListaPermisoEstudianteDTO> findListaPermisoEstudianteByBotChatId(Long chatId) {
        return listaPermisoEstudianteDAO.findListaPermisoEstudianteByBotChatId(chatId+"");
    }


}