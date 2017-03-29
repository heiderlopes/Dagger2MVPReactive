package br.com.heiderlopes.dagger2mvpreactive;

import android.app.Application;

import br.com.heiderlopes.dagger2mvpreactive.data.component.DaggerNetComponent;
import br.com.heiderlopes.dagger2mvpreactive.data.component.NetComponent;
import br.com.heiderlopes.dagger2mvpreactive.data.module.AppModule;
import br.com.heiderlopes.dagger2mvpreactive.data.module.NetModule;

public class App extends Application {
    private NetComponent mNetComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        mNetComponent = DaggerNetComponent.builder()
                .appModule(new AppModule(this))
                .netModule(new NetModule("http://jsonplaceholder.typicode.com/"))
                .build();
    }

    public NetComponent getNetComponent() {
        return mNetComponent;
    }
}