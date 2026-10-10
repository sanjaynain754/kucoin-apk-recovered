package p756xc;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p260fd.InterfaceC37432d;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: xc.c, reason: from toString */
/* JADX INFO: compiled from: SymbolQuoteData.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0006HÆ\u0003J)\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0019"}, m90084d2 = {"Lcom/kubi/core/base/arch/api/data/SymbolQuoteData$ETFInfoResponse;", "Lcom/kubi/core/base/arch/api/IResponse;", "symbol", "", "baseCurrency", "info", "Lcom/kubi/core/base/quote/data/EtfInfoData;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/kubi/core/base/quote/data/EtfInfoData;)V", "getSymbol", "()Ljava/lang/String;", "getBaseCurrency", "getInfo", "()Lcom/kubi/core/base/quote/data/EtfInfoData;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class ETFInfoResponse {

    /* JADX INFO: renamed from: a, reason: from toString */
    @NotNull
    public final String symbol;

    /* JADX INFO: renamed from: b, reason: from toString */
    @NotNull
    public final String baseCurrency;

    /* JADX INFO: renamed from: c, reason: from toString */
    @Nullable
    public final InterfaceC37432d info;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ETFInfoResponse)) {
            return false;
        }
        ETFInfoResponse eTFInfoResponse = (ETFInfoResponse) other;
        return Intrinsics.areEqual(this.symbol, eTFInfoResponse.symbol) && Intrinsics.areEqual(this.baseCurrency, eTFInfoResponse.baseCurrency) && Intrinsics.areEqual(this.info, eTFInfoResponse.info);
    }

    public ETFInfoResponse(@NotNull String symbol, @NotNull String baseCurrency, @Nullable InterfaceC37432d interfaceC37432d) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(baseCurrency, "baseCurrency");
        this.symbol = symbol;
        this.baseCurrency = baseCurrency;
        this.info = interfaceC37432d;
    }

    @Nullable
    /* JADX INFO: renamed from: a, reason: from getter */
    public final InterfaceC37432d getInfo() {
        return this.info;
    }

    public int hashCode() {
        int iHashCode = ((this.symbol.hashCode() * 31) + this.baseCurrency.hashCode()) * 31;
        InterfaceC37432d interfaceC37432d = this.info;
        return iHashCode + (interfaceC37432d == null ? 0 : interfaceC37432d.hashCode());
    }

    @NotNull
    public String toString() {
        return "ETFInfoResponse(symbol=" + this.symbol + ", baseCurrency=" + this.baseCurrency + ", info=" + this.info + ')';
    }
}
