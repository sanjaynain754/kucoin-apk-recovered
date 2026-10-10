package p455mi;

import com.kubi.futures.trade.coupon.UnifiedFuturesCouponAvailableEntity;
import com.kubi.futures.trade.coupon.UnifiedFuturesCouponAvailableRequest;
import mr.C42597a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: mi.d */
/* JADX INFO: compiled from: UnifiedFuturesCoupon.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010R#\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b¨\u0006\u0011"}, m90084d2 = {"Lcom/kubi/futures/trade/coupon/UnifiedFuturesCouponRepository;", "", "<init>", "()V", "api", "Lcom/kubi/futures/trade/coupon/UnifiedFuturesCouponApi;", "kotlin.jvm.PlatformType", "getApi", "()Lcom/kubi/futures/trade/coupon/UnifiedFuturesCouponApi;", "api$delegate", "Lkotlin/Lazy;", "fetchAvailableCoupons", "Lcom/kubi/futures/trade/coupon/UnifiedFuturesCouponAvailableEntity;", "prizeType", "", "symbol", "", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C42550d {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C42550d f94225a = new C42550d();

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final Lazy f94226b = LazyKt.lazy(new Function0() { // from class: mi.c
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C42550d.m93281b();
        }
    });

    @Nullable
    /* JADX INFO: renamed from: c */
    public final UnifiedFuturesCouponAvailableEntity m93282c(int i11, @NotNull String symbol) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        return m93283d().m93278a(new UnifiedFuturesCouponAvailableRequest(i11, symbol));
    }

    /* JADX INFO: renamed from: d */
    public final InterfaceC42547a m93283d() {
        return (InterfaceC42547a) f94226b.getValue();
    }

    /* JADX INFO: renamed from: b */
    public static final InterfaceC42547a m93281b() {
        return (InterfaceC42547a) C42597a.m93391g().create(InterfaceC42547a.class);
    }
}
