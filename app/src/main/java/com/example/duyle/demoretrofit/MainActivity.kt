package com.example.duyle.demoretrofit

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.example.duyle.demoretrofit.model.User
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity(), Callback<User> {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val apiClient = MainApplication.clientHomePage?.create(ApiClient::class.java)

        apiClient?.getSpecificUser(6)?.enqueue(this)

    }

    override fun onFailure(call: Call<User>?, t: Throwable?) {
        t?.printStackTrace()
    }

    override fun onResponse(call: Call<User>?, response: Response<User>?) {
        println("result::: ${response?.body()?.id} - ${response?.body()?.email} - ${response?.body()?.danhSachChuyenDi?.size}")
    }

}
