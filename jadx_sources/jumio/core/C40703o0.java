package jumio.core;

import com.jumio.core.Controller;
import com.jumio.core.models.CredentialsModel;
import com.jumio.core.models.TermsOfUseModel;
import com.jumio.sdk.interfaces.JumioControllerInterface;
import java.util.List;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: jumio.core.o0 */
/* JADX INFO: loaded from: classes61.dex */
public final class C40703o0 extends SuspendLambda implements Function1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Controller f90340a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ List f90341b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C40703o0(Controller controller, List list, Continuation continuation) {
        super(1, continuation);
        this.f90340a = controller;
        this.f90341b = list;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new C40703o0(this.f90340a, this.f90341b, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new C40703o0(this.f90340a, this.f90341b, (Continuation) obj).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        JumioControllerInterface jumioControllerInterface = this.f90340a.f13608i;
        if (jumioControllerInterface != null) {
            jumioControllerInterface.onInitialized(((CredentialsModel) this.f90340a.getF13603d().get(CredentialsModel.class)).m14555a(), this.f90341b, ((TermsOfUseModel) this.f90340a.getF13603d().get(TermsOfUseModel.class)).f14365a);
        }
        return Unit.INSTANCE;
    }
}
