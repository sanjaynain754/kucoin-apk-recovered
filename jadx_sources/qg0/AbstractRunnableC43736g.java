package qg0;

import p852kotlin.Metadata;
import p852kotlin.jvm.JvmField;

/* JADX INFO: renamed from: qg0.g */
/* JADX INFO: compiled from: Tasks.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\t\b \u0018\u00002\u00060\u0001j\u0002`\u0002B\u001b\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\u0010\u0007\u001a\u00060\u0005j\u0002`\u0006¢\u0006\u0004\b\b\u0010\tB\t\b\u0010¢\u0006\u0004\b\b\u0010\nR\u0016\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u0007\u001a\u00060\u0005j\u0002`\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m90084d2 = {"Lqg0/g;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "", "submissionTime", "", "Lkotlinx/coroutines/scheduling/TaskContext;", "taskContext", "<init>", "(JZ)V", "()V", "b", "J", "c", "Z", "kotlinx-coroutines-core"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
public abstract class AbstractRunnableC43736g implements Runnable {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @JvmField
    public long submissionTime;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @JvmField
    public boolean taskContext;

    public AbstractRunnableC43736g(long j11, boolean z11) {
        this.submissionTime = j11;
        this.taskContext = z11;
    }

    public AbstractRunnableC43736g() {
        this(0L, false);
    }
}
