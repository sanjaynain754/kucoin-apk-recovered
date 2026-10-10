package com.google.android.gms.common;

import java.util.concurrent.Callable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.5.0 */
/* JADX INFO: loaded from: classes45.dex */
final class zzu extends zzw {
    private final Callable zze;

    public /* synthetic */ zzu(Callable callable, zzv zzvVar) {
        super();
        this.zze = callable;
    }

    @Override // com.google.android.gms.common.zzw
    public final String zza() {
        try {
            return (String) this.zze.call();
        } catch (Exception e11) {
            throw new RuntimeException(e11);
        }
    }
}
