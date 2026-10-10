package cm;

import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: cm.l, reason: from toString */
/* JADX INFO: compiled from: LotCostDeltaResult.kt */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, m90084d2 = {"Lcom/kubi/kumex/data/trade/model/LotCostDeltaResult;", "", "buyLotCostDelta", "Ljava/math/BigDecimal;", "sellLotCostDelta", "<init>", "(Ljava/math/BigDecimal;Ljava/math/BigDecimal;)V", "getBuyLotCostDelta", "()Ljava/math/BigDecimal;", "getSellLotCostDelta", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "KumexApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class LotCostDeltaResult {

    /* JADX INFO: renamed from: a, reason: from toString */
    @Nullable
    public final BigDecimal buyLotCostDelta;

    /* JADX INFO: renamed from: b, reason: from toString */
    @Nullable
    public final BigDecimal sellLotCostDelta;

    /* JADX WARN: Multi-variable type inference failed */
    public LotCostDeltaResult() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LotCostDeltaResult)) {
            return false;
        }
        LotCostDeltaResult lotCostDeltaResult = (LotCostDeltaResult) other;
        return Intrinsics.areEqual(this.buyLotCostDelta, lotCostDeltaResult.buyLotCostDelta) && Intrinsics.areEqual(this.sellLotCostDelta, lotCostDeltaResult.sellLotCostDelta);
    }

    public LotCostDeltaResult(@Nullable BigDecimal bigDecimal, @Nullable BigDecimal bigDecimal2) {
        this.buyLotCostDelta = bigDecimal;
        this.sellLotCostDelta = bigDecimal2;
    }

    @Nullable
    /* JADX INFO: renamed from: a, reason: from getter */
    public final BigDecimal getBuyLotCostDelta() {
        return this.buyLotCostDelta;
    }

    @Nullable
    /* JADX INFO: renamed from: b, reason: from getter */
    public final BigDecimal getSellLotCostDelta() {
        return this.sellLotCostDelta;
    }

    public int hashCode() {
        BigDecimal bigDecimal = this.buyLotCostDelta;
        int iHashCode = (bigDecimal == null ? 0 : bigDecimal.hashCode()) * 31;
        BigDecimal bigDecimal2 = this.sellLotCostDelta;
        return iHashCode + (bigDecimal2 != null ? bigDecimal2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "LotCostDeltaResult(buyLotCostDelta=" + this.buyLotCostDelta + ", sellLotCostDelta=" + this.sellLotCostDelta + ')';
    }

    public /* synthetic */ LotCostDeltaResult(BigDecimal bigDecimal, BigDecimal bigDecimal2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : bigDecimal, (i11 & 2) != 0 ? null : bigDecimal2);
    }
}
