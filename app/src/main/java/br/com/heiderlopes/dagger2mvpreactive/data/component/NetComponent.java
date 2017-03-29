package br.com.heiderlopes.dagger2mvpreactive.data.component;

import javax.inject.Singleton;

import br.com.heiderlopes.dagger2mvpreactive.data.module.AppModule;
import br.com.heiderlopes.dagger2mvpreactive.data.module.NetModule;
import dagger.Component;
import retrofit2.Retrofit;

@Singleton
@Component(modules = {AppModule.class, NetModule.class})
public interface NetComponent {
    Retrofit retrofit();
}