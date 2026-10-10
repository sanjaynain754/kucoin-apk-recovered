package p852kotlin.concurrent;

import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.PublishedApi;
import p852kotlin.Unit;
import p852kotlin.internal.InlineOnly;
import p852kotlin.jvm.JvmName;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Timer.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\u001a3\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0019\b\u0004\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\b\bH\u0087\bø\u0001\u0000\u001a3\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\t\u001a\u00020\n2\u0019\b\u0004\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\b\bH\u0087\bø\u0001\u0000\u001a;\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0019\b\u0004\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\b\bH\u0087\bø\u0001\u0000\u001a;\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00042\u0019\b\u0004\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\b\bH\u0087\bø\u0001\u0000\u001a;\u0010\f\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0019\b\u0004\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\b\bH\u0087\bø\u0001\u0000\u001a;\u0010\f\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00042\u0019\b\u0004\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\b\bH\u0087\bø\u0001\u0000\u001a\u001a\u0010\r\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0001\u001aO\u0010\r\u001a\u00020\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0019\b\u0004\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\b\bH\u0087\bø\u0001\u0000\u001aM\u0010\r\u001a\u00020\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00042\u0019\b\u0004\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\b\bH\u0087\bø\u0001\u0000\u001aO\u0010\u0014\u001a\u00020\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0019\b\u0004\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\b\bH\u0087\bø\u0001\u0000\u001aM\u0010\u0014\u001a\u00020\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00042\u0019\b\u0004\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\b\bH\u0087\bø\u0001\u0000\u001a'\u0010\u0015\u001a\u00020\u00012\u0019\b\u0004\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\b\bH\u0087\bø\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0016"}, m90084d2 = {"schedule", "Ljava/util/TimerTask;", "Ljava/util/Timer;", "delay", "", TUIConstants.TIMPush.NOTIFICATION.ACTION, "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "time", "Ljava/util/Date;", "period", "scheduleAtFixedRate", "timer", "name", "", "daemon", "", "initialDelay", "startAt", "fixedRateTimer", "timerTask", "kotlin-stdlib"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
@JvmName(name = "TimersKt")
public final class TimersKt {

    /* JADX INFO: renamed from: kotlin.concurrent.TimersKt$timerTask$1 */
    /* JADX INFO: compiled from: Timer.kt */
    @Metadata(m90083d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m90084d2 = {"kotlin/concurrent/TimersKt$timerTask$1", "Ljava/util/TimerTask;", "run", "", "kotlin-stdlib"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 176)
    @SourceDebugExtension({"SMAP\nTimer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Timer.kt\nkotlin/concurrent/TimersKt$timerTask$1\n*L\n1#1,148:1\n*E\n"})
    public static final class C411411 extends TimerTask {
        final /* synthetic */ Function1<TimerTask, Unit> $action;

        /* JADX WARN: Multi-variable type inference failed */
        public C411411(Function1<? super TimerTask, Unit> function1) {
            this.$action = function1;
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            this.$action.invoke(this);
        }
    }

    @InlineOnly
    private static final Timer fixedRateTimer(String str, boolean z11, long j11, long j12, Function1<? super TimerTask, Unit> action) {
        Intrinsics.checkNotNullParameter(action, "action");
        Timer timer = timer(str, z11);
        timer.scheduleAtFixedRate(new C411411(action), j11, j12);
        return timer;
    }

    public static /* synthetic */ Timer fixedRateTimer$default(String str, boolean z11, long j11, long j12, Function1 action, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = null;
        }
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        if ((i11 & 4) != 0) {
            j11 = 0;
        }
        Intrinsics.checkNotNullParameter(action, "action");
        Timer timer = timer(str, z11);
        timer.scheduleAtFixedRate(new C411411(action), j11, j12);
        return timer;
    }

