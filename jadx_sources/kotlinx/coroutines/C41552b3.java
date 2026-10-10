package kotlinx.coroutines;

import androidx.media3.exoplayer.upstream.CmcdData;
import og0.C43058h;
import og0.C43060i;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.CoroutineContext;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugProbesKt;

/* JADX INFO: renamed from: kotlinx.coroutines.b3 */
/* JADX INFO: compiled from: Yield.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u0010\u0010\u0001\u001a\u00020\u0000H\u0086@¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, m90084d2 = {"", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m90085k = 2, m90086mv = {2, 1, 0}, m90088xi = 48)
public final class C41552b3 {
    @Nullable
    /* JADX INFO: renamed from: a */
    public static final Object m90496a(@NotNull Continuation<? super Unit> continuation) {
        C43058h c43058h;
        Object coroutine_suspended;
        CoroutineContext coroutineContext = continuation.getContext();
        C41783z1.m91406l(coroutineContext);
        Continuation continuationIntercepted = IntrinsicsKt.intercepted(continuation);
        if (continuationIntercepted instanceof C43058h) {
            c43058h = (C43058h) continuationIntercepted;
        } else {
            c43058h = null;
        }
        if (c43058h == null) {
            coroutine_suspended = Unit.INSTANCE;
        } else {
            if (C43060i.m94594d(c43058h.dispatcher, coroutineContext)) {
                c43058h.m94576k(coroutineContext, Unit.INSTANCE);
            } else {
                C41543a3 c41543a3 = new C41543a3();
                CoroutineContext coroutineContextPlus = coroutineContext.plus(c41543a3);
                Unit unit = Unit.INSTANCE;
                c43058h.m94576k(coroutineContextPlus, unit);
                if (!c41543a3.dispatcherWasUnconfined || C43060i.m94595e(c43058h)) {
                    coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                } else {
                    coroutine_suspended = unit;
                }
            }
            coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        }
        if (coroutine_suspended == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        if (coroutine_suspended == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }
}
