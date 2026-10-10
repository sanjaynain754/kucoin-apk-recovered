package k30;

import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: k30.g, reason: from toString */
/* JADX INFO: compiled from: AvailableTradeAmount.kt */
/* JADX INFO: loaded from: classes48.dex */
@Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, m90084d2 = {"Lcom/kubi/tradebase/available/AvailableTradeCapacity;", "", "quoteAvailable", "Ljava/math/BigDecimal;", "baseAvailable", "<init>", "(Ljava/math/BigDecimal;Ljava/math/BigDecimal;)V", "getQuoteAvailable", "()Ljava/math/BigDecimal;", "getBaseAvailable", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "TradeBaseLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class AvailableTradeCapacity {

    /* JADX INFO: renamed from: a, reason: from toString */
    @Nullable
    public final BigDecimal quoteAvailable;

    /* JADX INFO: renamed from: b, reason: from toString */
    @Nullable
    public final BigDecimal baseAvailable;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AvailableTradeCapacity)) {
            return false;
        }
        AvailableTradeCapacity availableTradeCapacity = (AvailableTradeCapacity) other;
        return Intrinsics.areEqual(this.quoteAvailable, availableTradeCapacity.quoteAvailable) && Intrinsics.areEqual(this.baseAvailable, availableTradeCapacity.baseAvailable);
    }

    @Nullable
    /* JADX INFO: renamed from: a, reason: from getter */
    public final BigDecimal getBaseAvailable() {
        return this.baseAvailable;
    }

    @Nullable
    /* JADX INFO: renamed from: b, reason: from getter */
    public final BigDecimal getQuoteAvailable() {
        return this.quoteAvailable;
    }

    public int hashCode() {
        BigDecimal bigDecimal = this.quoteAvailable;
        int iHashCode = (bigDecimal == null ? 0 : bigDecimal.hashCode()) * 31;
        BigDecimal bigDecimal2 = this.baseAvailable;
        return iHashCode + (bigDecimal2 != null ? bigDecimal2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "AvailableTradeCapacity(quoteAvailable=" + this.quoteAvailable + ", baseAvailable=" + this.baseAvailable + ')';
    }

    public AvailableTradeCapacity(@Nullable BigDecimal bigDecimal, @Nullable BigDecimal bigDecimal2) {
        this.quoteAvailable = bigDecimal;
        this.baseAvailable = bigDecimal2;
    }
}
