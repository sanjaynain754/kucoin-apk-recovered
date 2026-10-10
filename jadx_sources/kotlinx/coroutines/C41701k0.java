package kotlinx.coroutines;

import androidx.media3.exoplayer.upstream.CmcdData;
import og0.C43056g;
import org.jetbrains.annotations.NotNull;
import p852kotlin.ExceptionsKt;
import p852kotlin.Metadata;
import p852kotlin.coroutines.CoroutineContext;

/* JADX INFO: renamed from: kotlinx.coroutines.k0 */
/* JADX INFO: compiled from: CoroutineExceptionHandler.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m90084d2 = {"Lkotlin/coroutines/CoroutineContext;", "context", "", "exception", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Throwable;)V", "originalException", "thrownException", "b", "(Ljava/lang/Throwable;Ljava/lang/Throwable;)Ljava/lang/Throwable;", "kotlinx-coroutines-core"}, m90085k = 2, m90086mv = {2, 1, 0}, m90088xi = 48)
public final class C41701k0 {
    /* JADX INFO: renamed from: a */
    public static final void m91111a(@NotNull CoroutineContext coroutineContext, @NotNull Throwable th2) {
        if (th2 instanceof DispatchException) {
            th2 = ((DispatchException) th2).getCause();
        }
        try {
            CoroutineExceptionHandler coroutineExceptionHandler = (CoroutineExceptionHandler) coroutineContext.get(CoroutineExceptionHandler.INSTANCE);
            if (coroutineExceptionHandler != null) {
                coroutineExceptionHandler.handleException(coroutineContext, th2);
            } else {
                C43056g.m94572a(coroutineContext, th2);
            }
        } catch (Throwable th3) {
            C43056g.m94572a(coroutineContext, m91112b(th2, th3));
        }
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public static final Throwable m91112b(@NotNull Throwable th2, @NotNull Throwable th3) {
        if (th2 == th3) {
            return th2;
        }
        RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th3);
        ExceptionsKt.addSuppressed(runtimeException, th2);
        return runtimeException;
    }
}
