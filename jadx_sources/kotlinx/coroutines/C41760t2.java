package kotlinx.coroutines;

import androidx.media3.exoplayer.upstream.CmcdData;
import og0.C43045a0;
import og0.C43065k0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: kotlinx.coroutines.t2 */
/* JADX INFO: compiled from: EventLoop.common.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0011\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\b\u0010\u0003J\u0017\u0010\n\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\n\u0010\u000bR(\u0010\u0010\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00040\fj\n\u0012\u0006\u0012\u0004\u0018\u00010\u0004`\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\t\u001a\u00020\u00048@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u0006¨\u0006\u0011"}, m90084d2 = {"Lkotlinx/coroutines/t2;", "", "<init>", "()V", "Lkotlinx/coroutines/f1;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "()Lkotlinx/coroutines/f1;", "", "c", "eventLoop", "d", "(Lkotlinx/coroutines/f1;)V", "Ljava/lang/ThreadLocal;", "Lkotlinx/coroutines/internal/CommonThreadLocal;", "b", "Ljava/lang/ThreadLocal;", "ref", "kotlinx-coroutines-core"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nEventLoop.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EventLoop.common.kt\nkotlinx/coroutines/ThreadLocalEventLoop\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,547:1\n1#2:548\n*E\n"})
public final class C41760t2 {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C41760t2 f91865a = new C41760t2();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final ThreadLocal<AbstractC41589f1> ref = C43065k0.m94606a(new C43045a0("ThreadLocalEventLoop"));

    @Nullable
    /* JADX INFO: renamed from: a */
    public final AbstractC41589f1 m91355a() {
        return ref.get();
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final AbstractC41589f1 m91356b() {
        ThreadLocal<AbstractC41589f1> threadLocal = ref;
        AbstractC41589f1 abstractC41589f1 = threadLocal.get();
        if (abstractC41589f1 != null) {
            return abstractC41589f1;
        }
        AbstractC41589f1 abstractC41589f1M91068a = C41692i1.m91068a();
        threadLocal.set(abstractC41589f1M91068a);
        return abstractC41589f1M91068a;
    }

    /* JADX INFO: renamed from: c */
    public final void m91357c() {
        ref.set(null);
    }

    /* JADX INFO: renamed from: d */
    public final void m91358d(@NotNull AbstractC41589f1 eventLoop) {
        ref.set(eventLoop);
    }
}
