package og0;

import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.AbstractC41589f1;
import kotlinx.coroutines.AbstractC41697j0;
import kotlinx.coroutines.C41554c0;
import kotlinx.coroutines.C41687h0;
import kotlinx.coroutines.C41760t2;
import kotlinx.coroutines.C41776x2;
import kotlinx.coroutines.DispatchException;
import kotlinx.coroutines.InterfaceC41775x1;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.CoroutineContext;
import p852kotlin.jvm.JvmField;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: og0.i */
/* JADX INFO: compiled from: DispatchedContinuation.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a'\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\n\u0010\u0005\u001a\u00060\u0003j\u0002`\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u001b\u0010\n\u001a\u00020\t*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a-\u0010\u0010\u001a\u00020\u0006\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u00028\u00000\r2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eH\u0007¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0019\u0010\u0013\u001a\u00020\t*\b\u0012\u0004\u0012\u00020\u00060\u0012H\u0000¢\u0006\u0004\b\u0013\u0010\u0014\"\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017\"\u0014\u0010\u0019\u001a\u00020\u00158\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0017¨\u0006\u001a"}, m90084d2 = {"Lkotlinx/coroutines/j0;", "Lkotlin/coroutines/CoroutineContext;", "context", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "runnable", "", "c", "(Lkotlinx/coroutines/j0;Lkotlin/coroutines/CoroutineContext;Ljava/lang/Runnable;)V", "", "d", "(Lkotlinx/coroutines/j0;Lkotlin/coroutines/CoroutineContext;)Z", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlin/coroutines/Continuation;", "Lkotlin/Result;", DbParams.KEY_CHANNEL_RESULT, "b", "(Lkotlin/coroutines/Continuation;Ljava/lang/Object;)V", "Log0/h;", "e", "(Log0/h;)Z", "Log0/a0;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Log0/a0;", "UNDEFINED", "REUSABLE_CLAIMED", "kotlinx-coroutines-core"}, m90085k = 2, m90086mv = {2, 1, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nDispatchedContinuation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DispatchedContinuation.kt\nkotlinx/coroutines/internal/DispatchedContinuationKt\n+ 2 DispatchedContinuation.kt\nkotlinx/coroutines/internal/DispatchedContinuation\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 DispatchedTask.kt\nkotlinx/coroutines/DispatchedTaskKt\n+ 5 CoroutineContext.kt\nkotlinx/coroutines/CoroutineContextKt\n*L\n1#1,313:1\n293#1,5:321\n298#1,12:327\n310#1:395\n297#1:397\n298#1,12:399\n310#1:428\n207#2,7:314\n214#2,23:342\n237#2,2:375\n239#2:379\n217#2:380\n219#2:396\n1#3:326\n1#3:398\n1#3:429\n184#4,3:339\n187#4,14:381\n184#4,17:411\n184#4,17:430\n103#5,10:365\n114#5,2:377\n*S KotlinDebug\n*F\n+ 1 DispatchedContinuation.kt\nkotlinx/coroutines/internal/DispatchedContinuationKt\n*L\n278#1:321,5\n278#1:327,12\n278#1:395\n283#1:397\n283#1:399,12\n283#1:428\n278#1:314,7\n278#1:342,23\n278#1:375,2\n278#1:379\n278#1:380\n278#1:396\n278#1:326\n283#1:398\n278#1:339,3\n278#1:381,14\n283#1:411,17\n309#1:430,17\n278#1:365,10\n278#1:377,2\n*E\n"})
public final class C43060i {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C43045a0 f95249a = new C43045a0("UNDEFINED");

    /* JADX INFO: renamed from: b */
    @JvmField
    @NotNull
    public static final C43045a0 f95250b = new C43045a0("REUSABLE_CLAIMED");

    /* JADX INFO: renamed from: b */
    public static final <T> void m94592b(@NotNull Continuation<? super T> continuation, @NotNull Object obj) {
        if (!(continuation instanceof C43058h)) {
            continuation.resumeWith(obj);
            return;
        }
        C43058h c43058h = (C43058h) continuation;
        Object objM90499b = C41554c0.m90499b(obj);
        if (m94594d(c43058h.dispatcher, c43058h.get$context())) {
            c43058h._state = objM90499b;
            c43058h.resumeMode = 1;
            m94593c(c43058h.dispatcher, c43058h.get$context(), c43058h);
            return;
        }
        AbstractC41589f1 abstractC41589f1M91356b = C41760t2.f91865a.m91356b();
        if (abstractC41589f1M91356b.m90734R()) {
            c43058h._state = objM90499b;
            c43058h.resumeMode = 1;
            abstractC41589f1M91356b.m90731M(c43058h);
            return;
        }
        abstractC41589f1M91356b.m90733P(true);
        try {
            InterfaceC41775x1 interfaceC41775x1 = (InterfaceC41775x1) c43058h.get$context().get(InterfaceC41775x1.INSTANCE);
            if (interfaceC41775x1 == null || interfaceC41775x1.isActive()) {
                Continuation<T> continuation2 = c43058h.continuation;
                Object obj2 = c43058h.countOrElement;
                CoroutineContext context = continuation2.get$context();
                Object objM94590i = C43059h0.m94590i(context, obj2);
                C41776x2<?> c41776x2M91062m = objM94590i != C43059h0.f95245a ? C41687h0.m91062m(continuation2, context, objM94590i) : null;
                try {
                    c43058h.continuation.resumeWith(obj);
                    Unit unit = Unit.INSTANCE;
                    if (c41776x2M91062m == null || c41776x2M91062m.m91383Z0()) {
                        C43059h0.m94587f(context, objM94590i);
                    }
                } catch (Throwable th2) {
                    if (c41776x2M91062m == null || c41776x2M91062m.m91383Z0()) {
                        C43059h0.m94587f(context, objM94590i);
                    }
                    throw th2;
                }
            } else {
                CancellationException cancellationExceptionMo90442x = interfaceC41775x1.mo90442x();
                c43058h.mo91157a(objM90499b, cancellationExceptionMo90442x);
                Result.Companion companion = Result.INSTANCE;
                c43058h.resumeWith(Result.m103844constructorimpl(ResultKt.createFailure(cancellationExceptionMo90442x)));
            }
            while (abstractC41589f1M91356b.m90737U()) {
            }
        } catch (Throwable th3) {
            try {
                c43058h.m91371g(th3);
            } finally {
                abstractC41589f1M91356b.m90739p(true);
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public static final boolean m94595e(@NotNull C43058h<? super Unit> c43058h) {
        Unit unit = Unit.INSTANCE;
        AbstractC41589f1 abstractC41589f1M91356b = C41760t2.f91865a.m91356b();
        if (abstractC41589f1M91356b.m90735S()) {
            return false;
        }
        if (abstractC41589f1M91356b.m90734R()) {
            c43058h._state = unit;
            c43058h.resumeMode = 1;
            abstractC41589f1M91356b.m90731M(c43058h);
            return true;
        }
        abstractC41589f1M91356b.m90733P(true);
        try {
            c43058h.run();
            do {
            } while (abstractC41589f1M91356b.m90737U());
        } catch (Throwable th2) {
            try {
                c43058h.m91371g(th2);
            } finally {
                abstractC41589f1M91356b.m90739p(true);
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: c */
    public static final void m94593c(@NotNull AbstractC41697j0 abstractC41697j0, @NotNull CoroutineContext coroutineContext, @NotNull Runnable runnable) {
        try {
            abstractC41697j0.dispatch(coroutineContext, runnable);
        } catch (Throwable th2) {
            throw new DispatchException(th2, abstractC41697j0, coroutineContext);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final boolean m94594d(@NotNull AbstractC41697j0 abstractC41697j0, @NotNull CoroutineContext coroutineContext) throws DispatchException {
        try {
            return abstractC41697j0.isDispatchNeeded(coroutineContext);
        } catch (Throwable th2) {
            throw new DispatchException(th2, abstractC41697j0, coroutineContext);
        }
    }
}
