package kotlinx.coroutines;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Deprecated;
import p852kotlin.DeprecationLevel;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.CoroutineContext;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugProbesKt;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: kotlinx.coroutines.t0 */
/* JADX INFO: compiled from: Delay.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J%\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ+\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\n\u0010\u000b\u001a\u00060\tj\u0002`\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m90084d2 = {"Lkotlinx/coroutines/t0;", "", "", "timeMillis", "Lkotlinx/coroutines/m;", "", "continuation", "scheduleResumeAfterDelay", "(JLkotlinx/coroutines/m;)V", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "Lkotlin/coroutines/CoroutineContext;", "context", "Lkotlinx/coroutines/b1;", "invokeOnTimeout", "(JLjava/lang/Runnable;Lkotlin/coroutines/CoroutineContext;)Lkotlinx/coroutines/b1;", "kotlinx-coroutines-core"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
public interface InterfaceC41758t0 {

    /* JADX INFO: renamed from: kotlinx.coroutines.t0$a */
    /* JADX INFO: compiled from: Delay.kt */
    /* JADX INFO: loaded from: classes61.dex */
    @Metadata(m90085k = 3, m90086mv = {2, 1, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nDelay.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Delay.kt\nkotlinx/coroutines/Delay$DefaultImpls\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,159:1\n426#2,11:160\n*S KotlinDebug\n*F\n+ 1 Delay.kt\nkotlinx/coroutines/Delay$DefaultImpls\n*L\n27#1:160,11\n*E\n"})
    public static final class a {
        @Deprecated(level = DeprecationLevel.ERROR, message = "Deprecated without replacement as an internal method never intended for public use")
        @Nullable
        /* JADX INFO: renamed from: a */
        public static Object m91353a(@NotNull InterfaceC41758t0 interfaceC41758t0, long j11, @NotNull Continuation<? super Unit> continuation) {
            if (j11 <= 0) {
                return Unit.INSTANCE;
            }
            C41716o c41716o = new C41716o(IntrinsicsKt.intercepted(continuation), 1);
            c41716o.m91142E();
            interfaceC41758t0.scheduleResumeAfterDelay(j11, c41716o);
            Object objM91171w = c41716o.m91171w();
            if (objM91171w == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(continuation);
            }
            return objM91171w == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM91171w : Unit.INSTANCE;
        }

        @NotNull
        /* JADX INFO: renamed from: b */
        public static InterfaceC41550b1 m91354b(@NotNull InterfaceC41758t0 interfaceC41758t0, long j11, @NotNull Runnable runnable, @NotNull CoroutineContext coroutineContext) {
            return C41725q0.m91189a().invokeOnTimeout(j11, runnable, coroutineContext);
        }
    }

    @NotNull
    InterfaceC41550b1 invokeOnTimeout(long timeMillis, @NotNull Runnable block, @NotNull CoroutineContext context);

    void scheduleResumeAfterDelay(long timeMillis, @NotNull InterfaceC41708m<? super Unit> continuation);
}
