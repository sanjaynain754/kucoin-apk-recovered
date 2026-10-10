package com.sumsub.sns.internal.features.presentation.prooface;

import androidx.lifecycle.ViewModelKt;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.C41782z0;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.prooface.J0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32010J0 extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C32072c2 f65071a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32010J0(C32072c2 c32072c2, Continuation continuation) {
        super(2, continuation);
        this.f65071a = c32072c2;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C32010J0(this.f65071a, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C32010J0(this.f65071a, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        C32072c2 c32072c2 = this.f65071a;
        c32072c2.showProgress(true);
        C41696j.m91104d(ViewModelKt.getViewModelScope(c32072c2), C41782z0.m91392b(), null, new C32007I0(c32072c2, null, c32072c2), 2, null);
        return Unit.INSTANCE;
    }
}
