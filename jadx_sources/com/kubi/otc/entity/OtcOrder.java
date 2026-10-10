package com.kubi.otc.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.annotations.SerializedName;
import com.kubi.payment.third.data.entities.ThirdOrderItem;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: OtcBean.kt */
/* JADX INFO: loaded from: classes33.dex */
@Keep
@Metadata(m90083d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b6\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BÅ\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u001a\u0010\u001bJ\u0006\u00106\u001a\u00020\u0010J\u0010\u00107\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001dJ\u000b\u00108\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010A\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0002\u0010+J\u000b\u0010B\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010C\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010D\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010E\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0002\u0010+J\u000b\u0010F\u001a\u0004\u0018\u00010\u0016HÆ\u0003J\u000b\u0010G\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010H\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0002\u0010+J\u000b\u0010I\u001a\u0004\u0018\u00010\u0005HÆ\u0003Jò\u0001\u0010J\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010KJ\u0006\u0010L\u001a\u00020MJ\u0013\u0010N\u001a\u00020\u00102\b\u0010O\u001a\u0004\u0018\u00010PHÖ\u0003J\t\u0010Q\u001a\u00020MHÖ\u0001J\t\u0010R\u001a\u00020\u0005HÖ\u0001J\u0016\u0010S\u001a\u00020T2\u0006\u0010U\u001a\u00020V2\u0006\u0010W\u001a\u00020MR\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u001e\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b#\u0010 R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\"R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b%\u0010 R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\"R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b'\u0010 R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b(\u0010 R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b)\u0010 R\u0015\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\n\n\u0002\u0010,\u001a\u0004\b*\u0010+R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b-\u0010 R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b.\u0010 R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b/\u0010 R\u0015\u0010\u0014\u001a\u0004\u0018\u00010\u0010¢\u0006\n\n\u0002\u0010,\u001a\u0004\b0\u0010+R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0016¢\u0006\b\n\u0000\u001a\u0004\b1\u00102R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b3\u0010 R\u001a\u0010\u0018\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010,\u001a\u0004\b4\u0010+R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b5\u0010 ¨\u0006X"}, m90084d2 = {"Lcom/kubi/otc/entity/OtcOrder;", "Landroid/os/Parcelable;", "createdAt", "", FirebaseAnalytics.Param.CURRENCY, "", "currencyAmount", "Ljava/math/BigDecimal;", "legalCurrency", "legalCurrencyAmount", "id", FirebaseAnalytics.Param.PRICE, "opTraderNickName", "appealStatus", "status", "buyerRole", "", "orderType", "platform", "adRemarks", "displayOpTradeInfo", "imRelationshipDto", "Lcom/kubi/otc/entity/OrderImInfo;", "orderSource", "canChat", "blockStatus", "<init>", "(Ljava/lang/Long;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lcom/kubi/otc/entity/OrderImInfo;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;)V", "getCreatedAt", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getCurrency", "()Ljava/lang/String;", "getCurrencyAmount", "()Ljava/math/BigDecimal;", "getLegalCurrency", "getLegalCurrencyAmount", "getId", "getPrice", "getOpTraderNickName", "getAppealStatus", "getStatus", "getBuyerRole", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getOrderType", "getPlatform", "getAdRemarks", "getDisplayOpTradeInfo", "getImRelationshipDto", "()Lcom/kubi/otc/entity/OrderImInfo;", "getOrderSource", "getCanChat", "getBlockStatus", "isFast", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "copy", "(Ljava/lang/Long;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lcom/kubi/otc/entity/OrderImInfo;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;)Lcom/kubi/otc/entity/OtcOrder;", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class OtcOrder implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<OtcOrder> CREATOR = new Creator();

    @Nullable
    private final String adRemarks;

    @Nullable
    private final String appealStatus;

    @SerializedName("blackStatus")
    @Nullable
    private final String blockStatus;

    @Nullable
    private final Boolean buyerRole;

    @SerializedName("canChat")
    @Nullable
    private final Boolean canChat;

    @Nullable
    private final Long createdAt;

    @Nullable
    private final String currency;

    @Nullable
    private final BigDecimal currencyAmount;

    @Nullable
    private final Boolean displayOpTradeInfo;

    @Nullable
    private final String id;

    @Nullable
    private final OrderImInfo imRelationshipDto;

    @Nullable
    private final String legalCurrency;

    @Nullable
    private final BigDecimal legalCurrencyAmount;

    @Nullable
    private final String opTraderNickName;

    @Nullable
    private final String orderSource;

    @Nullable
    private final String orderType;

    @Nullable
    private final String platform;

    @Nullable
    private final BigDecimal price;

    @Nullable
    private final String status;

    /* JADX INFO: compiled from: OtcBean.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Creator implements Parcelable.Creator<OtcOrder> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OtcOrder createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Boolean boolValueOf2;
            Boolean boolValueOf3;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            Long lValueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            String string = parcel.readString();
            BigDecimal bigDecimal = (BigDecimal) parcel.readSerializable();
            String string2 = parcel.readString();
            BigDecimal bigDecimal2 = (BigDecimal) parcel.readSerializable();
            String string3 = parcel.readString();
            BigDecimal bigDecimal3 = (BigDecimal) parcel.readSerializable();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            String string7 = parcel.readString();
            String string8 = parcel.readString();
            boolean z11 = false;
            String string9 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf2 = null;
            } else {
                boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            OrderImInfo orderImInfoCreateFromParcel = parcel.readInt() == 0 ? null : OrderImInfo.CREATOR.createFromParcel(parcel);
            Boolean bool = boolValueOf2;
            String string10 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf3 = null;
            } else {
                if (parcel.readInt() != 0) {
                    z11 = true;
                }
                boolValueOf3 = Boolean.valueOf(z11);
            }
            return new OtcOrder(lValueOf, string, bigDecimal, string2, bigDecimal2, string3, bigDecimal3, string4, string5, string6, boolValueOf, string7, string8, string9, bool, orderImInfoCreateFromParcel, string10, boolValueOf3, parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OtcOrder[] newArray(int i11) {
            return new OtcOrder[i11];
        }
    }

    public static /* synthetic */ OtcOrder copy$default(OtcOrder otcOrder, Long l11, String str, BigDecimal bigDecimal, String str2, BigDecimal bigDecimal2, String str3, BigDecimal bigDecimal3, String str4, String str5, String str6, Boolean bool, String str7, String str8, String str9, Boolean bool2, OrderImInfo orderImInfo, String str10, Boolean bool3, String str11, int i11, Object obj) {
        String str12;
        Boolean bool4;
        Long l12 = (i11 & 1) != 0 ? otcOrder.createdAt : l11;
        String str13 = (i11 & 2) != 0 ? otcOrder.currency : str;
        BigDecimal bigDecimal4 = (i11 & 4) != 0 ? otcOrder.currencyAmount : bigDecimal;
        String str14 = (i11 & 8) != 0 ? otcOrder.legalCurrency : str2;
        BigDecimal bigDecimal5 = (i11 & 16) != 0 ? otcOrder.legalCurrencyAmount : bigDecimal2;
        String str15 = (i11 & 32) != 0 ? otcOrder.id : str3;
        BigDecimal bigDecimal6 = (i11 & 64) != 0 ? otcOrder.price : bigDecimal3;
        String str16 = (i11 & 128) != 0 ? otcOrder.opTraderNickName : str4;
        String str17 = (i11 & 256) != 0 ? otcOrder.appealStatus : str5;
        String str18 = (i11 & 512) != 0 ? otcOrder.status : str6;
        Boolean bool5 = (i11 & 1024) != 0 ? otcOrder.buyerRole : bool;
        String str19 = (i11 & 2048) != 0 ? otcOrder.orderType : str7;
        String str20 = (i11 & 4096) != 0 ? otcOrder.platform : str8;
        String str21 = (i11 & 8192) != 0 ? otcOrder.adRemarks : str9;
        Long l13 = l12;
        Boolean bool6 = (i11 & 16384) != 0 ? otcOrder.displayOpTradeInfo : bool2;
        OrderImInfo orderImInfo2 = (i11 & 32768) != 0 ? otcOrder.imRelationshipDto : orderImInfo;
        String str22 = (i11 & 65536) != 0 ? otcOrder.orderSource : str10;
        Boolean bool7 = (i11 & 131072) != 0 ? otcOrder.canChat : bool3;
        if ((i11 & 262144) != 0) {
            bool4 = bool7;
            str12 = otcOrder.blockStatus;
        } else {
            str12 = str11;
            bool4 = bool7;
        }
        return otcOrder.copy(l13, str13, bigDecimal4, str14, bigDecimal5, str15, bigDecimal6, str16, str17, str18, bool5, str19, str20, str21, bool6, orderImInfo2, str22, bool4, str12);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OtcOrder)) {
            return false;
        }
        OtcOrder otcOrder = (OtcOrder) other;
        return Intrinsics.areEqual(this.createdAt, otcOrder.createdAt) && Intrinsics.areEqual(this.currency, otcOrder.currency) && Intrinsics.areEqual(this.currencyAmount, otcOrder.currencyAmount) && Intrinsics.areEqual(this.legalCurrency, otcOrder.legalCurrency) && Intrinsics.areEqual(this.legalCurrencyAmount, otcOrder.legalCurrencyAmount) && Intrinsics.areEqual(this.id, otcOrder.id) && Intrinsics.areEqual(this.price, otcOrder.price) && Intrinsics.areEqual(this.opTraderNickName, otcOrder.opTraderNickName) && Intrinsics.areEqual(this.appealStatus, otcOrder.appealStatus) && Intrinsics.areEqual(this.status, otcOrder.status) && Intrinsics.areEqual(this.buyerRole, otcOrder.buyerRole) && Intrinsics.areEqual(this.orderType, otcOrder.orderType) && Intrinsics.areEqual(this.platform, otcOrder.platform) && Intrinsics.areEqual(this.adRemarks, otcOrder.adRemarks) && Intrinsics.areEqual(this.displayOpTradeInfo, otcOrder.displayOpTradeInfo) && Intrinsics.areEqual(this.imRelationshipDto, otcOrder.imRelationshipDto) && Intrinsics.areEqual(this.orderSource, otcOrder.orderSource) && Intrinsics.areEqual(this.canChat, otcOrder.canChat) && Intrinsics.areEqual(this.blockStatus, otcOrder.blockStatus);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Long getCreatedAt() {
        return this.createdAt;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final Boolean getBuyerRole() {
        return this.buyerRole;
    }

    @Nullable
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getOrderType() {
        return this.orderType;
    }

    @Nullable
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getPlatform() {
        return this.platform;
    }

    @Nullable
    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getAdRemarks() {
        return this.adRemarks;
    }

    @Nullable
    /* JADX INFO: renamed from: component15, reason: from getter */
    public final Boolean getDisplayOpTradeInfo() {
        return this.displayOpTradeInfo;
    }

    @Nullable
    /* JADX INFO: renamed from: component16, reason: from getter */
    public final OrderImInfo getImRelationshipDto() {
        return this.imRelationshipDto;
    }

    @Nullable
    /* JADX INFO: renamed from: component17, reason: from getter */
    public final String getOrderSource() {
        return this.orderSource;
    }

    @Nullable
    /* JADX INFO: renamed from: component18, reason: from getter */
    public final Boolean getCanChat() {
        return this.canChat;
    }

    @Nullable
    /* JADX INFO: renamed from: component19, reason: from getter */
    public final String getBlockStatus() {
        return this.blockStatus;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final BigDecimal getCurrencyAmount() {
        return this.currencyAmount;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getLegalCurrency() {
        return this.legalCurrency;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final BigDecimal getLegalCurrencyAmount() {
        return this.legalCurrencyAmount;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final BigDecimal getPrice() {
        return this.price;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getOpTraderNickName() {
        return this.opTraderNickName;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getAppealStatus() {
        return this.appealStatus;
    }

    @NotNull
    public final OtcOrder copy(@Nullable Long createdAt, @Nullable String currency, @Nullable BigDecimal currencyAmount, @Nullable String legalCurrency, @Nullable BigDecimal legalCurrencyAmount, @Nullable String id2, @Nullable BigDecimal price, @Nullable String opTraderNickName, @Nullable String appealStatus, @Nullable String status, @Nullable Boolean buyerRole, @Nullable String orderType, @Nullable String platform, @Nullable String adRemarks, @Nullable Boolean displayOpTradeInfo, @Nullable OrderImInfo imRelationshipDto, @Nullable String orderSource, @Nullable Boolean canChat, @Nullable String blockStatus) {
        return new OtcOrder(createdAt, currency, currencyAmount, legalCurrency, legalCurrencyAmount, id2, price, opTraderNickName, appealStatus, status, buyerRole, orderType, platform, adRemarks, displayOpTradeInfo, imRelationshipDto, orderSource, canChat, blockStatus);
    }

    @Nullable
    public final String getAdRemarks() {
        return this.adRemarks;
    }

    @Nullable
    public final String getAppealStatus() {
        return this.appealStatus;
    }

    @Nullable
    public final String getBlockStatus() {
        return this.blockStatus;
    }

    @Nullable
    public final Boolean getBuyerRole() {
        return this.buyerRole;
    }

    @Nullable
    public final Boolean getCanChat() {
        return this.canChat;
    }

    @Nullable
    public final Long getCreatedAt() {
        return this.createdAt;
    }

    @Nullable
    public final String getCurrency() {
        return this.currency;
    }

    @Nullable
    public final BigDecimal getCurrencyAmount() {
        return this.currencyAmount;
    }

    @Nullable
    public final Boolean getDisplayOpTradeInfo() {
        return this.displayOpTradeInfo;
    }

    @Nullable
    public final String getId() {
        return this.id;
    }

    @Nullable
    public final OrderImInfo getImRelationshipDto() {
        return this.imRelationshipDto;
    }

    @Nullable
    public final String getLegalCurrency() {
        return this.legalCurrency;
    }

    @Nullable
    public final BigDecimal getLegalCurrencyAmount() {
        return this.legalCurrencyAmount;
    }

    @Nullable
    public final String getOpTraderNickName() {
        return this.opTraderNickName;
    }

    @Nullable
    public final String getOrderSource() {
        return this.orderSource;
    }

    @Nullable
    public final String getOrderType() {
        return this.orderType;
    }

    @Nullable
    public final String getPlatform() {
        return this.platform;
    }

    @Nullable
    public final BigDecimal getPrice() {
        return this.price;
    }

    @Nullable
    public final String getStatus() {
        return this.status;
    }

    public int hashCode() {
        Long l11 = this.createdAt;
        int iHashCode = (l11 == null ? 0 : l11.hashCode()) * 31;
        String str = this.currency;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        BigDecimal bigDecimal = this.currencyAmount;
        int iHashCode3 = (iHashCode2 + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        String str2 = this.legalCurrency;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        BigDecimal bigDecimal2 = this.legalCurrencyAmount;
        int iHashCode5 = (iHashCode4 + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
        String str3 = this.id;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        BigDecimal bigDecimal3 = this.price;
        int iHashCode7 = (iHashCode6 + (bigDecimal3 == null ? 0 : bigDecimal3.hashCode())) * 31;
        String str4 = this.opTraderNickName;
        int iHashCode8 = (iHashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.appealStatus;
        int iHashCode9 = (iHashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.status;
        int iHashCode10 = (iHashCode9 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Boolean bool = this.buyerRole;
        int iHashCode11 = (iHashCode10 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str7 = this.orderType;
        int iHashCode12 = (iHashCode11 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.platform;
        int iHashCode13 = (iHashCode12 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.adRemarks;
        int iHashCode14 = (iHashCode13 + (str9 == null ? 0 : str9.hashCode())) * 31;
        Boolean bool2 = this.displayOpTradeInfo;
        int iHashCode15 = (iHashCode14 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        OrderImInfo orderImInfo = this.imRelationshipDto;
        int iHashCode16 = (iHashCode15 + (orderImInfo == null ? 0 : orderImInfo.hashCode())) * 31;
        String str10 = this.orderSource;
        int iHashCode17 = (iHashCode16 + (str10 == null ? 0 : str10.hashCode())) * 31;
        Boolean bool3 = this.canChat;
        int iHashCode18 = (iHashCode17 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        String str11 = this.blockStatus;
        return iHashCode18 + (str11 != null ? str11.hashCode() : 0);
    }

    public final boolean isFast() {
        return Intrinsics.areEqual(this.orderType, ThirdOrderItem.ORDER_DISPATCH);
    }

    @NotNull
    public String toString() {
        return "OtcOrder(createdAt=" + this.createdAt + ", currency=" + this.currency + ", currencyAmount=" + this.currencyAmount + ", legalCurrency=" + this.legalCurrency + ", legalCurrencyAmount=" + this.legalCurrencyAmount + ", id=" + this.id + ", price=" + this.price + ", opTraderNickName=" + this.opTraderNickName + ", appealStatus=" + this.appealStatus + ", status=" + this.status + ", buyerRole=" + this.buyerRole + ", orderType=" + this.orderType + ", platform=" + this.platform + ", adRemarks=" + this.adRemarks + ", displayOpTradeInfo=" + this.displayOpTradeInfo + ", imRelationshipDto=" + this.imRelationshipDto + ", orderSource=" + this.orderSource + ", canChat=" + this.canChat + ", blockStatus=" + this.blockStatus + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Long l11 = this.createdAt;
        if (l11 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeLong(l11.longValue());
        }
        dest.writeString(this.currency);
        dest.writeSerializable(this.currencyAmount);
        dest.writeString(this.legalCurrency);
        dest.writeSerializable(this.legalCurrencyAmount);
        dest.writeString(this.id);
        dest.writeSerializable(this.price);
        dest.writeString(this.opTraderNickName);
        dest.writeString(this.appealStatus);
        dest.writeString(this.status);
        Boolean bool = this.buyerRole;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool.booleanValue() ? 1 : 0);
        }
        dest.writeString(this.orderType);
        dest.writeString(this.platform);
        dest.writeString(this.adRemarks);
        Boolean bool2 = this.displayOpTradeInfo;
        if (bool2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool2.booleanValue() ? 1 : 0);
        }
        OrderImInfo orderImInfo = this.imRelationshipDto;
        if (orderImInfo == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            orderImInfo.writeToParcel(dest, flags);
        }
        dest.writeString(this.orderSource);
        Boolean bool3 = this.canChat;
        if (bool3 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool3.booleanValue() ? 1 : 0);
        }
        dest.writeString(this.blockStatus);
    }

    public OtcOrder(@Nullable Long l11, @Nullable String str, @Nullable BigDecimal bigDecimal, @Nullable String str2, @Nullable BigDecimal bigDecimal2, @Nullable String str3, @Nullable BigDecimal bigDecimal3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable Boolean bool, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable Boolean bool2, @Nullable OrderImInfo orderImInfo, @Nullable String str10, @Nullable Boolean bool3, @Nullable String str11) {
        this.createdAt = l11;
        this.currency = str;
        this.currencyAmount = bigDecimal;
        this.legalCurrency = str2;
        this.legalCurrencyAmount = bigDecimal2;
        this.id = str3;
        this.price = bigDecimal3;
        this.opTraderNickName = str4;
        this.appealStatus = str5;
        this.status = str6;
        this.buyerRole = bool;
        this.orderType = str7;
        this.platform = str8;
        this.adRemarks = str9;
        this.displayOpTradeInfo = bool2;
        this.imRelationshipDto = orderImInfo;
        this.orderSource = str10;
        this.canChat = bool3;
        this.blockStatus = str11;
    }
}
