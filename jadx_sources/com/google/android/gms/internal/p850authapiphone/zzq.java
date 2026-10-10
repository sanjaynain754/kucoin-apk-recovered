package com.google.android.gms.internal.p850authapiphone;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: compiled from: com.google.android.gms:play-services-auth-api-phone@@18.0.2 */
/* JADX INFO: loaded from: classes45.dex */
final class zzq extends zzf {
    final /* synthetic */ TaskCompletionSource zza;

    public zzq(zzr zzrVar, TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.p850authapiphone.zzg
    public final void zzb(Status status, boolean z11) {
        TaskUtil.setResultOrApiException(status, Boolean.valueOf(z11), this.zza);
    }
}
