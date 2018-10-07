package com.example.duyle.demoretrofit

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName



/**
 * Created by duyle on 10/1/18.
 */
class Skill {
    @SerializedName("id")
    @Expose
    internal var id: String? = null

    @SerializedName("name")
    @Expose
    internal var name: Any? = null

    @SerializedName("created_at")
    @Expose
    internal var createdAt: String? = null

    @SerializedName("updated_at")
    @Expose
    internal var updatedAt: String? = null
}