package com.google.android.gms.internal.wallet;

import android.os.Bundle;
import androidx.annotation.Nullable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.wallet.AutoResolveHelper;
import com.google.android.gms.wallet.PaymentData;

/* JADX INFO: compiled from: com.google.android.gms:play-services-wallet@@19.3.0 */
/* JADX INFO: loaded from: classes45.dex */
final class zzx extends zzt {
    private final TaskCompletionSource zza;

    @Override // com.google.android.gms.internal.wallet.zzt, com.google.android.gms.internal.wallet.zzq
    public final void zzf(Status status, @Nullable PaymentData paymentData, Bundle bundle) {
        AutoResolveHelper.zzd(status, paymentData, this.zza);
    }

    public zzx(TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }
}
