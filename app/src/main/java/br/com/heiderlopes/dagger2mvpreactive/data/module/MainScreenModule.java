package br.com.heiderlopes.dagger2mvpreactive.data.module;

import br.com.heiderlopes.dagger2mvpreactive.mainscreen.MainScreenContract;
import br.com.heiderlopes.dagger2mvpreactive.util.CustomScope;
import dagger.Module;
import dagger.Provides;

@Module
public class MainScreenModule {
    private final MainScreenContract.View mView;


    public MainScreenModule(MainScreenContract.View mView) {
        this.mView = mView;
    }

    @Provides
    @CustomScope
    MainScreenContract.View providesMainScreenContractView() {
        return mView;
    }
}
