package com.google.android.gms.internal.common;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.5.0 */
/* JADX INFO: loaded from: classes45.dex */
final class zzai extends zzad {
    private final zzak zza;

    @Override // com.google.android.gms.internal.common.zzad
    public final Object zza(int i11) {
        return this.zza.get(i11);
    }

    public zzai(zzak zzakVar, int i11) {
        super(zzakVar.size(), i11);
        this.zza = zzakVar;
    }
}
