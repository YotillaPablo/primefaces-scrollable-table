package org.primefaces.test;

import javax.enterprise.context.ApplicationScoped;
import java.io.Serializable;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@ApplicationScoped
public class TestService implements Serializable {
    public static final List<TestObject> LIST = initList();
    private static final String LONG_NAME = "This is a long text which doesn't fit inside a datatable cell, so it should be split into multiple lines.";

    private static List<TestObject> initList() {
        return IntStream.rangeClosed(1,500).mapToObj(i->new TestObject(LONG_NAME + i)).collect(Collectors.toList());
    }
}
