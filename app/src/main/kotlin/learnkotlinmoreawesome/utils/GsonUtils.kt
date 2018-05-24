package learnkotlinmoreawesome.utils

import android.content.Context
import android.support.annotation.RawRes
import com.google.gson.Gson
import java.io.BufferedReader
import java.io.InputStreamReader

val gson = Gson()

inline fun <reified T> Context.getJson(@RawRes jsonFileRes: Int): T {
    val inputStream = this.resources.openRawResource(jsonFileRes)
    val bufferReader = BufferedReader(InputStreamReader(inputStream))
    return gson.fromJson(bufferReader, T::class.java)
}