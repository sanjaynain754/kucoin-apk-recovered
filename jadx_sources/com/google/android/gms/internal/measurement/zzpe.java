package com.google.android.gms.internal.measurement;

import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@22.5.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zzpe implements Supplier {
    private static final zzpe zza = new zzpe();
    private final Supplier zzb = Suppliers.ofInstance(new zzpg());

    public static boolean zza() {
        return zza.get().zza();
    }

    public static boolean zzb() {
        return zza.get().zzb();
    }

    @Override // com.google.common.base.Supplier
    /* JADX INFO: renamed from: zzc, reason: merged with bridge method [inline-methods] */
    public final zzpf get() {
        return (zzpf) this.zzb.get();
    }
}
