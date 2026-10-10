package com.sumsub.sns.internal.features.presentation.prooface;

import com.sumsub.sns.internal.features.presentation.prooface.session.C32201c0;
import com.sumsub.sns.internal.features.presentation.prooface.session.C32240s;
import com.sumsub.sns.internal.features.presentation.prooface.session.C32242t;
import com.sumsub.sns.internal.features.presentation.prooface.session.InterfaceC32203d;
import com.sumsub.sns.internal.features.presentation.prooface.session.InterfaceC32251x0;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.prooface.S1 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32037S1 extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f65149a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C32072c2 f65150b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32037S1(C32072c2 c32072c2, Continuation continuation) {
        super(2, continuation);
        this.f65150b = c32072c2;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C32037S1 c32037s1 = new C32037S1(this.f65150b, continuation);
        c32037s1.f65149a = obj;
        return c32037s1;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        C32037S1 c32037s1 = new C32037S1(this.f65150b, (Continuation) obj2);
        c32037s1.f65149a = (InterfaceC32251x0) obj;
        return c32037s1.invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        boolean z11;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        InterfaceC32251x0 interfaceC32251x0 = (InterfaceC32251x0) this.f65149a;
        if (!Intrinsics.areEqual(interfaceC32251x0, C32201c0.f65577a) && !(interfaceC32251x0 instanceof InterfaceC32203d)) {
            if (!(interfaceC32251x0 instanceof C32240s) && !(interfaceC32251x0 instanceof C32242t)) {
                throw new NoWhenBranchMatchedException();
            }
            z11 = false;
        } else {
            z11 = true;
        }
        this.f65150b.showProgress(z11);
        return Unit.INSTANCE;
    }
}
