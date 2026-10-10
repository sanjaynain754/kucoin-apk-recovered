package kotlinx.coroutines;

import com.trtc.uikit.livekit.p180kc.data.entity.ClickCardReport;
import java.util.concurrent.Future;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;

/* JADX INFO: renamed from: kotlinx.coroutines.k */
/* JADX INFO: compiled from: Executors.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rR\u0018\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000e¨\u0006\u000f"}, m90084d2 = {"Lkotlinx/coroutines/k;", "Lkotlinx/coroutines/l;", "Ljava/util/concurrent/Future;", ClickCardReport.ReportData.CARD_TYPE_FUTURE, "<init>", "(Ljava/util/concurrent/Future;)V", "", "cause", "", "b", "(Ljava/lang/Throwable;)V", "", "toString", "()Ljava/lang/String;", "Ljava/util/concurrent/Future;", "kotlinx-coroutines-core"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
public final class C41700k implements InterfaceC41704l {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Future<?> future;

    @Override // kotlinx.coroutines.InterfaceC41704l
    /* JADX INFO: renamed from: b */
    public void mo90501b(@Nullable Throwable cause) {
        this.future.cancel(false);
    }

    @NotNull
    public String toString() {
        return "CancelFutureOnCancel[" + this.future + ']';
    }

    public C41700k(@NotNull Future<?> future) {
        this.future = future;
    }
}
