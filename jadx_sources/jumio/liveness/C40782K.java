package jumio.liveness;

import com.jumio.liveness.DaClient2;
import kotlinx.coroutines.DelayKt;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: jumio.liveness.K */
/* JADX INFO: loaded from: classes61.dex */
public final class C40782K extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public int f90596a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ DaClient2 f90597b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C40782K(DaClient2 daClient2, Continuation continuation) {
        super(2, continuation);
        this.f90597b = daClient2;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C40782K(this.f90597b, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C40782K(this.f90597b, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f90596a;
        if (i11 != 0 && i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        do {
            DaClient2 daClient2 = this.f90597b;
            if (daClient2 != null && daClient2.isBusy()) {
                this.f90596a = 1;
            } else {
                DaClient2 daClient3 = this.f90597b;
                if (daClient3 != null) {
                    daClient3.setEventHandler(null);
                    daClient3.close();
                }
                return Unit.INSTANCE;
            }
        } while (DelayKt.m90350b(50L, this) != coroutine_suspended);
        return coroutine_suspended;
    }
}
