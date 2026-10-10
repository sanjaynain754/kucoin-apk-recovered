package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@22.5.0 */
/* JADX INFO: loaded from: classes45.dex */
final class zzpc {
    final String zza;
    long zzb;

    public /* synthetic */ zzpc(zzpf zzpfVar, String str, byte[] bArr) {
        this(zzpfVar, str);
    }

    private zzpc(zzpf zzpfVar, String str) {
        Objects.requireNonNull(zzpfVar);
        this.zza = str;
        this.zzb = zzpfVar.zzaZ().elapsedRealtime();
    }

    public /* synthetic */ zzpc(zzpf zzpfVar, byte[] bArr) {
        this(zzpfVar, zzpfVar.zzt().zzaw());
    }
}
