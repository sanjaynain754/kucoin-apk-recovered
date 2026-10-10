package qg0;

import kotlinx.coroutines.C41717o0;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmField;

/* JADX INFO: renamed from: qg0.h */
/* JADX INFO: compiled from: Tasks.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B'\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\u0010\t\u001a\u00060\u0007j\u0002`\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m90084d2 = {"Lqg0/h;", "Lqg0/g;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "", "submissionTime", "", "Lkotlinx/coroutines/scheduling/TaskContext;", "taskContext", "<init>", "(Ljava/lang/Runnable;JZ)V", "", "run", "()V", "", "toString", "()Ljava/lang/String;", "d", "Ljava/lang/Runnable;", "kotlinx-coroutines-core"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
public final class C43737h extends AbstractRunnableC43736g {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @JvmField
    @NotNull
    public final Runnable block;

    @Override // java.lang.Runnable
    public void run() {
        this.block.run();
    }

    @NotNull
    public String toString() {
        return "Task[" + C41717o0.m91174a(this.block) + '@' + C41717o0.m91175b(this.block) + ", " + this.submissionTime + ", " + C43738i.m96346c(this.taskContext) + ']';
    }

    public C43737h(@NotNull Runnable runnable, long j11, boolean z11) {
        super(j11, z11);
        this.block = runnable;
    }
}
