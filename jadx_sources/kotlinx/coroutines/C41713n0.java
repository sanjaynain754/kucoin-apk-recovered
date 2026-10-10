package kotlinx.coroutines;

import androidx.media3.exoplayer.upstream.CmcdData;
import java.util.concurrent.CancellationException;
import og0.C43080w;
import og0.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.CoroutineContext;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugProbesKt;
import p852kotlin.jvm.functions.Function2;
import pg0.C43466b;

/* JADX INFO: renamed from: kotlinx.coroutines.n0 */
/* JADX INFO: compiled from: CoroutineScope.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\u001a\u001c\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086\u0002¢\u0006\u0004\b\u0003\u0010\u0004\u001a\r\u0010\u0005\u001a\u00020\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001aL\u0010\r\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00072'\u0010\f\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\t\u0012\u0006\u0012\u0004\u0018\u00010\n0\b¢\u0006\u0002\b\u000bH\u0086@\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\b\r\u0010\u000e\u001a\u0015\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u000f\u0010\u0010\u001a#\u0010\u0015\u001a\u00020\u0014*\u00020\u00002\u0010\b\u0002\u0010\u0013\u001a\n\u0018\u00010\u0011j\u0004\u0018\u0001`\u0012¢\u0006\u0004\b\u0015\u0010\u0016\u001a%\u0010\u001a\u001a\u00020\u0014*\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00172\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u0011\u0010\u001c\u001a\u00020\u0014*\u00020\u0000¢\u0006\u0004\b\u001c\u0010\u001d\"\u001b\u0010\"\u001a\u00020\u001e*\u00020\u00008F¢\u0006\f\u0012\u0004\b!\u0010\u001d\u001a\u0004\b\u001f\u0010 ¨\u0006#"}, m90084d2 = {"Lkotlinx/coroutines/m0;", "Lkotlin/coroutines/CoroutineContext;", "context", "i", "(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;)Lkotlinx/coroutines/m0;", "b", "()Lkotlinx/coroutines/m0;", "R", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "block", "f", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Lkotlin/coroutines/CoroutineContext;)Lkotlinx/coroutines/m0;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "cause", "", "d", "(Lkotlinx/coroutines/m0;Ljava/util/concurrent/CancellationException;)V", "", "message", "", "c", "(Lkotlinx/coroutines/m0;Ljava/lang/String;Ljava/lang/Throwable;)V", "g", "(Lkotlinx/coroutines/m0;)V", "", CmcdData.Factory.STREAMING_FORMAT_HLS, "(Lkotlinx/coroutines/m0;)Z", "isActive$annotations", "isActive", "kotlinx-coroutines-core"}, m90085k = 2, m90086mv = {2, 1, 0}, m90088xi = 48)
public final class C41713n0 {
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final InterfaceC41709m0 m91125a(@NotNull CoroutineContext coroutineContext) {
        if (coroutineContext.get(InterfaceC41775x1.INSTANCE) == null) {
            coroutineContext = coroutineContext.plus(JobKt__JobKt.m90358b(null, 1, null));
        }
        return new CoroutineScope(coroutineContext);
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public static final InterfaceC41709m0 m91126b() {
        return new CoroutineScope(C41727q2.m91192b(null, 1, null).plus(C41782z0.m91393c()));
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m91129e(InterfaceC41709m0 interfaceC41709m0, CancellationException cancellationException, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            cancellationException = null;
        }
        m91128d(interfaceC41709m0, cancellationException);
    }

    @Nullable
    /* JADX INFO: renamed from: f */
    public static final <R> Object m91130f(@NotNull Function2<? super InterfaceC41709m0, ? super Continuation<? super R>, ? extends Object> function2, @NotNull Continuation<? super R> continuation) {
        C43080w c43080w = new C43080w(continuation.get$context(), continuation);
        Object objM95683d = C43466b.m95683d(c43080w, c43080w, function2);
        if (objM95683d == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return objM95683d;
    }

    @NotNull
    /* JADX INFO: renamed from: i */
    public static final InterfaceC41709m0 m91133i(@NotNull InterfaceC41709m0 interfaceC41709m0, @NotNull CoroutineContext coroutineContext) {
        return new CoroutineScope(interfaceC41709m0.getCoroutineContext().plus(coroutineContext));
    }

    /* JADX INFO: renamed from: c */
    public static final void m91127c(@NotNull InterfaceC41709m0 interfaceC41709m0, @NotNull String str, @Nullable Throwable th2) {
        m91128d(interfaceC41709m0, C41702k1.m91113a(str, th2));
    }

    /* JADX INFO: renamed from: d */
    public static final void m91128d(@NotNull InterfaceC41709m0 interfaceC41709m0, @Nullable CancellationException cancellationException) {
        InterfaceC41775x1 interfaceC41775x1 = (InterfaceC41775x1) interfaceC41709m0.getCoroutineContext().get(InterfaceC41775x1.INSTANCE);
        if (interfaceC41775x1 != null) {
            interfaceC41775x1.mo90415a(cancellationException);
            return;
        }
        throw new IllegalStateException(("Scope cannot be cancelled because it does not have a job: " + interfaceC41709m0).toString());
    }

    /* JADX INFO: renamed from: g */
    public static final void m91131g(@NotNull InterfaceC41709m0 interfaceC41709m0) {
        C41783z1.m91406l(interfaceC41709m0.getCoroutineContext());
    }

    /* JADX INFO: renamed from: h */
    public static final boolean m91132h(@NotNull InterfaceC41709m0 interfaceC41709m0) {
        InterfaceC41775x1 interfaceC41775x1 = (InterfaceC41775x1) interfaceC41709m0.getCoroutineContext().get(InterfaceC41775x1.INSTANCE);
        if (interfaceC41775x1 != null) {
            return interfaceC41775x1.isActive();
        }
        return true;
    }
}
