package bi;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: bi.e, reason: from toString */
/* JADX INFO: compiled from: FlutterModifyTwapEvent.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, m90084d2 = {"Lcom/kubi/futures/event/FlutterPauseRestartTwapEvent;", "", "orderId", "", "status", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getOrderId", "()Ljava/lang/String;", "getStatus", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class FlutterPauseRestartTwapEvent {

    /* JADX INFO: renamed from: a, reason: from toString */
    @NotNull
    public final String orderId;

    /* JADX INFO: renamed from: b, reason: from toString */
    @NotNull
    public final String status;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FlutterPauseRestartTwapEvent)) {
            return false;
        }
        FlutterPauseRestartTwapEvent flutterPauseRestartTwapEvent = (FlutterPauseRestartTwapEvent) other;
        return Intrinsics.areEqual(this.orderId, flutterPauseRestartTwapEvent.orderId) && Intrinsics.areEqual(this.status, flutterPauseRestartTwapEvent.status);
    }

    public FlutterPauseRestartTwapEvent(@NotNull String orderId, @NotNull String status) {
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        Intrinsics.checkNotNullParameter(status, "status");
        this.orderId = orderId;
        this.status = status;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getOrderId() {
        return this.orderId;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    public int hashCode() {
        return (this.orderId.hashCode() * 31) + this.status.hashCode();
    }

    @NotNull
    public String toString() {
        return "FlutterPauseRestartTwapEvent(orderId=" + this.orderId + ", status=" + this.status + ')';
    }
}
