package com.sumsub.sns.internal.core.common;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.core.os.BundleCompat;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.common.b */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public abstract class AbstractC28437b {
    /* JADX INFO: renamed from: a */
    public static final Parcelable m69320a(Bundle bundle, String str, Class cls, Context context) {
        ClassLoader classLoader;
        if (!bundle.containsKey(str)) {
            return null;
        }
        if (context == null || (classLoader = context.getClassLoader()) == null) {
            classLoader = cls.getClassLoader();
        }
        if (classLoader != null) {
            bundle.setClassLoader(classLoader);
        }
        return (Parcelable) BundleCompat.getParcelable(bundle, str, cls);
    }
}
