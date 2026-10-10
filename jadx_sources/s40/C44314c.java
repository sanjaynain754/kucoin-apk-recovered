package s40;

import com.kubi.tradingbotkit.bean.params.coupons.CouponsOverviewBean;
import com.kubi.tradingbotkit.entity.OrderBookCenterEntity;
import com.kubi.tradingbotkit.entity.coupons.AllCouponsEntity;
import com.tencent.rmonitor.base.p144db.table.ReportDataTable;
import e50.InterfaceC37075a;
import kotlinx.coroutines.flow.InterfaceC41634e;
import mr.C42597a;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import q40.InterfaceC43611a;

/* JADX INFO: renamed from: s40.c */
/* JADX INFO: compiled from: CouponsRepository.kt */
/* JADX INFO: loaded from: classes51.dex */
@Metadata(m90083d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u0011J\u0016\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u00112\u0006\u0010\u0015\u001a\u00020\u0016J\u0016\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u00112\u0006\u0010\u0019\u001a\u00020\u001aR#\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR#\u0010\u000b\u001a\n \u0006*\u0004\u0018\u00010\f0\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\r\u0010\u000e¨\u0006\u001b"}, m90084d2 = {"Lcom/kubi/tradingbotkit/business/coupons/repostory/CouponsRepository;", "", "<init>", "()V", "api", "Lcom/kubi/tradingbotkit/business/coupons/api/IGridCouponsApi;", "kotlin.jvm.PlatformType", "getApi", "()Lcom/kubi/tradingbotkit/business/coupons/api/IGridCouponsApi;", "api$delegate", "Lkotlin/Lazy;", "robotSpotApi", "Lcom/kubi/tradingbotkit/business/spot/restful/RobotSpotApi;", "getRobotSpotApi", "()Lcom/kubi/tradingbotkit/business/spot/restful/RobotSpotApi;", "robotSpotApi$delegate", "getNewCoupons", "Lkotlinx/coroutines/flow/Flow;", "Lcom/kubi/tradingbotkit/entity/coupons/ExperienceGoldEntity;", "getAllCoupons", "Lcom/kubi/tradingbotkit/entity/coupons/AllCouponsEntity;", ReportDataTable.COLUMN_PARAMS, "Lcom/kubi/tradingbotkit/bean/params/coupons/CouponsOverviewBean;", "getSymbolPrice", "Lcom/kubi/tradingbotkit/entity/OrderBookCenterEntity;", "symbol", "", "TradingBotKitLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C44314c {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final Lazy f97942a = LazyKt.lazy(new Function0() { // from class: s40.a
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C44314c.m97768c();
        }
    });

    /* JADX INFO: renamed from: b */
    @NotNull
    public final Lazy f97943b = LazyKt.lazy(new Function0() { // from class: s40.b
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C44314c.m97769h();
        }
    });

    @NotNull
    /* JADX INFO: renamed from: d */
    public final InterfaceC41634e<AllCouponsEntity> m97770d(@NotNull CouponsOverviewBean params) {
        Intrinsics.checkNotNullParameter(params, "params");
        return m97771e().m95970a(params);
    }

    /* JADX INFO: renamed from: e */
    public final InterfaceC43611a m97771e() {
        return (InterfaceC43611a) this.f97942a.getValue();
    }

    /* JADX INFO: renamed from: f */
    public final InterfaceC37075a m97772f() {
        return (InterfaceC37075a) this.f97943b.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public final InterfaceC41634e<OrderBookCenterEntity> m97773g(@NotNull String symbol) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        return m97772f().m82982g(symbol);
    }

    /* JADX INFO: renamed from: c */
    public static final InterfaceC43611a m97768c() {
        return (InterfaceC43611a) C42597a.m93387c().create(InterfaceC43611a.class);
    }

    /* JADX INFO: renamed from: h */
    public static final InterfaceC37075a m97769h() {
        return (InterfaceC37075a) C42597a.m93387c().create(InterfaceC37075a.class);
    }
}
