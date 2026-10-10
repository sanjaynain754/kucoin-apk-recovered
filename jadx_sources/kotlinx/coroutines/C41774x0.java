package kotlinx.coroutines;

import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.upstream.CmcdData;
import og0.C43058h;
import og0.C43059h0;
import og0.C43060i;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.CoroutineContext;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: kotlinx.coroutines.x0 */
/* JADX INFO: compiled from: DispatchedTask.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\u001a'\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a5\u0010\u000b\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a\u0017\u0010\r\u001a\u00020\u0004*\u0006\u0012\u0002\b\u00030\u0001H\u0002¢\u0006\u0004\b\r\u0010\u000e\"\u0018\u0010\u0011\u001a\u00020\t*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010\"\u0018\u0010\u0013\u001a\u00020\t*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0010¨\u0006\u0014"}, m90084d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/w0;", "", "mode", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Lkotlinx/coroutines/w0;I)V", "Lkotlin/coroutines/Continuation;", "delegate", "", "undispatched", "d", "(Lkotlinx/coroutines/w0;Lkotlin/coroutines/Continuation;Z)V", "e", "(Lkotlinx/coroutines/w0;)V", "b", "(I)Z", "isCancellableMode", "c", "isReusableMode", "kotlinx-coroutines-core"}, m90085k = 2, m90086mv = {2, 1, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nDispatchedTask.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DispatchedTask.kt\nkotlinx/coroutines/DispatchedTaskKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 DispatchedContinuation.kt\nkotlinx/coroutines/internal/DispatchedContinuation\n+ 4 CoroutineContext.kt\nkotlinx/coroutines/CoroutineContextKt\n+ 5 StackTraceRecovery.kt\nkotlinx/coroutines/internal/StackTraceRecoveryKt\n*L\n1#1,220:1\n184#1,17:238\n1#2:221\n236#3:222\n237#3,2:233\n239#3:237\n103#4,10:223\n114#4,2:235\n57#5,2:255\n*S KotlinDebug\n*F\n+ 1 DispatchedTask.kt\nkotlinx/coroutines/DispatchedTaskKt\n*L\n174#1:238,17\n162#1:222\n162#1:233,2\n162#1:237\n162#1:223,10\n162#1:235,2\n204#1:255,2\n*E\n"})
public final class C41774x0 {
    /* JADX INFO: renamed from: b */
    public static final boolean m91373b(int i11) {
        return i11 == 1 || i11 == 2;
    }

    /* JADX INFO: renamed from: c */
    public static final boolean m91374c(int i11) {
        return i11 == 2;
    }

    /* JADX INFO: renamed from: e */
    public static final void m91376e(AbstractC41770w0<?> abstractC41770w0) {
        AbstractC41589f1 abstractC41589f1M91356b = C41760t2.f91865a.m91356b();
        if (abstractC41589f1M91356b.m90734R()) {
            abstractC41589f1M91356b.m90731M(abstractC41770w0);
            return;
        }
        abstractC41589f1M91356b.m90733P(true);
        try {
            m91375d(abstractC41770w0, abstractC41770w0.mo91158b(), true);
            do {
            } while (abstractC41589f1M91356b.m90737U());
        } catch (Throwable th2) {
            try {
                abstractC41770w0.m91371g(th2);
            } finally {
                abstractC41589f1M91356b.m90739p(true);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static final <T> void m91372a(@NotNull AbstractC41770w0<? super T> abstractC41770w0, int i11) {
        boolean z11;
        Continuation<? super T> continuationMo91158b = abstractC41770w0.mo91158b();
        if (i11 == 4) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z11 && (continuationMo91158b instanceof C43058h) && m91373b(i11) == m91373b(abstractC41770w0.resumeMode)) {
            C43058h c43058h = (C43058h) continuationMo91158b;
            AbstractC41697j0 abstractC41697j0 = c43058h.dispatcher;
            CoroutineContext context = c43058h.get$context();
            if (C43060i.m94594d(abstractC41697j0, context)) {
                C43060i.m94593c(abstractC41697j0, context, abstractC41770w0);
                return;
            } else {
                m91376e(abstractC41770w0);
                return;
            }
        }
        m91375d(abstractC41770w0, continuationMo91158b, z11);
    }

    /* JADX INFO: renamed from: d */
    public static final <T> void m91375d(@NotNull AbstractC41770w0<? super T> abstractC41770w0, @NotNull Continuation<? super T> continuation, boolean z11) {
        Object objMo91160f;
        C41776x2<?> c41776x2M91062m;
        boolean zM91383Z0;
        Object objMo91161h = abstractC41770w0.mo91161h();
        Throwable thMo91159d = abstractC41770w0.mo91159d(objMo91161h);
        if (thMo91159d != null) {
            Result.Companion companion = Result.INSTANCE;
            objMo91160f = ResultKt.createFailure(thMo91159d);
        } else {
            Result.Companion companion2 = Result.INSTANCE;
            objMo91160f = abstractC41770w0.mo91160f(objMo91161h);
        }
        Object objM103844constructorimpl = Result.m103844constructorimpl(objMo91160f);
        if (z11) {
            Intrinsics.checkNotNull(continuation, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTaskKt.resume>");
            C43058h c43058h = (C43058h) continuation;
            Continuation<T> continuation2 = c43058h.continuation;
            Object obj = c43058h.countOrElement;
            CoroutineContext context = continuation2.get$context();
            Object objM94590i = C43059h0.m94590i(context, obj);
            if (objM94590i != C43059h0.f95245a) {
                c41776x2M91062m = C41687h0.m91062m(continuation2, context, objM94590i);
            } else {
                c41776x2M91062m = null;
            }
            try {
                c43058h.continuation.resumeWith(objM103844constructorimpl);
                Unit unit = Unit.INSTANCE;
                if (c41776x2M91062m != null) {
                    if (!zM91383Z0) {
                        return;
                    }
                }
                return;
            } finally {
                if (c41776x2M91062m == null || c41776x2M91062m.m91383Z0()) {
                    C43059h0.m94587f(context, objM94590i);
                }
            }
        }
        continuation.resumeWith(objM103844constructorimpl);
    }
}
