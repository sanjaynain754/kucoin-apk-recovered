package cm;

import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: cm.r, reason: from toString */
/* JADX INFO: compiled from: UnifyChangeLeverageResult.kt */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m90084d2 = {"Lcom/kubi/kumex/data/trade/model/UnifyChangeMarginResult;", "", "liquidationPrice", "Ljava/math/BigDecimal;", "<init>", "(Ljava/math/BigDecimal;)V", "getLiquidationPrice", "()Ljava/math/BigDecimal;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "KumexApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class UnifyChangeMarginResult {

    /* JADX INFO: renamed from: a, reason: from toString */
    @Nullable
    public final BigDecimal liquidationPrice;

    /* JADX WARN: Multi-variable type inference failed */
    public UnifyChangeMarginResult() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof UnifyChangeMarginResult) && Intrinsics.areEqual(this.liquidationPrice, ((UnifyChangeMarginResult) other).liquidationPrice);
    }

    public UnifyChangeMarginResult(@Nullable BigDecimal bigDecimal) {
        this.liquidationPrice = bigDecimal;
    }

    @Nullable
    /* JADX INFO: renamed from: a, reason: from getter */
    public final BigDecimal getLiquidationPrice() {
        return this.liquidationPrice;
    }

    public int hashCode() {
        BigDecimal bigDecimal = this.liquidationPrice;
        if (bigDecimal == null) {
            return 0;
        }
        return bigDecimal.hashCode();
    }

    @NotNull
    public String toString() {
        return "UnifyChangeMarginResult(liquidationPrice=" + this.liquidationPrice + ')';
    }

    public /* synthetic */ UnifyChangeMarginResult(BigDecimal bigDecimal, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : bigDecimal);
    }
}
