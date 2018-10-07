package com.example.duyle.demoretrofit.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.math.BigInteger


/**
 * Created by duyle on 10/6/18.
 */
class User {
    @SerializedName("danhSachChuyenDi")
    @Expose
    internal var danhSachChuyenDi: List<DanhSachChuyenDi>? = null

    @SerializedName("id")
    @Expose
    internal var id: Int? = null

    @SerializedName("createdAt")
    @Expose
    internal var createdAt: BigInteger? = null

    @SerializedName("updatedAt")
    @Expose
    internal var updatedAt: BigInteger? = null

    @SerializedName("email")
    @Expose
    internal var email: String? = null

    @SerializedName("password")
    @Expose
    internal var password: String? = null

    @SerializedName("hinh")
    @Expose
    internal var hinh: String? = null

    @SerializedName("vaitro")
    @Expose
    internal var vaitro: String? = null

    @SerializedName("longitude")
    @Expose
    internal var longitude: Double? = null

    @SerializedName("latitude")
    @Expose
    internal var latitude: Double? = null

    @SerializedName("taikhoan")
    @Expose
    internal var taikhoan: String? = null

    @SerializedName("sosao")
    @Expose
    internal var sosao: Int? = null
}