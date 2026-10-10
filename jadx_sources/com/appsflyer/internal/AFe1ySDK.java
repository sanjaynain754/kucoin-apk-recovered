package com.appsflyer.internal;

import androidx.annotation.NonNull;
import org.json.JSONException;

/* JADX INFO: loaded from: classes34.dex */
public interface AFe1ySDK<ResponseType> {
    @NonNull
    ResponseType getMonetizationNetwork(String str) throws JSONException;
}
