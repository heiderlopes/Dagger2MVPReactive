package br.com.heiderlopes.dagger2mvpreactive.data.component;

import br.com.heiderlopes.dagger2mvpreactive.data.module.MainScreenModule;
import br.com.heiderlopes.dagger2mvpreactive.mainscreen.MainActivity;
import br.com.heiderlopes.dagger2mvpreactive.util.CustomScope;
import dagger.Component;

@CustomScope
@Component(dependencies = NetComponent.class, modules = MainScreenModule.class)
public interface MainScreenComponent {
    void inject(MainActivity activity);
}