package kotlinx.coroutines;

import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.upstream.CmcdData;
import og0.C43058h;
import og0.C43060i;
import og0.C43064k;
import og0.C43066l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Deprecated;
import p852kotlin.DeprecationLevel;
import p852kotlin.ExperimentalStdlibApi;
import p852kotlin.Metadata;
import p852kotlin.ReplaceWith;
import p852kotlin.coroutines.AbstractCoroutineContextElement;
import p852kotlin.coroutines.AbstractCoroutineContextKey;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.ContinuationInterceptor;
import p852kotlin.coroutines.CoroutineContext;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: kotlinx.coroutines.j0 */
/* JADX INFO: compiled from: CoroutineDispatcher.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\b&\u0018\u0000 $2\u00020\u00012\u00020\u0002:\u0001%B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ#\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\nH\u0017¢\u0006\u0004\b\u000e\u0010\u0010J#\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0006\u001a\u00020\u00052\n\u0010\u0013\u001a\u00060\u0011j\u0002`\u0012H&¢\u0006\u0004\b\u0015\u0010\u0016J#\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0006\u001a\u00020\u00052\n\u0010\u0013\u001a\u00060\u0011j\u0002`\u0012H\u0017¢\u0006\u0004\b\u0017\u0010\u0016J'\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0019\"\u0004\b\u0000\u0010\u00182\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u0019\u0010\u001d\u001a\u00020\u00142\n\u0010\u001a\u001a\u0006\u0012\u0002\b\u00030\u0019¢\u0006\u0004\b\u001d\u0010\u001eJ\u0018\u0010 \u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u0000H\u0087\u0002¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\fH\u0016¢\u0006\u0004\b\"\u0010#¨\u0006&"}, m90084d2 = {"Lkotlinx/coroutines/j0;", "Lkotlin/coroutines/AbstractCoroutineContextElement;", "Lkotlin/coroutines/ContinuationInterceptor;", "<init>", "()V", "Lkotlin/coroutines/CoroutineContext;", "context", "", "isDispatchNeeded", "(Lkotlin/coroutines/CoroutineContext;)Z", "", "parallelism", "", "name", "limitedParallelism", "(ILjava/lang/String;)Lkotlinx/coroutines/j0;", "(I)Lkotlinx/coroutines/j0;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "", "dispatch", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Runnable;)V", "dispatchYield", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlin/coroutines/Continuation;", "continuation", "interceptContinuation", "(Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;", "releaseInterceptedContinuation", "(Lkotlin/coroutines/Continuation;)V", "other", "plus", "(Lkotlinx/coroutines/j0;)Lkotlinx/coroutines/j0;", "toString", "()Ljava/lang/String;", "Key", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "kotlinx-coroutines-core"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
public abstract class AbstractC41697j0 extends AbstractCoroutineContextElement implements ContinuationInterceptor {

    /* JADX INFO: renamed from: Key, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: kotlinx.coroutines.j0$a, reason: from kotlin metadata */
    /* JADX INFO: compiled from: CoroutineDispatcher.kt */
    @Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m90084d2 = {"Lkotlinx/coroutines/j0$a;", "Lkotlin/coroutines/AbstractCoroutineContextKey;", "Lkotlin/coroutines/ContinuationInterceptor;", "Lkotlinx/coroutines/j0;", "<init>", "()V", "kotlinx-coroutines-core"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
    @ExperimentalStdlibApi
    public static final class Companion extends AbstractCoroutineContextKey<ContinuationInterceptor, AbstractC41697j0> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
            super(ContinuationInterceptor.INSTANCE, new Function1() { // from class: kotlinx.coroutines.i0
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return AbstractC41697j0.Companion.m91107b((CoroutineContext.Element) obj);
                }
            });
        }

        /* JADX INFO: renamed from: b */
        public static final AbstractC41697j0 m91107b(CoroutineContext.Element element) {
            if (element instanceof AbstractC41697j0) {
                return (AbstractC41697j0) element;
            }
            return null;
        }
    }

    public abstract void dispatch(@NotNull CoroutineContext context, @NotNull Runnable block);

    public boolean isDispatchNeeded(@NotNull CoroutineContext context) {
        return true;
    }

    @NotNull
    public AbstractC41697j0 limitedParallelism(int parallelism, @Nullable String name) {
        C43066l.m94607a(parallelism);
        return new C43064k(this, parallelism, name);
    }

    public AbstractC41697j0() {
        super(ContinuationInterceptor.INSTANCE);
    }

    public static /* synthetic */ AbstractC41697j0 limitedParallelism$default(AbstractC41697j0 abstractC41697j0, int i11, String str, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: limitedParallelism");
        }
        if ((i12 & 2) != 0) {
            str = null;
        }
        return abstractC41697j0.limitedParallelism(i11, str);
    }

    @Override // p852kotlin.coroutines.ContinuationInterceptor
    @NotNull
    public final <T> Continuation<T> interceptContinuation(@NotNull Continuation<? super T> continuation) {
        return new C43058h(this, continuation);
    }

    @NotNull
    public String toString() {
        return C41717o0.m91174a(this) + '@' + C41717o0.m91175b(this);
    }

    public void dispatchYield(@NotNull CoroutineContext context, @NotNull Runnable block) {
        C43060i.m94593c(this, context, block);
    }

    @Override // p852kotlin.coroutines.AbstractCoroutineContextElement, kotlin.coroutines.CoroutineContext.Element, p852kotlin.coroutines.CoroutineContext
    @Nullable
    public <E extends CoroutineContext.Element> E get(@NotNull CoroutineContext.Key<E> key) {
        return (E) ContinuationInterceptor.DefaultImpls.get(this, key);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Deprecated for good. Override 'limitedParallelism(parallelism: Int, name: String?)' instead", replaceWith = @ReplaceWith(expression = "limitedParallelism(parallelism, null)", imports = {}))
    public /* synthetic */ AbstractC41697j0 limitedParallelism(int parallelism) {
        return limitedParallelism(parallelism, null);
    }

    @Override // p852kotlin.coroutines.AbstractCoroutineContextElement, kotlin.coroutines.CoroutineContext.Element, p852kotlin.coroutines.CoroutineContext
    @NotNull
    public CoroutineContext minusKey(@NotNull CoroutineContext.Key<?> key) {
        return ContinuationInterceptor.DefaultImpls.minusKey(this, key);
    }

    @Override // p852kotlin.coroutines.ContinuationInterceptor
    public final void releaseInterceptedContinuation(@NotNull Continuation<?> continuation) {
        Intrinsics.checkNotNull(continuation, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        ((C43058h) continuation).m94580p();
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "Operator '+' on two CoroutineDispatcher objects is meaningless. CoroutineDispatcher is a coroutine context element and `+` is a set-sum operator for coroutine contexts. The dispatcher to the right of `+` just replaces the dispatcher to the left.")
    @NotNull
    public final AbstractC41697j0 plus(@NotNull AbstractC41697j0 other) {
        return other;
    }
}
