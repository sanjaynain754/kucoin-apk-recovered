package com.google.android.gms.internal.mlkit_common;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: com.google.mlkit:common@@18.11.0 */
/* JADX INFO: loaded from: classes.dex */
final class zzan extends zzaj {
    private final transient zzai zza;
    private final transient Object[] zzb;
    private final transient int zzc;

    @Override // com.google.android.gms.internal.mlkit_common.zzab, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.zza.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzaj
    public final zzaf zzg() {
        return new zzam(this);
    }

    public zzan(zzai zzaiVar, Object[] objArr, int i11, int i12) {
        this.zza = zzaiVar;
        this.zzb = objArr;
        this.zzc = i12;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzaj, com.google.android.gms.internal.mlkit_common.zzab, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return zzf().listIterator(0);
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzab
    public final int zza(Object[] objArr, int i11) {
        return zzf().zza(objArr, 0);
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzaj, com.google.android.gms.internal.mlkit_common.zzab
    /* JADX INFO: renamed from: zzd */
    public final zzas iterator() {
        return zzf().listIterator(0);
    }
}
