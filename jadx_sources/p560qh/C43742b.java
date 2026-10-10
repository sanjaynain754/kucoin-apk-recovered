package p560qh;

import io.reactivex.Scheduler;
import io.reactivex.schedulers.Schedulers;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: qh.b */
/* JADX INFO: compiled from: NothingExecutor.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0006\u0010\u0000\u001a\u00020\u0001¨\u0006\u0002"}, m90084d2 = {"nothingScheduler", "Lio/reactivex/Scheduler;", "KumexLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C43742b {
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final Scheduler m96366a() {
        Scheduler schedulerFrom = Schedulers.from(new ExecutorServiceC43741a());
        Intrinsics.checkNotNullExpressionValue(schedulerFrom, "from(...)");
        return schedulerFrom;
    }
}
