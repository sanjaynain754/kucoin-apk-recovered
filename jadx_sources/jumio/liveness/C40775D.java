package jumio.liveness;

import kotlinx.coroutines.AbstractC41697j0;
import kotlinx.coroutines.C41686h;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: jumio.liveness.D */
/* JADX INFO: loaded from: classes61.dex */
public final class C40775D extends SuspendLambda implements Function1 {

    /* JADX INFO: renamed from: a */
    public int f90576a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C40780I f90577b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C40775D(C40780I c40780i, Continuation continuation) {
        super(1, continuation);
        this.f90577b = c40780i;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new C40775D(this.f90577b, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new C40775D(this.f90577b, (Continuation) obj).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f90576a;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            AbstractC41697j0 mainDispatcher = this.f90577b.getF14541a().getF13607h().getF14549a();
            C40774C c40774c = new C40774C(this.f90577b, null);
            this.f90576a = 1;
            if (C41686h.m91049g(mainDispatcher, c40774c, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
