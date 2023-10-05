package com.highload;

import com.highload.service.StorageComponentService;
import com.highload.Entities.KVPair;


public class StorageServiceApplication {

    public static void main(String[] args) {
        KVPair pair = new KVPair("qwerty", "qwerty");
        StorageComponentService.savePair(pair);
        KVPair result = StorageComponentService.getValue("test");

        System.out.println("dffd");
    }

}
