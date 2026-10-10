package kotlinx.coroutines.rx2;

import androidx.media3.exoplayer.upstream.CmcdData;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.C41701k0;
import org.jetbrains.annotations.NotNull;
import p852kotlin.ExceptionsKt;
import p852kotlin.Metadata;
import p852kotlin.coroutines.CoroutineContext;

/* JADX INFO: renamed from: kotlinx.coroutines.rx2.c */
/* JADX INFO: compiled from: RxCancellable.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m90084d2 = {"", "cause", "Lkotlin/coroutines/CoroutineContext;", "context", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Ljava/lang/Throwable;Lkotlin/coroutines/CoroutineContext;)V", "kotlinx-coroutines-rx2"}, m90085k = 2, m90086mv = {2, 1, 0}, m90088xi = 48)
public final class C41736c {
    /* JADX INFO: renamed from: a */
    public static final void m91216a(@NotNull Throwable th2, @NotNull CoroutineContext coroutineContext) {
        if (th2 instanceof CancellationException) {
            return;
        }
        try {
            RxJavaPlugins.onError(th2);
        } catch (Throwable th3) {
            ExceptionsKt.addSuppressed(th2, th3);
            C41701k0.m91111a(coroutineContext, th2);
        }
    }
}
