package kotlinx.coroutines;

import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.upstream.CmcdData;
import java.util.concurrent.CancellationException;
import og0.C43058h;
import og0.C43059h0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.CoroutineContext;
import p852kotlin.jvm.JvmField;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import qg0.AbstractRunnableC43736g;

/* JADX INFO: renamed from: kotlinx.coroutines.w0 */
/* JADX INFO: compiled from: DispatchedTask.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\b \u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\u00060\u0002j\u0002`\u0003B\u0011\b\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0011\u0010\t\u001a\u0004\u0018\u00010\bH ¢\u0006\u0004\b\t\u0010\nJ!\u0010\u000f\u001a\u00020\u000e2\b\u0010\u000b\u001a\u0004\u0018\u00010\b2\u0006\u0010\r\u001a\u00020\fH\u0010¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0012\u001a\u00028\u0001\"\u0004\b\u0001\u0010\u00012\b\u0010\u0011\u001a\u0004\u0018\u00010\bH\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\u0014\u001a\u0004\u0018\u00010\f2\b\u0010\u0011\u001a\u0004\u0018\u00010\bH\u0010¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\u000e¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\fH\u0000¢\u0006\u0004\b\u0019\u0010\u001aR\u0016\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u001bR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u001c8 X \u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e¨\u0006 "}, m90084d2 = {"Lkotlinx/coroutines/w0;", ExifInterface.GPS_DIRECTION_TRUE, "Lqg0/g;", "Lkotlinx/coroutines/SchedulerTask;", "", "resumeMode", "<init>", "(I)V", "", CmcdData.Factory.STREAMING_FORMAT_HLS, "()Ljava/lang/Object;", "takenState", "", "cause", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Ljava/lang/Object;Ljava/lang/Throwable;)V", "state", "f", "(Ljava/lang/Object;)Ljava/lang/Object;", "d", "(Ljava/lang/Object;)Ljava/lang/Throwable;", "run", "()V", "exception", "g", "(Ljava/lang/Throwable;)V", "I", "Lkotlin/coroutines/Continuation;", "b", "()Lkotlin/coroutines/Continuation;", "delegate", "kotlinx-coroutines-core"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nDispatchedTask.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DispatchedTask.kt\nkotlinx/coroutines/DispatchedTask\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 CoroutineContext.kt\nkotlinx/coroutines/CoroutineContextKt\n+ 4 DispatchedTask.kt\nkotlinx/coroutines/DispatchedTaskKt\n+ 5 StackTraceRecovery.kt\nkotlinx/coroutines/internal/StackTraceRecoveryKt\n*L\n1#1,220:1\n1#2:221\n103#3,10:222\n114#3,2:236\n204#4:232\n205#4:235\n57#5,2:233\n*S KotlinDebug\n*F\n+ 1 DispatchedTask.kt\nkotlinx/coroutines/DispatchedTask\n*L\n82#1:222,10\n82#1:236,2\n95#1:232\n95#1:235\n95#1:233,2\n*E\n"})
public abstract class AbstractC41770w0<T> extends AbstractRunnableC43736g {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @JvmField
    public int resumeMode;

    @NotNull
    /* JADX INFO: renamed from: b */
    public abstract Continuation<T> mo91158b();

    @Nullable
    /* JADX INFO: renamed from: h */
    public abstract Object mo91161h();

    @Nullable
    /* JADX INFO: renamed from: d */
    public Throwable mo91159d(@Nullable Object state) {
        C41549b0 c41549b0 = state instanceof C41549b0 ? (C41549b0) state : null;
        if (c41549b0 != null) {
            return c41549b0.cause;
        }
        return null;
    }

    /* JADX INFO: renamed from: g */
    public final void m91371g(@NotNull Throwable exception) {
        C41701k0.m91111a(mo91158b().get$context(), new CoroutinesInternalError("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", exception));
    }

    public AbstractC41770w0(int i11) {
        this.resumeMode = i11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C41776x2<?> c41776x2M91062m;
        try {
            Continuation<T> continuationMo91158b = mo91158b();
            Intrinsics.checkNotNull(continuationMo91158b, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTask>");
            C43058h c43058h = (C43058h) continuationMo91158b;
            Continuation<T> continuation = c43058h.continuation;
            Object obj = c43058h.countOrElement;
            CoroutineContext context = continuation.get$context();
            Object objM94590i = C43059h0.m94590i(context, obj);
            InterfaceC41775x1 interfaceC41775x1 = null;
            if (objM94590i != C43059h0.f95245a) {
                c41776x2M91062m = C41687h0.m91062m(continuation, context, objM94590i);
            } else {
                c41776x2M91062m = null;
            }
            try {
                CoroutineContext context2 = continuation.get$context();
                Object objMo91161h = mo91161h();
                Throwable thMo91159d = mo91159d(objMo91161h);
                if (thMo91159d == null && C41774x0.m91373b(this.resumeMode)) {
                    interfaceC41775x1 = (InterfaceC41775x1) context2.get(InterfaceC41775x1.INSTANCE);
                }
                if (interfaceC41775x1 != null && !interfaceC41775x1.isActive()) {
                    CancellationException cancellationExceptionMo90442x = interfaceC41775x1.mo90442x();
                    mo91157a(objMo91161h, cancellationExceptionMo90442x);
                    Result.Companion companion = Result.INSTANCE;
                    continuation.resumeWith(Result.m103844constructorimpl(ResultKt.createFailure(cancellationExceptionMo90442x)));
                } else if (thMo91159d != null) {
                    Result.Companion companion2 = Result.INSTANCE;
                    continuation.resumeWith(Result.m103844constructorimpl(ResultKt.createFailure(thMo91159d)));
                } else {
                    Result.Companion companion3 = Result.INSTANCE;
                    continuation.resumeWith(Result.m103844constructorimpl(mo91160f(objMo91161h)));
                }
                Unit unit = Unit.INSTANCE;
            } finally {
                if (c41776x2M91062m == null || c41776x2M91062m.m91383Z0()) {
                    C43059h0.m94587f(context, objM94590i);
                }
            }
        } catch (DispatchException e11) {
            C41701k0.m91111a(mo91158b().get$context(), e11.getCause());
        } catch (Throwable th2) {
            m91371g(th2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: f */
    public <T> T mo91160f(@Nullable Object state) {
        return state;
    }

    /* JADX INFO: renamed from: a */
    public void mo91157a(@Nullable Object takenState, @NotNull Throwable cause) {
    }
}
