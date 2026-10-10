package com.kubi.core.base.order.data;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p721wc.InterfaceC45789a;
import p852kotlin.Metadata;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: MakeOrderData.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0006\u0004\u0005\u0006\u0007\b\tJ\n\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u0016\u0082\u0001\u0006\n\u000b\f\r\u000e\u000fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0010À\u0006\u0001"}, m90084d2 = {"Lcom/kubi/core/base/order/data/MakeOrderData$Request;", "Lcom/kubi/core/base/arch/api/IRequest;", "getXValidationToken", "", "Limit", "Market", "LimitStop", "AdvancedLimit", "MarketStop", "Segment", "Lcom/kubi/core/base/order/data/MakeOrderData$Request$AdvancedLimit;", "Lcom/kubi/core/base/order/data/MakeOrderData$Request$Limit;", "Lcom/kubi/core/base/order/data/MakeOrderData$Request$LimitStop;", "Lcom/kubi/core/base/order/data/MakeOrderData$Request$Market;", "Lcom/kubi/core/base/order/data/MakeOrderData$Request$MarketStop;", "Lcom/kubi/core/base/order/data/MakeOrderData$Request$Segment;", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface MakeOrderData$Request extends InterfaceC45789a {

    /* JADX INFO: compiled from: MakeOrderData.kt */
    @Keep
    @Metadata(m90083d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002Bm\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u0004\u0012\b\b\u0002\u0010\r\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000e\u001a\u00020\t\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0010\u0010\u0011J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\t\u0010\"\u001a\u00020\tHÆ\u0003J\t\u0010#\u001a\u00020\u000bHÆ\u0003J\t\u0010$\u001a\u00020\u0004HÆ\u0003J\t\u0010%\u001a\u00020\u0004HÆ\u0003J\t\u0010&\u001a\u00020\tHÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0004HÆ\u0003Jw\u0010(\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\u00042\b\b\u0002\u0010\u000e\u001a\u00020\t2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\u0006\u0010)\u001a\u00020*J\u0013\u0010+\u001a\u00020\t2\b\u0010,\u001a\u0004\u0018\u00010-HÖ\u0003J\t\u0010.\u001a\u00020*HÖ\u0001J\t\u0010/\u001a\u00020\u0004HÖ\u0001J\u0016\u00100\u001a\u0002012\u0006\u00102\u001a\u0002032\u0006\u00104\u001a\u00020*R\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\f\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0013R\u0011\u0010\r\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0013R\u0011\u0010\u000e\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0018R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0013¨\u00065"}, m90084d2 = {"Lcom/kubi/core/base/order/data/MakeOrderData$Request$AdvancedLimit;", "Landroid/os/Parcelable;", "Lcom/kubi/core/base/order/data/MakeOrderData$Request;", "symbol", "", "side", "size", FirebaseAnalytics.Param.PRICE, "postOnly", "", "timeInForce", "Lcom/kubi/core/base/order/data/TimeInForce;", "tradeType", "orderType", "isFullPercent", "validationToken", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/kubi/core/base/order/data/TimeInForce;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V", "getSymbol", "()Ljava/lang/String;", "getSide", "getSize", "getPrice", "getPostOnly", "()Z", "getTimeInForce", "()Lcom/kubi/core/base/order/data/TimeInForce;", "getTradeType", "getOrderType", "getValidationToken", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class AdvancedLimit implements Parcelable, MakeOrderData$Request {

        @NotNull
        public static final Parcelable.Creator<AdvancedLimit> CREATOR = new C11605a();
        private final boolean isFullPercent;

        @NotNull
        private final String orderType;
        private final boolean postOnly;

        @Nullable
        private final String price;

        @Nullable
        private final String side;

        @Nullable
        private final String size;

        @Nullable
        private final String symbol;

        @NotNull
        private final TimeInForce timeInForce;

        @NotNull
        private final String tradeType;

        @Nullable
        private final String validationToken;

        /* JADX INFO: renamed from: com.kubi.core.base.order.data.MakeOrderData$Request$AdvancedLimit$a */
        /* JADX INFO: compiled from: MakeOrderData.kt */
        @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
        public static final class C11605a implements Parcelable.Creator<AdvancedLimit> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final AdvancedLimit createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string = parcel.readString();
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                boolean z11 = false;
                if (parcel.readInt() != 0) {
                    z11 = true;
                }
                TimeInForce timeInForce = (TimeInForce) parcel.readParcelable(AdvancedLimit.class.getClassLoader());
                String string5 = parcel.readString();
                boolean z12 = true;
                String string6 = parcel.readString();
                if (parcel.readInt() == 0) {
                    z12 = false;
                }
                return new AdvancedLimit(string, string2, string3, string4, z11, timeInForce, string5, string6, z12, parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final AdvancedLimit[] newArray(int i11) {
                return new AdvancedLimit[i11];
            }
        }

        public AdvancedLimit(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, boolean z11, @NotNull TimeInForce timeInForce, @NotNull String tradeType, @NotNull String orderType, boolean z12, @Nullable String str5) {
            Intrinsics.checkNotNullParameter(timeInForce, "timeInForce");
            Intrinsics.checkNotNullParameter(tradeType, "tradeType");
            Intrinsics.checkNotNullParameter(orderType, "orderType");
            this.symbol = str;
            this.side = str2;
            this.size = str3;
            this.price = str4;
            this.postOnly = z11;
            this.timeInForce = timeInForce;
            this.tradeType = tradeType;
            this.orderType = orderType;
            this.isFullPercent = z12;
            this.validationToken = str5;
        }

        public static /* synthetic */ AdvancedLimit copy$default(AdvancedLimit advancedLimit, String str, String str2, String str3, String str4, boolean z11, TimeInForce timeInForce, String str5, String str6, boolean z12, String str7, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = advancedLimit.symbol;
            }
            if ((i11 & 2) != 0) {
                str2 = advancedLimit.side;
            }
            if ((i11 & 4) != 0) {
                str3 = advancedLimit.size;
            }
            if ((i11 & 8) != 0) {
                str4 = advancedLimit.price;
            }
            if ((i11 & 16) != 0) {
                z11 = advancedLimit.postOnly;
            }
            if ((i11 & 32) != 0) {
                timeInForce = advancedLimit.timeInForce;
            }
            if ((i11 & 64) != 0) {
                str5 = advancedLimit.tradeType;
            }
            if ((i11 & 128) != 0) {
                str6 = advancedLimit.orderType;
            }
            if ((i11 & 256) != 0) {
                z12 = advancedLimit.isFullPercent;
            }
            if ((i11 & 512) != 0) {
                str7 = advancedLimit.validationToken;
            }
            boolean z13 = z12;
            String str8 = str7;
            String str9 = str5;
            String str10 = str6;
            boolean z14 = z11;
            TimeInForce timeInForce2 = timeInForce;
            return advancedLimit.copy(str, str2, str3, str4, z14, timeInForce2, str9, str10, z13, str8);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AdvancedLimit)) {
                return false;
            }
            AdvancedLimit advancedLimit = (AdvancedLimit) other;
            return Intrinsics.areEqual(this.symbol, advancedLimit.symbol) && Intrinsics.areEqual(this.side, advancedLimit.side) && Intrinsics.areEqual(this.size, advancedLimit.size) && Intrinsics.areEqual(this.price, advancedLimit.price) && this.postOnly == advancedLimit.postOnly && Intrinsics.areEqual(this.timeInForce, advancedLimit.timeInForce) && Intrinsics.areEqual(this.tradeType, advancedLimit.tradeType) && Intrinsics.areEqual(this.orderType, advancedLimit.orderType) && this.isFullPercent == advancedLimit.isFullPercent && Intrinsics.areEqual(this.validationToken, advancedLimit.validationToken);
        }

        @Nullable
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getSymbol() {
            return this.symbol;
        }

        @Nullable
        /* JADX INFO: renamed from: component10, reason: from getter */
        public final String getValidationToken() {
            return this.validationToken;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getSide() {
            return this.side;
        }

        @Nullable
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getSize() {
            return this.size;
        }

        @Nullable
        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getPrice() {
            return this.price;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final boolean getPostOnly() {
            return this.postOnly;
        }

        @NotNull
        /* JADX INFO: renamed from: component6, reason: from getter */
        public final TimeInForce getTimeInForce() {
            return this.timeInForce;
        }

        @NotNull
        /* JADX INFO: renamed from: component7, reason: from getter */
        public final String getTradeType() {
            return this.tradeType;
        }

        @NotNull
        /* JADX INFO: renamed from: component8, reason: from getter */
        public final String getOrderType() {
            return this.orderType;
        }

        /* JADX INFO: renamed from: component9, reason: from getter */
        public final boolean getIsFullPercent() {
            return this.isFullPercent;
        }

        @NotNull
        public final AdvancedLimit copy(@Nullable String symbol, @Nullable String side, @Nullable String size, @Nullable String price, boolean postOnly, @NotNull TimeInForce timeInForce, @NotNull String tradeType, @NotNull String orderType, boolean isFullPercent, @Nullable String validationToken) {
            Intrinsics.checkNotNullParameter(timeInForce, "timeInForce");
            Intrinsics.checkNotNullParameter(tradeType, "tradeType");
            Intrinsics.checkNotNullParameter(orderType, "orderType");
            return new AdvancedLimit(symbol, side, size, price, postOnly, timeInForce, tradeType, orderType, isFullPercent, validationToken);
        }

        @NotNull
        public final String getOrderType() {
            return this.orderType;
        }

        public final boolean getPostOnly() {
            return this.postOnly;
        }

        @Nullable
        public final String getPrice() {
            return this.price;
        }

        @Nullable
        public final String getSide() {
            return this.side;
        }

        @Nullable
        public final String getSize() {
            return this.size;
        }

        @Nullable
        public final String getSymbol() {
            return this.symbol;
        }

        @NotNull
        public final TimeInForce getTimeInForce() {
            return this.timeInForce;
        }

        @NotNull
        public final String getTradeType() {
            return this.tradeType;
        }

        @Nullable
        public final String getValidationToken() {
            return this.validationToken;
        }

        public int hashCode() {
            String str = this.symbol;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.side;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.size;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.price;
            int iHashCode4 = (((((((((((iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31) + Boolean.hashCode(this.postOnly)) * 31) + this.timeInForce.hashCode()) * 31) + this.tradeType.hashCode()) * 31) + this.orderType.hashCode()) * 31) + Boolean.hashCode(this.isFullPercent)) * 31;
            String str5 = this.validationToken;
            return iHashCode4 + (str5 != null ? str5.hashCode() : 0);
        }

        public final boolean isFullPercent() {
            return this.isFullPercent;
        }

        @NotNull
        public String toString() {
            return "AdvancedLimit(symbol=" + this.symbol + ", side=" + this.side + ", size=" + this.size + ", price=" + this.price + ", postOnly=" + this.postOnly + ", timeInForce=" + this.timeInForce + ", tradeType=" + this.tradeType + ", orderType=" + this.orderType + ", isFullPercent=" + this.isFullPercent + ", validationToken=" + this.validationToken + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.symbol);
            dest.writeString(this.side);
            dest.writeString(this.size);
            dest.writeString(this.price);
            dest.writeInt(this.postOnly ? 1 : 0);
            dest.writeParcelable(this.timeInForce, flags);
            dest.writeString(this.tradeType);
            dest.writeString(this.orderType);
            dest.writeInt(this.isFullPercent ? 1 : 0);
            dest.writeString(this.validationToken);
        }

        @Override // com.kubi.core.base.order.data.MakeOrderData$Request
        @Nullable
        public /* bridge */ /* synthetic */ String getXValidationToken() {
            return super.getXValidationToken();
        }

        public /* synthetic */ AdvancedLimit(String str, String str2, String str3, String str4, boolean z11, TimeInForce timeInForce, String str5, String str6, boolean z12, String str7, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, str3, str4, (i11 & 16) != 0 ? false : z11, (i11 & 32) != 0 ? TimeInForce.GTC.INSTANCE : timeInForce, (i11 & 64) != 0 ? "SPOT" : str5, (i11 & 128) != 0 ? "LIMIT" : str6, (i11 & 256) != 0 ? false : z12, (i11 & 512) != 0 ? null : str7);
        }
    }

    /* JADX INFO: compiled from: MakeOrderData.kt */
    @Keep
    @Metadata(m90083d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0019\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002Bc\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u000f\u0010\u0010J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\t\u0010 \u001a\u00020\tHÆ\u0003J\t\u0010!\u001a\u00020\u0004HÆ\u0003J\t\u0010\"\u001a\u00020\u0004HÆ\u0003J\t\u0010#\u001a\u00020\rHÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0004HÆ\u0003Jm\u0010%\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\u0006\u0010&\u001a\u00020'J\u0013\u0010(\u001a\u00020\r2\b\u0010)\u001a\u0004\u0018\u00010*HÖ\u0003J\t\u0010+\u001a\u00020'HÖ\u0001J\t\u0010,\u001a\u00020\u0004HÖ\u0001J\u0016\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u0002002\u0006\u00101\u001a\u00020'R\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\n\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0012R\u0011\u0010\u000b\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0012R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u001aR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0012¨\u00062"}, m90084d2 = {"Lcom/kubi/core/base/order/data/MakeOrderData$Request$Limit;", "Landroid/os/Parcelable;", "Lcom/kubi/core/base/order/data/MakeOrderData$Request;", "symbol", "", "side", FirebaseAnalytics.Param.PRICE, "size", "timeInForce", "Lcom/kubi/core/base/order/data/TimeInForce;", "tradeType", "orderType", "isFullPercent", "", "validationToken", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/kubi/core/base/order/data/TimeInForce;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V", "getSymbol", "()Ljava/lang/String;", "getSide", "getPrice", "getSize", "getTimeInForce", "()Lcom/kubi/core/base/order/data/TimeInForce;", "getTradeType", "getOrderType", "()Z", "getValidationToken", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class Limit implements Parcelable, MakeOrderData$Request {

        @NotNull
        public static final Parcelable.Creator<Limit> CREATOR = new C11606a();
        private final boolean isFullPercent;

        @NotNull
        private final String orderType;

        @Nullable
        private final String price;

        @Nullable
        private final String side;

        @Nullable
        private final String size;

        @Nullable
        private final String symbol;

        @NotNull
        private final TimeInForce timeInForce;

        @NotNull
        private final String tradeType;

        @Nullable
        private final String validationToken;

        /* JADX INFO: renamed from: com.kubi.core.base.order.data.MakeOrderData$Request$Limit$a */
        /* JADX INFO: compiled from: MakeOrderData.kt */
        @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
        public static final class C11606a implements Parcelable.Creator<Limit> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Limit createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Limit(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (TimeInForce) parcel.readParcelable(Limit.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Limit[] newArray(int i11) {
                return new Limit[i11];
            }
        }

        public Limit(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @NotNull TimeInForce timeInForce, @NotNull String tradeType, @NotNull String orderType, boolean z11, @Nullable String str5) {
            Intrinsics.checkNotNullParameter(timeInForce, "timeInForce");
            Intrinsics.checkNotNullParameter(tradeType, "tradeType");
            Intrinsics.checkNotNullParameter(orderType, "orderType");
            this.symbol = str;
            this.side = str2;
            this.price = str3;
            this.size = str4;
            this.timeInForce = timeInForce;
            this.tradeType = tradeType;
            this.orderType = orderType;
            this.isFullPercent = z11;
            this.validationToken = str5;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Limit)) {
                return false;
            }
            Limit limit = (Limit) other;
            return Intrinsics.areEqual(this.symbol, limit.symbol) && Intrinsics.areEqual(this.side, limit.side) && Intrinsics.areEqual(this.price, limit.price) && Intrinsics.areEqual(this.size, limit.size) && Intrinsics.areEqual(this.timeInForce, limit.timeInForce) && Intrinsics.areEqual(this.tradeType, limit.tradeType) && Intrinsics.areEqual(this.orderType, limit.orderType) && this.isFullPercent == limit.isFullPercent && Intrinsics.areEqual(this.validationToken, limit.validationToken);
        }

        public static /* synthetic */ Limit copy$default(Limit limit, String str, String str2, String str3, String str4, TimeInForce timeInForce, String str5, String str6, boolean z11, String str7, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = limit.symbol;
            }
            if ((i11 & 2) != 0) {
                str2 = limit.side;
            }
            if ((i11 & 4) != 0) {
                str3 = limit.price;
            }
            if ((i11 & 8) != 0) {
                str4 = limit.size;
            }
            if ((i11 & 16) != 0) {
                timeInForce = limit.timeInForce;
            }
            if ((i11 & 32) != 0) {
                str5 = limit.tradeType;
            }
            if ((i11 & 64) != 0) {
                str6 = limit.orderType;
            }
            if ((i11 & 128) != 0) {
                z11 = limit.isFullPercent;
            }
            if ((i11 & 256) != 0) {
                str7 = limit.validationToken;
            }
            boolean z12 = z11;
            String str8 = str7;
            String str9 = str5;
            String str10 = str6;
            TimeInForce timeInForce2 = timeInForce;
            String str11 = str3;
            return limit.copy(str, str2, str11, str4, timeInForce2, str9, str10, z12, str8);
        }

        @Nullable
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getSymbol() {
            return this.symbol;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getSide() {
            return this.side;
        }

        @Nullable
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getPrice() {
            return this.price;
        }

        @Nullable
        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getSize() {
            return this.size;
        }

        @NotNull
        /* JADX INFO: renamed from: component5, reason: from getter */
        public final TimeInForce getTimeInForce() {
            return this.timeInForce;
        }

        @NotNull
        /* JADX INFO: renamed from: component6, reason: from getter */
        public final String getTradeType() {
            return this.tradeType;
        }

        @NotNull
        /* JADX INFO: renamed from: component7, reason: from getter */
        public final String getOrderType() {
            return this.orderType;
        }

        /* JADX INFO: renamed from: component8, reason: from getter */
        public final boolean getIsFullPercent() {
            return this.isFullPercent;
        }

        @Nullable
        /* JADX INFO: renamed from: component9, reason: from getter */
        public final String getValidationToken() {
            return this.validationToken;
        }

        @NotNull
        public final Limit copy(@Nullable String symbol, @Nullable String side, @Nullable String price, @Nullable String size, @NotNull TimeInForce timeInForce, @NotNull String tradeType, @NotNull String orderType, boolean isFullPercent, @Nullable String validationToken) {
            Intrinsics.checkNotNullParameter(timeInForce, "timeInForce");
            Intrinsics.checkNotNullParameter(tradeType, "tradeType");
            Intrinsics.checkNotNullParameter(orderType, "orderType");
            return new Limit(symbol, side, price, size, timeInForce, tradeType, orderType, isFullPercent, validationToken);
        }

        @NotNull
        public final String getOrderType() {
            return this.orderType;
        }

        @Nullable
        public final String getPrice() {
            return this.price;
        }

        @Nullable
        public final String getSide() {
            return this.side;
        }

        @Nullable
        public final String getSize() {
            return this.size;
        }

        @Nullable
        public final String getSymbol() {
            return this.symbol;
        }

        @NotNull
        public final TimeInForce getTimeInForce() {
            return this.timeInForce;
        }

        @NotNull
        public final String getTradeType() {
            return this.tradeType;
        }

        @Nullable
        public final String getValidationToken() {
            return this.validationToken;
        }

        public int hashCode() {
            String str = this.symbol;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.side;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.price;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.size;
            int iHashCode4 = (((((((((iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31) + this.timeInForce.hashCode()) * 31) + this.tradeType.hashCode()) * 31) + this.orderType.hashCode()) * 31) + Boolean.hashCode(this.isFullPercent)) * 31;
            String str5 = this.validationToken;
            return iHashCode4 + (str5 != null ? str5.hashCode() : 0);
        }

        public final boolean isFullPercent() {
            return this.isFullPercent;
        }

        @NotNull
        public String toString() {
            return "Limit(symbol=" + this.symbol + ", side=" + this.side + ", price=" + this.price + ", size=" + this.size + ", timeInForce=" + this.timeInForce + ", tradeType=" + this.tradeType + ", orderType=" + this.orderType + ", isFullPercent=" + this.isFullPercent + ", validationToken=" + this.validationToken + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.symbol);
            dest.writeString(this.side);
            dest.writeString(this.price);
            dest.writeString(this.size);
            dest.writeParcelable(this.timeInForce, flags);
            dest.writeString(this.tradeType);
            dest.writeString(this.orderType);
            dest.writeInt(this.isFullPercent ? 1 : 0);
            dest.writeString(this.validationToken);
        }

        @Override // com.kubi.core.base.order.data.MakeOrderData$Request
        @Nullable
        public /* bridge */ /* synthetic */ String getXValidationToken() {
            return super.getXValidationToken();
        }

        public /* synthetic */ Limit(String str, String str2, String str3, String str4, TimeInForce timeInForce, String str5, String str6, boolean z11, String str7, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, str3, str4, (i11 & 16) != 0 ? TimeInForce.GTC.INSTANCE : timeInForce, (i11 & 32) != 0 ? "SPOT" : str5, (i11 & 64) != 0 ? "LIMIT" : str6, (i11 & 128) != 0 ? false : z11, (i11 & 256) != 0 ? null : str7);
        }
    }

    /* JADX INFO: compiled from: MakeOrderData.kt */
    @Keep
    @Metadata(m90083d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002Ba\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\f\u001a\u00020\u0004\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\t\u0010 \u001a\u00020\nHÆ\u0003J\t\u0010!\u001a\u00020\u0004HÆ\u0003J\t\u0010\"\u001a\u00020\u0004HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0004HÆ\u0003Jo\u0010$\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\u00042\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\u0006\u0010%\u001a\u00020&J\u0013\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010*HÖ\u0003J\t\u0010+\u001a\u00020&HÖ\u0001J\t\u0010,\u001a\u00020\u0004HÖ\u0001J\u0016\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u0002002\u0006\u00101\u001a\u00020&R\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u000b\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0011R\u0011\u0010\f\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0011R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0011¨\u00062"}, m90084d2 = {"Lcom/kubi/core/base/order/data/MakeOrderData$Request$LimitStop;", "Landroid/os/Parcelable;", "Lcom/kubi/core/base/order/data/MakeOrderData$Request;", "symbol", "", "side", "size", FirebaseAnalytics.Param.PRICE, "triggerPrice", "triggerDirection", "Lcom/kubi/core/base/order/data/TriggerDirection;", "tradeType", "orderType", "validationToken", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/kubi/core/base/order/data/TriggerDirection;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getSymbol", "()Ljava/lang/String;", "getSide", "getSize", "getPrice", "getTriggerPrice", "getTriggerDirection", "()Lcom/kubi/core/base/order/data/TriggerDirection;", "getTradeType", "getOrderType", "getValidationToken", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class LimitStop implements Parcelable, MakeOrderData$Request {

        @NotNull
        public static final Parcelable.Creator<LimitStop> CREATOR = new C11607a();

        @NotNull
        private final String orderType;

        @Nullable
        private final String price;

        @Nullable
        private final String side;

        @Nullable
        private final String size;

        @Nullable
        private final String symbol;

        @NotNull
        private final String tradeType;

        @NotNull
        private final TriggerDirection triggerDirection;

        @Nullable
        private final String triggerPrice;

        @Nullable
        private final String validationToken;

        /* JADX INFO: renamed from: com.kubi.core.base.order.data.MakeOrderData$Request$LimitStop$a */
        /* JADX INFO: compiled from: MakeOrderData.kt */
        @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
        public static final class C11607a implements Parcelable.Creator<LimitStop> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final LimitStop createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new LimitStop(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (TriggerDirection) parcel.readParcelable(LimitStop.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final LimitStop[] newArray(int i11) {
                return new LimitStop[i11];
            }
        }

        public LimitStop(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @NotNull TriggerDirection triggerDirection, @NotNull String tradeType, @NotNull String orderType, @Nullable String str6) {
            Intrinsics.checkNotNullParameter(triggerDirection, "triggerDirection");
            Intrinsics.checkNotNullParameter(tradeType, "tradeType");
            Intrinsics.checkNotNullParameter(orderType, "orderType");
            this.symbol = str;
            this.side = str2;
            this.size = str3;
            this.price = str4;
            this.triggerPrice = str5;
            this.triggerDirection = triggerDirection;
            this.tradeType = tradeType;
            this.orderType = orderType;
            this.validationToken = str6;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof LimitStop)) {
                return false;
            }
            LimitStop limitStop = (LimitStop) other;
            return Intrinsics.areEqual(this.symbol, limitStop.symbol) && Intrinsics.areEqual(this.side, limitStop.side) && Intrinsics.areEqual(this.size, limitStop.size) && Intrinsics.areEqual(this.price, limitStop.price) && Intrinsics.areEqual(this.triggerPrice, limitStop.triggerPrice) && Intrinsics.areEqual(this.triggerDirection, limitStop.triggerDirection) && Intrinsics.areEqual(this.tradeType, limitStop.tradeType) && Intrinsics.areEqual(this.orderType, limitStop.orderType) && Intrinsics.areEqual(this.validationToken, limitStop.validationToken);
        }

        public static /* synthetic */ LimitStop copy$default(LimitStop limitStop, String str, String str2, String str3, String str4, String str5, TriggerDirection triggerDirection, String str6, String str7, String str8, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = limitStop.symbol;
            }
            if ((i11 & 2) != 0) {
                str2 = limitStop.side;
            }
            if ((i11 & 4) != 0) {
                str3 = limitStop.size;
            }
            if ((i11 & 8) != 0) {
                str4 = limitStop.price;
            }
            if ((i11 & 16) != 0) {
                str5 = limitStop.triggerPrice;
            }
            if ((i11 & 32) != 0) {
                triggerDirection = limitStop.triggerDirection;
            }
            if ((i11 & 64) != 0) {
                str6 = limitStop.tradeType;
            }
            if ((i11 & 128) != 0) {
                str7 = limitStop.orderType;
            }
            if ((i11 & 256) != 0) {
                str8 = limitStop.validationToken;
            }
            String str9 = str7;
            String str10 = str8;
            TriggerDirection triggerDirection2 = triggerDirection;
            String str11 = str6;
            String str12 = str5;
            String str13 = str3;
            return limitStop.copy(str, str2, str13, str4, str12, triggerDirection2, str11, str9, str10);
        }

        @Nullable
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getSymbol() {
            return this.symbol;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getSide() {
            return this.side;
        }

        @Nullable
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getSize() {
            return this.size;
        }

        @Nullable
        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getPrice() {
            return this.price;
        }

        @Nullable
        /* JADX INFO: renamed from: component5, reason: from getter */
        public final String getTriggerPrice() {
            return this.triggerPrice;
        }

        @NotNull
        /* JADX INFO: renamed from: component6, reason: from getter */
        public final TriggerDirection getTriggerDirection() {
            return this.triggerDirection;
        }

        @NotNull
        /* JADX INFO: renamed from: component7, reason: from getter */
        public final String getTradeType() {
            return this.tradeType;
        }

        @NotNull
        /* JADX INFO: renamed from: component8, reason: from getter */
        public final String getOrderType() {
            return this.orderType;
        }

        @Nullable
        /* JADX INFO: renamed from: component9, reason: from getter */
        public final String getValidationToken() {
            return this.validationToken;
        }

        @NotNull
        public final LimitStop copy(@Nullable String symbol, @Nullable String side, @Nullable String size, @Nullable String price, @Nullable String triggerPrice, @NotNull TriggerDirection triggerDirection, @NotNull String tradeType, @NotNull String orderType, @Nullable String validationToken) {
            Intrinsics.checkNotNullParameter(triggerDirection, "triggerDirection");
            Intrinsics.checkNotNullParameter(tradeType, "tradeType");
            Intrinsics.checkNotNullParameter(orderType, "orderType");
            return new LimitStop(symbol, side, size, price, triggerPrice, triggerDirection, tradeType, orderType, validationToken);
        }

        @NotNull
        public final String getOrderType() {
            return this.orderType;
        }

        @Nullable
        public final String getPrice() {
            return this.price;
        }

        @Nullable
        public final String getSide() {
            return this.side;
        }

        @Nullable
        public final String getSize() {
            return this.size;
        }

        @Nullable
        public final String getSymbol() {
            return this.symbol;
        }

        @NotNull
        public final String getTradeType() {
            return this.tradeType;
        }

        @NotNull
        public final TriggerDirection getTriggerDirection() {
            return this.triggerDirection;
        }

        @Nullable
        public final String getTriggerPrice() {
            return this.triggerPrice;
        }

        @Nullable
        public final String getValidationToken() {
            return this.validationToken;
        }

        public int hashCode() {
            String str = this.symbol;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.side;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.size;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.price;
            int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.triggerPrice;
            int iHashCode5 = (((((((iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31) + this.triggerDirection.hashCode()) * 31) + this.tradeType.hashCode()) * 31) + this.orderType.hashCode()) * 31;
            String str6 = this.validationToken;
            return iHashCode5 + (str6 != null ? str6.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "LimitStop(symbol=" + this.symbol + ", side=" + this.side + ", size=" + this.size + ", price=" + this.price + ", triggerPrice=" + this.triggerPrice + ", triggerDirection=" + this.triggerDirection + ", tradeType=" + this.tradeType + ", orderType=" + this.orderType + ", validationToken=" + this.validationToken + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.symbol);
            dest.writeString(this.side);
            dest.writeString(this.size);
            dest.writeString(this.price);
            dest.writeString(this.triggerPrice);
            dest.writeParcelable(this.triggerDirection, flags);
            dest.writeString(this.tradeType);
            dest.writeString(this.orderType);
            dest.writeString(this.validationToken);
        }

        @Override // com.kubi.core.base.order.data.MakeOrderData$Request
        @Nullable
        public /* bridge */ /* synthetic */ String getXValidationToken() {
            return super.getXValidationToken();
        }

        public /* synthetic */ LimitStop(String str, String str2, String str3, String str4, String str5, TriggerDirection triggerDirection, String str6, String str7, String str8, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, str3, str4, str5, triggerDirection, (i11 & 64) != 0 ? "SPOT" : str6, (i11 & 128) != 0 ? "LIMIT" : str7, (i11 & 256) != 0 ? null : str8);
        }
    }

    /* JADX INFO: compiled from: MakeOrderData.kt */
    @Keep
    @Metadata(m90083d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0016\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B]\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\r\u0010\u000eJ\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0004HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0004HÆ\u0003J\t\u0010\u001e\u001a\u00020\u000bHÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0004HÆ\u0003Jc\u0010 \u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\u0006\u0010!\u001a\u00020\"J\u0013\u0010#\u001a\u00020\u000b2\b\u0010$\u001a\u0004\u0018\u00010%HÖ\u0003J\t\u0010&\u001a\u00020\"HÖ\u0001J\t\u0010'\u001a\u00020\u0004HÖ\u0001J\u0016\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020\"R\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0011\u0010\b\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0011\u0010\t\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0016R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0010¨\u0006-"}, m90084d2 = {"Lcom/kubi/core/base/order/data/MakeOrderData$Request$Market;", "Landroid/os/Parcelable;", "Lcom/kubi/core/base/order/data/MakeOrderData$Request;", "symbol", "", "side", "size", "funds", "tradeType", "orderType", "isFullPercent", "", "validationToken", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V", "getSymbol", "()Ljava/lang/String;", "getSide", "getSize", "getFunds", "getTradeType", "getOrderType", "()Z", "getValidationToken", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class Market implements Parcelable, MakeOrderData$Request {

        @NotNull
        public static final Parcelable.Creator<Market> CREATOR = new C11608a();

        @Nullable
        private final String funds;
        private final boolean isFullPercent;

        @NotNull
        private final String orderType;

        @Nullable
        private final String side;

        @Nullable
        private final String size;

        @Nullable
        private final String symbol;

        @NotNull
        private final String tradeType;

        @Nullable
        private final String validationToken;

        /* JADX INFO: renamed from: com.kubi.core.base.order.data.MakeOrderData$Request$Market$a */
        /* JADX INFO: compiled from: MakeOrderData.kt */
        @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
        public static final class C11608a implements Parcelable.Creator<Market> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Market createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Market(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Market[] newArray(int i11) {
                return new Market[i11];
            }
        }

        public Market(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @NotNull String tradeType, @NotNull String orderType, boolean z11, @Nullable String str5) {
            Intrinsics.checkNotNullParameter(tradeType, "tradeType");
            Intrinsics.checkNotNullParameter(orderType, "orderType");
            this.symbol = str;
            this.side = str2;
            this.size = str3;
            this.funds = str4;
            this.tradeType = tradeType;
            this.orderType = orderType;
            this.isFullPercent = z11;
            this.validationToken = str5;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Market)) {
                return false;
            }
            Market market = (Market) other;
            return Intrinsics.areEqual(this.symbol, market.symbol) && Intrinsics.areEqual(this.side, market.side) && Intrinsics.areEqual(this.size, market.size) && Intrinsics.areEqual(this.funds, market.funds) && Intrinsics.areEqual(this.tradeType, market.tradeType) && Intrinsics.areEqual(this.orderType, market.orderType) && this.isFullPercent == market.isFullPercent && Intrinsics.areEqual(this.validationToken, market.validationToken);
        }

        public static /* synthetic */ Market copy$default(Market market, String str, String str2, String str3, String str4, String str5, String str6, boolean z11, String str7, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = market.symbol;
            }
            if ((i11 & 2) != 0) {
                str2 = market.side;
            }
            if ((i11 & 4) != 0) {
                str3 = market.size;
            }
            if ((i11 & 8) != 0) {
                str4 = market.funds;
            }
            if ((i11 & 16) != 0) {
                str5 = market.tradeType;
            }
            if ((i11 & 32) != 0) {
                str6 = market.orderType;
            }
            if ((i11 & 64) != 0) {
                z11 = market.isFullPercent;
            }
            if ((i11 & 128) != 0) {
                str7 = market.validationToken;
            }
            boolean z12 = z11;
            String str8 = str7;
            String str9 = str5;
            String str10 = str6;
            return market.copy(str, str2, str3, str4, str9, str10, z12, str8);
        }

        @Nullable
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getSymbol() {
            return this.symbol;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getSide() {
            return this.side;
        }

        @Nullable
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getSize() {
            return this.size;
        }

        @Nullable
        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getFunds() {
            return this.funds;
        }

        @NotNull
        /* JADX INFO: renamed from: component5, reason: from getter */
        public final String getTradeType() {
            return this.tradeType;
        }

        @NotNull
        /* JADX INFO: renamed from: component6, reason: from getter */
        public final String getOrderType() {
            return this.orderType;
        }

        /* JADX INFO: renamed from: component7, reason: from getter */
        public final boolean getIsFullPercent() {
            return this.isFullPercent;
        }

        @Nullable
        /* JADX INFO: renamed from: component8, reason: from getter */
        public final String getValidationToken() {
            return this.validationToken;
        }

        @NotNull
        public final Market copy(@Nullable String symbol, @Nullable String side, @Nullable String size, @Nullable String funds, @NotNull String tradeType, @NotNull String orderType, boolean isFullPercent, @Nullable String validationToken) {
            Intrinsics.checkNotNullParameter(tradeType, "tradeType");
            Intrinsics.checkNotNullParameter(orderType, "orderType");
            return new Market(symbol, side, size, funds, tradeType, orderType, isFullPercent, validationToken);
        }

        @Nullable
        public final String getFunds() {
            return this.funds;
        }

        @NotNull
        public final String getOrderType() {
            return this.orderType;
        }

        @Nullable
        public final String getSide() {
            return this.side;
        }

        @Nullable
        public final String getSize() {
            return this.size;
        }

        @Nullable
        public final String getSymbol() {
            return this.symbol;
        }

        @NotNull
        public final String getTradeType() {
            return this.tradeType;
        }

        @Nullable
        public final String getValidationToken() {
            return this.validationToken;
        }

        public int hashCode() {
            String str = this.symbol;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.side;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.size;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.funds;
            int iHashCode4 = (((((((iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31) + this.tradeType.hashCode()) * 31) + this.orderType.hashCode()) * 31) + Boolean.hashCode(this.isFullPercent)) * 31;
            String str5 = this.validationToken;
            return iHashCode4 + (str5 != null ? str5.hashCode() : 0);
        }

        public final boolean isFullPercent() {
            return this.isFullPercent;
        }

        @NotNull
        public String toString() {
            return "Market(symbol=" + this.symbol + ", side=" + this.side + ", size=" + this.size + ", funds=" + this.funds + ", tradeType=" + this.tradeType + ", orderType=" + this.orderType + ", isFullPercent=" + this.isFullPercent + ", validationToken=" + this.validationToken + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.symbol);
            dest.writeString(this.side);
            dest.writeString(this.size);
            dest.writeString(this.funds);
            dest.writeString(this.tradeType);
            dest.writeString(this.orderType);
            dest.writeInt(this.isFullPercent ? 1 : 0);
            dest.writeString(this.validationToken);
        }

        @Override // com.kubi.core.base.order.data.MakeOrderData$Request
        @Nullable
        public /* bridge */ /* synthetic */ String getXValidationToken() {
            return super.getXValidationToken();
        }

        public /* synthetic */ Market(String str, String str2, String str3, String str4, String str5, String str6, boolean z11, String str7, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, (i11 & 4) != 0 ? null : str3, (i11 & 8) != 0 ? null : str4, (i11 & 16) != 0 ? "SPOT" : str5, (i11 & 32) != 0 ? "MARKET" : str6, (i11 & 64) != 0 ? false : z11, (i11 & 128) != 0 ? null : str7);
        }
    }

    /* JADX INFO: compiled from: MakeOrderData.kt */
    @Keep
    @Metadata(m90083d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002Bo\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\f\u001a\u00020\u0004\u0012\b\b\u0002\u0010\r\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u000f\u0010\u0010J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\t\u0010\"\u001a\u00020\nHÆ\u0003J\t\u0010#\u001a\u00020\u0004HÆ\u0003J\t\u0010$\u001a\u00020\u0004HÆ\u0003J\t\u0010%\u001a\u00020\u0004HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0004HÆ\u0003Jy\u0010'\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\u00042\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\u0006\u0010(\u001a\u00020)J\u0013\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010-HÖ\u0003J\t\u0010.\u001a\u00020)HÖ\u0001J\t\u0010/\u001a\u00020\u0004HÖ\u0001J\u0016\u00100\u001a\u0002012\u0006\u00102\u001a\u0002032\u0006\u00104\u001a\u00020)R\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u000b\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0012R\u0011\u0010\f\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0012R\u0011\u0010\r\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0012R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0012¨\u00065"}, m90084d2 = {"Lcom/kubi/core/base/order/data/MakeOrderData$Request$MarketStop;", "Landroid/os/Parcelable;", "Lcom/kubi/core/base/order/data/MakeOrderData$Request;", "symbol", "", "side", "size", "funds", "triggerPrice", "triggerDirection", "Lcom/kubi/core/base/order/data/TriggerDirection;", "triggerPriceType", "tradeType", "orderType", "validationToken", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/kubi/core/base/order/data/TriggerDirection;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getSymbol", "()Ljava/lang/String;", "getSide", "getSize", "getFunds", "getTriggerPrice", "getTriggerDirection", "()Lcom/kubi/core/base/order/data/TriggerDirection;", "getTriggerPriceType", "getTradeType", "getOrderType", "getValidationToken", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class MarketStop implements Parcelable, MakeOrderData$Request {

        @NotNull
        public static final Parcelable.Creator<MarketStop> CREATOR = new C11609a();

        @Nullable
        private final String funds;

        @NotNull
        private final String orderType;

        @Nullable
        private final String side;

        @Nullable
        private final String size;

        @Nullable
        private final String symbol;

        @NotNull
        private final String tradeType;

        @NotNull
        private final TriggerDirection triggerDirection;

        @Nullable
        private final String triggerPrice;

        @NotNull
        private final String triggerPriceType;

        @Nullable
        private final String validationToken;

        /* JADX INFO: renamed from: com.kubi.core.base.order.data.MakeOrderData$Request$MarketStop$a */
        /* JADX INFO: compiled from: MakeOrderData.kt */
        @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
        public static final class C11609a implements Parcelable.Creator<MarketStop> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final MarketStop createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new MarketStop(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (TriggerDirection) parcel.readParcelable(MarketStop.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final MarketStop[] newArray(int i11) {
                return new MarketStop[i11];
            }
        }

        public MarketStop(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @NotNull TriggerDirection triggerDirection, @NotNull String triggerPriceType, @NotNull String tradeType, @NotNull String orderType, @Nullable String str6) {
            Intrinsics.checkNotNullParameter(triggerDirection, "triggerDirection");
            Intrinsics.checkNotNullParameter(triggerPriceType, "triggerPriceType");
            Intrinsics.checkNotNullParameter(tradeType, "tradeType");
            Intrinsics.checkNotNullParameter(orderType, "orderType");
            this.symbol = str;
            this.side = str2;
            this.size = str3;
            this.funds = str4;
            this.triggerPrice = str5;
            this.triggerDirection = triggerDirection;
            this.triggerPriceType = triggerPriceType;
            this.tradeType = tradeType;
            this.orderType = orderType;
            this.validationToken = str6;
        }

        public static /* synthetic */ MarketStop copy$default(MarketStop marketStop, String str, String str2, String str3, String str4, String str5, TriggerDirection triggerDirection, String str6, String str7, String str8, String str9, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = marketStop.symbol;
            }
            if ((i11 & 2) != 0) {
                str2 = marketStop.side;
            }
            if ((i11 & 4) != 0) {
                str3 = marketStop.size;
            }
            if ((i11 & 8) != 0) {
                str4 = marketStop.funds;
            }
            if ((i11 & 16) != 0) {
                str5 = marketStop.triggerPrice;
            }
            if ((i11 & 32) != 0) {
                triggerDirection = marketStop.triggerDirection;
            }
            if ((i11 & 64) != 0) {
                str6 = marketStop.triggerPriceType;
            }
            if ((i11 & 128) != 0) {
                str7 = marketStop.tradeType;
            }
            if ((i11 & 256) != 0) {
                str8 = marketStop.orderType;
            }
            if ((i11 & 512) != 0) {
                str9 = marketStop.validationToken;
            }
            String str10 = str8;
            String str11 = str9;
            String str12 = str6;
            String str13 = str7;
            String str14 = str5;
            TriggerDirection triggerDirection2 = triggerDirection;
            return marketStop.copy(str, str2, str3, str4, str14, triggerDirection2, str12, str13, str10, str11);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof MarketStop)) {
                return false;
            }
            MarketStop marketStop = (MarketStop) other;
            return Intrinsics.areEqual(this.symbol, marketStop.symbol) && Intrinsics.areEqual(this.side, marketStop.side) && Intrinsics.areEqual(this.size, marketStop.size) && Intrinsics.areEqual(this.funds, marketStop.funds) && Intrinsics.areEqual(this.triggerPrice, marketStop.triggerPrice) && Intrinsics.areEqual(this.triggerDirection, marketStop.triggerDirection) && Intrinsics.areEqual(this.triggerPriceType, marketStop.triggerPriceType) && Intrinsics.areEqual(this.tradeType, marketStop.tradeType) && Intrinsics.areEqual(this.orderType, marketStop.orderType) && Intrinsics.areEqual(this.validationToken, marketStop.validationToken);
        }

        @Nullable
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getSymbol() {
            return this.symbol;
        }

        @Nullable
        /* JADX INFO: renamed from: component10, reason: from getter */
        public final String getValidationToken() {
            return this.validationToken;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getSide() {
            return this.side;
        }

        @Nullable
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getSize() {
            return this.size;
        }

        @Nullable
        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getFunds() {
            return this.funds;
        }

        @Nullable
        /* JADX INFO: renamed from: component5, reason: from getter */
        public final String getTriggerPrice() {
            return this.triggerPrice;
        }

        @NotNull
        /* JADX INFO: renamed from: component6, reason: from getter */
        public final TriggerDirection getTriggerDirection() {
            return this.triggerDirection;
        }

        @NotNull
        /* JADX INFO: renamed from: component7, reason: from getter */
        public final String getTriggerPriceType() {
            return this.triggerPriceType;
        }

        @NotNull
        /* JADX INFO: renamed from: component8, reason: from getter */
        public final String getTradeType() {
            return this.tradeType;
        }

        @NotNull
        /* JADX INFO: renamed from: component9, reason: from getter */
        public final String getOrderType() {
            return this.orderType;
        }

        @NotNull
        public final MarketStop copy(@Nullable String symbol, @Nullable String side, @Nullable String size, @Nullable String funds, @Nullable String triggerPrice, @NotNull TriggerDirection triggerDirection, @NotNull String triggerPriceType, @NotNull String tradeType, @NotNull String orderType, @Nullable String validationToken) {
            Intrinsics.checkNotNullParameter(triggerDirection, "triggerDirection");
            Intrinsics.checkNotNullParameter(triggerPriceType, "triggerPriceType");
            Intrinsics.checkNotNullParameter(tradeType, "tradeType");
            Intrinsics.checkNotNullParameter(orderType, "orderType");
            return new MarketStop(symbol, side, size, funds, triggerPrice, triggerDirection, triggerPriceType, tradeType, orderType, validationToken);
        }

        @Nullable
        public final String getFunds() {
            return this.funds;
        }

        @NotNull
        public final String getOrderType() {
            return this.orderType;
        }

        @Nullable
        public final String getSide() {
            return this.side;
        }

        @Nullable
        public final String getSize() {
            return this.size;
        }

        @Nullable
        public final String getSymbol() {
            return this.symbol;
        }

        @NotNull
        public final String getTradeType() {
            return this.tradeType;
        }

        @NotNull
        public final TriggerDirection getTriggerDirection() {
            return this.triggerDirection;
        }

        @Nullable
        public final String getTriggerPrice() {
            return this.triggerPrice;
        }

        @NotNull
        public final String getTriggerPriceType() {
            return this.triggerPriceType;
        }

        @Nullable
        public final String getValidationToken() {
            return this.validationToken;
        }

        public int hashCode() {
            String str = this.symbol;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.side;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.size;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.funds;
            int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.triggerPrice;
            int iHashCode5 = (((((((((iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31) + this.triggerDirection.hashCode()) * 31) + this.triggerPriceType.hashCode()) * 31) + this.tradeType.hashCode()) * 31) + this.orderType.hashCode()) * 31;
            String str6 = this.validationToken;
            return iHashCode5 + (str6 != null ? str6.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "MarketStop(symbol=" + this.symbol + ", side=" + this.side + ", size=" + this.size + ", funds=" + this.funds + ", triggerPrice=" + this.triggerPrice + ", triggerDirection=" + this.triggerDirection + ", triggerPriceType=" + this.triggerPriceType + ", tradeType=" + this.tradeType + ", orderType=" + this.orderType + ", validationToken=" + this.validationToken + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.symbol);
            dest.writeString(this.side);
            dest.writeString(this.size);
            dest.writeString(this.funds);
            dest.writeString(this.triggerPrice);
            dest.writeParcelable(this.triggerDirection, flags);
            dest.writeString(this.triggerPriceType);
            dest.writeString(this.tradeType);
            dest.writeString(this.orderType);
            dest.writeString(this.validationToken);
        }

        @Override // com.kubi.core.base.order.data.MakeOrderData$Request
        @Nullable
        public /* bridge */ /* synthetic */ String getXValidationToken() {
            return super.getXValidationToken();
        }

        public /* synthetic */ MarketStop(String str, String str2, String str3, String str4, String str5, TriggerDirection triggerDirection, String str6, String str7, String str8, String str9, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, (i11 & 4) != 0 ? null : str3, (i11 & 8) != 0 ? null : str4, str5, triggerDirection, (i11 & 64) != 0 ? "TP" : str6, (i11 & 128) != 0 ? "SPOT" : str7, (i11 & 256) != 0 ? "MARKET" : str8, (i11 & 512) != 0 ? null : str9);
        }
    }

    /* JADX INFO: compiled from: MakeOrderData.kt */
    @Keep
    @Metadata(m90083d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B?\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0004HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0004HÆ\u0003JG\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\t\u001a\u00020\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\u0006\u0010\u001a\u001a\u00020\u001bJ\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fHÖ\u0003J\t\u0010 \u001a\u00020\u001bHÖ\u0001J\t\u0010!\u001a\u00020\u0004HÖ\u0001J\u0016\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u001bR\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\t\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0013\u0010\n\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000e¨\u0006'"}, m90084d2 = {"Lcom/kubi/core/base/order/data/MakeOrderData$Request$Segment;", "Landroid/os/Parcelable;", "Lcom/kubi/core/base/order/data/MakeOrderData$Request;", "symbol", "", "side", FirebaseAnalytics.Param.ITEMS, "", "Lcom/kubi/core/base/order/data/MakeOrderData$SegmentItem;", "tradeType", "validationToken", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "getSymbol", "()Ljava/lang/String;", "getSide", "getItems", "()Ljava/util/List;", "getTradeType", "getValidationToken", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class Segment implements Parcelable, MakeOrderData$Request {

        @NotNull
        public static final Parcelable.Creator<Segment> CREATOR = new C11610a();

        @NotNull
        private final List<SegmentItem> items;

        @Nullable
        private final String side;

        @Nullable
        private final String symbol;

        @NotNull
        private final String tradeType;

        @Nullable
        private final String validationToken;

        /* JADX INFO: renamed from: com.kubi.core.base.order.data.MakeOrderData$Request$Segment$a */
        /* JADX INFO: compiled from: MakeOrderData.kt */
        @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
        public static final class C11610a implements Parcelable.Creator<Segment> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Segment createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string = parcel.readString();
                String string2 = parcel.readString();
                int i11 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i11);
                for (int i12 = 0; i12 != i11; i12++) {
                    arrayList.add(SegmentItem.CREATOR.createFromParcel(parcel));
                }
                return new Segment(string, string2, arrayList, parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Segment[] newArray(int i11) {
                return new Segment[i11];
            }
        }

        public Segment(@Nullable String str, @Nullable String str2, @NotNull List<SegmentItem> items, @NotNull String tradeType, @Nullable String str3) {
            Intrinsics.checkNotNullParameter(items, "items");
            Intrinsics.checkNotNullParameter(tradeType, "tradeType");
            this.symbol = str;
            this.side = str2;
            this.items = items;
            this.tradeType = tradeType;
            this.validationToken = str3;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Segment)) {
                return false;
            }
            Segment segment = (Segment) other;
            return Intrinsics.areEqual(this.symbol, segment.symbol) && Intrinsics.areEqual(this.side, segment.side) && Intrinsics.areEqual(this.items, segment.items) && Intrinsics.areEqual(this.tradeType, segment.tradeType) && Intrinsics.areEqual(this.validationToken, segment.validationToken);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Segment copy$default(Segment segment, String str, String str2, List list, String str3, String str4, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = segment.symbol;
            }
            if ((i11 & 2) != 0) {
                str2 = segment.side;
            }
            if ((i11 & 4) != 0) {
                list = segment.items;
            }
            if ((i11 & 8) != 0) {
                str3 = segment.tradeType;
            }
            if ((i11 & 16) != 0) {
                str4 = segment.validationToken;
            }
            String str5 = str4;
            List list2 = list;
            return segment.copy(str, str2, list2, str3, str5);
        }

        @Nullable
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getSymbol() {
            return this.symbol;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getSide() {
            return this.side;
        }

        @NotNull
        public final List<SegmentItem> component3() {
            return this.items;
        }

        @NotNull
        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getTradeType() {
            return this.tradeType;
        }

        @Nullable
        /* JADX INFO: renamed from: component5, reason: from getter */
        public final String getValidationToken() {
            return this.validationToken;
        }

        @NotNull
        public final Segment copy(@Nullable String symbol, @Nullable String side, @NotNull List<SegmentItem> items, @NotNull String tradeType, @Nullable String validationToken) {
            Intrinsics.checkNotNullParameter(items, "items");
            Intrinsics.checkNotNullParameter(tradeType, "tradeType");
            return new Segment(symbol, side, items, tradeType, validationToken);
        }

        @NotNull
        public final List<SegmentItem> getItems() {
            return this.items;
        }

        @Nullable
        public final String getSide() {
            return this.side;
        }

        @Nullable
        public final String getSymbol() {
            return this.symbol;
        }

        @NotNull
        public final String getTradeType() {
            return this.tradeType;
        }

        @Nullable
        public final String getValidationToken() {
            return this.validationToken;
        }

        public int hashCode() {
            String str = this.symbol;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.side;
            int iHashCode2 = (((((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31) + this.items.hashCode()) * 31) + this.tradeType.hashCode()) * 31;
            String str3 = this.validationToken;
            return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "Segment(symbol=" + this.symbol + ", side=" + this.side + ", items=" + this.items + ", tradeType=" + this.tradeType + ", validationToken=" + this.validationToken + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.symbol);
            dest.writeString(this.side);
            List<SegmentItem> list = this.items;
            dest.writeInt(list.size());
            Iterator<SegmentItem> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(dest, flags);
            }
            dest.writeString(this.tradeType);
            dest.writeString(this.validationToken);
        }

        @Override // com.kubi.core.base.order.data.MakeOrderData$Request
        @Nullable
        public /* bridge */ /* synthetic */ String getXValidationToken() {
            return super.getXValidationToken();
        }

        public /* synthetic */ Segment(String str, String str2, List list, String str3, String str4, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, list, (i11 & 8) != 0 ? "SPOT" : str3, (i11 & 16) != 0 ? null : str4);
        }
    }

    @Nullable
    default String getXValidationToken() {
        if (this instanceof Limit) {
            return ((Limit) this).getValidationToken();
        }
        if (this instanceof Market) {
            return ((Market) this).getValidationToken();
        }
        if (this instanceof LimitStop) {
            return ((LimitStop) this).getValidationToken();
        }
        if (this instanceof AdvancedLimit) {
            return ((AdvancedLimit) this).getValidationToken();
        }
        if (this instanceof MarketStop) {
            return ((MarketStop) this).getValidationToken();
        }
        if (this instanceof Segment) {
            return ((Segment) this).getValidationToken();
        }
        throw new NoWhenBranchMatchedException();
    }
}
