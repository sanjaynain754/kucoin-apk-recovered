package com.kubi.spot.dialog.order.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.tradebase.OrderType;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: OrderEntity.kt */
/* JADX INFO: loaded from: classes47.dex */
@Keep
@Metadata(m90083d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fJ\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\bHÆ\u0003JQ\u0010%\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0006\u0010&\u001a\u00020'J\u0013\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010+HÖ\u0003J\t\u0010,\u001a\u00020'HÖ\u0001J\t\u0010-\u001a\u00020\u0003HÖ\u0001J\u0016\u0010.\u001a\u00020/2\u0006\u00100\u001a\u0002012\u0006\u00102\u001a\u00020'R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u000e\"\u0004\b\u0012\u0010\u0010R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001c\u0010\t\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0018\"\u0004\b\u001c\u0010\u001aR\u001c\u0010\n\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0018\"\u0004\b\u001e\u0010\u001a¨\u00063"}, m90084d2 = {"Lcom/kubi/spot/dialog/order/model/OrderEntity;", "Landroid/os/Parcelable;", "orderId", "", "symbol", "orderType", "Lcom/kubi/tradebase/OrderType;", FirebaseAnalytics.Param.PRICE, "Ljava/math/BigDecimal;", "size", "dealSize", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/kubi/tradebase/OrderType;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;)V", "getOrderId", "()Ljava/lang/String;", "setOrderId", "(Ljava/lang/String;)V", "getSymbol", "setSymbol", "getOrderType", "()Lcom/kubi/tradebase/OrderType;", "setOrderType", "(Lcom/kubi/tradebase/OrderType;)V", "getPrice", "()Ljava/math/BigDecimal;", "setPrice", "(Ljava/math/BigDecimal;)V", "getSize", "setSize", "getDealSize", "setDealSize", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "SpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class OrderEntity implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<OrderEntity> CREATOR = new C25297a();

    @Nullable
    private BigDecimal dealSize;

    @Nullable
    private String orderId;

    @Nullable
    private OrderType orderType;

    @Nullable
    private BigDecimal price;

    @Nullable
    private BigDecimal size;

    @Nullable
    private String symbol;

    /* JADX INFO: renamed from: com.kubi.spot.dialog.order.model.OrderEntity$a */
    /* JADX INFO: compiled from: OrderEntity.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C25297a implements Parcelable.Creator<OrderEntity> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final OrderEntity createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new OrderEntity(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : OrderType.valueOf(parcel.readString()), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final OrderEntity[] newArray(int i11) {
            return new OrderEntity[i11];
        }
    }

    public OrderEntity() {
        this(null, null, null, null, null, null, 63, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OrderEntity)) {
            return false;
        }
        OrderEntity orderEntity = (OrderEntity) other;
        return Intrinsics.areEqual(this.orderId, orderEntity.orderId) && Intrinsics.areEqual(this.symbol, orderEntity.symbol) && this.orderType == orderEntity.orderType && Intrinsics.areEqual(this.price, orderEntity.price) && Intrinsics.areEqual(this.size, orderEntity.size) && Intrinsics.areEqual(this.dealSize, orderEntity.dealSize);
    }

    public OrderEntity(@Nullable String str, @Nullable String str2, @Nullable OrderType orderType, @Nullable BigDecimal bigDecimal, @Nullable BigDecimal bigDecimal2, @Nullable BigDecimal bigDecimal3) {
        this.orderId = str;
        this.symbol = str2;
        this.orderType = orderType;
        this.price = bigDecimal;
        this.size = bigDecimal2;
        this.dealSize = bigDecimal3;
    }

    public static /* synthetic */ OrderEntity copy$default(OrderEntity orderEntity, String str, String str2, OrderType orderType, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = orderEntity.orderId;
        }
        if ((i11 & 2) != 0) {
            str2 = orderEntity.symbol;
        }
        if ((i11 & 4) != 0) {
            orderType = orderEntity.orderType;
        }
        if ((i11 & 8) != 0) {
            bigDecimal = orderEntity.price;
        }
        if ((i11 & 16) != 0) {
            bigDecimal2 = orderEntity.size;
        }
        if ((i11 & 32) != 0) {
            bigDecimal3 = orderEntity.dealSize;
        }
        BigDecimal bigDecimal4 = bigDecimal2;
        BigDecimal bigDecimal5 = bigDecimal3;
        return orderEntity.copy(str, str2, orderType, bigDecimal, bigDecimal4, bigDecimal5);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getOrderId() {
        return this.orderId;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSymbol() {
        return this.symbol;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final OrderType getOrderType() {
        return this.orderType;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final BigDecimal getPrice() {
        return this.price;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final BigDecimal getSize() {
        return this.size;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final BigDecimal getDealSize() {
        return this.dealSize;
    }

    @NotNull
    public final OrderEntity copy(@Nullable String orderId, @Nullable String symbol, @Nullable OrderType orderType, @Nullable BigDecimal price, @Nullable BigDecimal size, @Nullable BigDecimal dealSize) {
        return new OrderEntity(orderId, symbol, orderType, price, size, dealSize);
    }

    @Nullable
    public final BigDecimal getDealSize() {
        return this.dealSize;
    }

    @Nullable
    public final String getOrderId() {
        return this.orderId;
    }

    @Nullable
    public final OrderType getOrderType() {
        return this.orderType;
    }

    @Nullable
    public final BigDecimal getPrice() {
        return this.price;
    }

    @Nullable
    public final BigDecimal getSize() {
        return this.size;
    }

    @Nullable
    public final String getSymbol() {
        return this.symbol;
    }

    public int hashCode() {
        String str = this.orderId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.symbol;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        OrderType orderType = this.orderType;
        int iHashCode3 = (iHashCode2 + (orderType == null ? 0 : orderType.hashCode())) * 31;
        BigDecimal bigDecimal = this.price;
        int iHashCode4 = (iHashCode3 + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        BigDecimal bigDecimal2 = this.size;
        int iHashCode5 = (iHashCode4 + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
        BigDecimal bigDecimal3 = this.dealSize;
        return iHashCode5 + (bigDecimal3 != null ? bigDecimal3.hashCode() : 0);
    }

    public final void setDealSize(@Nullable BigDecimal bigDecimal) {
        this.dealSize = bigDecimal;
    }

    public final void setOrderId(@Nullable String str) {
        this.orderId = str;
    }

    public final void setOrderType(@Nullable OrderType orderType) {
        this.orderType = orderType;
    }

    public final void setPrice(@Nullable BigDecimal bigDecimal) {
        this.price = bigDecimal;
    }

    public final void setSize(@Nullable BigDecimal bigDecimal) {
        this.size = bigDecimal;
    }

    public final void setSymbol(@Nullable String str) {
        this.symbol = str;
    }

    @NotNull
    public String toString() {
        return "OrderEntity(orderId=" + this.orderId + ", symbol=" + this.symbol + ", orderType=" + this.orderType + ", price=" + this.price + ", size=" + this.size + ", dealSize=" + this.dealSize + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.orderId);
        dest.writeString(this.symbol);
        OrderType orderType = this.orderType;
        if (orderType == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(orderType.name());
        }
        dest.writeSerializable(this.price);
        dest.writeSerializable(this.size);
        dest.writeSerializable(this.dealSize);
    }

    public /* synthetic */ OrderEntity(String str, String str2, OrderType orderType, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : orderType, (i11 & 8) != 0 ? null : bigDecimal, (i11 & 16) != 0 ? null : bigDecimal2, (i11 & 32) != 0 ? null : bigDecimal3);
    }
}
