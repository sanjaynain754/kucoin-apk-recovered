package com.kubi.assets.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.google.firebase.analytics.FirebaseAnalytics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: EvmRepeatAddressResponseEntity.kt */
/* JADX INFO: loaded from: classes6.dex */
@Keep
@Metadata(m90083d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b)\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B»\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0015\u0010\u0016J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010.\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u001dJ\u000b\u0010/\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u00101\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u001dJ\u0010\u00102\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0002\u0010\"J\u000b\u00103\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u00105\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u001dJ\u0010\u00106\u001a\u0004\u0018\u00010\u0013HÆ\u0003¢\u0006\u0002\u0010'J\u0010\u00107\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u001dJÂ\u0001\u00108\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0002\u00109J\u0006\u0010:\u001a\u00020\u000eJ\u0013\u0010;\u001a\u00020\t2\b\u0010<\u001a\u0004\u0018\u00010=HÖ\u0003J\t\u0010>\u001a\u00020\u000eHÖ\u0001J\t\u0010?\u001a\u00020\u0003HÖ\u0001J\u0016\u0010@\u001a\u00020A2\u0006\u0010B\u001a\u00020C2\u0006\u0010D\u001a\u00020\u000eR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0018R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0018R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0018R\u0015\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u001e\u001a\u0004\b\b\u0010\u001dR\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0018R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0018R\u0015\u0010\f\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u001e\u001a\u0004\b\f\u0010\u001dR\u0015\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\n\n\u0002\u0010#\u001a\u0004\b!\u0010\"R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0018R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0018R\u0015\u0010\u0011\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u001e\u001a\u0004\b\u0011\u0010\u001dR\u0015\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\n\n\u0002\u0010(\u001a\u0004\b&\u0010'R\u0015\u0010\u0014\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u001e\u001a\u0004\b\u0014\u0010\u001d¨\u0006E"}, m90084d2 = {"Lcom/kubi/assets/entity/EvmRepeatAddressItemEntity;", "Landroid/os/Parcelable;", "id", "", FirebaseAnalytics.Param.CURRENCY, "remark", "address", "memo", "isOurAddress", "", "chainId", "chainName", "isSingleChain", "usedCount", "", "type", "amount", "isRecentlyAdded", "createdAt", "", "isEvm", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/Boolean;)V", "getId", "()Ljava/lang/String;", "getCurrency", "getRemark", "getAddress", "getMemo", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getChainId", "getChainName", "getUsedCount", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getType", "getAmount", "getCreatedAt", "()Ljava/lang/Long;", "Ljava/lang/Long;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/Boolean;)Lcom/kubi/assets/entity/EvmRepeatAddressItemEntity;", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class EvmRepeatAddressItemEntity implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<EvmRepeatAddressItemEntity> CREATOR = new Creator();

    @Nullable
    private final String address;

    @Nullable
    private final String amount;

    @Nullable
    private final String chainId;

    @Nullable
    private final String chainName;

    @Nullable
    private final Long createdAt;

    @Nullable
    private final String currency;

    @Nullable
    private final String id;

    @Nullable
    private final Boolean isEvm;

    @Nullable
    private final Boolean isOurAddress;

    @Nullable
    private final Boolean isRecentlyAdded;

    @Nullable
    private final Boolean isSingleChain;

    @Nullable
    private final String memo;

    @Nullable
    private final String remark;

    @Nullable
    private final String type;

    @Nullable
    private final Integer usedCount;

    /* JADX INFO: compiled from: EvmRepeatAddressResponseEntity.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Creator implements Parcelable.Creator<EvmRepeatAddressItemEntity> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EvmRepeatAddressItemEntity createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Boolean boolValueOf2;
            Boolean boolValueOf3;
            Boolean boolValueOf4;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf2 = null;
            } else {
                boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Boolean bool = boolValueOf2;
            String string8 = parcel.readString();
            Integer num = numValueOf;
            String string9 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf3 = null;
            } else {
                boolValueOf3 = Boolean.valueOf(parcel.readInt() != 0);
            }
            Long lValueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            if (parcel.readInt() == 0) {
                boolValueOf4 = null;
            } else {
                boolValueOf4 = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new EvmRepeatAddressItemEntity(string, string2, string3, string4, string5, boolValueOf, string6, string7, bool, num, string8, string9, boolValueOf3, lValueOf, boolValueOf4);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EvmRepeatAddressItemEntity[] newArray(int i11) {
            return new EvmRepeatAddressItemEntity[i11];
        }
    }

    public EvmRepeatAddressItemEntity() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 32767, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EvmRepeatAddressItemEntity)) {
            return false;
        }
        EvmRepeatAddressItemEntity evmRepeatAddressItemEntity = (EvmRepeatAddressItemEntity) other;
        return Intrinsics.areEqual(this.id, evmRepeatAddressItemEntity.id) && Intrinsics.areEqual(this.currency, evmRepeatAddressItemEntity.currency) && Intrinsics.areEqual(this.remark, evmRepeatAddressItemEntity.remark) && Intrinsics.areEqual(this.address, evmRepeatAddressItemEntity.address) && Intrinsics.areEqual(this.memo, evmRepeatAddressItemEntity.memo) && Intrinsics.areEqual(this.isOurAddress, evmRepeatAddressItemEntity.isOurAddress) && Intrinsics.areEqual(this.chainId, evmRepeatAddressItemEntity.chainId) && Intrinsics.areEqual(this.chainName, evmRepeatAddressItemEntity.chainName) && Intrinsics.areEqual(this.isSingleChain, evmRepeatAddressItemEntity.isSingleChain) && Intrinsics.areEqual(this.usedCount, evmRepeatAddressItemEntity.usedCount) && Intrinsics.areEqual(this.type, evmRepeatAddressItemEntity.type) && Intrinsics.areEqual(this.amount, evmRepeatAddressItemEntity.amount) && Intrinsics.areEqual(this.isRecentlyAdded, evmRepeatAddressItemEntity.isRecentlyAdded) && Intrinsics.areEqual(this.createdAt, evmRepeatAddressItemEntity.createdAt) && Intrinsics.areEqual(this.isEvm, evmRepeatAddressItemEntity.isEvm);
    }

    public EvmRepeatAddressItemEntity(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable Boolean bool, @Nullable String str6, @Nullable String str7, @Nullable Boolean bool2, @Nullable Integer num, @Nullable String str8, @Nullable String str9, @Nullable Boolean bool3, @Nullable Long l11, @Nullable Boolean bool4) {
        this.id = str;
        this.currency = str2;
        this.remark = str3;
        this.address = str4;
        this.memo = str5;
        this.isOurAddress = bool;
        this.chainId = str6;
        this.chainName = str7;
        this.isSingleChain = bool2;
        this.usedCount = num;
        this.type = str8;
        this.amount = str9;
        this.isRecentlyAdded = bool3;
        this.createdAt = l11;
        this.isEvm = bool4;
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final Integer getUsedCount() {
        return this.usedCount;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @Nullable
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getAmount() {
        return this.amount;
    }

    @Nullable
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final Boolean getIsRecentlyAdded() {
        return this.isRecentlyAdded;
    }

    @Nullable
    /* JADX INFO: renamed from: component14, reason: from getter */
    public final Long getCreatedAt() {
        return this.createdAt;
    }

    @Nullable
    /* JADX INFO: renamed from: component15, reason: from getter */
    public final Boolean getIsEvm() {
        return this.isEvm;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getRemark() {
        return this.remark;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getAddress() {
        return this.address;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getMemo() {
        return this.memo;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Boolean getIsOurAddress() {
        return this.isOurAddress;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getChainId() {
        return this.chainId;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getChainName() {
        return this.chainName;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Boolean getIsSingleChain() {
        return this.isSingleChain;
    }

    @NotNull
    public final EvmRepeatAddressItemEntity copy(@Nullable String id2, @Nullable String currency, @Nullable String remark, @Nullable String address, @Nullable String memo, @Nullable Boolean isOurAddress, @Nullable String chainId, @Nullable String chainName, @Nullable Boolean isSingleChain, @Nullable Integer usedCount, @Nullable String type, @Nullable String amount, @Nullable Boolean isRecentlyAdded, @Nullable Long createdAt, @Nullable Boolean isEvm) {
        return new EvmRepeatAddressItemEntity(id2, currency, remark, address, memo, isOurAddress, chainId, chainName, isSingleChain, usedCount, type, amount, isRecentlyAdded, createdAt, isEvm);
    }

    @Nullable
    public final String getAddress() {
        return this.address;
    }

    @Nullable
    public final String getAmount() {
        return this.amount;
    }

    @Nullable
    public final String getChainId() {
        return this.chainId;
    }

    @Nullable
    public final String getChainName() {
        return this.chainName;
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
    public final String getId() {
        return this.id;
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
    public final String getType() {
        return this.type;
    }

    @Nullable
    public final Integer getUsedCount() {
        return this.usedCount;
    }

    public int hashCode() {
        String str = this.id;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.currency;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.remark;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.address;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.memo;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Boolean bool = this.isOurAddress;
        int iHashCode6 = (iHashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str6 = this.chainId;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.chainName;
        int iHashCode8 = (iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Boolean bool2 = this.isSingleChain;
        int iHashCode9 = (iHashCode8 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Integer num = this.usedCount;
        int iHashCode10 = (iHashCode9 + (num == null ? 0 : num.hashCode())) * 31;
        String str8 = this.type;
        int iHashCode11 = (iHashCode10 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.amount;
        int iHashCode12 = (iHashCode11 + (str9 == null ? 0 : str9.hashCode())) * 31;
        Boolean bool3 = this.isRecentlyAdded;
        int iHashCode13 = (iHashCode12 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Long l11 = this.createdAt;
        int iHashCode14 = (iHashCode13 + (l11 == null ? 0 : l11.hashCode())) * 31;
        Boolean bool4 = this.isEvm;
        return iHashCode14 + (bool4 != null ? bool4.hashCode() : 0);
    }

    @Nullable
    public final Boolean isEvm() {
        return this.isEvm;
    }

    @Nullable
    public final Boolean isOurAddress() {
        return this.isOurAddress;
    }

    @Nullable
    public final Boolean isRecentlyAdded() {
        return this.isRecentlyAdded;
    }

    @Nullable
    public final Boolean isSingleChain() {
        return this.isSingleChain;
    }

    @NotNull
    public String toString() {
        return "EvmRepeatAddressItemEntity(id=" + this.id + ", currency=" + this.currency + ", remark=" + this.remark + ", address=" + this.address + ", memo=" + this.memo + ", isOurAddress=" + this.isOurAddress + ", chainId=" + this.chainId + ", chainName=" + this.chainName + ", isSingleChain=" + this.isSingleChain + ", usedCount=" + this.usedCount + ", type=" + this.type + ", amount=" + this.amount + ", isRecentlyAdded=" + this.isRecentlyAdded + ", createdAt=" + this.createdAt + ", isEvm=" + this.isEvm + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.id);
        dest.writeString(this.currency);
        dest.writeString(this.remark);
        dest.writeString(this.address);
        dest.writeString(this.memo);
        Boolean bool = this.isOurAddress;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool.booleanValue() ? 1 : 0);
        }
        dest.writeString(this.chainId);
        dest.writeString(this.chainName);
        Boolean bool2 = this.isSingleChain;
        if (bool2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool2.booleanValue() ? 1 : 0);
        }
        Integer num = this.usedCount;
        if (num == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num.intValue());
        }
        dest.writeString(this.type);
        dest.writeString(this.amount);
        Boolean bool3 = this.isRecentlyAdded;
        if (bool3 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool3.booleanValue() ? 1 : 0);
        }
        Long l11 = this.createdAt;
        if (l11 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeLong(l11.longValue());
        }
        Boolean bool4 = this.isEvm;
        if (bool4 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool4.booleanValue() ? 1 : 0);
        }
    }

    public /* synthetic */ EvmRepeatAddressItemEntity(String str, String str2, String str3, String str4, String str5, Boolean bool, String str6, String str7, Boolean bool2, Integer num, String str8, String str9, Boolean bool3, Long l11, Boolean bool4, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : str3, (i11 & 8) != 0 ? null : str4, (i11 & 16) != 0 ? null : str5, (i11 & 32) != 0 ? null : bool, (i11 & 64) != 0 ? null : str6, (i11 & 128) != 0 ? null : str7, (i11 & 256) != 0 ? null : bool2, (i11 & 512) != 0 ? null : num, (i11 & 1024) != 0 ? null : str8, (i11 & 2048) != 0 ? null : str9, (i11 & 4096) != 0 ? null : bool3, (i11 & 8192) != 0 ? null : l11, (i11 & 16384) != 0 ? null : bool4);
    }
}
