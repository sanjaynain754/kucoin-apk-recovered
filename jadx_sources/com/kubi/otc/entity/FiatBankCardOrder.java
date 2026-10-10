package com.kubi.otc.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: FiatBean.kt */
/* JADX INFO: loaded from: classes33.dex */
@Keep
@Metadata(m90083d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010\u000b\n\u0002\b\u0019\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \\2\u00020\u0001:\u0001\\BÕ\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b\u001c\u0010\u001dJ\u0006\u00109\u001a\u00020:J\u0010\u0010;\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001fJ\u0010\u0010<\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\"J\u000b\u0010=\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0011\u0010@\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010B\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010C\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0010\u0010D\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001fJ\u000b\u0010E\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010F\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010G\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010H\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0010\u0010I\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001fJ\u000b\u0010J\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010K\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010L\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010M\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010N\u001a\u0004\u0018\u00010\u001bHÆ\u0003J\u0084\u0002\u0010O\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÆ\u0001¢\u0006\u0002\u0010PJ\u0006\u0010Q\u001a\u00020\u0003J\u0013\u0010R\u001a\u00020:2\b\u0010S\u001a\u0004\u0018\u00010THÖ\u0003J\t\u0010U\u001a\u00020\u0003HÖ\u0001J\t\u0010V\u001a\u00020\u0007HÖ\u0001J\u0016\u0010W\u001a\u00020X2\u0006\u0010Y\u001a\u00020Z2\u0006\u0010[\u001a\u00020\u0003R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010 \u001a\u0004\b\u001e\u0010\u001fR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010#\u001a\u0004\b!\u0010\"R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b&\u0010%R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b'\u0010%R\u001e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b*\u0010%R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b+\u0010%R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b,\u0010%R\u0015\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010 \u001a\u0004\b-\u0010\u001fR\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b.\u0010%R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b/\u0010%R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b0\u0010%R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b1\u0010%R\u0015\u0010\u0015\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010 \u001a\u0004\b2\u0010\u001fR\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b3\u0010%R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b4\u0010%R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b5\u0010%R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b6\u0010%R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u001b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b7\u00108¨\u0006]"}, m90084d2 = {"Lcom/kubi/otc/entity/FiatBankCardOrder;", "Landroid/os/Parcelable;", "bizSource", "", "createdAt", "", "cryptoCurrency", "", "cryptoQuantity", "fee", "feeMsgList", "", "Lcom/kubi/otc/entity/MultiFee;", "fiatAmount", "fiatCurrency", "orderId", "orderStatus", "paymentName", "rechargeOrderId", "tradeType", FirebaseAnalytics.Param.PRICE, "refType", "side", "displayErrorMsg", "paymentMethodCode", "channelId", "rechargeOrderDetail", "Lcom/kubi/otc/entity/RechargeOrderDetail;", "<init>", "(Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/kubi/otc/entity/RechargeOrderDetail;)V", "getBizSource", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getCreatedAt", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getCryptoCurrency", "()Ljava/lang/String;", "getCryptoQuantity", "getFee", "getFeeMsgList", "()Ljava/util/List;", "getFiatAmount", "getFiatCurrency", "getOrderId", "getOrderStatus", "getPaymentName", "getRechargeOrderId", "getTradeType", "getPrice", "getRefType", "getSide", "getDisplayErrorMsg", "getPaymentMethodCode", "getChannelId", "getRechargeOrderDetail", "()Lcom/kubi/otc/entity/RechargeOrderDetail;", "isBuyType", "", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "copy", "(Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/kubi/otc/entity/RechargeOrderDetail;)Lcom/kubi/otc/entity/FiatBankCardOrder;", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "Companion", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class FiatBankCardOrder implements Parcelable {

    @NotNull
    public static final String TYPE_BUY = "BUY";

    @Nullable
    private final Integer bizSource;

    @SerializedName("channelId")
    @Nullable
    private final String channelId;

    @Nullable
    private final Long createdAt;

    @Nullable
    private final String cryptoCurrency;

    @Nullable
    private final String cryptoQuantity;

    @Nullable
    private final String displayErrorMsg;

    @Nullable
    private final String fee;

    @SerializedName("feeMsgList")
    @Nullable
    private final List<MultiFee> feeMsgList;

    @Nullable
    private final String fiatAmount;

    @Nullable
    private final String fiatCurrency;

    @Nullable
    private final String orderId;

    @Nullable
    private final Integer orderStatus;

    @SerializedName("paymentMethodCode")
    @Nullable
    private final String paymentMethodCode;

    @Nullable
    private final String paymentName;

    @Nullable
    private final String price;

    @SerializedName("refOrder")
    @Nullable
    private final RechargeOrderDetail rechargeOrderDetail;

    @Nullable
    private final String rechargeOrderId;

    @Nullable
    private final Integer refType;

    @Nullable
    private final String side;

    @Nullable
    private final String tradeType;

    @NotNull
    public static final Parcelable.Creator<FiatBankCardOrder> CREATOR = new Creator();

    /* JADX INFO: compiled from: FiatBean.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Creator implements Parcelable.Creator<FiatBankCardOrder> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FiatBankCardOrder createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Long lValueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i11 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i11);
                for (int i12 = 0; i12 != i11; i12++) {
                    arrayList2.add(MultiFee.CREATOR.createFromParcel(parcel));
                }
                arrayList = arrayList2;
            }
            return new FiatBankCardOrder(numValueOf, lValueOf, string, string2, string3, arrayList, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? RechargeOrderDetail.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FiatBankCardOrder[] newArray(int i11) {
            return new FiatBankCardOrder[i11];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FiatBankCardOrder copy$default(FiatBankCardOrder fiatBankCardOrder, Integer num, Long l11, String str, String str2, String str3, List list, String str4, String str5, String str6, Integer num2, String str7, String str8, String str9, String str10, Integer num3, String str11, String str12, String str13, String str14, RechargeOrderDetail rechargeOrderDetail, int i11, Object obj) {
        RechargeOrderDetail rechargeOrderDetail2;
        String str15;
        Integer num4 = (i11 & 1) != 0 ? fiatBankCardOrder.bizSource : num;
        Long l12 = (i11 & 2) != 0 ? fiatBankCardOrder.createdAt : l11;
        String str16 = (i11 & 4) != 0 ? fiatBankCardOrder.cryptoCurrency : str;
        String str17 = (i11 & 8) != 0 ? fiatBankCardOrder.cryptoQuantity : str2;
        String str18 = (i11 & 16) != 0 ? fiatBankCardOrder.fee : str3;
        List list2 = (i11 & 32) != 0 ? fiatBankCardOrder.feeMsgList : list;
        String str19 = (i11 & 64) != 0 ? fiatBankCardOrder.fiatAmount : str4;
        String str20 = (i11 & 128) != 0 ? fiatBankCardOrder.fiatCurrency : str5;
        String str21 = (i11 & 256) != 0 ? fiatBankCardOrder.orderId : str6;
        Integer num5 = (i11 & 512) != 0 ? fiatBankCardOrder.orderStatus : num2;
        String str22 = (i11 & 1024) != 0 ? fiatBankCardOrder.paymentName : str7;
        String str23 = (i11 & 2048) != 0 ? fiatBankCardOrder.rechargeOrderId : str8;
        String str24 = (i11 & 4096) != 0 ? fiatBankCardOrder.tradeType : str9;
        String str25 = (i11 & 8192) != 0 ? fiatBankCardOrder.price : str10;
        Integer num6 = num4;
        Integer num7 = (i11 & 16384) != 0 ? fiatBankCardOrder.refType : num3;
        String str26 = (i11 & 32768) != 0 ? fiatBankCardOrder.side : str11;
        String str27 = (i11 & 65536) != 0 ? fiatBankCardOrder.displayErrorMsg : str12;
        String str28 = (i11 & 131072) != 0 ? fiatBankCardOrder.paymentMethodCode : str13;
        String str29 = (i11 & 262144) != 0 ? fiatBankCardOrder.channelId : str14;
        if ((i11 & 524288) != 0) {
            str15 = str29;
            rechargeOrderDetail2 = fiatBankCardOrder.rechargeOrderDetail;
        } else {
            rechargeOrderDetail2 = rechargeOrderDetail;
            str15 = str29;
        }
        return fiatBankCardOrder.copy(num6, l12, str16, str17, str18, list2, str19, str20, str21, num5, str22, str23, str24, str25, num7, str26, str27, str28, str15, rechargeOrderDetail2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FiatBankCardOrder)) {
            return false;
        }
        FiatBankCardOrder fiatBankCardOrder = (FiatBankCardOrder) other;
        return Intrinsics.areEqual(this.bizSource, fiatBankCardOrder.bizSource) && Intrinsics.areEqual(this.createdAt, fiatBankCardOrder.createdAt) && Intrinsics.areEqual(this.cryptoCurrency, fiatBankCardOrder.cryptoCurrency) && Intrinsics.areEqual(this.cryptoQuantity, fiatBankCardOrder.cryptoQuantity) && Intrinsics.areEqual(this.fee, fiatBankCardOrder.fee) && Intrinsics.areEqual(this.feeMsgList, fiatBankCardOrder.feeMsgList) && Intrinsics.areEqual(this.fiatAmount, fiatBankCardOrder.fiatAmount) && Intrinsics.areEqual(this.fiatCurrency, fiatBankCardOrder.fiatCurrency) && Intrinsics.areEqual(this.orderId, fiatBankCardOrder.orderId) && Intrinsics.areEqual(this.orderStatus, fiatBankCardOrder.orderStatus) && Intrinsics.areEqual(this.paymentName, fiatBankCardOrder.paymentName) && Intrinsics.areEqual(this.rechargeOrderId, fiatBankCardOrder.rechargeOrderId) && Intrinsics.areEqual(this.tradeType, fiatBankCardOrder.tradeType) && Intrinsics.areEqual(this.price, fiatBankCardOrder.price) && Intrinsics.areEqual(this.refType, fiatBankCardOrder.refType) && Intrinsics.areEqual(this.side, fiatBankCardOrder.side) && Intrinsics.areEqual(this.displayErrorMsg, fiatBankCardOrder.displayErrorMsg) && Intrinsics.areEqual(this.paymentMethodCode, fiatBankCardOrder.paymentMethodCode) && Intrinsics.areEqual(this.channelId, fiatBankCardOrder.channelId) && Intrinsics.areEqual(this.rechargeOrderDetail, fiatBankCardOrder.rechargeOrderDetail);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Integer getBizSource() {
        return this.bizSource;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final Integer getOrderStatus() {
        return this.orderStatus;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getPaymentName() {
        return this.paymentName;
    }

    @Nullable
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getRechargeOrderId() {
        return this.rechargeOrderId;
    }

    @Nullable
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getTradeType() {
        return this.tradeType;
    }

    @Nullable
    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getPrice() {
        return this.price;
    }

    @Nullable
    /* JADX INFO: renamed from: component15, reason: from getter */
    public final Integer getRefType() {
        return this.refType;
    }

    @Nullable
    /* JADX INFO: renamed from: component16, reason: from getter */
    public final String getSide() {
        return this.side;
    }

    @Nullable
    /* JADX INFO: renamed from: component17, reason: from getter */
    public final String getDisplayErrorMsg() {
        return this.displayErrorMsg;
    }

    @Nullable
    /* JADX INFO: renamed from: component18, reason: from getter */
    public final String getPaymentMethodCode() {
        return this.paymentMethodCode;
    }

    @Nullable
    /* JADX INFO: renamed from: component19, reason: from getter */
    public final String getChannelId() {
        return this.channelId;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Long getCreatedAt() {
        return this.createdAt;
    }

    @Nullable
    /* JADX INFO: renamed from: component20, reason: from getter */
    public final RechargeOrderDetail getRechargeOrderDetail() {
        return this.rechargeOrderDetail;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getCryptoCurrency() {
        return this.cryptoCurrency;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getCryptoQuantity() {
        return this.cryptoQuantity;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getFee() {
        return this.fee;
    }

    @Nullable
    public final List<MultiFee> component6() {
        return this.feeMsgList;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getFiatAmount() {
        return this.fiatAmount;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getFiatCurrency() {
        return this.fiatCurrency;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getOrderId() {
        return this.orderId;
    }

    @NotNull
    public final FiatBankCardOrder copy(@Nullable Integer bizSource, @Nullable Long createdAt, @Nullable String cryptoCurrency, @Nullable String cryptoQuantity, @Nullable String fee, @Nullable List<MultiFee> feeMsgList, @Nullable String fiatAmount, @Nullable String fiatCurrency, @Nullable String orderId, @Nullable Integer orderStatus, @Nullable String paymentName, @Nullable String rechargeOrderId, @Nullable String tradeType, @Nullable String price, @Nullable Integer refType, @Nullable String side, @Nullable String displayErrorMsg, @Nullable String paymentMethodCode, @Nullable String channelId, @Nullable RechargeOrderDetail rechargeOrderDetail) {
        return new FiatBankCardOrder(bizSource, createdAt, cryptoCurrency, cryptoQuantity, fee, feeMsgList, fiatAmount, fiatCurrency, orderId, orderStatus, paymentName, rechargeOrderId, tradeType, price, refType, side, displayErrorMsg, paymentMethodCode, channelId, rechargeOrderDetail);
    }

    @Nullable
    public final Integer getBizSource() {
        return this.bizSource;
    }

    @Nullable
    public final String getChannelId() {
        return this.channelId;
    }

    @Nullable
    public final Long getCreatedAt() {
        return this.createdAt;
    }

    @Nullable
    public final String getCryptoCurrency() {
        return this.cryptoCurrency;
    }

    @Nullable
    public final String getCryptoQuantity() {
        return this.cryptoQuantity;
    }

    @Nullable
    public final String getDisplayErrorMsg() {
        return this.displayErrorMsg;
    }

    @Nullable
    public final String getFee() {
        return this.fee;
    }

    @Nullable
    public final List<MultiFee> getFeeMsgList() {
        return this.feeMsgList;
    }

    @Nullable
    public final String getFiatAmount() {
        return this.fiatAmount;
    }

    @Nullable
    public final String getFiatCurrency() {
        return this.fiatCurrency;
    }

    @Nullable
    public final String getOrderId() {
        return this.orderId;
    }

    @Nullable
    public final Integer getOrderStatus() {
        return this.orderStatus;
    }

    @Nullable
    public final String getPaymentMethodCode() {
        return this.paymentMethodCode;
    }

    @Nullable
    public final String getPaymentName() {
        return this.paymentName;
    }

    @Nullable
    public final String getPrice() {
        return this.price;
    }

    @Nullable
    public final RechargeOrderDetail getRechargeOrderDetail() {
        return this.rechargeOrderDetail;
    }

    @Nullable
    public final String getRechargeOrderId() {
        return this.rechargeOrderId;
    }

    @Nullable
    public final Integer getRefType() {
        return this.refType;
    }

    @Nullable
    public final String getSide() {
        return this.side;
    }

    @Nullable
    public final String getTradeType() {
        return this.tradeType;
    }

    public int hashCode() {
        Integer num = this.bizSource;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Long l11 = this.createdAt;
        int iHashCode2 = (iHashCode + (l11 == null ? 0 : l11.hashCode())) * 31;
        String str = this.cryptoCurrency;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.cryptoQuantity;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.fee;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List<MultiFee> list = this.feeMsgList;
        int iHashCode6 = (iHashCode5 + (list == null ? 0 : list.hashCode())) * 31;
        String str4 = this.fiatAmount;
        int iHashCode7 = (iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.fiatCurrency;
        int iHashCode8 = (iHashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.orderId;
        int iHashCode9 = (iHashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Integer num2 = this.orderStatus;
        int iHashCode10 = (iHashCode9 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str7 = this.paymentName;
        int iHashCode11 = (iHashCode10 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.rechargeOrderId;
        int iHashCode12 = (iHashCode11 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.tradeType;
        int iHashCode13 = (iHashCode12 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.price;
        int iHashCode14 = (iHashCode13 + (str10 == null ? 0 : str10.hashCode())) * 31;
        Integer num3 = this.refType;
        int iHashCode15 = (iHashCode14 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str11 = this.side;
        int iHashCode16 = (iHashCode15 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.displayErrorMsg;
        int iHashCode17 = (iHashCode16 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.paymentMethodCode;
        int iHashCode18 = (iHashCode17 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.channelId;
        int iHashCode19 = (iHashCode18 + (str14 == null ? 0 : str14.hashCode())) * 31;
        RechargeOrderDetail rechargeOrderDetail = this.rechargeOrderDetail;
        return iHashCode19 + (rechargeOrderDetail != null ? rechargeOrderDetail.hashCode() : 0);
    }

    public final boolean isBuyType() {
        return Intrinsics.areEqual(this.side, "BUY");
    }

    @NotNull
    public String toString() {
        return "FiatBankCardOrder(bizSource=" + this.bizSource + ", createdAt=" + this.createdAt + ", cryptoCurrency=" + this.cryptoCurrency + ", cryptoQuantity=" + this.cryptoQuantity + ", fee=" + this.fee + ", feeMsgList=" + this.feeMsgList + ", fiatAmount=" + this.fiatAmount + ", fiatCurrency=" + this.fiatCurrency + ", orderId=" + this.orderId + ", orderStatus=" + this.orderStatus + ", paymentName=" + this.paymentName + ", rechargeOrderId=" + this.rechargeOrderId + ", tradeType=" + this.tradeType + ", price=" + this.price + ", refType=" + this.refType + ", side=" + this.side + ", displayErrorMsg=" + this.displayErrorMsg + ", paymentMethodCode=" + this.paymentMethodCode + ", channelId=" + this.channelId + ", rechargeOrderDetail=" + this.rechargeOrderDetail + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Integer num = this.bizSource;
        if (num == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num.intValue());
        }
        Long l11 = this.createdAt;
        if (l11 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeLong(l11.longValue());
        }
        dest.writeString(this.cryptoCurrency);
        dest.writeString(this.cryptoQuantity);
        dest.writeString(this.fee);
        List<MultiFee> list = this.feeMsgList;
        if (list == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(list.size());
            Iterator<MultiFee> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(dest, flags);
            }
        }
        dest.writeString(this.fiatAmount);
        dest.writeString(this.fiatCurrency);
        dest.writeString(this.orderId);
        Integer num2 = this.orderStatus;
        if (num2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num2.intValue());
        }
        dest.writeString(this.paymentName);
        dest.writeString(this.rechargeOrderId);
        dest.writeString(this.tradeType);
        dest.writeString(this.price);
        Integer num3 = this.refType;
        if (num3 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num3.intValue());
        }
        dest.writeString(this.side);
        dest.writeString(this.displayErrorMsg);
        dest.writeString(this.paymentMethodCode);
        dest.writeString(this.channelId);
        RechargeOrderDetail rechargeOrderDetail = this.rechargeOrderDetail;
        if (rechargeOrderDetail == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            rechargeOrderDetail.writeToParcel(dest, flags);
        }
    }

    public FiatBankCardOrder(@Nullable Integer num, @Nullable Long l11, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable List<MultiFee> list, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable Integer num2, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable Integer num3, @Nullable String str11, @Nullable String str12, @Nullable String str13, @Nullable String str14, @Nullable RechargeOrderDetail rechargeOrderDetail) {
        this.bizSource = num;
        this.createdAt = l11;
        this.cryptoCurrency = str;
        this.cryptoQuantity = str2;
        this.fee = str3;
        this.feeMsgList = list;
        this.fiatAmount = str4;
        this.fiatCurrency = str5;
        this.orderId = str6;
        this.orderStatus = num2;
        this.paymentName = str7;
        this.rechargeOrderId = str8;
        this.tradeType = str9;
        this.price = str10;
        this.refType = num3;
        this.side = str11;
        this.displayErrorMsg = str12;
        this.paymentMethodCode = str13;
        this.channelId = str14;
        this.rechargeOrderDetail = rechargeOrderDetail;
    }
}
