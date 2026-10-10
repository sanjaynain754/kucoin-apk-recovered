package kotlinx.coroutines.flow.internal;

import kotlinx.coroutines.flow.InterfaceC41635f;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.SuspendFunction;
import p852kotlin.jvm.functions.Function3;
import p852kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: compiled from: SafeCollector.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90085k = 3, m90086mv = {2, 1, 0}, m90088xi = 48)
public /* synthetic */ class SafeCollectorKt$emitFun$1 extends FunctionReferenceImpl implements Function3<InterfaceC41635f<? super Object>, Object, Continuation<? super Unit>, Object>, SuspendFunction {
    public static final SafeCollectorKt$emitFun$1 INSTANCE = new SafeCollectorKt$emitFun$1();

    @Override // p852kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Object invoke(InterfaceC41635f<? super Object> interfaceC41635f, Object obj, Continuation<? super Unit> continuation) {
        return invoke2((InterfaceC41635f<Object>) interfaceC41635f, obj, continuation);
    }

    public SafeCollectorKt$emitFun$1() {
        super(3, InterfaceC41635f.class, "emit", "emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(InterfaceC41635f<Object> interfaceC41635f, Object obj, Continuation<? super Unit> continuation) {
        return interfaceC41635f.emit(obj, continuation);
    }
}
