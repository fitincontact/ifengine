package org.fitin;

import org.fitin.ifengine.FirstService;
import org.fitin.ifengine.MyData;

public class TestMain {
    public static void main(String[] args) {
        MyData myData = new MyData();
        myData.setId(123L);
        FirstService firstService = new FirstService(myData);
        firstService.run();
    }
}
