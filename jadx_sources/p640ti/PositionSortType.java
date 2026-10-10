package p640ti;

import com.kubi.futures.trade.position.data.PositionSortOrder;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: ti.k, reason: from toString */
/* JADX INFO: compiled from: PositionSortType.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00030\b\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0006HÆ\u0003J\u0015\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00030\bHÆ\u0003J\t\u0010\u001a\u001a\u00020\tHÆ\u0003JG\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00030\b2\b\b\u0002\u0010\n\u001a\u00020\tHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u00062\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00030\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006!"}, m90084d2 = {"Lcom/kubi/futures/trade/position/data/PositionSortType;", "", "name", "", "key", "hasOrder", "", "orderText", "Lkotlin/Function1;", "Lcom/kubi/futures/trade/position/data/PositionSortOrder;", "defaultOrder", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLkotlin/jvm/functions/Function1;Lcom/kubi/futures/trade/position/data/PositionSortOrder;)V", "getName", "()Ljava/lang/String;", "getKey", "getHasOrder", "()Z", "getOrderText", "()Lkotlin/jvm/functions/Function1;", "getDefaultOrder", "()Lcom/kubi/futures/trade/position/data/PositionSortOrder;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class PositionSortType {

    /* JADX INFO: renamed from: a, reason: from toString */
    @NotNull
    public final String name;

    /* JADX INFO: renamed from: b, reason: from toString */
    @NotNull
    public final String key;

    /* JADX INFO: renamed from: c, reason: from toString */
    public final boolean hasOrder;

    /* JADX INFO: renamed from: d, reason: from toString */
    @NotNull
    public final Function1<PositionSortOrder, String> orderText;

    /* JADX INFO: renamed from: e, reason: from toString */
    @NotNull
    public final PositionSortOrder defaultOrder;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PositionSortType)) {
            return false;
        }
        PositionSortType positionSortType = (PositionSortType) other;
        return Intrinsics.areEqual(this.name, positionSortType.name) && Intrinsics.areEqual(this.key, positionSortType.key) && this.hasOrder == positionSortType.hasOrder && Intrinsics.areEqual(this.orderText, positionSortType.orderText) && this.defaultOrder == positionSortType.defaultOrder;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PositionSortType(@NotNull String name, @NotNull String key, boolean z11, @NotNull Function1<? super PositionSortOrder, String> orderText, @NotNull PositionSortOrder defaultOrder) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(orderText, "orderText");
        Intrinsics.checkNotNullParameter(defaultOrder, "defaultOrder");
        this.name = name;
        this.key = key;
        this.hasOrder = z11;
        this.orderText = orderText;
        this.defaultOrder = defaultOrder;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final PositionSortOrder getDefaultOrder() {
        return this.defaultOrder;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getHasOrder() {
        return this.hasOrder;
    }

    @NotNull
    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getKey() {
        return this.key;
    }

    @NotNull
    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public final Function1<PositionSortOrder, String> m99589e() {
        return this.orderText;
    }

    public int hashCode() {
        return (((((((this.name.hashCode() * 31) + this.key.hashCode()) * 31) + Boolean.hashCode(this.hasOrder)) * 31) + this.orderText.hashCode()) * 31) + this.defaultOrder.hashCode();
    }

    @NotNull
    public String toString() {
        return "PositionSortType(name=" + this.name + ", key=" + this.key + ", hasOrder=" + this.hasOrder + ", orderText=" + this.orderText + ", defaultOrder=" + this.defaultOrder + ')';
    }
}
