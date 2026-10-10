package com.google.android.gms.internal.measurement;

import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@22.5.0 */
/* JADX INFO: loaded from: classes45.dex */
public final class zzpn implements Supplier {
    private static final zzpn zza = new zzpn();
    private final Supplier zzb = Suppliers.ofInstance(new zzpp());

    public static boolean zza() {
        zza.get().zza();
        return true;
    }

    public static boolean zzb() {
        return zza.get().zzb();
    }

    public static boolean zzc() {
        return zza.get().zzc();
    }

    @Override // com.google.common.base.Supplier
    /* JADX INFO: renamed from: zzd, reason: merged with bridge method [inline-methods] */
    public final zzpo get() {
        return (zzpo) this.zzb.get();
    }
}
