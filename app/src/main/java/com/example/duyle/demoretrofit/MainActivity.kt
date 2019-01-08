package com.example.duyle.demoretrofit

import android.databinding.DataBindingUtil
import android.os.Bundle
import android.os.Handler
import android.support.v7.app.AppCompatActivity
import android.text.TextUtils
import android.util.Log
import com.example.duyle.demoretrofit.databinding.ActivityMainBinding
import com.example.duyle.demoretrofit.model.User
import io.reactivex.Observable
import io.reactivex.Observer
import io.reactivex.Scheduler
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.Disposable
import io.reactivex.functions.Consumer
import io.reactivex.schedulers.Schedulers
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import java.util.concurrent.Callable

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivityMainBinding = DataBindingUtil.setContentView(
                this, R.layout.activity_main)

        binding.isVisible = true
        try {
            val apiClient = MainApplication.clientHomePage?.create(ApiClient::class.java)
            apiClient!!
                    .getSpecificUser(1)
                    .subscribeOn(Schedulers.io())
                    .observeOn(AndroidSchedulers.mainThread())
                    .subscribe(
                            {user ->
                                binding.user = user
                                Handler()
                                        .postDelayed({ binding.isVisible = false }, 2000)
                                },
                            {t -> t.printStackTrace()}
                    )
        } catch (e: Exception) {
            print("Dang-co-loi $e")
        }

        val observable = Observable
                .just("Hello world", " Ahihi", " Testabc!123")
                .map { it -> "$it-used to map " }

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

}
