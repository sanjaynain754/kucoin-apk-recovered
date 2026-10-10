package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@22.5.0 */
/* JADX INFO: loaded from: classes45.dex */
final class zznz extends zzod {
    public zznz() {
        super(null);
    }

    @Override // com.google.android.gms.internal.measurement.zzod
    public final void zza() {
        if (!zzb()) {
            for (int i11 = 0; i11 < zzc(); i11++) {
                Map.Entry entryZzd = zzd(i11);
                if (((zzlu) ((zzoa) entryZzd).zza()).zzd()) {
                    entryZzd.setValue(Collections.unmodifiableList((List) entryZzd.getValue()));
                }
            }
            for (Map.Entry entry : zze()) {
                if (((zzlu) entry.getKey()).zzd()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.zza();
    }
}
