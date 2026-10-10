package jm;

import android.os.Bundle;
import com.kubi.kumex.logic.constant.OrderTradeType;
import com.kubi.otc.entity.OtcAd;
import com.kubi.tradebase.tradetype.TradeType;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: jm.k */
/* JADX INFO: compiled from: OrderTradeType.kt */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(m90083d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\r\u001a\u00020\u000e*\u00020\u000f\u001a\u0012\u0010\u0010\u001a\u00020\u000e*\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0012\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\b\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\t\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u0011\u0010\n\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0013"}, m90084d2 = {"LIMIT", "", "MARKET", "ADVANCED_LIMIT", "CONDITIONAL", "TRIGGER_LIMIT", "TRIGGER_MARKET", OtcAd.STATUS_HIDDEN, "TSO", "SEGMENT", "TWAP", "getTWAP", "()Ljava/lang/String;", "withoutExtraData", "Lcom/kubi/kumex/logic/constant/OrderTypeWrapper;", "Lcom/kubi/kumex/logic/constant/OrderTradeType;", "withExtraData", "data", "Landroid/os/Bundle;", "KumexApi_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C40446k {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final String f89749a = TradeType.TWAP.getValue();

    @NotNull
    /* JADX INFO: renamed from: a */
    public static final String m89081a() {
        return f89749a;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public static final OrderTypeWrapper m89082b(@NotNull OrderTradeType orderTradeType, @NotNull Bundle data) {
        Intrinsics.checkNotNullParameter(orderTradeType, "<this>");
        Intrinsics.checkNotNullParameter(data, "data");
        return new OrderTypeWrapper(orderTradeType, data);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    /* JADX INFO: renamed from: c */
    public static final OrderTypeWrapper m89083c(@NotNull OrderTradeType orderTradeType) {
        Intrinsics.checkNotNullParameter(orderTradeType, "<this>");
        return new OrderTypeWrapper(orderTradeType, null, 2, 0 == true ? 1 : 0);
    }
}
