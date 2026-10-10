package bi;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: bi.c, reason: from toString */
/* JADX INFO: compiled from: FlutterModifyTwapEvent.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, m90084d2 = {"Lcom/kubi/futures/event/FlutterCancelTwapOrderEvent;", "", "orderId", "", "<init>", "(Ljava/lang/String;)V", "getOrderId", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class FlutterCancelTwapOrderEvent {

    /* JADX INFO: renamed from: a, reason: from toString */
    @NotNull
    public final String orderId;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof FlutterCancelTwapOrderEvent) && Intrinsics.areEqual(this.orderId, ((FlutterCancelTwapOrderEvent) other).orderId);
    }

    public FlutterCancelTwapOrderEvent(@NotNull String orderId) {
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        this.orderId = orderId;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getOrderId() {
        return this.orderId;
    }

    public int hashCode() {
        return this.orderId.hashCode();
    }

    @NotNull
    public String toString() {
        return "FlutterCancelTwapOrderEvent(orderId=" + this.orderId + ')';
    }
}
