package com.kubi.kumex.data.platform.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: CoinEntity.kt */
/* JADX INFO: loaded from: classes12.dex */
@Keep
@Metadata(m90083d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b*\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u00ad\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u00100\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010\u001fJ\u0010\u00101\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010\u001fJ\t\u00102\u001a\u00020\fHÆ\u0003J\u0010\u00103\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0002\u0010%J\u0010\u00104\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0002\u0010%J\u0010\u00105\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0002\u0010%J´\u0001\u00106\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u000e\u001a\u00020\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0010HÆ\u0001¢\u0006\u0002\u00107J\u0006\u00108\u001a\u00020\fJ\u0013\u00109\u001a\u00020\u00102\b\u0010:\u001a\u0004\u0018\u00010;HÖ\u0003J\t\u0010<\u001a\u00020\fHÖ\u0001J\t\u0010=\u001a\u00020\u0003HÖ\u0001J\u0016\u0010>\u001a\u00020?2\u0006\u0010@\u001a\u00020A2\u0006\u0010B\u001a\u00020\fR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0016R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0016R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0016R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0016R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0016R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0016R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\n\n\u0002\u0010 \u001a\u0004\b\u001e\u0010\u001fR\u0015\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\n\n\u0002\u0010 \u001a\u0004\b!\u0010\u001fR\u0011\u0010\u000e\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0015\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\n\n\u0002\u0010&\u001a\u0004\b$\u0010%R\u0015\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\n\n\u0002\u0010&\u001a\u0004\b'\u0010%R\u001a\u0010\u0012\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010&\u001a\u0004\b\u0012\u0010%¨\u0006C"}, m90084d2 = {"Lcom/kubi/kumex/data/platform/model/PropertyEntity;", "Landroid/os/Parcelable;", "coinType", "", "txUrl", "platform", "userAddressName", "depositRemark", "orgAddress", "withdrawRemark", "stakingRemark", "displayPrecision", "", "shortDisplayPrecision", "confirmationCount", "showDepositRemark", "", "showWithdrawRemark", "isStakingEnabled", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;ILjava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "getCoinType", "()Ljava/lang/String;", "getTxUrl", "getPlatform", "getUserAddressName", "getDepositRemark", "getOrgAddress", "getWithdrawRemark", "getStakingRemark", "getDisplayPrecision", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getShortDisplayPrecision", "getConfirmationCount", "()I", "getShowDepositRemark", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getShowWithdrawRemark", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;ILjava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/kubi/kumex/data/platform/model/PropertyEntity;", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class PropertyEntity implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<PropertyEntity> CREATOR = new C15820a();

    @Nullable
    private final String coinType;
    private final int confirmationCount;

    @Nullable
    private final String depositRemark;

    @Nullable
    private final Integer displayPrecision;

    @SerializedName("showStakingRemark")
    @Nullable
    private final Boolean isStakingEnabled;

    @Nullable
    private final String orgAddress;

    @Nullable
    private final String platform;

    @Nullable
    private final Integer shortDisplayPrecision;

    @Nullable
    private final Boolean showDepositRemark;

    @Nullable
    private final Boolean showWithdrawRemark;

    @Nullable
    private final String stakingRemark;

    @Nullable
    private final String txUrl;

    @Nullable
    private final String userAddressName;

    @Nullable
    private final String withdrawRemark;

    /* JADX INFO: renamed from: com.kubi.kumex.data.platform.model.PropertyEntity$a */
    /* JADX INFO: compiled from: CoinEntity.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C15820a implements Parcelable.Creator<PropertyEntity> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final PropertyEntity createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Boolean boolValueOf2;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            String string8 = parcel.readString();
            Boolean boolValueOf3 = null;
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer numValueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            int i11 = parcel.readInt();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                boolValueOf2 = null;
            } else {
                boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() != 0) {
                boolValueOf3 = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new PropertyEntity(string, string2, string3, string4, string5, string6, string7, string8, numValueOf, numValueOf2, i11, boolValueOf, boolValueOf2, boolValueOf3);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final PropertyEntity[] newArray(int i11) {
            return new PropertyEntity[i11];
        }
    }

    public PropertyEntity() {
        this(null, null, null, null, null, null, null, null, null, null, 0, null, null, null, 16383, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PropertyEntity)) {
            return false;
        }
        PropertyEntity propertyEntity = (PropertyEntity) other;
        return Intrinsics.areEqual(this.coinType, propertyEntity.coinType) && Intrinsics.areEqual(this.txUrl, propertyEntity.txUrl) && Intrinsics.areEqual(this.platform, propertyEntity.platform) && Intrinsics.areEqual(this.userAddressName, propertyEntity.userAddressName) && Intrinsics.areEqual(this.depositRemark, propertyEntity.depositRemark) && Intrinsics.areEqual(this.orgAddress, propertyEntity.orgAddress) && Intrinsics.areEqual(this.withdrawRemark, propertyEntity.withdrawRemark) && Intrinsics.areEqual(this.stakingRemark, propertyEntity.stakingRemark) && Intrinsics.areEqual(this.displayPrecision, propertyEntity.displayPrecision) && Intrinsics.areEqual(this.shortDisplayPrecision, propertyEntity.shortDisplayPrecision) && this.confirmationCount == propertyEntity.confirmationCount && Intrinsics.areEqual(this.showDepositRemark, propertyEntity.showDepositRemark) && Intrinsics.areEqual(this.showWithdrawRemark, propertyEntity.showWithdrawRemark) && Intrinsics.areEqual(this.isStakingEnabled, propertyEntity.isStakingEnabled);
    }

    public PropertyEntity(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable Integer num, @Nullable Integer num2, int i11, @Nullable Boolean bool, @Nullable Boolean bool2, @Nullable Boolean bool3) {
        this.coinType = str;
        this.txUrl = str2;
        this.platform = str3;
        this.userAddressName = str4;
        this.depositRemark = str5;
        this.orgAddress = str6;
        this.withdrawRemark = str7;
        this.stakingRemark = str8;
        this.displayPrecision = num;
        this.shortDisplayPrecision = num2;
        this.confirmationCount = i11;
        this.showDepositRemark = bool;
        this.showWithdrawRemark = bool2;
        this.isStakingEnabled = bool3;
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCoinType() {
        return this.coinType;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final Integer getShortDisplayPrecision() {
        return this.shortDisplayPrecision;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final int getConfirmationCount() {
        return this.confirmationCount;
    }

    @Nullable
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final Boolean getShowDepositRemark() {
        return this.showDepositRemark;
    }

    @Nullable
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final Boolean getShowWithdrawRemark() {
        return this.showWithdrawRemark;
    }

    @Nullable
    /* JADX INFO: renamed from: component14, reason: from getter */
    public final Boolean getIsStakingEnabled() {
        return this.isStakingEnabled;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTxUrl() {
        return this.txUrl;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getPlatform() {
        return this.platform;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getUserAddressName() {
        return this.userAddressName;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getDepositRemark() {
        return this.depositRemark;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getOrgAddress() {
        return this.orgAddress;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getWithdrawRemark() {
        return this.withdrawRemark;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getStakingRemark() {
        return this.stakingRemark;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Integer getDisplayPrecision() {
        return this.displayPrecision;
    }

    @NotNull
    public final PropertyEntity copy(@Nullable String coinType, @Nullable String txUrl, @Nullable String platform, @Nullable String userAddressName, @Nullable String depositRemark, @Nullable String orgAddress, @Nullable String withdrawRemark, @Nullable String stakingRemark, @Nullable Integer displayPrecision, @Nullable Integer shortDisplayPrecision, int confirmationCount, @Nullable Boolean showDepositRemark, @Nullable Boolean showWithdrawRemark, @Nullable Boolean isStakingEnabled) {
        return new PropertyEntity(coinType, txUrl, platform, userAddressName, depositRemark, orgAddress, withdrawRemark, stakingRemark, displayPrecision, shortDisplayPrecision, confirmationCount, showDepositRemark, showWithdrawRemark, isStakingEnabled);
    }

    @Nullable
    public final String getCoinType() {
        return this.coinType;
    }

    public final int getConfirmationCount() {
        return this.confirmationCount;
    }

    @Nullable
    public final String getDepositRemark() {
        return this.depositRemark;
    }

    @Nullable
    public final Integer getDisplayPrecision() {
        return this.displayPrecision;
    }

    @Nullable
    public final String getOrgAddress() {
        return this.orgAddress;
    }

    @Nullable
    public final String getPlatform() {
        return this.platform;
    }

    @Nullable
    public final Integer getShortDisplayPrecision() {
        return this.shortDisplayPrecision;
    }

    @Nullable
    public final Boolean getShowDepositRemark() {
        return this.showDepositRemark;
    }

    @Nullable
    public final Boolean getShowWithdrawRemark() {
        return this.showWithdrawRemark;
    }

    @Nullable
    public final String getStakingRemark() {
        return this.stakingRemark;
    }

    @Nullable
    public final String getTxUrl() {
        return this.txUrl;
    }

    @Nullable
    public final String getUserAddressName() {
        return this.userAddressName;
    }

    @Nullable
    public final String getWithdrawRemark() {
        return this.withdrawRemark;
    }

    public int hashCode() {
        String str = this.coinType;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.txUrl;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.platform;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.userAddressName;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.depositRemark;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.orgAddress;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.withdrawRemark;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.stakingRemark;
        int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Integer num = this.displayPrecision;
        int iHashCode9 = (iHashCode8 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.shortDisplayPrecision;
        int iHashCode10 = (((iHashCode9 + (num2 == null ? 0 : num2.hashCode())) * 31) + Integer.hashCode(this.confirmationCount)) * 31;
        Boolean bool = this.showDepositRemark;
        int iHashCode11 = (iHashCode10 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.showWithdrawRemark;
        int iHashCode12 = (iHashCode11 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.isStakingEnabled;
        return iHashCode12 + (bool3 != null ? bool3.hashCode() : 0);
    }

    @Nullable
    public final Boolean isStakingEnabled() {
        return this.isStakingEnabled;
    }

    @NotNull
    public String toString() {
        return "PropertyEntity(coinType=" + this.coinType + ", txUrl=" + this.txUrl + ", platform=" + this.platform + ", userAddressName=" + this.userAddressName + ", depositRemark=" + this.depositRemark + ", orgAddress=" + this.orgAddress + ", withdrawRemark=" + this.withdrawRemark + ", stakingRemark=" + this.stakingRemark + ", displayPrecision=" + this.displayPrecision + ", shortDisplayPrecision=" + this.shortDisplayPrecision + ", confirmationCount=" + this.confirmationCount + ", showDepositRemark=" + this.showDepositRemark + ", showWithdrawRemark=" + this.showWithdrawRemark + ", isStakingEnabled=" + this.isStakingEnabled + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.coinType);
        dest.writeString(this.txUrl);
        dest.writeString(this.platform);
        dest.writeString(this.userAddressName);
        dest.writeString(this.depositRemark);
        dest.writeString(this.orgAddress);
        dest.writeString(this.withdrawRemark);
        dest.writeString(this.stakingRemark);
        Integer num = this.displayPrecision;
        if (num == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num.intValue());
        }
        Integer num2 = this.shortDisplayPrecision;
        if (num2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num2.intValue());
        }
        dest.writeInt(this.confirmationCount);
        Boolean bool = this.showDepositRemark;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool.booleanValue() ? 1 : 0);
        }
        Boolean bool2 = this.showWithdrawRemark;
        if (bool2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool2.booleanValue() ? 1 : 0);
        }
        Boolean bool3 = this.isStakingEnabled;
        if (bool3 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool3.booleanValue() ? 1 : 0);
        }
    }

    public /* synthetic */ PropertyEntity(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Integer num, Integer num2, int i11, Boolean bool, Boolean bool2, Boolean bool3, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? null : str, (i12 & 2) != 0 ? null : str2, (i12 & 4) != 0 ? null : str3, (i12 & 8) != 0 ? null : str4, (i12 & 16) != 0 ? null : str5, (i12 & 32) != 0 ? null : str6, (i12 & 64) != 0 ? null : str7, (i12 & 128) != 0 ? null : str8, (i12 & 256) != 0 ? null : num, (i12 & 512) != 0 ? null : num2, (i12 & 1024) != 0 ? 0 : i11, (i12 & 2048) != 0 ? null : bool, (i12 & 4096) != 0 ? null : bool2, (i12 & 8192) != 0 ? null : bool3);
    }
}
