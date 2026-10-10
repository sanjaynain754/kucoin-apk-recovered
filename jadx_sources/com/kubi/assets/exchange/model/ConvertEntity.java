package com.kubi.assets.exchange.model;

import androidx.annotation.Keep;
import com.kubi.assets.entity.RedeemableEntity;
import java.math.BigDecimal;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ConvertEntity.kt */
/* JADX INFO: loaded from: classes6.dex */
@Keep
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0011\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0003J?\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001e"}, m90084d2 = {"Lcom/kubi/assets/exchange/model/ConvertEntity;", "", "positionType", "", "positionTag", "feeRate", "Ljava/math/BigDecimal;", "redeemableList", "", "Lcom/kubi/assets/entity/RedeemableEntity;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/util/List;)V", "getPositionType", "()Ljava/lang/String;", "getPositionTag", "getFeeRate", "()Ljava/math/BigDecimal;", "getRedeemableList", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class ConvertEntity {

    @Nullable
    private final BigDecimal feeRate;

    @Nullable
    private final String positionTag;

    @Nullable
    private final String positionType;

    @Nullable
    private final List<RedeemableEntity> redeemableList;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ConvertEntity)) {
            return false;
        }
        ConvertEntity convertEntity = (ConvertEntity) other;
        return Intrinsics.areEqual(this.positionType, convertEntity.positionType) && Intrinsics.areEqual(this.positionTag, convertEntity.positionTag) && Intrinsics.areEqual(this.feeRate, convertEntity.feeRate) && Intrinsics.areEqual(this.redeemableList, convertEntity.redeemableList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ConvertEntity copy$default(ConvertEntity convertEntity, String str, String str2, BigDecimal bigDecimal, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = convertEntity.positionType;
        }
        if ((i11 & 2) != 0) {
            str2 = convertEntity.positionTag;
        }
        if ((i11 & 4) != 0) {
            bigDecimal = convertEntity.feeRate;
        }
        if ((i11 & 8) != 0) {
            list = convertEntity.redeemableList;
        }
        return convertEntity.copy(str, str2, bigDecimal, list);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPositionType() {
        return this.positionType;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getPositionTag() {
        return this.positionTag;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final BigDecimal getFeeRate() {
        return this.feeRate;
    }

    @Nullable
    public final List<RedeemableEntity> component4() {
        return this.redeemableList;
    }

    @NotNull
    public final ConvertEntity copy(@Nullable String positionType, @Nullable String positionTag, @Nullable BigDecimal feeRate, @Nullable List<RedeemableEntity> redeemableList) {
        return new ConvertEntity(positionType, positionTag, feeRate, redeemableList);
    }

    @Nullable
    public final BigDecimal getFeeRate() {
        return this.feeRate;
    }

    @Nullable
    public final String getPositionTag() {
        return this.positionTag;
    }

    @Nullable
    public final String getPositionType() {
        return this.positionType;
    }

    @Nullable
    public final List<RedeemableEntity> getRedeemableList() {
        return this.redeemableList;
    }

    public int hashCode() {
        String str = this.positionType;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.positionTag;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        BigDecimal bigDecimal = this.feeRate;
        int iHashCode3 = (iHashCode2 + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        List<RedeemableEntity> list = this.redeemableList;
        return iHashCode3 + (list != null ? list.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "ConvertEntity(positionType=" + this.positionType + ", positionTag=" + this.positionTag + ", feeRate=" + this.feeRate + ", redeemableList=" + this.redeemableList + ')';
    }

    public ConvertEntity(@Nullable String str, @Nullable String str2, @Nullable BigDecimal bigDecimal, @Nullable List<RedeemableEntity> list) {
        this.positionType = str;
        this.positionTag = str2;
        this.feeRate = bigDecimal;
        this.redeemableList = list;
    }
}
