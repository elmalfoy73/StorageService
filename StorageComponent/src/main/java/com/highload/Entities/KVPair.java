package com.highload.Entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Data
@Getter
@Setter

@Table(schema = "highload", name = "KVPair")
public class KVPair {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "PairID", nullable = false)
    private Long id;
    @Column(name = "Key")
    public String key;
    @Column(name = "Value")
    private String value;
    public KVPair() { }
    public KVPair(String key_, String value_) throws NullPointerException{
        if (key_ == null) throw new NullPointerException();
        if (value_ == null) throw new NullPointerException();

        key = key_;
        value = value_;
    }


}
