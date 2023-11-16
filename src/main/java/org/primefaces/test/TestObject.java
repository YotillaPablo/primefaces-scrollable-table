package org.primefaces.test;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.UUID;

@Data
@EqualsAndHashCode
public class TestObject implements Serializable {

    private String id;
    private String name;

    public TestObject(String name) {
        this.id = UUID.randomUUID().toString();
        this.name = name;
    }

}
