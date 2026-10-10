package com.kubi.advert;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.ranges.RangesKt;

/* JADX INFO: renamed from: com.kubi.advert.s, reason: from Kotlin metadata */
/* JADX INFO: compiled from: AttributionJumpGate.kt */
/* JADX INFO: loaded from: classes62.dex */
@Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\n\u001a\u00020\u000bJ\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000bJ\u0006\u0010\u000f\u001a\u00020\u0004R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\b\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\t¨\u0006\u0010"}, m90084d2 = {"Lcom/kubi/advert/AttributionJumpGate;", "", "elapsedRealtime", "Lkotlin/Function0;", "", "intervalMs", "<init>", "(Lkotlin/jvm/functions/Function0;J)V", "lastSuccessfulJumpAtMs", "Ljava/lang/Long;", "shouldSkip", "", "onNavigationFinished", "", "success", "elapsedSinceLastSuccessfulJump", "AdvertLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class AttributionJumpGate {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final Function0<Long> f15164a;

    /* JADX INFO: renamed from: b */
    public final long f15165b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public Long f15166c;

    /* JADX INFO: renamed from: a */
    public final synchronized long m14805a() {
        long jCoerceAtLeast;
        Long l11 = this.f15166c;
        if (l11 != null) {
            jCoerceAtLeast = RangesKt.coerceAtLeast(this.f15164a.invoke().longValue() - l11.longValue(), 0L);
        } else {
            jCoerceAtLeast = -1;
        }
        return jCoerceAtLeast;
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m14806b(boolean z11) {
        if (z11) {
            this.f15166c = this.f15164a.invoke();
        }
    }

    /* JADX INFO: renamed from: c */
    public final synchronized boolean m14807c() {
        boolean z11;
        Long l11 = this.f15166c;
        z11 = false;
        if (l11 != null) {
            if (this.f15164a.invoke().longValue() - l11.longValue() <= this.f15165b) {
                z11 = true;
            }
        }
        return z11;
    }

    public AttributionJumpGate(@NotNull Function0<Long> elapsedRealtime, long j11) {
        Intrinsics.checkNotNullParameter(elapsedRealtime, "elapsedRealtime");
        this.f15164a = elapsedRealtime;
        this.f15165b = j11;
    }
}
