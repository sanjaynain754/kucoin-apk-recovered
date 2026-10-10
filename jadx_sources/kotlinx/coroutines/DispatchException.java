package kotlinx.coroutines;

import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.coroutines.CoroutineContext;

/* JADX INFO: compiled from: DispatchedTask.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, m90084d2 = {"Lkotlinx/coroutines/DispatchException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "", "cause", "Lkotlinx/coroutines/j0;", "dispatcher", "Lkotlin/coroutines/CoroutineContext;", "context", "<init>", "(Ljava/lang/Throwable;Lkotlinx/coroutines/j0;Lkotlin/coroutines/CoroutineContext;)V", "Ljava/lang/Throwable;", "getCause", "()Ljava/lang/Throwable;", "kotlinx-coroutines-core"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
public final class DispatchException extends Exception {

    @NotNull
    private final Throwable cause;

    public DispatchException(@NotNull Throwable th2, @NotNull AbstractC41697j0 abstractC41697j0, @NotNull CoroutineContext coroutineContext) {
        super("Coroutine dispatcher " + abstractC41697j0 + " threw an exception, context = " + coroutineContext, th2);
        this.cause = th2;
    }

    @Override // java.lang.Throwable
    @NotNull
    public Throwable getCause() {
        return this.cause;
    }
}
