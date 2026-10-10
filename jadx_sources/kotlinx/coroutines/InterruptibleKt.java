package kotlinx.coroutines;

import androidx.exifinterface.media.ExifInterface;
import java.util.concurrent.CancellationException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.CoroutineContext;
import p852kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: Interruptible.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a.\u0010\u0005\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0086@¢\u0006\u0004\b\u0005\u0010\u0006\u001a+\u0010\b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0007\u001a\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0002¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m90084d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Lkotlin/coroutines/CoroutineContext;", "context", "Lkotlin/Function0;", "block", "b", "(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "coroutineContext", "c", "(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m90085k = 2, m90086mv = {2, 1, 0}, m90088xi = 48)
public final class InterruptibleKt {
    @Nullable
    /* JADX INFO: renamed from: b */
    public static final <T> Object m90355b(@NotNull CoroutineContext coroutineContext, @NotNull Function0<? extends T> function0, @NotNull Continuation<? super T> continuation) {
        return C41686h.m91049g(coroutineContext, new InterruptibleKt$runInterruptible$2(function0, null), continuation);
    }

    /* JADX INFO: renamed from: c */
    public static final <T> T m90356c(CoroutineContext coroutineContext, Function0<? extends T> function0) throws Throwable {
        try {
            C41764u2 c41764u2 = new C41764u2();
            c41764u2.m91361A(C41783z1.m91408n(coroutineContext));
            try {
                return function0.invoke();
            } finally {
                c41764u2.m91362x();
            }
        } catch (InterruptedException e11) {
            throw new CancellationException("Blocking call was interrupted due to parent cancellation").initCause(e11);
        }
    }
}
