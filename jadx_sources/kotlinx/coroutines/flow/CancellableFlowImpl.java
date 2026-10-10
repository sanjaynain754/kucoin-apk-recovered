package kotlinx.coroutines.flow;

import androidx.exifinterface.media.ExifInterface;
import kotlinx.coroutines.C41783z1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Context.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001e\u0010\n\u001a\u00020\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0096@¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, m90084d2 = {"Lkotlinx/coroutines/flow/CancellableFlowImpl;", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/flow/a;", "Lkotlinx/coroutines/flow/e;", "flow", "<init>", "(Lkotlinx/coroutines/flow/e;)V", "Lkotlinx/coroutines/flow/f;", "collector", "", "collect", "(Lkotlinx/coroutines/flow/f;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "b", "Lkotlinx/coroutines/flow/e;", "kotlinx-coroutines-core"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
public final class CancellableFlowImpl<T> implements InterfaceC41630a<T> {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC41634e<T> flow;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.CancellableFlowImpl$collect$2 */
    /* JADX INFO: compiled from: Context.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 1, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nContext.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Context.kt\nkotlinx/coroutines/flow/CancellableFlowImpl$collect$2\n+ 2 CoroutineScope.kt\nkotlinx/coroutines/CoroutineScopeKt\n*L\n1#1,288:1\n375#2:289\n*S KotlinDebug\n*F\n+ 1 Context.kt\nkotlinx/coroutines/flow/CancellableFlowImpl$collect$2\n*L\n277#1:289\n*E\n"})
    public static final class C415922<T> implements InterfaceC41635f {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ InterfaceC41635f<T> f91550b;

        /* JADX WARN: Multi-variable type inference failed */
        public C415922(InterfaceC41635f<? super T> interfaceC41635f) {
            this.f91550b = interfaceC41635f;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // kotlinx.coroutines.flow.InterfaceC41635f
        public final Object emit(T t11, Continuation<? super Unit> continuation) {
            CancellableFlowImpl$collect$2$emit$1 cancellableFlowImpl$collect$2$emit$1;
            if (continuation instanceof CancellableFlowImpl$collect$2$emit$1) {
                cancellableFlowImpl$collect$2$emit$1 = (CancellableFlowImpl$collect$2$emit$1) continuation;
                int i11 = cancellableFlowImpl$collect$2$emit$1.label;
                if ((i11 & Integer.MIN_VALUE) != 0) {
                    cancellableFlowImpl$collect$2$emit$1.label = i11 - Integer.MIN_VALUE;
                } else {
                    cancellableFlowImpl$collect$2$emit$1 = new CancellableFlowImpl$collect$2$emit$1(this, continuation);
                }
            } else {
                cancellableFlowImpl$collect$2$emit$1 = new CancellableFlowImpl$collect$2$emit$1(this, continuation);
            }
            Object obj = cancellableFlowImpl$collect$2$emit$1.result;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = cancellableFlowImpl$collect$2$emit$1.label;
            if (i12 == 0) {
                ResultKt.throwOnFailure(obj);
                C41783z1.m91406l(cancellableFlowImpl$collect$2$emit$1.getContext());
                InterfaceC41635f<T> interfaceC41635f = this.f91550b;
                cancellableFlowImpl$collect$2$emit$1.label = 1;
                if (interfaceC41635f.emit(t11, cancellableFlowImpl$collect$2$emit$1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Override // kotlinx.coroutines.flow.InterfaceC41634e
    @Nullable
    public Object collect(@NotNull InterfaceC41635f<? super T> interfaceC41635f, @NotNull Continuation<? super Unit> continuation) {
        Object objCollect = this.flow.collect(new C415922(interfaceC41635f), continuation);
        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CancellableFlowImpl(@NotNull InterfaceC41634e<? extends T> interfaceC41634e) {
        this.flow = interfaceC41634e;
    }
}
