package com.example.duyle.demoretrofit

import com.example.duyle.demoretrofit.model.DanhSachChuyenDi
import com.example.duyle.demoretrofit.model.User
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

/**
 * Created by duyle on 9/26/18.
 */
interface ApiClient {

    @GET("user/{id}")
    fun getSpecificUser(@Path("id") id: Int): Call<User>

}