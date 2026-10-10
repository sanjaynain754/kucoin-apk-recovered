package com.google.android.gms.internal.auth;

/* JADX INFO: compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* JADX INFO: loaded from: classes45.dex */
final class zzdf extends zzdh {
    static final zzdf zza = new zzdf();

    @Override // com.google.android.gms.internal.auth.zzdh
    public final boolean zzb() {
        return false;
    }

    public final boolean equals(Object obj) {
        return obj == this;
    }

    public final String toString() {
        return "Optional.absent()";
    }

    @Override // com.google.android.gms.internal.auth.zzdh
    public final Object zza() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    private zzdf() {
    }

    public final int hashCode() {
        return 2040732332;
    }
}
