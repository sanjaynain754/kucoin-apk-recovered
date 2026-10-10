package com.google.android.gms.internal.fido;

import java.io.Serializable;
import java.util.Arrays;

/* JADX INFO: compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
/* JADX INFO: loaded from: classes45.dex */
final class zzbs implements Serializable, zzbp {
    final Object zza;

    public final boolean equals(Object obj) {
        if (obj instanceof zzbs) {
            return zzbk.zza(this.zza, ((zzbs) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza});
    }

    public final String toString() {
        return "Suppliers.ofInstance(" + this.zza.toString() + ")";
    }

    @Override // com.google.android.gms.internal.fido.zzbp
    public final Object zza() {
        return this.zza;
    }

    public zzbs(Object obj) {
        this.zza = obj;
    }
}
