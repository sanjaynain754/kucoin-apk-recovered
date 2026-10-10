package com.google.android.gms.internal.measurement;

import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@22.5.0 */
/* JADX INFO: loaded from: classes45.dex */
public final class zzpb implements Supplier {
    private static final zzpb zza = new zzpb();
    private final Supplier zzb = Suppliers.ofInstance(new zzpd());

    public static long zza() {
        return zza.get().zza();
    }

    @Override // com.google.common.base.Supplier
    /* JADX INFO: renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final zzpc get() {
        return (zzpc) this.zzb.get();
    }
}
