package com.kubi.broker;

import com.kubi.futures.data.market.IMarketService;
import com.kubi.futures.data.market.MarketServiceImpl;
import com.kubi.futures.data.platform.PlatformServiceImpl;
import org.jetbrains.annotations.NotNull;
import p663uh.C45244h;
import p663uh.InterfaceC45238b;
import p692vh.C45551h;
import p692vh.InterfaceC45545b;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function0;
import th.InterfaceC44980d;

/* JADX INFO: renamed from: com.kubi.broker.r, reason: from Kotlin metadata */
/* JADX INFO: compiled from: RepositoryServiceLocator.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m90083d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0019\u001a\u00020\u001aJ\u0006\u0010\u001b\u001a\u00020\u001cJ\u0006\u0010\u0011\u001a\u00020\u001dJ\u0006\u0010\u001e\u001a\u00020\u001fR\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\t\u001a\u0004\b\f\u0010\rR\u001b\u0010\u000f\u001a\u00020\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\t\u001a\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0014\u001a\u00020\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\t\u001a\u0004\b\u0016\u0010\u0017¨\u0006 "}, m90084d2 = {"Lcom/kubi/broker/RepositoryServiceLocator;", "", "<init>", "()V", "platformServiceImpl", "Lcom/kubi/futures/data/platform/PlatformServiceImpl;", "getPlatformServiceImpl", "()Lcom/kubi/futures/data/platform/PlatformServiceImpl;", "platformServiceImpl$delegate", "Lkotlin/Lazy;", "marketServiceImpl", "Lcom/kubi/futures/data/market/MarketServiceImpl;", "getMarketServiceImpl", "()Lcom/kubi/futures/data/market/MarketServiceImpl;", "marketServiceImpl$delegate", "settingService", "Lcom/kubi/futures/data/setting/SettingServiceImpl;", "getSettingService", "()Lcom/kubi/futures/data/setting/SettingServiceImpl;", "settingService$delegate", "trialServiceImpl", "Lcom/kubi/futures/data/trial/TrialServiceImpl;", "getTrialServiceImpl", "()Lcom/kubi/futures/data/trial/TrialServiceImpl;", "trialServiceImpl$delegate", "getPlatformService", "Lcom/kubi/futures/data/platform/IPlatformService;", "getMarketService", "Lcom/kubi/futures/data/market/IMarketService;", "Lcom/kubi/futures/data/setting/ISettingService;", "getTrialService", "Lcom/kubi/futures/data/trial/ITrialService;", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class RepositoryServiceLocator {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final RepositoryServiceLocator f19236a = new RepositoryServiceLocator();

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final Lazy f19237b = LazyKt.lazy(new Function0() { // from class: com.kubi.broker.n
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return RepositoryServiceLocator.m20283n();
        }
    });

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final Lazy f19238c = LazyKt.lazy(new Function0() { // from class: com.kubi.broker.o
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return RepositoryServiceLocator.m20282m();
        }
    });

    /* JADX INFO: renamed from: d */
    @NotNull
    public static final Lazy f19239d = LazyKt.lazy(new Function0() { // from class: com.kubi.broker.p
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return RepositoryServiceLocator.m20284o();
        }
    });

    /* JADX INFO: renamed from: e */
    @NotNull
    public static final Lazy f19240e = LazyKt.lazy(new Function0() { // from class: com.kubi.broker.q
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return RepositoryServiceLocator.m20285p();
        }
    });

    /* JADX INFO: renamed from: m */
    public static final MarketServiceImpl m20282m() {
        return new MarketServiceImpl();
    }

    /* JADX INFO: renamed from: n */
    public static final PlatformServiceImpl m20283n() {
        return new PlatformServiceImpl();
    }

    /* JADX INFO: renamed from: o */
    public static final C45244h m20284o() {
        return new C45244h();
    }

    /* JADX INFO: renamed from: p */
    public static final C45551h m20285p() {
        return new C45551h();
    }

    /* JADX INFO: renamed from: f */
    public final MarketServiceImpl m20287f() {
        return (MarketServiceImpl) f19238c.getValue();
    }

    /* JADX INFO: renamed from: h */
    public final PlatformServiceImpl m20289h() {
        return (PlatformServiceImpl) f19237b.getValue();
    }

    /* JADX INFO: renamed from: j */
    public final C45244h m20291j() {
        return (C45244h) f19239d.getValue();
    }

    /* JADX INFO: renamed from: l */
    public final C45551h m20293l() {
        return (C45551h) f19240e.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public final IMarketService m20286e() {
        return m20287f();
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public final InterfaceC44980d m20288g() {
        return m20289h();
    }

    @NotNull
    /* JADX INFO: renamed from: i */
    public final InterfaceC45238b m20290i() {
        return m20291j();
    }

    @NotNull
    /* JADX INFO: renamed from: k */
    public final InterfaceC45545b m20292k() {
        return m20293l();
    }
}
