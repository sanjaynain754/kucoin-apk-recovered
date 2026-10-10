package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@22.5.0 */
/* JADX INFO: loaded from: classes.dex */
final class zzkm implements zzpn {
    final /* synthetic */ zzli zza;

    public zzkm(zzli zzliVar) {
        Objects.requireNonNull(zzliVar);
        this.zza = zzliVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzpn
    public final void zza(String str, String str2, Bundle bundle) {
        if (!TextUtils.isEmpty(str)) {
            this.zza.zzI("auto", "_err", bundle, str);
        } else {
            this.zza.zzB("auto", "_err", bundle);
        }
    }
}
