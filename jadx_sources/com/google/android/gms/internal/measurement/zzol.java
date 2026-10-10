package com.google.android.gms.internal.measurement;

import sun.misc.Unsafe;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@22.5.0 */
/* JADX INFO: loaded from: classes45.dex */
final class zzol extends zzon {
    @Override // com.google.android.gms.internal.measurement.zzon
    public final void zza(Object obj, long j11, byte b11) {
        if (zzoo.zzb) {
            zzoo.zzD(obj, j11, b11);
        } else {
            zzoo.zzE(obj, j11, b11);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzon
    public final boolean zzb(Object obj, long j11) {
        return zzoo.zzb ? zzoo.zzu(obj, j11) : zzoo.zzv(obj, j11);
    }

    /* JADX WARN: Failed to inline method: com.google.android.gms.internal.measurement.zzoo.zzw(java.lang.Object, long, boolean):void */
    /* JADX WARN: Failed to inline method: com.google.android.gms.internal.measurement.zzoo.zzx(java.lang.Object, long, boolean):void */
    /* JADX WARN: Failed to replace arg (r3v0 'z' boolean A[IMMUTABLE_TYPE, METHOD_ARGUMENT]) for method inline: com.google.android.gms.internal.measurement.zzoo.zzw(java.lang.Object, long, boolean):void */
    /* JADX WARN: Unknown register number '(r5v0 'z' boolean)' in method call: com.google.android.gms.internal.measurement.zzoo.zzx(java.lang.Object, long, boolean):void */
    @Override // com.google.android.gms.internal.measurement.zzon
    public final void zzc(Object obj, long j11, boolean z11) {
        if (zzoo.zzb) {
            zzoo.zzw(obj, j11, z11);
        } else {
            zzoo.zzx(obj, j11, z11);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzon
    public final float zzd(Object obj, long j11) {
        return Float.intBitsToFloat(this.zza.getInt(obj, j11));
    }

    @Override // com.google.android.gms.internal.measurement.zzon
    public final double zzf(Object obj, long j11) {
        return Double.longBitsToDouble(this.zza.getLong(obj, j11));
    }

    public zzol(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // com.google.android.gms.internal.measurement.zzon
    public final void zze(Object obj, long j11, float f11) {
        this.zza.putInt(obj, j11, Float.floatToIntBits(f11));
    }

    @Override // com.google.android.gms.internal.measurement.zzon
    public final void zzg(Object obj, long j11, double d11) {
        this.zza.putLong(obj, j11, Double.doubleToLongBits(d11));
    }
}
