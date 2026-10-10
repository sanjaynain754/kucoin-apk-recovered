package com.kubi.otc.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.google.firebase.analytics.FirebaseAnalytics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: FiatBean.kt */
/* JADX INFO: loaded from: classes33.dex */
@Keep
@Metadata(m90083d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0010J\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0010J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003JT\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u001cJ\u0006\u0010\u001d\u001a\u00020\u0006J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!HÖ\u0003J\t\u0010\"\u001a\u00020\u0006HÖ\u0001J\t\u0010#\u001a\u00020\u0003HÖ\u0001J\u0016\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020\u0006R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u0012\u0010\u0010R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\rR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\r¨\u0006)"}, m90084d2 = {"Lcom/kubi/otc/entity/RechargeOrderDetail;", "Landroid/os/Parcelable;", "amount", "", FirebaseAnalytics.Param.CURRENCY, "rechargeOrderStatus", "", "buyOrderStatus", "errorReason", "tip", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)V", "getAmount", "()Ljava/lang/String;", "getCurrency", "getRechargeOrderStatus", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getBuyOrderStatus", "getErrorReason", "getTip", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)Lcom/kubi/otc/entity/RechargeOrderDetail;", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class RechargeOrderDetail implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<RechargeOrderDetail> CREATOR = new Creator();

    @Nullable
    private final String amount;

    @Nullable
    private final Integer buyOrderStatus;

    @NotNull
    private final String currency;

    @Nullable
    private final String errorReason;

    @Nullable
    private final Integer rechargeOrderStatus;

    @Nullable
    private final String tip;

    /* JADX INFO: compiled from: FiatBean.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Creator implements Parcelable.Creator<RechargeOrderDetail> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RechargeOrderDetail createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new RechargeOrderDetail(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RechargeOrderDetail[] newArray(int i11) {
            return new RechargeOrderDetail[i11];
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
        if (!(other instanceof RechargeOrderDetail)) {
            return false;
        }
        RechargeOrderDetail rechargeOrderDetail = (RechargeOrderDetail) other;
        return Intrinsics.areEqual(this.amount, rechargeOrderDetail.amount) && Intrinsics.areEqual(this.currency, rechargeOrderDetail.currency) && Intrinsics.areEqual(this.rechargeOrderStatus, rechargeOrderDetail.rechargeOrderStatus) && Intrinsics.areEqual(this.buyOrderStatus, rechargeOrderDetail.buyOrderStatus) && Intrinsics.areEqual(this.errorReason, rechargeOrderDetail.errorReason) && Intrinsics.areEqual(this.tip, rechargeOrderDetail.tip);
    }

    public RechargeOrderDetail(@Nullable String str, @NotNull String currency, @Nullable Integer num, @Nullable Integer num2, @Nullable String str2, @Nullable String str3) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.amount = str;
        this.currency = currency;
        this.rechargeOrderStatus = num;
        this.buyOrderStatus = num2;
        this.errorReason = str2;
        this.tip = str3;
    }

    public static /* synthetic */ RechargeOrderDetail copy$default(RechargeOrderDetail rechargeOrderDetail, String str, String str2, Integer num, Integer num2, String str3, String str4, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = rechargeOrderDetail.amount;
        }
        if ((i11 & 2) != 0) {
            str2 = rechargeOrderDetail.currency;
        }
        if ((i11 & 4) != 0) {
            num = rechargeOrderDetail.rechargeOrderStatus;
        }
        if ((i11 & 8) != 0) {
            num2 = rechargeOrderDetail.buyOrderStatus;
        }
        if ((i11 & 16) != 0) {
            str3 = rechargeOrderDetail.errorReason;
        }
        if ((i11 & 32) != 0) {
            str4 = rechargeOrderDetail.tip;
        }
        String str5 = str3;
        String str6 = str4;
        return rechargeOrderDetail.copy(str, str2, num, num2, str5, str6);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAmount() {
        return this.amount;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Integer getRechargeOrderStatus() {
        return this.rechargeOrderStatus;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Integer getBuyOrderStatus() {
        return this.buyOrderStatus;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getErrorReason() {
        return this.errorReason;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getTip() {
        return this.tip;
    }

    @NotNull
    public final RechargeOrderDetail copy(@Nullable String amount, @NotNull String currency, @Nullable Integer rechargeOrderStatus, @Nullable Integer buyOrderStatus, @Nullable String errorReason, @Nullable String tip) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        return new RechargeOrderDetail(amount, currency, rechargeOrderStatus, buyOrderStatus, errorReason, tip);
    }

    @Nullable
    public final String getAmount() {
        return this.amount;
    }

    @Nullable
    public final Integer getBuyOrderStatus() {
        return this.buyOrderStatus;
    }

    @NotNull
    public final String getCurrency() {
        return this.currency;
    }

    @Nullable
    public final String getErrorReason() {
        return this.errorReason;
    }

    @Nullable
    public final Integer getRechargeOrderStatus() {
        return this.rechargeOrderStatus;
    }

    @Nullable
    public final String getTip() {
        return this.tip;
    }

    public int hashCode() {
        String str = this.amount;
        int iHashCode = (((str == null ? 0 : str.hashCode()) * 31) + this.currency.hashCode()) * 31;
        Integer num = this.rechargeOrderStatus;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.buyOrderStatus;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str2 = this.errorReason;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.tip;
        return iHashCode4 + (str3 != null ? str3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "RechargeOrderDetail(amount=" + this.amount + ", currency=" + this.currency + ", rechargeOrderStatus=" + this.rechargeOrderStatus + ", buyOrderStatus=" + this.buyOrderStatus + ", errorReason=" + this.errorReason + ", tip=" + this.tip + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.amount);
        dest.writeString(this.currency);
        Integer num = this.rechargeOrderStatus;
        if (num == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num.intValue());
        }
        Integer num2 = this.buyOrderStatus;
        if (num2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num2.intValue());
        }
        dest.writeString(this.errorReason);
        dest.writeString(this.tip);
    }
}
