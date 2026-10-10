package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.kubi.kumex.data.market.model.FundingRateEntity;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@22.5.0 */
/* JADX INFO: loaded from: classes.dex */
final class zzof {
    private final Clock zza;
    private long zzb;

    public final void zza() {
        this.zzb = this.zza.elapsedRealtime();
    }

    public final void zzb() {
        this.zzb = 0L;
    }

    public final boolean zzc(long j11) {
        return this.zzb == 0 || this.zza.elapsedRealtime() - this.zzb >= FundingRateEntity.MILLIS_PER_HOUR;
    }

    public zzof(Clock clock) {
        Preconditions.checkNotNull(clock);
        this.zza = clock;
    }
}
