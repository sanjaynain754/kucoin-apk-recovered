package k30;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: k30.d, reason: from toString */
/* JADX INFO: compiled from: AvailableTradeAmount.kt */
/* JADX INFO: loaded from: classes48.dex */
@Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, m90084d2 = {"Lcom/kubi/tradebase/available/AvailableTradeAmountState;", "", "buy", "Lcom/kubi/tradebase/available/AvailableTradeAmountValue;", "sell", "<init>", "(Lcom/kubi/tradebase/available/AvailableTradeAmountValue;Lcom/kubi/tradebase/available/AvailableTradeAmountValue;)V", "getBuy", "()Lcom/kubi/tradebase/available/AvailableTradeAmountValue;", "getSell", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "TradeBaseLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class AvailableTradeAmountState {

    /* JADX INFO: renamed from: a, reason: from toString */
    @NotNull
    public final AvailableTradeAmountValue buy;

    /* JADX INFO: renamed from: b, reason: from toString */
    @NotNull
    public final AvailableTradeAmountValue sell;

    /* JADX WARN: Multi-variable type inference failed */
    public AvailableTradeAmountState() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AvailableTradeAmountState)) {
            return false;
        }
        AvailableTradeAmountState availableTradeAmountState = (AvailableTradeAmountState) other;
        return Intrinsics.areEqual(this.buy, availableTradeAmountState.buy) && Intrinsics.areEqual(this.sell, availableTradeAmountState.sell);
    }

    public AvailableTradeAmountState(@NotNull AvailableTradeAmountValue buy, @NotNull AvailableTradeAmountValue sell) {
        Intrinsics.checkNotNullParameter(buy, "buy");
        Intrinsics.checkNotNullParameter(sell, "sell");
        this.buy = buy;
        this.sell = sell;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final AvailableTradeAmountValue getBuy() {
        return this.buy;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final AvailableTradeAmountValue getSell() {
        return this.sell;
    }

    public int hashCode() {
        return (this.buy.hashCode() * 31) + this.sell.hashCode();
    }

    @NotNull
    public String toString() {
        return "AvailableTradeAmountState(buy=" + this.buy + ", sell=" + this.sell + ')';
    }

    public /* synthetic */ AvailableTradeAmountState(AvailableTradeAmountValue availableTradeAmountValue, AvailableTradeAmountValue availableTradeAmountValue2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? new AvailableTradeAmountValue(null, null, 0, null, 15, null) : availableTradeAmountValue, (i11 & 2) != 0 ? new AvailableTradeAmountValue(null, null, 0, null, 15, null) : availableTradeAmountValue2);
    }
}
