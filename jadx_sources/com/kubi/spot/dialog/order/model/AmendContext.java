package com.kubi.spot.dialog.order.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.kubi.tradebase.BizType;
import com.kubi.tradebase.OrderType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AmendContext.kt */
/* JADX INFO: loaded from: classes47.dex */
@Keep
@Metadata(m90083d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001b\u001a\u00020\tHÆ\u0003J\t\u0010\u001c\u001a\u00020\u000bHÆ\u0003J;\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0006\u0010\u001e\u001a\u00020\u001fJ\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#HÖ\u0003J\t\u0010$\u001a\u00020\u001fHÖ\u0001J\t\u0010%\u001a\u00020\u0005HÖ\u0001J\u0016\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\u001fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006+"}, m90084d2 = {"Lcom/kubi/spot/dialog/order/model/AmendContext;", "Landroid/os/Parcelable;", "bizType", "Lcom/kubi/tradebase/BizType;", "symbol", "", "orderType", "Lcom/kubi/tradebase/OrderType;", "oldOrder", "Lcom/kubi/spot/dialog/order/model/OrderEntity;", "newParams", "Lcom/kubi/spot/dialog/order/model/AmendParams;", "<init>", "(Lcom/kubi/tradebase/BizType;Ljava/lang/String;Lcom/kubi/tradebase/OrderType;Lcom/kubi/spot/dialog/order/model/OrderEntity;Lcom/kubi/spot/dialog/order/model/AmendParams;)V", "getBizType", "()Lcom/kubi/tradebase/BizType;", "getSymbol", "()Ljava/lang/String;", "getOrderType", "()Lcom/kubi/tradebase/OrderType;", "getOldOrder", "()Lcom/kubi/spot/dialog/order/model/OrderEntity;", "getNewParams", "()Lcom/kubi/spot/dialog/order/model/AmendParams;", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "SpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class AmendContext implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<AmendContext> CREATOR = new C25293a();

    @NotNull
    private final BizType bizType;

    @NotNull
    private final AmendParams newParams;

    @NotNull
    private final OrderEntity oldOrder;

    @NotNull
    private final OrderType orderType;

    @NotNull
    private final String symbol;

    /* JADX INFO: renamed from: com.kubi.spot.dialog.order.model.AmendContext$a */
    /* JADX INFO: compiled from: AmendContext.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C25293a implements Parcelable.Creator<AmendContext> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final AmendContext createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new AmendContext(BizType.valueOf(parcel.readString()), parcel.readString(), OrderType.valueOf(parcel.readString()), OrderEntity.CREATOR.createFromParcel(parcel), AmendParams.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final AmendContext[] newArray(int i11) {
            return new AmendContext[i11];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AmendContext)) {
            return false;
        }
        AmendContext amendContext = (AmendContext) other;
        return this.bizType == amendContext.bizType && Intrinsics.areEqual(this.symbol, amendContext.symbol) && this.orderType == amendContext.orderType && Intrinsics.areEqual(this.oldOrder, amendContext.oldOrder) && Intrinsics.areEqual(this.newParams, amendContext.newParams);
    }

    public AmendContext(@NotNull BizType bizType, @NotNull String symbol, @NotNull OrderType orderType, @NotNull OrderEntity oldOrder, @NotNull AmendParams newParams) {
        Intrinsics.checkNotNullParameter(bizType, "bizType");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(orderType, "orderType");
        Intrinsics.checkNotNullParameter(oldOrder, "oldOrder");
        Intrinsics.checkNotNullParameter(newParams, "newParams");
        this.bizType = bizType;
        this.symbol = symbol;
        this.orderType = orderType;
        this.oldOrder = oldOrder;
        this.newParams = newParams;
    }

    public static /* synthetic */ AmendContext copy$default(AmendContext amendContext, BizType bizType, String str, OrderType orderType, OrderEntity orderEntity, AmendParams amendParams, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            bizType = amendContext.bizType;
        }
        if ((i11 & 2) != 0) {
            str = amendContext.symbol;
        }
        if ((i11 & 4) != 0) {
            orderType = amendContext.orderType;
        }
        if ((i11 & 8) != 0) {
            orderEntity = amendContext.oldOrder;
        }
        if ((i11 & 16) != 0) {
            amendParams = amendContext.newParams;
        }
        AmendParams amendParams2 = amendParams;
        OrderType orderType2 = orderType;
        return amendContext.copy(bizType, str, orderType2, orderEntity, amendParams2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final BizType getBizType() {
        return this.bizType;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSymbol() {
        return this.symbol;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final OrderType getOrderType() {
        return this.orderType;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final OrderEntity getOldOrder() {
        return this.oldOrder;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final AmendParams getNewParams() {
        return this.newParams;
    }

    @NotNull
    public final AmendContext copy(@NotNull BizType bizType, @NotNull String symbol, @NotNull OrderType orderType, @NotNull OrderEntity oldOrder, @NotNull AmendParams newParams) {
        Intrinsics.checkNotNullParameter(bizType, "bizType");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(orderType, "orderType");
        Intrinsics.checkNotNullParameter(oldOrder, "oldOrder");
        Intrinsics.checkNotNullParameter(newParams, "newParams");
        return new AmendContext(bizType, symbol, orderType, oldOrder, newParams);
    }

    @NotNull
    public final BizType getBizType() {
        return this.bizType;
    }

    @NotNull
    public final AmendParams getNewParams() {
        return this.newParams;
    }

    @NotNull
    public final OrderEntity getOldOrder() {
        return this.oldOrder;
    }

    @NotNull
    public final OrderType getOrderType() {
        return this.orderType;
    }

    @NotNull
    public final String getSymbol() {
        return this.symbol;
    }

    public int hashCode() {
        return (((((((this.bizType.hashCode() * 31) + this.symbol.hashCode()) * 31) + this.orderType.hashCode()) * 31) + this.oldOrder.hashCode()) * 31) + this.newParams.hashCode();
    }

    @NotNull
    public String toString() {
        return "AmendContext(bizType=" + this.bizType + ", symbol=" + this.symbol + ", orderType=" + this.orderType + ", oldOrder=" + this.oldOrder + ", newParams=" + this.newParams + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.bizType.name());
        dest.writeString(this.symbol);
        dest.writeString(this.orderType.name());
        this.oldOrder.writeToParcel(dest, flags);
        this.newParams.writeToParcel(dest, flags);
    }
}
