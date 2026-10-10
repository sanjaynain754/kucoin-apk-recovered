package kotlinx.coroutines;

import androidx.exifinterface.media.ExifInterface;
import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.CoroutineContext;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: kotlinx.coroutines.a */
/* JADX INFO: compiled from: AbstractCoroutine.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b'\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\u00020\u00022\u00020\u00032\b\u0012\u0004\u0012\u00028\u00000\u00042\u00020\u0005B\u001f\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\bH\u0014¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u001b\u001a\u00020\u000e2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0004¢\u0006\u0004\b\u001b\u0010\u0010J\u001b\u0010\u001e\u001a\u00020\u000e2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u001c¢\u0006\u0004\b\u001e\u0010\u0010J\u0019\u0010\u001f\u001a\u00020\u000e2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0014¢\u0006\u0004\b\u001f\u0010\u0010J\u0017\u0010!\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020\u0011H\u0000¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u0016H\u0010¢\u0006\u0004\b#\u0010\u0018JL\u0010+\u001a\u00020\u000e\"\u0004\b\u0001\u0010$2\u0006\u0010&\u001a\u00020%2\u0006\u0010'\u001a\u00028\u00012'\u0010*\u001a#\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00190(¢\u0006\u0002\b)¢\u0006\u0004\b+\u0010,R\u001d\u00103\u001a\u00020\u00068\u0006¢\u0006\u0012\n\u0004\b-\u0010.\u0012\u0004\b1\u00102\u001a\u0004\b/\u00100R\u0014\u00105\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b4\u00100R\u0014\u00106\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b6\u00107¨\u00068"}, m90084d2 = {"Lkotlinx/coroutines/a;", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/JobSupport;", "Lkotlinx/coroutines/x1;", "Lkotlin/coroutines/Continuation;", "Lkotlinx/coroutines/m0;", "Lkotlin/coroutines/CoroutineContext;", "parentContext", "", "initParentJob", "active", "<init>", "(Lkotlin/coroutines/CoroutineContext;ZZ)V", "value", "", "W0", "(Ljava/lang/Object;)V", "", "cause", "handled", "V0", "(Ljava/lang/Throwable;Z)V", "", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "()Ljava/lang/String;", "", "state", "E0", "Lkotlin/Result;", DbParams.KEY_CHANNEL_RESULT, "resumeWith", "U0", "exception", "o0", "(Ljava/lang/Throwable;)V", "x0", "R", "Lkotlinx/coroutines/CoroutineStart;", "start", "receiver", "Lkotlin/Function2;", "Lkotlin/ExtensionFunctionType;", "block", "X0", "(Lkotlinx/coroutines/CoroutineStart;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V", "d", "Lkotlin/coroutines/CoroutineContext;", "getContext", "()Lkotlin/coroutines/CoroutineContext;", "getContext$annotations", "()V", "context", "getCoroutineContext", "coroutineContext", "isActive", "()Z", "kotlinx-coroutines-core"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
public abstract class AbstractC41539a<T> extends JobSupport implements InterfaceC41775x1, Continuation<T>, InterfaceC41709m0 {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final CoroutineContext context;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.coroutines.JobSupport
    /* JADX INFO: renamed from: E0 */
    public final void mo90386E0(@Nullable Object state) {
        if (!(state instanceof C41549b0)) {
            mo90473W0(state);
        } else {
            C41549b0 c41549b0 = (C41549b0) state;
            mo90472V0(c41549b0.cause, c41549b0.m90486a());
        }
    }

    @Override // kotlinx.coroutines.JobSupport
    @NotNull
    /* JADX INFO: renamed from: V */
    public String mo90410V() {
        return C41717o0.m91174a(this) + " was cancelled";
    }

    @Override // p852kotlin.coroutines.Continuation
    @NotNull
    public final CoroutineContext getContext() {
        return this.context;
    }

    @Override // kotlinx.coroutines.InterfaceC41709m0
    @NotNull
    public CoroutineContext getCoroutineContext() {
        return this.context;
    }

    @Override // kotlinx.coroutines.JobSupport
    /* JADX INFO: renamed from: o0 */
    public final void mo90430o0(@NotNull Throwable exception) {
        C41701k0.m91111a(this.context, exception);
    }

    @Override // kotlinx.coroutines.JobSupport
    @NotNull
    /* JADX INFO: renamed from: x0 */
    public String mo90443x0() {
        String strM91056g = C41687h0.m91056g(this.context);
        if (strM91056g == null) {
            return super.mo90443x0();
        }
        return '\"' + strM91056g + "\":" + super.mo90443x0();
    }

    public AbstractC41539a(@NotNull CoroutineContext coroutineContext, boolean z11, boolean z12) {
        super(z12);
        if (z11) {
            m90431p0((InterfaceC41775x1) coroutineContext.get(InterfaceC41775x1.INSTANCE));
        }
        this.context = coroutineContext.plus(this);
    }

    /* JADX INFO: renamed from: U0 */
    public void mo90471U0(@Nullable Object state) {
        mo90396N(state);
    }

    /* JADX INFO: renamed from: X0 */
    public final <R> void m90474X0(@NotNull CoroutineStart start, R receiver, @NotNull Function2<? super R, ? super Continuation<? super T>, ? extends Object> block) {
        start.invoke(block, receiver, this);
    }

    @Override // kotlinx.coroutines.JobSupport, kotlinx.coroutines.InterfaceC41775x1
    public boolean isActive() {
        return super.isActive();
    }

    @Override // p852kotlin.coroutines.Continuation
    public final void resumeWith(@NotNull Object result) {
        Object objM90441w0 = m90441w0(C41554c0.m90499b(result));
        if (objM90441w0 == C41551b2.f91462b) {
            return;
        }
        mo90471U0(objM90441w0);
    }

    /* JADX INFO: renamed from: W0 */
    public void mo90473W0(T value) {
    }

    /* JADX INFO: renamed from: V0 */
    public void mo90472V0(@NotNull Throwable cause, boolean handled) {
    }
}
