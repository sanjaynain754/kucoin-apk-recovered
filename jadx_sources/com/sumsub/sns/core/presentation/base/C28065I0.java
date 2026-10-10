package com.sumsub.sns.core.presentation.base;

import com.sumsub.sns.internal.features.data.model.common.C29124h;
import com.sumsub.sns.internal.features.data.repository.dynamic.C29967J;
import com.sumsub.sns.internal.features.data.repository.dynamic.C29983l;
import com.sumsub.sns.internal.features.data.repository.dynamic.InterfaceC29984m;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.InterfaceC41729r0;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.sumsub.sns.core.presentation.base.I0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28065I0 extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public AbstractC28073M0 f57238a;

    /* JADX INFO: renamed from: b */
    public int f57239b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f57240c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ AbstractC28073M0 f57241d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28065I0(AbstractC28073M0 abstractC28073M0, Continuation continuation) {
        super(2, continuation);
        this.f57241d = abstractC28073M0;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C28065I0 c28065i0 = new C28065I0(this.f57241d, continuation);
        c28065i0.f57240c = obj;
        return c28065i0;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        C28065I0 c28065i0 = new C28065I0(this.f57241d, (Continuation) obj2);
        c28065i0.f57240c = (InterfaceC41709m0) obj;
        return c28065i0.invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0090  */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        InterfaceC41709m0 interfaceC41709m0;
        InterfaceC41729r0 interfaceC41729r0;
        AbstractC28073M0 abstractC28073M0;
        AbstractC28073M0 abstractC28073M1;
        Object objMo91198h;
        AbstractC28073M0 abstractC28073M2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f57239b;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 == 3) {
                        abstractC28073M2 = (AbstractC28073M0) this.f57240c;
                        ResultKt.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    abstractC28073M0 = this.f57238a;
                    interfaceC41729r0 = (InterfaceC41729r0) this.f57240c;
                    ResultKt.throwOnFailure(obj);
                    abstractC28073M0._strings = (C29983l) obj;
                    abstractC28073M1 = this.f57241d;
                    this.f57240c = abstractC28073M1;
                    this.f57238a = null;
                    this.f57239b = 3;
                    objMo91198h = interfaceC41729r0.mo91198h(this);
                    if (objMo91198h != coroutine_suspended) {
                        abstractC28073M2 = abstractC28073M1;
                        obj = objMo91198h;
                    }
                    return coroutine_suspended;
                }
            } else {
                interfaceC41709m0 = (InterfaceC41709m0) this.f57240c;
                ResultKt.throwOnFailure(obj);
            }
            abstractC28073M2.config = (C29124h) obj;
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj);
        interfaceC41709m0 = (InterfaceC41709m0) this.f57240c;
        InterfaceC29984m interfaceC29984m = this.f57241d.dataRepository;
        this.f57240c = interfaceC41709m0;
        this.f57239b = 1;
        if (((C29967J) interfaceC29984m).m70041a(this) != coroutine_suspended) {
        }
        return coroutine_suspended;
        InterfaceC41709m0 interfaceC41709m1 = interfaceC41709m0;
        InterfaceC41729r0 interfaceC41729r0M91102b = C41696j.m91102b(interfaceC41709m1, null, null, new C28063H0(this.f57241d, null), 3, null);
        InterfaceC41729r0 interfaceC41729r0M91102b2 = C41696j.m91102b(interfaceC41709m1, null, null, new C28061G0(this.f57241d, null), 3, null);
        AbstractC28073M0 abstractC28073M3 = this.f57241d;
        this.f57240c = interfaceC41729r0M91102b2;
        this.f57238a = abstractC28073M3;
        this.f57239b = 2;
        obj = interfaceC41729r0M91102b.mo91198h(this);
        if (obj != coroutine_suspended) {
            interfaceC41729r0 = interfaceC41729r0M91102b2;
            abstractC28073M0 = abstractC28073M3;
            abstractC28073M0._strings = (C29983l) obj;
            abstractC28073M1 = this.f57241d;
            this.f57240c = abstractC28073M1;
            this.f57238a = null;
            this.f57239b = 3;
            objMo91198h = interfaceC41729r0.mo91198h(this);
            if (objMo91198h != coroutine_suspended) {
                abstractC28073M2 = abstractC28073M1;
                obj = objMo91198h;
                abstractC28073M2.config = (C29124h) obj;
                return Unit.INSTANCE;
            }
        }
        return coroutine_suspended;
    }
}
