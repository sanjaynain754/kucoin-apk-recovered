package com.kubi.flutter.widget.kline;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import cn.jiguang.privates.push.constants.JPushConstants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.flutter.proto.kline.OrderItem;
import com.kubi.flutter.proto.kline.OrderItemKt$Dsl;
import com.kubi.p110rn.Constants;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import java.math.BigDecimal;
import java.util.Locale;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: KlineOrderEntity.kt */
/* JADX INFO: loaded from: classes13.dex */
@Keep
@Metadata(m90083d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u007f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u000f\u0010\u0010J\u000e\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020/J\u0010\u00100\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0012J\u000b\u00101\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0010\u00107\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0012J\u000b\u00108\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0086\u0001\u0010:\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010;J\u0006\u0010<\u001a\u00020=J\u0013\u0010>\u001a\u00020?2\b\u0010@\u001a\u0004\u0018\u00010AHÖ\u0003J\t\u0010B\u001a\u00020=HÖ\u0001J\t\u0010C\u001a\u00020\u0005HÖ\u0001J\u0016\u0010D\u001a\u00020E2\u0006\u0010F\u001a\u00020G2\u0006\u0010H\u001a\u00020=R\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0015\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0017\"\u0004\b\u001b\u0010\u0019R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0017\"\u0004\b\u001d\u0010\u0019R\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001c\u0010\n\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u001f\"\u0004\b#\u0010!R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u001f\"\u0004\b%\u0010!R\u001e\u0010\f\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0015\u001a\u0004\b&\u0010\u0012\"\u0004\b'\u0010\u0014R\u001c\u0010\r\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u0017\"\u0004\b)\u0010\u0019R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\u0017\"\u0004\b+\u0010\u0019¨\u0006I"}, m90084d2 = {"Lcom/kubi/flutter/widget/kline/ActiveOrderEntity;", "Landroid/os/Parcelable;", JPushConstants.Operation.KEY_SEQUENCE, "", "orderId", "", "symbol", "side", FirebaseAnalytics.Param.PRICE, "Ljava/math/BigDecimal;", "size", "dealSize", "time", "unit", "displayType", "<init>", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;)V", "getSequence", "()Ljava/lang/Long;", "setSequence", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getOrderId", "()Ljava/lang/String;", "setOrderId", "(Ljava/lang/String;)V", "getSymbol", "setSymbol", "getSide", "setSide", "getPrice", "()Ljava/math/BigDecimal;", "setPrice", "(Ljava/math/BigDecimal;)V", "getSize", "setSize", "getDealSize", "setDealSize", "getTime", "setTime", "getUnit", "setUnit", "getDisplayType", "setDisplayType", "toActiveOrderItem", "Lcom/kubi/flutter/proto/kline/OrderItem;", Constants.BIZ, "Lcom/kubi/flutter/proto/kline/OrderItem$BizType;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;)Lcom/kubi/flutter/widget/kline/ActiveOrderEntity;", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "LKLineWidget_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nKlineOrderEntity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KlineOrderEntity.kt\ncom/kubi/flutter/widget/kline/ActiveOrderEntity\n+ 2 OrderItemKt.kt\ncom/kubi/flutter/proto/kline/OrderItemKtKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,89:1\n8#2:90\n1#3:91\n*S KotlinDebug\n*F\n+ 1 KlineOrderEntity.kt\ncom/kubi/flutter/widget/kline/ActiveOrderEntity\n*L\n65#1:90\n65#1:91\n*E\n"})
public final /* data */ class ActiveOrderEntity implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<ActiveOrderEntity> CREATOR = new C12746a();

    @Nullable
    private BigDecimal dealSize;

    @Nullable
    private String displayType;

    @Nullable
    private String orderId;

    @Nullable
    private BigDecimal price;

    @Nullable
    private Long sequence;

    @Nullable
    private String side;

    @Nullable
    private BigDecimal size;

    @Nullable
    private String symbol;

    @Nullable
    private Long time;

    @Nullable
    private String unit;

    /* JADX INFO: renamed from: com.kubi.flutter.widget.kline.ActiveOrderEntity$a */
    /* JADX INFO: compiled from: KlineOrderEntity.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C12746a implements Parcelable.Creator<ActiveOrderEntity> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ActiveOrderEntity createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ActiveOrderEntity(parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString(), parcel.readString(), parcel.readString(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null, parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final ActiveOrderEntity[] newArray(int i11) {
            return new ActiveOrderEntity[i11];
        }
    }

    public ActiveOrderEntity() {
        this(null, null, null, null, null, null, null, null, null, null, 1023, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ActiveOrderEntity)) {
            return false;
        }
        ActiveOrderEntity activeOrderEntity = (ActiveOrderEntity) other;
        return Intrinsics.areEqual(this.sequence, activeOrderEntity.sequence) && Intrinsics.areEqual(this.orderId, activeOrderEntity.orderId) && Intrinsics.areEqual(this.symbol, activeOrderEntity.symbol) && Intrinsics.areEqual(this.side, activeOrderEntity.side) && Intrinsics.areEqual(this.price, activeOrderEntity.price) && Intrinsics.areEqual(this.size, activeOrderEntity.size) && Intrinsics.areEqual(this.dealSize, activeOrderEntity.dealSize) && Intrinsics.areEqual(this.time, activeOrderEntity.time) && Intrinsics.areEqual(this.unit, activeOrderEntity.unit) && Intrinsics.areEqual(this.displayType, activeOrderEntity.displayType);
    }

    public ActiveOrderEntity(@Nullable Long l11, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable BigDecimal bigDecimal, @Nullable BigDecimal bigDecimal2, @Nullable BigDecimal bigDecimal3, @Nullable Long l12, @Nullable String str4, @Nullable String str5) {
        this.sequence = l11;
        this.orderId = str;
        this.symbol = str2;
        this.side = str3;
        this.price = bigDecimal;
        this.size = bigDecimal2;
        this.dealSize = bigDecimal3;
        this.time = l12;
        this.unit = str4;
        this.displayType = str5;
    }

    public static /* synthetic */ ActiveOrderEntity copy$default(ActiveOrderEntity activeOrderEntity, Long l11, String str, String str2, String str3, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, Long l12, String str4, String str5, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            l11 = activeOrderEntity.sequence;
        }
        if ((i11 & 2) != 0) {
            str = activeOrderEntity.orderId;
        }
        if ((i11 & 4) != 0) {
            str2 = activeOrderEntity.symbol;
        }
        if ((i11 & 8) != 0) {
            str3 = activeOrderEntity.side;
        }
        if ((i11 & 16) != 0) {
            bigDecimal = activeOrderEntity.price;
        }
        if ((i11 & 32) != 0) {
            bigDecimal2 = activeOrderEntity.size;
        }
        if ((i11 & 64) != 0) {
            bigDecimal3 = activeOrderEntity.dealSize;
        }
        if ((i11 & 128) != 0) {
            l12 = activeOrderEntity.time;
        }
        if ((i11 & 256) != 0) {
            str4 = activeOrderEntity.unit;
        }
        if ((i11 & 512) != 0) {
            str5 = activeOrderEntity.displayType;
        }
        String str6 = str4;
        String str7 = str5;
        BigDecimal bigDecimal4 = bigDecimal3;
        Long l13 = l12;
        BigDecimal bigDecimal5 = bigDecimal;
        BigDecimal bigDecimal6 = bigDecimal2;
        return activeOrderEntity.copy(l11, str, str2, str3, bigDecimal5, bigDecimal6, bigDecimal4, l13, str6, str7);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Long getSequence() {
        return this.sequence;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getDisplayType() {
        return this.displayType;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getOrderId() {
        return this.orderId;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSymbol() {
        return this.symbol;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getSide() {
        return this.side;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final BigDecimal getPrice() {
        return this.price;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final BigDecimal getSize() {
        return this.size;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final BigDecimal getDealSize() {
        return this.dealSize;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Long getTime() {
        return this.time;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getUnit() {
        return this.unit;
    }

    @NotNull
    public final ActiveOrderEntity copy(@Nullable Long sequence, @Nullable String orderId, @Nullable String symbol, @Nullable String side, @Nullable BigDecimal price, @Nullable BigDecimal size, @Nullable BigDecimal dealSize, @Nullable Long time, @Nullable String unit, @Nullable String displayType) {
        return new ActiveOrderEntity(sequence, orderId, symbol, side, price, size, dealSize, time, unit, displayType);
    }

    @Nullable
    public final BigDecimal getDealSize() {
        return this.dealSize;
    }

    @Nullable
    public final String getDisplayType() {
        return this.displayType;
    }

    @Nullable
    public final String getOrderId() {
        return this.orderId;
    }

    @Nullable
    public final BigDecimal getPrice() {
        return this.price;
    }

    @Nullable
    public final Long getSequence() {
        return this.sequence;
    }

    @Nullable
    public final String getSide() {
        return this.side;
    }

    @Nullable
    public final BigDecimal getSize() {
        return this.size;
    }

    @Nullable
    public final String getSymbol() {
        return this.symbol;
    }

    @Nullable
    public final Long getTime() {
        return this.time;
    }

    @Nullable
    public final String getUnit() {
        return this.unit;
    }

    public int hashCode() {
        Long l11 = this.sequence;
        int iHashCode = (l11 == null ? 0 : l11.hashCode()) * 31;
        String str = this.orderId;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.symbol;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.side;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        BigDecimal bigDecimal = this.price;
        int iHashCode5 = (iHashCode4 + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        BigDecimal bigDecimal2 = this.size;
        int iHashCode6 = (iHashCode5 + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
        BigDecimal bigDecimal3 = this.dealSize;
        int iHashCode7 = (iHashCode6 + (bigDecimal3 == null ? 0 : bigDecimal3.hashCode())) * 31;
        Long l12 = this.time;
        int iHashCode8 = (iHashCode7 + (l12 == null ? 0 : l12.hashCode())) * 31;
        String str4 = this.unit;
        int iHashCode9 = (iHashCode8 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.displayType;
        return iHashCode9 + (str5 != null ? str5.hashCode() : 0);
    }

    public final void setDealSize(@Nullable BigDecimal bigDecimal) {
        this.dealSize = bigDecimal;
    }

    public final void setDisplayType(@Nullable String str) {
        this.displayType = str;
    }

    public final void setOrderId(@Nullable String str) {
        this.orderId = str;
    }

    public final void setPrice(@Nullable BigDecimal bigDecimal) {
        this.price = bigDecimal;
    }

    public final void setSequence(@Nullable Long l11) {
        this.sequence = l11;
    }

    public final void setSide(@Nullable String str) {
        this.side = str;
    }

    public final void setSize(@Nullable BigDecimal bigDecimal) {
        this.size = bigDecimal;
    }

    public final void setSymbol(@Nullable String str) {
        this.symbol = str;
    }

    public final void setTime(@Nullable Long l11) {
        this.time = l11;
    }

    public final void setUnit(@Nullable String str) {
        this.unit = str;
    }

    @NotNull
    public final OrderItem toActiveOrderItem(@NotNull OrderItem.BizType biz) {
        OrderItem.OrderSide orderSide;
        Intrinsics.checkNotNullParameter(biz, "biz");
        OrderItemKt$Dsl.Companion companion = OrderItemKt$Dsl.f22148b;
        OrderItem.C12687b c12687bNewBuilder = OrderItem.newBuilder();
        Intrinsics.checkNotNullExpressionValue(c12687bNewBuilder, "newBuilder(...)");
        OrderItemKt$Dsl orderItemKt$Dsl_create = companion._create(c12687bNewBuilder);
        orderItemKt$Dsl_create.m23981h(C27039d.m66652l(this.time) / ((long) 1000));
        orderItemKt$Dsl_create.m23975b(C27039d.m66647g(this.size));
        orderItemKt$Dsl_create.m23978e(C27039d.m66647g(this.price));
        orderItemKt$Dsl_create.m23980g(C27041f.m66668h(this.symbol));
        String lowerCase = C27041f.m66668h(this.side).toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        if (Intrinsics.areEqual(lowerCase, "buy")) {
            orderSide = OrderItem.OrderSide.BUY_LONG;
        } else {
            orderSide = Intrinsics.areEqual(lowerCase, "sell") ? OrderItem.OrderSide.SELL_SHORT : OrderItem.OrderSide.UNRECOGNIZED;
        }
        orderItemKt$Dsl_create.m23979f(orderSide);
        orderItemKt$Dsl_create.m23976c(biz);
        return orderItemKt$Dsl_create.m23974a();
    }

    @NotNull
    public String toString() {
        return "ActiveOrderEntity(sequence=" + this.sequence + ", orderId=" + this.orderId + ", symbol=" + this.symbol + ", side=" + this.side + ", price=" + this.price + ", size=" + this.size + ", dealSize=" + this.dealSize + ", time=" + this.time + ", unit=" + this.unit + ", displayType=" + this.displayType + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Long l11 = this.sequence;
        if (l11 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeLong(l11.longValue());
        }
        dest.writeString(this.orderId);
        dest.writeString(this.symbol);
        dest.writeString(this.side);
        dest.writeSerializable(this.price);
        dest.writeSerializable(this.size);
        dest.writeSerializable(this.dealSize);
        Long l12 = this.time;
        if (l12 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeLong(l12.longValue());
        }
        dest.writeString(this.unit);
        dest.writeString(this.displayType);
    }

    public /* synthetic */ ActiveOrderEntity(Long l11, String str, String str2, String str3, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, Long l12, String str4, String str5, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : l11, (i11 & 2) != 0 ? null : str, (i11 & 4) != 0 ? null : str2, (i11 & 8) != 0 ? null : str3, (i11 & 16) != 0 ? null : bigDecimal, (i11 & 32) != 0 ? null : bigDecimal2, (i11 & 64) != 0 ? null : bigDecimal3, (i11 & 128) != 0 ? null : l12, (i11 & 256) != 0 ? null : str4, (i11 & 512) != 0 ? null : str5);
    }
}
