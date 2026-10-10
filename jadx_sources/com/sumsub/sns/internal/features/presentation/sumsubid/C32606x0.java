package com.sumsub.sns.internal.features.presentation.sumsubid;

import com.sumsub.sns.core.presentation.base.C28075O;
import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.InterfaceC41634e;
import kotlinx.coroutines.flow.InterfaceC41635f;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function3;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.sumsubid.x0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32606x0 extends SuspendLambda implements Function3 {

    /* JADX INFO: renamed from: a */
    public int f66504a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ InterfaceC41635f f66505b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f66506c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C32487O0 f66507d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C28075O f66508e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32606x0(Continuation continuation, C32487O0 c32487o0, C28075O c28075o) {
        super(3, continuation);
        this.f66507d = c32487o0;
        this.f66508e = c28075o;
    }

    @Override // p852kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        C32606x0 c32606x0 = new C32606x0((Continuation) obj3, this.f66507d, this.f66508e);
        c32606x0.f66505b = (InterfaceC41635f) obj;
        c32606x0.f66506c = obj2;
        return c32606x0.invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        InterfaceC41634e interfaceC41634eM90889M;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f66504a;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            InterfaceC41635f interfaceC41635f = this.f66505b;
            C32557s c32557s = (C32557s) this.f66506c;
            String str = c32557s.f66411a;
            if (str == null || (interfaceC41634eM90889M = this.f66507d.f66266e.m71294b(str)) == null) {
                interfaceC41634eM90889M = C41636g.m90889M(null);
            }
            C32459A0 c32459a0 = new C32459A0(interfaceC41634eM90889M, this.f66508e, c32557s, this.f66507d);
            this.f66504a = 1;
            if (C41636g.m90878B(interfaceC41635f, c32459a0, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
