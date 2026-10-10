package kotlinx.coroutines.flow;

import androidx.exifinterface.media.ExifInterface;
import kotlinx.coroutines.flow.internal.SafeCollector;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: Flow.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001e\u0010\t\u001a\u00020\b2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H\u0086@¢\u0006\u0004\b\t\u0010\nJ\u001e\u0010\u000b\u001a\u00020\b2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H¦@¢\u0006\u0004\b\u000b\u0010\n¨\u0006\f"}, m90084d2 = {"Lkotlinx/coroutines/flow/AbstractFlow;", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/flow/e;", "Lkotlinx/coroutines/flow/a;", "<init>", "()V", "Lkotlinx/coroutines/flow/f;", "collector", "", "collect", "(Lkotlinx/coroutines/flow/f;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "f", "kotlinx-coroutines-core"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
public abstract class AbstractFlow<T> implements InterfaceC41634e<T>, InterfaceC41630a<T> {

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.AbstractFlow$collect$1 */
    /* JADX INFO: compiled from: Flow.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 1, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "kotlinx.coroutines.flow.AbstractFlow", m90122f = "Flow.kt", m90123i = {0}, m90124l = {226}, m90125m = "collect", m90126n = {"safeCollector"}, m90127s = {"L$0"})
    public static final class C415911 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ AbstractFlow<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C415911(AbstractFlow<T> abstractFlow, Continuation<? super C415911> continuation) {
            super(continuation);
            this.this$0 = abstractFlow;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.collect(null, this);
        }
    }

    @Nullable
    /* JADX INFO: renamed from: f */
    public abstract Object mo90740f(@NotNull InterfaceC41635f<? super T> interfaceC41635f, @NotNull Continuation<? super Unit> continuation);

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // kotlinx.coroutines.flow.InterfaceC41634e
    @Nullable
    public final Object collect(@NotNull InterfaceC41635f<? super T> interfaceC41635f, @NotNull Continuation<? super Unit> continuation) throws Throwable {
        C415911 c415911;
        Throwable th2;
        SafeCollector safeCollector;
        if (continuation instanceof C415911) {
            c415911 = (C415911) continuation;
            int i11 = c415911.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c415911.label = i11 - Integer.MIN_VALUE;
            } else {
                c415911 = new C415911(this, continuation);
            }
        } else {
            c415911 = new C415911(this, continuation);
        }
        Object obj = c415911.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c415911.label;
        if (i12 != 0) {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            safeCollector = (SafeCollector) c415911.L$0;
            try {
                ResultKt.throwOnFailure(obj);
                safeCollector.releaseIntercepted();
                return Unit.INSTANCE;
            } catch (Throwable th3) {
                th2 = th3;
                safeCollector.releaseIntercepted();
                throw th2;
            }
        }
        ResultKt.throwOnFailure(obj);
        SafeCollector safeCollector2 = new SafeCollector(interfaceC41635f, c415911.getContext());
        try {
            c415911.L$0 = safeCollector2;
            c415911.label = 1;
            if (mo90740f(safeCollector2, c415911) == coroutine_suspended) {
                return coroutine_suspended;
            }
            safeCollector = safeCollector2;
            safeCollector.releaseIntercepted();
            return Unit.INSTANCE;
        } catch (Throwable th4) {
            th2 = th4;
            safeCollector = safeCollector2;
            safeCollector.releaseIntercepted();
            throw th2;
        }
    }
}
