package com.kubi.search.entity;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ContractEntity.kt */
/* JADX INFO: loaded from: classes12.dex */
@Keep
@Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000eJ\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000eJ2\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0018J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0011\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0011\u001a\u0004\b\u0012\u0010\u000e\"\u0004\b\u0013\u0010\u0010¨\u0006\u001f"}, m90084d2 = {"Lcom/kubi/search/entity/ContractEntity;", "", "symbol", "", "lastPrice", "", "priceChgPct", "<init>", "(Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;)V", "getSymbol", "()Ljava/lang/String;", "setSymbol", "(Ljava/lang/String;)V", "getLastPrice", "()Ljava/lang/Double;", "setLastPrice", "(Ljava/lang/Double;)V", "Ljava/lang/Double;", "getPriceChgPct", "setPriceChgPct", "component1", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;)Lcom/kubi/search/entity/ContractEntity;", "equals", "", "other", "hashCode", "", "toString", "SearchLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class ContractEntity {

    @Nullable
    private Double lastPrice;

    @Nullable
    private Double priceChgPct;

    @Nullable
    private String symbol;

    public ContractEntity() {
        this(null, null, null, 7, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ContractEntity)) {
            return false;
        }
        ContractEntity contractEntity = (ContractEntity) other;
        return Intrinsics.areEqual(this.symbol, contractEntity.symbol) && Intrinsics.areEqual((Object) this.lastPrice, (Object) contractEntity.lastPrice) && Intrinsics.areEqual((Object) this.priceChgPct, (Object) contractEntity.priceChgPct);
    }

    public ContractEntity(@Nullable String str, @Nullable Double d11, @Nullable Double d12) {
        this.symbol = str;
        this.lastPrice = d11;
        this.priceChgPct = d12;
    }

    public static /* synthetic */ ContractEntity copy$default(ContractEntity contractEntity, String str, Double d11, Double d12, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = contractEntity.symbol;
        }
        if ((i11 & 2) != 0) {
            d11 = contractEntity.lastPrice;
        }
        if ((i11 & 4) != 0) {
            d12 = contractEntity.priceChgPct;
        }
        return contractEntity.copy(str, d11, d12);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSymbol() {
        return this.symbol;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Double getLastPrice() {
        return this.lastPrice;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Double getPriceChgPct() {
        return this.priceChgPct;
    }

    @NotNull
    public final ContractEntity copy(@Nullable String symbol, @Nullable Double lastPrice, @Nullable Double priceChgPct) {
        return new ContractEntity(symbol, lastPrice, priceChgPct);
    }

    @Nullable
    public final Double getLastPrice() {
        return this.lastPrice;
    }

    @Nullable
    public final Double getPriceChgPct() {
        return this.priceChgPct;
    }

    @Nullable
    public final String getSymbol() {
        return this.symbol;
    }

    public int hashCode() {
        String str = this.symbol;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Double d11 = this.lastPrice;
        int iHashCode2 = (iHashCode + (d11 == null ? 0 : d11.hashCode())) * 31;
        Double d12 = this.priceChgPct;
        return iHashCode2 + (d12 != null ? d12.hashCode() : 0);
    }

    public final void setLastPrice(@Nullable Double d11) {
        this.lastPrice = d11;
    }

    public final void setPriceChgPct(@Nullable Double d11) {
        this.priceChgPct = d11;
    }

    public final void setSymbol(@Nullable String str) {
        this.symbol = str;
    }

    @NotNull
    public String toString() {
        return "ContractEntity(symbol=" + this.symbol + ", lastPrice=" + this.lastPrice + ", priceChgPct=" + this.priceChgPct + ')';
    }

    public /* synthetic */ ContractEntity(String str, Double d11, Double d12, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : d11, (i11 & 4) != 0 ? null : d12);
    }
}
