package bo.edu.ucb.ing.restuni.api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;

@RestController
@RequestMapping("/api/v1")
public class EstudianteImagenApi {

    private static final Logger LOGGER = LoggerFactory.getLogger(EstudianteImagenApi.class);

//    @PostMapping(path = "/estudiante/{estudianteId}/imagen", produces = MediaType.TEXT_HTML_VALUE)
//    public void uploadFile(@RequestParam("archivo")MultipartFile archivo){
//        LOGGER.info("Recibiendo archivo: Formato {}, Nombre {} ", archivo.getContentType(),
//        archivo.getName(), archivo.getOriginalFilename());
//    }

    @RequestMapping(path = "/estudiante/{estudianteId}/imagen", method = RequestMethod.GET)
    public ResponseEntity<Resource> download(@PathVariable("uuid") String uuid) {
        String format = "ejemplo.png";


        return null;
    }

}
