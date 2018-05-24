package com.example.oatrice.learnkotlinmoreawesome.utils;

import android.content.Context;
import android.support.annotation.RawRes;

import com.example.oatrice.learnkotlinmoreawesome.R;
import com.example.oatrice.learnkotlinmoreawesome.model.ModelJava;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.Type;

public class GsonJavaUtils {

    public static ModelJava getJsonFixModelClass(Context context, @RawRes int jsonFileRes) {
        Type type = new TypeToken<ModelJava>() {
        }.getType();
        Gson gson = new Gson();
        InputStream inputStream = context.getResources().openRawResource(jsonFileRes);
        BufferedReader bufferReader = new BufferedReader(new InputStreamReader(inputStream));
        return gson.fromJson(bufferReader, type);
    }
}
