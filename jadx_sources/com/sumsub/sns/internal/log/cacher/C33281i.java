package com.sumsub.sns.internal.log.cacher;

import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: com.sumsub.sns.internal.log.cacher.i */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C33281i extends SuspendLambda implements Function1 {

    /* JADX INFO: renamed from: a */
    public int f67838a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C33284l f67839b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f67840c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33281i(C33284l c33284l, Object obj, Continuation continuation) {
        super(1, continuation);
        this.f67839b = c33284l;
        this.f67840c = obj;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new C33281i(this.f67839b, this.f67840c, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new C33281i(this.f67839b, this.f67840c, (Continuation) obj).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f67838a;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        InterfaceC33273a interfaceC33273a = this.f67839b.f67849b;
        Object obj2 = this.f67840c;
        this.f67838a = 1;
        Object objSend = interfaceC33273a.send(obj2, this);
        if (objSend == coroutine_suspended) {
            return coroutine_suspended;
        }
        return objSend;
    }
}
