package com.kubi.core.spot.helper;

import com.kubi.core.spot.business.businessTrack.DurationTrackManager;
import com.kubi.core.spot.entity.OrderBookCenterEntity;
import com.kubi.core.spot.entity.OrderResultEntity;
import com.kubi.sdk.util.C24217a1;
import ge.InterfaceC37872b;
import io.reactivex.Observable;
import java.util.Map;
import mr.C42597a;
import org.jetbrains.annotations.NotNull;
import p569qq.C43841b;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.core.spot.helper.a0, reason: from Kotlin metadata */
/* JADX INFO: compiled from: TradeModel.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m90083d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\r\u001a\u00020\u000eJ(\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u000b2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0\u00122\u0006\u0010\u0013\u001a\u00020\u0014J$\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00010\u000b2\u0006\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u000eJ(\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00100\u000b2\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0\u00122\u0006\u0010\u0013\u001a\u00020\u0014J4\u0010\u001b\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u001d0\u001cj\b\u0012\u0004\u0012\u00020\u001d`\u001e0\u000b2\u0006\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u001f\u001a\u00020\u000eR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006 "}, m90084d2 = {"Lcom/kubi/core/spot/helper/TradeModel;", "", "<init>", "()V", "marketApi", "Lcom/kubi/core/spot/api/MarketApi;", "getMarketApi", "()Lcom/kubi/core/spot/api/MarketApi;", "setMarketApi", "(Lcom/kubi/core/spot/api/MarketApi;)V", "getOrderBookCenter", "Lio/reactivex/Observable;", "Lcom/kubi/core/spot/entity/OrderBookCenterEntity;", "symbol", "", "requestOrder", "Lcom/kubi/core/spot/entity/OrderResultEntity;", "requestEntity", "", "tradeTypeRequestOrder", "Lcom/kubi/core/spot/helper/ITradeTypeRequestOrder;", "checkTradePwd", "bizType", "key", "it", "requestOrderWithoutCheck", "marketOderParams", "checkValidationCode", "Ljava/util/ArrayList;", "Lcom/kubi/data/entity/CheckCodeResultEntity;", "Lkotlin/collections/ArrayList;", "value", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class TradeModel {

    /* JADX INFO: renamed from: a */
    @NotNull
    public InterfaceC37872b f21235a;

    @NotNull
    /* JADX INFO: renamed from: a */
    public final Observable<OrderBookCenterEntity> m23314a(@NotNull String symbol) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Observable observableCompose = this.f21235a.m85495g(symbol).compose(C24217a1.m58389m());
        Intrinsics.checkNotNullExpressionValue(observableCompose, "compose(...)");
        return observableCompose;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final Observable<OrderResultEntity> m23315b(@NotNull Map<String, String> requestEntity, @NotNull ITradeTypeRequestOrder tradeTypeRequestOrder) {
        Intrinsics.checkNotNullParameter(requestEntity, "requestEntity");
        Intrinsics.checkNotNullParameter(tradeTypeRequestOrder, "tradeTypeRequestOrder");
        C43841b.m96556c("unified_click_submit_spot_order_without_pass", "click_start_btn", DurationTrackManager.f21006c.getInstance().getF21009b());
        String str = requestEntity.get("HEADER_FINGER_EVENT");
        requestEntity.remove("HEADER_FINGER_EVENT");
        return tradeTypeRequestOrder.mo23038d(this.f21235a, requestEntity, str);
    }

    public TradeModel() {
        Object objCreate = C42597a.m93386b().create(InterfaceC37872b.class);
        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
        this.f21235a = (InterfaceC37872b) objCreate;
    }
}
