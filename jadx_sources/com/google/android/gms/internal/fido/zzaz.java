package com.google.android.gms.internal.fido;

/* JADX INFO: compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
/* JADX INFO: loaded from: classes45.dex */
final class zzaz extends zzbl {
    static final zzaz zza = new zzaz();

    @Override // com.google.android.gms.internal.fido.zzbl
    public final boolean zzb() {
        return false;
    }

    public final boolean equals(Object obj) {
        return obj == this;
    }

    public final String toString() {
        return "Optional.absent()";
    }

    @Override // com.google.android.gms.internal.fido.zzbl
    public final Object zza() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    private zzaz() {
    }

    public final int hashCode() {
        return 2040732332;
    }
}
