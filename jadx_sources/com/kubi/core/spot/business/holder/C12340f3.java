package com.kubi.core.spot.business.holder;

import com.kubi.core.base.order.data.TriggerDirection;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.core.spot.business.holder.f3 */
/* JADX INFO: compiled from: StopLossTypeExt.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m90083d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0016\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003¨\u0006\u0005"}, m90084d2 = {"getTriggerDirection", "Lcom/kubi/core/base/order/data/TriggerDirection;", "bboPrice", "Ljava/math/BigDecimal;", "triggerPrice", "TradeCoreBizLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C12340f3 {
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final TriggerDirection m23272a(@NotNull BigDecimal bboPrice, @NotNull BigDecimal triggerPrice) {
        Intrinsics.checkNotNullParameter(bboPrice, "bboPrice");
        Intrinsics.checkNotNullParameter(triggerPrice, "triggerPrice");
        return bboPrice.compareTo(triggerPrice) < 0 ? TriggerDirection.C11622UP.INSTANCE : TriggerDirection.DOWN.INSTANCE;
    }
}
