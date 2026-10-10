package jumio.core;

import com.jumio.core.Controller;
import com.jumio.core.enums.ErrorCase;
import com.jumio.core.environment.Environment;
import com.jumio.core.error.Error;
import com.jumio.sdk.credentials.JumioCredential;
import java.io.File;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.p407io.CloseableKt;

/* JADX INFO: renamed from: jumio.core.s0 */
/* JADX INFO: loaded from: classes61.dex */
public final class C40723s0 extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Controller f90393a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ boolean f90394b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C40723s0(Controller controller, boolean z11, Continuation continuation) {
        super(2, continuation);
        this.f90393a = controller;
        this.f90394b = z11;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C40723s0(this.f90393a, this.f90394b, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C40723s0(this.f90393a, this.f90394b, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        JumioCredential f13612m = this.f90393a.getF13612m();
        if (f13612m != null) {
            f13612m.persist$jumio_core_release(this.f90394b);
        }
        if (this.f90394b) {
            this.f90393a.getF13606g().pause();
        }
        C40574O2 c40574o2 = new C40574O2(this.f90393a.getF13600a().getF14185c(), new File(Environment.INSTANCE.getDataDirectory(this.f90393a.getF13601b()), "tmp_store"), new C40559L2(this.f90393a.getF13601b()));
        Controller controller = this.f90393a;
        boolean z11 = this.f90394b;
        try {
            if (!c40574o2.m89208a()) {
                Controller.onError$default(controller, new Error(ErrorCase.PROCESS_CANT_BE_COMPLETED, 0, 1, 2, null), null, 2, null);
                Unit unit = Unit.INSTANCE;
                CloseableKt.closeFinally(c40574o2, null);
                return unit;
            }
            c40574o2.m89207a(Boxing.boxInt(controller.getF13601b().getF13624b()));
            c40574o2.m89207a(Boxing.boxBoolean(controller.getF13613n()));
            c40574o2.m89207a(controller.f13610k);
            controller.getF13604e().persist(c40574o2, z11);
            controller.getF13603d().persist(c40574o2);
            Unit unit2 = Unit.INSTANCE;
            CloseableKt.closeFinally(c40574o2, null);
            return unit2;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                CloseableKt.closeFinally(c40574o2, th2);
                throw th3;
            }
        }
    }
}
