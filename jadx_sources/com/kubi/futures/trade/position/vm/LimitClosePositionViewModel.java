package com.kubi.futures.trade.position.vm;

import com.facebook.react.uimanager.ViewProps;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.kumex.data.trade.model.PositionEntity;
import com.kubi.utils.extensions.C27039d;
import com.tencent.qcloud.tuicore.TUIConstants;
import fm.C37569d;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import sm.OrderRequest;

/* JADX INFO: renamed from: com.kubi.futures.trade.position.vm.s1, reason: from Kotlin metadata */
/* JADX INFO: compiled from: LimitClosePositionViewModel.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\"\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\nH\u0016¨\u0006\u000b"}, m90084d2 = {"Lcom/kubi/futures/trade/position/vm/LimitClosePositionViewModel;", "Lcom/kubi/futures/trade/position/vm/BaseClosePositionViewModel;", "<init>", "()V", "createOrderRequest", "Lcom/kubi/kumex/request/OrderRequest;", FirebaseAnalytics.Param.PRICE, "Ljava/math/BigDecimal;", "qty", ViewProps.POSITION, "Lcom/kubi/kumex/data/trade/model/PositionEntity;", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class LimitClosePositionViewModel extends BaseClosePositionViewModel {
    @Override // com.kubi.futures.trade.position.vm.BaseClosePositionViewModel
    @NotNull
    /* JADX INFO: renamed from: H */
    public OrderRequest mo27992H(@Nullable BigDecimal bigDecimal, @NotNull BigDecimal qty, @NotNull PositionEntity position) {
        Intrinsics.checkNotNullParameter(qty, "qty");
        Intrinsics.checkNotNullParameter(position, "position");
        OrderRequest orderRequest = new OrderRequest(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 268435455, null);
        orderRequest.m98528y(position.getSymbol());
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(1L);
        Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
        orderRequest.m98518o(bigDecimalValueOf);
        orderRequest.m98525v(C37569d.m84685z(position) ? "sell" : "buy");
        orderRequest.m98521r(TUIConstants.TUIContact.LIMIT);
        orderRequest.m98517n(bigDecimal);
        orderRequest.m98516m(qty.abs().compareTo(C27039d.m66656p(position.getCurrentQty()).abs()) >= 0 ? null : qty.abs());
        orderRequest.m98520q(position.getMarginMode());
        orderRequest.m98522s(position.getPositionSide());
        return orderRequest;
    }
}
