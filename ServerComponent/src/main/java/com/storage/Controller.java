package com.storage;

import com.storage.Entities.KVPair;
import com.storage.service.StorageComponentService;
import com.storage.utils.KVPairRepository;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/keys")
public class Controller {
    KVPairRepository repository;

    @GetMapping("/{key}")
    public KVPair get(@PathVariable String key){
        return repository.findByKey(key);
    }

    @PostMapping("/set/{key}/{value}")
    public void set(@PathVariable String key, @PathVariable String value) {
        KVPair pair = new KVPair(key, value);
        repository.save(pair);
    }

}
