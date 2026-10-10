package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;

/* JADX INFO: renamed from: kotlinx.coroutines.r */
/* JADX INFO: compiled from: CompletionState.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B%\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\r\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bR\u000b\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¨\u0006\u000e"}, m90084d2 = {"Lkotlinx/coroutines/r;", "Lkotlinx/coroutines/b0;", "Lkotlin/coroutines/Continuation;", "continuation", "", "cause", "", "handled", "<init>", "(Lkotlin/coroutines/Continuation;Ljava/lang/Throwable;Z)V", "e", "()Z", "Lkotlinx/atomicfu/AtomicBoolean;", "_resumed", "kotlinx-coroutines-core"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
public final class C41728r extends C41549b0 {

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f91774c = AtomicIntegerFieldUpdater.newUpdater(C41728r.class, "_resumed$volatile");
    private volatile /* synthetic */ int _resumed$volatile;

    public C41728r(@NotNull Continuation<?> continuation, @Nullable Throwable th2, boolean z11) {
        if (th2 == null) {
            th2 = new CancellationException("Continuation " + continuation + " was cancelled normally");
        }
        super(th2, z11);
    }

    /* JADX INFO: renamed from: e */
    public final boolean m91195e() {
        return f91774c.compareAndSet(this, 0, 1);
    }
}
