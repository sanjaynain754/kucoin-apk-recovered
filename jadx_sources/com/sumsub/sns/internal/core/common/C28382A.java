package com.sumsub.sns.internal.core.common;

import com.sumsub.sns.core.presentation.base.AbstractC28073M0;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.flow.InterfaceC41635f;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.common.A */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28382A extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public int f57866a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f57867b;

    public C28382A(Continuation continuation) {
        super(2, continuation);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C28382A c28382a = new C28382A(continuation);
        c28382a.f57867b = obj;
        return c28382a;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        C28382A c28382a = new C28382A((Continuation) obj2);
        c28382a.f57867b = (InterfaceC41635f) obj;
        return c28382a.invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x005f, code lost:
    
        if (r1.emit(r8, r7) == r0) goto L21;
     */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        InterfaceC41635f interfaceC41635f;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f57866a;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 == 3) {
                        ResultKt.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    interfaceC41635f = (InterfaceC41635f) this.f57867b;
                    ResultKt.throwOnFailure(obj);
                    Boolean boolBoxBoolean = Boxing.boxBoolean(true);
                    this.f57867b = null;
                    this.f57866a = 3;
                }
            } else {
                interfaceC41635f = (InterfaceC41635f) this.f57867b;
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj);
        InterfaceC41635f interfaceC41635f2 = (InterfaceC41635f) this.f57867b;
        Boolean boolBoxBoolean2 = Boxing.boxBoolean(false);
        this.f57867b = interfaceC41635f2;
        this.f57866a = 1;
        if (interfaceC41635f2.emit(boolBoxBoolean2, this) != coroutine_suspended) {
            interfaceC41635f = interfaceC41635f2;
        }
        return coroutine_suspended;
        this.f57867b = interfaceC41635f;
        this.f57866a = 2;
        if (DelayKt.m90350b(AbstractC28073M0.DEFAULT_TIMEOUT, this) != coroutine_suspended) {
            Boolean boolBoxBoolean3 = Boxing.boxBoolean(true);
            this.f57867b = null;
            this.f57866a = 3;
        }
        return coroutine_suspended;
    }
}
