package com.sumsub.sns.internal.core.common;

import kotlinx.coroutines.flow.InterfaceC41635f;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.common.D */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28388D extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public int f57877a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f57878b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ SuspendLambda f57879c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C28388D(Function1 function1, Continuation continuation) {
        super(2, continuation);
        this.f57879c = (SuspendLambda) function1;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [kotlin.coroutines.jvm.internal.SuspendLambda, kotlin.jvm.functions.Function1] */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C28388D c28388d = new C28388D(this.f57879c, continuation);
        c28388d.f57878b = obj;
        return c28388d;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [kotlin.coroutines.jvm.internal.SuspendLambda, kotlin.jvm.functions.Function1] */
    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        C28388D c28388d = new C28388D(this.f57879c, (Continuation) obj2);
        c28388d.f57878b = (InterfaceC41635f) obj;
        return c28388d.invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0040, code lost:
    
        if (r1.emit(r5, r4) == r0) goto L15;
     */
    /* JADX WARN: Type inference failed for: r5v2, types: [kotlin.coroutines.jvm.internal.SuspendLambda, kotlin.jvm.functions.Function1] */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        InterfaceC41635f interfaceC41635f;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f57877a;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                interfaceC41635f = (InterfaceC41635f) this.f57878b;
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj);
        interfaceC41635f = (InterfaceC41635f) this.f57878b;
        ?? r11 = this.f57879c;
        this.f57878b = interfaceC41635f;
        this.f57877a = 1;
        obj = r11.invoke(this);
        if (obj != coroutine_suspended) {
        }
        return coroutine_suspended;
        this.f57878b = null;
        this.f57877a = 2;
    }
}
