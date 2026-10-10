package com.google.android.gms.internal.mlkit_common;

import com.tencent.bugly.proguard.C33786m2;

/* JADX INFO: compiled from: com.google.mlkit:common@@18.11.0 */
/* JADX INFO: loaded from: classes45.dex */
final class zzrs extends zzsa {
    private String zza;
    private boolean zzb;
    private int zzc;
    private byte zzd;

    @Override // com.google.android.gms.internal.mlkit_common.zzsa
    public final zzsa zza(boolean z11) {
        this.zzb = true;
        this.zzd = (byte) (1 | this.zzd);
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzsa
    public final zzsa zzb(int i11) {
        this.zzc = 1;
        this.zzd = (byte) (this.zzd | 2);
        return this;
    }

    public final zzsa zzc(String str) {
        this.zza = C33786m2.f70892t;
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzsa
    public final zzsb zzd() {
        String str;
        if (this.zzd == 3 && (str = this.zza) != null) {
            return new zzru(str, this.zzb, this.zzc, null);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.zza == null) {
            sb2.append(" libraryName");
        }
        if ((this.zzd & 1) == 0) {
            sb2.append(" enableFirelog");
        }
        if ((this.zzd & 2) == 0) {
            sb2.append(" firelogEventType");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
    }
}
