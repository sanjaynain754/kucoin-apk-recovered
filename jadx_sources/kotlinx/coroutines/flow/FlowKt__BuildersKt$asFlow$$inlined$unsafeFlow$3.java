package kotlinx.coroutines.flow;

import java.util.Iterator;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: compiled from: SafeCollector.common.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m90084d2 = {"kotlinx/coroutines/flow/FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$3", "Lkotlinx/coroutines/flow/e;", "Lkotlinx/coroutines/flow/f;", "collector", "", "collect", "(Lkotlinx/coroutines/flow/f;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Builders.kt\nkotlinx/coroutines/flow/FlowKt__BuildersKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,108:1\n86#2:109\n87#2,2:111\n89#2:114\n1863#3:110\n1864#3:113\n*S KotlinDebug\n*F\n+ 1 Builders.kt\nkotlinx/coroutines/flow/FlowKt__BuildersKt\n*L\n86#1:110\n86#1:113\n*E\n"})
public final class FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$3<T> implements InterfaceC41634e<T> {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Iterable f91558b;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$3$1 */
    @Metadata(m90085k = 3, m90086mv = {2, 1, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$3", m90122f = "Builders.kt", m90123i = {0}, m90124l = {111}, m90125m = "collect", m90126n = {"$this$asFlow_u24lambda_u243"}, m90127s = {"L$0"})
    public static final class C415951 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C415951(Continuation continuation) {
            super(continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$3.this.collect(null, this);
        }
    }

    public FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$3(Iterable iterable) {
        this.f91558b = iterable;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // kotlinx.coroutines.flow.InterfaceC41634e
    public Object collect(InterfaceC41635f<? super T> interfaceC41635f, Continuation<? super Unit> continuation) {
        C415951 c415951;
        InterfaceC41635f interfaceC41635f2;
        Iterator<T> it;
        if (continuation instanceof C415951) {
            c415951 = (C415951) continuation;
            int i11 = c415951.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c415951.label = i11 - Integer.MIN_VALUE;
            } else {
                c415951 = new C415951(continuation);
            }
        } else {
            c415951 = new C415951(continuation);
        }
        Object obj = c415951.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c415951.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj);
            interfaceC41635f2 = interfaceC41635f;
            it = this.f91558b.iterator();
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = (Iterator) c415951.L$1;
            InterfaceC41635f interfaceC41635f3 = (InterfaceC41635f) c415951.L$0;
            ResultKt.throwOnFailure(obj);
            interfaceC41635f2 = interfaceC41635f3;
        }
        while (it.hasNext()) {
            T next = it.next();
            c415951.L$0 = interfaceC41635f2;
            c415951.L$1 = it;
            c415951.label = 1;
            if (interfaceC41635f2.emit(next, c415951) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
