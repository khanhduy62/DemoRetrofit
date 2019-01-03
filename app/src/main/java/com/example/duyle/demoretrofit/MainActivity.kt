package com.example.duyle.demoretrofit

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import com.example.duyle.demoretrofit.model.User
import io.reactivex.Observable
import io.reactivex.Observer
import io.reactivex.disposables.Disposable
import io.reactivex.functions.Consumer
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import java.util.concurrent.Callable

class MainActivity : AppCompatActivity(), Callback<User> {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        try {
            val apiClient = MainApplication.clientHomePage?.create(ApiClient::class.java)

            apiClient?.getSpecificUser(1)?.enqueue(this)
        } catch (e: Exception) {
            print("Dang-co-loi $e")
        }

        val observable = Observable.just("Hello world", " Ahihi", " Testabc!123")

        val observer = object: Observer<String> {
            override fun onComplete() {
                Log.d("Observer ", "onCompele")
            }

            override fun onSubscribe(d: Disposable) {
                Log.d("Observer ", "onSubscribe")
            }

            override fun onNext(t: String) {
                Log.d("Observer ", "onNext")
            }

            override fun onError(e: Throwable) {
                Log.d("Observer ", "onError")
            }
        }

        observable.subscribe({
            Log.d("Observer ", "onNext: $it")
        }, {
            Log.d("Observer ", "throwable: $it")
        }, {
            Log.d("Observer ", " done")
        })
    }

    override fun onFailure(call: Call<User>?, t: Throwable?) {
        t?.printStackTrace()
        println("Loi-khi-goi-server ${t?.printStackTrace()}")
    }

    override fun onResponse(call: Call<User>?, response: Response<User>?) {
        println("result::: ${response?.body()?.id} - ${response?.body()?.email} - ${response?.body()?.danhSachChuyenDi?.size}")
    }

}
