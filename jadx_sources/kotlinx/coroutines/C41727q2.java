package kotlinx.coroutines;

import androidx.media3.exoplayer.upstream.CmcdData;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugProbesKt;
import p852kotlin.jvm.functions.Function2;
import pg0.C43466b;

/* JADX INFO: renamed from: kotlinx.coroutines.q2 */
/* JADX INFO: compiled from: Supervisor.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0019\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001aL\u0010\f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00052'\u0010\u000b\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0006¢\u0006\u0002\b\nH\u0086@\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, m90084d2 = {"Lkotlinx/coroutines/x1;", "parent", "Lkotlinx/coroutines/z;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Lkotlinx/coroutines/x1;)Lkotlinx/coroutines/z;", "R", "Lkotlin/Function2;", "Lkotlinx/coroutines/m0;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "block", "c", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m90085k = 2, m90086mv = {2, 1, 0}, m90088xi = 48)
public final class C41727q2 {
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final InterfaceC41781z m91191a(@Nullable InterfaceC41775x1 interfaceC41775x1) {
        return new C41723p2(interfaceC41775x1);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ InterfaceC41781z m91192b(InterfaceC41775x1 interfaceC41775x1, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            interfaceC41775x1 = null;
        }
        return m91191a(interfaceC41775x1);
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public static final <R> Object m91193c(@NotNull Function2<? super InterfaceC41709m0, ? super Continuation<? super R>, ? extends Object> function2, @NotNull Continuation<? super R> continuation) {
        C41719o2 c41719o2 = new C41719o2(continuation.get$context(), continuation);
        Object objM95683d = C43466b.m95683d(c41719o2, c41719o2, function2);
        if (objM95683d == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return objM95683d;
    }
}
