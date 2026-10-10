package com.google.android.gms.internal.auth;

import android.util.Log;

/* JADX INFO: compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* JADX INFO: loaded from: classes45.dex */
final class zzcx extends zzdc {
    public zzcx(zzcz zzczVar, String str, Double d11, boolean z11) {
        super(zzczVar, str, d11, true, null);
    }

    @Override // com.google.android.gms.internal.auth.zzdc
    public final /* synthetic */ Object zza(Object obj) {
        try {
            return Double.valueOf(Double.parseDouble((String) obj));
        } catch (NumberFormatException unused) {
            Log.e("PhenotypeFlag", "Invalid double value for " + this.zzc + ": " + ((String) obj));
            return null;
        }
    }
}
