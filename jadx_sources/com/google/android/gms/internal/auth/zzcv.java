package com.google.android.gms.internal.auth;

import android.util.Log;

/* JADX INFO: compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* JADX INFO: loaded from: classes45.dex */
final class zzcv extends zzdc {
    public zzcv(zzcz zzczVar, String str, Long l11, boolean z11) {
        super(zzczVar, str, l11, true, null);
    }

    @Override // com.google.android.gms.internal.auth.zzdc
    public final /* synthetic */ Object zza(Object obj) {
        try {
            return Long.valueOf(Long.parseLong((String) obj));
        } catch (NumberFormatException unused) {
            Log.e("PhenotypeFlag", "Invalid long value for " + this.zzc + ": " + ((String) obj));
            return null;
        }
    }
}
