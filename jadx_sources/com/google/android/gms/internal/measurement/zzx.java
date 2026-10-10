package com.google.android.gms.internal.measurement;

import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@22.5.0 */
/* JADX INFO: loaded from: classes45.dex */
final class zzx extends zzai {
    @Override // com.google.android.gms.internal.measurement.zzai
    public final zzao zza(zzg zzgVar, List list) {
        return new zzah(Double.valueOf(0.0d));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzx(zzy zzyVar, String str) {
        super("getVersion");
        Objects.requireNonNull(zzyVar);
    }
}
