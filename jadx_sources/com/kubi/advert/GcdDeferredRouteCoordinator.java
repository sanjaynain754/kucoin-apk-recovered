package com.kubi.advert;

import com.tencent.bugly.proguard.InterfaceC33826o0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.enums.EnumEntries;
import p852kotlin.enums.EnumEntriesKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.ranges.RangesKt;

/* JADX INFO: compiled from: GcdDeferredRouteCoordinator.kt */
/* JADX INFO: loaded from: classes62.dex */
@Metadata(m90083d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0002$%B\u001d\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000bJ\u000e\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u000bJ\u000e\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u000bJ\u0006\u0010\u0018\u001a\u00020\u0019J\u000e\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u0019J\u000e\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u0019J\u000e\u0010\u001d\u001a\u00020\u00122\u0006\u0010\u001e\u001a\u00020\u0004J\u0010\u0010\u001f\u001a\u00020\u00122\u0006\u0010 \u001a\u00020\u0019H\u0002J\u0010\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\rH\u0002R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\b\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\tR\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006&"}, m90084d2 = {"Lcom/kubi/advert/GcdDeferredRouteCoordinator;", "", "elapsedRealtime", "Lkotlin/Function0;", "", "consumeWindowMs", "<init>", "(Lkotlin/jvm/functions/Function0;J)V", "firstMainResumedAtMs", "Ljava/lang/Long;", "resumedHostId", "", "pendingRoute", "Lcom/kubi/advert/GcdDeferredRouteCoordinator$PendingRoute;", "routeState", "Lcom/kubi/advert/GcdDeferredRouteCoordinator$RouteState;", "nextPendingToken", "onRouteReady", "Lcom/kubi/advert/GcdRouteDecision;", "route", "onMainHostResumed", "hostId", "onMainHostPaused", "", "tryStartUdl", "", "onUdlNavigationFinished", "success", "onGcdNavigationFinished", "expirePendingRoute", InterfaceC33826o0.f71244p, "takeRouteIfReady", "reportQueued", "queuedDecision", "Lcom/kubi/advert/GcdRouteDecision$Queued;", "pending", "RouteState", "PendingRoute", "AdvertLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nGcdDeferredRouteCoordinator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GcdDeferredRouteCoordinator.kt\ncom/kubi/advert/GcdDeferredRouteCoordinator\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,223:1\n1#2:224\n*E\n"})
public final class GcdDeferredRouteCoordinator {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final Function0<Long> f14980a;

    /* JADX INFO: renamed from: b */
    public final long f14981b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public Long f14982c;

    /* JADX INFO: renamed from: d */
    @Nullable
    public String f14983d;

    /* JADX INFO: renamed from: e */
    @Nullable
    public PendingRoute f14984e;

    /* JADX INFO: renamed from: f */
    @NotNull
    public RouteState f14985f;

    /* JADX INFO: renamed from: g */
    public long f14986g;

    /* JADX INFO: compiled from: GcdDeferredRouteCoordinator.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, m90084d2 = {"Lcom/kubi/advert/GcdDeferredRouteCoordinator$RouteState;", "", "<init>", "(Ljava/lang/String;I)V", "IDLE", "UDL_IN_FLIGHT", "GCD_IN_FLIGHT", "HANDLED", "AdvertLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public enum RouteState {
        IDLE,
        UDL_IN_FLIGHT,
        GCD_IN_FLIGHT,
        HANDLED;


        /* JADX INFO: renamed from: c */
        public static final /* synthetic */ EnumEntries f14988c = EnumEntriesKt.enumEntries(m14750a());

        @NotNull
        public static EnumEntries<RouteState> getEntries() {
            return f14988c;
        }
    }

    /* JADX INFO: renamed from: com.kubi.advert.GcdDeferredRouteCoordinator$a, reason: from toString */
    /* JADX INFO: compiled from: GcdDeferredRouteCoordinator.kt */
    @Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\bHÆ\u0003J1\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u001e"}, m90084d2 = {"Lcom/kubi/advert/GcdDeferredRouteCoordinator$PendingRoute;", "", "route", "", "readyAtMs", "", InterfaceC33826o0.f71244p, "wasQueued", "", "<init>", "(Ljava/lang/String;JJZ)V", "getRoute", "()Ljava/lang/String;", "getReadyAtMs", "()J", "getToken", "getWasQueued", "()Z", "setWasQueued", "(Z)V", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "AdvertLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class PendingRoute {

        /* JADX INFO: renamed from: a, reason: from toString */
        @NotNull
        public final String route;

        /* JADX INFO: renamed from: b, reason: from toString */
        public final long readyAtMs;

        /* JADX INFO: renamed from: c, reason: from toString */
        public final long token;

        /* JADX INFO: renamed from: d, reason: from toString */
        public boolean wasQueued;

        public PendingRoute(@NotNull String route, long j11, long j12, boolean z11) {
            Intrinsics.checkNotNullParameter(route, "route");
            this.route = route;
            this.readyAtMs = j11;
            this.token = j12;
            this.wasQueued = z11;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PendingRoute)) {
                return false;
            }
            PendingRoute pendingRoute = (PendingRoute) other;
            return Intrinsics.areEqual(this.route, pendingRoute.route) && this.readyAtMs == pendingRoute.readyAtMs && this.token == pendingRoute.token && this.wasQueued == pendingRoute.wasQueued;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final long getReadyAtMs() {
            return this.readyAtMs;
        }

        @NotNull
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getRoute() {
            return this.route;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final long getToken() {
            return this.token;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final boolean getWasQueued() {
            return this.wasQueued;
        }

        /* JADX INFO: renamed from: e */
        public final void m14755e(boolean z11) {
            this.wasQueued = z11;
        }

        public int hashCode() {
            return (((((this.route.hashCode() * 31) + Long.hashCode(this.readyAtMs)) * 31) + Long.hashCode(this.token)) * 31) + Boolean.hashCode(this.wasQueued);
        }

        @NotNull
        public String toString() {
            return "PendingRoute(route=" + this.route + ", readyAtMs=" + this.readyAtMs + ", token=" + this.token + ", wasQueued=" + this.wasQueued + ')';
        }

        public /* synthetic */ PendingRoute(String str, long j11, long j12, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, j11, j12, (i11 & 8) != 0 ? false : z11);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final synchronized GcdRouteDecision m14741a(long j11) {
        PendingRoute pendingRoute = this.f14984e;
        if (pendingRoute != null) {
            if (pendingRoute.getToken() != j11) {
                pendingRoute = null;
            }
            if (pendingRoute != null) {
                Long l11 = this.f14982c;
                if (l11 == null) {
                    return GcdRouteDecision.b.f15178a;
                }
                if (this.f14980a.invoke().longValue() - l11.longValue() <= this.f14981b) {
                    return GcdRouteDecision.b.f15178a;
                }
                this.f14984e = null;
                return new GcdRouteDecision.Skip("window_expired", pendingRoute.getWasQueued(), RangesKt.coerceAtLeast(this.f14980a.invoke().longValue() - pendingRoute.getReadyAtMs(), 0L));
            }
        }
        return GcdRouteDecision.b.f15178a;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final synchronized GcdRouteDecision m14742b(boolean z11) {
        if (this.f14985f != RouteState.GCD_IN_FLIGHT) {
            return GcdRouteDecision.b.f15178a;
        }
        this.f14985f = z11 ? RouteState.HANDLED : RouteState.IDLE;
        return GcdRouteDecision.b.f15178a;
    }

    /* JADX INFO: renamed from: c */
    public final synchronized void m14743c(@NotNull String hostId) {
        Intrinsics.checkNotNullParameter(hostId, "hostId");
        if (Intrinsics.areEqual(this.f14983d, hostId)) {
            this.f14983d = null;
        }
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final synchronized GcdRouteDecision m14744d(@NotNull String hostId) {
        try {
            Intrinsics.checkNotNullParameter(hostId, "hostId");
            if (this.f14982c == null) {
                this.f14982c = this.f14980a.invoke();
            }
            this.f14983d = hostId;
        } catch (Throwable th2) {
            throw th2;
        }
        return m14748h(false);
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public final synchronized GcdRouteDecision m14745e(@NotNull String route) {
        Intrinsics.checkNotNullParameter(route, "route");
        RouteState routeState = this.f14985f;
        if (routeState != RouteState.HANDLED && routeState != RouteState.GCD_IN_FLIGHT && this.f14984e == null) {
            long jLongValue = this.f14980a.invoke().longValue();
            long j11 = this.f14986g + 1;
            this.f14986g = j11;
            this.f14984e = new PendingRoute(route, jLongValue, j11, false, 8, null);
            return m14748h(true);
        }
        return new GcdRouteDecision.Skip("mutex", false, 0L, 6, null);
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public final synchronized GcdRouteDecision m14746f(boolean z11) {
        if (this.f14985f != RouteState.UDL_IN_FLIGHT) {
            return GcdRouteDecision.b.f15178a;
        }
        if (!z11) {
            this.f14985f = RouteState.IDLE;
            return m14748h(false);
        }
        this.f14985f = RouteState.HANDLED;
        PendingRoute pendingRoute = this.f14984e;
        this.f14984e = null;
        return (pendingRoute == null || !pendingRoute.getWasQueued()) ? GcdRouteDecision.b.f15178a : new GcdRouteDecision.Skip("udl_handled", true, RangesKt.coerceAtLeast(this.f14980a.invoke().longValue() - pendingRoute.getReadyAtMs(), 0L));
    }

    /* JADX INFO: renamed from: g */
    public final GcdRouteDecision.Queued m14747g(PendingRoute pendingRoute) {
        pendingRoute.m14755e(true);
        long token = pendingRoute.getToken();
        Long l11 = this.f14982c;
        return new GcdRouteDecision.Queued(token, l11 != null ? Long.valueOf(l11.longValue() + this.f14981b + 1) : null);
    }

    /* JADX INFO: renamed from: i */
    public final synchronized boolean m14749i() {
        if (this.f14985f != RouteState.IDLE) {
            return false;
        }
        this.f14985f = RouteState.UDL_IN_FLIGHT;
        return true;
    }

    public GcdDeferredRouteCoordinator(@NotNull Function0<Long> elapsedRealtime, long j11) {
        Intrinsics.checkNotNullParameter(elapsedRealtime, "elapsedRealtime");
        this.f14980a = elapsedRealtime;
        this.f14981b = j11;
        this.f14985f = RouteState.IDLE;
    }

    /* JADX INFO: renamed from: h */
    public final GcdRouteDecision m14748h(boolean z11) {
        PendingRoute pendingRoute = this.f14984e;
        if (pendingRoute == null) {
            return GcdRouteDecision.b.f15178a;
        }
        Long l11 = this.f14982c;
        if (l11 != null && this.f14980a.invoke().longValue() - l11.longValue() > this.f14981b) {
            this.f14984e = null;
            return new GcdRouteDecision.Skip("window_expired", pendingRoute.getWasQueued(), RangesKt.coerceAtLeast(this.f14980a.invoke().longValue() - pendingRoute.getReadyAtMs(), 0L));
        }
        if (this.f14985f != RouteState.IDLE || this.f14983d == null) {
            return z11 ? m14747g(pendingRoute) : GcdRouteDecision.b.f15178a;
        }
        if (l11 == null) {
            return z11 ? m14747g(pendingRoute) : GcdRouteDecision.b.f15178a;
        }
        this.f14985f = RouteState.GCD_IN_FLIGHT;
        this.f14984e = null;
        return new GcdRouteDecision.Consume(pendingRoute.getRoute(), RangesKt.coerceAtLeast(this.f14980a.invoke().longValue() - pendingRoute.getReadyAtMs(), 0L), pendingRoute.getWasQueued());
    }
}
