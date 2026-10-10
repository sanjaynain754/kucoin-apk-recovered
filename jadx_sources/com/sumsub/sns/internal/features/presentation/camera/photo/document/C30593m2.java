package com.sumsub.sns.internal.features.presentation.camera.photo.document;

import kotlinx.coroutines.flow.InterfaceC41669n;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.camera.photo.document.m2 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30593m2 extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public InterfaceC41669n f61791a;

    /* JADX INFO: renamed from: b */
    public C30538d1 f61792b;

    /* JADX INFO: renamed from: c */
    public Boolean f61793c;

    /* JADX INFO: renamed from: d */
    public int f61794d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C30440B2 f61795e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30593m2(C30440B2 c30440b2, Continuation continuation) {
        super(2, continuation);
        this.f61795e = c30440b2;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C30593m2(this.f61795e, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C30593m2(this.f61795e, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        C30538d1 c30538d1;
        InterfaceC41669n interfaceC41669n;
        Boolean bool;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f61794d;
        if (i11 != 0) {
            if (i11 == 1) {
                Boolean bool2 = this.f61793c;
                C30538d1 c30538d2 = this.f61792b;
                InterfaceC41669n interfaceC41669n2 = this.f61791a;
                ResultKt.throwOnFailure(obj);
                interfaceC41669n = interfaceC41669n2;
                bool = bool2;
                c30538d1 = c30538d2;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            C30440B2 c30440b2 = this.f61795e;
            c30440b2.f61282C = true;
            InterfaceC41669n interfaceC41669n3 = c30440b2.f61287H;
            C30538d1 c30538d1M70317i = c30440b2.m70317i();
            Boolean boolBoxBoolean = Boxing.boxBoolean(true);
            C30440B2 c30440b3 = this.f61795e;
            C30536d c30536d = new C30536d(false, CheckDetectionResult$SizeCheckResult.SMALL, false);
            this.f61791a = interfaceC41669n3;
            this.f61792b = c30538d1M70317i;
            this.f61793c = boolBoxBoolean;
            this.f61794d = 1;
            Object objM70292a = c30440b3.m70292a(c30536d, false, (ContinuationImpl) this);
            if (objM70292a == coroutine_suspended) {
                return coroutine_suspended;
            }
            c30538d1 = c30538d1M70317i;
            interfaceC41669n = interfaceC41669n3;
            obj = objM70292a;
            bool = boolBoxBoolean;
        }
        interfaceC41669n.setValue(C30538d1.m70407a(c30538d1, null, bool, (C30516Z0) obj, null, null, null, 57));
        return Unit.INSTANCE;
    }
}
