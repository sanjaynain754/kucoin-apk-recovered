package p260fd;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p721wc.InterfaceC45789a;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: fd.a, reason: from toString */
/* JADX INFO: compiled from: AddOrCancelFavor.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m90084d2 = {"Lcom/kubi/core/base/quote/data/AddOrCancelFavor$Request;", "Lcom/kubi/core/base/arch/api/IRequest;", "symbol", "", "<init>", "(Ljava/lang/String;)V", "getSymbol", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class Request implements InterfaceC45789a {

    /* JADX INFO: renamed from: b, reason: from toString */
    @NotNull
    public final String symbol;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof Request) && Intrinsics.areEqual(this.symbol, ((Request) other).symbol);
    }

    public Request(@NotNull String symbol) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        this.symbol = symbol;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getSymbol() {
        return this.symbol;
    }

    public int hashCode() {
        return this.symbol.hashCode();
    }

    @NotNull
    public String toString() {
        return "Request(symbol=" + this.symbol + ')';
    }
}
