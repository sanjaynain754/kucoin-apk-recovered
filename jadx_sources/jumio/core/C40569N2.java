package jumio.core;

import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.InterfaceC41634e;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: jumio.core.N2 */
/* JADX INFO: loaded from: classes61.dex */
public final class C40569N2 extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public int f90059a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C40559L2 f90060b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C40569N2(C40559L2 c40559l2, Continuation continuation) {
        super(2, continuation);
        this.f90060b = c40559l2;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C40569N2(this.f90060b, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C40569N2(this.f90060b, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f90059a;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            if (this.f90060b.m89201a()) {
                return Unit.INSTANCE;
            }
            InterfaceC41634e interfaceC41634e = this.f90060b.f90040b;
            if (interfaceC41634e != null) {
                C40564M2 c40564m2 = new C40564M2(null);
                this.f90059a = 1;
                obj = C41636g.m90883G(interfaceC41634e, c40564m2, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }
}
