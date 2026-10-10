package com.kubi.operation.lib.entity;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: BonusLottieConfigEntity.kt */
/* JADX INFO: loaded from: classes32.dex */
@Keep
@Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000bJ\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000bJ\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000bJ\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000bJ\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000bJJ\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0017J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\r\u0010\u000bR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\u000e\u0010\u000bR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\u000f\u0010\u000bR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\u0010\u0010\u000b¨\u0006\u001e"}, m90084d2 = {"Lcom/kubi/operation/lib/entity/BonusLottieConfigEntity;", "", "repeatCountBest", "", "repeatCountHigh", "repeatCountMiddle", "repeatCountLow", "repeatCountBad", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getRepeatCountBest", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getRepeatCountHigh", "getRepeatCountMiddle", "getRepeatCountLow", "getRepeatCountBad", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/kubi/operation/lib/entity/BonusLottieConfigEntity;", "equals", "", "other", "hashCode", "toString", "", "OperationLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class BonusLottieConfigEntity {

    @Nullable
    private final Integer repeatCountBad;

    @Nullable
    private final Integer repeatCountBest;

    @Nullable
    private final Integer repeatCountHigh;

    @Nullable
    private final Integer repeatCountLow;

    @Nullable
    private final Integer repeatCountMiddle;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BonusLottieConfigEntity)) {
            return false;
        }
        BonusLottieConfigEntity bonusLottieConfigEntity = (BonusLottieConfigEntity) other;
        return Intrinsics.areEqual(this.repeatCountBest, bonusLottieConfigEntity.repeatCountBest) && Intrinsics.areEqual(this.repeatCountHigh, bonusLottieConfigEntity.repeatCountHigh) && Intrinsics.areEqual(this.repeatCountMiddle, bonusLottieConfigEntity.repeatCountMiddle) && Intrinsics.areEqual(this.repeatCountLow, bonusLottieConfigEntity.repeatCountLow) && Intrinsics.areEqual(this.repeatCountBad, bonusLottieConfigEntity.repeatCountBad);
    }

    public static /* synthetic */ BonusLottieConfigEntity copy$default(BonusLottieConfigEntity bonusLottieConfigEntity, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            num = bonusLottieConfigEntity.repeatCountBest;
        }
        if ((i11 & 2) != 0) {
            num2 = bonusLottieConfigEntity.repeatCountHigh;
        }
        if ((i11 & 4) != 0) {
            num3 = bonusLottieConfigEntity.repeatCountMiddle;
        }
        if ((i11 & 8) != 0) {
            num4 = bonusLottieConfigEntity.repeatCountLow;
        }
        if ((i11 & 16) != 0) {
            num5 = bonusLottieConfigEntity.repeatCountBad;
        }
        Integer num6 = num5;
        Integer num7 = num3;
        return bonusLottieConfigEntity.copy(num, num2, num7, num4, num6);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Integer getRepeatCountBest() {
        return this.repeatCountBest;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Integer getRepeatCountHigh() {
        return this.repeatCountHigh;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Integer getRepeatCountMiddle() {
        return this.repeatCountMiddle;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Integer getRepeatCountLow() {
        return this.repeatCountLow;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Integer getRepeatCountBad() {
        return this.repeatCountBad;
    }

    @NotNull
    public final BonusLottieConfigEntity copy(@Nullable Integer repeatCountBest, @Nullable Integer repeatCountHigh, @Nullable Integer repeatCountMiddle, @Nullable Integer repeatCountLow, @Nullable Integer repeatCountBad) {
        return new BonusLottieConfigEntity(repeatCountBest, repeatCountHigh, repeatCountMiddle, repeatCountLow, repeatCountBad);
    }

    @Nullable
    public final Integer getRepeatCountBad() {
        return this.repeatCountBad;
    }

    @Nullable
    public final Integer getRepeatCountBest() {
        return this.repeatCountBest;
    }

    @Nullable
    public final Integer getRepeatCountHigh() {
        return this.repeatCountHigh;
    }

    @Nullable
    public final Integer getRepeatCountLow() {
        return this.repeatCountLow;
    }

    @Nullable
    public final Integer getRepeatCountMiddle() {
        return this.repeatCountMiddle;
    }

    public int hashCode() {
        Integer num = this.repeatCountBest;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.repeatCountHigh;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.repeatCountMiddle;
        int iHashCode3 = (iHashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.repeatCountLow;
        int iHashCode4 = (iHashCode3 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.repeatCountBad;
        return iHashCode4 + (num5 != null ? num5.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "BonusLottieConfigEntity(repeatCountBest=" + this.repeatCountBest + ", repeatCountHigh=" + this.repeatCountHigh + ", repeatCountMiddle=" + this.repeatCountMiddle + ", repeatCountLow=" + this.repeatCountLow + ", repeatCountBad=" + this.repeatCountBad + ')';
    }

    public BonusLottieConfigEntity(@Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3, @Nullable Integer num4, @Nullable Integer num5) {
        this.repeatCountBest = num;
        this.repeatCountHigh = num2;
        this.repeatCountMiddle = num3;
        this.repeatCountLow = num4;
        this.repeatCountBad = num5;
    }
}
