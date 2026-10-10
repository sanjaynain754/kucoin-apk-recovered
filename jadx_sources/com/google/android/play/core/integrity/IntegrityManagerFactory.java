package com.google.android.play.core.integrity;

import android.content.Context;
import androidx.annotation.NonNull;

/* JADX INFO: compiled from: com.google.android.play:integrity@@1.3.0 */
/* JADX INFO: loaded from: classes45.dex */
public class IntegrityManagerFactory {
    private IntegrityManagerFactory() {
    }

    @NonNull
    public static IntegrityManager create(Context context) {
        return C7800z.m13271a(context).m13268a();
    }

    @NonNull
    public static StandardIntegrityManager createStandard(Context context) {
        return C7749ax.m13237a(context).mo13236a();
    }
}
