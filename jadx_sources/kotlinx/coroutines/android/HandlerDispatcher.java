package kotlinx.coroutines.android;

import kotlinx.coroutines.AbstractC41586e2;
import kotlinx.coroutines.InterfaceC41550b1;
import kotlinx.coroutines.InterfaceC41708m;
import kotlinx.coroutines.InterfaceC41758t0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Deprecated;
import p852kotlin.DeprecationLevel;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.CoroutineContext;
import p852kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: HandlerDispatcher.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00008&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0001\b¨\u0006\t"}, m90084d2 = {"Lkotlinx/coroutines/android/HandlerDispatcher;", "Lkotlinx/coroutines/e2;", "Lkotlinx/coroutines/t0;", "<init>", "()V", "getImmediate", "()Lkotlinx/coroutines/android/HandlerDispatcher;", "immediate", "Lkotlinx/coroutines/android/HandlerContext;", "kotlinx-coroutines-android"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
public abstract class HandlerDispatcher extends AbstractC41586e2 implements InterfaceC41758t0 {
    public /* synthetic */ HandlerDispatcher(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @Override // kotlinx.coroutines.AbstractC41586e2
    @NotNull
    public abstract HandlerDispatcher getImmediate();

    public abstract /* synthetic */ void scheduleResumeAfterDelay(long j11, @NotNull InterfaceC41708m interfaceC41708m);

    private HandlerDispatcher() {
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "Deprecated without replacement as an internal method never intended for public use")
    @Nullable
    public Object delay(long j11, @NotNull Continuation<? super Unit> continuation) {
        return InterfaceC41758t0.a.m91353a(this, j11, continuation);
    }

    @NotNull
    public InterfaceC41550b1 invokeOnTimeout(long j11, @NotNull Runnable runnable, @NotNull CoroutineContext coroutineContext) {
        return InterfaceC41758t0.a.m91354b(this, j11, runnable, coroutineContext);
    }
}
