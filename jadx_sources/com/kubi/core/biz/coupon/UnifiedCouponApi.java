package com.kubi.core.biz.coupon;

import kotlinx.coroutines.flow.InterfaceC41634e;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import retrofit2.http.Body;
import retrofit2.http.POST;

/* JADX INFO: renamed from: com.kubi.core.biz.coupon.a, reason: from Kotlin metadata */
/* JADX INFO: compiled from: UnifiedTradeCoupon.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H'ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, m90084d2 = {"Lcom/kubi/core/biz/coupon/UnifiedCouponApi;", "", "fetchAvailableCoupons", "Lkotlinx/coroutines/flow/Flow;", "Lcom/kubi/core/biz/coupon/UnifiedCouponAvailableEntity;", "request", "Lcom/kubi/core/biz/coupon/UnifiedCouponAvailableRequest;", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface UnifiedCouponApi {
    @POST("coupon/fee-deduction/available")
    @NotNull
    /* JADX INFO: renamed from: a */
    InterfaceC41634e<UnifiedCouponAvailableEntity> m21723a(@Body @NotNull UnifiedCouponAvailableRequest unifiedCouponAvailableRequest);
}
