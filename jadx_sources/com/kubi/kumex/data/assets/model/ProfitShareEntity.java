package com.kubi.kumex.data.assets.model;

import androidx.annotation.Keep;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ProfitShareEntity.kt */
/* JADX INFO: loaded from: classes20.dex */
@Keep
@Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0017"}, m90084d2 = {"Lcom/kubi/kumex/data/assets/model/ProfitShareEntity;", "", "openPrice", "Ljava/math/BigDecimal;", "closePrice", "profitRate", "<init>", "(Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;)V", "getOpenPrice", "()Ljava/math/BigDecimal;", "getClosePrice", "getProfitRate", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "KumexApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class ProfitShareEntity {

    @Nullable
    private final BigDecimal closePrice;

    @Nullable
    private final BigDecimal openPrice;

    @Nullable
    private final BigDecimal profitRate;

    public ProfitShareEntity() {
        this(null, null, null, 7, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProfitShareEntity)) {
            return false;
        }
        ProfitShareEntity profitShareEntity = (ProfitShareEntity) other;
        return Intrinsics.areEqual(this.openPrice, profitShareEntity.openPrice) && Intrinsics.areEqual(this.closePrice, profitShareEntity.closePrice) && Intrinsics.areEqual(this.profitRate, profitShareEntity.profitRate);
    }

    public ProfitShareEntity(@Nullable BigDecimal bigDecimal, @Nullable BigDecimal bigDecimal2, @Nullable BigDecimal bigDecimal3) {
        this.openPrice = bigDecimal;
        this.closePrice = bigDecimal2;
        this.profitRate = bigDecimal3;
    }

    public static /* synthetic */ ProfitShareEntity copy$default(ProfitShareEntity profitShareEntity, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            bigDecimal = profitShareEntity.openPrice;
        }
        if ((i11 & 2) != 0) {
            bigDecimal2 = profitShareEntity.closePrice;
        }
        if ((i11 & 4) != 0) {
            bigDecimal3 = profitShareEntity.profitRate;
        }
        return profitShareEntity.copy(bigDecimal, bigDecimal2, bigDecimal3);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final BigDecimal getOpenPrice() {
        return this.openPrice;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final BigDecimal getClosePrice() {
        return this.closePrice;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final BigDecimal getProfitRate() {
        return this.profitRate;
    }

    @NotNull
    public final ProfitShareEntity copy(@Nullable BigDecimal openPrice, @Nullable BigDecimal closePrice, @Nullable BigDecimal profitRate) {
        return new ProfitShareEntity(openPrice, closePrice, profitRate);
    }

    @Nullable
    public final BigDecimal getClosePrice() {
        return this.closePrice;
    }

    @Nullable
    public final BigDecimal getOpenPrice() {
        return this.openPrice;
    }

    @Nullable
    public final BigDecimal getProfitRate() {
        return this.profitRate;
    }

    public int hashCode() {
        BigDecimal bigDecimal = this.openPrice;
        int iHashCode = (bigDecimal == null ? 0 : bigDecimal.hashCode()) * 31;
        BigDecimal bigDecimal2 = this.closePrice;
        int iHashCode2 = (iHashCode + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
        BigDecimal bigDecimal3 = this.profitRate;
        return iHashCode2 + (bigDecimal3 != null ? bigDecimal3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "ProfitShareEntity(openPrice=" + this.openPrice + ", closePrice=" + this.closePrice + ", profitRate=" + this.profitRate + ')';
    }

    public /* synthetic */ ProfitShareEntity(BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : bigDecimal, (i11 & 2) != 0 ? null : bigDecimal2, (i11 & 4) != 0 ? null : bigDecimal3);
    }
}
