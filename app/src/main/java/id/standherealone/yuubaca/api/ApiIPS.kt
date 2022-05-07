package id.standherealone.yuubaca.api

import id.standherealone.yuubaca.model.Buku
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

interface ApiIPS {

    @GET("data-api-ips.php")
    fun getBuku() : Call<List<Buku>>

    companion object {

        var BASE_URL = "https://proyek.luckytruedev.com/yuubaca/public/api/"

        fun create() : ApiIPS {

            val retrofit = Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl(BASE_URL)
                .build()
            return retrofit.create(ApiIPS::class.java)

        }
    }
}