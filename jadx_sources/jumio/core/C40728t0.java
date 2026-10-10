package jumio.core;

import com.jumio.core.Controller;
import com.jumio.core.models.SettingsModel;
import kotlinx.coroutines.DelayKt;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: jumio.core.t0 */
/* JADX INFO: loaded from: classes61.dex */
public final class C40728t0 extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public int f90414a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Controller f90415b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C40728t0(Controller controller, Continuation continuation) {
        super(2, continuation);
        this.f90415b = controller;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C40728t0(this.f90415b, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C40728t0(this.f90415b, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f90414a;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            long startMaxLoadingTime = ((SettingsModel) this.f90415b.getF13603d().get(SettingsModel.class)).getStartMaxLoadingTime();
            this.f90414a = 1;
            if (DelayKt.m90350b(startMaxLoadingTime, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        this.f90415b.m14488a();
        return Unit.INSTANCE;
    }
}
