package jogayjoga.court;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
// import java.util.List;


@FeignClient(name = "jogayjoga-court")
public interface CourtController {
    
    @PostMapping("/court")
    ResponseEntity<?> create(
            @RequestBody(required = true) CourtIn in);
    
    // @GetMapping("/court/")
    // //list?
    // ResponseEntity<List<CourtOut>> getAllCourts();

    @GetMapping("/court/{id}")
    ResponseEntity<CourtOut> get(
        @PathVariable(required = true) String id
    );
        
    // @PutMapping("/court/{id}")
    // ResponseEntity<CourtOut> update (
    //     @PathVariable(required = true) String id,
    //     @RequestBody(required = true) UpdateIn in
    // );
}
