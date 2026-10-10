package p00;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: p00.b */
/* JADX INFO: compiled from: KThreadFactory.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, m90084d2 = {"Lp00/b;", "Ljava/util/concurrent/ThreadFactory;", "", "prefix", "", "priorityVal", "<init>", "(Ljava/lang/String;I)V", "Ljava/lang/Runnable;", "r", "Ljava/lang/Thread;", "newThread", "(Ljava/lang/Runnable;)Ljava/lang/Thread;", "b", "Ljava/lang/String;", "c", "I", "Ljava/util/concurrent/atomic/AtomicInteger;", "d", "Ljava/util/concurrent/atomic/AtomicInteger;", "counter", "ThreadPool_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
public final class ThreadFactoryC43346b implements ThreadFactory {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final String prefix;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public final int priorityVal;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final AtomicInteger counter;

    public ThreadFactoryC43346b(@NotNull String prefix, int i11) {
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        this.prefix = prefix;
        this.priorityVal = i11;
        this.counter = new AtomicInteger();
    }

    @Override // java.util.concurrent.ThreadFactory
    @NotNull
    public Thread newThread(@Nullable Runnable r11) {
        Thread thread = new Thread(r11, this.prefix + '-' + this.counter.incrementAndGet());
        thread.setPriority(this.priorityVal);
        return thread;
    }

    public /* synthetic */ ThreadFactoryC43346b(String str, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i12 & 2) != 0 ? 5 : i11);
    }
}
