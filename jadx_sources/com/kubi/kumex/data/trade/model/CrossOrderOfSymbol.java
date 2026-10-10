package com.kubi.kumex.data.trade.model;

import androidx.annotation.Keep;
import com.kubi.kumex.data.platform.model.ContractEntity;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: CrossHedgeQtyMarginEntity.kt */
/* JADX INFO: loaded from: classes20.dex */
@Keep
@Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0005HÆ\u0003JQ\u0010\u001e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020#HÖ\u0001J\t\u0010$\u001a\u00020%HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0011¨\u0006&"}, m90084d2 = {"Lcom/kubi/kumex/data/trade/model/CrossOrderOfSymbol;", "", "contract", "Lcom/kubi/kumex/data/platform/model/ContractEntity;", "markPrice", "Ljava/math/BigDecimal;", "askOrderCost", "bidOrderCost", "bidOrderSize", "askOrderSize", "<init>", "(Lcom/kubi/kumex/data/platform/model/ContractEntity;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;)V", "getContract", "()Lcom/kubi/kumex/data/platform/model/ContractEntity;", "setContract", "(Lcom/kubi/kumex/data/platform/model/ContractEntity;)V", "getMarkPrice", "()Ljava/math/BigDecimal;", "setMarkPrice", "(Ljava/math/BigDecimal;)V", "getAskOrderCost", "getBidOrderCost", "getBidOrderSize", "getAskOrderSize", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "", "KumexApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class CrossOrderOfSymbol {

    @Nullable
    private final BigDecimal askOrderCost;

    @Nullable
    private final BigDecimal askOrderSize;

    @Nullable
    private final BigDecimal bidOrderCost;

    @Nullable
    private final BigDecimal bidOrderSize;

    @Nullable
    private ContractEntity contract;

    @Nullable
    private BigDecimal markPrice;

    public CrossOrderOfSymbol() {
        this(null, null, null, null, null, null, 63, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CrossOrderOfSymbol)) {
            return false;
        }
        CrossOrderOfSymbol crossOrderOfSymbol = (CrossOrderOfSymbol) other;
        return Intrinsics.areEqual(this.contract, crossOrderOfSymbol.contract) && Intrinsics.areEqual(this.markPrice, crossOrderOfSymbol.markPrice) && Intrinsics.areEqual(this.askOrderCost, crossOrderOfSymbol.askOrderCost) && Intrinsics.areEqual(this.bidOrderCost, crossOrderOfSymbol.bidOrderCost) && Intrinsics.areEqual(this.bidOrderSize, crossOrderOfSymbol.bidOrderSize) && Intrinsics.areEqual(this.askOrderSize, crossOrderOfSymbol.askOrderSize);
    }

    public CrossOrderOfSymbol(@Nullable ContractEntity contractEntity, @Nullable BigDecimal bigDecimal, @Nullable BigDecimal bigDecimal2, @Nullable BigDecimal bigDecimal3, @Nullable BigDecimal bigDecimal4, @Nullable BigDecimal bigDecimal5) {
        this.contract = contractEntity;
        this.markPrice = bigDecimal;
        this.askOrderCost = bigDecimal2;
        this.bidOrderCost = bigDecimal3;
        this.bidOrderSize = bigDecimal4;
        this.askOrderSize = bigDecimal5;
    }

    public static /* synthetic */ CrossOrderOfSymbol copy$default(CrossOrderOfSymbol crossOrderOfSymbol, ContractEntity contractEntity, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, BigDecimal bigDecimal4, BigDecimal bigDecimal5, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            contractEntity = crossOrderOfSymbol.contract;
        }
        if ((i11 & 2) != 0) {
            bigDecimal = crossOrderOfSymbol.markPrice;
        }
        if ((i11 & 4) != 0) {
            bigDecimal2 = crossOrderOfSymbol.askOrderCost;
        }
        if ((i11 & 8) != 0) {
            bigDecimal3 = crossOrderOfSymbol.bidOrderCost;
        }
        if ((i11 & 16) != 0) {
            bigDecimal4 = crossOrderOfSymbol.bidOrderSize;
        }
        if ((i11 & 32) != 0) {
            bigDecimal5 = crossOrderOfSymbol.askOrderSize;
        }
        BigDecimal bigDecimal6 = bigDecimal4;
        BigDecimal bigDecimal7 = bigDecimal5;
        return crossOrderOfSymbol.copy(contractEntity, bigDecimal, bigDecimal2, bigDecimal3, bigDecimal6, bigDecimal7);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final ContractEntity getContract() {
        return this.contract;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final BigDecimal getMarkPrice() {
        return this.markPrice;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final BigDecimal getAskOrderCost() {
        return this.askOrderCost;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final BigDecimal getBidOrderCost() {
        return this.bidOrderCost;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final BigDecimal getBidOrderSize() {
        return this.bidOrderSize;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final BigDecimal getAskOrderSize() {
        return this.askOrderSize;
    }

    @NotNull
    public final CrossOrderOfSymbol copy(@Nullable ContractEntity contract, @Nullable BigDecimal markPrice, @Nullable BigDecimal askOrderCost, @Nullable BigDecimal bidOrderCost, @Nullable BigDecimal bidOrderSize, @Nullable BigDecimal askOrderSize) {
        return new CrossOrderOfSymbol(contract, markPrice, askOrderCost, bidOrderCost, bidOrderSize, askOrderSize);
    }

    @Nullable
    public final BigDecimal getAskOrderCost() {
        return this.askOrderCost;
    }

    @Nullable
    public final BigDecimal getAskOrderSize() {
        return this.askOrderSize;
    }

    @Nullable
    public final BigDecimal getBidOrderCost() {
        return this.bidOrderCost;
    }

    @Nullable
    public final BigDecimal getBidOrderSize() {
        return this.bidOrderSize;
    }

    @Nullable
    public final ContractEntity getContract() {
        return this.contract;
    }

    @Nullable
    public final BigDecimal getMarkPrice() {
        return this.markPrice;
    }

    public int hashCode() {
        ContractEntity contractEntity = this.contract;
        int iHashCode = (contractEntity == null ? 0 : contractEntity.hashCode()) * 31;
        BigDecimal bigDecimal = this.markPrice;
        int iHashCode2 = (iHashCode + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        BigDecimal bigDecimal2 = this.askOrderCost;
        int iHashCode3 = (iHashCode2 + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
        BigDecimal bigDecimal3 = this.bidOrderCost;
        int iHashCode4 = (iHashCode3 + (bigDecimal3 == null ? 0 : bigDecimal3.hashCode())) * 31;
        BigDecimal bigDecimal4 = this.bidOrderSize;
        int iHashCode5 = (iHashCode4 + (bigDecimal4 == null ? 0 : bigDecimal4.hashCode())) * 31;
        BigDecimal bigDecimal5 = this.askOrderSize;
        return iHashCode5 + (bigDecimal5 != null ? bigDecimal5.hashCode() : 0);
    }

    public final void setContract(@Nullable ContractEntity contractEntity) {
        this.contract = contractEntity;
    }

    public final void setMarkPrice(@Nullable BigDecimal bigDecimal) {
        this.markPrice = bigDecimal;
    }

    @NotNull
    public String toString() {
        return "CrossOrderOfSymbol(contract=" + this.contract + ", markPrice=" + this.markPrice + ", askOrderCost=" + this.askOrderCost + ", bidOrderCost=" + this.bidOrderCost + ", bidOrderSize=" + this.bidOrderSize + ", askOrderSize=" + this.askOrderSize + ')';
    }

    public /* synthetic */ CrossOrderOfSymbol(ContractEntity contractEntity, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, BigDecimal bigDecimal4, BigDecimal bigDecimal5, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : contractEntity, (i11 & 2) != 0 ? null : bigDecimal, (i11 & 4) != 0 ? null : bigDecimal2, (i11 & 8) != 0 ? null : bigDecimal3, (i11 & 16) != 0 ? null : bigDecimal4, (i11 & 32) != 0 ? null : bigDecimal5);
    }
}
