package og0;

import androidx.media3.exoplayer.upstream.CmcdData;
import java.util.Collection;
import java.util.ServiceLoader;
import kotlinx.coroutines.CoroutineExceptionHandler;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.sequences.SequencesKt;

/* JADX INFO: renamed from: og0.f */
/* JADX INFO: compiled from: CoroutineExceptionHandlerImpl.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\" \u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0007\u0010\t¨\u0006\u000b"}, m90084d2 = {"", "exception", "", "b", "(Ljava/lang/Throwable;)V", "", "Lkotlinx/coroutines/CoroutineExceptionHandler;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Ljava/util/Collection;", "()Ljava/util/Collection;", "platformExceptionHandlers", "kotlinx-coroutines-core"}, m90085k = 2, m90086mv = {2, 1, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nCoroutineExceptionHandlerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineExceptionHandlerImpl.kt\nkotlinx/coroutines/internal/CoroutineExceptionHandlerImplKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,50:1\n1#2:51\n*E\n"})
public final class C43054f {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final Collection<CoroutineExceptionHandler> f95239a = SequencesKt.toList(SequencesKt.asSequence(ServiceLoader.load(CoroutineExceptionHandler.class, CoroutineExceptionHandler.class.getClassLoader()).iterator()));

    @NotNull
    /* JADX INFO: renamed from: a */
    public static final Collection<CoroutineExceptionHandler> m94570a() {
        return f95239a;
    }

    /* JADX INFO: renamed from: b */
    public static final void m94571b(@NotNull Throwable th2) {
        Thread threadCurrentThread = Thread.currentThread();
        threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, th2);
    }
}
