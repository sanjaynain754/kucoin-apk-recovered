package kotlinx.coroutines;

import androidx.exifinterface.media.ExifInterface;
import com.tencent.rmonitor.custom.ICustomDataEditor;
import og0.C43059h0;
import og0.C43080w;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.TuplesKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.ContinuationInterceptor;
import p852kotlin.coroutines.CoroutineContext;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: kotlinx.coroutines.x2 */
/* JADX INFO: compiled from: CoroutineContext.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0014\u001a\u00020\u000b2\b\u0010\u0013\u001a\u0004\u0018\u00010\tH\u0014¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0016\u0010\u0012R(\u0010\u001b\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00180\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001c\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, m90084d2 = {"Lkotlinx/coroutines/x2;", ExifInterface.GPS_DIRECTION_TRUE, "Log0/w;", "Lkotlin/coroutines/CoroutineContext;", "context", "Lkotlin/coroutines/Continuation;", "uCont", "<init>", "(Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/Continuation;)V", "", "oldValue", "", "b1", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Object;)V", "", "Z0", "()Z", "Y0", "()V", "state", "U0", "(Ljava/lang/Object;)V", ICustomDataEditor.STRING_ARRAY_PARAM_1, "Ljava/lang/ThreadLocal;", "Lkotlin/Pair;", "f", "Ljava/lang/ThreadLocal;", "threadStateToRecover", "threadLocalIsSet", "Z", "kotlinx-coroutines-core"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nCoroutineContext.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineContext.kt\nkotlinx/coroutines/UndispatchedCoroutine\n+ 2 CoroutineContext.kt\nkotlinx/coroutines/CoroutineContextKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,319:1\n103#2,13:320\n1#3:333\n*S KotlinDebug\n*F\n+ 1 CoroutineContext.kt\nkotlinx/coroutines/UndispatchedCoroutine\n*L\n265#1:320,13\n*E\n"})
public final class C41776x2<T> extends C43080w<T> {

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public final ThreadLocal<Pair<CoroutineContext, Object>> threadStateToRecover;
    private volatile boolean threadLocalIsSet;

    /* JADX INFO: renamed from: b1 */
    public final void m91385b1(@NotNull CoroutineContext context, @Nullable Object oldValue) {
        this.threadLocalIsSet = true;
        this.threadStateToRecover.set(TuplesKt.m90091to(context, oldValue));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C41776x2(@NotNull CoroutineContext coroutineContext, @NotNull Continuation<? super T> continuation) {
        C41780y2 c41780y2 = C41780y2.f91883b;
        super(coroutineContext.get(c41780y2) == null ? coroutineContext.plus(c41780y2) : coroutineContext, continuation);
        this.threadStateToRecover = new ThreadLocal<>();
        if (continuation.getContext().get(ContinuationInterceptor.INSTANCE) instanceof AbstractC41697j0) {
            return;
        }
        Object objM94590i = C43059h0.m94590i(coroutineContext, null);
        C43059h0.m94587f(coroutineContext, objM94590i);
        m91385b1(coroutineContext, objM94590i);
    }

    /* JADX INFO: renamed from: Z0 */
    public final boolean m91383Z0() {
        boolean z11 = this.threadLocalIsSet && this.threadStateToRecover.get() == null;
        this.threadStateToRecover.remove();
        return !z11;
    }

    /* JADX INFO: renamed from: a1 */
    public final void m91384a1() {
        if (this.threadLocalIsSet) {
            Pair<CoroutineContext, Object> pair = this.threadStateToRecover.get();
            if (pair != null) {
                C43059h0.m94587f(pair.component1(), pair.component2());
            }
            this.threadStateToRecover.remove();
        }
    }

    @Override // og0.C43080w, kotlinx.coroutines.AbstractC41539a
    /* JADX INFO: renamed from: U0 */
    public void mo90471U0(@Nullable Object state) {
        m91384a1();
        Object objM90498a = C41554c0.m90498a(state, this.uCont);
        Continuation<T> continuation = this.uCont;
        CoroutineContext coroutineContext = continuation.getContext();
        C41776x2<?> c41776x2M91062m = null;
        Object objM94590i = C43059h0.m94590i(coroutineContext, null);
        if (objM94590i != C43059h0.f95245a) {
            c41776x2M91062m = C41687h0.m91062m(continuation, coroutineContext, objM94590i);
        }
        try {
            this.uCont.resumeWith(objM90498a);
            Unit unit = Unit.INSTANCE;
        } finally {
            if (c41776x2M91062m == null || c41776x2M91062m.m91383Z0()) {
                C43059h0.m94587f(coroutineContext, objM94590i);
            }
        }
    }

    @Override // og0.C43080w
    /* JADX INFO: renamed from: Y0 */
    public void mo91382Y0() {
        m91384a1();
    }
}
