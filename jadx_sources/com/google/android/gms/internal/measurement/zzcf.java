package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.common.base.Preconditions;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@22.5.0 */
/* JADX INFO: loaded from: classes45.dex */
public final class zzcf {
    private static final ThreadLocal zza = new zzce();

    public static SharedPreferences zza(Context context, String str, int i11, zzca zzcaVar) {
        zzcd zzcdVar;
        zzbv.zza();
        if (str.equals("")) {
            zzcdVar = new zzcd();
        } else {
            zzcdVar = null;
        }
        if (zzcdVar != null) {
            return zzcdVar;
        }
        ThreadLocal threadLocal = zza;
        Preconditions.checkArgument(((Boolean) threadLocal.get()).booleanValue());
        threadLocal.set(Boolean.FALSE);
        try {
            return context.getSharedPreferences(str, 0);
        } finally {
            zza.set(Boolean.TRUE);
        }
    }
}
