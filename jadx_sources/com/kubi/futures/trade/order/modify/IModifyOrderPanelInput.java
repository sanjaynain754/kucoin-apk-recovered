package com.kubi.futures.trade.order.modify;

import java.math.BigDecimal;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;

/* JADX INFO: renamed from: com.kubi.futures.trade.order.modify.y, reason: from Kotlin metadata */
/* JADX INFO: compiled from: IModifyOrderPanelInput.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\n\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J\n\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016R\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\tÀ\u0006\u0001"}, m90084d2 = {"Lcom/kubi/futures/trade/order/modify/IModifyOrderPanelInput;", "Lcom/kubi/futures/trade/submit/validate/IPanelInput;", "orderId", "", "getOrderId", "()Ljava/lang/String;", "originalTriggerStopUpPrice", "Ljava/math/BigDecimal;", "originalTriggerStopDownPrice", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface IModifyOrderPanelInput extends com.kubi.futures.trade.submit.validate.f {
    @Nullable
    /* JADX INFO: renamed from: E1 */
    default BigDecimal mo27146E1() {
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: d1 */
    default BigDecimal mo27165d1() {
        return null;
    }

    @Nullable
    String getOrderId();
}
