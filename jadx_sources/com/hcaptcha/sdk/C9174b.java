package com.hcaptcha.sdk;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import java.io.Serializable;

/* JADX INFO: renamed from: com.hcaptcha.sdk.b */
/* JADX INFO: loaded from: classes56.dex */
public final class C9174b {
    /* JADX INFO: renamed from: a */
    public static <T extends Parcelable> T m13959a(Bundle bundle, @Nullable String str, Class<T> cls) {
        return Build.VERSION.SDK_INT >= 33 ? (T) bundle.getParcelable(str, cls) : (T) bundle.getParcelable(str);
    }

    /* JADX INFO: renamed from: b */
    public static <T extends Serializable> T m13960b(Bundle bundle, @Nullable String str, Class<T> cls) {
        return Build.VERSION.SDK_INT >= 33 ? (T) bundle.getSerializable(str, cls) : (T) bundle.getSerializable(str);
    }
}
