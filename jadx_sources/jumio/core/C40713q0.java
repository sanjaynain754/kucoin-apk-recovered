package jumio.core;

import com.jumio.core.Controller;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: jumio.core.q0 */
/* JADX INFO: loaded from: classes61.dex */
public final class C40713q0 extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public int f90361a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Controller f90362b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f90363c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C40713q0(Controller controller, Object obj, Continuation continuation) {
        super(2, continuation);
        this.f90362b = controller;
        this.f90363c = obj;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C40713q0(this.f90362b, this.f90363c, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C40713q0(this.f90362b, this.f90363c, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f90361a;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            Controller controller = this.f90362b;
            Object obj2 = this.f90363c;
            this.f90361a = 1;
            if (Controller.access$onSettingsCallResult(controller, obj2, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
