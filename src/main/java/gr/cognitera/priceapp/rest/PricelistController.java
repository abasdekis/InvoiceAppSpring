package gr.cognitera.priceapp.rest;


import gr.cognitera.priceapp.DTO.PricelistParamsDTO;
import gr.cognitera.priceapp.model.Kyd;
import gr.cognitera.priceapp.service.IPricelistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class PricelistController {

    private IPricelistService pricelistService;

    @Autowired
    public PricelistController(IPricelistService pricelistService) {
        this.pricelistService = pricelistService;
    }

    @RequestMapping(path = "kyds/{keydId}/pricelists/{pricelistId}", method = RequestMethod.GET)
    public ResponseEntity<String> getObject(@PathVariable String code) {
        PricelistParamsDTO plObjectDTO = new PricelistParamsDTO();
        //plObjectDTO.setCode(Kyd.COLUMN_CODE_NAME);
        return ResponseEntity.ok(plObjectDTO.toString());
    };
}



