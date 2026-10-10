package com.google.android.gms.internal.location;

/* JADX INFO: compiled from: com.google.android.gms:play-services-location@@18.0.0 */
/* JADX INFO: loaded from: classes45.dex */
final class zzbq<E> extends zzbo<E> {
    private final zzbs<E> zza;

    @Override // com.google.android.gms.internal.location.zzbo
    public final E zza(int i11) {
        return this.zza.get(i11);
    }

    public zzbq(zzbs<E> zzbsVar, int i11) {
        super(zzbsVar.size(), i11);
        this.zza = zzbsVar;
    }
}
