package br.com.heiderlopes.dagger2mvpreactive.mainscreen;

import java.util.List;

import br.com.heiderlopes.dagger2mvpreactive.data.model.Post;

public interface MainScreenContract {
    interface View {
        void showPosts(List<Post> posts);

        void showError(String message);

        void showComplete();
    }

    interface Presenter {
        void loadPost();
    }
}