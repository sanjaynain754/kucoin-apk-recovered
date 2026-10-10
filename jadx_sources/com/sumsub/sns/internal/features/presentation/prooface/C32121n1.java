package com.sumsub.sns.internal.features.presentation.prooface;

import com.sumsub.sns.internal.core.presentation.camera.C28758x;
import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.InterfaceC41635f;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function3;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.prooface.n1 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32121n1 extends SuspendLambda implements Function3 {

    /* JADX INFO: renamed from: a */
    public int f65393a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ InterfaceC41635f f65394b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f65395c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C32072c2 f65396d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32121n1(C32072c2 c32072c2, Continuation continuation) {
        super(3, continuation);
        this.f65396d = c32072c2;
    }

    @Override // p852kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        C32121n1 c32121n1 = new C32121n1(this.f65396d, (Continuation) obj3);
        c32121n1.f65394b = (InterfaceC41635f) obj;
        c32121n1.f65395c = obj2;
        return c32121n1.invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f65393a;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            InterfaceC41635f interfaceC41635f = this.f65394b;
            C32286y1 c32286y1 = new C32286y1(C41636g.m90897U(new C32275v1(this.f65396d.f65273p), new C32141s1(null)), (C28758x) this.f65395c);
            this.f65393a = 1;
            if (C41636g.m90878B(interfaceC41635f, c32286y1, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
