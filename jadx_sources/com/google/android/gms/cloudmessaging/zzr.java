package com.google.android.gms.cloudmessaging;

import android.os.Bundle;

/* JADX INFO: compiled from: com.google.android.gms:play-services-cloud-messaging@@17.2.0 */
/* JADX INFO: loaded from: classes45.dex */
final class zzr extends zzs {
    @Override // com.google.android.gms.cloudmessaging.zzs
    public final boolean zzb() {
        return true;
    }

    @Override // com.google.android.gms.cloudmessaging.zzs
    public final void zza(Bundle bundle) {
        if (bundle.getBoolean("ack", false)) {
            zzd(null);
        } else {
            zzc(new zzt(4, "Invalid response to one way request", null));
        }
    }

    public zzr(int i11, int i12, Bundle bundle) {
        super(i11, i12, bundle);
    }
}
