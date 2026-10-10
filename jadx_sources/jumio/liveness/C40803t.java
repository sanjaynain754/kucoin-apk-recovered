package jumio.liveness;

import com.jumio.commons.log.Log;
import kotlinx.coroutines.DelayKt;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: jumio.liveness.t */
/* JADX INFO: loaded from: classes61.dex */
public final class C40803t extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public int f90649a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C40809z f90650b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C40803t(C40809z c40809z, Continuation continuation) {
        super(2, continuation);
        this.f90650b = c40809z;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C40803t(this.f90650b, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C40803t(this.f90650b, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f90649a;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            this.f90649a = 1;
            if (DelayKt.m90350b(500L, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        this.f90650b.f90662y = true;
        Log.m14474i("LivenessExtractionClient", "Initial delay passed, starting to capture");
        return Unit.INSTANCE;
    }
}
