package com.kubi.spot.business.mvi;

import com.kubi.core.spot.entity.ComplianceInfoEntity;
import com.kubi.core.spot.entity.SpotBannerEntity;
import kotlinx.coroutines.flow.InterfaceC41634e;
import mr.C42597a;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.spot.business.mvi.d, reason: from Kotlin metadata */
/* JADX INFO: compiled from: SpotTradeRepository.kt */
/* JADX INFO: loaded from: classes47.dex */
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u000fJ\u0016\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\f2\u0006\u0010\u000e\u001a\u00020\u000fJ\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\f2\u0006\u0010\u0013\u001a\u00020\u000fJ\u0016\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00150\f2\u0006\u0010\u000e\u001a\u00020\u000fR#\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b¨\u0006\u0016"}, m90084d2 = {"Lcom/kubi/spot/business/mvi/SpotTradeRepository;", "", "<init>", "()V", "api", "Lcom/kubi/spot/business/mvi/ISpotTradeApi;", "kotlin.jvm.PlatformType", "getApi", "()Lcom/kubi/spot/business/mvi/ISpotTradeApi;", "api$delegate", "Lkotlin/Lazy;", "requestAssetTotal", "Lkotlinx/coroutines/flow/Flow;", "", "symbol", "", "getRiskWarning", "getNoticeList", "Lcom/kubi/core/spot/entity/SpotBannerEntity;", "symbolCode", "getComplianceInfo", "Lcom/kubi/core/spot/entity/ComplianceInfoEntity;", "SpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class SpotTradeRepository {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final Lazy f50262a = LazyKt.lazy(new Function0() { // from class: com.kubi.spot.business.mvi.c
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return SpotTradeRepository.m61271b();
        }
    });

    /* JADX INFO: renamed from: c */
    public final ISpotTradeApi m61272c() {
        return (ISpotTradeApi) this.f50262a.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final InterfaceC41634e<ComplianceInfoEntity> m61273d(@NotNull String symbol) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        return ISpotTradeApi.m61264d(m61272c(), symbol, null, 2, null);
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public final InterfaceC41634e<SpotBannerEntity> m61274e(@NotNull String symbolCode) {
        Intrinsics.checkNotNullParameter(symbolCode, "symbolCode");
        return m61272c().m61267c("KC", "default", symbolCode);
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public final InterfaceC41634e<String> m61275f(@NotNull String symbol) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        return m61272c().m61266b(symbol);
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public final InterfaceC41634e<Boolean> m61276g(@NotNull String symbol) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        return m61272c().m61268e(symbol);
    }

    /* JADX INFO: renamed from: b */
    public static final ISpotTradeApi m61271b() {
        return (ISpotTradeApi) C42597a.m93387c().create(ISpotTradeApi.class);
    }
}
