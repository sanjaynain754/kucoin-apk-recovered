package androidx.concurrent.futures;

import androidx.exifinterface.media.ExifInterface;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.common.util.concurrent.ListenableFuture;
import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import kotlinx.coroutines.AbstractC41697j0;
import kotlinx.coroutines.C41686h;
import kotlinx.coroutines.C41782z0;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.InterfaceC41729r0;
import kotlinx.coroutines.InterfaceC41775x1;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.ContinuationKt;
import p852kotlin.coroutines.CoroutineContext;
import p852kotlin.coroutines.EmptyCoroutineContext;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: SuspendToFutureAdapter.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000A\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0011\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0017B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JV\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e\"\u0004\b\u0000\u0010\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072'\u0010\r\u001a#\b\u0001\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\t¢\u0006\u0002\b\f¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, m90084d2 = {"Landroidx/concurrent/futures/SuspendToFutureAdapter;", "", "<init>", "()V", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlin/coroutines/CoroutineContext;", "context", "", "launchUndispatched", "Lkotlin/Function2;", "Lkotlinx/coroutines/m0;", "Lkotlin/coroutines/Continuation;", "Lkotlin/ExtensionFunctionType;", "block", "Lcom/google/common/util/concurrent/ListenableFuture;", "launchFuture", "(Lkotlin/coroutines/CoroutineContext;ZLkotlin/jvm/functions/Function2;)Lcom/google/common/util/concurrent/ListenableFuture;", "androidx/concurrent/futures/SuspendToFutureAdapter$GlobalListenableFutureScope$1", "GlobalListenableFutureScope", "Landroidx/concurrent/futures/SuspendToFutureAdapter$GlobalListenableFutureScope$1;", "Lkotlinx/coroutines/j0;", "GlobalListenableFutureAwaitContext", "Lkotlinx/coroutines/j0;", "DeferredFuture", "concurrent-futures-ktx"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class SuspendToFutureAdapter {

    @NotNull
    public static final SuspendToFutureAdapter INSTANCE = new SuspendToFutureAdapter();

    @NotNull
    private static final SuspendToFutureAdapter$GlobalListenableFutureScope$1 GlobalListenableFutureScope = new InterfaceC41709m0() { // from class: androidx.concurrent.futures.SuspendToFutureAdapter$GlobalListenableFutureScope$1
        private final CoroutineContext coroutineContext = C41782z0.m91393c();

        @Override // kotlinx.coroutines.InterfaceC41709m0
        public CoroutineContext getCoroutineContext() {
            return this.coroutineContext;
        }
    };

    @NotNull
    private static final AbstractC41697j0 GlobalListenableFutureAwaitContext = C41782z0.m91394d();

    /* JADX INFO: compiled from: SuspendToFutureAdapter.kt */
    @Metadata(m90083d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000e\u0010\rJ\u000f\u0010\u000f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J \u0010\u000f\u001a\u00028\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0015J\u001f\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001d\u0010\u001f\u001a\u00020\u001a2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010!R\"\u0010$\u001a\u0010\u0012\f\u0012\n #*\u0004\u0018\u00018\u00008\u00000\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010)\u001a\u00020&8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(¨\u0006*"}, m90084d2 = {"Landroidx/concurrent/futures/SuspendToFutureAdapter$DeferredFuture;", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/google/common/util/concurrent/ListenableFuture;", "Lkotlin/coroutines/Continuation;", "Lkotlinx/coroutines/r0;", "resultDeferred", "<init>", "(Lkotlinx/coroutines/r0;)V", "", "shouldInterrupt", "cancel", "(Z)Z", "isCancelled", "()Z", "isDone", "get", "()Ljava/lang/Object;", "", "timeout", "Ljava/util/concurrent/TimeUnit;", "unit", "(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;", "Ljava/lang/Runnable;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Ljava/util/concurrent/Executor;", "executor", "", "addListener", "(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V", "Lkotlin/Result;", DbParams.KEY_CHANNEL_RESULT, "resumeWith", "(Ljava/lang/Object;)V", "Lkotlinx/coroutines/r0;", "Landroidx/concurrent/futures/ResolvableFuture;", "kotlin.jvm.PlatformType", "delegateFuture", "Landroidx/concurrent/futures/ResolvableFuture;", "Lkotlin/coroutines/CoroutineContext;", "getContext", "()Lkotlin/coroutines/CoroutineContext;", "context", "concurrent-futures-ktx"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
    public static final class DeferredFuture<T> implements ListenableFuture<T>, Continuation<T> {

        @NotNull
        private final ResolvableFuture<T> delegateFuture = ResolvableFuture.create();

        @NotNull
        private final InterfaceC41729r0<T> resultDeferred;

        @Override // java.util.concurrent.Future
        public T get() {
            return this.delegateFuture.get();
        }

        @Override // com.google.common.util.concurrent.ListenableFuture
        public void addListener(@NotNull Runnable listener, @NotNull Executor executor) {
            this.delegateFuture.addListener(listener, executor);
        }

        @Override // java.util.concurrent.Future
        public boolean cancel(boolean shouldInterrupt) {
            boolean zCancel = this.delegateFuture.cancel(shouldInterrupt);
            if (zCancel) {
                InterfaceC41775x1.a.m91377a(this.resultDeferred, null, 1, null);
            }
            return zCancel;
        }

        @Override // java.util.concurrent.Future
        public T get(long timeout, @NotNull TimeUnit unit) {
            return this.delegateFuture.get(timeout, unit);
        }

        @Override // java.util.concurrent.Future
        public boolean isCancelled() {
            return this.delegateFuture.isCancelled();
        }

        @Override // java.util.concurrent.Future
        public boolean isDone() {
            return this.delegateFuture.isDone();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public DeferredFuture(@NotNull InterfaceC41729r0<? extends T> interfaceC41729r0) {
            this.resultDeferred = interfaceC41729r0;
        }

        @Override // p852kotlin.coroutines.Continuation
        @NotNull
        public CoroutineContext getContext() {
            return SuspendToFutureAdapter.GlobalListenableFutureAwaitContext;
        }

        @Override // p852kotlin.coroutines.Continuation
        public void resumeWith(@NotNull Object result) {
            Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(result);
            if (thM103847exceptionOrNullimpl == null) {
                this.delegateFuture.set(result);
            } else if (thM103847exceptionOrNullimpl instanceof CancellationException) {
                this.delegateFuture.cancel(false);
            } else {
                this.delegateFuture.setException(thM103847exceptionOrNullimpl);
            }
        }
    }

    public static /* synthetic */ ListenableFuture launchFuture$default(SuspendToFutureAdapter suspendToFutureAdapter, CoroutineContext coroutineContext, boolean z11, Function2 function2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            coroutineContext = EmptyCoroutineContext.INSTANCE;
        }
        if ((i11 & 2) != 0) {
            z11 = true;
        }
        return suspendToFutureAdapter.launchFuture(coroutineContext, z11, function2);
    }

    @NotNull
    public final <T> ListenableFuture<T> launchFuture(@NotNull CoroutineContext context, boolean launchUndispatched, @NotNull Function2<? super InterfaceC41709m0, ? super Continuation<? super T>, ? extends Object> block) {
        InterfaceC41729r0 interfaceC41729r0M91043a = C41686h.m91043a(GlobalListenableFutureScope, context, launchUndispatched ? CoroutineStart.UNDISPATCHED : CoroutineStart.DEFAULT, block);
        DeferredFuture deferredFuture = new DeferredFuture(interfaceC41729r0M91043a);
        Continuation<Unit> continuationCreateCoroutine = ContinuationKt.createCoroutine(new SuspendToFutureAdapter$launchFuture$1$1(interfaceC41729r0M91043a), deferredFuture);
        Result.Companion companion = Result.INSTANCE;
        continuationCreateCoroutine.resumeWith(Result.m103844constructorimpl(Unit.INSTANCE));
        return deferredFuture;
    }

    private SuspendToFutureAdapter() {
    }
}
