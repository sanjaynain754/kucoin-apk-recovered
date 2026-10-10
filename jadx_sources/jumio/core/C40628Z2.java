package jumio.core;

import com.jumio.core.model.Subscriber;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: jumio.core.Z2 */
/* JADX INFO: loaded from: classes61.dex */
public final class C40628Z2 extends SuspendLambda implements Function1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Subscriber f90198a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f90199b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C40628Z2(Subscriber subscriber, Object obj, Continuation continuation) {
        super(1, continuation);
        this.f90198a = subscriber;
        this.f90199b = obj;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new C40628Z2(this.f90198a, this.f90199b, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new C40628Z2(this.f90198a, this.f90199b, (Continuation) obj).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        this.f90198a.onResult(this.f90199b);
        return Unit.INSTANCE;
    }
}
