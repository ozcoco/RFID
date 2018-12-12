package com.rfid.rest;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.rfid.network.HttpUtils;

public class RestFactory {

    @NonNull
    public static <T> T getWebService(Class<T> serviceClass) {
        return HttpUtils.INSTANCE.getRetrofit().create(serviceClass);
    }

}
