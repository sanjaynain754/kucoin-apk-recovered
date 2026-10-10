package com.kubi.otc.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import ht.C38346y;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: FiatBean.kt */
/* JADX INFO: loaded from: classes33.dex */
@Keep
@Metadata(m90083d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Be\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u000e\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003Ju\u0010+\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010,\u001a\u00020-J\u0013\u0010.\u001a\u00020\u001f2\b\u0010/\u001a\u0004\u0018\u000100HÖ\u0003J\t\u00101\u001a\u00020-HÖ\u0001J\t\u00102\u001a\u00020\u0003HÖ\u0001J\u0016\u00103\u001a\u0002042\u0006\u00105\u001a\u0002062\u0006\u00107\u001a\u00020-R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0010R\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001c\u0010\f\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0010\"\u0004\b\u001c\u0010\u001d¨\u00068"}, m90084d2 = {"Lcom/kubi/otc/entity/FiatAdvcashRechargeMode;", "Landroid/os/Parcelable;", "channelId", "", "fiatCurrency", "paymentName", "paymentIcon", "minFiatAmount", "maxFiatAmount", "feeMsg", "fee", "Lcom/kubi/otc/entity/FiatFee;", "amount", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/kubi/otc/entity/FiatFee;Ljava/lang/String;)V", "getChannelId", "()Ljava/lang/String;", "getFiatCurrency", "getPaymentName", "getPaymentIcon", "getMinFiatAmount", "getMaxFiatAmount", "getFeeMsg", "getFee", "()Lcom/kubi/otc/entity/FiatFee;", "setFee", "(Lcom/kubi/otc/entity/FiatFee;)V", "getAmount", "setAmount", "(Ljava/lang/String;)V", "isLimitFiat", "", "coinAmount", "Ljava/math/BigDecimal;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class FiatAdvcashRechargeMode implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<FiatAdvcashRechargeMode> CREATOR = new Creator();

    @Nullable
    private String amount;

    @Nullable
    private final String channelId;

    @Nullable
    private FiatFee fee;

    @Nullable
    private final String feeMsg;

    @Nullable
    private final String fiatCurrency;

    @Nullable
    private final String maxFiatAmount;

    @Nullable
    private final String minFiatAmount;

    @Nullable
    private final String paymentIcon;

    @Nullable
    private final String paymentName;

    /* JADX INFO: compiled from: FiatBean.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Creator implements Parcelable.Creator<FiatAdvcashRechargeMode> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FiatAdvcashRechargeMode createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new FiatAdvcashRechargeMode(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : FiatFee.CREATOR.createFromParcel(parcel), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FiatAdvcashRechargeMode[] newArray(int i11) {
            return new FiatAdvcashRechargeMode[i11];
        }
    }

    public FiatAdvcashRechargeMode(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable FiatFee fiatFee, @Nullable String str8) {
        this.channelId = str;
        this.fiatCurrency = str2;
        this.paymentName = str3;
        this.paymentIcon = str4;
        this.minFiatAmount = str5;
        this.maxFiatAmount = str6;
        this.feeMsg = str7;
        this.fee = fiatFee;
        this.amount = str8;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FiatAdvcashRechargeMode)) {
            return false;
        }
        FiatAdvcashRechargeMode fiatAdvcashRechargeMode = (FiatAdvcashRechargeMode) other;
        return Intrinsics.areEqual(this.channelId, fiatAdvcashRechargeMode.channelId) && Intrinsics.areEqual(this.fiatCurrency, fiatAdvcashRechargeMode.fiatCurrency) && Intrinsics.areEqual(this.paymentName, fiatAdvcashRechargeMode.paymentName) && Intrinsics.areEqual(this.paymentIcon, fiatAdvcashRechargeMode.paymentIcon) && Intrinsics.areEqual(this.minFiatAmount, fiatAdvcashRechargeMode.minFiatAmount) && Intrinsics.areEqual(this.maxFiatAmount, fiatAdvcashRechargeMode.maxFiatAmount) && Intrinsics.areEqual(this.feeMsg, fiatAdvcashRechargeMode.feeMsg) && Intrinsics.areEqual(this.fee, fiatAdvcashRechargeMode.fee) && Intrinsics.areEqual(this.amount, fiatAdvcashRechargeMode.amount);
    }

    public static /* synthetic */ FiatAdvcashRechargeMode copy$default(FiatAdvcashRechargeMode fiatAdvcashRechargeMode, String str, String str2, String str3, String str4, String str5, String str6, String str7, FiatFee fiatFee, String str8, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = fiatAdvcashRechargeMode.channelId;
        }
        if ((i11 & 2) != 0) {
            str2 = fiatAdvcashRechargeMode.fiatCurrency;
        }
        if ((i11 & 4) != 0) {
            str3 = fiatAdvcashRechargeMode.paymentName;
        }
        if ((i11 & 8) != 0) {
            str4 = fiatAdvcashRechargeMode.paymentIcon;
        }
        if ((i11 & 16) != 0) {
            str5 = fiatAdvcashRechargeMode.minFiatAmount;
        }
        if ((i11 & 32) != 0) {
            str6 = fiatAdvcashRechargeMode.maxFiatAmount;
        }
        if ((i11 & 64) != 0) {
            str7 = fiatAdvcashRechargeMode.feeMsg;
        }
        if ((i11 & 128) != 0) {
            fiatFee = fiatAdvcashRechargeMode.fee;
        }
        if ((i11 & 256) != 0) {
            str8 = fiatAdvcashRechargeMode.amount;
        }
        FiatFee fiatFee2 = fiatFee;
        String str9 = str8;
        String str10 = str6;
        String str11 = str7;
        String str12 = str5;
        String str13 = str3;
        return fiatAdvcashRechargeMode.copy(str, str2, str13, str4, str12, str10, str11, fiatFee2, str9);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getChannelId() {
        return this.channelId;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getFiatCurrency() {
        return this.fiatCurrency;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getPaymentName() {
        return this.paymentName;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getPaymentIcon() {
        return this.paymentIcon;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getMinFiatAmount() {
        return this.minFiatAmount;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getMaxFiatAmount() {
        return this.maxFiatAmount;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getFeeMsg() {
        return this.feeMsg;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final FiatFee getFee() {
        return this.fee;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getAmount() {
        return this.amount;
    }

    @NotNull
    public final FiatAdvcashRechargeMode copy(@Nullable String channelId, @Nullable String fiatCurrency, @Nullable String paymentName, @Nullable String paymentIcon, @Nullable String minFiatAmount, @Nullable String maxFiatAmount, @Nullable String feeMsg, @Nullable FiatFee fee, @Nullable String amount) {
        return new FiatAdvcashRechargeMode(channelId, fiatCurrency, paymentName, paymentIcon, minFiatAmount, maxFiatAmount, feeMsg, fee, amount);
    }

    @Nullable
    public final String getAmount() {
        return this.amount;
    }

    @Nullable
    public final String getChannelId() {
        return this.channelId;
    }

    @Nullable
    public final FiatFee getFee() {
        return this.fee;
    }

    @Nullable
    public final String getFeeMsg() {
        return this.feeMsg;
    }

    @Nullable
    public final String getFiatCurrency() {
        return this.fiatCurrency;
    }

    @Nullable
    public final String getMaxFiatAmount() {
        return this.maxFiatAmount;
    }

    @Nullable
    public final String getMinFiatAmount() {
        return this.minFiatAmount;
    }

    @Nullable
    public final String getPaymentIcon() {
        return this.paymentIcon;
    }

    @Nullable
    public final String getPaymentName() {
        return this.paymentName;
    }

    public int hashCode() {
        String str = this.channelId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.fiatCurrency;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.paymentName;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.paymentIcon;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.minFiatAmount;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.maxFiatAmount;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.feeMsg;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        FiatFee fiatFee = this.fee;
        int iHashCode8 = (iHashCode7 + (fiatFee == null ? 0 : fiatFee.hashCode())) * 31;
        String str8 = this.amount;
        return iHashCode8 + (str8 != null ? str8.hashCode() : 0);
    }

    public final boolean isLimitFiat(@NotNull BigDecimal coinAmount) {
        Intrinsics.checkNotNullParameter(coinAmount, "coinAmount");
        return coinAmount.compareTo(C38346y.m86490A(this.minFiatAmount)) == -1 || coinAmount.compareTo(C38346y.m86490A(this.maxFiatAmount)) == 1;
    }

    public final void setAmount(@Nullable String str) {
        this.amount = str;
    }

    public final void setFee(@Nullable FiatFee fiatFee) {
        this.fee = fiatFee;
    }

    @NotNull
    public String toString() {
        return "FiatAdvcashRechargeMode(channelId=" + this.channelId + ", fiatCurrency=" + this.fiatCurrency + ", paymentName=" + this.paymentName + ", paymentIcon=" + this.paymentIcon + ", minFiatAmount=" + this.minFiatAmount + ", maxFiatAmount=" + this.maxFiatAmount + ", feeMsg=" + this.feeMsg + ", fee=" + this.fee + ", amount=" + this.amount + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.channelId);
        dest.writeString(this.fiatCurrency);
        dest.writeString(this.paymentName);
        dest.writeString(this.paymentIcon);
        dest.writeString(this.minFiatAmount);
        dest.writeString(this.maxFiatAmount);
        dest.writeString(this.feeMsg);
        FiatFee fiatFee = this.fee;
        if (fiatFee == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            fiatFee.writeToParcel(dest, flags);
        }
        dest.writeString(this.amount);
    }

    public /* synthetic */ FiatAdvcashRechargeMode(String str, String str2, String str3, String str4, String str5, String str6, String str7, FiatFee fiatFee, String str8, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, str5, str6, str7, (i11 & 128) != 0 ? null : fiatFee, (i11 & 256) != 0 ? "" : str8);
    }
}
