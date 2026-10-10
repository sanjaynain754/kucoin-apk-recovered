package com.sumsub.sns.core.presentation.base;

import com.sumsub.sns.internal.features.data.repository.common.C29957e;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.InterfaceC41678w;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.sumsub.sns.core.presentation.base.F0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28059F0 extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public int f57225a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f57226b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ AbstractC28073M0 f57227c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28059F0(AbstractC28073M0 abstractC28073M0, Continuation continuation) {
        super(2, continuation);
        this.f57227c = abstractC28073M0;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C28059F0 c28059f0 = new C28059F0(this.f57227c, continuation);
        c28059f0.f57226b = obj;
        return c28059f0;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        C28059F0 c28059f0 = new C28059F0(this.f57227c, (Continuation) obj2);
        c28059f0.f57226b = (InterfaceC41709m0) obj;
        return c28059f0.invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f57225a;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        InterfaceC41709m0 interfaceC41709m0 = (InterfaceC41709m0) this.f57226b;
        InterfaceC41678w interfaceC41678w = ((C29957e) this.f57227c.commonRepository).f60157c;
        C28057E0 c28057e0 = new C28057E0(interfaceC41709m0, null);
        this.f57225a = 1;
        Object objM90883G = C41636g.m90883G(interfaceC41678w, c28057e0, this);
        if (objM90883G == coroutine_suspended) {
            return coroutine_suspended;
        }
        return objM90883G;
    }
}
