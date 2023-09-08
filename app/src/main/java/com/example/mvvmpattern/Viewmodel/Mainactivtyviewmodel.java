package com.example.mvvmpattern.Viewmodel;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.mvvmpattern.Model.Userparammodel;
import com.example.mvvmpattern.Model.Userresponsemodel;
import com.example.mvvmpattern.Retrofit.Apiinterface;
import com.example.mvvmpattern.Retrofit.Retrofitinstance;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Mainactivtyviewmodel extends ViewModel {

    public static MutableLiveData<Userresponsemodel> getuserresponsemodel;

    public Mainactivtyviewmodel() {
        getuserresponsemodel = new MutableLiveData<>();
    }

    public MutableLiveData<Userresponsemodel> getlogin() {
        return getuserresponsemodel;
    }

    public  void createnewuser(Userparammodel user) {
        Apiinterface apiinterface = Retrofitinstance.getRetrofitUrl().create(Apiinterface.class);
        Call<Userresponsemodel> call = apiinterface.getfromuser(user);
        call.enqueue(new Callback<Userresponsemodel>() {
            @Override
            public void onResponse(Call<Userresponsemodel> call, Response<Userresponsemodel> response) {
                if (response.isSuccessful()) {
                    getuserresponsemodel.postValue(null);
                } else {
                    getuserresponsemodel.postValue(null);
                }
            }

            @Override
            public void onFailure(Call<Userresponsemodel> call, Throwable t) {


            }
        });

    }


}
