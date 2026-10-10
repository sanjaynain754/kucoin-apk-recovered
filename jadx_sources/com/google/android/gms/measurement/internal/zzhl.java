package com.google.android.gms.measurement.internal;

import androidx.collection.LruCache;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@22.5.0 */
/* JADX INFO: loaded from: classes45.dex */
final class zzhl extends LruCache {
    final /* synthetic */ zzhs zza;

    @Override // androidx.collection.LruCache
    public final /* bridge */ /* synthetic */ Object create(Object obj) {
        String str = (String) obj;
        Preconditions.checkNotEmpty(str);
        return this.zza.zzC(str);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzhl(zzhs zzhsVar, int i11) {
        super(20);
        Objects.requireNonNull(zzhsVar);
        this.zza = zzhsVar;
    }
}
