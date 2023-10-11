package com.storage;

import com.storage.Entities.KVPair;
import com.storage.service.StorageComponentService;
import com.storage.utils.KVPairRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/keys")
public class Controller {

    @Autowired
    KVPairRepository repository;

    @GetMapping("/get/{key}")
    public KVPair get(@PathVariable String key){
        return repository.findByKey(key);
    }

    @RequestMapping("/set/{key}/{value}")
    public KVPair set(@PathVariable String key, @PathVariable String value) {
        KVPair pair = new KVPair(key, value);
        repository.save(pair);
        return pair;
    }

}
