package com.example.pranav.allinone;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface Api {
//https://newsapi.org/v2/everything?domains=wsj.com&apiKey=a5b563d244c844d1b3caddd914b96b75


    @GET("top-headlines")
    Call<ModelList> getData(
            @Query("sources") String sources,
            @Query("apiKey") String apiKey

    );
}
