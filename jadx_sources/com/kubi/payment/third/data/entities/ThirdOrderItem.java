package com.kubi.payment.third.data.entities;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.annotations.SerializedName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ThirdOrder.kt */
/* JADX INFO: loaded from: classes33.dex */
@Keep
@Metadata(m90083d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u001c\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 =2\u00020\u0001:\u0001=B\u007f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0006\u0010!\u001a\u00020\"J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010$\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0015J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u009e\u0001\u0010/\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u00100J\u0006\u00101\u001a\u000202J\u0013\u00103\u001a\u00020\"2\b\u00104\u001a\u0004\u0018\u000105HÖ\u0003J\t\u00106\u001a\u000202HÖ\u0001J\t\u00107\u001a\u00020\u0003HÖ\u0001J\u0016\u00108\u001a\u0002092\u0006\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u000202R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0013R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0013R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0013R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0013R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0013R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0013R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0013R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0013R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0013R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0013¨\u0006>"}, m90084d2 = {"Lcom/kubi/payment/third/data/entities/ThirdOrderItem;", "Landroid/os/Parcelable;", "amount", "", "createdAt", "", FirebaseAnalytics.Param.CURRENCY, "fiatAmount", "fiatCurrency", "id", "payChannelName", "channelId", "status", "metaData", "channelIconUrl", "orderSource", "<init>", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAmount", "()Ljava/lang/String;", "getCreatedAt", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getCurrency", "getFiatAmount", "getFiatCurrency", "getId", "getPayChannelName", "getChannelId", "getStatus", "getMetaData", "getChannelIconUrl", "getOrderSource", "isFast", "", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "copy", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/kubi/payment/third/data/entities/ThirdOrderItem;", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "Companion", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class ThirdOrderItem implements Parcelable {

    @NotNull
    public static final String ORDER_DISPATCH = "DISPATCH";

    @SerializedName("cryptoAmount")
    @Nullable
    private final String amount;

    @Nullable
    private final String channelIconUrl;

    @SerializedName("channelId")
    @Nullable
    private final String channelId;

    @SerializedName("created")
    @Nullable
    private final Long createdAt;

    @SerializedName("cryptoCurrency")
    @Nullable
    private final String currency;

    @Nullable
    private final String fiatAmount;

    @Nullable
    private final String fiatCurrency;

    @SerializedName("thirdpartyOrderId")
    @Nullable
    private final String id;

    @Nullable
    private final String metaData;

    @Nullable
    private final String orderSource;

    @Nullable
    private final String payChannelName;

    @Nullable
    private final String status;

    @NotNull
    public static final Parcelable.Creator<ThirdOrderItem> CREATOR = new C21390a();

    /* JADX INFO: renamed from: com.kubi.payment.third.data.entities.ThirdOrderItem$a */
    /* JADX INFO: compiled from: ThirdOrder.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C21390a implements Parcelable.Creator<ThirdOrderItem> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ThirdOrderItem createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ThirdOrderItem(parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final ThirdOrderItem[] newArray(int i11) {
            return new ThirdOrderItem[i11];
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
        if (!(other instanceof ThirdOrderItem)) {
            return false;
        }
        ThirdOrderItem thirdOrderItem = (ThirdOrderItem) other;
        return Intrinsics.areEqual(this.amount, thirdOrderItem.amount) && Intrinsics.areEqual(this.createdAt, thirdOrderItem.createdAt) && Intrinsics.areEqual(this.currency, thirdOrderItem.currency) && Intrinsics.areEqual(this.fiatAmount, thirdOrderItem.fiatAmount) && Intrinsics.areEqual(this.fiatCurrency, thirdOrderItem.fiatCurrency) && Intrinsics.areEqual(this.id, thirdOrderItem.id) && Intrinsics.areEqual(this.payChannelName, thirdOrderItem.payChannelName) && Intrinsics.areEqual(this.channelId, thirdOrderItem.channelId) && Intrinsics.areEqual(this.status, thirdOrderItem.status) && Intrinsics.areEqual(this.metaData, thirdOrderItem.metaData) && Intrinsics.areEqual(this.channelIconUrl, thirdOrderItem.channelIconUrl) && Intrinsics.areEqual(this.orderSource, thirdOrderItem.orderSource);
    }

    public static /* synthetic */ ThirdOrderItem copy$default(ThirdOrderItem thirdOrderItem, String str, Long l11, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = thirdOrderItem.amount;
        }
        if ((i11 & 2) != 0) {
            l11 = thirdOrderItem.createdAt;
        }
        if ((i11 & 4) != 0) {
            str2 = thirdOrderItem.currency;
        }
        if ((i11 & 8) != 0) {
            str3 = thirdOrderItem.fiatAmount;
        }
        if ((i11 & 16) != 0) {
            str4 = thirdOrderItem.fiatCurrency;
        }
        if ((i11 & 32) != 0) {
            str5 = thirdOrderItem.id;
        }
        if ((i11 & 64) != 0) {
            str6 = thirdOrderItem.payChannelName;
        }
        if ((i11 & 128) != 0) {
            str7 = thirdOrderItem.channelId;
        }
        if ((i11 & 256) != 0) {
            str8 = thirdOrderItem.status;
        }
        if ((i11 & 512) != 0) {
            str9 = thirdOrderItem.metaData;
        }
        if ((i11 & 1024) != 0) {
            str10 = thirdOrderItem.channelIconUrl;
        }
        if ((i11 & 2048) != 0) {
            str11 = thirdOrderItem.orderSource;
        }
        String str12 = str10;
        String str13 = str11;
        String str14 = str8;
        String str15 = str9;
        String str16 = str6;
        String str17 = str7;
        String str18 = str4;
        String str19 = str5;
        return thirdOrderItem.copy(str, l11, str2, str3, str18, str19, str16, str17, str14, str15, str12, str13);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAmount() {
        return this.amount;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getMetaData() {
        return this.metaData;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getChannelIconUrl() {
        return this.channelIconUrl;
    }

    @Nullable
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getOrderSource() {
        return this.orderSource;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Long getCreatedAt() {
        return this.createdAt;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getFiatAmount() {
        return this.fiatAmount;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getFiatCurrency() {
        return this.fiatCurrency;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getPayChannelName() {
        return this.payChannelName;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getChannelId() {
        return this.channelId;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    @NotNull
    public final ThirdOrderItem copy(@Nullable String amount, @Nullable Long createdAt, @Nullable String currency, @Nullable String fiatAmount, @Nullable String fiatCurrency, @Nullable String id2, @Nullable String payChannelName, @Nullable String channelId, @Nullable String status, @Nullable String metaData, @Nullable String channelIconUrl, @Nullable String orderSource) {
        return new ThirdOrderItem(amount, createdAt, currency, fiatAmount, fiatCurrency, id2, payChannelName, channelId, status, metaData, channelIconUrl, orderSource);
    }

    @Nullable
    public final String getAmount() {
        return this.amount;
    }

    @Nullable
    public final String getChannelIconUrl() {
        return this.channelIconUrl;
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
    public final String getCurrency() {
        return this.currency;
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
    public final String getId() {
        return this.id;
    }

    @Nullable
    public final String getMetaData() {
        return this.metaData;
    }

    @Nullable
    public final String getOrderSource() {
        return this.orderSource;
    }

    @Nullable
    public final String getPayChannelName() {
        return this.payChannelName;
    }

    @Nullable
    public final String getStatus() {
        return this.status;
    }

    public int hashCode() {
        String str = this.amount;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Long l11 = this.createdAt;
        int iHashCode2 = (iHashCode + (l11 == null ? 0 : l11.hashCode())) * 31;
        String str2 = this.currency;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.fiatAmount;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.fiatCurrency;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.id;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.payChannelName;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.channelId;
        int iHashCode8 = (iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.status;
        int iHashCode9 = (iHashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.metaData;
        int iHashCode10 = (iHashCode9 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.channelIconUrl;
        int iHashCode11 = (iHashCode10 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.orderSource;
        return iHashCode11 + (str11 != null ? str11.hashCode() : 0);
    }

    public final boolean isFast() {
        return Intrinsics.areEqual(this.orderSource, ORDER_DISPATCH);
    }

    @NotNull
    public String toString() {
        return "ThirdOrderItem(amount=" + this.amount + ", createdAt=" + this.createdAt + ", currency=" + this.currency + ", fiatAmount=" + this.fiatAmount + ", fiatCurrency=" + this.fiatCurrency + ", id=" + this.id + ", payChannelName=" + this.payChannelName + ", channelId=" + this.channelId + ", status=" + this.status + ", metaData=" + this.metaData + ", channelIconUrl=" + this.channelIconUrl + ", orderSource=" + this.orderSource + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.amount);
        Long l11 = this.createdAt;
        if (l11 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeLong(l11.longValue());
        }
        dest.writeString(this.currency);
        dest.writeString(this.fiatAmount);
        dest.writeString(this.fiatCurrency);
        dest.writeString(this.id);
        dest.writeString(this.payChannelName);
        dest.writeString(this.channelId);
        dest.writeString(this.status);
        dest.writeString(this.metaData);
        dest.writeString(this.channelIconUrl);
        dest.writeString(this.orderSource);
    }

    public ThirdOrderItem(@Nullable String str, @Nullable Long l11, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable String str11) {
        this.amount = str;
        this.createdAt = l11;
        this.currency = str2;
        this.fiatAmount = str3;
        this.fiatCurrency = str4;
        this.id = str5;
        this.payChannelName = str6;
        this.channelId = str7;
        this.status = str8;
        this.metaData = str9;
        this.channelIconUrl = str10;
        this.orderSource = str11;
    }
}
