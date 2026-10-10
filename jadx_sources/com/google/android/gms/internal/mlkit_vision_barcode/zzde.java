package com.google.android.gms.internal.mlkit_vision_barcode;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Set;

/* JADX INFO: compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.3.1 */
/* JADX INFO: loaded from: classes45.dex */
abstract class zzde extends AbstractMap {
    private transient Set zza;
    private transient Set zzb;
    private transient Collection zzc;

    public abstract Set zzb();

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        Set set = this.zza;
        if (set != null) {
            return set;
        }
        Set setZzb = zzb();
        this.zza = setZzb;
        return setZzb;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set keySet() {
        Set set = this.zzb;
        if (set != null) {
            return set;
        }
        zzdc zzdcVar = new zzdc(this);
        this.zzb = zzdcVar;
        return zzdcVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        Collection collection = this.zzc;
        if (collection != null) {
            return collection;
        }
        zzdd zzddVar = new zzdd(this);
        this.zzc = zzddVar;
        return zzddVar;
    }
}
