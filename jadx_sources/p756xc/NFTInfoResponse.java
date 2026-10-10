package p756xc;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: xc.d, reason: from toString */
/* JADX INFO: compiled from: SymbolQuoteData.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m90084d2 = {"Lcom/kubi/core/base/arch/api/data/SymbolQuoteData$NFTInfoResponse;", "Lcom/kubi/core/base/arch/api/IResponse;", "symbol", "", "info", "Lcom/kubi/core/base/arch/api/data/NTFInfo;", "<init>", "(Ljava/lang/String;Lcom/kubi/core/base/arch/api/data/NTFInfo;)V", "getSymbol", "()Ljava/lang/String;", "getInfo", "()Lcom/kubi/core/base/arch/api/data/NTFInfo;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class NFTInfoResponse {

    /* JADX INFO: renamed from: a, reason: from toString */
    @NotNull
    public final String symbol;

    /* JADX INFO: renamed from: b, reason: from toString */
    @NotNull
    public final NTFInfo info;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NFTInfoResponse)) {
            return false;
        }
        NFTInfoResponse nFTInfoResponse = (NFTInfoResponse) other;
        return Intrinsics.areEqual(this.symbol, nFTInfoResponse.symbol) && Intrinsics.areEqual(this.info, nFTInfoResponse.info);
    }

    public NFTInfoResponse(@NotNull String symbol, @NotNull NTFInfo info) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(info, "info");
        this.symbol = symbol;
        this.info = info;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final NTFInfo getInfo() {
        return this.info;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getSymbol() {
        return this.symbol;
    }

    public int hashCode() {
        return (this.symbol.hashCode() * 31) + this.info.hashCode();
    }

    @NotNull
    public String toString() {
        return "NFTInfoResponse(symbol=" + this.symbol + ", info=" + this.info + ')';
    }
}
