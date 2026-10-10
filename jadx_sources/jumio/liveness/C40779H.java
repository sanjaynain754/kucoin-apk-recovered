package jumio.liveness;

import kotlinx.coroutines.AbstractC41697j0;
import kotlinx.coroutines.C41686h;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: jumio.liveness.H */
/* JADX INFO: loaded from: classes61.dex */
public final class C40779H extends SuspendLambda implements Function1 {

    /* JADX INFO: renamed from: a */
    public int f90588a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C40780I f90589b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C40779H(C40780I c40780i, Continuation continuation) {
        super(1, continuation);
        this.f90589b = c40780i;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new C40779H(this.f90589b, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new C40779H(this.f90589b, (Continuation) obj).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f90588a;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            AbstractC41697j0 mainDispatcher = this.f90589b.getF14541a().getF13607h().getF14549a();
            C40778G c40778g = new C40778G(this.f90589b, null);
            this.f90588a = 1;
            if (C41686h.m91049g(mainDispatcher, c40778g, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
