package kotlinx.coroutines;

import androidx.media3.exoplayer.upstream.CmcdData;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmName;

/* JADX INFO: renamed from: kotlinx.coroutines.o1 */
/* JADX INFO: compiled from: Executors.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0007¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0011\u0010\b\u001a\u00020\u0004*\u00020\u0005¢\u0006\u0004\b\b\u0010\t*\f\b\u0007\u0010\n\"\u00020\u00012\u00020\u0001¨\u0006\u000b"}, m90084d2 = {"Ljava/util/concurrent/ExecutorService;", "Lkotlinx/coroutines/m1;", "c", "(Ljava/util/concurrent/ExecutorService;)Lkotlinx/coroutines/m1;", "Ljava/util/concurrent/Executor;", "Lkotlinx/coroutines/j0;", "b", "(Ljava/util/concurrent/Executor;)Lkotlinx/coroutines/j0;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Lkotlinx/coroutines/j0;)Ljava/util/concurrent/Executor;", "CloseableCoroutineDispatcher", "kotlinx-coroutines-core"}, m90085k = 2, m90086mv = {2, 1, 0}, m90088xi = 48)
public final class C41718o1 {
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final Executor m91177a(@NotNull AbstractC41697j0 abstractC41697j0) {
        Executor executorMo91122p;
        AbstractC41710m1 abstractC41710m1 = abstractC41697j0 instanceof AbstractC41710m1 ? (AbstractC41710m1) abstractC41697j0 : null;
        return (abstractC41710m1 == null || (executorMo91122p = abstractC41710m1.getExecutor()) == null) ? new ExecutorC41778y0(abstractC41697j0) : executorMo91122p;
    }

    @JvmName(name = "from")
    @NotNull
    /* JADX INFO: renamed from: b */
    public static final AbstractC41697j0 m91178b(@NotNull Executor executor) {
        AbstractC41697j0 abstractC41697j0;
        ExecutorC41778y0 executorC41778y0 = executor instanceof ExecutorC41778y0 ? (ExecutorC41778y0) executor : null;
        return (executorC41778y0 == null || (abstractC41697j0 = executorC41778y0.dispatcher) == null) ? new C41714n1(executor) : abstractC41697j0;
    }

    @JvmName(name = "from")
    @NotNull
    /* JADX INFO: renamed from: c */
    public static final AbstractC41710m1 m91179c(@NotNull ExecutorService executorService) {
        return new C41714n1(executorService);
    }
}
