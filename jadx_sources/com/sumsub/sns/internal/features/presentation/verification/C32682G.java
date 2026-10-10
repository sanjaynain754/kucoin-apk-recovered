package com.sumsub.sns.internal.features.presentation.verification;

import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.InterfaceC41634e;
import kotlinx.coroutines.flow.InterfaceC41635f;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function3;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.verification.G */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32682G extends SuspendLambda implements Function3 {

    /* JADX INFO: renamed from: a */
    public int f66736a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ InterfaceC41635f f66737b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f66738c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C32720j0 f66739d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ CharSequence f66740e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ CharSequence f66741f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ CharSequence f66742g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ String f66743h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ CharSequence f66744i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ boolean f66745j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32682G(Continuation continuation, C32720j0 c32720j0, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, String str, CharSequence charSequence4, boolean z11) {
        super(3, continuation);
        this.f66739d = c32720j0;
        this.f66740e = charSequence;
        this.f66741f = charSequence2;
        this.f66742g = charSequence3;
        this.f66743h = str;
        this.f66744i = charSequence4;
        this.f66745j = z11;
    }

    @Override // p852kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        C32682G c32682g = new C32682G((Continuation) obj3, this.f66739d, this.f66740e, this.f66741f, this.f66742g, this.f66743h, this.f66744i, this.f66745j);
        c32682g.f66737b = (InterfaceC41635f) obj;
        c32682g.f66738c = obj2;
        return c32682g.invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        InterfaceC41634e interfaceC41634eM90889M;
        boolean z11;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f66736a;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            InterfaceC41635f interfaceC41635f = this.f66737b;
            String str = (String) this.f66738c;
            if (str == null || (interfaceC41634eM90889M = this.f66739d.f66937e.m71294b(str)) == null) {
                interfaceC41634eM90889M = C41636g.m90889M(null);
            }
            InterfaceC41634e interfaceC41634e = interfaceC41634eM90889M;
            CharSequence charSequence = this.f66740e;
            if (charSequence != null) {
                z11 = true;
            } else {
                z11 = false;
            }
            C32686K c32686k = new C32686K(interfaceC41634e, this.f66739d, str, z11, this.f66741f, this.f66742g, this.f66743h, this.f66744i, charSequence, this.f66745j);
            this.f66736a = 1;
            if (C41636g.m90878B(interfaceC41635f, c32686k, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
