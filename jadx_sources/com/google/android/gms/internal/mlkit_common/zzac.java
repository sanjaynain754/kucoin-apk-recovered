package com.google.android.gms.internal.mlkit_common;

import java.util.Arrays;

/* JADX INFO: compiled from: com.google.mlkit:common@@18.11.0 */
/* JADX INFO: loaded from: classes45.dex */
public final class zzac extends zzz {
    public zzac() {
        super(4);
    }

    public final zzaf zzc() {
        this.zzc = true;
        return zzaf.zzg(this.zza, this.zzb);
    }

    public final zzac zzb(Object obj) {
        obj.getClass();
        int i11 = this.zzb + 1;
        Object[] objArr = this.zza;
        int length = objArr.length;
        if (length < i11) {
            this.zza = Arrays.copyOf(objArr, zzaa.zza(length, i11));
            this.zzc = false;
        } else if (this.zzc) {
            this.zza = (Object[]) objArr.clone();
            this.zzc = false;
        }
        Object[] objArr2 = this.zza;
        int i12 = this.zzb;
        this.zzb = i12 + 1;
        objArr2[i12] = obj;
        return this;
    }
}
