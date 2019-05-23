package com.example.androidretrofit.ClientToServer;

import com.example.androidretrofit.Model.ModelInformation;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.POST;

public interface ApiInterface {

    @POST("readprojectinfo.php")
    Call<List<ModelInformation>> getprojectinfo();

}
