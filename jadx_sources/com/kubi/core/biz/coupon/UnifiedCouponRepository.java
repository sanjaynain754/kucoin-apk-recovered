package com.kubi.core.biz.coupon;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.InterfaceC41634e;
import mr.C42597a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: UnifiedTradeCoupon.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m90083d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0017B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0013J$\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00162\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0013R#\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, m90084d2 = {"Lcom/kubi/core/biz/coupon/UnifiedCouponRepository;", "", "<init>", "()V", "api", "Lcom/kubi/core/biz/coupon/UnifiedCouponApi;", "kotlin.jvm.PlatformType", "getApi", "()Lcom/kubi/core/biz/coupon/UnifiedCouponApi;", "api$delegate", "Lkotlin/Lazy;", "availableCouponsCache", "", "Lcom/kubi/core/biz/coupon/UnifiedCouponRepository$CacheKey;", "Lcom/kubi/core/biz/coupon/UnifiedCouponAvailableEntity;", "getCachedAvailableCoupons", "prizeType", "", "symbol", "", "userId", "fetchAvailableCoupons", "Lkotlinx/coroutines/flow/Flow;", "CacheKey", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class UnifiedCouponRepository {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final UnifiedCouponRepository f20373a = new UnifiedCouponRepository();

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final Lazy f20374b = LazyKt.lazy(new Function0() { // from class: com.kubi.core.biz.coupon.d
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return UnifiedCouponRepository.m21719c();
        }
    });

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final Map<CacheKey, UnifiedCouponAvailableEntity> f20375c = new LinkedHashMap();

    /* JADX INFO: renamed from: com.kubi.core.biz.coupon.UnifiedCouponRepository$a, reason: from toString */
    /* JADX INFO: compiled from: UnifiedTradeCoupon.kt */
    @Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0082\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0017"}, m90084d2 = {"Lcom/kubi/core/biz/coupon/UnifiedCouponRepository$CacheKey;", "", "prizeType", "", "symbol", "", "userId", "<init>", "(ILjava/lang/String;Ljava/lang/String;)V", "getPrizeType", "()I", "getSymbol", "()Ljava/lang/String;", "getUserId", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class CacheKey {

        /* JADX INFO: renamed from: a, reason: from toString */
        public final int prizeType;

        /* JADX INFO: renamed from: b, reason: from toString */
        @NotNull
        public final String symbol;

        /* JADX INFO: renamed from: c, reason: from toString */
        @NotNull
        public final String userId;

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CacheKey)) {
                return false;
            }
            CacheKey cacheKey = (CacheKey) other;
            return this.prizeType == cacheKey.prizeType && Intrinsics.areEqual(this.symbol, cacheKey.symbol) && Intrinsics.areEqual(this.userId, cacheKey.userId);
        }

        public CacheKey(int i11, @NotNull String symbol, @NotNull String userId) {
            Intrinsics.checkNotNullParameter(symbol, "symbol");
            Intrinsics.checkNotNullParameter(userId, "userId");
            this.prizeType = i11;
            this.symbol = symbol;
            this.userId = userId;
        }

        public int hashCode() {
            return (((Integer.hashCode(this.prizeType) * 31) + this.symbol.hashCode()) * 31) + this.userId.hashCode();
        }

        @NotNull
        public String toString() {
            return "CacheKey(prizeType=" + this.prizeType + ", symbol=" + this.symbol + ", userId=" + this.userId + ')';
        }
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final InterfaceC41634e<UnifiedCouponAvailableEntity> m21720d(int i11, @NotNull String symbol, @NotNull String userId) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(userId, "userId");
        return C41636g.m90896T(m21721e().m21723a(new UnifiedCouponAvailableRequest(i11, symbol)), new UnifiedCouponRepository$fetchAvailableCoupons$1(new CacheKey(i11, symbol, userId), null));
    }

    /* JADX INFO: renamed from: e */
    public final UnifiedCouponApi m21721e() {
        return (UnifiedCouponApi) f20374b.getValue();
    }

    @Nullable
    /* JADX INFO: renamed from: f */
    public final UnifiedCouponAvailableEntity m21722f(int i11, @NotNull String symbol, @NotNull String userId) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(userId, "userId");
        return f20375c.get(new CacheKey(i11, symbol, userId));
    }

    /* JADX INFO: renamed from: c */
    public static final UnifiedCouponApi m21719c() {
        return (UnifiedCouponApi) C42597a.m93387c().create(UnifiedCouponApi.class);
    }
}
