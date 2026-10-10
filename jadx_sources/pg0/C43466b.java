package pg0;

import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.upstream.CmcdData;
import kotlinx.coroutines.C41549b0;
import kotlinx.coroutines.C41551b2;
import kotlinx.coroutines.DispatchException;
import kotlinx.coroutines.TimeoutCancellationException;
import og0.C43059h0;
import og0.C43080w;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.KotlinNothingValueException;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.CoroutineContext;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugProbesKt;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.jvm.internal.TypeIntrinsics;

/* JADX INFO: renamed from: pg0.b */
/* JADX INFO: compiled from: Undispatched.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000D\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0003\u001aQ\u0010\b\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00022\u0006\u0010\u0005\u001a\u00028\u00002\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003H\u0000¢\u0006\u0004\b\b\u0010\t\u001aX\u0010\r\u001a\u0004\u0018\u00010\u0004\"\u0004\b\u0000\u0010\u0001\"\u0004\b\u0001\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\n2\u0006\u0010\u0005\u001a\u00028\u00012'\u0010\f\u001a#\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002¢\u0006\u0002\b\u000bH\u0000¢\u0006\u0004\b\r\u0010\u000e\u001aX\u0010\u000f\u001a\u0004\u0018\u00010\u0004\"\u0004\b\u0000\u0010\u0001\"\u0004\b\u0001\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\n2\u0006\u0010\u0005\u001a\u00028\u00012'\u0010\f\u001a#\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002¢\u0006\u0002\b\u000bH\u0000¢\u0006\u0004\b\u000f\u0010\u000e\u001a`\u0010\u0012\u001a\u0004\u0018\u00010\u0004\"\u0004\b\u0000\u0010\u0001\"\u0004\b\u0001\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\n2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00028\u00012'\u0010\f\u001a#\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002¢\u0006\u0002\b\u000bH\u0002¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u001f\u0010\u0016\u001a\u00020\u0010*\u0006\u0012\u0002\b\u00030\n2\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u001f\u0010\u001a\u001a\u00020\u0019*\u0006\u0012\u0002\b\u00030\n2\u0006\u0010\u000f\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, m90084d2 = {"R", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "receiver", "completion", "", "c", "(Lkotlin/jvm/functions/Function2;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)V", "Log0/w;", "Lkotlin/ExtensionFunctionType;", "block", "d", "(Log0/w;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "e", "", "alwaysRethrow", "f", "(Log0/w;ZLjava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "", "cause", "b", "(Log0/w;Ljava/lang/Throwable;)Z", "Lkotlinx/coroutines/DispatchException;", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Log0/w;Lkotlinx/coroutines/DispatchException;)Ljava/lang/Void;", "kotlinx-coroutines-core"}, m90085k = 2, m90086mv = {2, 1, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nUndispatched.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Undispatched.kt\nkotlinx/coroutines/intrinsics/UndispatchedKt\n+ 2 ProbesSupport.kt\nkotlinx/coroutines/internal/ProbesSupportKt\n+ 3 CoroutineContext.kt\nkotlinx/coroutines/CoroutineContextKt\n+ 4 StackTraceRecovery.kt\nkotlinx/coroutines/internal/StackTraceRecoveryKt\n*L\n1#1,105:1\n8#2:106\n11#2,2:110\n91#3,3:107\n95#3:112\n57#4,2:113\n57#4,2:115\n57#4,2:117\n*S KotlinDebug\n*F\n+ 1 Undispatched.kt\nkotlinx/coroutines/intrinsics/UndispatchedKt\n*L\n14#1:106\n19#1:110,2\n18#1:107,3\n18#1:112\n88#1:113,2\n89#1:115,2\n103#1:117,2\n*E\n"})
public final class C43466b {
    @Nullable
    /* JADX INFO: renamed from: d */
    public static final <T, R> Object m95683d(@NotNull C43080w<? super T> c43080w, R r11, @NotNull Function2<? super R, ? super Continuation<? super T>, ? extends Object> function2) {
        return m95685f(c43080w, true, r11, function2);
    }

    @Nullable
    /* JADX INFO: renamed from: e */
    public static final <T, R> Object m95684e(@NotNull C43080w<? super T> c43080w, R r11, @NotNull Function2<? super R, ? super Continuation<? super T>, ? extends Object> function2) {
        return m95685f(c43080w, false, r11, function2);
    }

    /* JADX INFO: renamed from: f */
    public static final <T, R> Object m95685f(C43080w<? super T> c43080w, boolean z11, R r11, Function2<? super R, ? super Continuation<? super T>, ? extends Object> function2) throws Throwable {
        Object c41549b0;
        try {
            c41549b0 = !(function2 instanceof BaseContinuationImpl) ? IntrinsicsKt.wrapWithContinuationImpl(function2, r11, c43080w) : ((Function2) TypeIntrinsics.beforeCheckcastToFunctionOfArity(function2, 2)).invoke(r11, c43080w);
        } catch (DispatchException e11) {
            m95680a(c43080w, e11);
            throw new KotlinNothingValueException();
        } catch (Throwable th2) {
            c41549b0 = new C41549b0(th2, false, 2, null);
        }
        if (c41549b0 == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            return IntrinsicsKt.getCOROUTINE_SUSPENDED();
        }
        Object objM90441w0 = c43080w.m90441w0(c41549b0);
        if (objM90441w0 == C41551b2.f91462b) {
            return IntrinsicsKt.getCOROUTINE_SUSPENDED();
        }
        c43080w.mo91382Y0();
        if (!(objM90441w0 instanceof C41549b0)) {
            return C41551b2.m90495h(objM90441w0);
        }
        if (z11 || m95681b(c43080w, ((C41549b0) objM90441w0).cause)) {
            throw ((C41549b0) objM90441w0).cause;
        }
        if (c41549b0 instanceof C41549b0) {
            throw ((C41549b0) c41549b0).cause;
        }
        return c41549b0;
    }

    /* JADX INFO: renamed from: a */
    public static final Void m95680a(C43080w<?> c43080w, DispatchException dispatchException) throws Throwable {
        c43080w.m90439v0(new C41549b0(dispatchException.getCause(), false, 2, null));
        throw dispatchException.getCause();
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m95681b(C43080w<?> c43080w, Throwable th2) {
        return ((th2 instanceof TimeoutCancellationException) && ((TimeoutCancellationException) th2).coroutine == c43080w) ? false : true;
    }

    /* JADX INFO: renamed from: c */
    public static final <R, T> void m95682c(@NotNull Function2<? super R, ? super Continuation<? super T>, ? extends Object> function2, R r11, @NotNull Continuation<? super T> continuation) {
        Object objInvoke;
        Continuation continuationProbeCoroutineCreated = DebugProbesKt.probeCoroutineCreated(continuation);
        try {
            CoroutineContext context = continuationProbeCoroutineCreated.getContext();
            Object objM94590i = C43059h0.m94590i(context, null);
            try {
                DebugProbesKt.probeCoroutineResumed(continuationProbeCoroutineCreated);
                if (!(function2 instanceof BaseContinuationImpl)) {
                    objInvoke = IntrinsicsKt.wrapWithContinuationImpl(function2, r11, continuationProbeCoroutineCreated);
                } else {
                    objInvoke = ((Function2) TypeIntrinsics.beforeCheckcastToFunctionOfArity(function2, 2)).invoke(r11, continuationProbeCoroutineCreated);
                }
                C43059h0.m94587f(context, objM94590i);
                if (objInvoke != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    continuationProbeCoroutineCreated.resumeWith(Result.m103844constructorimpl(objInvoke));
                }
            } catch (Throwable th2) {
                C43059h0.m94587f(context, objM94590i);
                throw th2;
            }
        } catch (Throwable th3) {
            th = th3;
            if (th instanceof DispatchException) {
                th = ((DispatchException) th).getCause();
            }
            Result.Companion companion = Result.INSTANCE;
            continuationProbeCoroutineCreated.resumeWith(Result.m103844constructorimpl(ResultKt.createFailure(th)));
        }
    }
}
