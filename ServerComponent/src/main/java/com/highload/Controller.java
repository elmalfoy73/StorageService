package com.highload;

import com.highload.Entities.KVPair;
import com.highload.service.StorageComponentService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/keys")
public class Controller {
    StorageComponentService service = new StorageComponentService();

    @GetMapping("/${key}")
    public KVPair get(String key){
        return service.getValue(key);
    }

    @PostMapping("/${key}?value=${value}")
    public void set(String key, String value) {
        KVPair pair = new KVPair(key, value);
        service.savePair(pair);
    }

}
