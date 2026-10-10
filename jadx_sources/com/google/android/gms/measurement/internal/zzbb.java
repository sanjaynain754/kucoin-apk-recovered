package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Iterator;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@22.5.0 */
/* JADX INFO: loaded from: classes45.dex */
public final class zzbb {
    final String zza;
    final String zzb;
    final String zzc;
    final long zzd;
    final long zze;
    final zzbe zzf;

    public zzbb(zzib zzibVar, String str, String str2, String str3, long j11, long j12, Bundle bundle) {
        zzbe zzbeVar;
        Preconditions.checkNotEmpty(str2);
        Preconditions.checkNotEmpty(str3);
        this.zza = str2;
        this.zzb = str3;
        this.zzc = true == TextUtils.isEmpty(str) ? null : str;
        this.zzd = j11;
        this.zze = j12;
        if (j12 != 0 && j12 > j11) {
            zzibVar.zzaV().zze().zzb("Event created with reverse previous/current timestamps. appId", zzgt.zzl(str2));
        }
        if (bundle == null || bundle.isEmpty()) {
            zzbeVar = new zzbe(new Bundle());
        } else {
            Bundle bundle2 = new Bundle(bundle);
            Iterator<String> it = bundle2.keySet().iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (next == null) {
                    zzibVar.zzaV().zzb().zza("Param name can't be null");
                    it.remove();
                } else {
                    Object objZzE = zzibVar.zzk().zzE(next, bundle2.get(next));
                    if (objZzE == null) {
                        zzibVar.zzaV().zze().zzb("Param value can't be null", zzibVar.zzl().zzb(next));
                        it.remove();
                    } else {
                        zzibVar.zzk().zzM(bundle2, next, objZzE);
                    }
                }
            }
            zzbeVar = new zzbe(bundle2);
        }
        this.zzf = zzbeVar;
    }

    public final String toString() {
        String string = this.zzf.toString();
        String str = this.zza;
        int length = String.valueOf(str).length();
        String str2 = this.zzb;
        StringBuilder sb2 = new StringBuilder(length + 22 + String.valueOf(str2).length() + 10 + string.length() + 1);
        sb2.append("Event{appId='");
        sb2.append(str);
        sb2.append("', name='");
        sb2.append(str2);
        sb2.append("', params=");
        sb2.append(string);
        sb2.append("}");
        return sb2.toString();
    }

    public final zzbb zza(zzib zzibVar, long j11) {
        return new zzbb(zzibVar, this.zzc, this.zza, this.zzb, this.zzd, j11, this.zzf);
    }

    private zzbb(zzib zzibVar, String str, String str2, String str3, long j11, long j12, zzbe zzbeVar) {
        Preconditions.checkNotEmpty(str2);
        Preconditions.checkNotEmpty(str3);
        Preconditions.checkNotNull(zzbeVar);
        this.zza = str2;
        this.zzb = str3;
        this.zzc = true == TextUtils.isEmpty(str) ? null : str;
        this.zzd = j11;
        this.zze = j12;
        if (j12 != 0 && j12 > j11) {
            zzibVar.zzaV().zze().zzc("Event created with reverse previous/current timestamps. appId, name", zzgt.zzl(str2), zzgt.zzl(str3));
        }
        this.zzf = zzbeVar;
    }
}
