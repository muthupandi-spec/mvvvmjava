package com.example.mvvmpattern.Retrofit;

import com.example.mvvmpattern.Model.Userparammodel;
import com.example.mvvmpattern.Model.Userresponsemodel;

import io.reactivex.Flowable;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface Apiinterface {
    @POST("login")
    Call<Userresponsemodel> getfromuser(@Body Userparammodel userparammodel);

}
