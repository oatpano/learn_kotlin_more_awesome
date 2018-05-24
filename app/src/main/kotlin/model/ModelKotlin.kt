package model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class ModelKotlin(
        @Expose
        @SerializedName("dataList")
        val datalist: List<Data> = listOf()
)

data class Data (
    @Expose
    @SerializedName("LATITUDE")
    val latitude: Double = 0.0,
    @Expose
    @SerializedName("LONGITUDE")
    val longitude: Double = 0.0,
    @Expose
    @SerializedName("FACILITYID")
    val facilityid: Int = 0,
    @Expose
    @SerializedName("FACILITY_SUBTYPE")
    val facilitySubtype: String = "",
    @Expose
    @SerializedName("WEBLINK")
    val weblink: String = "",
    @Expose
    @SerializedName("FACILITY_TYPE")
    val facilityType: String = "",
    @Expose
    @SerializedName("NAME")
    val name: String = "",
    @Expose
    @SerializedName("LOCATION")
    val location: String = "",
    @Expose
    @SerializedName("json_featuretype")
    val jsonFeaturetype: String = ""
)