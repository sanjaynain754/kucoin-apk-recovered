package com.sumsub.sns.core.presentation.base;

import android.os.Bundle;
import com.sumsub.log.logger.Logger;
import com.sumsub.sns.internal.log.AbstractC33294e;
import com.sumsub.sns.internal.log.C33272c;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.sumsub.sns.core.presentation.base.D */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28054D extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f57213a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AbstractC28058F f57214b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Bundle f57215c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28054D(AbstractC28058F abstractC28058F, Bundle bundle, Continuation continuation) {
        super(2, continuation);
        this.f57214b = abstractC28058F;
        this.f57215c = bundle;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C28054D c28054d = new C28054D(this.f57214b, this.f57215c, continuation);
        c28054d.f57213a = obj;
        return c28054d;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C28054D) create((InterfaceC28147s) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        InterfaceC28147s interfaceC28147s = (InterfaceC28147s) this.f57213a;
        Logger.DefaultImpls.i$default(C33272c.f67812a, AbstractC33294e.m71624a(this.f57214b), "Lifecycle New state: " + interfaceC28147s, null, 4, null);
        this.f57214b.handleState(interfaceC28147s, this.f57215c);
        return Unit.INSTANCE;
    }
}
