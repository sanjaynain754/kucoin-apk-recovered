package com.google.android.gms.internal.auth;

import com.google.android.gms.common.api.Status;

/* JADX INFO: compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* JADX INFO: loaded from: classes45.dex */
final class zzaf extends zzah {
    final /* synthetic */ zzag zza;

    public zzaf(zzag zzagVar) {
        this.zza = zzagVar;
    }

    @Override // com.google.android.gms.internal.auth.zzah, com.google.android.gms.auth.account.zzb
    public final void zzc(boolean z11) {
        this.zza.setResult(new zzak(z11 ? Status.RESULT_SUCCESS : zzal.zza));
    }
}
