package com.kubi.assets.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.google.firebase.analytics.FirebaseAnalytics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: DepositAddressEntity.kt */
/* JADX INFO: loaded from: classes6.dex */
@Keep
@Metadata(m90083d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b5\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B±\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0006\u0010.\u001a\u00020\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u00102\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u001eJ\u000b\u00103\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u00105\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\"J\u0010\u00106\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\"J\u0010\u00107\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\"J\u0010\u00108\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0002\u0010%J\u000b\u00109\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010:\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u001eJ\u000b\u0010;\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\u0003HÆ\u0003JÚ\u0001\u0010@\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010AJ\u0006\u0010B\u001a\u00020\u0007J\u0013\u0010C\u001a\u00020\u000b2\b\u0010D\u001a\u0004\u0018\u00010EHÖ\u0003J\t\u0010F\u001a\u00020\u0007HÖ\u0001J\t\u0010G\u001a\u00020\u0003HÖ\u0001J\u0016\u0010H\u001a\u00020I2\u0006\u0010J\u001a\u00020K2\u0006\u0010L\u001a\u00020\u0007R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001aR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001aR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u001f\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001aR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001aR\u0015\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010#\u001a\u0004\b\n\u0010\"R\u0015\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010#\u001a\u0004\b\f\u0010\"R\u0015\u0010\r\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010#\u001a\u0004\b\r\u0010\"R\u0015\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\n\n\u0002\u0010&\u001a\u0004\b$\u0010%R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001aR\u0015\u0010\u0011\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u001f\u001a\u0004\b(\u0010\u001eR\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001aR\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001aR\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001aR\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u001aR\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\u001a¨\u0006M"}, m90084d2 = {"Lcom/kubi/assets/entity/Addresse;", "Landroid/os/Parcelable;", "address", "", "addressId", "chainId", "confirmationCount", "", "contractAddress", FirebaseAnalytics.Param.CURRENCY, "isAutoTransfer", "", "isDefault", "isRecentlyAdded", "lastDepositAt", "", "memo", "preConfirmationCount", "remark", "toAccountType", "toSubUserId", "toSubUserName", "toAccountTag", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAddress", "()Ljava/lang/String;", "getAddressId", "getChainId", "getConfirmationCount", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getContractAddress", "getCurrency", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getLastDepositAt", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getMemo", "getPreConfirmationCount", "getRemark", "getToAccountType", "getToSubUserId", "getToSubUserName", "getToAccountTag", "getRemarkOrEmpty", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/kubi/assets/entity/Addresse;", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class Addresse implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<Addresse> CREATOR = new Creator();

    @Nullable
    private final String address;

    @Nullable
    private final String addressId;

    @Nullable
    private final String chainId;

    @Nullable
    private final Integer confirmationCount;

    @Nullable
    private final String contractAddress;

    @Nullable
    private final String currency;

    @Nullable
    private final Boolean isAutoTransfer;

    @Nullable
    private final Boolean isDefault;

    @Nullable
    private final Boolean isRecentlyAdded;

    @Nullable
    private final Long lastDepositAt;

    @Nullable
    private final String memo;

    @Nullable
    private final Integer preConfirmationCount;

    @Nullable
    private final String remark;

    @Nullable
    private final String toAccountTag;

    @Nullable
    private final String toAccountType;

    @Nullable
    private final String toSubUserId;

    @Nullable
    private final String toSubUserName;

    /* JADX INFO: compiled from: DepositAddressEntity.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Creator implements Parcelable.Creator<Addresse> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Addresse createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Boolean boolValueOf2;
            Boolean boolValueOf3;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String string4 = parcel.readString();
            String string5 = parcel.readString();
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
            if (parcel.readInt() == 0) {
                boolValueOf3 = null;
            } else {
                boolValueOf3 = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new Addresse(string, string2, string3, numValueOf, string4, string5, boolValueOf, boolValueOf2, boolValueOf3, parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString(), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Addresse[] newArray(int i11) {
            return new Addresse[i11];
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
        if (!(other instanceof Addresse)) {
            return false;
        }
        Addresse addresse = (Addresse) other;
        return Intrinsics.areEqual(this.address, addresse.address) && Intrinsics.areEqual(this.addressId, addresse.addressId) && Intrinsics.areEqual(this.chainId, addresse.chainId) && Intrinsics.areEqual(this.confirmationCount, addresse.confirmationCount) && Intrinsics.areEqual(this.contractAddress, addresse.contractAddress) && Intrinsics.areEqual(this.currency, addresse.currency) && Intrinsics.areEqual(this.isAutoTransfer, addresse.isAutoTransfer) && Intrinsics.areEqual(this.isDefault, addresse.isDefault) && Intrinsics.areEqual(this.isRecentlyAdded, addresse.isRecentlyAdded) && Intrinsics.areEqual(this.lastDepositAt, addresse.lastDepositAt) && Intrinsics.areEqual(this.memo, addresse.memo) && Intrinsics.areEqual(this.preConfirmationCount, addresse.preConfirmationCount) && Intrinsics.areEqual(this.remark, addresse.remark) && Intrinsics.areEqual(this.toAccountType, addresse.toAccountType) && Intrinsics.areEqual(this.toSubUserId, addresse.toSubUserId) && Intrinsics.areEqual(this.toSubUserName, addresse.toSubUserName) && Intrinsics.areEqual(this.toAccountTag, addresse.toAccountTag);
    }

    public static /* synthetic */ Addresse copy$default(Addresse addresse, String str, String str2, String str3, Integer num, String str4, String str5, Boolean bool, Boolean bool2, Boolean bool3, Long l11, String str6, Integer num2, String str7, String str8, String str9, String str10, String str11, int i11, Object obj) {
        String str12;
        String str13;
        String str14 = (i11 & 1) != 0 ? addresse.address : str;
        String str15 = (i11 & 2) != 0 ? addresse.addressId : str2;
        String str16 = (i11 & 4) != 0 ? addresse.chainId : str3;
        Integer num3 = (i11 & 8) != 0 ? addresse.confirmationCount : num;
        String str17 = (i11 & 16) != 0 ? addresse.contractAddress : str4;
        String str18 = (i11 & 32) != 0 ? addresse.currency : str5;
        Boolean bool4 = (i11 & 64) != 0 ? addresse.isAutoTransfer : bool;
        Boolean bool5 = (i11 & 128) != 0 ? addresse.isDefault : bool2;
        Boolean bool6 = (i11 & 256) != 0 ? addresse.isRecentlyAdded : bool3;
        Long l12 = (i11 & 512) != 0 ? addresse.lastDepositAt : l11;
        String str19 = (i11 & 1024) != 0 ? addresse.memo : str6;
        Integer num4 = (i11 & 2048) != 0 ? addresse.preConfirmationCount : num2;
        String str20 = (i11 & 4096) != 0 ? addresse.remark : str7;
        String str21 = (i11 & 8192) != 0 ? addresse.toAccountType : str8;
        String str22 = str14;
        String str23 = (i11 & 16384) != 0 ? addresse.toSubUserId : str9;
        String str24 = (i11 & 32768) != 0 ? addresse.toSubUserName : str10;
        if ((i11 & 65536) != 0) {
            str13 = str24;
            str12 = addresse.toAccountTag;
        } else {
            str12 = str11;
            str13 = str24;
        }
        return addresse.copy(str22, str15, str16, num3, str17, str18, bool4, bool5, bool6, l12, str19, num4, str20, str21, str23, str13, str12);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAddress() {
        return this.address;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final Long getLastDepositAt() {
        return this.lastDepositAt;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getMemo() {
        return this.memo;
    }

    @Nullable
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final Integer getPreConfirmationCount() {
        return this.preConfirmationCount;
    }

    @Nullable
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getRemark() {
        return this.remark;
    }

    @Nullable
    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getToAccountType() {
        return this.toAccountType;
    }

    @Nullable
    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getToSubUserId() {
        return this.toSubUserId;
    }

    @Nullable
    /* JADX INFO: renamed from: component16, reason: from getter */
    public final String getToSubUserName() {
        return this.toSubUserName;
    }

    @Nullable
    /* JADX INFO: renamed from: component17, reason: from getter */
    public final String getToAccountTag() {
        return this.toAccountTag;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getAddressId() {
        return this.addressId;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getChainId() {
        return this.chainId;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Integer getConfirmationCount() {
        return this.confirmationCount;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getContractAddress() {
        return this.contractAddress;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Boolean getIsAutoTransfer() {
        return this.isAutoTransfer;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Boolean getIsDefault() {
        return this.isDefault;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Boolean getIsRecentlyAdded() {
        return this.isRecentlyAdded;
    }

    @NotNull
    public final Addresse copy(@Nullable String address, @Nullable String addressId, @Nullable String chainId, @Nullable Integer confirmationCount, @Nullable String contractAddress, @Nullable String currency, @Nullable Boolean isAutoTransfer, @Nullable Boolean isDefault, @Nullable Boolean isRecentlyAdded, @Nullable Long lastDepositAt, @Nullable String memo, @Nullable Integer preConfirmationCount, @Nullable String remark, @Nullable String toAccountType, @Nullable String toSubUserId, @Nullable String toSubUserName, @Nullable String toAccountTag) {
        return new Addresse(address, addressId, chainId, confirmationCount, contractAddress, currency, isAutoTransfer, isDefault, isRecentlyAdded, lastDepositAt, memo, preConfirmationCount, remark, toAccountType, toSubUserId, toSubUserName, toAccountTag);
    }

    @Nullable
    public final String getAddress() {
        return this.address;
    }

    @Nullable
    public final String getAddressId() {
        return this.addressId;
    }

    @Nullable
    public final String getChainId() {
        return this.chainId;
    }

    @Nullable
    public final Integer getConfirmationCount() {
        return this.confirmationCount;
    }

    @Nullable
    public final String getContractAddress() {
        return this.contractAddress;
    }

    @Nullable
    public final String getCurrency() {
        return this.currency;
    }

    @Nullable
    public final Long getLastDepositAt() {
        return this.lastDepositAt;
    }

    @Nullable
    public final String getMemo() {
        return this.memo;
    }

    @Nullable
    public final Integer getPreConfirmationCount() {
        return this.preConfirmationCount;
    }

    @Nullable
    public final String getRemark() {
        return this.remark;
    }

    @NotNull
    public final String getRemarkOrEmpty() {
        String str = this.remark;
        return (str == null || str.length() == 0) ? "--" : this.remark;
    }

    @Nullable
    public final String getToAccountTag() {
        return this.toAccountTag;
    }

    @Nullable
    public final String getToAccountType() {
        return this.toAccountType;
    }

    @Nullable
    public final String getToSubUserId() {
        return this.toSubUserId;
    }

    @Nullable
    public final String getToSubUserName() {
        return this.toSubUserName;
    }

    public int hashCode() {
        String str = this.address;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.addressId;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.chainId;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.confirmationCount;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        String str4 = this.contractAddress;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.currency;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Boolean bool = this.isAutoTransfer;
        int iHashCode7 = (iHashCode6 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.isDefault;
        int iHashCode8 = (iHashCode7 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.isRecentlyAdded;
        int iHashCode9 = (iHashCode8 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Long l11 = this.lastDepositAt;
        int iHashCode10 = (iHashCode9 + (l11 == null ? 0 : l11.hashCode())) * 31;
        String str6 = this.memo;
        int iHashCode11 = (iHashCode10 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Integer num2 = this.preConfirmationCount;
        int iHashCode12 = (iHashCode11 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str7 = this.remark;
        int iHashCode13 = (iHashCode12 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.toAccountType;
        int iHashCode14 = (iHashCode13 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.toSubUserId;
        int iHashCode15 = (iHashCode14 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.toSubUserName;
        int iHashCode16 = (iHashCode15 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.toAccountTag;
        return iHashCode16 + (str11 != null ? str11.hashCode() : 0);
    }

    @Nullable
    public final Boolean isAutoTransfer() {
        return this.isAutoTransfer;
    }

    @Nullable
    public final Boolean isDefault() {
        return this.isDefault;
    }

    @Nullable
    public final Boolean isRecentlyAdded() {
        return this.isRecentlyAdded;
    }

    @NotNull
    public String toString() {
        return "Addresse(address=" + this.address + ", addressId=" + this.addressId + ", chainId=" + this.chainId + ", confirmationCount=" + this.confirmationCount + ", contractAddress=" + this.contractAddress + ", currency=" + this.currency + ", isAutoTransfer=" + this.isAutoTransfer + ", isDefault=" + this.isDefault + ", isRecentlyAdded=" + this.isRecentlyAdded + ", lastDepositAt=" + this.lastDepositAt + ", memo=" + this.memo + ", preConfirmationCount=" + this.preConfirmationCount + ", remark=" + this.remark + ", toAccountType=" + this.toAccountType + ", toSubUserId=" + this.toSubUserId + ", toSubUserName=" + this.toSubUserName + ", toAccountTag=" + this.toAccountTag + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.address);
        dest.writeString(this.addressId);
        dest.writeString(this.chainId);
        Integer num = this.confirmationCount;
        if (num == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num.intValue());
        }
        dest.writeString(this.contractAddress);
        dest.writeString(this.currency);
        Boolean bool = this.isAutoTransfer;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool.booleanValue() ? 1 : 0);
        }
        Boolean bool2 = this.isDefault;
        if (bool2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool2.booleanValue() ? 1 : 0);
        }
        Boolean bool3 = this.isRecentlyAdded;
        if (bool3 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool3.booleanValue() ? 1 : 0);
        }
        Long l11 = this.lastDepositAt;
        if (l11 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeLong(l11.longValue());
        }
        dest.writeString(this.memo);
        Integer num2 = this.preConfirmationCount;
        if (num2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num2.intValue());
        }
        dest.writeString(this.remark);
        dest.writeString(this.toAccountType);
        dest.writeString(this.toSubUserId);
        dest.writeString(this.toSubUserName);
        dest.writeString(this.toAccountTag);
    }

    public Addresse(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable Integer num, @Nullable String str4, @Nullable String str5, @Nullable Boolean bool, @Nullable Boolean bool2, @Nullable Boolean bool3, @Nullable Long l11, @Nullable String str6, @Nullable Integer num2, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable String str11) {
        this.address = str;
        this.addressId = str2;
        this.chainId = str3;
        this.confirmationCount = num;
        this.contractAddress = str4;
        this.currency = str5;
        this.isAutoTransfer = bool;
        this.isDefault = bool2;
        this.isRecentlyAdded = bool3;
        this.lastDepositAt = l11;
        this.memo = str6;
        this.preConfirmationCount = num2;
        this.remark = str7;
        this.toAccountType = str8;
        this.toSubUserId = str9;
        this.toSubUserName = str10;
        this.toAccountTag = str11;
    }
}
