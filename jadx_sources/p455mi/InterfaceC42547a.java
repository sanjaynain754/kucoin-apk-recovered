package p455mi;

import com.kubi.futures.trade.coupon.UnifiedFuturesCouponAvailableEntity;
import com.kubi.futures.trade.coupon.UnifiedFuturesCouponAvailableRequest;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import retrofit2.http.Body;
import retrofit2.http.POST;

/* JADX INFO: renamed from: mi.a */
/* JADX INFO: compiled from: UnifiedFuturesCoupon.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u0005H'ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, m90084d2 = {"Lcom/kubi/futures/trade/coupon/UnifiedFuturesCouponApi;", "", "fetchAvailableCoupons", "Lcom/kubi/futures/trade/coupon/UnifiedFuturesCouponAvailableEntity;", "request", "Lcom/kubi/futures/trade/coupon/UnifiedFuturesCouponAvailableRequest;", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface InterfaceC42547a {
    @POST("coupon/fee-deduction/available")
    @Nullable
    /* JADX INFO: renamed from: a */
    UnifiedFuturesCouponAvailableEntity m93278a(@Body @NotNull UnifiedFuturesCouponAvailableRequest unifiedFuturesCouponAvailableRequest);
}
