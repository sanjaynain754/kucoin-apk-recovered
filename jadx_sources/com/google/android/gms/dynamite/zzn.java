package com.google.android.gms.dynamite;

import android.content.Context;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.5.0 */
/* JADX INFO: loaded from: classes45.dex */
final class zzn implements DynamiteModule.VersionPolicy.IVersions {
    private final int zza;

    @Override // com.google.android.gms.dynamite.DynamiteModule.VersionPolicy.IVersions
    public final int zzb(Context context, String str, boolean z11) {
        return 0;
    }

    @Override // com.google.android.gms.dynamite.DynamiteModule.VersionPolicy.IVersions
    public final int zza(Context context, String str) {
        return this.zza;
    }

    public zzn(int i11, int i12) {
        this.zza = i11;
    }
}
