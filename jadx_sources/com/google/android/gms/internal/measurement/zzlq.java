package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@22.5.0 */
/* JADX INFO: loaded from: classes45.dex */
public final class zzlq {
    static final zzlq zza = new zzlq(true);
    public static final /* synthetic */ int zzb = 0;
    private static volatile boolean zzc;
    private static volatile zzlq zzd;
    private final Map zze;

    public zzlq() {
        this.zze = new HashMap();
    }

    public zzlq(boolean z11) {
        this.zze = Collections.EMPTY_MAP;
    }

    public static zzlq zza() {
        zzlq zzlqVar = zzd;
        if (zzlqVar != null) {
            return zzlqVar;
        }
        synchronized (zzlq.class) {
            try {
                zzlq zzlqVar2 = zzd;
                if (zzlqVar2 != null) {
                    return zzlqVar2;
                }
                int i11 = zznt.zza;
                zzlq zzlqVarZzb = zzly.zzb(zzlq.class);
                zzd = zzlqVarZzb;
                return zzlqVarZzb;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final zzmd zzb(zznl zznlVar, int i11) {
        return (zzmd) this.zze.get(new zzlp(zznlVar, i11));
    }
}
