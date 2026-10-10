package com.kubi.assets.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: WithdrawEntity.kt */
/* JADX INFO: loaded from: classes6.dex */
@Keep
@Metadata(m90083d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b&\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u007f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0097\u0001\u0010+\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010,\u001a\u00020-J\u0013\u0010.\u001a\u00020\u00062\b\u0010/\u001a\u0004\u0018\u000100HÖ\u0003J\t\u00101\u001a\u00020-HÖ\u0001J\t\u00102\u001a\u00020\u0003HÖ\u0001J\u0016\u00103\u001a\u0002042\u0006\u00105\u001a\u0002062\u0006\u00107\u001a\u00020-R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0015R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0013R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0013R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0013R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0013R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0013R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0013R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0013R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0013¨\u00068"}, m90084d2 = {"Lcom/kubi/assets/entity/ImgDataInfo;", "Landroid/os/Parcelable;", "currencyName", "", "feeCurrencyName", "isTaxShow", "", "amount", "fee", "withdrawTo", "withdrawToRemark", "memo", "chainName", "safeMsg", "remark", "arrivalAmount", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCurrencyName", "()Ljava/lang/String;", "getFeeCurrencyName", "()Z", "getAmount", "getFee", "getWithdrawTo", "getWithdrawToRemark", "getMemo", "getChainName", "getSafeMsg", "getRemark", "getArrivalAmount", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class ImgDataInfo implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<ImgDataInfo> CREATOR = new Creator();

    @Nullable
    private final String amount;

    @Nullable
    private final String arrivalAmount;

    @Nullable
    private final String chainName;

    @Nullable
    private final String currencyName;

    @Nullable
    private final String fee;

    @Nullable
    private final String feeCurrencyName;
    private final boolean isTaxShow;

    @Nullable
    private final String memo;

    @Nullable
    private final String remark;

    @Nullable
    private final String safeMsg;

    @Nullable
    private final String withdrawTo;

    @Nullable
    private final String withdrawToRemark;

    /* JADX INFO: compiled from: WithdrawEntity.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Creator implements Parcelable.Creator<ImgDataInfo> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ImgDataInfo createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ImgDataInfo(parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ImgDataInfo[] newArray(int i11) {
            return new ImgDataInfo[i11];
        }
    }

    public ImgDataInfo(@Nullable String str, @Nullable String str2, boolean z11, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable String str11) {
        this.currencyName = str;
        this.feeCurrencyName = str2;
        this.isTaxShow = z11;
        this.amount = str3;
        this.fee = str4;
        this.withdrawTo = str5;
        this.withdrawToRemark = str6;
        this.memo = str7;
        this.chainName = str8;
        this.safeMsg = str9;
        this.remark = str10;
        this.arrivalAmount = str11;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ImgDataInfo)) {
            return false;
        }
        ImgDataInfo imgDataInfo = (ImgDataInfo) other;
        return Intrinsics.areEqual(this.currencyName, imgDataInfo.currencyName) && Intrinsics.areEqual(this.feeCurrencyName, imgDataInfo.feeCurrencyName) && this.isTaxShow == imgDataInfo.isTaxShow && Intrinsics.areEqual(this.amount, imgDataInfo.amount) && Intrinsics.areEqual(this.fee, imgDataInfo.fee) && Intrinsics.areEqual(this.withdrawTo, imgDataInfo.withdrawTo) && Intrinsics.areEqual(this.withdrawToRemark, imgDataInfo.withdrawToRemark) && Intrinsics.areEqual(this.memo, imgDataInfo.memo) && Intrinsics.areEqual(this.chainName, imgDataInfo.chainName) && Intrinsics.areEqual(this.safeMsg, imgDataInfo.safeMsg) && Intrinsics.areEqual(this.remark, imgDataInfo.remark) && Intrinsics.areEqual(this.arrivalAmount, imgDataInfo.arrivalAmount);
    }

    public static /* synthetic */ ImgDataInfo copy$default(ImgDataInfo imgDataInfo, String str, String str2, boolean z11, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = imgDataInfo.currencyName;
        }
        if ((i11 & 2) != 0) {
            str2 = imgDataInfo.feeCurrencyName;
        }
        if ((i11 & 4) != 0) {
            z11 = imgDataInfo.isTaxShow;
        }
        if ((i11 & 8) != 0) {
            str3 = imgDataInfo.amount;
        }
        if ((i11 & 16) != 0) {
            str4 = imgDataInfo.fee;
        }
        if ((i11 & 32) != 0) {
            str5 = imgDataInfo.withdrawTo;
        }
        if ((i11 & 64) != 0) {
            str6 = imgDataInfo.withdrawToRemark;
        }
        if ((i11 & 128) != 0) {
            str7 = imgDataInfo.memo;
        }
        if ((i11 & 256) != 0) {
            str8 = imgDataInfo.chainName;
        }
        if ((i11 & 512) != 0) {
            str9 = imgDataInfo.safeMsg;
        }
        if ((i11 & 1024) != 0) {
            str10 = imgDataInfo.remark;
        }
        if ((i11 & 2048) != 0) {
            str11 = imgDataInfo.arrivalAmount;
        }
        String str12 = str10;
        String str13 = str11;
        String str14 = str8;
        String str15 = str9;
        String str16 = str6;
        String str17 = str7;
        String str18 = str4;
        String str19 = str5;
        return imgDataInfo.copy(str, str2, z11, str3, str18, str19, str16, str17, str14, str15, str12, str13);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCurrencyName() {
        return this.currencyName;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getSafeMsg() {
        return this.safeMsg;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getRemark() {
        return this.remark;
    }

    @Nullable
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getArrivalAmount() {
        return this.arrivalAmount;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getFeeCurrencyName() {
        return this.feeCurrencyName;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getIsTaxShow() {
        return this.isTaxShow;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getAmount() {
        return this.amount;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getFee() {
        return this.fee;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getWithdrawTo() {
        return this.withdrawTo;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getWithdrawToRemark() {
        return this.withdrawToRemark;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getMemo() {
        return this.memo;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getChainName() {
        return this.chainName;
    }

    @NotNull
    public final ImgDataInfo copy(@Nullable String currencyName, @Nullable String feeCurrencyName, boolean isTaxShow, @Nullable String amount, @Nullable String fee, @Nullable String withdrawTo, @Nullable String withdrawToRemark, @Nullable String memo, @Nullable String chainName, @Nullable String safeMsg, @Nullable String remark, @Nullable String arrivalAmount) {
        return new ImgDataInfo(currencyName, feeCurrencyName, isTaxShow, amount, fee, withdrawTo, withdrawToRemark, memo, chainName, safeMsg, remark, arrivalAmount);
    }

    @Nullable
    public final String getAmount() {
        return this.amount;
    }

    @Nullable
    public final String getArrivalAmount() {
        return this.arrivalAmount;
    }

    @Nullable
    public final String getChainName() {
        return this.chainName;
    }

    @Nullable
    public final String getCurrencyName() {
        return this.currencyName;
    }

    @Nullable
    public final String getFee() {
        return this.fee;
    }

    @Nullable
    public final String getFeeCurrencyName() {
        return this.feeCurrencyName;
    }

    @Nullable
    public final String getMemo() {
        return this.memo;
    }

    @Nullable
    public final String getRemark() {
        return this.remark;
    }

    @Nullable
    public final String getSafeMsg() {
        return this.safeMsg;
    }

    @Nullable
    public final String getWithdrawTo() {
        return this.withdrawTo;
    }

    @Nullable
    public final String getWithdrawToRemark() {
        return this.withdrawToRemark;
    }

    public int hashCode() {
        String str = this.currencyName;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.feeCurrencyName;
        int iHashCode2 = (((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31) + Boolean.hashCode(this.isTaxShow)) * 31;
        String str3 = this.amount;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.fee;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.withdrawTo;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.withdrawToRemark;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.memo;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.chainName;
        int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.safeMsg;
        int iHashCode9 = (iHashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.remark;
        int iHashCode10 = (iHashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.arrivalAmount;
        return iHashCode10 + (str11 != null ? str11.hashCode() : 0);
    }

    public final boolean isTaxShow() {
        return this.isTaxShow;
    }

    @NotNull
    public String toString() {
        return "ImgDataInfo(currencyName=" + this.currencyName + ", feeCurrencyName=" + this.feeCurrencyName + ", isTaxShow=" + this.isTaxShow + ", amount=" + this.amount + ", fee=" + this.fee + ", withdrawTo=" + this.withdrawTo + ", withdrawToRemark=" + this.withdrawToRemark + ", memo=" + this.memo + ", chainName=" + this.chainName + ", safeMsg=" + this.safeMsg + ", remark=" + this.remark + ", arrivalAmount=" + this.arrivalAmount + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.currencyName);
        dest.writeString(this.feeCurrencyName);
        dest.writeInt(this.isTaxShow ? 1 : 0);
        dest.writeString(this.amount);
        dest.writeString(this.fee);
        dest.writeString(this.withdrawTo);
        dest.writeString(this.withdrawToRemark);
        dest.writeString(this.memo);
        dest.writeString(this.chainName);
        dest.writeString(this.safeMsg);
        dest.writeString(this.remark);
        dest.writeString(this.arrivalAmount);
    }

    public /* synthetic */ ImgDataInfo(String str, String str2, boolean z11, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i11 & 4) != 0 ? false : z11, str3, str4, str5, str6, str7, str8, str9, str10, str11);
    }
}
