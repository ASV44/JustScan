package com.example.hackintosh.justscan;

import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;

/**
 * Created by hackintosh on 6/24/17.
 */

public interface Service {
    @Multipart
    @POST("api/v1/upload")
    //@POST("/upload")
    Call<ResponseBody> postImage(@Part MultipartBody.Part image, @Part("name") RequestBody name);
}