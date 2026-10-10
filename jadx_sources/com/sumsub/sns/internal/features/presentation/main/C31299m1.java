package com.sumsub.sns.internal.features.presentation.main;

import androidx.lifecycle.ViewModelKt;
import com.sumsub.sns.core.presentation.base.AbstractC28073M0;
import com.sumsub.sns.internal.log.C33272c;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.InterfaceC41775x1;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.reflect.KProperty;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.main.m1 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31299m1 extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ boolean f63434a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C31243a2 f63435b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31299m1(C31243a2 c31243a2, Continuation continuation) {
        super(2, continuation);
        this.f63435b = c31243a2;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C31299m1 c31299m1 = new C31299m1(this.f63435b, continuation);
        c31299m1.f63434a = ((Boolean) obj).booleanValue();
        return c31299m1;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.getClass();
        C31299m1 c31299m1 = new C31299m1(this.f63435b, (Continuation) obj2);
        c31299m1.f63434a = bool.booleanValue();
        return c31299m1.invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        boolean z11 = this.f63434a;
        C33272c.f67816e.f67810a.mo68955d("SNSAppViewModel2", "Show progress = " + z11, null);
        C31243a2 c31243a2 = this.f63435b;
        C31295l1 c31295l1 = new C31295l1(z11, null);
        KProperty[] kPropertyArr = C31243a2.f63220x;
        c31243a2.updateState(true, c31295l1);
        this.f63435b.f63228k.f63400a.setValue(Boolean.valueOf(z11));
        if (z11) {
            C31243a2 c31243a3 = this.f63435b;
            InterfaceC41775x1 interfaceC41775x1 = c31243a3.f63233p;
            if (interfaceC41775x1 != null) {
                InterfaceC41775x1.a.m91377a(interfaceC41775x1, null, 1, null);
            }
            c31243a3.f63233p = null;
            AbstractC28073M0.updateState$default(c31243a3, false, new C31329o1(null), 1, null);
            c31243a3.f63233p = C41696j.m91104d(ViewModelKt.getViewModelScope(c31243a3), null, null, new C31224U1(c31243a3, null), 3, null);
        } else {
            C31243a2 c31243a4 = this.f63435b;
            InterfaceC41775x1 interfaceC41775x2 = c31243a4.f63233p;
            if (interfaceC41775x2 != null) {
                InterfaceC41775x1.a.m91377a(interfaceC41775x2, null, 1, null);
            }
            c31243a4.f63233p = null;
            AbstractC28073M0.updateState$default(c31243a4, false, new C31329o1(null), 1, null);
        }
        return Unit.INSTANCE;
    }
}
