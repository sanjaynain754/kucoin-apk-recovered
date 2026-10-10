package androidx.concurrent.futures;

import kotlinx.coroutines.InterfaceC41729r0;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.SuspendFunction;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: compiled from: SuspendToFutureAdapter.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90085k = 3, m90086mv = {2, 0, 0}, m90088xi = 48)
public /* synthetic */ class SuspendToFutureAdapter$launchFuture$1$1<T> extends FunctionReferenceImpl implements Function1<Continuation<? super T>, Object>, SuspendFunction {
    public SuspendToFutureAdapter$launchFuture$1$1(Object obj) {
        super(1, obj, InterfaceC41729r0.class, "await", "await(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }

    @Override // p852kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super T> continuation) {
        return ((InterfaceC41729r0) this.receiver).mo91198h(continuation);
    }
}
