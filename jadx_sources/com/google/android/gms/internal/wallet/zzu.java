package com.google.android.gms.internal.wallet;

import android.os.Bundle;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: compiled from: com.google.android.gms:play-services-wallet@@19.3.0 */
/* JADX INFO: loaded from: classes45.dex */
final class zzu extends zzt {
    private final TaskCompletionSource zza;

    @Override // com.google.android.gms.internal.wallet.zzt, com.google.android.gms.internal.wallet.zzq
    public final void zzg(int i11, boolean z11, Bundle bundle) {
        TaskUtil.setResultOrApiException(new Status(i11), Boolean.valueOf(z11), this.zza);
    }

    public zzu(TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.wallet.zzt, com.google.android.gms.internal.wallet.zzq
    public final void zzc(Status status, boolean z11, Bundle bundle) {
        TaskUtil.setResultOrApiException(status, Boolean.valueOf(z11), this.zza);
    }
}
