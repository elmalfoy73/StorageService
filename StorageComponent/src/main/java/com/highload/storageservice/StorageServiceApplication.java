package com.highload.storageservice;

import com.highload.storageservice.Entities.KVPair;
import com.highload.storageservice.service.StorageComponentService;


public class StorageServiceApplication {

    public static void main(String[] args) {
        KVPair pair = new KVPair("qwerty", "qwerty");
        StorageComponentService.savePair(pair);
        KVPair result = StorageComponentService.getValue("test");

        System.out.println("dffd");
    }

}
