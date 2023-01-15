package com.jordilucas.marvelapp.framework.network.response

import com.google.gson.annotations.SerializedName

/**
 * Created by Jordi Lucas on 08/05/2022.
 */
data class ThumbnailResponse(
    @SerializedName("path")
    val path: String ,
    @SerializedName("extension")
    val extension: String
)
