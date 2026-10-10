package androidx.concurrent.futures;

import androidx.exifinterface.media.ExifInterface;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ExecutionException;
import kotlinx.coroutines.InterfaceC41708m;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;

/* JADX INFO: compiled from: ListenableFuture.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\t\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B#\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m90084d2 = {"Landroidx/concurrent/futures/ToContinuation;", ExifInterface.GPS_DIRECTION_TRUE, "Ljava/lang/Runnable;", "Lcom/google/common/util/concurrent/ListenableFuture;", "futureToObserve", "Lkotlinx/coroutines/m;", "continuation", "<init>", "(Lcom/google/common/util/concurrent/ListenableFuture;Lkotlinx/coroutines/m;)V", "", "run", "()V", "Lcom/google/common/util/concurrent/ListenableFuture;", "getFutureToObserve", "()Lcom/google/common/util/concurrent/ListenableFuture;", "Lkotlinx/coroutines/m;", "getContinuation", "()Lkotlinx/coroutines/m;", "concurrent-futures-ktx"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
final class ToContinuation<T> implements Runnable {

    @NotNull
    private final InterfaceC41708m<T> continuation;

    @NotNull
    private final ListenableFuture<T> futureToObserve;

    @NotNull
    public final InterfaceC41708m<T> getContinuation() {
        return this.continuation;
    }

    @NotNull
    public final ListenableFuture<T> getFutureToObserve() {
        return this.futureToObserve;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.futureToObserve.isCancelled()) {
            InterfaceC41708m.a.m91121a(this.continuation, null, 1, null);
            return;
        }
        try {
            InterfaceC41708m<T> interfaceC41708m = this.continuation;
            Result.Companion companion = Result.INSTANCE;
            interfaceC41708m.resumeWith(Result.m103844constructorimpl(AbstractResolvableFuture.getUninterruptibly(this.futureToObserve)));
        } catch (ExecutionException e11) {
            InterfaceC41708m<T> interfaceC41708m2 = this.continuation;
            Result.Companion companion2 = Result.INSTANCE;
            interfaceC41708m2.resumeWith(Result.m103844constructorimpl(ResultKt.createFailure(ListenableFutureKt.nonNullCause(e11))));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ToContinuation(@NotNull ListenableFuture<T> listenableFuture, @NotNull InterfaceC41708m<? super T> interfaceC41708m) {
        this.futureToObserve = listenableFuture;
        this.continuation = interfaceC41708m;
    }
}
