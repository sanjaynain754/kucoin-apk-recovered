package im;

import ki.InterfaceC41049a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p314hi.InterfaceC38213a;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: im.a, reason: from toString */
/* JADX INFO: compiled from: BookConfig.kt */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u000e¨\u0006\u0019"}, m90084d2 = {"Lcom/kubi/kumex/logic/book/BookAmountConfig;", "", "contract", "Lcom/kubi/futures/trade/config/IFuturesContractConfig;", "qtyUnit", "Lcom/kubi/futures/trade/config/qty/IQtyUnitStrategy;", "isTotal", "", "<init>", "(Lcom/kubi/futures/trade/config/IFuturesContractConfig;Lcom/kubi/futures/trade/config/qty/IQtyUnitStrategy;Z)V", "getContract", "()Lcom/kubi/futures/trade/config/IFuturesContractConfig;", "getQtyUnit", "()Lcom/kubi/futures/trade/config/qty/IQtyUnitStrategy;", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class BookAmountConfig {

    /* JADX INFO: renamed from: a, reason: from toString */
    @NotNull
    public final InterfaceC38213a contract;

    /* JADX INFO: renamed from: b, reason: from toString */
    @NotNull
    public final InterfaceC41049a qtyUnit;

    /* JADX INFO: renamed from: c, reason: from toString */
    public final boolean isTotal;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BookAmountConfig)) {
            return false;
        }
        BookAmountConfig bookAmountConfig = (BookAmountConfig) other;
        return Intrinsics.areEqual(this.contract, bookAmountConfig.contract) && Intrinsics.areEqual(this.qtyUnit, bookAmountConfig.qtyUnit) && this.isTotal == bookAmountConfig.isTotal;
    }

    public BookAmountConfig(@NotNull InterfaceC38213a contract, @NotNull InterfaceC41049a qtyUnit, boolean z11) {
        Intrinsics.checkNotNullParameter(contract, "contract");
        Intrinsics.checkNotNullParameter(qtyUnit, "qtyUnit");
        this.contract = contract;
        this.qtyUnit = qtyUnit;
        this.isTotal = z11;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final InterfaceC38213a getContract() {
        return this.contract;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final InterfaceC41049a getQtyUnit() {
        return this.qtyUnit;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getIsTotal() {
        return this.isTotal;
    }

    public int hashCode() {
        return (((this.contract.hashCode() * 31) + this.qtyUnit.hashCode()) * 31) + Boolean.hashCode(this.isTotal);
    }

    @NotNull
    public String toString() {
        return "BookAmountConfig(contract=" + this.contract + ", qtyUnit=" + this.qtyUnit + ", isTotal=" + this.isTotal + ')';
    }
}
