package com.jordilucas.marvelapp.framework.network.response

import com.google.gson.annotations.SerializedName

/**
 * Created by Jordi Lucas on 08/05/2022.
 */
data class DataWrapperResponse(
    @SerializedName("copyright")
    val copyright: String,
    @SerializedName("data")
    val data: DataContainerResponse
)
