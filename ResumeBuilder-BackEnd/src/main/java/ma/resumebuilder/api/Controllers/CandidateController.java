package ma.resumebuilder.api.Controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
@CrossOrigin("http://localhost:3000")
public class CandidateController {

    @GetMapping
    public ResponseEntity<String> getHello() {
        return ResponseEntity.status(HttpStatus.OK).body("Hello from the api");
    }

}
