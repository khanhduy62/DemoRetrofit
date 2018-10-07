package com.example.duyle.demoretrofit.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.math.BigInteger


/**
 * Created by duyle on 10/6/18.
 */
class DanhSachChuyenDi {
    @SerializedName("id")
    @Expose
    internal var id: Int? = null

    @SerializedName("createdAt")
    @Expose
    internal var createdAt: BigInteger? = null

    @SerializedName("updatedAt")
    @Expose
    internal var updatedAt: BigInteger? = null

    @SerializedName("diaChiBatDau")
    @Expose
    internal var diaChiBatDau: String? = null

    @SerializedName("diaChiKetThuc")
    @Expose
    internal var diaChiKetThuc: String? = null

    @SerializedName("soTien")
    @Expose
    internal var soTien: Int? = null

    @SerializedName("ngay")
    @Expose
    internal var ngay: String? = null

    @SerializedName("user")
    @Expose
    internal var user: Int? = null
}