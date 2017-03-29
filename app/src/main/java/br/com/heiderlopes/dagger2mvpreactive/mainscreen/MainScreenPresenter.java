package br.com.heiderlopes.dagger2mvpreactive.mainscreen;

import java.util.List;

import javax.inject.Inject;

import br.com.heiderlopes.dagger2mvpreactive.data.api.PostAPI;
import br.com.heiderlopes.dagger2mvpreactive.data.model.Post;
import retrofit2.Retrofit;
import rx.Observer;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

public class MainScreenPresenter implements MainScreenContract.Presenter {

    public Retrofit retrofit;
    MainScreenContract.View mView;

    @Inject
    public MainScreenPresenter(Retrofit retrofit, MainScreenContract.View mView) {
        this.retrofit = retrofit;
        this.mView = mView;
    }

    @Override
    public void loadPost() {
        retrofit.create(PostAPI.class).getPostList()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .unsubscribeOn(Schedulers.io())
                .subscribe(new Observer<List<Post>>() {
                    @Override
                    public void onCompleted() {
                        mView.showComplete();
                    }

                    @Override
                    public void onError(Throwable e) {
                        mView.showError(e.getMessage());
                    }

                    @Override
                    public void onNext(List<Post> posts) {
                        mView.showPosts(posts);
                    }
                });

    }
}