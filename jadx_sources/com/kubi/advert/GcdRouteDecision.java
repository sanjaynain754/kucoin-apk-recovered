package com.kubi.advert;

import com.tencent.bugly.proguard.InterfaceC33826o0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.advert.x, reason: from Kotlin metadata */
/* JADX INFO: compiled from: GcdDeferredRouteCoordinator.kt */
/* JADX INFO: loaded from: classes62.dex */
@Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\tø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0001"}, m90084d2 = {"Lcom/kubi/advert/GcdRouteDecision;", "", "None", "Queued", "Consume", "Skip", "Lcom/kubi/advert/GcdRouteDecision$Consume;", "Lcom/kubi/advert/GcdRouteDecision$None;", "Lcom/kubi/advert/GcdRouteDecision$Queued;", "Lcom/kubi/advert/GcdRouteDecision$Skip;", "AdvertLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface GcdRouteDecision {

    /* JADX INFO: renamed from: com.kubi.advert.x$a, reason: from toString */
    /* JADX INFO: compiled from: GcdDeferredRouteCoordinator.kt */
    @Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00072\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, m90084d2 = {"Lcom/kubi/advert/GcdRouteDecision$Consume;", "Lcom/kubi/advert/GcdRouteDecision;", "route", "", "queueWaitMs", "", "wasQueued", "", "<init>", "(Ljava/lang/String;JZ)V", "getRoute", "()Ljava/lang/String;", "getQueueWaitMs", "()J", "getWasQueued", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "", "hashCode", "", "toString", "AdvertLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class Consume implements GcdRouteDecision {

        /* JADX INFO: renamed from: a, reason: from toString */
        @NotNull
        public final String route;

        /* JADX INFO: renamed from: b, reason: from toString */
        public final long queueWaitMs;

        /* JADX INFO: renamed from: c, reason: from toString */
        public final boolean wasQueued;

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Consume)) {
                return false;
            }
            Consume consume = (Consume) other;
            return Intrinsics.areEqual(this.route, consume.route) && this.queueWaitMs == consume.queueWaitMs && this.wasQueued == consume.wasQueued;
        }

        public Consume(@NotNull String route, long j11, boolean z11) {
            Intrinsics.checkNotNullParameter(route, "route");
            this.route = route;
            this.queueWaitMs = j11;
            this.wasQueued = z11;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final long getQueueWaitMs() {
            return this.queueWaitMs;
        }

        @NotNull
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getRoute() {
            return this.route;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final boolean getWasQueued() {
            return this.wasQueued;
        }

        public int hashCode() {
            return (((this.route.hashCode() * 31) + Long.hashCode(this.queueWaitMs)) * 31) + Boolean.hashCode(this.wasQueued);
        }

        @NotNull
        public String toString() {
            return "Consume(route=" + this.route + ", queueWaitMs=" + this.queueWaitMs + ", wasQueued=" + this.wasQueued + ')';
        }
    }

    /* JADX INFO: renamed from: com.kubi.advert.x$b */
    /* JADX INFO: compiled from: GcdDeferredRouteCoordinator.kt */
    @Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m90084d2 = {"Lcom/kubi/advert/GcdRouteDecision$None;", "Lcom/kubi/advert/GcdRouteDecision;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "AdvertLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class b implements GcdRouteDecision {

        /* JADX INFO: renamed from: a */
        @NotNull
        public static final b f15178a = new b();

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof b);
        }

        @NotNull
        public String toString() {
            return "None";
        }

        public int hashCode() {
            return 1298824511;
        }
    }

    /* JADX INFO: renamed from: com.kubi.advert.x$c, reason: from toString */
    /* JADX INFO: compiled from: GcdDeferredRouteCoordinator.kt */
    @Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ$\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u000fJ\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\n¨\u0006\u0018"}, m90084d2 = {"Lcom/kubi/advert/GcdRouteDecision$Queued;", "Lcom/kubi/advert/GcdRouteDecision;", InterfaceC33826o0.f71244p, "", "deadlineAtMs", "<init>", "(JLjava/lang/Long;)V", "getToken", "()J", "getDeadlineAtMs", "()Ljava/lang/Long;", "Ljava/lang/Long;", "component1", "component2", "copy", "(JLjava/lang/Long;)Lcom/kubi/advert/GcdRouteDecision$Queued;", "equals", "", "other", "", "hashCode", "", "toString", "", "AdvertLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class Queued implements GcdRouteDecision {

        /* JADX INFO: renamed from: a, reason: from toString */
        public final long token;

        /* JADX INFO: renamed from: b, reason: from toString */
        @Nullable
        public final Long deadlineAtMs;

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Queued)) {
                return false;
            }
            Queued queued = (Queued) other;
            return this.token == queued.token && Intrinsics.areEqual(this.deadlineAtMs, queued.deadlineAtMs);
        }

        @Nullable
        /* JADX INFO: renamed from: a, reason: from getter */
        public final Long getDeadlineAtMs() {
            return this.deadlineAtMs;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final long getToken() {
            return this.token;
        }

        public int hashCode() {
            int iHashCode = Long.hashCode(this.token) * 31;
            Long l11 = this.deadlineAtMs;
            return iHashCode + (l11 == null ? 0 : l11.hashCode());
        }

        @NotNull
        public String toString() {
            return "Queued(token=" + this.token + ", deadlineAtMs=" + this.deadlineAtMs + ')';
        }

        public Queued(long j11, @Nullable Long l11) {
            this.token = j11;
            this.deadlineAtMs = l11;
        }
    }

    /* JADX INFO: renamed from: com.kubi.advert.x$d, reason: from toString */
    /* JADX INFO: compiled from: GcdDeferredRouteCoordinator.kt */
    @Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00052\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, m90084d2 = {"Lcom/kubi/advert/GcdRouteDecision$Skip;", "Lcom/kubi/advert/GcdRouteDecision;", "reason", "", "wasQueued", "", "queueWaitMs", "", "<init>", "(Ljava/lang/String;ZJ)V", "getReason", "()Ljava/lang/String;", "getWasQueued", "()Z", "getQueueWaitMs", "()J", "component1", "component2", "component3", "copy", "equals", "other", "", "hashCode", "", "toString", "AdvertLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class Skip implements GcdRouteDecision {

        /* JADX INFO: renamed from: a, reason: from toString */
        @NotNull
        public final String reason;

        /* JADX INFO: renamed from: b, reason: from toString */
        public final boolean wasQueued;

        /* JADX INFO: renamed from: c, reason: from toString */
        public final long queueWaitMs;

        public Skip(@NotNull String reason, boolean z11, long j11) {
            Intrinsics.checkNotNullParameter(reason, "reason");
            this.reason = reason;
            this.wasQueued = z11;
            this.queueWaitMs = j11;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Skip)) {
                return false;
            }
            Skip skip = (Skip) other;
            return Intrinsics.areEqual(this.reason, skip.reason) && this.wasQueued == skip.wasQueued && this.queueWaitMs == skip.queueWaitMs;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final long getQueueWaitMs() {
            return this.queueWaitMs;
        }

        @NotNull
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getReason() {
            return this.reason;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final boolean getWasQueued() {
            return this.wasQueued;
        }

        public int hashCode() {
            return (((this.reason.hashCode() * 31) + Boolean.hashCode(this.wasQueued)) * 31) + Long.hashCode(this.queueWaitMs);
        }

        @NotNull
        public String toString() {
            return "Skip(reason=" + this.reason + ", wasQueued=" + this.wasQueued + ", queueWaitMs=" + this.queueWaitMs + ')';
        }

        public /* synthetic */ Skip(String str, boolean z11, long j11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i11 & 2) != 0 ? false : z11, (i11 & 4) != 0 ? 0L : j11);
        }
    }
}
