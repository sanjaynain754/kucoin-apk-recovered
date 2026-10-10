package com.sumsub.sns.core.presentation.base;

import com.sumsub.sns.internal.core.common.C28390E;
import kotlinx.coroutines.flow.InterfaceC41635f;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function3;

/* JADX INFO: renamed from: com.sumsub.sns.core.presentation.base.X */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28083X extends SuspendLambda implements Function3 {

    /* JADX INFO: renamed from: a */
    public int f57276a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ InterfaceC41635f f57277b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Throwable f57278c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ AbstractC28142p0 f57279d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28083X(AbstractC28142p0 abstractC28142p0, Continuation continuation) {
        super(3, continuation);
        this.f57279d = abstractC28142p0;
    }

    @Override // p852kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        C28083X c28083x = new C28083X(this.f57279d, (Continuation) obj3);
        c28083x.f57277b = (InterfaceC41635f) obj;
        c28083x.f57278c = (Throwable) obj2;
        return c28083x.invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f57276a;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            InterfaceC41635f interfaceC41635f = this.f57277b;
            Throwable th2 = this.f57278c;
            if (th2 instanceof C28390E) {
                AbstractC28052C.throwError$default(this.f57279d, new IllegalStateException("Data flow timed out"), this.f57279d.getDocumentType(), null, 4, null);
                this.f57277b = null;
                this.f57276a = 1;
                if (interfaceC41635f.emit(null, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                throw th2;
            }
        }
        return Unit.INSTANCE;
    }
}
