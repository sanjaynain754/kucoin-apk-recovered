package og0;

import androidx.exifinterface.media.ExifInterface;
import kotlinx.coroutines.AbstractC41539a;
import kotlinx.coroutines.C41554c0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.CoroutineContext;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.CoroutineStackFrame;
import p852kotlin.jvm.JvmField;

/* JADX INFO: renamed from: og0.w */
/* JADX INFO: compiled from: Scopes.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0010\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u00022\u00060\u0003j\u0002`\u0004B\u001d\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\n\u0018\u00010\u000bj\u0004\u0018\u0001`\f¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0014¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0016\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0014¢\u0006\u0004\b\u0016\u0010\u0013R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0019\u0010\u001b\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u00048F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001f\u001a\u00020\u001c8DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e¨\u0006 "}, m90084d2 = {"Log0/w;", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/a;", "Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "Lkotlinx/coroutines/internal/CoroutineStackFrame;", "Lkotlin/coroutines/CoroutineContext;", "context", "Lkotlin/coroutines/Continuation;", "uCont", "<init>", "(Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/Continuation;)V", "Ljava/lang/StackTraceElement;", "Lkotlinx/coroutines/internal/StackTraceElement;", "getStackTraceElement", "()Ljava/lang/StackTraceElement;", "", "state", "", "N", "(Ljava/lang/Object;)V", "Y0", "()V", "U0", "e", "Lkotlin/coroutines/Continuation;", "getCallerFrame", "()Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "callerFrame", "", "r0", "()Z", "isScopedCoroutine", "kotlinx-coroutines-core"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
public class C43080w<T> extends AbstractC41539a<T> implements CoroutineStackFrame {

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @JvmField
    @NotNull
    public final Continuation<T> uCont;

    /* JADX WARN: Multi-variable type inference failed */
    public C43080w(@NotNull CoroutineContext coroutineContext, @NotNull Continuation<? super T> continuation) {
        super(coroutineContext, true, true);
        this.uCont = continuation;
    }

    @Override // p852kotlin.coroutines.jvm.internal.CoroutineStackFrame
    @Nullable
    public final StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // kotlinx.coroutines.JobSupport
    /* JADX INFO: renamed from: r0 */
    public final boolean mo90433r0() {
        return true;
    }

    @Override // kotlinx.coroutines.JobSupport
    /* JADX INFO: renamed from: N */
    public void mo90396N(@Nullable Object state) {
        C43060i.m94592b(IntrinsicsKt.intercepted(this.uCont), C41554c0.m90498a(state, this.uCont));
    }

    @Override // kotlinx.coroutines.AbstractC41539a
    /* JADX INFO: renamed from: U0 */
    public void mo90471U0(@Nullable Object state) {
        Continuation<T> continuation = this.uCont;
        continuation.resumeWith(C41554c0.m90498a(state, continuation));
    }

    @Override // p852kotlin.coroutines.jvm.internal.CoroutineStackFrame
    @Nullable
    public final CoroutineStackFrame getCallerFrame() {
        Continuation<T> continuation = this.uCont;
        if (continuation instanceof CoroutineStackFrame) {
            return (CoroutineStackFrame) continuation;
        }
        return null;
    }

    /* JADX INFO: renamed from: Y0 */
    public void mo91382Y0() {
    }
}
