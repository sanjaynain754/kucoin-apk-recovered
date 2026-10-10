package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@22.5.0 */
/* JADX INFO: loaded from: classes45.dex */
final class zzov implements zzgv {
    final /* synthetic */ String zza;
    final /* synthetic */ List zzb;
    final /* synthetic */ zzpf zzc;

    public zzov(zzpf zzpfVar, String str, List list) {
        this.zza = str;
        this.zzb = list;
        Objects.requireNonNull(zzpfVar);
        this.zzc = zzpfVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzgv
    public final void zza(String str, int i11, Throwable th2, byte[] bArr, Map map) {
        this.zzc.zzU(true, i11, th2, bArr, this.zza, this.zzb);
    }
}
