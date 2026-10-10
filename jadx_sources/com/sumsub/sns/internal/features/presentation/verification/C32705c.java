package com.sumsub.sns.internal.features.presentation.verification;

import com.sumsub.log.logger.Logger;
import com.sumsub.sns.internal.log.C33272c;
import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.InterfaceC41634e;
import kotlinx.coroutines.flow.InterfaceC41635f;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function3;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.verification.c */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32705c extends SuspendLambda implements Function3 {

    /* JADX INFO: renamed from: a */
    public int f66888a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ InterfaceC41635f f66889b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f66890c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ String f66891d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C32707d f66892e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32705c(Continuation continuation, String str, C32707d c32707d) {
        super(3, continuation);
        this.f66891d = str;
        this.f66892e = c32707d;
    }

    @Override // p852kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        C32705c c32705c = new C32705c((Continuation) obj3, this.f66891d, this.f66892e);
        c32705c.f66889b = (InterfaceC41635f) obj;
        c32705c.f66890c = obj2;
        return c32705c.invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        InterfaceC41634e interfaceC41634eM90887K;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f66888a;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            InterfaceC41635f interfaceC41635f = this.f66889b;
            Long l11 = (Long) this.f66890c;
            if (l11 == null) {
                interfaceC41634eM90887K = C41636g.m90889M(null);
            } else {
                Logger.DefaultImpls.d$default(C33272c.f67812a, "CountdownKeeper", "starting countdown for id: " + this.f66891d + ", endTime: " + l11, null, 4, null);
                C32707d c32707d = this.f66892e;
                long jLongValue = l11.longValue();
                c32707d.getClass();
                interfaceC41634eM90887K = C41636g.m90887K(new C32703b(jLongValue, null));
            }
            this.f66888a = 1;
            if (C41636g.m90878B(interfaceC41635f, interfaceC41634eM90887K, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
