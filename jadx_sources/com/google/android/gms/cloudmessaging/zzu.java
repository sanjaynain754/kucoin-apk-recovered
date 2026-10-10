package com.google.android.gms.cloudmessaging;

import android.os.Bundle;

/* JADX INFO: compiled from: com.google.android.gms:play-services-cloud-messaging@@17.2.0 */
/* JADX INFO: loaded from: classes.dex */
final class zzu extends zzs {
    @Override // com.google.android.gms.cloudmessaging.zzs
    public final boolean zzb() {
        return false;
    }

    @Override // com.google.android.gms.cloudmessaging.zzs
    public final void zza(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("data");
        if (bundle2 == null) {
            bundle2 = Bundle.EMPTY;
        }
        zzd(bundle2);
    }

    public zzu(int i11, int i12, Bundle bundle) {
        super(i11, i12, bundle);
    }
}
