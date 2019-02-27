package com.example.felixits.mytask.services;


import com.example.felixits.mytask.model.MyPojo;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;

public class ApiClient {
    public static String URL="https://api.meetup.com";
    public static APIInterface apiInterface;

    public static APIInterface getClient()
    {
        Retrofit retrofit=new Retrofit.Builder().baseUrl(URL).addConverterFactory(GsonConverterFactory.create()).build();
        apiInterface=retrofit.create(APIInterface.class);
        return apiInterface;
    }
    public interface  APIInterface {

        @GET("/2/groups?lat=51.509980&lon=-0.133700&page=20&key=1f5718c16a7fb3a5452f45193232")
        Call<MyPojo> getPojo();
    }
}
