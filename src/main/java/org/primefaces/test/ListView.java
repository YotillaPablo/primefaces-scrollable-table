package org.primefaces.test;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.util.List;

import static org.primefaces.test.TestService.LIST;

@ViewScoped
@Named
public class ListView implements Serializable {


    private List<TestObject> items;

    @PostConstruct
    public void init(){
        items = LIST;
    }
    public List<TestObject> getItems() {
        return items;
    }

    public void setItems(List<TestObject> items) {
        this.items = items;
    }
}
