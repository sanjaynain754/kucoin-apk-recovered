package og0;

import androidx.media3.exoplayer.upstream.CmcdData;
import java.util.Iterator;
import kotlinx.coroutines.C41701k0;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.internal.DiagnosticCoroutineContextException;
import kotlinx.coroutines.internal.ExceptionSuccessfullyProcessed;
import org.jetbrains.annotations.NotNull;
import p852kotlin.ExceptionsKt;
import p852kotlin.Metadata;
import p852kotlin.coroutines.CoroutineContext;

/* JADX INFO: renamed from: og0.g */
/* JADX INFO: compiled from: CoroutineExceptionHandlerImpl.common.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m90084d2 = {"Lkotlin/coroutines/CoroutineContext;", "context", "", "exception", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, m90085k = 2, m90086mv = {2, 1, 0}, m90088xi = 48)
public final class C43056g {
    /* JADX INFO: renamed from: a */
    public static final void m94572a(@NotNull CoroutineContext coroutineContext, @NotNull Throwable th2) {
        Iterator<CoroutineExceptionHandler> it = C43054f.m94570a().iterator();
        while (it.hasNext()) {
            try {
                it.next().handleException(coroutineContext, th2);
            } catch (ExceptionSuccessfullyProcessed unused) {
                return;
            } catch (Throwable th3) {
                C43054f.m94571b(C41701k0.m91112b(th2, th3));
            }
        }
        try {
            ExceptionsKt.addSuppressed(th2, new DiagnosticCoroutineContextException(coroutineContext));
        } catch (Throwable unused2) {
        }
        C43054f.m94571b(th2);
    }
}
