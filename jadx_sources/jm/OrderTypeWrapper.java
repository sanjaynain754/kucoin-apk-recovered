package jm;

import android.os.Bundle;
import com.kubi.kumex.logic.constant.OrderTradeType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: jm.l, reason: from toString */
/* JADX INFO: compiled from: OrderTradeType.kt */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m90084d2 = {"Lcom/kubi/kumex/logic/constant/OrderTypeWrapper;", "", "orderType", "Lcom/kubi/kumex/logic/constant/OrderTradeType;", "extraData", "Landroid/os/Bundle;", "<init>", "(Lcom/kubi/kumex/logic/constant/OrderTradeType;Landroid/os/Bundle;)V", "getOrderType", "()Lcom/kubi/kumex/logic/constant/OrderTradeType;", "getExtraData", "()Landroid/os/Bundle;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "KumexApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class OrderTypeWrapper {

    /* JADX INFO: renamed from: a, reason: from toString */
    @NotNull
    public final OrderTradeType orderType;

    /* JADX INFO: renamed from: b, reason: from toString */
    @Nullable
    public final Bundle extraData;

    public OrderTypeWrapper(@NotNull OrderTradeType orderType, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(orderType, "orderType");
        this.orderType = orderType;
        this.extraData = bundle;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OrderTypeWrapper)) {
            return false;
        }
        OrderTypeWrapper orderTypeWrapper = (OrderTypeWrapper) other;
        return this.orderType == orderTypeWrapper.orderType && Intrinsics.areEqual(this.extraData, orderTypeWrapper.extraData);
    }

    public /* synthetic */ OrderTypeWrapper(OrderTradeType orderTradeType, Bundle bundle, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(orderTradeType, (i11 & 2) != 0 ? null : bundle);
    }

    @Nullable
    /* JADX INFO: renamed from: a, reason: from getter */
    public final Bundle getExtraData() {
        return this.extraData;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final OrderTradeType getOrderType() {
        return this.orderType;
    }

    public int hashCode() {
        int iHashCode = this.orderType.hashCode() * 31;
        Bundle bundle = this.extraData;
        return iHashCode + (bundle == null ? 0 : bundle.hashCode());
    }

    @NotNull
    public String toString() {
        return "OrderTypeWrapper(orderType=" + this.orderType + ", extraData=" + this.extraData + ')';
    }
}
