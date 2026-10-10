package com.kubi.quotefacade.entity;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: RiseFallEntity.kt */
/* JADX INFO: loaded from: classes12.dex */
@Keep
@Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0010J\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0010J\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0010J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\tHÆ\u0003JV\u0010\u001d\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0002\u0010\u001eJ\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020\u0005HÖ\u0001J\t\u0010#\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u0012\u0010\u0010R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u0013\u0010\u0010R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015¨\u0006$"}, m90084d2 = {"Lcom/kubi/quotefacade/entity/RiseFallDetailEntity;", "", "averageRate", "", "advancedNum", "", "unchangedNum", "declinedNum", "advancedTop1", "Lcom/kubi/quotefacade/entity/RiseFallTopEntity;", "declinedTop1", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/kubi/quotefacade/entity/RiseFallTopEntity;Lcom/kubi/quotefacade/entity/RiseFallTopEntity;)V", "getAverageRate", "()Ljava/lang/String;", "getAdvancedNum", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getUnchangedNum", "getDeclinedNum", "getAdvancedTop1", "()Lcom/kubi/quotefacade/entity/RiseFallTopEntity;", "getDeclinedTop1", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/kubi/quotefacade/entity/RiseFallTopEntity;Lcom/kubi/quotefacade/entity/RiseFallTopEntity;)Lcom/kubi/quotefacade/entity/RiseFallDetailEntity;", "equals", "", "other", "hashCode", "toString", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class RiseFallDetailEntity {

    @Nullable
    private final Integer advancedNum;

    @Nullable
    private final RiseFallTopEntity advancedTop1;

    @Nullable
    private final String averageRate;

    @Nullable
    private final Integer declinedNum;

    @Nullable
    private final RiseFallTopEntity declinedTop1;

    @Nullable
    private final Integer unchangedNum;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RiseFallDetailEntity)) {
            return false;
        }
        RiseFallDetailEntity riseFallDetailEntity = (RiseFallDetailEntity) other;
        return Intrinsics.areEqual(this.averageRate, riseFallDetailEntity.averageRate) && Intrinsics.areEqual(this.advancedNum, riseFallDetailEntity.advancedNum) && Intrinsics.areEqual(this.unchangedNum, riseFallDetailEntity.unchangedNum) && Intrinsics.areEqual(this.declinedNum, riseFallDetailEntity.declinedNum) && Intrinsics.areEqual(this.advancedTop1, riseFallDetailEntity.advancedTop1) && Intrinsics.areEqual(this.declinedTop1, riseFallDetailEntity.declinedTop1);
    }

    public static /* synthetic */ RiseFallDetailEntity copy$default(RiseFallDetailEntity riseFallDetailEntity, String str, Integer num, Integer num2, Integer num3, RiseFallTopEntity riseFallTopEntity, RiseFallTopEntity riseFallTopEntity2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = riseFallDetailEntity.averageRate;
        }
        if ((i11 & 2) != 0) {
            num = riseFallDetailEntity.advancedNum;
        }
        if ((i11 & 4) != 0) {
            num2 = riseFallDetailEntity.unchangedNum;
        }
        if ((i11 & 8) != 0) {
            num3 = riseFallDetailEntity.declinedNum;
        }
        if ((i11 & 16) != 0) {
            riseFallTopEntity = riseFallDetailEntity.advancedTop1;
        }
        if ((i11 & 32) != 0) {
            riseFallTopEntity2 = riseFallDetailEntity.declinedTop1;
        }
        RiseFallTopEntity riseFallTopEntity3 = riseFallTopEntity;
        RiseFallTopEntity riseFallTopEntity4 = riseFallTopEntity2;
        return riseFallDetailEntity.copy(str, num, num2, num3, riseFallTopEntity3, riseFallTopEntity4);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAverageRate() {
        return this.averageRate;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Integer getAdvancedNum() {
        return this.advancedNum;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Integer getUnchangedNum() {
        return this.unchangedNum;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Integer getDeclinedNum() {
        return this.declinedNum;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final RiseFallTopEntity getAdvancedTop1() {
        return this.advancedTop1;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final RiseFallTopEntity getDeclinedTop1() {
        return this.declinedTop1;
    }

    @NotNull
    public final RiseFallDetailEntity copy(@Nullable String averageRate, @Nullable Integer advancedNum, @Nullable Integer unchangedNum, @Nullable Integer declinedNum, @Nullable RiseFallTopEntity advancedTop1, @Nullable RiseFallTopEntity declinedTop1) {
        return new RiseFallDetailEntity(averageRate, advancedNum, unchangedNum, declinedNum, advancedTop1, declinedTop1);
    }

    @Nullable
    public final Integer getAdvancedNum() {
        return this.advancedNum;
    }

    @Nullable
    public final RiseFallTopEntity getAdvancedTop1() {
        return this.advancedTop1;
    }

    @Nullable
    public final String getAverageRate() {
        return this.averageRate;
    }

    @Nullable
    public final Integer getDeclinedNum() {
        return this.declinedNum;
    }

    @Nullable
    public final RiseFallTopEntity getDeclinedTop1() {
        return this.declinedTop1;
    }

    @Nullable
    public final Integer getUnchangedNum() {
        return this.unchangedNum;
    }

    public int hashCode() {
        String str = this.averageRate;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.advancedNum;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.unchangedNum;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.declinedNum;
        int iHashCode4 = (iHashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
        RiseFallTopEntity riseFallTopEntity = this.advancedTop1;
        int iHashCode5 = (iHashCode4 + (riseFallTopEntity == null ? 0 : riseFallTopEntity.hashCode())) * 31;
        RiseFallTopEntity riseFallTopEntity2 = this.declinedTop1;
        return iHashCode5 + (riseFallTopEntity2 != null ? riseFallTopEntity2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "RiseFallDetailEntity(averageRate=" + this.averageRate + ", advancedNum=" + this.advancedNum + ", unchangedNum=" + this.unchangedNum + ", declinedNum=" + this.declinedNum + ", advancedTop1=" + this.advancedTop1 + ", declinedTop1=" + this.declinedTop1 + ')';
    }

    public RiseFallDetailEntity(@Nullable String str, @Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3, @Nullable RiseFallTopEntity riseFallTopEntity, @Nullable RiseFallTopEntity riseFallTopEntity2) {
        this.averageRate = str;
        this.advancedNum = num;
        this.unchangedNum = num2;
        this.declinedNum = num3;
        this.advancedTop1 = riseFallTopEntity;
        this.declinedTop1 = riseFallTopEntity2;
    }
}
