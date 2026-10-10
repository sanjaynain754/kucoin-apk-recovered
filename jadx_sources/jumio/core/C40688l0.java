package jumio.core;

import kotlinx.coroutines.TimeoutKt;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: jumio.core.l0 */
/* JADX INFO: loaded from: classes61.dex */
public final class C40688l0 extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public int f90315a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C40559L2 f90316b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C40688l0(C40559L2 c40559l2, Continuation continuation) {
        super(2, continuation);
        this.f90316b = c40559l2;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C40688l0(this.f90316b, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C40688l0(this.f90316b, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f90315a;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            C40559L2 c40559l2 = this.f90316b;
            this.f90315a = 1;
            if (TimeoutKt.m90469d(1000L, new C40569N2(c40559l2, null), this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
