package androidx.concurrent.futures;

import androidx.exifinterface.media.ExifInterface;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ExecutionException;
import kotlinx.coroutines.C41716o;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugProbesKt;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: ListenableFuture.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0000\u001a\u001e\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u0002H\u0086@¢\u0006\u0002\u0010\u0003\u001a\f\u0010\u0004\u001a\u00020\u0005*\u00020\u0006H\u0000¨\u0006\u0007"}, m90084d2 = {"await", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/google/common/util/concurrent/ListenableFuture;", "(Lcom/google/common/util/concurrent/ListenableFuture;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "nonNullCause", "", "Ljava/util/concurrent/ExecutionException;", "concurrent-futures-ktx"}, m90085k = 2, m90086mv = {2, 0, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nListenableFuture.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ListenableFuture.kt\nandroidx/concurrent/futures/ListenableFutureKt\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,99:1\n318#2,11:100\n*S KotlinDebug\n*F\n+ 1 ListenableFuture.kt\nandroidx/concurrent/futures/ListenableFutureKt\n*L\n53#1:100,11\n*E\n"})
public final class ListenableFutureKt {
    @Nullable
    public static final <T> Object await(@NotNull final ListenableFuture<T> listenableFuture, @NotNull Continuation<? super T> continuation) throws Throwable {
        try {
            if (listenableFuture.isDone()) {
                return AbstractResolvableFuture.getUninterruptibly(listenableFuture);
            }
            C41716o c41716o = new C41716o(IntrinsicsKt.intercepted(continuation), 1);
            c41716o.m91142E();
            listenableFuture.addListener(new ToContinuation(listenableFuture, c41716o), DirectExecutor.INSTANCE);
            c41716o.mo91119t(new Function1<Throwable, Unit>() { // from class: androidx.concurrent.futures.ListenableFutureKt$await$2$1
                @Override // p852kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
                    invoke2(th2);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Throwable th2) {
                    listenableFuture.cancel(false);
                }
            });
            Object objM91171w = c41716o.m91171w();
            if (objM91171w == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(continuation);
            }
            return objM91171w;
        } catch (ExecutionException e11) {
            throw nonNullCause(e11);
        }
    }

    @NotNull
    public static final Throwable nonNullCause(@NotNull ExecutionException executionException) {
        Throwable cause = executionException.getCause();
        Intrinsics.checkNotNull(cause);
        return cause;
    }
}
