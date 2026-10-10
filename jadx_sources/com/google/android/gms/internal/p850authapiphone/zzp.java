package com.google.android.gms.internal.p850authapiphone;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: compiled from: com.google.android.gms:play-services-auth-api-phone@@18.0.2 */
/* JADX INFO: loaded from: classes45.dex */
final class zzp extends zzd {
    final /* synthetic */ TaskCompletionSource zza;

    public zzp(zzr zzrVar, TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.p850authapiphone.zze
    public final void zzb(Status status, int i11) {
        TaskUtil.setResultOrApiException(status, Integer.valueOf(i11), this.zza);
    }
}
