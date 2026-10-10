package com.kubi.search.entity;

import androidx.annotation.Keep;
import com.fasterxml.jackson.databind.node.C6447a;
import com.kubi.kumex.entity.ContractEntityOpenData;
import com.kubi.utils.extensions.C27039d;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p402kf.C41014a;
import p429lf.C42180b;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ContractEntity.kt */
/* JADX INFO: loaded from: classes44.dex */
@Keep
@Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\f\u001a\u00020\rJ\u0006\u0010\u000e\u001a\u00020\rJ\u0006\u0010\u000f\u001a\u00020\u0010J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00102\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\rHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0019"}, m90084d2 = {"Lcom/kubi/search/entity/ContractTradeItemBean;", "", "contract", "Lcom/kubi/search/entity/ContractEntity;", "contractInfo", "Lcom/kubi/kumex/entity/ContractEntityOpenData;", "<init>", "(Lcom/kubi/search/entity/ContractEntity;Lcom/kubi/kumex/entity/ContractEntityOpenData;)V", "getContract", "()Lcom/kubi/search/entity/ContractEntity;", "getContractInfo", "()Lcom/kubi/kumex/entity/ContractEntityOpenData;", "formatPrice", "", "formatChangeRate", "isForeverContract", "", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "SearchLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class ContractTradeItemBean {

    @Nullable
    private final ContractEntity contract;

    @Nullable
    private final ContractEntityOpenData contractInfo;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ContractTradeItemBean)) {
            return false;
        }
        ContractTradeItemBean contractTradeItemBean = (ContractTradeItemBean) other;
        return Intrinsics.areEqual(this.contract, contractTradeItemBean.contract) && Intrinsics.areEqual(this.contractInfo, contractTradeItemBean.contractInfo);
    }

    public static /* synthetic */ ContractTradeItemBean copy$default(ContractTradeItemBean contractTradeItemBean, ContractEntity contractEntity, ContractEntityOpenData contractEntityOpenData, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            contractEntity = contractTradeItemBean.contract;
        }
        if ((i11 & 2) != 0) {
            contractEntityOpenData = contractTradeItemBean.contractInfo;
        }
        return contractTradeItemBean.copy(contractEntity, contractEntityOpenData);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final ContractEntity getContract() {
        return this.contract;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final ContractEntityOpenData getContractInfo() {
        return this.contractInfo;
    }

    @NotNull
    public final ContractTradeItemBean copy(@Nullable ContractEntity contract, @Nullable ContractEntityOpenData contractInfo) {
        return new ContractTradeItemBean(contract, contractInfo);
    }

    @NotNull
    public final String formatChangeRate() {
        Double priceChgPct;
        String strM92642g;
        ContractEntity contractEntity = this.contract;
        return (contractEntity == null || (priceChgPct = contractEntity.getPriceChgPct()) == null || (strM92642g = C42180b.m92642g(new BigDecimal(String.valueOf(priceChgPct.doubleValue())), null, null, 0, true, false, false, 55, null)) == null) ? "--" : strM92642g;
    }

    @NotNull
    public final String formatPrice() {
        Double lastPrice;
        ContractEntity contractEntity = this.contract;
        if (contractEntity == null || (lastPrice = contractEntity.getLastPrice()) == null) {
            return "--";
        }
        BigDecimal bigDecimal = new BigDecimal(String.valueOf(lastPrice.doubleValue()));
        ContractEntityOpenData contractEntityOpenData = this.contractInfo;
        BigDecimal bigDecimalM11724a = C6447a.m11724a(C41014a.m89921F(contractEntityOpenData != null ? contractEntityOpenData.getTickSize() : null, "1"));
        Intrinsics.checkNotNullExpressionValue(bigDecimalM11724a, "stripTrailingZeros(...)");
        String strM92640e = C42180b.m92640e(bigDecimal, null, C27039d.m66650j(Integer.valueOf(C41014a.m89952z(bigDecimalM11724a))), false, false, false, 0, null, 125, null);
        return strM92640e != null ? strM92640e : "--";
    }

    @Nullable
    public final ContractEntity getContract() {
        return this.contract;
    }

    @Nullable
    public final ContractEntityOpenData getContractInfo() {
        return this.contractInfo;
    }

    public int hashCode() {
        ContractEntity contractEntity = this.contract;
        int iHashCode = (contractEntity == null ? 0 : contractEntity.hashCode()) * 31;
        ContractEntityOpenData contractEntityOpenData = this.contractInfo;
        return iHashCode + (contractEntityOpenData != null ? contractEntityOpenData.hashCode() : 0);
    }

    public final boolean isForeverContract() {
        ContractEntityOpenData contractEntityOpenData = this.contractInfo;
        return Intrinsics.areEqual(contractEntityOpenData != null ? contractEntityOpenData.getType() : null, "FFWCSX");
    }

    @NotNull
    public String toString() {
        return "ContractTradeItemBean(contract=" + this.contract + ", contractInfo=" + this.contractInfo + ')';
    }

    public ContractTradeItemBean(@Nullable ContractEntity contractEntity, @Nullable ContractEntityOpenData contractEntityOpenData) {
        this.contract = contractEntity;
        this.contractInfo = contractEntityOpenData;
    }
}
