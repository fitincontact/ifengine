package org.fitin.ifengine;

import com.google.inject.Singleton;
import org.fitin.ifengine.api.IFEngine;

import static org.fitin.ifengine.service.InjectorProvider.getInstance;

@Singleton
public class FirstService implements IFEngine {
    SecondService secondService = getInstance(SecondService.class);
    private MyData myData;

    @Override
    public MyData getMayData() {
        MyData myData1 = new MyData();
        this.myData = myData1;
        return myData1;
    }

    @Override
    public void start() {
        secondService.run(this.myData);
    }
}
