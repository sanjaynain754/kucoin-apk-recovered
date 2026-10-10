package com.google.android.play.integrity.internal;

import android.content.Context;

/* JADX INFO: renamed from: com.google.android.play.integrity.internal.ag */
/* JADX INFO: compiled from: com.google.android.play:integrity@@1.3.0 */
/* JADX INFO: loaded from: classes45.dex */
public final class C7812ag {
    /* JADX INFO: renamed from: a */
    public static Context m13298a(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            return applicationContext;
        }
        return context;
    }
}
