package com.sumsub.sns.internal.core.common;

import kotlinx.coroutines.flow.InterfaceC41634e;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.common.O */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28410O extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public int f57915a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Function2 f57916b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ InterfaceC41634e f57917c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28410O(Continuation continuation, Function2 function2, InterfaceC41634e interfaceC41634e) {
        super(2, continuation);
        this.f57916b = function2;
        this.f57917c = interfaceC41634e;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C28410O(continuation, this.f57916b, this.f57917c);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C28410O((Continuation) obj2, this.f57916b, this.f57917c).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x002a, code lost:
    
        if (kotlinx.coroutines.flow.C41636g.m90923k(r5, r4) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003a, code lost:
    
        if (r1.collect(r3, r4) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003c, code lost:
    
        return r0;
     */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f57915a;
        if (i11 != 0) {
            if (i11 != 1 && i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        } else {
            ResultKt.throwOnFailure(obj);
            Function2 function2 = this.f57916b;
            if (function2 == null) {
                InterfaceC41634e interfaceC41634e = this.f57917c;
                this.f57915a = 1;
            } else {
                InterfaceC41634e interfaceC41634e2 = this.f57917c;
                C28419T c28419t = new C28419T(function2);
                this.f57915a = 2;
            }
        }
        return Unit.INSTANCE;
    }
}
