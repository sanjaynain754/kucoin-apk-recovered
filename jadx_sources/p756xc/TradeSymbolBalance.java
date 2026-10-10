package p756xc;

import androidx.media3.extractor.text.ttml.TtmlNode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: xc.h, reason: from toString */
/* JADX INFO: compiled from: TradeSymbolBalance.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, m90084d2 = {"Lcom/kubi/core/base/arch/api/data/TradeSymbolBalance;", "", TtmlNode.RUBY_BASE, "Lcom/kubi/core/base/arch/api/data/BalanceData;", "quote", "<init>", "(Lcom/kubi/core/base/arch/api/data/BalanceData;Lcom/kubi/core/base/arch/api/data/BalanceData;)V", "getBase", "()Lcom/kubi/core/base/arch/api/data/BalanceData;", "getQuote", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class TradeSymbolBalance {

    /* JADX INFO: renamed from: a, reason: from toString */
    @NotNull
    public final BalanceData base;

    /* JADX INFO: renamed from: b, reason: from toString */
    @NotNull
    public final BalanceData quote;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TradeSymbolBalance)) {
            return false;
        }
        TradeSymbolBalance tradeSymbolBalance = (TradeSymbolBalance) other;
        return Intrinsics.areEqual(this.base, tradeSymbolBalance.base) && Intrinsics.areEqual(this.quote, tradeSymbolBalance.quote);
    }

    public TradeSymbolBalance(@NotNull BalanceData base, @NotNull BalanceData quote) {
        Intrinsics.checkNotNullParameter(base, "base");
        Intrinsics.checkNotNullParameter(quote, "quote");
        this.base = base;
        this.quote = quote;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ TradeSymbolBalance m101674b(TradeSymbolBalance tradeSymbolBalance, BalanceData balanceData, BalanceData balanceData2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            balanceData = tradeSymbolBalance.base;
        }
        if ((i11 & 2) != 0) {
            balanceData2 = tradeSymbolBalance.quote;
        }
        return tradeSymbolBalance.m101675a(balanceData, balanceData2);
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final TradeSymbolBalance m101675a(@NotNull BalanceData base, @NotNull BalanceData quote) {
        Intrinsics.checkNotNullParameter(base, "base");
        Intrinsics.checkNotNullParameter(quote, "quote");
        return new TradeSymbolBalance(base, quote);
    }

    @NotNull
    /* JADX INFO: renamed from: c, reason: from getter */
    public final BalanceData getBase() {
        return this.base;
    }

    @NotNull
    /* JADX INFO: renamed from: d, reason: from getter */
    public final BalanceData getQuote() {
        return this.quote;
    }

    public int hashCode() {
        return (this.base.hashCode() * 31) + this.quote.hashCode();
    }

    @NotNull
    public String toString() {
        return "TradeSymbolBalance(base=" + this.base + ", quote=" + this.quote + ')';
    }
}
