package com.example.duyle.demoretrofit

import android.app.Application
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

/**
 * Created by duyle on 9/26/18.
 */
class MainApplication: Application() {

    companion object {
        var clientHomePage: Retrofit ?= null
    }

    override fun onCreate() {
        super.onCreate()

        clientHomePage = Retrofit.Builder()
                .baseUrl("http://172.16.25.127:1337/")
                .addConverterFactory(GsonConverterFactory.create())
                .build()
    }
}