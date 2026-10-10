package com.kubi.margin.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: DelegationLiquidationEntity.kt */
/* JADX INFO: loaded from: classes27.dex */
@Keep
@Metadata(m90083d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b9\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B¥\u0001\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000b\u0012\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u00106\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0010\u00108\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u001eJ\u000f\u00109\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u0010\u0010?\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u001eJ\u000b\u0010@\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u0011\u0010A\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J¬\u0001\u0010B\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000b2\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010CJ\u0006\u0010D\u001a\u00020EJ\u0013\u0010F\u001a\u00020G2\b\u0010H\u001a\u0004\u0018\u00010IHÖ\u0003J\t\u0010J\u001a\u00020EHÖ\u0001J\t\u0010K\u001a\u00020\u0006HÖ\u0001J\u0016\u0010L\u001a\u00020M2\u0006\u0010N\u001a\u00020O2\u0006\u0010P\u001a\u00020ER \u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001e\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u0010\n\u0002\u0010!\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R \u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0016\"\u0004\b#\u0010\u0018R\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010%\"\u0004\b)\u0010'R\u001c\u0010\r\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\u001a\"\u0004\b+\u0010\u001cR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010%\"\u0004\b-\u0010'R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010%\"\u0004\b/\u0010'R\u001e\u0010\u0010\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u0010\n\u0002\u0010!\u001a\u0004\b0\u0010\u001e\"\u0004\b1\u0010 R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u0010%\"\u0004\b3\u0010'R\"\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u0010\u0016\"\u0004\b5\u0010\u0018¨\u0006Q"}, m90084d2 = {"Lcom/kubi/margin/entity/DelegationLiquidationEntity;", "Landroid/os/Parcelable;", "assets", "", "Lcom/kubi/margin/entity/AssetEntity;", "balanceCurrency", "", "createdAt", "", "debts", "liability", "Ljava/math/BigDecimal;", "liabilityRate", "positionTag", "returnAsset", "total", "updatedAt", "totalConsumedUsdt", "liquidationConsumedList", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/Long;Ljava/util/List;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/Long;Ljava/math/BigDecimal;Ljava/util/List;)V", "getAssets", "()Ljava/util/List;", "setAssets", "(Ljava/util/List;)V", "getBalanceCurrency", "()Ljava/lang/String;", "setBalanceCurrency", "(Ljava/lang/String;)V", "getCreatedAt", "()Ljava/lang/Long;", "setCreatedAt", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getDebts", "setDebts", "getLiability", "()Ljava/math/BigDecimal;", "setLiability", "(Ljava/math/BigDecimal;)V", "getLiabilityRate", "setLiabilityRate", "getPositionTag", "setPositionTag", "getReturnAsset", "setReturnAsset", "getTotal", "setTotal", "getUpdatedAt", "setUpdatedAt", "getTotalConsumedUsdt", "setTotalConsumedUsdt", "getLiquidationConsumedList", "setLiquidationConsumedList", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "copy", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/Long;Ljava/util/List;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/Long;Ljava/math/BigDecimal;Ljava/util/List;)Lcom/kubi/margin/entity/DelegationLiquidationEntity;", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "MarginLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class DelegationLiquidationEntity implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<DelegationLiquidationEntity> CREATOR = new C17612a();

    @NotNull
    private List<AssetEntity> assets;

    @Nullable
    private String balanceCurrency;

    @Nullable
    private Long createdAt;

    @NotNull
    private List<AssetEntity> debts;

    @Nullable
    private BigDecimal liability;

    @Nullable
    private BigDecimal liabilityRate;

    @Nullable
    private List<AssetEntity> liquidationConsumedList;

    @Nullable
    private String positionTag;

    @Nullable
    private BigDecimal returnAsset;

    @Nullable
    private BigDecimal total;

    @Nullable
    private BigDecimal totalConsumedUsdt;

    @Nullable
    private Long updatedAt;

    /* JADX INFO: renamed from: com.kubi.margin.entity.DelegationLiquidationEntity$a */
    /* JADX INFO: compiled from: DelegationLiquidationEntity.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C17612a implements Parcelable.Creator<DelegationLiquidationEntity> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final DelegationLiquidationEntity createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int i11 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i11);
            for (int i12 = 0; i12 != i11; i12++) {
                arrayList2.add(AssetEntity.CREATOR.createFromParcel(parcel));
            }
            String string = parcel.readString();
            Long lValueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            int i13 = parcel.readInt();
            ArrayList arrayList3 = new ArrayList(i13);
            for (int i14 = 0; i14 != i13; i14++) {
                arrayList3.add(AssetEntity.CREATOR.createFromParcel(parcel));
            }
            BigDecimal bigDecimal = (BigDecimal) parcel.readSerializable();
            BigDecimal bigDecimal2 = (BigDecimal) parcel.readSerializable();
            String string2 = parcel.readString();
            BigDecimal bigDecimal3 = (BigDecimal) parcel.readSerializable();
            BigDecimal bigDecimal4 = (BigDecimal) parcel.readSerializable();
            Long lValueOf2 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            BigDecimal bigDecimal5 = (BigDecimal) parcel.readSerializable();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i15 = parcel.readInt();
                arrayList = new ArrayList(i15);
                for (int i16 = 0; i16 != i15; i16++) {
                    arrayList.add(AssetEntity.CREATOR.createFromParcel(parcel));
                }
            }
            return new DelegationLiquidationEntity(arrayList2, string, lValueOf, arrayList3, bigDecimal, bigDecimal2, string2, bigDecimal3, bigDecimal4, lValueOf2, bigDecimal5, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final DelegationLiquidationEntity[] newArray(int i11) {
            return new DelegationLiquidationEntity[i11];
        }
    }

    public DelegationLiquidationEntity() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, 4095, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DelegationLiquidationEntity copy$default(DelegationLiquidationEntity delegationLiquidationEntity, List list, String str, Long l11, List list2, BigDecimal bigDecimal, BigDecimal bigDecimal2, String str2, BigDecimal bigDecimal3, BigDecimal bigDecimal4, Long l12, BigDecimal bigDecimal5, List list3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = delegationLiquidationEntity.assets;
        }
        if ((i11 & 2) != 0) {
            str = delegationLiquidationEntity.balanceCurrency;
        }
        if ((i11 & 4) != 0) {
            l11 = delegationLiquidationEntity.createdAt;
        }
        if ((i11 & 8) != 0) {
            list2 = delegationLiquidationEntity.debts;
        }
        if ((i11 & 16) != 0) {
            bigDecimal = delegationLiquidationEntity.liability;
        }
        if ((i11 & 32) != 0) {
            bigDecimal2 = delegationLiquidationEntity.liabilityRate;
        }
        if ((i11 & 64) != 0) {
            str2 = delegationLiquidationEntity.positionTag;
        }
        if ((i11 & 128) != 0) {
            bigDecimal3 = delegationLiquidationEntity.returnAsset;
        }
        if ((i11 & 256) != 0) {
            bigDecimal4 = delegationLiquidationEntity.total;
        }
        if ((i11 & 512) != 0) {
            l12 = delegationLiquidationEntity.updatedAt;
        }
        if ((i11 & 1024) != 0) {
            bigDecimal5 = delegationLiquidationEntity.totalConsumedUsdt;
        }
        if ((i11 & 2048) != 0) {
            list3 = delegationLiquidationEntity.liquidationConsumedList;
        }
        BigDecimal bigDecimal6 = bigDecimal5;
        List list4 = list3;
        BigDecimal bigDecimal7 = bigDecimal4;
        Long l13 = l12;
        String str3 = str2;
        BigDecimal bigDecimal8 = bigDecimal3;
        BigDecimal bigDecimal9 = bigDecimal;
        BigDecimal bigDecimal10 = bigDecimal2;
        return delegationLiquidationEntity.copy(list, str, l11, list2, bigDecimal9, bigDecimal10, str3, bigDecimal8, bigDecimal7, l13, bigDecimal6, list4);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DelegationLiquidationEntity)) {
            return false;
        }
        DelegationLiquidationEntity delegationLiquidationEntity = (DelegationLiquidationEntity) other;
        return Intrinsics.areEqual(this.assets, delegationLiquidationEntity.assets) && Intrinsics.areEqual(this.balanceCurrency, delegationLiquidationEntity.balanceCurrency) && Intrinsics.areEqual(this.createdAt, delegationLiquidationEntity.createdAt) && Intrinsics.areEqual(this.debts, delegationLiquidationEntity.debts) && Intrinsics.areEqual(this.liability, delegationLiquidationEntity.liability) && Intrinsics.areEqual(this.liabilityRate, delegationLiquidationEntity.liabilityRate) && Intrinsics.areEqual(this.positionTag, delegationLiquidationEntity.positionTag) && Intrinsics.areEqual(this.returnAsset, delegationLiquidationEntity.returnAsset) && Intrinsics.areEqual(this.total, delegationLiquidationEntity.total) && Intrinsics.areEqual(this.updatedAt, delegationLiquidationEntity.updatedAt) && Intrinsics.areEqual(this.totalConsumedUsdt, delegationLiquidationEntity.totalConsumedUsdt) && Intrinsics.areEqual(this.liquidationConsumedList, delegationLiquidationEntity.liquidationConsumedList);
    }

    public DelegationLiquidationEntity(@NotNull List<AssetEntity> assets, @Nullable String str, @Nullable Long l11, @NotNull List<AssetEntity> debts, @Nullable BigDecimal bigDecimal, @Nullable BigDecimal bigDecimal2, @Nullable String str2, @Nullable BigDecimal bigDecimal3, @Nullable BigDecimal bigDecimal4, @Nullable Long l12, @Nullable BigDecimal bigDecimal5, @Nullable List<AssetEntity> list) {
        Intrinsics.checkNotNullParameter(assets, "assets");
        Intrinsics.checkNotNullParameter(debts, "debts");
        this.assets = assets;
        this.balanceCurrency = str;
        this.createdAt = l11;
        this.debts = debts;
        this.liability = bigDecimal;
        this.liabilityRate = bigDecimal2;
        this.positionTag = str2;
        this.returnAsset = bigDecimal3;
        this.total = bigDecimal4;
        this.updatedAt = l12;
        this.totalConsumedUsdt = bigDecimal5;
        this.liquidationConsumedList = list;
    }

    @NotNull
    public final List<AssetEntity> component1() {
        return this.assets;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final Long getUpdatedAt() {
        return this.updatedAt;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final BigDecimal getTotalConsumedUsdt() {
        return this.totalConsumedUsdt;
    }

    @Nullable
    public final List<AssetEntity> component12() {
        return this.liquidationConsumedList;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getBalanceCurrency() {
        return this.balanceCurrency;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Long getCreatedAt() {
        return this.createdAt;
    }

    @NotNull
    public final List<AssetEntity> component4() {
        return this.debts;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final BigDecimal getLiability() {
        return this.liability;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final BigDecimal getLiabilityRate() {
        return this.liabilityRate;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getPositionTag() {
        return this.positionTag;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final BigDecimal getReturnAsset() {
        return this.returnAsset;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final BigDecimal getTotal() {
        return this.total;
    }

    @NotNull
    public final DelegationLiquidationEntity copy(@NotNull List<AssetEntity> assets, @Nullable String balanceCurrency, @Nullable Long createdAt, @NotNull List<AssetEntity> debts, @Nullable BigDecimal liability, @Nullable BigDecimal liabilityRate, @Nullable String positionTag, @Nullable BigDecimal returnAsset, @Nullable BigDecimal total, @Nullable Long updatedAt, @Nullable BigDecimal totalConsumedUsdt, @Nullable List<AssetEntity> liquidationConsumedList) {
        Intrinsics.checkNotNullParameter(assets, "assets");
        Intrinsics.checkNotNullParameter(debts, "debts");
        return new DelegationLiquidationEntity(assets, balanceCurrency, createdAt, debts, liability, liabilityRate, positionTag, returnAsset, total, updatedAt, totalConsumedUsdt, liquidationConsumedList);
    }

    @NotNull
    public final List<AssetEntity> getAssets() {
        return this.assets;
    }

    @Nullable
    public final String getBalanceCurrency() {
        return this.balanceCurrency;
    }

    @Nullable
    public final Long getCreatedAt() {
        return this.createdAt;
    }

    @NotNull
    public final List<AssetEntity> getDebts() {
        return this.debts;
    }

    @Nullable
    public final BigDecimal getLiability() {
        return this.liability;
    }

    @Nullable
    public final BigDecimal getLiabilityRate() {
        return this.liabilityRate;
    }

    @Nullable
    public final List<AssetEntity> getLiquidationConsumedList() {
        return this.liquidationConsumedList;
    }

    @Nullable
    public final String getPositionTag() {
        return this.positionTag;
    }

    @Nullable
    public final BigDecimal getReturnAsset() {
        return this.returnAsset;
    }

    @Nullable
    public final BigDecimal getTotal() {
        return this.total;
    }

    @Nullable
    public final BigDecimal getTotalConsumedUsdt() {
        return this.totalConsumedUsdt;
    }

    @Nullable
    public final Long getUpdatedAt() {
        return this.updatedAt;
    }

    public int hashCode() {
        int iHashCode = this.assets.hashCode() * 31;
        String str = this.balanceCurrency;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Long l11 = this.createdAt;
        int iHashCode3 = (((iHashCode2 + (l11 == null ? 0 : l11.hashCode())) * 31) + this.debts.hashCode()) * 31;
        BigDecimal bigDecimal = this.liability;
        int iHashCode4 = (iHashCode3 + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        BigDecimal bigDecimal2 = this.liabilityRate;
        int iHashCode5 = (iHashCode4 + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
        String str2 = this.positionTag;
        int iHashCode6 = (iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        BigDecimal bigDecimal3 = this.returnAsset;
        int iHashCode7 = (iHashCode6 + (bigDecimal3 == null ? 0 : bigDecimal3.hashCode())) * 31;
        BigDecimal bigDecimal4 = this.total;
        int iHashCode8 = (iHashCode7 + (bigDecimal4 == null ? 0 : bigDecimal4.hashCode())) * 31;
        Long l12 = this.updatedAt;
        int iHashCode9 = (iHashCode8 + (l12 == null ? 0 : l12.hashCode())) * 31;
        BigDecimal bigDecimal5 = this.totalConsumedUsdt;
        int iHashCode10 = (iHashCode9 + (bigDecimal5 == null ? 0 : bigDecimal5.hashCode())) * 31;
        List<AssetEntity> list = this.liquidationConsumedList;
        return iHashCode10 + (list != null ? list.hashCode() : 0);
    }

    public final void setAssets(@NotNull List<AssetEntity> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.assets = list;
    }

    public final void setBalanceCurrency(@Nullable String str) {
        this.balanceCurrency = str;
    }

    public final void setCreatedAt(@Nullable Long l11) {
        this.createdAt = l11;
    }

    public final void setDebts(@NotNull List<AssetEntity> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.debts = list;
    }

    public final void setLiability(@Nullable BigDecimal bigDecimal) {
        this.liability = bigDecimal;
    }

    public final void setLiabilityRate(@Nullable BigDecimal bigDecimal) {
        this.liabilityRate = bigDecimal;
    }

    public final void setLiquidationConsumedList(@Nullable List<AssetEntity> list) {
        this.liquidationConsumedList = list;
    }

    public final void setPositionTag(@Nullable String str) {
        this.positionTag = str;
    }

    public final void setReturnAsset(@Nullable BigDecimal bigDecimal) {
        this.returnAsset = bigDecimal;
    }

    public final void setTotal(@Nullable BigDecimal bigDecimal) {
        this.total = bigDecimal;
    }

    public final void setTotalConsumedUsdt(@Nullable BigDecimal bigDecimal) {
        this.totalConsumedUsdt = bigDecimal;
    }

    public final void setUpdatedAt(@Nullable Long l11) {
        this.updatedAt = l11;
    }

    @NotNull
    public String toString() {
        return "DelegationLiquidationEntity(assets=" + this.assets + ", balanceCurrency=" + this.balanceCurrency + ", createdAt=" + this.createdAt + ", debts=" + this.debts + ", liability=" + this.liability + ", liabilityRate=" + this.liabilityRate + ", positionTag=" + this.positionTag + ", returnAsset=" + this.returnAsset + ", total=" + this.total + ", updatedAt=" + this.updatedAt + ", totalConsumedUsdt=" + this.totalConsumedUsdt + ", liquidationConsumedList=" + this.liquidationConsumedList + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        List<AssetEntity> list = this.assets;
        dest.writeInt(list.size());
        Iterator<AssetEntity> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(dest, flags);
        }
        dest.writeString(this.balanceCurrency);
        Long l11 = this.createdAt;
        if (l11 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeLong(l11.longValue());
        }
        List<AssetEntity> list2 = this.debts;
        dest.writeInt(list2.size());
        Iterator<AssetEntity> it2 = list2.iterator();
        while (it2.hasNext()) {
            it2.next().writeToParcel(dest, flags);
        }
        dest.writeSerializable(this.liability);
        dest.writeSerializable(this.liabilityRate);
        dest.writeString(this.positionTag);
        dest.writeSerializable(this.returnAsset);
        dest.writeSerializable(this.total);
        Long l12 = this.updatedAt;
        if (l12 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeLong(l12.longValue());
        }
        dest.writeSerializable(this.totalConsumedUsdt);
        List<AssetEntity> list3 = this.liquidationConsumedList;
        if (list3 == null) {
            dest.writeInt(0);
            return;
        }
        dest.writeInt(1);
        dest.writeInt(list3.size());
        Iterator<AssetEntity> it3 = list3.iterator();
        while (it3.hasNext()) {
            it3.next().writeToParcel(dest, flags);
        }
    }

    public /* synthetic */ DelegationLiquidationEntity(List list, String str, Long l11, List list2, BigDecimal bigDecimal, BigDecimal bigDecimal2, String str2, BigDecimal bigDecimal3, BigDecimal bigDecimal4, Long l12, BigDecimal bigDecimal5, List list3, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? CollectionsKt.emptyList() : list, (i11 & 2) != 0 ? null : str, (i11 & 4) != 0 ? null : l11, (i11 & 8) != 0 ? CollectionsKt.emptyList() : list2, (i11 & 16) != 0 ? null : bigDecimal, (i11 & 32) != 0 ? null : bigDecimal2, (i11 & 64) != 0 ? null : str2, (i11 & 128) != 0 ? null : bigDecimal3, (i11 & 256) != 0 ? null : bigDecimal4, (i11 & 512) != 0 ? null : l12, (i11 & 1024) != 0 ? null : bigDecimal5, (i11 & 2048) != 0 ? null : list3);
    }
}
