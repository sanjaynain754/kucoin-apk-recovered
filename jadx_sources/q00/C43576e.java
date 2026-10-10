package q00;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.kubi.sdk.thread.IKExecutor;
import com.kubi.sdk.thread.KThreadException;
import java.util.concurrent.atomic.AtomicReference;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: q00.e */
/* JADX INFO: compiled from: KThreadMonitor.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ2\u0010\u000f\u001a\u00020\u00062!\u0010\u000e\u001a\u001d\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u00060\tH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\nH\u0000¢\u0006\u0004\b\u0016\u0010\u0017R\u001c\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0019R$\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u001b¨\u0006\u001d"}, m90084d2 = {"Lq00/e;", "", "<init>", "()V", "Lq00/d;", "factory", "", "d", "(Lq00/d;)V", "Lkotlin/Function1;", "Lcom/kubi/sdk/thread/KThreadException;", "Lkotlin/ParameterName;", "name", "e", "handle", "c", "(Lkotlin/jvm/functions/Function1;)V", "Lcom/kubi/sdk/thread/IKExecutor;", "executor", "Lq00/c;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Lcom/kubi/sdk/thread/IKExecutor;)Lq00/c;", "b", "(Lcom/kubi/sdk/thread/KThreadException;)V", "Ljava/util/concurrent/atomic/AtomicReference;", "Ljava/util/concurrent/atomic/AtomicReference;", "monitorFactoryRef", "Lkotlin/jvm/functions/Function1;", "exceptionHandler", "ThreadPool_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
public final class C43576e {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C43576e f96132a = new C43576e();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final AtomicReference<InterfaceC43575d> monitorFactoryRef = new AtomicReference<>();

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public static Function1<? super KThreadException, Unit> exceptionHandler;

    @JvmStatic
    /* JADX INFO: renamed from: c */
    public static final void m95853c(@NotNull Function1<? super KThreadException, Unit> handle) {
        Intrinsics.checkNotNullParameter(handle, "handle");
        exceptionHandler = handle;
    }

    @JvmStatic
    /* JADX INFO: renamed from: d */
    public static final void m95854d(@NotNull InterfaceC43575d factory) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        monitorFactoryRef.set(factory);
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public final InterfaceC43574c m95855a(@NotNull IKExecutor executor) {
        Intrinsics.checkNotNullParameter(executor, "executor");
        InterfaceC43575d interfaceC43575d = monitorFactoryRef.get();
        if (interfaceC43575d == null) {
            return null;
        }
        return interfaceC43575d.mo95852a(executor);
    }

    /* JADX INFO: renamed from: b */
    public final void m95856b(@NotNull KThreadException e11) {
        Intrinsics.checkNotNullParameter(e11, "e");
        Function1<? super KThreadException, Unit> function1 = exceptionHandler;
        if (function1 == null) {
            return;
        }
        function1.invoke(e11);
    }
}
