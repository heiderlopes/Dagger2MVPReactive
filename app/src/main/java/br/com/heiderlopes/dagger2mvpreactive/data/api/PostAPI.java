package br.com.heiderlopes.dagger2mvpreactive.data.api;

import java.util.List;

import br.com.heiderlopes.dagger2mvpreactive.data.model.Post;
import retrofit2.http.GET;
import rx.Observable;

public interface PostAPI {
    @GET("/posts")
    Observable<List<Post>> getPostList();
}
