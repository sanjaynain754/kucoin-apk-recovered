package com.google.android.gms.internal.measurement;

import android.util.Log;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@22.5.0 */
/* JADX INFO: loaded from: classes.dex */
final class zzkb extends zzkl {
    public zzkb(zzkf zzkfVar, String str, Long l11, boolean z11) {
        super(zzkfVar, str, l11, true, null);
    }

    @Override // com.google.android.gms.internal.measurement.zzkl
    public final /* synthetic */ Object zza(Object obj) {
        if (obj instanceof Long) {
            return (Long) obj;
        }
        if (obj instanceof String) {
            try {
                return Long.valueOf(Long.parseLong((String) obj));
            } catch (NumberFormatException unused) {
            }
        }
        String str = this.zzb;
        String string = obj.toString();
        StringBuilder sb2 = new StringBuilder(str.length() + 25 + string.length());
        sb2.append("Invalid long value for ");
        sb2.append(str);
        sb2.append(": ");
        sb2.append(string);
        Log.e("PhenotypeFlag", sb2.toString());
        return null;
    }
}
