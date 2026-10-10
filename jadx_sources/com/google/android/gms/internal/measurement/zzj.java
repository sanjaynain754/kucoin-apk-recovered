package com.google.android.gms.internal.measurement;

import com.google.common.annotations.VisibleForTesting;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@22.5.0 */
/* JADX INFO: loaded from: classes45.dex */
public final class zzj {

    @VisibleForTesting
    final Map zza = new HashMap();

    public final void zza(String str, Callable callable) {
        this.zza.put(str, callable);
    }
}
