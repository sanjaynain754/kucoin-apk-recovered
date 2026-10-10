package j30;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: j30.b, reason: from toString */
/* JADX INFO: compiled from: SegmentOrder.kt */
/* JADX INFO: loaded from: classes48.dex */
@Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0018"}, m90084d2 = {"Lcom/kubi/tradebase/api/segment/SegmentOrder;", "", "index", "", FirebaseAnalytics.Param.PRICE, "Ljava/math/BigDecimal;", "qty", "<init>", "(ILjava/math/BigDecimal;Ljava/math/BigDecimal;)V", "getIndex", "()I", "getPrice", "()Ljava/math/BigDecimal;", "getQty", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "TradeBaseApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class SegmentOrder {

    /* JADX INFO: renamed from: a, reason: from toString */
    public final int index;

    /* JADX INFO: renamed from: b, reason: from toString */
    @NotNull
    public final BigDecimal price;

    /* JADX INFO: renamed from: c, reason: from toString */
    @NotNull
    public final BigDecimal qty;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SegmentOrder)) {
            return false;
        }
        SegmentOrder segmentOrder = (SegmentOrder) other;
        return this.index == segmentOrder.index && Intrinsics.areEqual(this.price, segmentOrder.price) && Intrinsics.areEqual(this.qty, segmentOrder.qty);
    }

    public SegmentOrder(int i11, @NotNull BigDecimal price, @NotNull BigDecimal qty) {
        Intrinsics.checkNotNullParameter(price, "price");
        Intrinsics.checkNotNullParameter(qty, "qty");
        this.index = i11;
        this.price = price;
        this.qty = qty;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final BigDecimal getPrice() {
        return this.price;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final BigDecimal getQty() {
        return this.qty;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.index) * 31) + this.price.hashCode()) * 31) + this.qty.hashCode();
    }

    @NotNull
    public String toString() {
        return "SegmentOrder(index=" + this.index + ", price=" + this.price + ", qty=" + this.qty + ')';
    }
}
