package jogayjoga.court;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;


@FeignClient("ingressify-court")
public interface CourtController {
    
    @PostMapping("/court/")
    ResponseEntity<?> create(
            @RequestBody(required = true) RegisterIn in);
    
    @GetMapping("/court/")
    //list?
    ResponseEntity<GetOut> get();

    @GetMapping("/court/{id}")
    ResponseEntity<GetOut> get(
        @PathVariable(required = true) String id
    );
        
    @PutMapping("/court/{id}")
    ResponseEntity<SolveOut> update (
        @PathVariable(required = true) String id,
        @RequestBody(required = true) UpdateIn in
    );
}
