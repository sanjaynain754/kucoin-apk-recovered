package com.geetest.gtc4;

import android.content.Context;

/* JADX INFO: loaded from: classes45.dex */
public final class Core {
    public static native String getData(Context context);

    public static native String getData(Context context, GeeGuardConfiguration geeGuardConfiguration);

    static {
        System.loadLibrary("gtc4core");
    }
}
