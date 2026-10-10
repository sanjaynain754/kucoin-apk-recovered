package com.google.android.gms.internal.mlkit_vision_barcode;

import java.util.Set;

/* JADX INFO: compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.3.1 */
/* JADX INFO: loaded from: classes.dex */
public abstract class zzcv extends zzcn implements Set {
    private transient zzcs zza;

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzcn, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* JADX INFO: renamed from: zzd */
    public abstract zzdu iterator();

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return zzds.zzb(this, obj);
    }

    public final zzcs zzf() {
        zzcs zzcsVar = this.zza;
        if (zzcsVar != null) {
            return zzcsVar;
        }
        zzcs zzcsVarZzg = zzg();
        this.zza = zzcsVarZzg;
        return zzcsVarZzg;
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        return zzds.zza(this);
    }

    public zzcs zzg() {
        Object[] array = toArray();
        int i11 = zzcs.zzd;
        return zzcs.zzg(array, array.length);
    }
}