    @InlineOnly
    private static final TimerTask schedule(Timer timer, long j11, Function1<? super TimerTask, Unit> action) {
        Intrinsics.checkNotNullParameter(timer, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        C411411 c411411 = new C411411(action);
        timer.schedule(c411411, j11);
        return c411411;
    }

    @InlineOnly
    private static final TimerTask scheduleAtFixedRate(Timer timer, long j11, long j12, Function1<? super TimerTask, Unit> action) {
        Intrinsics.checkNotNullParameter(timer, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        C411411 c411411 = new C411411(action);
        timer.scheduleAtFixedRate(c411411, j11, j12);
        return c411411;
    }

    @PublishedApi
    @NotNull
    public static final Timer timer(@Nullable String str, boolean z11) {
        return str == null ? new Timer(z11) : new Timer(str, z11);
    }

    public static /* synthetic */ Timer timer$default(String str, boolean z11, long j11, long j12, Function1 action, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = null;
        }
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        if ((i11 & 4) != 0) {
            j11 = 0;
        }
        Intrinsics.checkNotNullParameter(action, "action");
        Timer timer = timer(str, z11);
        timer.schedule(new C411411(action), j11, j12);
        return timer;
    }

    @InlineOnly
    private static final Timer timer(String str, boolean z11, long j11, long j12, Function1<? super TimerTask, Unit> action) {
        Intrinsics.checkNotNullParameter(action, "action");
        Timer timer = timer(str, z11);
        timer.schedule(new C411411(action), j11, j12);
        return timer;
    }

    @InlineOnly
    private static final TimerTask timerTask(Function1<? super TimerTask, Unit> action) {
        Intrinsics.checkNotNullParameter(action, "action");
        return new C411411(action);
    }

    @InlineOnly
    private static final Timer fixedRateTimer(String str, boolean z11, Date startAt, long j11, Function1<? super TimerTask, Unit> action) {
        Intrinsics.checkNotNullParameter(startAt, "startAt");
        Intrinsics.checkNotNullParameter(action, "action");
        Timer timer = timer(str, z11);
        timer.scheduleAtFixedRate(new C411411(action), startAt, j11);
        return timer;
    }

    @InlineOnly
    private static final TimerTask schedule(Timer timer, Date time, Function1<? super TimerTask, Unit> action) {
        Intrinsics.checkNotNullParameter(timer, "<this>");
        Intrinsics.checkNotNullParameter(time, "time");
        Intrinsics.checkNotNullParameter(action, "action");
        C411411 c411411 = new C411411(action);
        timer.schedule(c411411, time);
        return c411411;
    }

    @InlineOnly
    private static final TimerTask scheduleAtFixedRate(Timer timer, Date time, long j11, Function1<? super TimerTask, Unit> action) {
        Intrinsics.checkNotNullParameter(timer, "<this>");
        Intrinsics.checkNotNullParameter(time, "time");
        Intrinsics.checkNotNullParameter(action, "action");
        C411411 c411411 = new C411411(action);
        timer.scheduleAtFixedRate(c411411, time, j11);
        return c411411;
    }

    public static /* synthetic */ Timer fixedRateTimer$default(String str, boolean z11, Date startAt, long j11, Function1 action, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = null;
        }
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        Intrinsics.checkNotNullParameter(startAt, "startAt");
        Intrinsics.checkNotNullParameter(action, "action");
        Timer timer = timer(str, z11);
        timer.scheduleAtFixedRate(new C411411(action), startAt, j11);
        return timer;
    }

    @InlineOnly
    private static final Timer timer(String str, boolean z11, Date startAt, long j11, Function1<? super TimerTask, Unit> action) {
        Intrinsics.checkNotNullParameter(startAt, "startAt");
        Intrinsics.checkNotNullParameter(action, "action");
        Timer timer = timer(str, z11);
        timer.schedule(new C411411(action), startAt, j11);
        return timer;
    }

    public static /* synthetic */ Timer timer$default(String str, boolean z11, Date startAt, long j11, Function1 action, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = null;
        }
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        Intrinsics.checkNotNullParameter(startAt, "startAt");
        Intrinsics.checkNotNullParameter(action, "action");
        Timer timer = timer(str, z11);
        timer.schedule(new C411411(action), startAt, j11);
        return timer;
    }

    @InlineOnly
    private static final TimerTask schedule(Timer timer, long j11, long j12, Function1<? super TimerTask, Unit> action) {
        Intrinsics.checkNotNullParameter(timer, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        C411411 c411411 = new C411411(action);
        timer.schedule(c411411, j11, j12);
        return c411411;
    }

    @InlineOnly
    private static final TimerTask schedule(Timer timer, Date time, long j11, Function1<? super TimerTask, Unit> action) {
        Intrinsics.checkNotNullParameter(timer, "<this>");
        Intrinsics.checkNotNullParameter(time, "time");
        Intrinsics.checkNotNullParameter(action, "action");
        C411411 c411411 = new C411411(action);
        timer.schedule(c411411, time, j11);
        return c411411;
    }
}
