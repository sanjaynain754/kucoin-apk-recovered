package p852kotlin.coroutines.jvm.internal;

import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;
import java.io.Serializable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.SinceKotlin;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ContinuationImpl.kt */
/* JADX INFO: loaded from: classes23.dex */
@SinceKotlin(version = "1.3")
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b!\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\u00020\u00032\u00020\u0004B\u0019\u0012\u0010\u0010\u0005\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\n\u001a\u00020\u000b2\u000e\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\r¢\u0006\u0002\u0010\u000eJ\u001f\u0010\u000f\u001a\u0004\u0018\u00010\u00022\u000e\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\rH$¢\u0006\u0002\u0010\u0010J\b\u0010\u0011\u001a\u00020\u000bH\u0014J\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00012\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0016J$\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00012\b\u0010\u0013\u001a\u0004\u0018\u00010\u00022\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0016J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\n\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016R\u001b\u0010\u0005\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u0001¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0016\u001a\u0004\u0018\u00010\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001b"}, m90084d2 = {"Lkotlin/coroutines/jvm/internal/BaseContinuationImpl;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "Ljava/io/Serializable;", "completion", "<init>", "(Lkotlin/coroutines/Continuation;)V", "getCompletion", "()Lkotlin/coroutines/Continuation;", "resumeWith", "", DbParams.KEY_CHANNEL_RESULT, "Lkotlin/Result;", "(Ljava/lang/Object;)V", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "releaseIntercepted", "create", "value", "toString", "", "callerFrame", "getCallerFrame", "()Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "getStackTraceElement", "Ljava/lang/StackTraceElement;", "kotlin-stdlib"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public abstract class BaseContinuationImpl implements Continuation<Object>, CoroutineStackFrame, Serializable {

    @Nullable
    private final Continuation<Object> completion;

    @NotNull
    public Continuation<Unit> create(@NotNull Continuation<?> completion) {
        Intrinsics.checkNotNullParameter(completion, "completion");
        throw new UnsupportedOperationException("create(Continuation) has not been overridden");
    }

    @Nullable
    public abstract Object invokeSuspend(@NotNull Object result);

    @Override // p852kotlin.coroutines.Continuation
    public final void resumeWith(@NotNull Object result) {
        Continuation<Object> continuation = this;
        while (true) {
            DebugProbesKt.probeCoroutineResumed(continuation);
            BaseContinuationImpl baseContinuationImpl = (BaseContinuationImpl) continuation;
            Continuation<Object> continuation2 = baseContinuationImpl.completion;
            Intrinsics.checkNotNull(continuation2);
            try {
                Object objInvokeSuspend = baseContinuationImpl.invokeSuspend(result);
                if (objInvokeSuspend == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    return;
                } else {
                    result = Result.m103844constructorimpl(objInvokeSuspend);
                }
            } catch (Throwable th2) {
                Result.Companion companion = Result.INSTANCE;
                result = Result.m103844constructorimpl(ResultKt.createFailure(th2));
            }
            baseContinuationImpl.releaseIntercepted();
            if (!(continuation2 instanceof BaseContinuationImpl)) {
                continuation2.resumeWith(result);
                return;
            }
            continuation = continuation2;
        }
    }

    @NotNull
    public Continuation<Unit> create(@Nullable Object value, @NotNull Continuation<?> completion) {
        Intrinsics.checkNotNullParameter(completion, "completion");
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    @Override // p852kotlin.coroutines.jvm.internal.CoroutineStackFrame
    @Nullable
    public CoroutineStackFrame getCallerFrame() {
        Continuation<Object> continuation = this.completion;
        if (continuation instanceof CoroutineStackFrame) {
            return (CoroutineStackFrame) continuation;
        }
        return null;
    }

    @Nullable
    public final Continuation<Object> getCompletion() {
        return this.completion;
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Continuation at ");
        Object stackTraceElement = getStackTraceElement();
        if (stackTraceElement == null) {
            stackTraceElement = getClass().getName();
        }
        sb2.append(stackTraceElement);
        return sb2.toString();
    }

    public BaseContinuationImpl(@Nullable Continuation<Object> continuation) {
        this.completion = continuation;
    }

    @Override // p852kotlin.coroutines.jvm.internal.CoroutineStackFrame
    @Nullable
    public StackTraceElement getStackTraceElement() {
        return DebugMetadataKt.getStackTraceElement(this);
    }

    public void releaseIntercepted() {
    }
}
