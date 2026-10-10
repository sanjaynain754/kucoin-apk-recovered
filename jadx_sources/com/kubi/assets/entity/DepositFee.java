package com.kubi.assets.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: DepositFee.kt */
/* JADX INFO: loaded from: classes6.dex */
@Keep
@Metadata(m90083d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b$\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bk\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0081\u0001\u0010/\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u00100\u001a\u000201J\u0013\u00102\u001a\u0002032\b\u00104\u001a\u0004\u0018\u000105HÖ\u0003J\t\u00106\u001a\u000201HÖ\u0001J\t\u00107\u001a\u00020\u0003HÖ\u0001J\u0016\u00108\u001a\u0002092\u0006\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u000201R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0012R\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001c\u0010\r\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0012\"\u0004\b!\u0010\"R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0012\"\u0004\b$\u0010\"¨\u0006="}, m90084d2 = {"Lcom/kubi/assets/entity/DepositFee;", "Landroid/os/Parcelable;", "chainId", "", FirebaseAnalytics.Param.CURRENCY, TUIConstants.TUIPlugin.PLUGIN_DESCRIPTION, "feeContent", "name", "ruleType", "feeData", "Lcom/kubi/assets/entity/FeeContent;", "tieredFees", "Lcom/kubi/assets/entity/TieredFees;", "taxTotalRate", "taxDescription", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/kubi/assets/entity/FeeContent;Lcom/kubi/assets/entity/TieredFees;Ljava/lang/String;Ljava/lang/String;)V", "getChainId", "()Ljava/lang/String;", "getCurrency", "getDescription", "getFeeContent", "getName", "getRuleType", "getFeeData", "()Lcom/kubi/assets/entity/FeeContent;", "setFeeData", "(Lcom/kubi/assets/entity/FeeContent;)V", "getTieredFees", "()Lcom/kubi/assets/entity/TieredFees;", "setTieredFees", "(Lcom/kubi/assets/entity/TieredFees;)V", "getTaxTotalRate", "setTaxTotalRate", "(Ljava/lang/String;)V", "getTaxDescription", "setTaxDescription", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class DepositFee implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<DepositFee> CREATOR = new Creator();

    @Nullable
    private final String chainId;

    @Nullable
    private final String currency;

    @Nullable
    private final String description;

    @Nullable
    private final String feeContent;

    @Nullable
    private FeeContent feeData;

    @Nullable
    private final String name;

    @Nullable
    private final String ruleType;

    @Nullable
    private String taxDescription;

    @Nullable
    private String taxTotalRate;

    @Nullable
    private TieredFees tieredFees;

    /* JADX INFO: compiled from: DepositFee.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Creator implements Parcelable.Creator<DepositFee> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DepositFee createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new DepositFee(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : FeeContent.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? TieredFees.CREATOR.createFromParcel(parcel) : null, parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DepositFee[] newArray(int i11) {
            return new DepositFee[i11];
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
        if (!(other instanceof DepositFee)) {
            return false;
        }
        DepositFee depositFee = (DepositFee) other;
        return Intrinsics.areEqual(this.chainId, depositFee.chainId) && Intrinsics.areEqual(this.currency, depositFee.currency) && Intrinsics.areEqual(this.description, depositFee.description) && Intrinsics.areEqual(this.feeContent, depositFee.feeContent) && Intrinsics.areEqual(this.name, depositFee.name) && Intrinsics.areEqual(this.ruleType, depositFee.ruleType) && Intrinsics.areEqual(this.feeData, depositFee.feeData) && Intrinsics.areEqual(this.tieredFees, depositFee.tieredFees) && Intrinsics.areEqual(this.taxTotalRate, depositFee.taxTotalRate) && Intrinsics.areEqual(this.taxDescription, depositFee.taxDescription);
    }

    public static /* synthetic */ DepositFee copy$default(DepositFee depositFee, String str, String str2, String str3, String str4, String str5, String str6, FeeContent feeContent, TieredFees tieredFees, String str7, String str8, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = depositFee.chainId;
        }
        if ((i11 & 2) != 0) {
            str2 = depositFee.currency;
        }
        if ((i11 & 4) != 0) {
            str3 = depositFee.description;
        }
        if ((i11 & 8) != 0) {
            str4 = depositFee.feeContent;
        }
        if ((i11 & 16) != 0) {
            str5 = depositFee.name;
        }
        if ((i11 & 32) != 0) {
            str6 = depositFee.ruleType;
        }
        if ((i11 & 64) != 0) {
            feeContent = depositFee.feeData;
        }
        if ((i11 & 128) != 0) {
            tieredFees = depositFee.tieredFees;
        }
        if ((i11 & 256) != 0) {
            str7 = depositFee.taxTotalRate;
        }
        if ((i11 & 512) != 0) {
            str8 = depositFee.taxDescription;
        }
        String str9 = str7;
        String str10 = str8;
        FeeContent feeContent2 = feeContent;
        TieredFees tieredFees2 = tieredFees;
        String str11 = str5;
        String str12 = str6;
        return depositFee.copy(str, str2, str3, str4, str11, str12, feeContent2, tieredFees2, str9, str10);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getChainId() {
        return this.chainId;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getTaxDescription() {
        return this.taxDescription;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getFeeContent() {
        return this.feeContent;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getRuleType() {
        return this.ruleType;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final FeeContent getFeeData() {
        return this.feeData;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final TieredFees getTieredFees() {
        return this.tieredFees;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getTaxTotalRate() {
        return this.taxTotalRate;
    }

    @NotNull
    public final DepositFee copy(@Nullable String chainId, @Nullable String currency, @Nullable String description, @Nullable String feeContent, @Nullable String name, @Nullable String ruleType, @Nullable FeeContent feeData, @Nullable TieredFees tieredFees, @Nullable String taxTotalRate, @Nullable String taxDescription) {
        return new DepositFee(chainId, currency, description, feeContent, name, ruleType, feeData, tieredFees, taxTotalRate, taxDescription);
    }

    @Nullable
    public final String getChainId() {
        return this.chainId;
    }

    @Nullable
    public final String getCurrency() {
        return this.currency;
    }

    @Nullable
    public final String getDescription() {
        return this.description;
    }

    @Nullable
    public final String getFeeContent() {
        return this.feeContent;
    }

    @Nullable
    public final FeeContent getFeeData() {
        return this.feeData;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final String getRuleType() {
        return this.ruleType;
    }

    @Nullable
    public final String getTaxDescription() {
        return this.taxDescription;
    }

    @Nullable
    public final String getTaxTotalRate() {
        return this.taxTotalRate;
    }

    @Nullable
    public final TieredFees getTieredFees() {
        return this.tieredFees;
    }

    public int hashCode() {
        String str = this.chainId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.currency;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.description;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.feeContent;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.name;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.ruleType;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        FeeContent feeContent = this.feeData;
        int iHashCode7 = (iHashCode6 + (feeContent == null ? 0 : feeContent.hashCode())) * 31;
        TieredFees tieredFees = this.tieredFees;
        int iHashCode8 = (iHashCode7 + (tieredFees == null ? 0 : tieredFees.hashCode())) * 31;
        String str7 = this.taxTotalRate;
        int iHashCode9 = (iHashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.taxDescription;
        return iHashCode9 + (str8 != null ? str8.hashCode() : 0);
    }

    public final void setFeeData(@Nullable FeeContent feeContent) {
        this.feeData = feeContent;
    }

    public final void setTaxDescription(@Nullable String str) {
        this.taxDescription = str;
    }

    public final void setTaxTotalRate(@Nullable String str) {
        this.taxTotalRate = str;
    }

    public final void setTieredFees(@Nullable TieredFees tieredFees) {
        this.tieredFees = tieredFees;
    }

    @NotNull
    public String toString() {
        return "DepositFee(chainId=" + this.chainId + ", currency=" + this.currency + ", description=" + this.description + ", feeContent=" + this.feeContent + ", name=" + this.name + ", ruleType=" + this.ruleType + ", feeData=" + this.feeData + ", tieredFees=" + this.tieredFees + ", taxTotalRate=" + this.taxTotalRate + ", taxDescription=" + this.taxDescription + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.chainId);
        dest.writeString(this.currency);
        dest.writeString(this.description);
        dest.writeString(this.feeContent);
        dest.writeString(this.name);
        dest.writeString(this.ruleType);
        FeeContent feeContent = this.feeData;
        if (feeContent == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            feeContent.writeToParcel(dest, flags);
        }
        TieredFees tieredFees = this.tieredFees;
        if (tieredFees == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            tieredFees.writeToParcel(dest, flags);
        }
        dest.writeString(this.taxTotalRate);
        dest.writeString(this.taxDescription);
    }

    public DepositFee(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable FeeContent feeContent, @Nullable TieredFees tieredFees, @Nullable String str7, @Nullable String str8) {
        this.chainId = str;
        this.currency = str2;
        this.description = str3;
        this.feeContent = str4;
        this.name = str5;
        this.ruleType = str6;
        this.feeData = feeContent;
        this.tieredFees = tieredFees;
        this.taxTotalRate = str7;
        this.taxDescription = str8;
    }
}
