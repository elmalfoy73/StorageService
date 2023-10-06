package com.storage.service;

import com.storage.utils.KVPairRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StorageComponentService {
    @Autowired
    KVPairRepository repository;

    public StorageComponentService(KVPairRepository repository_) {
        repository = repository_;
    }

}
