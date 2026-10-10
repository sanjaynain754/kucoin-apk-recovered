package kotlinx.coroutines;

import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.upstream.CmcdData;
import og0.C43059h0;
import og0.C43080w;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.ContinuationInterceptor;
import p852kotlin.coroutines.CoroutineContext;
import p852kotlin.coroutines.EmptyCoroutineContext;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugProbesKt;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import pg0.C43465a;
import pg0.C43466b;

/* JADX INFO: renamed from: kotlinx.coroutines.j */
/* JADX INFO: compiled from: Builders.common.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aN\u0010\f\u001a\u00020\u000b*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032'\u0010\n\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0005¢\u0006\u0002\b\t¢\u0006\u0004\b\f\u0010\r\u001aZ\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f\"\u0004\b\u0000\u0010\u000e*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032'\u0010\n\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0005¢\u0006\u0002\b\t¢\u0006\u0004\b\u0010\u0010\u0011\u001aT\u0010\u0012\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u000e2\u0006\u0010\u0002\u001a\u00020\u00012'\u0010\n\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0005¢\u0006\u0002\b\tH\u0086@\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m90084d2 = {"Lkotlinx/coroutines/m0;", "Lkotlin/coroutines/CoroutineContext;", "context", "Lkotlinx/coroutines/CoroutineStart;", "start", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "", "Lkotlin/ExtensionFunctionType;", "block", "Lkotlinx/coroutines/x1;", "c", "(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/x1;", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/r0;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/r0;", "e", "(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m90085k = 5, m90086mv = {2, 1, 0}, m90088xi = 48, m90089xs = "kotlinx/coroutines/BuildersKt")
@SourceDebugExtension({"SMAP\nBuilders.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Builders.common.kt\nkotlinx/coroutines/BuildersKt__Builders_commonKt\n+ 2 CoroutineContext.kt\nkotlinx/coroutines/CoroutineContextKt\n*L\n1#1,268:1\n91#2,5:269\n*S KotlinDebug\n*F\n+ 1 Builders.common.kt\nkotlinx/coroutines/BuildersKt__Builders_commonKt\n*L\n164#1:269,5\n*E\n"})
public final /* synthetic */ class C41696j {
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ InterfaceC41729r0 m91102b(InterfaceC41709m0 interfaceC41709m0, CoroutineContext coroutineContext, CoroutineStart coroutineStart, Function2 function2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            coroutineContext = EmptyCoroutineContext.INSTANCE;
        }
        if ((i11 & 2) != 0) {
            coroutineStart = CoroutineStart.DEFAULT;
        }
        return C41686h.m91043a(interfaceC41709m0, coroutineContext, coroutineStart, function2);
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ InterfaceC41775x1 m91104d(InterfaceC41709m0 interfaceC41709m0, CoroutineContext coroutineContext, CoroutineStart coroutineStart, Function2 function2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            coroutineContext = EmptyCoroutineContext.INSTANCE;
        }
        if ((i11 & 2) != 0) {
            coroutineStart = CoroutineStart.DEFAULT;
        }
        return C41686h.m91045c(interfaceC41709m0, coroutineContext, coroutineStart, function2);
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public static final <T> InterfaceC41729r0<T> m91101a(@NotNull InterfaceC41709m0 interfaceC41709m0, @NotNull CoroutineContext coroutineContext, @NotNull CoroutineStart coroutineStart, @NotNull Function2<? super InterfaceC41709m0, ? super Continuation<? super T>, ? extends Object> function2) {
        C41740s0 c41740s0;
        CoroutineContext coroutineContextM91060k = C41687h0.m91060k(interfaceC41709m0, coroutineContext);
        if (coroutineStart.isLazy()) {
            c41740s0 = new C41556c2(coroutineContextM91060k, function2);
        } else {
            c41740s0 = new C41740s0(coroutineContextM91060k, true);
        }
        ((AbstractC41539a) c41740s0).m90474X0(coroutineStart, c41740s0, function2);
        return (InterfaceC41729r0<T>) c41740s0;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public static final InterfaceC41775x1 m91103c(@NotNull InterfaceC41709m0 interfaceC41709m0, @NotNull CoroutineContext coroutineContext, @NotNull CoroutineStart coroutineStart, @NotNull Function2<? super InterfaceC41709m0, ? super Continuation<? super Unit>, ? extends Object> function2) {
        AbstractC41539a c41715n2;
        CoroutineContext coroutineContextM91060k = C41687h0.m91060k(interfaceC41709m0, coroutineContext);
        if (coroutineStart.isLazy()) {
            c41715n2 = new C41582d2(coroutineContextM91060k, function2);
        } else {
            c41715n2 = new C41715n2(coroutineContextM91060k, true);
        }
        c41715n2.m90474X0(coroutineStart, c41715n2, function2);
        return c41715n2;
    }

    @Nullable
    /* JADX INFO: renamed from: e */
    public static final <T> Object m91105e(@NotNull CoroutineContext coroutineContext, @NotNull Function2<? super InterfaceC41709m0, ? super Continuation<? super T>, ? extends Object> function2, @NotNull Continuation<? super T> continuation) {
        Object objM91367Z0;
        CoroutineContext context = continuation.get$context();
        CoroutineContext coroutineContextM91059j = C41687h0.m91059j(context, coroutineContext);
        C41783z1.m91406l(coroutineContextM91059j);
        if (coroutineContextM91059j == context) {
            C43080w c43080w = new C43080w(coroutineContextM91059j, continuation);
            objM91367Z0 = C43466b.m95683d(c43080w, c43080w, function2);
        } else {
            ContinuationInterceptor.Companion key = ContinuationInterceptor.INSTANCE;
            if (Intrinsics.areEqual(coroutineContextM91059j.get(key), context.get(key))) {
                C41776x2 c41776x2 = new C41776x2(coroutineContextM91059j, continuation);
                CoroutineContext context2 = c41776x2.get$context();
                Object objM94590i = C43059h0.m94590i(context2, null);
                try {
                    Object objM95683d = C43466b.m95683d(c41776x2, c41776x2, function2);
                    C43059h0.m94587f(context2, objM94590i);
                    objM91367Z0 = objM95683d;
                } catch (Throwable th2) {
                    C43059h0.m94587f(context2, objM94590i);
                    throw th2;
                }
            } else {
                C41766v0 c41766v0 = new C41766v0(coroutineContextM91059j, continuation);
                C43465a.m95679c(function2, c41766v0, c41766v0);
                objM91367Z0 = c41766v0.m91367Z0();
            }
        }
        if (objM91367Z0 == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return objM91367Z0;
    }
}
