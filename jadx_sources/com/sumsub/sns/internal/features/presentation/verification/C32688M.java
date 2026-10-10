package com.sumsub.sns.internal.features.presentation.verification;

import com.sumsub.sns.internal.features.domain.C30068B;
import com.sumsub.sns.internal.features.domain.C30270n;
import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.InterfaceC41634e;
import kotlinx.coroutines.flow.InterfaceC41635f;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function3;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.verification.M */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32688M extends SuspendLambda implements Function3 {

    /* JADX INFO: renamed from: a */
    public int f66786a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ InterfaceC41635f f66787b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f66788c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C32720j0 f66789d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ CharSequence f66790e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ CharSequence f66791f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ C30068B f66792g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ CharSequence f66793h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ C30270n f66794i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ CharSequence f66795j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ boolean f66796k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32688M(Continuation continuation, C32720j0 c32720j0, CharSequence charSequence, CharSequence charSequence2, C30068B c30068b, CharSequence charSequence3, C30270n c30270n, CharSequence charSequence4, boolean z11) {
        super(3, continuation);
        this.f66789d = c32720j0;
        this.f66790e = charSequence;
        this.f66791f = charSequence2;
        this.f66792g = c30068b;
        this.f66793h = charSequence3;
        this.f66794i = c30270n;
        this.f66795j = charSequence4;
        this.f66796k = z11;
    }

    @Override // p852kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        C32688M c32688m = new C32688M((Continuation) obj3, this.f66789d, this.f66790e, this.f66791f, this.f66792g, this.f66793h, this.f66794i, this.f66795j, this.f66796k);
        c32688m.f66787b = (InterfaceC41635f) obj;
        c32688m.f66788c = obj2;
        return c32688m.invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        InterfaceC41634e interfaceC41634eM90889M;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f66786a;
        if (i11 == 0) {
            ResultKt.throwOnFailure(obj);
            InterfaceC41635f interfaceC41635f = this.f66787b;
            C32739u c32739u = (C32739u) this.f66788c;
            String str = c32739u != null ? c32739u.f66990a : null;
            boolean z11 = c32739u != null ? c32739u.f66991b : false;
            if (str == null || (interfaceC41634eM90889M = this.f66789d.f66937e.m71294b(str)) == null) {
                interfaceC41634eM90889M = C41636g.m90889M(null);
            }
            C32692Q c32692q = new C32692Q(interfaceC41634eM90889M, this.f66789d, c32739u, z11, this.f66790e, this.f66791f, this.f66792g, this.f66793h, this.f66794i, this.f66795j, this.f66796k);
            this.f66786a = 1;
            if (C41636g.m90878B(interfaceC41635f, c32692q, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
