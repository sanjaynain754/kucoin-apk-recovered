package com.kubi.assets.entity;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: WithdrawEntity.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b2\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 O2\u00020\u0001:\u0001OB\u008f\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\t\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u000b\u00105\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u00108\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u001eJ\u0010\u00109\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010 J\u000b\u0010:\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010;\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010 J\u0010\u0010<\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010 J\u000b\u0010=\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010?\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010HÆ\u0003J\u0010\u0010@\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010 J\u0010\u0010A\u001a\u0004\u0018\u00010\u0014HÆ\u0003¢\u0006\u0002\u00101J°\u0001\u0010B\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00102\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÆ\u0001¢\u0006\u0002\u0010CJ\u0006\u0010D\u001a\u00020\u0007J\u0013\u0010E\u001a\u00020\t2\b\u0010F\u001a\u0004\u0018\u00010GHÖ\u0003J\t\u0010H\u001a\u00020\u0007HÖ\u0001J\t\u0010I\u001a\u00020\u0003HÖ\u0001J\u0016\u0010J\u001a\u00020K2\u0006\u0010L\u001a\u00020M2\u0006\u0010N\u001a\u00020\u0007R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0018R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0018R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u001f\u001a\u0004\b\u001d\u0010\u001eR\u001e\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u0010\n\u0002\u0010#\u001a\u0004\b\b\u0010 \"\u0004\b!\u0010\"R\u001c\u0010\n\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0018\"\u0004\b%\u0010\u001aR\u001e\u0010\u000b\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u0010\n\u0002\u0010#\u001a\u0004\b\u000b\u0010 \"\u0004\b&\u0010\"R\u001e\u0010\f\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u0010\n\u0002\u0010#\u001a\u0004\b\f\u0010 \"\u0004\b'\u0010\"R\u001c\u0010\r\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u0018\"\u0004\b)\u0010\u001aR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\u0018\"\u0004\b+\u0010\u001aR\"\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\u0015\u0010\u0012\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010#\u001a\u0004\b\u0012\u0010 R\u001e\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0086\u000e¢\u0006\u0010\n\u0002\u00104\u001a\u0004\b0\u00101\"\u0004\b2\u00103¨\u0006P"}, m90084d2 = {"Lcom/kubi/assets/entity/WithdrawAddrInnerEntity;", "Landroid/os/Parcelable;", "address", "", FirebaseAnalytics.Param.CURRENCY, "memo", "usedCount", "", "isValid", "", "remark", "isFavoriteAddress", "isSingleChain", "favoriteAddressId", "invalidType", "validChainList", "", "Lcom/kubi/assets/entity/WithdrawAddrInnerChainEntity;", "isDeprecated", "createdAt", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Long;)V", "getAddress", "()Ljava/lang/String;", "setAddress", "(Ljava/lang/String;)V", "getCurrency", "getMemo", "getUsedCount", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "()Ljava/lang/Boolean;", "setValid", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getRemark", "setRemark", "setFavoriteAddress", "setSingleChain", "getFavoriteAddressId", "setFavoriteAddressId", "getInvalidType", "setInvalidType", "getValidChainList", "()Ljava/util/List;", "setValidChainList", "(Ljava/util/List;)V", "getCreatedAt", "()Ljava/lang/Long;", "setCreatedAt", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Long;)Lcom/kubi/assets/entity/WithdrawAddrInnerEntity;", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "Companion", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class WithdrawAddrInnerEntity implements Parcelable {

    @NotNull
    public static final String TYPE_ADDR = "address";

    @NotNull
    public static final String TYPE_CONTRACT_ADDR = "contract address";

    @NotNull
    public static final String TYPE_MEMO = "memo";

    @Nullable
    private String address;

    @Nullable
    private Long createdAt;

    @Nullable
    private final String currency;

    @Nullable
    private String favoriteAddressId;

    @Nullable
    private String invalidType;

    @Nullable
    private final Boolean isDeprecated;

    @Nullable
    private Boolean isFavoriteAddress;

    @Nullable
    private Boolean isSingleChain;

    @Nullable
    private Boolean isValid;

    @Nullable
    private final String memo;

    @Nullable
    private String remark;

    @Nullable
    private final Integer usedCount;

    @Nullable
    private List<WithdrawAddrInnerChainEntity> validChainList;

    @NotNull
    public static final Parcelable.Creator<WithdrawAddrInnerEntity> CREATOR = new Creator();

    /* JADX INFO: compiled from: WithdrawEntity.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Creator implements Parcelable.Creator<WithdrawAddrInnerEntity> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WithdrawAddrInnerEntity createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Boolean boolValueOf = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0);
            String string4 = parcel.readString();
            Boolean boolValueOf2 = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0);
            Boolean boolValueOf3 = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0);
            String string5 = parcel.readString();
            Boolean bool = boolValueOf2;
            Boolean bool2 = boolValueOf3;
            String string6 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i11 = parcel.readInt();
                arrayList = new ArrayList(i11);
                for (int i12 = 0; i12 != i11; i12++) {
                    arrayList.add(WithdrawAddrInnerChainEntity.CREATOR.createFromParcel(parcel));
                }
            }
            return new WithdrawAddrInnerEntity(string, string2, string3, numValueOf, boolValueOf, string4, bool, bool2, string5, string6, arrayList, parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WithdrawAddrInnerEntity[] newArray(int i11) {
            return new WithdrawAddrInnerEntity[i11];
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
        if (!(other instanceof WithdrawAddrInnerEntity)) {
            return false;
        }
        WithdrawAddrInnerEntity withdrawAddrInnerEntity = (WithdrawAddrInnerEntity) other;
        return Intrinsics.areEqual(this.address, withdrawAddrInnerEntity.address) && Intrinsics.areEqual(this.currency, withdrawAddrInnerEntity.currency) && Intrinsics.areEqual(this.memo, withdrawAddrInnerEntity.memo) && Intrinsics.areEqual(this.usedCount, withdrawAddrInnerEntity.usedCount) && Intrinsics.areEqual(this.isValid, withdrawAddrInnerEntity.isValid) && Intrinsics.areEqual(this.remark, withdrawAddrInnerEntity.remark) && Intrinsics.areEqual(this.isFavoriteAddress, withdrawAddrInnerEntity.isFavoriteAddress) && Intrinsics.areEqual(this.isSingleChain, withdrawAddrInnerEntity.isSingleChain) && Intrinsics.areEqual(this.favoriteAddressId, withdrawAddrInnerEntity.favoriteAddressId) && Intrinsics.areEqual(this.invalidType, withdrawAddrInnerEntity.invalidType) && Intrinsics.areEqual(this.validChainList, withdrawAddrInnerEntity.validChainList) && Intrinsics.areEqual(this.isDeprecated, withdrawAddrInnerEntity.isDeprecated) && Intrinsics.areEqual(this.createdAt, withdrawAddrInnerEntity.createdAt);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ WithdrawAddrInnerEntity copy$default(WithdrawAddrInnerEntity withdrawAddrInnerEntity, String str, String str2, String str3, Integer num, Boolean bool, String str4, Boolean bool2, Boolean bool3, String str5, String str6, List list, Boolean bool4, Long l11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = withdrawAddrInnerEntity.address;
        }
        return withdrawAddrInnerEntity.copy(str, (i11 & 2) != 0 ? withdrawAddrInnerEntity.currency : str2, (i11 & 4) != 0 ? withdrawAddrInnerEntity.memo : str3, (i11 & 8) != 0 ? withdrawAddrInnerEntity.usedCount : num, (i11 & 16) != 0 ? withdrawAddrInnerEntity.isValid : bool, (i11 & 32) != 0 ? withdrawAddrInnerEntity.remark : str4, (i11 & 64) != 0 ? withdrawAddrInnerEntity.isFavoriteAddress : bool2, (i11 & 128) != 0 ? withdrawAddrInnerEntity.isSingleChain : bool3, (i11 & 256) != 0 ? withdrawAddrInnerEntity.favoriteAddressId : str5, (i11 & 512) != 0 ? withdrawAddrInnerEntity.invalidType : str6, (i11 & 1024) != 0 ? withdrawAddrInnerEntity.validChainList : list, (i11 & 2048) != 0 ? withdrawAddrInnerEntity.isDeprecated : bool4, (i11 & 4096) != 0 ? withdrawAddrInnerEntity.createdAt : l11);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAddress() {
        return this.address;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getInvalidType() {
        return this.invalidType;
    }

    @Nullable
    public final List<WithdrawAddrInnerChainEntity> component11() {
        return this.validChainList;
    }

    @Nullable
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final Boolean getIsDeprecated() {
        return this.isDeprecated;
    }

    @Nullable
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final Long getCreatedAt() {
        return this.createdAt;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getMemo() {
        return this.memo;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Integer getUsedCount() {
        return this.usedCount;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Boolean getIsValid() {
        return this.isValid;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getRemark() {
        return this.remark;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Boolean getIsFavoriteAddress() {
        return this.isFavoriteAddress;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Boolean getIsSingleChain() {
        return this.isSingleChain;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getFavoriteAddressId() {
        return this.favoriteAddressId;
    }

    @NotNull
    public final WithdrawAddrInnerEntity copy(@Nullable String address, @Nullable String currency, @Nullable String memo, @Nullable Integer usedCount, @Nullable Boolean isValid, @Nullable String remark, @Nullable Boolean isFavoriteAddress, @Nullable Boolean isSingleChain, @Nullable String favoriteAddressId, @Nullable String invalidType, @Nullable List<WithdrawAddrInnerChainEntity> validChainList, @Nullable Boolean isDeprecated, @Nullable Long createdAt) {
        return new WithdrawAddrInnerEntity(address, currency, memo, usedCount, isValid, remark, isFavoriteAddress, isSingleChain, favoriteAddressId, invalidType, validChainList, isDeprecated, createdAt);
    }

    @Nullable
    public final String getAddress() {
        return this.address;
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
    public final String getFavoriteAddressId() {
        return this.favoriteAddressId;
    }

    @Nullable
    public final String getInvalidType() {
        return this.invalidType;
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
    public final Integer getUsedCount() {
        return this.usedCount;
    }

    @Nullable
    public final List<WithdrawAddrInnerChainEntity> getValidChainList() {
        return this.validChainList;
    }

    public int hashCode() {
        String str = this.address;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.currency;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.memo;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.usedCount;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool = this.isValid;
        int iHashCode5 = (iHashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str4 = this.remark;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Boolean bool2 = this.isFavoriteAddress;
        int iHashCode7 = (iHashCode6 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.isSingleChain;
        int iHashCode8 = (iHashCode7 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        String str5 = this.favoriteAddressId;
        int iHashCode9 = (iHashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.invalidType;
        int iHashCode10 = (iHashCode9 + (str6 == null ? 0 : str6.hashCode())) * 31;
        List<WithdrawAddrInnerChainEntity> list = this.validChainList;
        int iHashCode11 = (iHashCode10 + (list == null ? 0 : list.hashCode())) * 31;
        Boolean bool4 = this.isDeprecated;
        int iHashCode12 = (iHashCode11 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Long l11 = this.createdAt;
        return iHashCode12 + (l11 != null ? l11.hashCode() : 0);
    }

    @Nullable
    public final Boolean isDeprecated() {
        return this.isDeprecated;
    }

    @Nullable
    public final Boolean isFavoriteAddress() {
        return this.isFavoriteAddress;
    }

    @Nullable
    public final Boolean isSingleChain() {
        return this.isSingleChain;
    }

    @Nullable
    public final Boolean isValid() {
        return this.isValid;
    }

    public final void setAddress(@Nullable String str) {
        this.address = str;
    }

    public final void setCreatedAt(@Nullable Long l11) {
        this.createdAt = l11;
    }

    public final void setFavoriteAddress(@Nullable Boolean bool) {
        this.isFavoriteAddress = bool;
    }

    public final void setFavoriteAddressId(@Nullable String str) {
        this.favoriteAddressId = str;
    }

    public final void setInvalidType(@Nullable String str) {
        this.invalidType = str;
    }

    public final void setRemark(@Nullable String str) {
        this.remark = str;
    }

    public final void setSingleChain(@Nullable Boolean bool) {
        this.isSingleChain = bool;
    }

    public final void setValid(@Nullable Boolean bool) {
        this.isValid = bool;
    }

    public final void setValidChainList(@Nullable List<WithdrawAddrInnerChainEntity> list) {
        this.validChainList = list;
    }

    @NotNull
    public String toString() {
        return "WithdrawAddrInnerEntity(address=" + this.address + ", currency=" + this.currency + ", memo=" + this.memo + ", usedCount=" + this.usedCount + ", isValid=" + this.isValid + ", remark=" + this.remark + ", isFavoriteAddress=" + this.isFavoriteAddress + ", isSingleChain=" + this.isSingleChain + ", favoriteAddressId=" + this.favoriteAddressId + ", invalidType=" + this.invalidType + ", validChainList=" + this.validChainList + ", isDeprecated=" + this.isDeprecated + ", createdAt=" + this.createdAt + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.address);
        dest.writeString(this.currency);
        dest.writeString(this.memo);
        Integer num = this.usedCount;
        if (num == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num.intValue());
        }
        Boolean bool = this.isValid;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool.booleanValue() ? 1 : 0);
        }
        dest.writeString(this.remark);
        Boolean bool2 = this.isFavoriteAddress;
        if (bool2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool2.booleanValue() ? 1 : 0);
        }
        Boolean bool3 = this.isSingleChain;
        if (bool3 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool3.booleanValue() ? 1 : 0);
        }
        dest.writeString(this.favoriteAddressId);
        dest.writeString(this.invalidType);
        List<WithdrawAddrInnerChainEntity> list = this.validChainList;
        if (list == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(list.size());
            Iterator<WithdrawAddrInnerChainEntity> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(dest, flags);
            }
        }
        Boolean bool4 = this.isDeprecated;
        if (bool4 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool4.booleanValue() ? 1 : 0);
        }
        Long l11 = this.createdAt;
        if (l11 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeLong(l11.longValue());
        }
    }

    public WithdrawAddrInnerEntity(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable Integer num, @Nullable Boolean bool, @Nullable String str4, @Nullable Boolean bool2, @Nullable Boolean bool3, @Nullable String str5, @Nullable String str6, @Nullable List<WithdrawAddrInnerChainEntity> list, @Nullable Boolean bool4, @Nullable Long l11) {
        this.address = str;
        this.currency = str2;
        this.memo = str3;
        this.usedCount = num;
        this.isValid = bool;
        this.remark = str4;
        this.isFavoriteAddress = bool2;
        this.isSingleChain = bool3;
        this.favoriteAddressId = str5;
        this.invalidType = str6;
        this.validChainList = list;
        this.isDeprecated = bool4;
        this.createdAt = l11;
    }
}
