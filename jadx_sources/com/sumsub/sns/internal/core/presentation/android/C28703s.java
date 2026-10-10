package com.sumsub.sns.internal.core.presentation.android;

import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.InterfaceC41634e;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.presentation.android.s */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28703s extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public int f58354a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C28705t f58355b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28703s(C28705t c28705t, Continuation continuation) {
        super(2, continuation);
        this.f58355b = c28705t;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C28703s(this.f58355b, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C28703s(this.f58355b, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f58354a;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        InterfaceC41634e interfaceC41634eM90881E = C41636g.m90881E(this.f58355b.f58363f);
        this.f58354a = 1;
        Object objM90882F = C41636g.m90882F(interfaceC41634eM90881E, this);
        if (objM90882F == coroutine_suspended) {
            return coroutine_suspended;
        }
        return objM90882F;
    }
}
