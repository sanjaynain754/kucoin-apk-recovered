package com.sumsub.sns.internal.features.presentation.verification2.phone;

import com.sumsub.sns.internal.features.presentation.verification2.host.C32814J;
import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.InterfaceC41634e;
import kotlinx.coroutines.flow.InterfaceC41635f;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function3;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.verification2.phone.A */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32842A extends SuspendLambda implements Function3 {

    /* JADX INFO: renamed from: a */
    public int f67191a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ InterfaceC41635f f67192b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f67193c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C32847F f67194d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32842A(C32847F c32847f, Continuation continuation) {
        super(3, continuation);
        this.f67194d = c32847f;
    }

    @Override // p852kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        C32842A c32842a = new C32842A(this.f67194d, (Continuation) obj3);
        c32842a.f67192b = (InterfaceC41635f) obj;
        c32842a.f67193c = obj2;
        return c32842a.invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String str;
        InterfaceC41634e interfaceC41634eM90889M;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f67191a;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            InterfaceC41635f interfaceC41635f = this.f67192b;
            C32849a c32849a = (C32849a) this.f67193c;
            if (c32849a != null) {
                str = c32849a.f67214a;
            } else {
                str = null;
            }
            if (str != null) {
                interfaceC41634eM90889M = ((C32814J) this.f67194d.f67205a).f67151g.m71294b(str);
            } else {
                interfaceC41634eM90889M = C41636g.m90889M(null);
            }
            this.f67191a = 1;
            if (C41636g.m90878B(interfaceC41635f, interfaceC41634eM90889M, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
